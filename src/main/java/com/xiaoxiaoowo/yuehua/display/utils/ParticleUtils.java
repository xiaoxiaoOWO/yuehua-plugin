package com.xiaoxiaoowo.yuehua.display.utils;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.util.Vector;


public final class ParticleUtils {
    public static void Line(Location loc1, Location loc2, Particle particle,double count){
        Vector v1 = loc1.toVector();
        Vector v2 = loc2.toVector();

        Vector distance = v2.subtract(v1);

        double margin = distance.lengthSquared()/count;

    }
}
