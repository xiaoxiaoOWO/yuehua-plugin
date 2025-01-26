package com.xiaoxiaoowo.yuehua.task.player;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.LocationCheck;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class BGM extends BukkitRunnable {
    Player player;
    Data data;

    public BGM(Data data) {
        this.player = data.player;
        this.data = data;
    }

    @Override
    public void run() {
        if (!player.isConnected()) {
            this.cancel();
            return;
        }

        if(GetEntity.world.getGameTime() - data.lastBGM < 20 * 4 * 60){
            return;
        }

        LocationCheck.check(player);
    }
}
