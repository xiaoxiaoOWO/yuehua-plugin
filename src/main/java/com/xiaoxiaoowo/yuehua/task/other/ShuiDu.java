package com.xiaoxiaoowo.yuehua.task.other;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class ShuiDu extends BukkitRunnable {
    int num;
    Player player;
    double damage;

    public ShuiDu(int num, Player player, double damage) {
        this.num = num;
        this.player = player;
        this.damage = damage;
    }

    @Override
    public void run() {
        if (num == 0) {
            this.cancel();
            return;
        }

        if (!player.isConnected()) {
            this.cancel();
            return;
        }

        //若这两个位置的方块属于水
        if (player.isInWater()) {
            player.damage(damage);
        }

        num--;
    }
}
