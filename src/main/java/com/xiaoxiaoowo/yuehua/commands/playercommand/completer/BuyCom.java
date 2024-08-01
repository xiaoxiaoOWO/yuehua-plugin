package com.xiaoxiaoowo.yuehua.commands.playercommand.completer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class BuyCom implements org.bukkit.command.TabCompleter{
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch (args.length) {
            case 0,1 -> {
                return Collections.singletonList("输入你给出的价格，取值范围：1-2147483647");
            }
        }
        return null;
    }
}
