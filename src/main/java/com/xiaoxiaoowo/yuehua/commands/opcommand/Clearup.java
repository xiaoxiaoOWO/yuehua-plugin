package com.xiaoxiaoowo.yuehua.commands.opcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;


public final class Clearup implements CommandExecutor {
    private static int count = 0;


    private static final Set<Material> materials = new HashSet<>() {
        {
            add(Material.CRAFTING_TABLE);
            add(Material.ENCHANTING_TABLE);
            add(Material.ANVIL);
            add(Material.GRINDSTONE);
            add(Material.CARTOGRAPHY_TABLE);
            add(Material.STONECUTTER);
            add(Material.LOOM);
            add(Material.SMITHING_TABLE);
            add(Material.CHEST);
            add(Material.SHULKER_BOX);
            add(Material.BARREL);
            add(Material.TRAPPED_CHEST);
            add(Material.FURNACE);
            add(Material.SMOKER);
            add(Material.BLAST_FURNACE);
            add(Material.BREWING_STAND);
            add(Material.DISPENSER);
            add(Material.DROPPER);
            add(Material.HOPPER);
            add(Material.CRAFTER);
            add(Material.SPAWNER);
        }
    };

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if (!player.isOp()) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
                return true;
            }
            Yuehua.syncTimer(
                    () -> {
                        World world = GetEntity.world;
                        Location location = player.getLocation();
                        int x = location.blockX();
                        int z = location.blockZ();
                        for (int dx = x - 100; dx < x + 100; dx++) {
                            for (int dy = -64; dy < 256; dy++) {
                                for (int dz = z - 100; dz < z + 100; dz++) {
                                    Block block = world.getBlockAt(dx, dy, dz);
                                    if (materials.contains(block.getType())) {
                                        block.setType(Material.AIR);
                                        count++;
                                        Bukkit.broadcastMessage("§b清理了" + count + "个容器");
                                    }

                                }
                            }
                        }
                        Bukkit.broadcastMessage("§6完成一次清理");
                    }
                    , 0, 40);
        }

        return true;
    }
}
