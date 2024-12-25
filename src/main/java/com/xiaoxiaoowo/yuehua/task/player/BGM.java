package com.xiaoxiaoowo.yuehua.task.player;

import com.xiaoxiaoowo.yuehua.utils.LocationCheck;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class BGM extends BukkitRunnable {
    Player player;

    public BGM(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        if (!player.isConnected()) {
            this.cancel();
            return;
        }

        LocationCheck.check(player);
    }
}
