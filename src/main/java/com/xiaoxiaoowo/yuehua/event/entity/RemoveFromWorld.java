package com.xiaoxiaoowo.yuehua.event.entity;

import com.destroystokyo.paper.event.entity.EntityRemoveFromWorldEvent;
import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Set;
import java.util.UUID;

public final class RemoveFromWorld implements Listener {
    @EventHandler
    public void onRemoveFromWorld(EntityRemoveFromWorldEvent e) {
        Entity entity = e.getEntity();
        Set<String> tags = entity.getScoreboardTags();

        if (tags.contains("m")) {
            UUID uuid = entity.getUniqueId();
            Yuehua.monsterData.get(uuid).taskIds.forEach(it -> Yuehua.scheduler.cancelTask(it));
            Yuehua.monsterData.remove(uuid);
            return;
        }

        if (tags.contains("p")) {
            Scheduler.sync(() -> {
                UUID uuid = entity.getUniqueId();
                for (Entity entity1 : entity.getPassengers()) {
                    entity.removePassenger(entity1);
                    entity1.remove();
                }
                Yuehua.petData.get(uuid).taskIds.forEach(it -> Yuehua.scheduler.cancelTask(it));
                Yuehua.petData.remove(uuid);
                entity.remove();
            });
        }

    }
}
