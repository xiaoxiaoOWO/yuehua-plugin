package com.xiaoxiaoowo.yuehua.display.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;


public final class ParticleUtils {

    public static void parabola(Vector start, Vector end, double height, Particle particle, int time) {
        // 计算方向向量和 XZ 平面上每 tick 移动的步长
        Vector direction = end.clone().subtract(start).setY(0); // 忽略 Y 轴，只获取 XZ 平面的方向
        double distance = direction.length();
        direction.normalize(); // 单位向量化



        // 创建一个自取消的任务
        new BukkitRunnable() {
            int t = 0; // 用于记录当前 tick 数
            final double stepXZ = distance / time; // 每 tick 在 XZ 平面上移动的步长

            // 抛物线系数
            final double a = -4 * height / (time * time);
            final double b = 4 * height / time;

            @Override
            public void run() {
                if (t > time) {
                    this.cancel(); // 任务在粒子到达终点时自动取消
                    return;
                }

                // 计算当前 XZ 平面的位置
                Vector position = start.clone().add(direction.clone().multiply(stepXZ * t));

                // 计算 Y 位置（抛物线高度）
                double y = a * t * t + b * t + start.getY();
                position.setY(y);

                // 生成粒子
                GetEntity.world.spawnParticle(particle, position.toLocation(GetEntity.world), 1);

                // 增加 tick
                t++;
            }
        }.runTaskTimerAsynchronously(Yuehua.instance, 0, 1); // 每 tick 运行一次任务
    }



    // 基础版
    public static void line(Vector vec1, Vector vec2, Particle particle, double count) {
        double distance = vec1.distance(vec2);
        Vector vector = vec2.clone().subtract(vec1).normalize().multiply(distance / count);

        for (int i = 0; i < count; i++) {
            Location particleLocation = vec1.toLocation(GetEntity.world); // 转换为 Location
            GetEntity.world.spawnParticle(particle, particleLocation, 1, 0, 0, 0);
            vec1.add(vector);
        }
    }

    // 带有 extra 参数的版本
    public static void line(Vector vec1, Vector vec2, Particle particle, double count, double extra) {
        double distance = vec1.distance(vec2);
        Vector vector = vec2.clone().subtract(vec1).normalize().multiply(distance / count);

        for (int i = 0; i < count; i++) {
            Location particleLocation = vec1.toLocation(GetEntity.world); // 转换为 Location
            GetEntity.world.spawnParticle(particle, particleLocation, 1, 0, 0, 0, extra);
            vec1.add(vector);
        }
    }

    // 带有 extra 和 data 参数的版本
    public static <T> void line(Vector vec1, Vector vec2, Particle particle, double count, double extra, T data) {
        double distance = vec1.distance(vec2);
        Vector vector = vec2.clone().subtract(vec1).normalize().multiply(distance / count);

        for (int i = 0; i < count; i++) {
            Location particleLocation = vec1.toLocation(GetEntity.world); // 转换为 Location
            GetEntity.world.spawnParticle(particle, particleLocation, 1, 0, 0, 0, extra, data);
            vec1.add(vector);
        }
    }


    public static void line(Location loc1, Location loc2, Particle particle, double count) {
        double distance = loc1.distance(loc2);
        Vector vector = loc2.toVector().subtract(loc1.toVector()).normalize().multiply(distance / count);

        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, loc1, 1, 0, 0, 0);
            loc1.add(vector);
        }
    }

    public static void line(Location loc1, Location loc2, Particle particle, double count, double extra) {
        double distance = loc1.distance(loc2);
        Vector vector = loc2.toVector().subtract(loc1.toVector()).normalize().multiply(distance / count);

        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, loc1, 1, 0, 0, 0, extra);
            loc1.add(vector);
        }
    }

    public static <T> void line(Location loc1, Location loc2, Particle particle, double count, double extra, T data) {
        double distance = loc1.distance(loc2);
        Vector vector = loc2.toVector().subtract(loc1.toVector()).normalize().multiply(distance / count);

        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, loc1, 1, 0, 0, 0, extra, data);
            loc1.add(vector);
        }
    }


    public static void rectangle(Location loc1, Location loc2, Location loc3, Location loc4, Particle particle, double count) {
        // 画四条边
        line(loc1, loc2, particle, count);
        line(loc2, loc3, particle, count);
        line(loc3, loc4, particle, count);
        line(loc4, loc1, particle, count);
    }

    public static void rectangle(Location loc1, Location loc2, Location loc3, Location loc4, Particle particle, double count, double extra) {
        // 画四条边
        line(loc1, loc2, particle, count, extra);
        line(loc2, loc3, particle, count, extra);
        line(loc3, loc4, particle, count, extra);
        line(loc4, loc1, particle, count, extra);
    }

    public static <T> void rectangle(Location loc1, Location loc2, Location loc3, Location loc4, Particle particle, double count, double extra, T data) {
        // 画四条边
        line(loc1, loc2, particle, count, extra, data);
        line(loc2, loc3, particle, count, extra, data);
        line(loc3, loc4, particle, count, extra, data);
        line(loc4, loc1, particle, count, extra, data);
    }

    // 基础版
    public static void rectangle(Vector vec1, Vector vec2, Vector vec3, Vector vec4, Particle particle, double count) {
        line(vec1, vec2, particle, count);
        line(vec2, vec3, particle, count);
        line(vec3, vec4, particle, count);
        line(vec4, vec1, particle, count);
    }

    // 带有 extra 参数的版本
    public static void rectangle(Vector vec1, Vector vec2, Vector vec3, Vector vec4, Particle particle, double count, double extra) {
        line(vec1, vec2, particle, count, extra);
        line(vec2, vec3, particle, count, extra);
        line(vec3, vec4, particle, count, extra);
        line(vec4, vec1, particle, count, extra);
    }

    // 带有 extra 和 data 参数的版本
    public static <T> void rectangle(Vector vec1, Vector vec2, Vector vec3, Vector vec4, Particle particle, double count, double extra, T data) {
        line(vec1, vec2, particle, count, extra, data);
        line(vec2, vec3, particle, count, extra, data);
        line(vec3, vec4, particle, count, extra, data);
        line(vec4, vec1, particle, count, extra, data);
    }

    public static void cuboid(Vector baseVec1, Vector baseVec2, double height, Particle particle, double count) {
        // 获取底面矩形的四个顶点
        Vector baseVec3 = new Vector(baseVec1.getX(), baseVec1.getY(), baseVec2.getZ());
        Vector baseVec4 = new Vector(baseVec2.getX(), baseVec1.getY(), baseVec1.getZ());

        // 顶面矩形的四个顶点
        Vector topVec1 = baseVec1.clone().add(new Vector(0, height, 0));
        Vector topVec2 = baseVec2.clone().add(new Vector(0, height, 0));
        Vector topVec3 = baseVec3.clone().add(new Vector(0, height, 0));
        Vector topVec4 = baseVec4.clone().add(new Vector(0, height, 0));

        // 绘制底面矩形的四条边
        line(baseVec1, baseVec3, particle, count);
        line(baseVec3, baseVec2, particle, count);
        line(baseVec2, baseVec4, particle, count);
        line(baseVec4, baseVec1, particle, count);

        // 绘制顶面矩形的四条边
        line(topVec1, topVec3, particle, count);
        line(topVec3, topVec2, particle, count);
        line(topVec2, topVec4, particle, count);
        line(topVec4, topVec1, particle, count);

        // 绘制垂直的四条边（将底面与顶面连接）
        line(baseVec1, topVec1, particle, count);
        line(baseVec2, topVec2, particle, count);
        line(baseVec3, topVec3, particle, count);
        line(baseVec4, topVec4, particle, count);
    }


    public static void cuboid(Vector baseVec1, Vector baseVec2, double height, Particle particle, double count, double extra) {
        // 获取底面矩形的四个顶点
        Vector baseVec3 = new Vector(baseVec1.getX(), baseVec1.getY(), baseVec2.getZ());
        Vector baseVec4 = new Vector(baseVec2.getX(), baseVec1.getY(), baseVec1.getZ());

        // 顶面矩形的四个顶点
        Vector topVec1 = baseVec1.clone().add(new Vector(0, height, 0));
        Vector topVec2 = baseVec2.clone().add(new Vector(0, height, 0));
        Vector topVec3 = baseVec3.clone().add(new Vector(0, height, 0));
        Vector topVec4 = baseVec4.clone().add(new Vector(0, height, 0));

        // 绘制底面矩形的四条边
        line(baseVec1, baseVec3, particle, count, extra);
        line(baseVec3, baseVec2, particle, count, extra);
        line(baseVec2, baseVec4, particle, count, extra);
        line(baseVec4, baseVec1, particle, count, extra);

        // 绘制顶面矩形的四条边
        line(topVec1, topVec3, particle, count, extra);
        line(topVec3, topVec2, particle, count, extra);
        line(topVec2, topVec4, particle, count, extra);
        line(topVec4, topVec1, particle, count, extra);

        // 绘制垂直的四条边
        line(baseVec1, topVec1, particle, count, extra);
        line(baseVec2, topVec2, particle, count, extra);
        line(baseVec3, topVec3, particle, count, extra);
        line(baseVec4, topVec4, particle, count, extra);
    }

    public static <T> void cuboid(Vector baseVec1, Vector baseVec2, double height, Particle particle, double count, double extra, T data) {
        // 获取底面矩形的四个顶点
        Vector baseVec3 = new Vector(baseVec1.getX(), baseVec1.getY(), baseVec2.getZ());
        Vector baseVec4 = new Vector(baseVec2.getX(), baseVec1.getY(), baseVec1.getZ());

        // 顶面矩形的四个顶点
        Vector topVec1 = baseVec1.clone().add(new Vector(0, height, 0));
        Vector topVec2 = baseVec2.clone().add(new Vector(0, height, 0));
        Vector topVec3 = baseVec3.clone().add(new Vector(0, height, 0));
        Vector topVec4 = baseVec4.clone().add(new Vector(0, height, 0));

        // 绘制底面矩形的四条边
        line(baseVec1, baseVec3, particle, count, extra, data);
        line(baseVec3, baseVec2, particle, count, extra, data);
        line(baseVec2, baseVec4, particle, count, extra, data);
        line(baseVec4, baseVec1, particle, count, extra, data);

        // 绘制顶面矩形的四条边
        line(topVec1, topVec3, particle, count, extra, data);
        line(topVec3, topVec2, particle, count, extra, data);
        line(topVec2, topVec4, particle, count, extra, data);
        line(topVec4, topVec1, particle, count, extra, data);

        // 绘制垂直的四条边
        line(baseVec1, topVec1, particle, count, extra, data);
        line(baseVec2, topVec2, particle, count, extra, data);
        line(baseVec3, topVec3, particle, count, extra, data);
        line(baseVec4, topVec4, particle, count, extra, data);
    }


    public static void circle(Location center, double radius, int count, Vector axis, Particle particle) {
        axis = axis.normalize(); // 规范化轴向量
        double angleIncrement = 2 * Math.PI / count;

        for (int i = 0; i < count; i++) {
            // 计算平面内的圆周点
            double angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);

            // 使用旋转矩阵将圆从 XY 平面旋转到 axis 指定的平面
            Vector point = new Vector(x, y, 0);
            Vector rotatedPoint = rotateVector(point, axis);

            // 将粒子生成位置移动到中心位置
            Location particleLocation = center.clone().add(rotatedPoint);
            GetEntity.world.spawnParticle(particle, particleLocation, 1, 0, 0, 0, 0);
        }
    }

    private static void circle(Location center, double radius, int count, Vector axis, Particle particle, double extra) {
        axis = axis.normalize(); // 规范化轴向量
        double angleIncrement = 2 * Math.PI / count;

        for (int i = 0; i < count; i++) {
            // 计算平面内的圆周点
            double angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);

            // 使用旋转矩阵将圆从 XY 平面旋转到 axis 指定的平面
            Vector point = new Vector(x, y, 0);
            Vector rotatedPoint = rotateVector(point, axis);

            // 将粒子生成位置移动到中心位置
            Location particleLocation = center.clone().add(rotatedPoint);
            GetEntity.world.spawnParticle(particle, particleLocation, 1, 0, 0, 0, extra);
        }
    }

    public static <T> void circle(Location center, double radius, int count, Vector axis, Particle particle, double extra, T data) {
        axis = axis.normalize(); // 规范化轴向量
        double angleIncrement = 2 * Math.PI / count;

        for (int i = 0; i < count; i++) {
            // 计算平面内的圆周点
            double angle = i * angleIncrement;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);

            // 使用旋转矩阵将圆从 XY 平面旋转到 axis 指定的平面
            Vector point = new Vector(x, y, 0);
            Vector rotatedPoint = rotateVector(point, axis);

            // 将粒子生成位置移动到中心位置
            Location particleLocation = center.clone().add(rotatedPoint);
            GetEntity.world.spawnParticle(particle, particleLocation, 1, 0, 0, 0, extra, data);
        }
    }

    public static void sphere(Location center, double radius, int layers, Particle particle) {
        int particlesPerLayer; // 每层的粒子数量

        for (int i = 0; i <= layers; i++) {
            // 计算当前层的高度（y 位置）和半径
            double layerRatio = (double) i / layers; // 当前层在球体高度上的相对位置
            double y = radius * (1 - 2 * layerRatio); // y 位置从 -radius 到 radius
            double layerRadius = Math.sqrt(radius * radius - y * y); // 当前层圆的半径

            // 计算当前层上的粒子数量
            particlesPerLayer = (int) (2 * Math.PI * layerRadius / (radius / layers)) + 1;

            // 在当前层上生成一个圆
            for (int j = 0; j < particlesPerLayer; j++) {
                double angle = 2 * Math.PI * j / particlesPerLayer; // 粒子在圆周上的位置
                double x = layerRadius * Math.cos(angle);
                double z = layerRadius * Math.sin(angle);

                // 设置粒子生成位置
                Location particleLocation = center.clone().add(x, y, z);
                center.getWorld().spawnParticle(particle, particleLocation, 1, 0, 0, 0);
            }
        }
    }

    public static void sphere(Location center, double radius, int layers, Particle particle, double extra) {
        int particlesPerLayer; // 每层的粒子数量

        for (int i = 0; i <= layers; i++) {
            // 计算当前层的高度（y 位置）和半径
            double layerRatio = (double) i / layers; // 当前层在球体高度上的相对位置
            double y = radius * (1 - 2 * layerRatio); // y 位置从 -radius 到 radius
            double layerRadius = Math.sqrt(radius * radius - y * y); // 当前层圆的半径

            // 计算当前层上的粒子数量
            particlesPerLayer = (int) (2 * Math.PI * layerRadius / (radius / layers)) + 1;

            // 在当前层上生成一个圆
            for (int j = 0; j < particlesPerLayer; j++) {
                double angle = 2 * Math.PI * j / particlesPerLayer; // 粒子在圆周上的位置
                double x = layerRadius * Math.cos(angle);
                double z = layerRadius * Math.sin(angle);

                // 设置粒子生成位置
                Location particleLocation = center.clone().add(x, y, z);
                center.getWorld().spawnParticle(particle, particleLocation, 1, 0, 0, 0, extra);
            }
        }
    }

    public static <T> void sphere(Location center, double radius, int layers, Particle particle, double extra, T data) {
        int particlesPerLayer; // 每层的粒子数量

        for (int i = 0; i <= layers; i++) {
            // 计算当前层的高度（y 位置）和半径
            double layerRatio = (double) i / layers; // 当前层在球体高度上的相对位置
            double y = radius * (1 - 2 * layerRatio); // y 位置从 -radius 到 radius
            double layerRadius = Math.sqrt(radius * radius - y * y); // 当前层圆的半径

            // 计算当前层上的粒子数量
            particlesPerLayer = (int) (2 * Math.PI * layerRadius / (radius / layers)) + 1;

            // 在当前层上生成一个圆
            for (int j = 0; j < particlesPerLayer; j++) {
                double angle = 2 * Math.PI * j / particlesPerLayer; // 粒子在圆周上的位置
                double x = layerRadius * Math.cos(angle);
                double z = layerRadius * Math.sin(angle);

                // 设置粒子生成位置
                Location particleLocation = center.clone().add(x, y, z);
                center.getWorld().spawnParticle(particle, particleLocation, 1, 0, 0, 0, extra, data);
            }
        }
    }


    public static void playerEyeLine(Player player, Particle particle, double distance, double count) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize().multiply(distance / count);

        Location currentLocation = eyeLocation.clone();
        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, currentLocation, 1, 0, 0, 0);
            currentLocation.add(direction);
        }
    }

    public static void playerEyeLine(Player player, Particle particle, double distance, double count, double extra) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize().multiply(distance / count);

        Location currentLocation = eyeLocation.clone();
        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, currentLocation, 1, 0, 0, 0, extra);
            currentLocation.add(direction);
        }
    }

    public static <T> void playerEyeLine(Player player, Particle particle, double distance, double count, double extra, T data) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize().multiply(distance / count);

        Location currentLocation = eyeLocation.clone();
        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, currentLocation, 1, 0, 0, 0, extra, data);
            currentLocation.add(direction);
        }
    }

    public static void playerEyeLineWithRotation(Player player, Particle particle, double distance, double count, double angle) {
        Location eyeLocation = player.getEyeLocation();
        Vector eyedirection = eyeLocation.getDirection();

        // 计算 Right 向量
        Vector upReference = new Vector(0, 1, 0); // Y轴向量
        Vector right = upReference.getCrossProduct(eyedirection).normalize(); // Right
        // 计算 Up 向量
        Vector up = eyedirection.getCrossProduct(right).normalize(); // Up

        //弧度
        Vector direction = eyedirection.rotateAroundNonUnitAxis(up, angle).normalize().multiply(distance / count);

        Location currentLocation = eyeLocation.clone();
        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, currentLocation, 1, 0, 0, 0);
            currentLocation.add(direction);
        }
    }

    public static void playerEyeLineWithRotation(Player player, Particle particle, double distance, double count, double angle, double extra) {
        Location eyeLocation = player.getEyeLocation();
        Vector eyedirection = eyeLocation.getDirection();

        // 计算 Right 向量
        Vector upReference = new Vector(0, 1, 0); // Y轴向量
        Vector right = upReference.getCrossProduct(eyedirection).normalize(); // Right
        // 计算 Up 向量
        Vector up = eyedirection.getCrossProduct(right).normalize(); // Up

        //弧度
        Vector direction = eyedirection.rotateAroundNonUnitAxis(up, angle).normalize().multiply(distance / count);

        Location currentLocation = eyeLocation.clone();
        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, currentLocation, 1, 0, 0, 0, extra);
            currentLocation.add(direction);
        }
    }

    public static <T> void playerEyeLineWithRotation(Player player, Particle particle, double distance, double count, double angle, double extra, T data) {
        Location eyeLocation = player.getEyeLocation();
        Vector eyedirection = eyeLocation.getDirection();

        // 计算 Right 向量
        Vector upReference = new Vector(0, 1, 0); // Y轴向量
        Vector right = upReference.getCrossProduct(eyedirection).normalize(); // Right
        // 计算 Up 向量
        Vector up = eyedirection.getCrossProduct(right).normalize(); // Up

        //弧度
        Vector direction = eyedirection.rotateAroundNonUnitAxis(up, angle).normalize().multiply(distance / count);

        Location currentLocation = eyeLocation.clone();
        for (int i = 0; i < count; i++) {
            GetEntity.world.spawnParticle(particle, currentLocation, 1, 0, 0, 0, extra, data);
            currentLocation.add(direction);
        }
    }

    private static Vector rotateVector(Vector vector, Vector axis) {
        double x = vector.getX();
        double y = vector.getY();
        double z = vector.getZ();
        double u = axis.getX();
        double v = axis.getY();
        double w = axis.getZ();

        // 使用 Rodrigues' Rotation Formula 旋转向量
        double cosAngle = Math.cos(Math.PI / 2);
        double sinAngle = Math.sin(Math.PI / 2);

        double newX = u * (u * x + v * y + w * z) * (1 - cosAngle) + x * cosAngle + (-w * y + v * z) * sinAngle;
        double newY = v * (u * x + v * y + w * z) * (1 - cosAngle) + y * cosAngle + (w * x - u * z) * sinAngle;
        double newZ = w * (u * x + v * y + w * z) * (1 - cosAngle) + z * cosAngle + (-v * x + u * y) * sinAngle;

        return new Vector(newX, newY, newZ);
    }


}
