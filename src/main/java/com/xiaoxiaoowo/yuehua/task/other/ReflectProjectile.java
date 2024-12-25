package com.xiaoxiaoowo.yuehua.task.other;

import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.MoveEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class ReflectProjectile extends BukkitRunnable {
    int num;
    Player player;
    double x;
    double y;
    double z;
    Set<Entity> entities = new HashSet<>();

    public ReflectProjectile(int num, Player player, double x, double y, double z){
        this.num = num;
        this.player = player;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public ReflectProjectile(int num,Player player,double range){
        this.num = num;
        this.player = player;
        this.x = range;
        this.y = range;
        this.z = range;
    }


    @Override
    public void run() {
        if(num == 0){
            this.cancel();
            return;
        }

        if (!player.isConnected()) {
            this.cancel();
            return;
        }

        Collection<Entity> unfiltered = GetEntity.getArrowTrident(player.getLocation(),x,y,z);

        for (Entity arrow : unfiltered){
            Projectile projectile = (Projectile) arrow;
            ProjectileSource source = projectile.getShooter();
            if(source == null){
                continue;
            }

            Entity sourceEntity = (Entity) source;

            if(!sourceEntity.getScoreboardTags().contains("m")){
                return;
            }

            if(entities.contains(arrow)){
                return;
            }

            MoveEntity.reflect(arrow);
            ((Projectile) arrow).setShooter(null);
            entities.add(arrow);



        }

        num --;
    }
}
