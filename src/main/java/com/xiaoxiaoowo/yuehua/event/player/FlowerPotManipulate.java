package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.event.player.PlayerFlowerPotManipulateEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public final class FlowerPotManipulate implements Listener {

    @EventHandler
    public void onFlowerPotManipulate(PlayerFlowerPotManipulateEvent e) {
        e.setCancelled(true);
        Player player = e.getPlayer();
        SendInformation.sendMes(player, Component.text("§e[游戏机制]§4不能当采花大盗"));
        player.setHealth(0);
    }
}
