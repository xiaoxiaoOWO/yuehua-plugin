package com.xiaoxiaoowo.yuehua.commands.opcommand;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import com.xiaoxiaoowo.yuehua.Yuehua;

import net.kyori.adventure.text.Component;

public final class SetSign implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
            @NotNull String[] args) {
        Player player = (Player) sender;
        if (!player.isOp()) {
            player.sendMessage(
                    Component.text("§6[命令系统]§4你没有权限使用这个命令"));
            return true;
        }

        if (args.length != 2) {
            player.sendMessage(
                    Component.text("§6[命令系统]§4参数错误")

            );
            return true;
        }

        Block block = player.getTargetBlock(null, 10);
        Location loc = block.getLocation();
        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();

        switch (args[0]) {
            case "1" -> Bukkit.dispatchCommand(Yuehua.console,
                    String.format("data modify block %d %d %d front_text.messages[0] set value '{\"text\":\"%s\"}'", x,
                            y, z, args[1]));
            case "2" -> Bukkit.dispatchCommand(Yuehua.console,
                    String.format("data modify block %d %d %d front_text.messages[1] set value '{\"text\":\"%s\"}'", x,
                            y, z, args[1]));
            case "3" -> Bukkit.dispatchCommand(Yuehua.console,
                    String.format("data modify block %d %d %d front_text.messages[2] set value '{\"text\":\"%s\"}'", x,
                            y, z, args[1]));
            case "4" -> Bukkit.dispatchCommand(Yuehua.console,
                    String.format("data modify block %d %d %d front_text.messages[3] set value '{\"text\":\"%s\"}'", x,
                            y, z, args[1]));
        }

        return true;
    }
}
