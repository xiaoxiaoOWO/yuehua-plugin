package com.xiaoxiaoowo.yuehua.task.other;

import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.MoveEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.Collection;


public final class DrawProjectile extends BukkitRunnable {
    int num;
    Player player;
    double x;
    double y;
    double z;

    public DrawProjectile(int num, Player player, double x, double y, double z) {
        this.num = num;
        this.player = player;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public DrawProjectile(int num, Player player, double range) {
        this.num = num;
        this.player = player;
        this.x = range;
        this.y = range;
        this.z = range;
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

        Location playerLoc = player.getLocation();
        Collection<Entity> arrows = GetEntity.getArrowTrident(playerLoc, x, y, z);

        for (Entity arrow : arrows) {
            Projectile projectile = (Projectile) arrow;
            ProjectileSource source = projectile.getShooter();
            if (source == null) {
                continue;
            }
            Entity sourceEntity = (Entity) source;
            if (!sourceEntity.getScoreboardTags().contains("m")) {
                return;
            }

            Vector arrowVector = arrow.getVelocity();
            double speedNow = arrowVector.length();

            MoveEntity.changeEntityMoveDirection(arrow, playerLoc.getX(), playerLoc.getY(), playerLoc.getZ(), speedNow * 2);
        }

        num--;
    }
}
