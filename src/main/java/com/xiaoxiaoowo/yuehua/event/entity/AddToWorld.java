package com.xiaoxiaoowo.yuehua.event.entity;

import com.destroystokyo.paper.event.entity.EntityAddToWorldEvent;
import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;


public final class AddToWorld implements Listener {
    @EventHandler
    public void onAddToWorld(EntityAddToWorldEvent e) {
        Entity entity = e.getEntity();
        if (!entity.getScoreboardTags().contains("m")) {
            return;
        }

        PersistentDataContainer pdc = entity.getPersistentDataContainer();
        switch (pdc.get(DataContainer.id, PersistentDataType.STRING)) {
            case "renou" -> Yuehua.monsterData.put(entity.getUniqueId(), new MonsterData(0, 0, 0, 0, 10, 1, "renou"));
            case "renou2" -> Yuehua.monsterData.put(entity.getUniqueId(), new MonsterData(0, 1.5, 1.5, 0, 10, 1, "renou2"));
            case "test" -> Yuehua.monsterData.put(entity.getUniqueId(), new MonsterData(2, 0, 0, 0, 0, 1, "test"));


        }
    }
}
