package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithTwoActiveSkill;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.DoJiNeng;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoJiNengObservers;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.util.Vector;


public final class Interact implements Listener {
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
                                    Location location = player.getLocation();
                                    gongData.startPitch = location.getPitch();
                                    gongData.startYaw = location.getYaw();
                                } else {
                                    e.setCancelled(true);
                                    Scheduler.async(() -> player.sendMessage(
                                            Component.text("§e[游戏机制]§4只能用一号位使用弓哦").color(NamedTextColor.DARK_RED)
                                    ));
                                }
                            } else {
                                player.getInventory().setItemInMainHand(null);
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
                                player.getInventory().setItemInMainHand(null);
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

                        case KELP -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job != 3) {
                                return;
                            }
                            String id = item.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                            zhenfa(id, (DanData) data);

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
                            Vector direction = player.getEyeLocation().getDirection();
                            direction = direction.multiply(10);
                            double x = player.getX();
                            double y = player.getY();
                            double z = player.getZ();
                            MoveEntity.continueForce(player,x+direction.getX(),y+direction.getY(),z+direction.getZ());
                        }

                        case SHIELD -> {
                            Player player = e.getPlayer();
                            Data data = Yuehua.playerData.get(player.getUniqueId());
                            if (data.job != 1) {
                                player.getInventory().setItemInMainHand(null);
                            } else {
                                e.setCancelled(true);
                            }
                        }

                        case WOODEN_PICKAXE -> {

                        }

                        case FISHING_ROD -> {
                            Player player = e.getPlayer();
                            if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                                player.setHealth(0);
                                player.sendMessage(
                                        Component.text("§e[游戏机制]§4试图逃离副本机制，你已被惩罚")
                                );
                            }
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
                                player.getInventory().setItemInOffHand(null);
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
                                player.getInventory().setItemInOffHand(null);
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
                                player.getInventory().setItemInOffHand(null);
                            }
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
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4只有在激活位才能释放技能"));
            return;
        }

        if (!zhanData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }

        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
                    return;
                }
                DoJiNeng.doJiNengZhan2(slotWithTwoActiveSkill.id, zhanData);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
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
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4只有在激活位才能释放技能"));
            return;
        }

        if (!danData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }
        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                    SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
                    return;
                }
                DoJiNeng.doJiNengDan2(slotWithTwoActiveSkill.id, danData);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
          SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
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
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4只有在激活位才能释放技能"));
            return;
        }

        if (!gongData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }

        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                  SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
                    return;
                }
                DoJiNeng.doJiNengGong2(slotWithTwoActiveSkill.id, gongData);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
          SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
            return;
        }
        DoJiNeng.doJiNengGong(slotWithOneActiveSkill.id, gongData);

    }

    private static void rightClickAll(Data data) {
        Player player = data.player;
        SlotWithOneActiveSkill slotWithOneActiveSkill = data.slot8;

        if (!data.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }

        if (player.isSneaking()) {
            if (slotWithOneActiveSkill instanceof SlotWithTwoActiveSkill slotWithTwoActiveSkill) {
                long cd = slotWithTwoActiveSkill.cd_active2 - GetEntity.world.getGameTime();
                if (cd > 0) {
                    PlaySound.fail(player);
                  SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
                    return;
                }
                DoJiNeng.doJiNeng2(slotWithTwoActiveSkill.id, data);
                return;
            }
        }

        long cd = slotWithOneActiveSkill.cd_active - GetEntity.world.getGameTime();
        if (cd > 0) {
            PlaySound.fail(player);
          SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4技能冷却中,剩余§b"+cd+"§4秒"));
            return;
        }
        DoJiNeng.doJiNeng(slotWithOneActiveSkill.id,data);
    }


    private static void zhenfa(String id, DanData danData) {
        Player player = danData.player;
        if (!danData.canJiNeng) {
            PlaySound.fail(player);
            SendInformation.sendActionBar(player,Component.text("§e[游戏机制]§4你被禁魔了，无法使用技能"));
            return;
        }

        switch (id) {
        }
    }

}
