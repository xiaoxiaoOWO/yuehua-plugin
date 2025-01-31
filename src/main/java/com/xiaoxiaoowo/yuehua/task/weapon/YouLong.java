package com.xiaoxiaoowo.yuehua.task.weapon;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Cure;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class YouLong extends BukkitRunnable {
    Player player;
    Data data;
    int num;
    public YouLong(Data data) {
        this.num = 5;
        this.data = data;
        this.player = data.player
        ;
    }

    @Override
    public void run() {
        if (num == 0) {
            this.cancel();
            return;
        }

        if (!data.player.isConnected()) {
            this.cancel();
            return;
        }

        if (player.isInWater()) {
            Cure.curePlayer(0.01 * player.getAttribute(Attribute.MAX_HEALTH).getValue() + 10,data);
        }

        num--;

    }
}
