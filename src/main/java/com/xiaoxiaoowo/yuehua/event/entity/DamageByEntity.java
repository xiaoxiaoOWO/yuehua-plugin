package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttack;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterAttackedObserver;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.*;
import net.kyori.adventure.text.Component;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.persistence.PersistentDataType;

import java.util.Random;
import java.util.Set;

public final class DamageByEntity implements Listener {

    private static final Random random = new Random();


    @EventHandler
    public void onDamageByEntity(EntityDamageByEntityEvent e) {
        Entity damager = e.getDamager();
        switch (damager.getType()) {
            case PLAYER -> {
                Player player = (Player) damager;
                Entity damagee = e.getEntity();
                if (!damagee.getScoreboardTags().contains("m")) {
                    return;
                }

                MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
                if (player.getInventory().getHeldItemSlot() == 0) {
                    Data data = Yuehua.playerData.get(player.getUniqueId());
                    if (!data.canAttack) {
                        Yuehua.sendMes(Component.text("§e[游戏机制]§4你被缴械了，无法近战攻击"),player);
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
                                    if (random.nextDouble() < baoji) {
                                        Yuehua.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                                        attack = attack * baojixiaoguo;
                                        for (String observer : data.baoJiObservers) {
                                            DoBaojiObserver.doBaoji(observer, data);
                                        }
                                    }

                                    //根据护甲和破甲计算伤害
                                    double x = Math.max(0.0, hujia - pojia);
                                    double y = Math.min(1.0, x);
                                    double damage = attack * (1.0 - y);

                                    //根据格挡计算伤害
                                    damage -= gedang;

                                    e.setDamage(damage);
                                    monsterData.lastAttacker = player;

                                    for (String observer : data.attackObservers) {
                                        DoAttackObserver.doAttack(observer, data, (Mob) damagee);
                                    }

                                    DoMonsterAttackedObserver.doAttacked(monsterData.id, data);

                                } else {
                                    Yuehua.async(() -> player.sendMessage(
                                            Component.text("§e[游戏机制]§4只有蓄力满才能攻击")
                                    ));
                                    e.setCancelled(true);
                                }
                            } else {
                                float cool = player.getAttackCooldown();
                                //天巧
                                if (cool < 0.2f) {
                                    Yuehua.async(() -> player.sendMessage(
                                            Component.text("§e[游戏机制]§4至少要蓄力§b20%")
                                    ));
                                    e.setCancelled(true);
                                } else if (cool < 0.4f) {
                                    //判断是否暴击
                                    if (random.nextDouble() < baoji) {
                                        Yuehua.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                                        attack = attack * baojixiaoguo;
                                        for (String observer : data.baoJiObservers) {
                                            DoBaojiObserver.doBaoji(observer, data);
                                        }
                                    }

                                    //根据护甲和破甲计算伤害
                                    double x = Math.max(0.0, hujia - pojia);
                                    double y = Math.min(1.0, x);
                                    double damage = attack * (1.0 - y);

                                    //根据格挡计算伤害
                                    damage -= gedang;

                                    monsterData.lastAttacker = player;
                                    e.setDamage(damage);

                                    for (String observer : data.attackObservers) {
                                        DoAttackObserver.doAttack(observer, data, (Mob) damagee);
                                    }

                                    DoMonsterAttackedObserver.doAttacked(monsterData.id, data);

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


                                //判断是否暴击
                                if (random.nextDouble() < baoji) {
                                    Yuehua.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
                                    attack = attack * baojixiaoguo;
                                    for (String observer : data.baoJiObservers) {
                                        DoBaojiObserver.doBaoji(observer, data);
                                    }
                                }

                                //根据护甲和破甲计算伤害
                                double x = Math.max(0.0, hujia - pojia);
                                double y = Math.min(1.0, x);
                                double damage = attack * (1.0 - y);

                                //根据格挡计算伤害
                                damage -= gedang;

                                monsterData.lastAttacker = player;
                                e.setDamage(damage);

                                for (String observer : data.attackObservers) {
                                    DoAttackObserver.doAttack(observer, data, (Mob) damagee);
                                }

                                DoMonsterAttackedObserver.doAttacked(monsterData.id, data);

                            } else {
                                Yuehua.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4只有蓄力满才能攻击")
                                ));
                                e.setCancelled(true);
                            }
                        }
                        default -> e.setCancelled(true);
                    }
                } else {
                    Yuehua.async(() -> player.sendMessage(
                            Component.text("§e[游戏机制]§4只能用1号位近战攻击")
                    ));
                    e.setCancelled(true);
                }
            }
            case ARROW -> {
                Entity damagee = e.getEntity();
                //玩家
                if (damagee.getType() == EntityType.PLAYER) {
                    Player player = (Player) damagee;
                    Data data = Yuehua.playerData.get(player.getUniqueId());
                    double hujia = data.hujia;
                    double gedang = data.gedang;


                    double damage = e.getDamage();
                    damage = damage * (1.0 - hujia);
                    double jianmian = data.jianmian;
                    damage = damage * (1.0 - jianmian);
                    damage -= gedang;
                    e.setDamage(damage);


                    Arrow arrow = (Arrow) damager;

                    for (String observer : data.attackedObservers) {
                        DoAttackedObserver.doAttacked(observer, data, (Mob) arrow.getShooter());
                    }

                    for (String tag : damager.getScoreboardTags()) {
                        DoMonsterAttack.doMonsterAttack(tag, data);
                    }


                } else {
                    if (!damagee.getScoreboardTags().contains("m")) {
                        return;
                    }
                    Arrow arrow = (Arrow) damager;
                    MonsterData monsterData = Yuehua.monsterData.get(damagee.getUniqueId());
                    double hujia = monsterData.hujia;
                    double gedang = monsterData.gedang;
                    Player player = (Player) arrow.getShooter();
                    if (player == null) {
                        e.setCancelled(true);
                        return;
                    }

                    Data data = Yuehua.playerData.get(player.getUniqueId());

                    GongData gongData = (GongData) data;
                    double pojia = gongData.pojia;

                    double damage = e.getDamage();
                    double x = Math.max(0.0, hujia - pojia);
                    double y = Math.min(1.0, x);
                    damage = damage * (1.0 - y);
                    damage -= gedang;
                    e.setDamage(damage);

                    monsterData.lastAttacker = player;

                    //被动
                    for (String observer : gongData.hitObservers) {
                        DoHitObserver.doHit(observer, gongData, (Mob) damagee);
                    }

                    //技能
                    for (String tag : arrow.getScoreboardTags()) {
                        DoPlayerProjectile.doProjectile(tag, gongData, (Mob) damagee);
                    }

                    DoMonsterAttackedObserver.doAttacked(monsterData.id, data);


                }


            }

            case TRIDENT -> {
                if (e.getEntityType() != EntityType.PLAYER) {
                    return;
                }
                Player player = (Player) e.getEntity();

                Data data = Yuehua.playerData.get(player.getUniqueId());
                double hujia = data.hujia;
                double gedang = data.gedang;


                double damage = e.getDamage();
                damage = damage * (1.0 - hujia);
                damage = damage * (1.0 - data.sanchajimian);
                damage -= gedang;

                e.setDamage(damage);

                Trident trident = (Trident) damager;


                for (String observer : data.attackedObservers) {
                    DoAttackedObserver.doAttacked(observer, data, (Mob) trident.getShooter());
                }

                for (String tag : damager.getScoreboardTags()) {
                    DoMonsterAttack.doMonsterAttack(tag, data);
                }

            }

            case FIREBALL, WITHER_SKULL, SHULKER_BULLET, SMALL_FIREBALL, BREEZE_WIND_CHARGE -> {
                if (e.getEntityType() != EntityType.PLAYER) {
                    return;
                }
                Player player = (Player) e.getEntity();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                double hujia = data.hujia;
                double gedang = data.gedang;


                int damage = damager.getPersistentDataContainer().get(DataContainer.arrow, PersistentDataType.INTEGER);
                double damage2 = damage * (1.0 - hujia);
                damage2 -= gedang;
                e.setDamage(damage2);

                Projectile projectile = (Projectile) damager;


                for (String observer : data.attackedObservers) {
                    DoAttackedObserver.doAttacked(observer, data, (Mob) projectile.getShooter());
                }

                for (String tag : damager.getScoreboardTags()) {
                    DoMonsterAttack.doMonsterAttack(tag, data);
                }
            }

            case LIGHTNING_BOLT -> {
                if (e.getEntityType() != EntityType.PLAYER) {
                    return;
                }
                Player player = (Player) e.getEntity();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                double max_hp = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
                double percent = 0.5;

                e.setDamage(max_hp * percent);

                for (String observer : data.attackedObservers) {
                    DoAttackedObserver.doAttacked(observer, data, null);
                }
            }

            case EVOKER_FANGS -> {
                if (e.getEntityType() != EntityType.PLAYER) {
                    return;
                }
                Player player = (Player) e.getEntity();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                double hujia = data.hujia;
                double gedang = data.gedang;


                EvokerFangs fangs = (EvokerFangs) damager;
                Mob evoker = (Mob) fangs.getOwner();
                if (evoker == null) {
                    return;
                }
                MonsterData monsterData = Yuehua.monsterData.get(evoker.getUniqueId());
                double damage = monsterData.attack;
                double damage2 = damage * (1.0 - hujia);
                damage2 -= gedang;
                e.setDamage(damage2);


                for (String observer : data.attackedObservers) {
                    DoAttackedObserver.doAttacked(observer, data, evoker);
                }

                DoMonsterAttack.doMonsterAttack(monsterData.id, data);

            }

            case EGG, DRAGON_FIREBALL, LLAMA_SPIT, POTION, FISHING_BOBBER, SNOWBALL, SPECTRAL_ARROW -> {
            }


            default -> {
                if (e.getEntityType() != EntityType.PLAYER) {
                    return;
                }
                Set<String> tags = damager.getScoreboardTags();
                if (!tags.contains("m")) {
                    return;
                }

                Player player = (Player) e.getEntity();
                Data data = Yuehua.playerData.get(player.getUniqueId());
                double hujia = data.hujia;
                double gedang = data.gedang;

                MonsterData monsterData = Yuehua.monsterData.get(damager.getUniqueId());
                double damage = monsterData.attack;
                double damage2 = damage * (1.0 - hujia);
                damage2 -= gedang;
                e.setDamage(damage2);


                for (String observer : data.attackedObservers) {
                    DoAttackedObserver.doAttacked(observer, data, (Mob) damager);
                }

                DoMonsterAttack.doMonsterAttack(monsterData.id, data);
            }


        }
    }


}
