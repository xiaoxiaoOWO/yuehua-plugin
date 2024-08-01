package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
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
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public final class RenOu2 implements CommandExecutor {
    private static Zombie zombie;
    private static Location location;


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
            });
            return true;
        }


        if (zombie == null || zombie.isDead()) {
            BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
            Location location1 = blockCommandSender.getBlock().getLocation();
            for (Entity entity : GetEntity.getMonsters(location1, 4, 4, 4)) {
                if (entity instanceof Zombie zombie1) {
                    if(zombie1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING).equals("renou2")){
                        zombie = zombie1;
                        break;
                    }
                }
            }
            if (zombie == null) {
                return true;
            }
            location = zombie.getLocation();
        } else {
            double hp = zombie.getHealth();
            zombie.setHealth(1000000);
            double damage = 1000000 - hp;
            if (damage < 1e-6) {
                return true;
            }
            for (Entity entity : GetEntity.getPlayers(location, 8, 8, 3)) {
                Player player = (Player) entity;
                Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                    player.sendMessage(
                            Component.text("§6[测伤潇潇]§a伤害为: ")
                                    .append(Component.text(damage).color(NamedTextColor.AQUA))

                    );
                });
            }
        }
        return true;
    }
}
