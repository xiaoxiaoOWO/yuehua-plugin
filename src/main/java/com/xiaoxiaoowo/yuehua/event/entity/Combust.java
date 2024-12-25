package com.xiaoxiaoowo.yuehua.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;
import org.bukkit.event.inventory.TradeSelectEvent;

public final class Combust implements Listener {

    @EventHandler
    public void onCombust(EntityCombustEvent e) {
        Entity entity = e.getEntity();
        if(entity.getType() != EntityType.PLAYER){
            e.setCancelled(true);
        }
    }
}
