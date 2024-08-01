package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Team;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public final class Select implements CommandExecutor {

    private static final Location TP = new Location(GetEntity.world, 1316, 63, 42, 90, 0);
    private static final Location TO_FINAL = new Location(GetEntity.world, 1202, 27, -380, -90, 0);
    private static final Location RE_SELECT = new Location(GetEntity.world, 1312, 76, 43);
    private static final Location BACK_TO_SELECT_JOB = new Location(GetEntity.world, 1316, 65, 42, 90, 0);

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance,()->{
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
            });
            return true;
        }
        if (args.length != 2) {
            return true;
        }


        BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
        Location location = blockCommandSender.getBlock().getLocation();
        Player player = GetEntity.getNearestPlayer(location, 3, 3, 3);
        if (player == null) {
            return true;
        }
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();

        switch (args[0]) {
            case "race" -> {
                persistentDataContainer.set(DataContainer.job, PersistentDataType.INTEGER, 0);
                persistentDataContainer.remove(DataContainer.arrow);
                persistentDataContainer.remove(DataContainer.arrow_add);
                persistentDataContainer.remove(DataContainer.arrow_mul);
                persistentDataContainer.remove(DataContainer.arrow_count);
                persistentDataContainer.remove(DataContainer.arrow_count_max);
                persistentDataContainer.remove(DataContainer.arrow_no_cost);
                persistentDataContainer.remove(DataContainer.arrow_pierce);
                persistentDataContainer.remove(DataContainer.is_bow);
                persistentDataContainer.remove(DataContainer.time_charging);
                persistentDataContainer.remove(DataContainer.zhenfa);
                persistentDataContainer.remove(DataContainer.zhenfa_add);
                persistentDataContainer.remove(DataContainer.zhenfa_mul);
                persistentDataContainer.remove(DataContainer.no_cost_1);
                persistentDataContainer.remove(DataContainer.no_cost_2);
                persistentDataContainer.remove(DataContainer.no_cost_3);
                persistentDataContainer.remove(DataContainer.slot3);
                persistentDataContainer.remove(DataContainer.slot4);
                persistentDataContainer.remove(DataContainer.slot5);
                Team.playerTeam.addPlayer(player);
                switch (args[1]) {
                    //初始化
                    case "shen" -> {
                        persistentDataContainer.set(DataContainer.race, PersistentDataType.INTEGER, 1);
                    }
                    case "xian" -> {
                        persistentDataContainer.set(DataContainer.race, PersistentDataType.INTEGER, 2);

                    }
                    case "ren" -> {
                        persistentDataContainer.set(DataContainer.race, PersistentDataType.INTEGER, 3);

                    }
                    case "yao" -> {
                        persistentDataContainer.set(DataContainer.race, PersistentDataType.INTEGER, 4);

                    }
                    case "zhan" -> {
                        persistentDataContainer.set(DataContainer.race, PersistentDataType.INTEGER, 5);
                    }
                }
                player.teleportAsync(TP);

            }
            case "job" -> {
                switch (args[1]) {

                    case "zhan" -> persistentDataContainer.set(DataContainer.job, PersistentDataType.INTEGER, 1);

                    case "gong" -> {
                        persistentDataContainer.set(DataContainer.job, PersistentDataType.INTEGER, 2);
                        persistentDataContainer.set(DataContainer.arrow, PersistentDataType.DOUBLE, 0.0);
                        persistentDataContainer.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, 0.0);
                        persistentDataContainer.set(DataContainer.arrow_mul, PersistentDataType.DOUBLE, 1.0);
                        persistentDataContainer.set(DataContainer.arrow_count, PersistentDataType.INTEGER, 0);
                        persistentDataContainer.set(DataContainer.arrow_count_max, PersistentDataType.INTEGER, 0);
                        persistentDataContainer.set(DataContainer.arrow_no_cost,PersistentDataType.DOUBLE,0.0);
                        persistentDataContainer.set(DataContainer.arrow_pierce,PersistentDataType.DOUBLE,0.0);
                        persistentDataContainer.set(DataContainer.is_bow,PersistentDataType.BOOLEAN,true);
                        persistentDataContainer.set(DataContainer.time_charging,PersistentDataType.LONG,GetEntity.world.getGameTime());

                    }
                    case "dan" -> {
                        persistentDataContainer.set(DataContainer.job, PersistentDataType.INTEGER, 3);
                        persistentDataContainer.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, 0.0);
                        persistentDataContainer.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, 0.0);
                        persistentDataContainer.set(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE, 1.0);
                        persistentDataContainer.set(DataContainer.no_cost_1,PersistentDataType.DOUBLE, 0.0);
                        persistentDataContainer.set(DataContainer.no_cost_2,PersistentDataType.DOUBLE, 0.0);
                        persistentDataContainer.set(DataContainer.no_cost_3,PersistentDataType.DOUBLE, 0.0);
                        persistentDataContainer.set(DataContainer.slot3, PersistentDataType.STRING, "null");
                        persistentDataContainer.set(DataContainer.slot4, PersistentDataType.STRING, "null");
                        persistentDataContainer.set(DataContainer.slot5, PersistentDataType.STRING, "null");
                    }
                }
                player.teleportAsync(TO_FINAL);
            }
            case "other" -> {

                switch (args[1]) {
                    case "backToSelectJob" -> {
                        persistentDataContainer.set(DataContainer.job, PersistentDataType.INTEGER, 0);
                        persistentDataContainer.remove(DataContainer.arrow);
                        persistentDataContainer.remove(DataContainer.arrow_add);
                        persistentDataContainer.remove(DataContainer.arrow_mul);
                        persistentDataContainer.remove(DataContainer.arrow_count);
                        persistentDataContainer.remove(DataContainer.arrow_count_max);
                        persistentDataContainer.remove(DataContainer.arrow_no_cost);
                        persistentDataContainer.remove(DataContainer.arrow_pierce);
                        persistentDataContainer.remove(DataContainer.is_bow);
                        persistentDataContainer.remove(DataContainer.time_charging);
                        persistentDataContainer.remove(DataContainer.zhenfa);
                        persistentDataContainer.remove(DataContainer.zhenfa_add);
                        persistentDataContainer.remove(DataContainer.zhenfa_mul);
                        persistentDataContainer.remove(DataContainer.no_cost_1);
                        persistentDataContainer.remove(DataContainer.no_cost_2);
                        persistentDataContainer.remove(DataContainer.no_cost_3);
                        persistentDataContainer.remove(DataContainer.slot3);
                        persistentDataContainer.remove(DataContainer.slot4);
                        persistentDataContainer.remove(DataContainer.slot5);
                        player.teleportAsync(BACK_TO_SELECT_JOB);
                    }
                    case "reSelect" -> {
                        persistentDataContainer.set(DataContainer.job, PersistentDataType.INTEGER, 0);
                        persistentDataContainer.set(DataContainer.race, PersistentDataType.INTEGER, 0);
                        persistentDataContainer.remove(DataContainer.arrow);
                        persistentDataContainer.remove(DataContainer.arrow_add);
                        persistentDataContainer.remove(DataContainer.arrow_mul);
                        persistentDataContainer.remove(DataContainer.arrow_count);
                        persistentDataContainer.remove(DataContainer.arrow_count_max);
                        persistentDataContainer.remove(DataContainer.arrow_no_cost);
                        persistentDataContainer.remove(DataContainer.arrow_pierce);
                        persistentDataContainer.remove(DataContainer.is_bow);
                        persistentDataContainer.remove(DataContainer.time_charging);
                        persistentDataContainer.remove(DataContainer.zhenfa);
                        persistentDataContainer.remove(DataContainer.zhenfa_add);
                        persistentDataContainer.remove(DataContainer.zhenfa_mul);
                        persistentDataContainer.remove(DataContainer.no_cost_1);
                        persistentDataContainer.remove(DataContainer.no_cost_2);
                        persistentDataContainer.remove(DataContainer.no_cost_3);
                        persistentDataContainer.remove(DataContainer.slot3);
                        persistentDataContainer.remove(DataContainer.slot4);
                        persistentDataContainer.remove(DataContainer.slot5);
                        player.teleportAsync(RE_SELECT);
                    }
                    case "toFinal" -> player.teleportAsync(TO_FINAL);

                }
            }
        }


        return true;
    }
}
