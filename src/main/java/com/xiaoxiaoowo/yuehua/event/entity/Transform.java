package com.xiaoxiaoowo.yuehua.event.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTransformEvent;

public final class Transform implements Listener {
    @EventHandler
    public void onTransform(EntityTransformEvent e) {
        e.setCancelled(true);
    }

}
