package com.xiaoxiaoowo.yuehua.display.test;

import com.destroystokyo.paper.ParticleBuilder;
import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public final class TestRay {


    public static void run(Player player) {
        Yuehua.async(() -> {
            Location location = player.getEyeLocation();
            Location location2 = location.clone();
            Location location3 = location.clone();

            Vector forward = location.getDirection();

            // 计算 Right 向量
            Vector upReference = new Vector(0, 1, 0); // Y轴向量
            Vector right = upReference.getCrossProduct(forward).normalize(); // Right
            // 计算 Up 向量
            Vector up = forward.getCrossProduct(right).normalize(); // Up

            Vector direction2 = forward.clone().rotateAroundNonUnitAxis(up, Math.PI / 6).multiply(4);


//            Vector direction3 = direction.clone().rotateAroundY(-Math.PI / 6).multiply(4);
            forward.multiply(4);
            World world = GetEntity.world;
            for (int i = 0; i < 5; i++) {
                location.add(forward);
                location2.add(direction2);
//                location3.add(direction3);
                world.spawnParticle(Particle.FLAME, location, 1, 0, 0, 0, 0.005);
                world.spawnParticle(Particle.FLAME, location2, 1, 0, 0, 0, 0.005);
//                world.spawnParticle(Particle.FLAME, location3, 1, 0, 0, 0, 0.005);

            }
        });
    }
}
