package com.xiaoxiaoowo.yuehua.commands.playercommand.completer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public final class Yhteam implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch (args.length) {
            case 0, 1 -> {
                return List.of("create", "destroy", "join", "leave", "join", "accept", "refuse", "kick", "check");
            }
            case 2 -> {

                if (args[0].equals("join")) {
                    return Collections.singletonList("要加入队伍队长的名字");
                }

                if (args[0].equals("accept")) {
                    return Collections.singletonList("输入玩家名字");
                }

                if (args[0].equals("refuse")) {
                    return Collections.singletonList("输入玩家名字");
                }

                if (args[0].equals("kick")) {
                    return Collections.singletonList("输入玩家名字");
                }
            }

        }
        return null;
    }
}
