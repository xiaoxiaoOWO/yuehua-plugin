package com.xiaoxiaoowo.yuehua.event.block;

import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CauldronLevelChangeEvent;


public final class CauldronLevelChange implements Listener {
    @EventHandler
    public void onChange(CauldronLevelChangeEvent event) {
        event.setCancelled(true);
        Entity entity = event.getEntity();
        if (entity != null) {
            if (entity instanceof Player player) {
                player.setHealth(0);
                SendInformation.sendMes(player, Component.text("§e[游戏机制]§4不能洗掉皮革颜色！"));
            }
        }
    }
}
