package com.xiaoxiaoowo.yuehua.commands.opcommand;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public final class PerGet implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (!player.isOp()) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
                return true;
            }
            PersistentDataContainer pdc;
            if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);
                pdc = target.getPersistentDataContainer();
            } else {
                pdc = player.getPersistentDataContainer();
            }


            pdc.getKeys().forEach(it -> {
                switch (it.getKey()) {
                    case "slot0", "slot1", "slot2", "slot3", "slot4", "slot5", "slot8", "slot36", "slot37", "slot38", "slot39", "slot40",
                            "eslot0", "eslot1", "eslot2", "eslot3", "eslot4", "eslot5", "eslot6", "eslot7", "yhteam" ->
                            player.sendMessage(
                                    Component.text("§6[命令系统]§a" + it.getKey() + ": §b" + pdc.get(it, PersistentDataType.STRING))
                            );

                    case "cool_reduce", "hujia", "pojia", "fakang", "pofa", "gedang", "baoji", "baojixiaoguo", "renxing", "shengji",
                            "attack", "attack_add", "attack_mul", "arrow", "arrow_add", "arrow_mul", "zhenfa", "zhenfa_add", "zhenfa_mul",
                            "no_cost_1", "no_cost_2", "no_cost_3", "dumian", "huomian", "bingmian", "jianmian", "shuailuomian", "sanchajimian",
                            "arrow_no_cost", "arrow_pierce", "shouhu", "cool_reduce_unlimited" -> player.sendMessage(
                            Component.text("§6[命令系统]§a" + it.getKey() + ": §b" + pdc.get(it, PersistentDataType.DOUBLE))
                    );


                    case "chonghuacd", "time_charging" -> player.sendMessage(
                            Component.text("§6[命令系统]§a" + it.getKey() + ": §b" + pdc.get(it, PersistentDataType.LONG))
                    );


                    case "is_bow" -> player.sendMessage(
                            Component.text("§6[命令系统]§a" + it.getKey() + ": §b" + pdc.get(it, PersistentDataType.BOOLEAN))
                    );
                    default -> player.sendMessage(
                            Component.text("§6[命令系统]§a" + it.getKey() + ": §b" + pdc.get(it, PersistentDataType.INTEGER))
                    );

                }
            });

        }
        return true;
    }
}
