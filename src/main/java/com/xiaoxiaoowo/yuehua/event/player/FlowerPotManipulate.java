package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import io.papermc.paper.event.player.PlayerFlowerPotManipulateEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public final class FlowerPotManipulate implements Listener {

    @EventHandler
    public void onFlowerPotManipulate(PlayerFlowerPotManipulateEvent e) {
        e.setCancelled(true);
        Player player = e.getPlayer();
        Yuehua.sendMes(Component.text("§e[游戏机制]§4不能当采花大盗"),player);
        player.setHealth(0);
    }
}
