package com.xiaoxiaoowo.yuehua.commands.playercommand.completer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public final class MoneyCom implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch (args.length) {
            case 0, 1 -> {
                return List.of("store", "get", "check", "pay");
            }
            case 2 -> {

                if (args[0].equals("pay")) {
                    return Collections.singletonList("玩家名");
                }

                if (args[0].equals("store")) {
                    return List.of("铜钱", "银元宝", "金元宝", "银票");
                }

                if (args[0].equals("get")) {
                    return List.of("铜钱", "银元宝", "金元宝", "银票");
                }


            }
            case 3 -> {

                if (args[0].equals("pay")) {
                    return Collections.singletonList("输入1-2147483647");
                }

                if (args[0].equals("store")) {
                    return Collections.singletonList("输入1-2000");
                }

                if (args[0].equals("get")) {
                    return Collections.singletonList("输入1-2000");
                }
            }
        }

        return null;
    }
}
