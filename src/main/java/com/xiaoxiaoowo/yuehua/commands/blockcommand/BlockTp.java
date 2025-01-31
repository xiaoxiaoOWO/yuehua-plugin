package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.LocationSet;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.persistence.PersistentDataContainerView;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public final class BlockTp implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
            });
            return true;
        }

        BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
        Location location = blockCommandSender.getBlock().getLocation();

        Player player = GetEntity.getNearestPlayer(location, 5, 5, 5);
        if (player == null) {
            return true;
        }
        switch (args[0]) {
            case "laojun" -> {
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("guiyu")) {
                    if (itemStack.getAmount() == 10) {
                        player.teleport(new Location(GetEntity.world, 336.5, 33, -719.5, 0, 0));
                        player.getInventory().setItemInMainHand(null);
                    }
                }
            }


            case "xuanwu" -> {
                if (player.getScoreboardTags().contains("xuanwu")) {
                    player.teleportAsync(LocationSet.BLOCK_TP_XUAN_WU);
                } else {
                    SendInformation.sendMes(player, Component.text("§6[玄武准许]§4你还没有获得玄武的准许"));
                }
            }

            case "xinqitian" -> {
                PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
                switch (persistentDataContainer.get(DataContainer.xinqitian, PersistentDataType.INTEGER)) {
                    case 0 -> {
                        ItemStack itemStack = player.getInventory().getItemInMainHand();
                        PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                        if (!persistentDataContainerView.has(DataContainer.id)) {
                            return true;
                        }

                        if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("maikefeng")) {
                            player.teleport(new Location(GetEntity.world, 166.5, 12, 163.5, 90, 0));
                            persistentDataContainer.set(DataContainer.xinqitian, PersistentDataType.INTEGER, 1);
                            player.getInventory().setItemInMainHand(null);
                        }
                    }

                    case 1 -> player.teleport(new Location(GetEntity.world, 166.5, 12, 163.5, 90, 0));
                    case 2 -> player.teleport(new Location(GetEntity.world, 168.5, 12, 137.5, 90, 0));
                    case 3 -> player.teleport(new Location(GetEntity.world, 167.5, 47, 162.5, 90, 0));
                }
            }

            case "jianyi" -> {
                if (player.getScoreboardTags().contains("jianyi")) {
                    player.teleport(new Location(GetEntity.world, 1351.5, 38, 506.5));
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                player.addScoreboardTag("jianyi");

                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 32);

                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, 1351.5, 38, 506.5));
                SendInformation.sendMes(player, Component.text("§e[支线任务]§a对天道有所感悟,你的最大生命值增加了§b32§a！"));
            }

            case "yuzhu" -> {
                if (player.getScoreboardTags().contains("yuzhuzijue")) {
                    player.teleport(new Location(GetEntity.world, -316.5, 115, -422.5));
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                player.addScoreboardTag("yuzhuzijue");

                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 32);

                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, -316.5, 115, -422.5));
                SendInformation.sendMes(player, Component.text("§e[支线任务]§a雨竹：谢谢你,不好意思让你看我哭了那么久.我要去追随盟主的脚步了,有缘再见吧.你的最大生命值增加了§b32§a！"));
            }

            case "zhanzhixian" -> {
                if (player.getScoreboardTags().contains("racezhixian")) {
                    player.teleport(new Location(GetEntity.world, 283, 44, -7));
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                player.addScoreboardTag("racezhixian");

                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 32);

                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, 283, 44, -7));
                SendInformation.sendMes(player, Component.text("§e[支线任务]§a由于和武师战斗,你的最大生命值增加了§b32§a！"));
            }

            case "shenzhixian" -> {
                if (player.getScoreboardTags().contains("racezhixian")) {
                    player.teleport(new Location(GetEntity.world, -677, 139, 357));
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                player.addScoreboardTag("racezhixian");

                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 32);

                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, -677, 139, 357));
                SendInformation.sendMes(player, Component.text("§e[支线任务]§a由于帮助芊无,你的最大生命值增加了§b32§a！"));
            }

            case "yaozhixian" -> {
                if (player.getScoreboardTags().contains("racezhixian")) {
                    player.teleport(new Location(GetEntity.world, 7, 48, 828));
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                player.addScoreboardTag("racezhixian");

                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 32);

                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, 7, 48, 828));
                SendInformation.sendMes(player, Component.text("§e[支线任务]§a由于帮助神木妖精,你的最大生命值增加了§b32§a！"));
            }


            case "renhide" -> {
                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, -120.5, 46, 139.5));
                player.getInventory().addItem(PINZHENG.finishRenHide);
            }

            case "shenhide" -> {
                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, 119.5, 49, 812.5));
                player.getInventory().addItem(PINZHENG.finishShenHide);
            }

            case "yaohide" -> {
                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, 336.5, 33, -719.5, 0, 0));
                player.getInventory().addItem(PINZHENG.finishYaoHide);
            }

            case "zhanshenhide" -> {
                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, -677, 139, 357));
                player.getInventory().addItem(PINZHENG.finishZhanHide);
            }

            case "yuzhuhide" -> {
                PlaySound.success(player);
                player.teleport(new Location(GetEntity.world, -316.5, 115, -422.5));
                player.getInventory().addItem(PINZHENG.finishXianHide);
            }

            case "yaozhenyaota" -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data.race == 4) {
                    player.teleport(new Location(GetEntity.world, -205.5, 148, -181.5, -90, 0));
                }
            }
            case "zhenyaotaout" -> player.teleport(new Location(GetEntity.world, -222.5, 64, -179.5, 90, 0));
        }

        return true;
    }
}
