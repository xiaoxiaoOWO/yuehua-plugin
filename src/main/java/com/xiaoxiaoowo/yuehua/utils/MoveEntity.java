package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public final class MoveEntity {

    public static void reflect(Entity entity) {
        Vector speed = entity.getVelocity();
        speed.setX(-speed.getX());
        speed.setY(-speed.getY());
        speed.setZ(-speed.getZ());
        entity.setVelocity(speed);
    }

    public static void changeEntityMoveDirection(Entity entity, double x1, double y1, double z1) {
        // 获取当前箭的位置
        Vector currentPos = entity.getLocation().toVector();

        // 创建目标位置的向量
        Vector targetPos = new Vector(x1, y1, z1);

        // 计算指向新方向的向量
        Vector direction = targetPos.subtract(currentPos).normalize();

        // 获取当前速度向量
        Vector currentVelocity = entity.getVelocity();

        // 计算当前速度的大小（模）
        double speed = currentVelocity.length();

        // 设置新的速度向量，方向为 direction，大小为原始速度的大小
        entity.setVelocity(direction.multiply(speed));
    }

    public static void changeEntityMoveDirection(Entity entity, double x1, double y1, double z1, double speed) {
        // 获取当前箭的位置
        Vector currentPos = entity.getLocation().toVector();

        // 创建目标位置的向量
        Vector targetPos = new Vector(x1, y1, z1);

        // 计算指向新方向的向量
        Vector direction = targetPos.subtract(currentPos).normalize();

        // 设置新的速度向量，方向为 direction，大小为原始速度的大小
        entity.setVelocity(direction.multiply(speed));
    }

    public static void moveEntityNoPassBlock(Entity entity, double x, double y, double z) {
        // 获取当前箭的位置
        Vector currentPos = entity.getLocation().toVector();

        // 创建目标位置的向量
        Vector targetPos = new Vector(x, y, z);

        Vector change = targetPos.subtract(currentPos);

        entity.setVelocity(change);

        Scheduler.syncLater(() -> entity.setVelocity(new Vector(0, 0, 0)), 2);
    }

    public static void moveEntityNoPassBlock(Entity entity, Vector targetPos) {
        // 获取当前箭的位置
        Vector currentPos = entity.getLocation().toVector();

        Vector change = targetPos.subtract(currentPos);

        entity.setVelocity(change);

        Scheduler.syncLater(() -> entity.setVelocity(new Vector(0, 0, 0)), 2);
    }

    public static void continueForce(Entity entity, double x, double y, double z) {
        // 获取当前箭的位置
        Vector currentPos = entity.getLocation().toVector();

        // 创建目标位置的向量
        Vector targetPos = new Vector(x, y, z);

        Vector change = targetPos.subtract(currentPos);

        entity.setVelocity(change);
    }

    public static void continueForce(Entity entity, Vector targetPos) {
        // 获取当前箭的位置
        Vector currentPos = entity.getLocation().toVector();
        Vector change = targetPos.subtract(currentPos);

        entity.setVelocity(change);
    }


    public static void forceToPlayer(Player player, Vector force) {
        Vector vel = player.getVelocity();
        vel = vel.add(force);
        player.setVelocity(vel);
    }

    public static void tuidong(Data data, Vector force) {
        double forceAfterRenxing = (1 - data.renxing);
        forceToPlayer(data.player, force.multiply(forceAfterRenxing));
    }

    public static void jiTui(Data data, Vector center, double force) {
        Player player = data.player;
        double forceAfterRenxing = force * (1 - data.renxing);
        Vector currentPos = player.getLocation().toVector();
        Vector jiTuiVector = currentPos.subtract(center).normalize().multiply(forceAfterRenxing);

        forceToPlayer(player, jiTuiVector);
    }

    public static void qianYin(Data data, Vector center, double force) {
        Player player = data.player;
        double forceAfterRenxing = force * (1 - data.renxing);
        Vector currentPos = player.getLocation().toVector();
        Vector qianYinVector = center.subtract(currentPos).normalize().multiply(forceAfterRenxing);

        forceToPlayer(player, qianYinVector);
    }

    public static void jiFei(Data data, double force) {
        Player player = data.player;
        double forceAfterRenxing = force * (1 - data.renxing);
        forceToPlayer(player, new Vector(0, forceAfterRenxing, 0));
    }

    public static void jiTui(MonsterData data, Vector center, double force) {
        Mob mob = data.monster;
        double forceAfterRenxing = force * (1 - data.renxing);
        Vector currentPos = mob.getLocation().toVector();
        Vector jiTuiVector = currentPos.subtract(center).normalize().multiply(forceAfterRenxing);
        mob.setVelocity(jiTuiVector);
    }

    public static void qianYin(MonsterData data, Vector center, double force) {
        Mob mob = data.monster;
        double forceAfterRenxing = force * (1 - data.renxing);
        Vector currentPos = mob.getLocation().toVector();
        Vector qianYinVector = center.subtract(currentPos).normalize().multiply(forceAfterRenxing);
        mob.setVelocity(qianYinVector);
    }

    public static void jiFei(MonsterData data, double force) {
        Mob mob = data.monster;
        double forceAfterRenxing = force * (1 - data.renxing);
        mob.setVelocity(new Vector(0, forceAfterRenxing, 0));
    }

    public static Location dash(Data data, double distance) {
        Player player = data.player;
        if (data.fuben >= 1 && data.fuben <= 1000) {
            return null;
        }

        // 获取玩家眼睛的位置（即玩家视线的起点）
        Location eyeLocation = player.getEyeLocation();
        Location startLocation = player.getLocation();

        Vector direction;
        RayTraceResult rayTrace;
        // 获取玩家视线方向并将其标准化（单位向量）
        if (player.isUnderWater()) {
            direction = eyeLocation.getDirection().normalize();
            rayTrace = GetEntity.world.rayTraceBlocks(
                    startLocation,
                    direction,
                    distance,
                    FluidCollisionMode.NEVER,
                    true
            );

            // 确定最终传送位置
            Location destination;
            if (rayTrace != null && rayTrace.getHitBlock() != null) {
                // 如果射线追踪到了方块，停在方块之前
                Vector position = rayTrace.getHitPosition();
                Vector change = position.subtract(startLocation.toVector());
                double length = change.length();
                destination = startLocation.clone().add(direction.multiply(length - 0.5));
            } else {
                // 如果没有碰到方块，则移动全部指定距离
                destination = startLocation.clone().add(direction.multiply(distance));
            }


            for (int i = 0; i < distance; i++) {
                if (destination.getBlock().getType().isAir()) {
                    destination = startLocation.clone().add(direction.multiply(i));
                } else {
                    break;
                }
            }


            // 传送玩家到目标位置
            player.teleport(destination);
            return destination;

        } else {
            direction = eyeLocation.getDirection().setY(0).normalize();
            rayTrace = GetEntity.world.rayTraceBlocks(
                    startLocation,
                    direction,
                    distance,
                    FluidCollisionMode.NEVER,
                    true
            );

            // 确定最终传送位置
            Location destination;
            if (rayTrace != null && rayTrace.getHitBlock() != null) {
                // 如果射线追踪到了方块，停在方块之前
                Vector position = rayTrace.getHitPosition();
                Vector change = position.subtract(startLocation.toVector());
                double length = change.length();
                destination = startLocation.add(direction.multiply(length - 0.5));
            } else {
                // 如果没有碰到方块，则移动全部指定距离
                destination = startLocation.add(direction.multiply(distance));
            }

            // 传送玩家到目标位置
            player.teleport(destination);
            return destination;
        }


    }
}
