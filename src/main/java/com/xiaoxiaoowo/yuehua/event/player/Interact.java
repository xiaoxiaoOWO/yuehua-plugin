package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.*;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithTwoActiveSkill;
import com.xiaoxiaoowo.yuehua.jineng.DoJiNeng;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import static org.bukkit.Material.YELLOW_DYE;


public final class Interact implements Listener {
    private static final Random random = new Random();

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        //右键
        if (e.getAction().isRightClick()) {
            ItemStack item = e.getItem();
            if (item != null) {
                Material type = item.getType();
                if (e.getHand() == EquipmentSlot.HAND) {
                    switch (type) {

                        case BOW -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job == 2) {
                                if (player.getInventory().getHeldItemSlot() == 0) {
                                    GongData gongData = (GongData) data;
                                    gongData.time_pulling = GetEntity.world.getGameTime();
                                } else {
                                    e.setCancelled(true);
                                    Scheduler.async(() -> player.sendMessage(
                                            Component.text("§e[游戏机制]§4只能用一号位使用弓哦").color(NamedTextColor.DARK_RED)
                                    ));
                                }
                            } else {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4你不是弓箭手").color(NamedTextColor.DARK_RED)
                                ));
                            }
                        }
                        case CROSSBOW -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job == 2) {
                                if (player.getInventory().getHeldItemSlot() == 0) {
                                    GongData gongData = (GongData) data;
                                    if (gongData.time_charging > 20 * 60 * 60) {
                                        gongData.time_charging = GetEntity.world.getGameTime();
                                    }
                                } else {
                                    e.setCancelled(true);
                                    Scheduler.async(() -> player.sendMessage(
                                            Component.text("§e[游戏机制]§4只能用一号位使用弩哦").color(NamedTextColor.DARK_RED)
                                    ));
                                }
                            } else {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4你不是弓箭手").color(NamedTextColor.DARK_RED)
                                ));
                            }
                        }


                        case DIAMOND_PICKAXE -> {
                            Player player = e.getPlayer();
                            int slot = player.getInventory().getHeldItemSlot();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            int job = data.job;
                            switch (job) {
                                case 1 -> {
                                    ZhanData zhanData = (ZhanData) data;
                                    rightClickZhan(slot, zhanData);
                                }
                                case 2 -> {
                                    GongData gongData = (GongData) data;
                                    rightClickGong(slot, gongData);
                                }
                                case 3 -> {
                                    DanData danData = (DanData) data;
                                    rightClickDan(slot, danData);
                                }
                            }
                        }
                        case IRON_PICKAXE -> {
                            Player player = e.getPlayer();
                            int slot = player.getInventory().getHeldItemSlot();
                            if (slot == 8) {
                                Data data = Yuehua.playerData.get(player.getUniqueId());
                                rightClickAll(data);
                            }
                        }


                        case RAW_GOLD -> {
                            Player player = e.getPlayer();
                            int cmd = item.getCustomModelData();
                            int xp = switch (cmd) {
                                case 1 -> 10;
                                case 2 -> 20;
                                case 3 -> 50;
                                case 4 -> 100;
                                case 5 -> 200;
                                case 6 -> 500;
                                default -> 0;
                            };
                            int amount = item.getAmount();
                            xp *= amount;
                            player.getInventory().setItemInMainHand(null);
                            player.giveExp(xp, false);
                        }

                        case STONE_PICKAXE -> {
                            Player player = e.getPlayer();
                            Vector force = player.getEyeLocation().getDirection().multiply(30);
                            player.setVelocity(force);
                        }

                        case DIAMOND_SHOVEL -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            data.job++;
                            if (data.job > 3) {
                                data.job = 1;
                            }
                        }

                        case DIAMOND_AXE -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            Entity entity = player.getTargetEntity(64);
                            if (entity == null) {
                                Location eyeloc = player.getEyeLocation();
                                ArrayList<Mob> entites = GetEntity.getRayMonster(eyeloc, 32, 2);
                                double distance = Double.MAX_VALUE;

                                for (Mob mob : entites) {
                                    double distanceSp = GetEntity.mydistance(mob.getLocation(), eyeloc);
                                    if (distanceSp < distance) {
                                        distance = distanceSp;
                                        entity = mob;
                                    }
                                }

                            }


                            if (entity == null) {
                                return;
                            }

                            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());

                            data.updatePofaAdd(99999);

                            Damage.damageMonster(data, 10000000, monsterData);
                        }

                        case INK_SAC -> {
                            Player player = e.getPlayer();
                            String id = item.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                            if (doPinZheng(id, player)) {
                                player.getInventory().setItemInMainHand(null);
                            }
                        }

                        case SHIELD -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job != 1) {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4你不是战士").color(NamedTextColor.DARK_RED)
                                ));
                            } else {
                                e.setCancelled(true);
                            }
                        }


                        case FISHING_ROD -> {
                            Player player = e.getPlayer();
                            if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                                player.setHealth(0);
                                player.sendMessage(
                                        Component.text("§e[游戏机制]§4试图逃离副本机制，你已被惩罚")
                                );
                            }
                            e.setCancelled(true);
                        }

                        case SPLASH_POTION -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job != 3) {
                                e.setCancelled(true);
                                player.getInventory().setItemInMainHand(null);
                                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4只有炼丹师可以使用"));
                            }
                            player.setCooldown(Material.SPLASH_POTION, 40);
                        }

//                        case DIAMOND_SWORD -> {
//                            Player player = e.getPlayer();
//                            Damage.damage(player,10,0,GetEntity.getRayMonster(player, 10));
//                            Damage.damage(player,10,0,GetEntity.getRayMonsterWithRoatation(player, 10,Math.PI/6));
//                            Damage.damage(player,10,0,GetEntity.getRayMonsterWithRoatation(player, 10,-Math.PI/6));
//                            TestRay.run(player);
//
//
//
//                        }
                    }
                } else {
                    switch (type) {
                        case FISHING_ROD -> {
                            Player player = e.getPlayer();
                            if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                                player.setHealth(0);
                                player.sendMessage(
                                        Component.text("§e[游戏机制]§4试图逃离副本机制，你已被惩罚")
                                );
                            }
                        }

                        case SHIELD -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job != 1) {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4你不是战士").color(NamedTextColor.DARK_RED)
                                ));
                            } else {
                                e.setCancelled(true);
                            }
                        }


                        case BOW -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job == 2) {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4只能用一号位使用弓哦").color(NamedTextColor.DARK_RED)
                                ));
                            } else {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4你不是弓箭手").color(NamedTextColor.DARK_RED)
                                ));
                            }
                        }
                        case CROSSBOW -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job == 2) {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4只能用一号位使用弩哦").color(NamedTextColor.DARK_RED)
                                ));
                            } else {
                                e.setCancelled(true);
                                Scheduler.async(() -> player.sendMessage(
                                        Component.text("§e[游戏机制]§4你不是弓箭手").color(NamedTextColor.DARK_RED)
                                ));
                            }
                        }

                        case SPLASH_POTION -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job != 3) {
                                e.setCancelled(true);
                                player.getInventory().setItemInMainHand(null);
                                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4只有炼丹师可以使用"));
                            }
                            player.setCooldown(Material.SPLASH_POTION, 40);
                        }
                    }
                }
            }
        }
    }

    private static void rightClickZhan(int num, ZhanData zhanData) {
        Player player = zhanData.player;
        SlotWithOneActiveSkill slotWithOneActiveSkill = switch (num) {
            case 0 -> zhanData.slot0;
            case 1 -> zhanData.slot1;
            case 2 -> zhanData.slot2;
            default -> null;
        };
        if (slotWithOneActiveSkill == null) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4只有在激活位才能释放技能"));
            return;
        }

        if (!zhanData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }

        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
                    return;
                }
                DoJiNeng.doJiNengZhan2(slotWithTwoActiveSkill.id, zhanData);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
            return;
        }
        DoJiNeng.doJiNengZhan(slotWithOneActiveSkill.id, zhanData);

    }

    private static void rightClickDan(int num, DanData danData) {
        Player player = danData.player;
        SlotWithOneActiveSkill slotWithOneActiveSkill = switch (num) {
            case 1 -> danData.slot1;
            case 2 -> danData.slot2;
            case 3 -> danData.slot3;
            case 4 -> danData.slot4;
            case 5 -> danData.slot5;
            default -> null;
        };
        if (slotWithOneActiveSkill == null) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4只有在激活位才能释放技能"));
            return;
        }

        if (!danData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }
        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
                    return;
                }
                DoJiNeng.doJiNengDan2(slotWithTwoActiveSkill.id, danData);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
            return;
        }
        DoJiNeng.doJiNengDan(slotWithOneActiveSkill.id, danData);

    }

    private static void rightClickGong(int num, GongData gongData) {
        Player player = gongData.player;
        SlotWithOneActiveSkill slotWithOneActiveSkill = switch (num) {
            case 1 -> gongData.slot1;
            case 2 -> gongData.slot2;
            default -> null;
        };
        if (slotWithOneActiveSkill == null) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4只有在激活位才能释放技能"));
            return;
        }

        if (!gongData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }

        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
                    return;
                }
                DoJiNeng.doJiNengGong2(slotWithTwoActiveSkill.id, gongData);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
            return;
        }
        DoJiNeng.doJiNengGong(slotWithOneActiveSkill.id, gongData);

    }

    private static void rightClickAll(Data data) {
        Player player = data.player;
        SlotWithOneActiveSkill slotWithOneActiveSkill = data.slot8;

        if (!data.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }

        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
                    return;
                }
                DoJiNeng.doJiNeng2(slotWithTwoActiveSkill.id, data);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4技能冷却中,剩余§b" + cd / 20.0 + "§4秒"));
            return;
        }
        DoJiNeng.doJiNeng(slotWithOneActiveSkill.id, data);
    }


    public static boolean doPinZheng(String id, Player player) {
        switch (id) {
            case "yemingzhu" -> {
                Set<String> tags = player.getScoreboardTags();
                if (tags.contains("night_vision")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经获取了权限！"));
                    return false;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§a成功获取夜视使用权限！"));
                    tags.add("night_vision");
                    return true;
                }
            }

            case "yaoshihe" -> {
                return RandomChest.randomLuckyKey(player, 1);
            }

            case "yaoshihe2" -> {
                return RandomChest.randomLuckyKey(player, 2);
            }

            case "yaoshihe3" -> {
                return RandomChest.randomLuckyKey(player, 5);
            }

            case "yushibag1" -> {
                return RandomChest.randomYushi(player, 6, 1);
            }

            case "yushibag2" -> {
                return RandomChest.randomYushi(player, 5, 2);
            }

            case "yushibag3" -> {
                return RandomChest.randomYushi(player, 4, 3);
            }

            case "yushibag4" -> {
                return RandomChest.randomYushi(player, 3, 4);
            }

            case "yushibag5" -> {
                return RandomChest.randomYushi(player, 2, 5);
            }

            case "yushibag6" -> {
                return RandomChest.randomYushi(player, 1, 6);
            }

            case "yushibag7" -> {
                return RandomChest.randomYushi(player, 1, 7);
            }

            case "yushibag8" -> {
                return RandomChest.randomYushi(player, 1, 8);
            }

            case "qkd1unlock" -> {
                if (player.getScoreboardTags().contains("qkd1")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯一"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd1");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯一"));
                    return true;
                }
            }
            case "qkd2unlock" -> {
                if (player.getScoreboardTags().contains("qkd2")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯二"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd2");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯二"));
                    return true;
                }
            }
            case "qkd3unlock" -> {
                if (player.getScoreboardTags().contains("qkd3")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯三"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd3");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯三"));
                    return true;
                }
            }
            case "qkd4unlock" -> {
                if (player.getScoreboardTags().contains("qkd4")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯四"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd4");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯四"));
                    return true;
                }
            }
            case "qkd6unlock" -> {
                if (player.getScoreboardTags().contains("qkd6")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯六"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd6");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯六"));
                    return true;
                }
            }
            case "qkd7unlock" -> {
                if (player.getScoreboardTags().contains("qkd7")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯七"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd7");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯七"));
                    return true;
                }
            }
            case "qkd8unlock" -> {
                if (player.getScoreboardTags().contains("qkd8")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯八"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd8");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯八"));
                    return true;
                }
            }
            case "qkd9unlock" -> {
                if (player.getScoreboardTags().contains("qkd9")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯九"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd9");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯九"));
                    return true;
                }
            }
            case "qkd10unlock" -> {
                if (player.getScoreboardTags().contains("qkd10")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd10");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十"));
                    return true;
                }
            }
            case "qkd11unlock" -> {
                if (player.getScoreboardTags().contains("qkd11")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十一"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd11");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十一"));
                    return true;
                }
            }
            case "qkd12unlock" -> {
                if (player.getScoreboardTags().contains("qkd12")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十二"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd12");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十二"));
                    return true;
                }
            }
            case "qkd13unlock" -> {
                if (player.getScoreboardTags().contains("qkd13")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十三"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd13");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十三"));
                    return true;
                }
            }
            case "qkd14unlock" -> {
                if (player.getScoreboardTags().contains("qkd14")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十四"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd14");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十四"));
                    return true;
                }
            }
            case "qkd15unlock" -> {
                if (player.getScoreboardTags().contains("qkd15")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十五"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd15");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十五"));
                    return true;
                }
            }
            case "qkd16unlock" -> {
                if (player.getScoreboardTags().contains("qkd16")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十六"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd16");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十六"));
                    return true;
                }
            }
            case "qkd17unlock" -> {
                if (player.getScoreboardTags().contains("qkd17")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十七"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd17");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十七"));
                    return true;
                }
            }
            case "qkd18unlock" -> {
                if (player.getScoreboardTags().contains("qkd18")) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了乾坤盒☯十八"));
                    return false;
                } else {
                    player.addScoreboardTag("qkd18");
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁乾坤盒☯十八"));
                    return true;
                }
            }

            case "hunyuandaiunlock" -> {
                if (player.getScoreboardTags().contains("shared")) {
                    //已经解锁
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了混元袋☯无界"));
                    return false;
                } else {
                    player.addScoreboardTag("shared");
                    SQL.initialShared(player);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6解锁混元袋☯无界"));
                    return true;
                }
            }

            case "chonghua2" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 1) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 2);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为2阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为1阶！"));
                    return false;
                }
            }
            case "chonghua3" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 2) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 3);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为3阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为2阶！"));
                    return false;
                }
            }
            case "chonghua4" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 3) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 4);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为4阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为3阶！"));
                    return false;
                }
            }
            case "chonghua5" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 4) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 5);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为5阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为4阶！"));
                    return false;
                }
            }
            case "chonghua6" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 5) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 6);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为6阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为5阶！"));
                    return false;
                }
            }
            case "chonghua7" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 6) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 7);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为7阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为6阶！"));
                    return false;
                }
            }
            case "chonghua8" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 7) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 8);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为8阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为7阶！"));
                    return false;
                }
            }
            case "chonghua9" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 8) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 9);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为9阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为8阶！"));
                    return false;
                }
            }
            case "chonghua10" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 9) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 10);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为10阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为9阶！"));
                    return false;
                }
            }
            case "chonghua11" -> {
                if (player.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER) == 10) {
                    player.getPersistentDataContainer().set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 11);
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§6重华晶升级为11阶"));
                    return true;
                } else {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的重华晶不为10阶！"));
                    return false;
                }
            }


            case "shipincao1" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(0);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位一！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位一！"));
                data.shipinBar.setItem(0, null);
                return true;
            }

            case "shipincao2" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(1);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位二！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位二！"));
                data.shipinBar.setItem(1, null);
                return true;
            }

            case "shipincao3" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(2);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位三！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位三！"));
                data.shipinBar.setItem(2, null);
                return true;
            }

            case "shipincao4" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(3);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位四！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位四！"));
                data.shipinBar.setItem(3, null);
                return true;
            }

            case "shipincao5" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(4);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位五！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位五！"));
                data.shipinBar.setItem(4, null);
                return true;
            }

            case "shipincao6" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(5);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位六！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位六！"));
                data.shipinBar.setItem(5, null);
                return true;
            }

            case "shipincao7" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(6);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位七！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位七！"));
                data.shipinBar.setItem(6, null);
                return true;
            }

            case "shipincao8" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                ItemStack item = data.shipinBar.getItem(7);
                if (item == null || item.getType() != YELLOW_DYE) {
                    SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你已经解锁了槽位八！"));
                    return false;
                }
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你成功解锁了槽位八！"));
                data.shipinBar.setItem(7, null);
                return true;
            }

            default -> {
                return false;
            }
        }
    }

    public static void zhenfa(String id, DanData danData, Player player) {
        if (!danData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
        }

        switch (id) {
            case "jin0" -> {
                long time = GetEntity.world.getGameTime();
                if (danData.cd_jin > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4金元素阵法冷却中,剩余§b" + (danData.cd_jin - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.jinCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4金元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_jin = time + (long) (20 * 2 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost1) {
                    return;
                }

                danData.jinCount--;
            }

            case "jin1" -> {
                if (!player.getScoreboardTags().contains("zhenfa2")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁精炼元素阵法"));
                    return;
                }

                long time = GetEntity.world.getGameTime();
                if (danData.cd_jin > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4金元素阵法冷却中,剩余§b" + (danData.cd_jin - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.refinedJinCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4精炼金元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_jin = time + (long) (20 * 10 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost2) {
                    return;
                }

                danData.refinedJinCount--;

            }

            case "jin2" -> {
                if (!player.getScoreboardTags().contains("zhenfa3")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁浓缩元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_jin > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4金元素阵法冷却中,剩余§b" + (danData.cd_jin - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.concentratedJinCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4浓缩金元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_jin = time + (long) (20 * 60 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost3) {
                    return;
                }

                danData.concentratedJinCount--;
            }

            case "mu0" -> {
                long time = GetEntity.world.getGameTime();
                if (danData.cd_mu > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4木元素阵法冷却中,剩余§b" + (danData.cd_mu - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.muCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4木元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_mu = time + (long) (20 * 10 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost1) {
                    return;
                }

                danData.muCount--;

            }

            case "mu1" -> {
                if (!player.getScoreboardTags().contains("zhenfa2")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁精炼元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_mu > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4木元素阵法冷却中,剩余§b" + (danData.cd_mu - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.refinedMuCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4精炼木元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_mu = time + (long) (20 * 30 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost2) {
                    return;
                }

                danData.refinedMuCount--;

            }

            case "mu2" -> {
                if (!player.getScoreboardTags().contains("zhenfa3")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁浓缩元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_mu > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4木元素阵法冷却中,剩余§b" + (danData.cd_mu - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.concentratedMuCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4浓缩木元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_mu = time + (long) (20 * 150 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost3) {
                    return;
                }

                danData.concentratedMuCount--;

            }

            case "shui0" -> {

                long time = GetEntity.world.getGameTime();
                if (danData.cd_shui > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4水元素阵法冷却中,剩余§b" + (danData.cd_shui - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.shuiCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4水元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_shui = time + (long) (20 * 10 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost1) {
                    return;
                }

                danData.shuiCount--;

            }

            case "shui1" -> {
                if (!player.getScoreboardTags().contains("zhenfa2")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁精炼元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_shui > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4水元素阵法冷却中,剩余§b" + (danData.cd_shui - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.refinedShuiCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4精炼水元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_shui = time + (long) (20 * 30 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost2) {
                    return;
                }

                danData.refinedShuiCount--;


            }

            case "shui2" -> {
                if (!player.getScoreboardTags().contains("zhenfa3")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁浓缩元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_shui > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4水元素阵法冷却中,剩余§b" + (danData.cd_shui - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.concentratedShuiCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4浓缩水元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_shui = time + (long) (20 * 150 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost3) {
                    return;
                }

                danData.concentratedShuiCount--;

            }

            case "huo0" -> {
                long time = GetEntity.world.getGameTime();
                if (danData.cd_huo > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4火元素阵法冷却中,剩余§b" + (danData.cd_huo - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.huoCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4火元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_huo = time + (long) (20 * 10 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost1) {
                    return;
                }

                danData.huoCount--;

            }

            case "huo1" -> {
                if (!player.getScoreboardTags().contains("zhenfa2")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁精炼元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_huo > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4火元素阵法冷却中,剩余§b" + (danData.cd_huo - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.refinedHuoCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4精炼火元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_huo = time + (long) (20 * 30 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost2) {
                    return;
                }

                danData.refinedHuoCount--;
            }

            case "huo2" -> {
                if (!player.getScoreboardTags().contains("zhenfa3")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁浓缩元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_huo > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4火元素阵法冷却中,剩余§b" + (danData.cd_huo - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.concentratedHuoCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4浓缩火元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_huo = time + (long) (20 * 150 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost3) {
                    return;
                }

                danData.concentratedHuoCount--;

            }

            case "tu0" -> {
                long time = GetEntity.world.getGameTime();
                if (danData.cd_tu > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4土元素阵法冷却中,剩余§b" + (danData.cd_tu - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.tuCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4土元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_tu = time + (long) (20 * 10 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost1) {
                    return;
                }

                danData.tuCount--;

            }

            case "tu1" -> {
                if (!player.getScoreboardTags().contains("zhenfa2")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁精炼元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_tu > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4土元素阵法冷却中,剩余§b" + (danData.cd_tu - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.refinedTuCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4精炼土元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_tu = time + (long) (20 * 30 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost2) {
                    return;
                }

                danData.refinedTuCount--;

            }

            case "tu2" -> {
                if (!player.getScoreboardTags().contains("zhenfa3")) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4尚未解锁浓缩元素阵法"));
                    return;
                }
                long time = GetEntity.world.getGameTime();
                if (danData.cd_tu > time) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4土元素阵法冷却中,剩余§b" + (danData.cd_tu - GetEntity.world.getGameTime()) / 20.0 + "§4秒"));
                    return;
                }

                if (danData.concentratedTuCount < 1) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player, Component.text("§e[游戏机制]§4浓缩土元素不足"));
                    return;
                }

                DoJiNeng.doZhenfa(id, danData);

                danData.cd_tu = time + (long) (20 * 150 * danData.real_cool);

                //元素消耗
                if (random.nextDouble() < danData.noCost3) {
                    return;
                }

                danData.concentratedTuCount--;
            }


        }
    }

}
