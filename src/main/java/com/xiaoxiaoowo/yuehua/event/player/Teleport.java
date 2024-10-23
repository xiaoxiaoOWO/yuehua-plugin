package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.utils.LocationCheck;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerTeleportEvent;

public final class Teleport implements org.bukkit.event.Listener {
    @EventHandler
    public void onTeleport(PlayerTeleportEvent e) {

        Scheduler.async(
                ()-> LocationCheck.check(e.getPlayer(),e.getTo())
        );
    }
}
