package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import org.bukkit.event.entity.PlayerDeathEvent;

public final class DoDeath {
    public static void onDeath(String id, PlayerDeathEvent event, Data data){
        event.setCancelled(true);
        switch (id){

        }
    }
}
