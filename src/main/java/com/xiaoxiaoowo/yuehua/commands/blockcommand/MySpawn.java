package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public final class MySpawn implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        int timeIndex = Integer.parseInt(args[0]);
        if ((GetEntity.world.getGameTime() % 200) == timeIndex) {
            if (sender instanceof Player player) {
                Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                    player.sendMessage(
                            Component.text("§6[命令系统]§4你没有权限使用这个命令")
                    );
                });
                return true;
            }
            Location location = ((BlockCommandSender) sender).getBlock().getLocation().add(0, 2, 0);
            Collection<Entity> players = GetEntity.getPlayers(location,10,10,10);

            if (players.isEmpty()) {
                return true;
            }

            switch (args[1]) {

            }
        }


        return true;
    }
}
