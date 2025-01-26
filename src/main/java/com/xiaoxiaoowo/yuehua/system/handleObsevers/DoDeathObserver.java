package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.World;
import org.bukkit.event.entity.PlayerDeathEvent;

import static com.xiaoxiaoowo.yuehua.event.player.ConsumeItem.*;

public final class DoDeathObserver {
    private static final World world = GetEntity.world;

    public static void onDeath(String id, PlayerDeathEvent event, Data data) {
        event.setCancelled(true);
        switch (id) {
            case "strength1" -> {
                data.deathObservers.remove("strength1");
                strength1.deAct(data, data.player.getPersistentDataContainer());
            }

            case "strength2" -> {
                data.deathObservers.remove("strength2");
                strength2.deAct(data, data.player.getPersistentDataContainer());
            }

            case "strength3" -> {
                data.deathObservers.remove("strength3");
                strength3.deAct(data, data.player.getPersistentDataContainer());
            }

            case "strength4" -> {
                data.deathObservers.remove("strength4");
                strength4.deAct(data, data.player.getPersistentDataContainer());
            }

            case "strength5" -> {
                data.deathObservers.remove("strength5");
                strength5.deAct(data, data.player.getPersistentDataContainer());
            }

        }
    }
}
