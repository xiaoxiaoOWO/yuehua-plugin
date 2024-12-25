package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.World;
import org.bukkit.event.entity.PlayerDeathEvent;

public final class DoDeathObserver {
    private static final World world = GetEntity.world;

    public static void onDeath(String id, PlayerDeathEvent event, Data data) {
        event.setCancelled(true);
        switch (id) {

        }
    }
}
