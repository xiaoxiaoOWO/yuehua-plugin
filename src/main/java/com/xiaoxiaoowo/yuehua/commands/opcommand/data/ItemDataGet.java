package com.xiaoxiaoowo.yuehua.commands.opcommand.data;

import de.tr7zw.nbtapi.NBT;
import de.tr7zw.nbtapi.NBTItem;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemDataGet implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (!player.isOp()) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
                return true;
            }

            if (args.length != 1) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4参数错误")
                );
                return true;
            }

            int slot = Integer.parseInt(args[0]);

            ItemStack item = player.getInventory().getItem(slot);
            if (item == null || item.getType() == Material.AIR) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4这个格子没有物品")
                );
                return true;
            }

            player.sendMessage(
                    Component.text("§6[命令系统]§a" + NBTItem.convertItemtoNBT(item).toString())
            );
        }
        return true;
    }
}
