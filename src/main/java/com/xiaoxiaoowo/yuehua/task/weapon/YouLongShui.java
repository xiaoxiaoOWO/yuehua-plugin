package com.xiaoxiaoowo.yuehua.task.weapon;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Cure;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class YouLongShui extends BukkitRunnable {
    Data data;
    Player player;
    double x;
    double y;
    double z;
    int num;

    public YouLongShui(Data data, Location location) {
        this.num = 5;
        this.data = data;
        this.player = data.player;
        this.x = location.getX();
        this.y = location.getY();
        this.z = location.getZ();
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

        Location playerLoc = player.getLocation();
        double pX = playerLoc.getX();
        double pY = playerLoc.getY();
        double pZ = playerLoc.getZ();

        //如果x,z相差绝对值小于1.5,y相差绝对值小于0.5
        if (Math.abs(x - pX) < 1.5 && Math.abs(z - pZ) < 1.5 && Math.abs(y - pY) < 0.5) {
            Cure.curePlayer(0.01 * player.getAttribute(Attribute.MAX_HEALTH).getValue() + 10, data);
        }


        num--;
    }
}
