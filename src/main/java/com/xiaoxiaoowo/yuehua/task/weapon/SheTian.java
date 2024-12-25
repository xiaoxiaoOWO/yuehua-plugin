package com.xiaoxiaoowo.yuehua.task.weapon;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class SheTian extends BukkitRunnable {
    Data data;
    Player player;

    public SheTian(Data data) {
        this.data = data;
        player = data.player;
    }

    @Override
    public void run() {
        long timeNow = GetEntity.world.getGameTime();
        long timeEnd = (long) data.extraData.get("shetianpinyi");
        if (timeEnd <= timeNow) {
            this.cancel();
            return;
        }

        //熄灭玩家的着火状态
        player.setFireTicks(0);
    }
}
