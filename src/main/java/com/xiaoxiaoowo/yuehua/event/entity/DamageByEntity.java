package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.*;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttack;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttacked;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterWuLiAttacked;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.*;
import com.xiaoxiaoowo.yuehua.system.handlePets.DoPetAttack;
import com.xiaoxiaoowo.yuehua.system.handlePets.DoPetAttacked;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.projectiles.ProjectileSource;

import java.util.Random;
import java.util.Set;

public final class DamageByEntity implements Listener {

    private static final Random random = new Random();
    private static final ItemStack jin = YuanSu.jin.clone();
    private static final ItemStack mu = YuanSu.mu.clone();
    private static final ItemStack shui = YuanSu.shui.clone();
    private static final ItemStack huo = YuanSu.huo.clone();
    private static final ItemStack tu = YuanSu.tu.clone();

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
            e.setCancelled(true);
            return;
        }
        //玩家普攻怪物
        MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
        if (player.getInventory().getHeldItemSlot() == 0) {
            Data data = Yuehua.playerData.get(player.getUniqueId());
            if (!data.canAttack) {
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你被缴械了，无法近战攻击"));
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

                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                                }
                            } else if (random.nextDouble() < baoji) {

                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                                }
                            }

                            //根据护甲和破甲计算伤害
                            double x = Math.max(0.0, hujia - pojia);
                            double y = x / (0.5 + x);
                            double damage = attack - gedang;
                            //根据格挡计算伤害
                            damage = damage * (1.0 - y);

                            monsterData.lastAttacker = player;

                            for (String observer : data.attackObservers) {
                                damage = damage * DoAttackObserver.doAttack(observer, data, monsterData);
                            }

                            for (String observer : monsterData.wuliAttackedObservers) {
                                damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
                            }

                            for (String observer : monsterData.attackedObservers) {
                                damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, data);
                            }

                            e.setDamage(damage);

                        } else {
                            e.setDamage(0);
                        }
                    } else {
                        float cool = player.getAttackCooldown();
                        //天巧
                        if (cool < 0.2f) {
                            e.setDamage(0);
                        } else if (cool < 0.4f) {
                            if (data.mustBaoji > 0) {
                                data.mustBaoji--;

                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                                }
                            } else if (random.nextDouble() < baoji) {

                                attack = attack * baojixiaoguo;
                                for (String observer : data.baoJiObservers) {
                                    attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                                }
                            }

                            //根据护甲和破甲计算伤害
                            double x = Math.max(0.0, hujia - pojia);
                            double y = x / (0.5 + x);
                            double damage = attack - gedang;
                            //根据格挡计算伤害
                            damage = damage * (1.0 - y);

                            monsterData.lastAttacker = player;

                            for (String observer : data.attackObservers) {
                                damage = damage * DoAttackObserver.doAttack(observer, data, monsterData);
                            }

                            for (String observer : monsterData.wuliAttackedObservers) {
                                damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
                            }

                            for (String observer : monsterData.attackedObservers) {
                                damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, data);
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
                case 2 -> {
                    if (player.getAttackCooldown() > 0.99f) {
                        double attack = data.attack;
                        double baoji = data.baoji;
                        double baojixiaoguo = data.baojixiaoguo;
                        double pojia = data.pojia;
                        double hujia = monsterData.hujia;
                        double gedang = monsterData.gedang;

                        if (data.mustBaoji > 0) {
                            data.mustBaoji--;

                            attack = attack * baojixiaoguo;
                            for (String observer : data.baoJiObservers) {
                                attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                            }
                        } else if (random.nextDouble() < baoji) {

                            attack = attack * baojixiaoguo;
                            for (String observer : data.baoJiObservers) {
                                attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                            }
                        }

                        //根据护甲和破甲计算伤害
                        double x = Math.max(0.0, hujia - pojia);
                        double y = x / (0.5 + x);
                        ;
                        double damage = attack - gedang;
                        //根据格挡计算伤害
                        damage = damage * (1.0 - y);

                        monsterData.lastAttacker = player;

                        for (String observer : data.attackObservers) {
                            damage = damage * DoAttackObserver.doAttack(observer, data, monsterData);
                        }

                        for (String observer : monsterData.wuliAttackedObservers) {
                            damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
                        }

                        for (String observer : monsterData.attackedObservers) {
                            damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, data);
                        }

                        e.setDamage(damage);

                    } else {
                        e.setDamage(0);
                    }
                }
                case 3 -> {
                    if (player.getAttackCooldown() > 0.99f) {
                        double attack = data.attack;
                        double baoji = data.baoji;
                        double baojixiaoguo = data.baojixiaoguo;
                        double pojia = data.pojia;
                        double hujia = monsterData.hujia;
                        double gedang = monsterData.gedang;
                        DanData danData = (DanData) data;

                        switch (data.slot0.id) {
                            case "fangShenDuanBi" -> attack += danData.zhenfa * 1;
                        }

                        if (data.mustBaoji > 0) {
                            data.mustBaoji--;

                            attack = attack * baojixiaoguo;
                            for (String observer : data.baoJiObservers) {
                                attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                            }
                        } else if (random.nextDouble() < baoji) {

                            attack = attack * baojixiaoguo;
                            for (String observer : data.baoJiObservers) {
                                attack = attack * DoBaojiObserver.doBaoji(observer, data, monsterData);
                            }
                        }

                        //根据护甲和破甲计算伤害
                        double x = Math.max(0.0, hujia - pojia);
                        double y = x / (0.5 + x);
                        double damage = attack - gedang;
                        //根据格挡计算伤害
                        damage = damage * (1.0 - y);

                        monsterData.lastAttacker = player;

                        for (String observer : data.attackObservers) {
                            damage = damage * DoAttackObserver.doAttack(observer, data, monsterData);
                        }

                        for (String observer : monsterData.wuliAttackedObservers) {
                            damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
                        }

                        for (String observer : monsterData.attackedObservers) {
                            damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, data);
                        }


                        e.setDamage(damage);

                        if (damage > monsterData.monster.getHealth()) {
                            //能杀死
                            switch (data.slot0.id) {
                                case "fangShenDuanBi" -> randomGive(player, 2);
                            }
                        }


                    } else {
                        e.setDamage(0);
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
            Mob mob = (Mob) projectileSource;
            data.lastAttacker = mob;

            MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
            double pojia = monsterData.pojia;
            double damage = monsterData.attack;


            damage -= gedang;
            double x = Math.max(0.0, hujia - pojia);
            double y = x / (0.5 + x);
            ;
            damage = damage * (1.0 - y);
            damage = damage * (1.0 - data.jianmian);

            double damageBefore = damage;


            for (String observer : monsterData.attackObservers) {
                damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
            }

            for (String observer : data.wuliAttackedObservers) {
                damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, mob);
            }

            for (String observer : data.attackedObservers) {
                damage = damage * DoAttackedObserver.doAttacked(observer, data, mob, damageBefore);
            }

            e.setDamage(damage);

        } else {
            Set<String> tags = damagee.getScoreboardTags();
            if (!tags.contains("m")) {
                if (tags.contains("p")) {
                    ProjectileSource projectileSource = damager.getShooter();
                    Mob mob = (Mob) projectileSource;
                    MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

                    //宠物被怪物箭射击
                    PetData petData = Yuehua.petData.get(damagee.getUniqueId());
                    double hujia = petData.hujia;
                    double gedang = petData.gedang;

                    petData.lastAttacker = mob;


                    double pojia = monsterData.pojia;
                    double damage = monsterData.attack;

                    damage -= gedang;
                    double x = Math.max(0.0, hujia - pojia);
                    double y = x / (0.5 + x);
                    ;
                    damage = damage * (1.0 - y);

                    for (String observer : monsterData.attackObservers) {
                        damage = damage * DoMonsterAttack.doMonsterAttack(observer, petData, monsterData);
                    }

                    for (String observer : petData.attackedObservers) {
                        damage = damage * DoPetAttacked.doAttacked(observer, monsterData, petData);
                    }

                    e.setDamage(damage);

                }
                return;
            }
            //怪物被玩家或宠物箭射击
            ProjectileSource projectileSource = damager.getShooter();
            Entity entity = (Entity) projectileSource;
            if (entity.getType() != EntityType.PLAYER) {
                Mob mob = (Mob) entity;
                //宠物射击怪物
                PetData petData = Yuehua.petData.get(mob.getUniqueId());

                MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
                double hujia = monsterData.hujia;
                double gedang = monsterData.gedang;

                double pojia = petData.pojia;
                double damage = petData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);
                monsterData.lastAttacker = petData.Owner;

                for (String observer : petData.attackObservers) {
                    damage = damage * DoPetAttack.doPetAttack(observer, monsterData, petData);
                }

                for (String observer : monsterData.wuliAttackedObservers) {
                    damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, petData);
                }

                for (String observer : monsterData.attackedObservers) {
                    damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);
                return;
            }
            //玩家的箭射击怪物
            Player player = (Player) entity;

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

                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            } else if (random.nextDouble() < baoji) {

                damage = damage * baojixiaoguo;
                for (String observer : data.baoJiObservers) {
                    damage = damage * DoBaojiObserver.doBaoji(observer, data, monsterData);
                }
            }

            damage -= gedang;
            double x = Math.max(0.0, hujia - pojia);
            double y = x / (0.5 + x);
            ;
            damage = damage * (1.0 - y);
            monsterData.lastAttacker = player;

            Set<String> arrowTags = damager.getScoreboardTags();

            //被动
            if (arrowTags.contains("fullforce")) {
                for (String observer : gongData.hitObservers) {
                    damage = damage * DoHitObserver.doHit(observer, gongData, monsterData);
                }
            }

            for (String observer : monsterData.wuliAttackedObservers) {
                damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, data);
            }

            for (String observer : monsterData.attackedObservers) {
                damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, data);
            }

            e.setDamage(damage);

            //技能
            for (String tag : arrowTags) {
                DoPlayerProjectileObserver.doProjectile(tag, gongData, (Mob) damagee);
            }

        }


    }

    private void TridentAttack(EntityDamageByEntityEvent e, Trident damager) {
        Entity damagee = e.getEntity();
        if (damagee.getType() != EntityType.PLAYER) {
            Set<String> tags = damagee.getScoreboardTags();
            if (tags.contains("m")) {
                ProjectileSource projectileSource = damager.getShooter();
                Mob mob = (Mob) projectileSource;
                PetData petData = Yuehua.petData.get(mob.getUniqueId());

                //怪物被宠物投掷三叉戟
                MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
                double hujia = monsterData.hujia;
                double gedang = monsterData.gedang;

                monsterData.lastAttacker = petData.Owner;
                double pojia = petData.pojia;
                double damage = petData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : petData.attackObservers) {
                    damage = damage * DoPetAttack.doPetAttack(observer, monsterData, petData);
                }

                for (String observer : monsterData.wuliAttackedObservers) {
                    damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, petData);
                }

                for (String observer : monsterData.attackedObservers) {
                    damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);


            } else {
                ProjectileSource projectileSource = damager.getShooter();
                Mob mob = (Mob) projectileSource;
                MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

                //宠物被怪物投掷三叉戟
                PetData petData = Yuehua.petData.get(damagee.getUniqueId());
                double hujia = petData.hujia;
                double gedang = petData.gedang;


                petData.lastAttacker = mob;

                double pojia = monsterData.pojia;
                double damage = monsterData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : monsterData.attackObservers) {
                    damage = damage * DoMonsterAttack.doMonsterAttack(observer, petData, monsterData);
                }

                for (String observer : petData.attackedObservers) {
                    damage = damage * DoPetAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);

            }
            return;
        }

        Player player = (Player) damagee;
        Data data = Yuehua.playerData.get(player.getUniqueId());

        double hujia = data.hujia;
        double gedang = data.gedang;

        ProjectileSource projectileSource = damager.getShooter();
        Mob mob = (Mob) projectileSource;
        data.lastAttacker = mob;

        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        double pojia = monsterData.pojia;
        double damage = monsterData.attack;


        damage -= gedang;
        double x = Math.max(0.0, hujia - pojia);
        double y = x / (0.5 + x);
        ;
        damage = damage * (1.0 - y);
        damage = damage * (1.0 - data.sanchajimian);

        double damageBefore = damage;


        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, mob);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, mob, damageBefore);
        }

        e.setDamage(damage);

    }

    private void ProjectileAttack(EntityDamageByEntityEvent e, Projectile damager) {
        Entity damagee = e.getEntity();

        if (damagee.getType() != EntityType.PLAYER) {
            Set<String> tags = damagee.getScoreboardTags();
            if (tags.contains("m")) {
                ProjectileSource projectileSource = damager.getShooter();
                Mob mob = (Mob) projectileSource;
                PetData petData = Yuehua.petData.get(mob.getUniqueId());

                //怪物被宠物发射物品攻击
                MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
                double hujia = monsterData.hujia;
                double gedang = monsterData.gedang;


                monsterData.lastAttacker = petData.Owner;
                double pojia = petData.pojia;
                double damage = petData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : petData.attackObservers) {
                    damage = damage * DoPetAttack.doPetAttack(observer, monsterData, petData);
                }

                for (String observer : monsterData.wuliAttackedObservers) {
                    damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, petData);
                }

                for (String observer : monsterData.attackedObservers) {
                    damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);


            } else {
                ProjectileSource projectileSource = damager.getShooter();
                Mob mob = (Mob) projectileSource;
                MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

                //宠物被怪物发射物品攻击
                PetData petData = Yuehua.petData.get(damagee.getUniqueId());
                double hujia = petData.hujia;
                double gedang = petData.gedang;


                petData.lastAttacker = mob;


                double pojia = monsterData.pojia;
                double damage = monsterData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : monsterData.attackObservers) {
                    damage = damage * DoMonsterAttack.doMonsterAttack(observer, petData, monsterData);
                }

                for (String observer : petData.attackedObservers) {
                    damage = damage * DoPetAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);

            }
            return;
        }

        Player player = (Player) damagee;
        Data data = Yuehua.playerData.get(player.getUniqueId());

        double hujia = data.hujia;
        double gedang = data.gedang;

        ProjectileSource projectileSource = damager.getShooter();
        Mob mob = (Mob) projectileSource;
        data.lastAttacker = mob;

        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        double pojia = monsterData.pojia;
        double damage = monsterData.attack;


        damage -= gedang;
        double x = Math.max(0.0, hujia - pojia);
        double y = x / (0.5 + x);
        ;
        damage = damage * (1.0 - y);

        double damageBefore = damage;

        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, mob);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, mob, damageBefore);
        }

        e.setDamage(damage);
    }


    private void EvokerFangsAttack(EntityDamageByEntityEvent e, EvokerFangs damager) {
        Entity damagee = e.getEntity();
        if (damagee.getType() != EntityType.PLAYER) {
            Set<String> tags = damagee.getScoreboardTags();
            if (tags.contains("m")) {
                Mob mob = (Mob) damager.getOwner();
                if (mob == null) {
                    e.setCancelled(true);
                    damager.remove();
                    return;
                }
                PetData petData = Yuehua.petData.get(mob.getUniqueId());
                if (petData == null) {
                    e.setCancelled(true);
                    return;
                }

                //怪物被宠物发射物品攻击
                MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
                double hujia = monsterData.hujia;
                double gedang = monsterData.gedang;


                monsterData.lastAttacker = petData.Owner;
                double pojia = petData.pojia;
                double damage = petData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : petData.attackObservers) {
                    damage = damage * DoPetAttack.doPetAttack(observer, monsterData, petData);
                }

                for (String observer : monsterData.wuliAttackedObservers) {
                    damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, petData);
                }

                for (String observer : monsterData.attackedObservers) {
                    damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);


            } else {
                Mob mob = (Mob) damager.getOwner();
                if (mob == null) {
                    e.setCancelled(true);
                    damager.remove();
                    return;
                }
                MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
                if (monsterData == null) {
                    e.setCancelled(true);
                    return;
                }


                //宠物被怪物发射物品攻击
                PetData petData = Yuehua.petData.get(damagee.getUniqueId());
                double hujia = petData.hujia;
                double gedang = petData.gedang;


                petData.lastAttacker = mob;


                double pojia = monsterData.pojia;
                double damage = monsterData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : monsterData.attackObservers) {
                    damage = damage * DoMonsterAttack.doMonsterAttack(observer, petData, monsterData);
                }

                for (String observer : petData.attackedObservers) {
                    damage = damage * DoPetAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);

            }
            return;
        }
        Player player = (Player) e.getEntity();
        Data data = Yuehua.playerData.get(player.getUniqueId());

        double hujia = data.hujia;
        double gedang = data.gedang;


        Mob evoker = (Mob) damager.getOwner();
        if (evoker == null) {
            e.setCancelled(true);
            damager.remove();
            return;
        }
        data.lastAttacker = evoker;

        MonsterData monsterData = Yuehua.monsterData.get(evoker.getUniqueId());
        double damage = monsterData.attack;
        double pojia = monsterData.pojia;

        double x = Math.max(0.0, hujia - pojia);
        double y = x / (0.5 + x);


        damage -= gedang;
        damage = damage * (1.0 - y);

        double damageBefore = damage;

        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, evoker);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, evoker, damageBefore);
        }

        e.setDamage(damage);
    }

    private void MonsterAttack(EntityDamageByEntityEvent e, Entity damager) {
        Entity damagee = e.getEntity();
        if (damagee.getType() != EntityType.PLAYER) {
            Set<String> tags = damagee.getScoreboardTags();
            if (tags.contains("m")) {
                if (!damager.getScoreboardTags().contains("p")) {
                    return;
                }
                //怪物被宠物攻击
                MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
                double hujia = monsterData.hujia;
                double gedang = monsterData.gedang;

                PetData petData = Yuehua.petData.get(damager.getUniqueId());
                monsterData.lastAttacker = petData.Owner;
                double pojia = petData.pojia;
                double damage = petData.attack;

                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : petData.attackObservers) {
                    damage = damage * DoPetAttack.doPetAttack(observer, monsterData, petData);
                }

                for (String observer : monsterData.wuliAttackedObservers) {
                    damage = damage * DoMonsterWuLiAttacked.doWuLiAttacked(observer, monsterData, petData);
                }

                for (String observer : monsterData.attackedObservers) {
                    damage = damage * DoMonsterAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);


            } else {
                if (!damager.getScoreboardTags().contains("m")) {
                    return;
                }
                Mob mob = (Mob) damager;

                //宠物被怪物攻击
                PetData petData = Yuehua.petData.get(damagee.getUniqueId());
                double hujia = petData.hujia;
                double gedang = petData.gedang;
                petData.lastAttacker = mob;

                MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
                double pojia = monsterData.pojia;
                double damage = monsterData.attack;


                damage -= gedang;
                double x = Math.max(0.0, hujia - pojia);
                double y = x / (0.5 + x);
                ;
                damage = damage * (1.0 - y);

                for (String observer : monsterData.attackObservers) {
                    damage = damage * DoMonsterAttack.doMonsterAttack(observer, petData, monsterData);
                }

                for (String observer : petData.attackedObservers) {
                    damage = damage * DoPetAttacked.doAttacked(observer, monsterData, petData);
                }

                e.setDamage(damage);

            }
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
        double y = x / (0.5 + x);


        damage -= gedang;
        damage = damage * (1.0 - y);

        double damageBefore = damage;

        for (String observer : monsterData.attackObservers) {
            damage = damage * DoMonsterAttack.doMonsterAttack(observer, data, monsterData);
        }

        for (String observer : data.wuliAttackedObservers) {
            damage = damage * DoAttackedObserver.doAttackedWuLi(observer, data, (Mob) damager);
        }

        for (String observer : data.attackedObservers) {
            damage = damage * DoAttackedObserver.doAttacked(observer, data, (Mob) damager, damageBefore);
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

        double damageBefore = max_hp * percent;

        for (String observer : data.attackedObservers) {
            percent = percent * DoAttackedObserver.doAttacked(observer, data, null, damageBefore);
        }

        e.setDamage(max_hp * percent);


    }

    private void randomGive(Player player, int count) {
        PlayerInventory playerInventory = player.getInventory();
        for (int i = 0; i < count; i++) {
            int randomNum = random.nextInt(5);
            switch (randomNum) {
                case 0 -> playerInventory.addItem(jin);
                case 1 -> playerInventory.addItem(mu);
                case 2 -> playerInventory.addItem(shui);
                case 3 -> playerInventory.addItem(huo);
                case 4 -> playerInventory.addItem(tu);
            }

        }
    }

}
