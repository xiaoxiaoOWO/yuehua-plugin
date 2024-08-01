package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.LocationSet;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import static com.xiaoxiaoowo.yuehua.utils.LocationSet.*;

public final class Relife implements CommandExecutor {

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
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        int stoneCount = pdc.get(DataContainer.relifeStoneCount, PersistentDataType.INTEGER);

        //1->复活石，2->复活石种族，3->不用复活石
        switch (args[0]) {
            case "1" -> {
                if (stoneCount == 0) {
                    Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                        player.sendMessage(
                                Component.text("§6[重生存储]§4重生石不足")
                        );
                    });
                    return true;
                } else {
                    stoneCount--;
                    pdc.set(DataContainer.relifeStoneCount, PersistentDataType.INTEGER, stoneCount);
                }

                switch (pdc.get(DataContainer.relife, PersistentDataType.INTEGER)) {
                    case 0 -> {
                        switch (Yuehua.playerData.get(player.getUniqueId()).race) {
                            case 1 -> player.teleportAsync(LocationSet.TP_SHEN);
                            case 2 -> player.teleportAsync(LocationSet.TP_XIAN);
                            case 3 -> player.teleportAsync(LocationSet.TP_REN);
                            case 4 -> player.teleportAsync(LocationSet.TP_YAO);
                            case 5 -> player.teleportAsync(LocationSet.TP_ZHAN);
                        }
                    }

                    case 1 -> {
                        player.teleportAsync(MIDDLE);
                    }

                    case 2 -> player.teleportAsync(CHA_DIAN_TAN);

                    case 3 -> player.teleportAsync(SHA_MO_KE_ZHAN);

                    case 4 -> player.teleportAsync(BAI_HU_RU_KOU);

                    case 5 -> player.teleportAsync(SHUI_CUN);

                    case 6 -> player.teleportAsync(SHENG_SHAN);

                    case 7 -> player.teleportAsync(WEN_QUAN);
                }
            }

            case "2" -> {
                if (stoneCount == 0) {
                    Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                        player.sendMessage(
                                Component.text("§6[重生存储]§4重生石不足")
                        );
                    });
                    return true;
                } else {
                    stoneCount--;
                    pdc.set(DataContainer.relifeStoneCount, PersistentDataType.INTEGER, stoneCount);
                }
                switch (Yuehua.playerData.get(player.getUniqueId()).race) {
                    case 1 -> {
                        player.teleportAsync(TP_SHEN);
                    }
                    case 2 -> {
                        player.teleportAsync(TP_XIAN);
                    }
                    case 3 -> {
                        player.teleportAsync(TP_REN);
                    }
                    case 4 -> {
                        player.teleportAsync(TP_YAO);
                    }
                    case 5 -> {
                        player.teleportAsync(TP_ZHAN);
                    }
                }
            }

            case "3" -> {
                player.setExp(0);
                switch (Yuehua.playerData.get(player.getUniqueId()).race) {
                    case 1 -> {
                        player.teleportAsync(TP_SHEN);
                    }
                    case 2 -> {
                        player.teleportAsync(TP_XIAN);
                    }
                    case 3 -> {
                        player.teleportAsync(TP_REN);
                    }
                    case 4 -> {
                        player.teleportAsync(TP_YAO);
                    }
                    case 5 -> {
                        player.teleportAsync(TP_ZHAN);
                    }
                }
            }
        }


        return true;
    }
}
