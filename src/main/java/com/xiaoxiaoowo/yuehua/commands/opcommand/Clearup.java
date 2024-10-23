package com.xiaoxiaoowo.yuehua.commands.opcommand;

import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
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
            Scheduler.syncTimer(
                    () -> {
                        for(Entity entity : GetEntity.world.getEntities()){
                            if(entity instanceof Player){
                                continue;
                            }
                            entity.remove();
                        }
                    }
                    , 0, 1);
        }

        return true;
    }
}
