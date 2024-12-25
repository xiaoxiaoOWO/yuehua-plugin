package com.xiaoxiaoowo.yuehua.event.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.CauldronLevelChangeEvent;

public final class Ingite implements Listener {

    @EventHandler
    public void onIngite(BlockIgniteEvent event){
        event.setCancelled(true);
    }
}
