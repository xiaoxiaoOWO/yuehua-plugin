package com.xiaoxiaoowo.yuehua.commands.opcommand;

import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class A implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player){
            SendInformation.sendMes(player, Component.text("§6[命令系统]§4你没有权限使用这个命令"));
            return true;
        }
        Player player = Bukkit.getPlayer("xiaoxiaoOWO");
        player.addScoreboardTag("edit");

        return true;
    }
}
