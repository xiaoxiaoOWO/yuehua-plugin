package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public final class DropItem implements Listener {
    @EventHandler
    public void onDropItem(PlayerDropItemEvent e) {
        Material type = e.getItemDrop().getItemStack().getType();
        switch (type) {

        }
    }
}
