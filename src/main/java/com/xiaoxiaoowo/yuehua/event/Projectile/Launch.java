package com.xiaoxiaoowo.yuehua.event.Projectile;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.persistence.PersistentDataType;

public final class Launch implements Listener {

    @EventHandler
    public void onLaunch(ProjectileLaunchEvent e) {
        Projectile projectile = e.getEntity();
        if (projectile.getType() == EntityType.FISHING_BOBBER) {
            Player player = (Player) projectile.getShooter();
            if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                player.setHealth(0);
                player.sendMessage(
                        Component.text("§e[游戏机制]§4试图逃离副本机制，你已被惩罚")
                );
            }
        }
    }


}
