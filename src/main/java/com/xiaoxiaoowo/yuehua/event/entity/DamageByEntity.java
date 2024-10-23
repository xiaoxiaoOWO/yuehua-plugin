package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttack;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttackedObserver;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterWuLiAttacked;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.*;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.projectiles.ProjectileSource;

import java.util.Random;

public final class DamageByEntity implements Listener {

    private static final Random random = new Random();

    @EventHandler
    public void onDamageByEntity(EntityDamageByEntityEvent e) {
        Entity damager = e.getDamager();
        switch (damager.getType()) {
            case PLAYER -> PlayerAttack(e, (Player) damager);
            case ARROW -> ArrowAttack(e, (Arrow) damager);
            case TRIDENT -> TridentAttack(e, (Trident) damager);
            case FIREBALL, WITHER_SKULL, SHULKER_BULLET, SMALL_FIREBALL, BREEZE_WIND_CHARGE ->
                    ProjectileAttack(e, (Projectile) damager);
            case LIGHTNING_BOLT -> LightningAttack(e);
            case EVOKER_FANGS -> EvokerFangsAttack(e, (EvokerFangs) damager);
            case EGG, DRAGON_FIREBALL, LLAMA_SPIT, POTION, FISHING_BOBBER, SNOWBALL, SPECTRAL_ARROW, ENDER_PEARL,
                 EXPERIENCE_BOTTLE, FIREWORK_ROCKET, WIND_CHARGE, END_CRYSTAL, EYE_OF_ENDER, FALLING_BLOCK, TNT -> {
            }
            default -> MonsterAttack(e, damager);
        }
    }

    private void PlayerAttack(EntityDamageByEntityEvent e, Player player) {
        Entity damagee = e.getEntity();
        if (!damagee.getScoreboardTags().contains("m")) {
            return;
        }
        //玩家普攻怪物
        MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
        if (player.getInventory().getHeldItemSlot() == 0) {
            Data data = Yuehua.playerData.get(player.getUniqueId());
            if (!data.canAttack) {
                SendInformation.sendMes(Component.text("§e[游戏机制]§4你被缴械了，无法近战攻击"), player);
                e.setCancelled(true);
                return;
            }

            switch (data.job) {
                case 1 -> {
                    //未进阶，刹那
                    ZhanData zhanData = (ZhanData) data;

                    double attack = data.attack;
                    double baoji = data.baoji;
                    double baojixiaoguo = data.baojixiaoguo;
                    double pojia = data.pojia;

                    double hujia = monsterData.hujia;
                    double gedang = monsterData.gedang;

                    if (zhanData.branch != 2) {
                        if (player.getAttackCooldown() > 0.99f) {
                            //判断是否暴击
                            if (data.mustBaoji > 0) {
                                data.mustBaoji--;
                                SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                                }
                            } else if (random.nextDouble() < baoji) {
                                SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                                }
                            }

                            //根据护甲和破甲计算伤害
                            double x = Math.max(0.0, hujia - pojia);
                            double y = Math.min(1.0, x);
                            double damage = attack - gedang;
                            //根据格挡计算伤害
                            damage = damage * (1.0 - y);

                            monsterData.lastAttacker = player;

                            for (String observer : data.attackObservers) {
                                attack = attack * DoAttackObserver.doAttack(observer, data, (Mob) damagee);
                            }

                            for (String observer : monsterData.wuliAttackedObservers) {
                                attack = attack * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
                            }

                            for (String observer : monsterData.attackedObservers) {
                                attack = attack * DoMonsterAttackedObserver.doAttacked(observer, monsterData, data);
                            }

                            e.setDamage(damage);

                        } else {
                            Scheduler.async(() -> player.sendMessage(Component.text("§e[游戏机制]§4只有蓄力满才能攻击")));
                            e.setCancelled(true);
                        }
                    } else {
                        float cool = player.getAttackCooldown();
                        //天巧
                        if (cool < 0.2f) {
                            Scheduler.async(() -> player.sendMessage(Component.text("§e[游戏机制]§4至少要蓄力§b20%")));
                            e.setCancelled(true);
                        } else if (cool < 0.4f) {
                            if (data.mustBaoji > 0) {
                                data.mustBaoji--;
                                SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                                }
                            } else if (random.nextDouble() < baoji) {
                                SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                                }
                            }

                            //根据护甲和破甲计算伤害
                            double x = Math.max(0.0, hujia - pojia);
                            double y = Math.min(1.0, x);
                            double damage = attack - gedang;
                            //根据格挡计算伤害
                            damage = damage * (1.0 - y);

                            monsterData.lastAttacker = player;

                            for (String observer : data.attackObservers) {
                                attack = attack * DoAttackObserver.doAttack(observer, data, (Mob) damagee);
                            }

                            for (String observer : monsterData.wuliAttackedObservers) {
                                attack = attack * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
                            }

                            for (String observer : monsterData.attackedObservers) {
                                attack = attack * DoMonsterAttackedObserver.doAttacked(observer, monsterData, data);
                            }

                            e.setDamage(damage);

                        } else if (cool < 0.6f) {
                            //妙手二段,必定暴击
                        } else if (cool < 0.8f) {
                            //妙手三段，额外造成百分比已损生命值伤害
                        } else {
                            //妙手四段，额外造成范围群体伤害和短暂眩晕
                        }
                    }
                }
                case 2, 3 -> {
                    if (player.getAttackCooldown() > 0.99f) {
                        double attack = data.attack;
                        double baoji = data.baoji;
                        double baojixiaoguo = data.baojixiaoguo;
                        double pojia = data.pojia;
                        double hujia = monsterData.hujia;
                        double gedang = monsterData.gedang;

                        if (data.mustBaoji > 0) {
                            data.mustBaoji--;
                            SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                            attack = attack * baojixiaoguo;
                            for (String observer : data.baoJiObservers) {
                                attack = attack * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                            }
                        } else if (random.nextDouble() < baoji) {
                            SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                            attack = attack * baojixiaoguo;
                            for (String observer : data.baoJiObservers) {
                                attack = attack * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                            }
                        }

                        //根据护甲和破甲计算伤害
                        double x = Math.max(0.0, hujia - pojia);
                        double y = Math.min(1.0, x);
                        double damage = attack - gedang;
                        //根据格挡计算伤害
                        damage = damage * (1.0 - y);

                        monsterData.lastAttacker = player;

                        for (String observer : data.attackObservers) {
                            attack = attack * DoAttackObserver.doAttack(observer, data, (Mob) damagee);
                        }

                        for (String observer : monsterData.wuliAttackedObservers) {
                            attack = attack * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
                        }

                        for (String observer : monsterData.attackedObservers) {
                            attack = attack * DoMonsterAttackedObserver.doAttacked(observer, monsterData, data);
                        }

                        e.setDamage(damage);

                    } else {
                        Scheduler.async(() -> player.sendMessage(Component.text("§e[游戏机制]§4只有蓄力满才能攻击")));
                        e.setCancelled(true);
                    }
                }
                default -> e.setCancelled(true);
            }
        } else {
            Scheduler.async(() -> player.sendMessage(Component.text("§e[游戏机制]§4只能用1号位近战攻击")));
            e.setCancelled(true);
        }
    }

    private void ArrowAttack(EntityDamageByEntityEvent e, Arrow damager) {
        Entity damagee = e.getEntity();
        //玩家
        if (damagee.getType() == EntityType.PLAYER) {
            Player player = (Player) damagee;
            Data data = Yuehua.playerData.get(player.getUniqueId());
            double hujia = data.hujia;
            double gedang = data.gedang;

            ProjectileSource projectileSource = damager.getShooter();
            if (projectileSource == null) {
                return;
            }
            Mob mob = (Mob) projectileSource;
            data.lastAttacker = mob;

            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            double pojia = monsterData.pojia;
            double damage = monsterData.attack;

            damage -= gedang;
            double x = Math.max(0.0, hujia - pojia);
            double y = Math.min(0.8, x);
            damage = damage * (1.0 - y);
            damage = damage * (1.0 - data.jianmian);


            for (String observer : monsterData.attackObservers) {
                damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
            }

            for (String observer : data.wuliAttackedObservers) {
                damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, mob);
            }

            for (String observer : data.attackedObservers) {
                damage = damage * DoAttackedObserver.doAttacked(observer, data, mob);
            }

            e.setDamage(damage);

        } else {
            if (!damagee.getScoreboardTags().contains("m")) {
                return;
            }
            ProjectileSource projectileSource = damager.getShooter();
            if (projectileSource == null) {
                return;
            }
            Player player = (Player) projectileSource;

            MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
            double hujia = monsterData.hujia;
            double gedang = monsterData.gedang;

            Data data = Yuehua.playerData.get(player.getUniqueId());

            GongData gongData = (GongData) data;
            double pojia = gongData.pojia;

            double baoji = gongData.baoji;
            double baojixiaoguo = gongData.baojixiaoguo;
            double damage = e.getDamage();
            //判断是否暴击
            if (data.mustBaoji > 0) {
                data.mustBaoji--;
                SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                }
            } else if (random.nextDouble() < baoji) {
                SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, (Mob) damagee);
                }
            }

            damage -= gedang;
            double x = Math.max(0.0, hujia - pojia);
            double y = Math.min(1.0, x);
            damage = damage * (1.0 - y);
            monsterData.lastAttacker = player;

            //被动
            for (String observer : gongData.hitObservers) {
                damage = damage * DoHitObserver.doHit(observer, gongData, (Mob) damagee);
            }

            for (String observer : monsterData.wuliAttackedObservers) {
                damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
            }

            for (String observer : monsterData.attackedObservers) {
                damage = damage * DoMonsterAttackedObserver.doAttacked(observer, monsterData, data);
            }

            e.setDamage(damage);

            //技能
            for (String tag : damager.getScoreboardTags()) {
                DoPlayerProjectile.doProjectile(tag, gongData, (Mob) damagee);
            }

        }


    }

    private void TridentAttack(EntityDamageByEntityEvent e, Trident damager) {
        Entity damagee = e.getEntity();
        Player player = (Player) damagee;
        Data data = Yuehua.playerData.get(player.getUniqueId());
        double hujia = data.hujia;
        double gedang = data.gedang;

        ProjectileSource projectileSource = damager.getShooter();
        if (projectileSource == null) {
            return;
        }
        Mob mob = (Mob) projectileSource;
        data.lastAttacker = mob;

        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        double pojia = monsterData.pojia;
        double damage = monsterData.attack;

        damage -= gedang;
        double x = Math.max(0.0, hujia - pojia);
        double y = Math.min(0.8, x);
        damage = damage * (1.0 - y);
        damage = damage * (1.0 - data.sanchajimian);


        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, mob);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, mob);
        }

        e.setDamage(damage);

    }

    private void ProjectileAttack(EntityDamageByEntityEvent e, Projectile damager) {
        Entity damagee = e.getEntity();
        Player player = (Player) damagee;
        Data data = Yuehua.playerData.get(player.getUniqueId());
        double hujia = data.hujia;
        double gedang = data.gedang;

        ProjectileSource projectileSource = damager.getShooter();
        if (projectileSource == null) {
            return;
        }
        Mob mob = (Mob) projectileSource;
        data.lastAttacker = mob;

        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        double pojia = monsterData.pojia;
        double damage = monsterData.attack;

        damage -= gedang;
        double x = Math.max(0.0, hujia - pojia);
        double y = Math.min(0.8, x);
        damage = damage * (1.0 - y);


        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, mob);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, mob);
        }

        e.setDamage(damage);
    }

    private void LightningAttack(EntityDamageByEntityEvent e) {
        if (e.getEntityType() != EntityType.PLAYER) {
            return;
        }
        Player player = (Player) e.getEntity();
        Data data = Yuehua.playerData.get(player.getUniqueId());
        double max_hp = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
        double percent = 0.5;

        for (String observer : data.attackedObservers) {
            percent = percent * DoAttackedObserver.doAttacked(observer, data, null);
        }

        e.setDamage(max_hp * percent);

    }

    private void EvokerFangsAttack(EntityDamageByEntityEvent e, EvokerFangs damager) {
        if (e.getEntityType() != EntityType.PLAYER) {
            return;
        }
        Player player = (Player) e.getEntity();
        Data data = Yuehua.playerData.get(player.getUniqueId());
        double hujia = data.hujia;
        double gedang = data.gedang;


        EvokerFangs fangs = damager;
        Mob evoker = (Mob) fangs.getOwner();
        if (evoker == null) {
            return;
        }
        data.lastAttacker = evoker;

        MonsterData monsterData = Yuehua.monsterData.get(evoker.getUniqueId());
        double damage = monsterData.attack;
        double pojia = monsterData.pojia;

        double x = Math.max(0.0, hujia - pojia);
        double y = Math.min(0.8, x);
        damage -= gedang;
        damage = damage * (1.0 - y);

        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, evoker);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, evoker);
        }

        e.setDamage(damage);
    }

    private void MonsterAttack(EntityDamageByEntityEvent e, Entity damager) {
        if (e.getEntityType() != EntityType.PLAYER) {
            return;
        }
        if (!damager.getScoreboardTags().contains("m")) {
            return;
        }

        Player player = (Player) e.getEntity();
        Data data = Yuehua.playerData.get(player.getUniqueId());
        data.lastAttacker = (Mob) damager;

        double hujia = data.hujia;
        double gedang = data.gedang;

        MonsterData monsterData = Yuehua.monsterData.get(damager.getUniqueId());
        double damage = monsterData.attack;
        double pojia = monsterData.pojia;

        double x = Math.max(0.0, hujia - pojia);
        double y = Math.min(0.8, x);
        damage -= gedang;
        damage = damage * (1.0 - y);

        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, (Mob) damager);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, (Mob) damager);
        }

        e.setDamage(damage);


    }


}
