package com.xiaoxiaoowo.yuehua.event.Projectile;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.Trident;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Launch implements Listener {

    @EventHandler
    public void onLaunch(ProjectileLaunchEvent e) {
        Projectile projectile = e.getEntity();
        switch (projectile.getType()) {
            case FISHING_BOBBER -> {
                Player player = (Player) projectile.getShooter();
                if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                    player.setHealth(0);
                    player.sendMessage(
                            Component.text("§e[游戏机制]§4试图逃离副本机制，你已被惩罚")
                    );
                }
            }

            case FIREBALL, WITHER_SKULL, SHULKER_BULLET, SMALL_FIREBALL,BREEZE_WIND_CHARGE -> {
                Entity entity = (Entity) projectile.getShooter();
                MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
                PersistentDataContainer pdc = projectile.getPersistentDataContainer();
                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, monsterData.attack);
                projectile.addScoreboardTag(monsterData.id);

            }

            case TRIDENT -> {
                Entity entity = (Entity) projectile.getShooter();
                MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
                Trident trident = (Trident) projectile;
                trident.setDamage(monsterData.attack);
                projectile.addScoreboardTag(monsterData.id);

            }


        }
    }


}
