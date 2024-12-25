package com.xiaoxiaoowo.yuehua.commands.opcommand;

import com.xiaoxiaoowo.yuehua.utils.SQL;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class MySave implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (!player.isOp()) {
            player.sendMessage(
                    Component.text("§6[命令系统]§4你没有权限使用这个命令")
            );
            return true;
        }

        Scheduler.async(SQL::storeRecipe);
        return true;
    }
}
