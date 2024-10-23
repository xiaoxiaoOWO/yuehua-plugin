package com.xiaoxiaoowo.yuehua.utils;

import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public final class MoveEntity {

    public static void changeEntityMoveDirection(Entity projectile, double x1, double y1, double z1) {
        // 获取当前箭的位置
        Vector currentPos = projectile.getLocation().toVector();

        // 创建目标位置的向量
        Vector targetPos = new Vector(x1, y1, z1);

        // 计算指向新方向的向量
        Vector direction = targetPos.subtract(currentPos).normalize();

        // 获取当前速度向量
        Vector currentVelocity = projectile.getVelocity();

        // 计算当前速度的大小（模）
        double speed = currentVelocity.length();

        // 设置新的速度向量，方向为 direction，大小为原始速度的大小
        projectile.setVelocity(direction.multiply(speed));
    }

    public static void changeEntityMoveDirection(Entity projectile, double x1, double y1, double z1, double speed) {
        // 获取当前箭的位置
        Vector currentPos = projectile.getLocation().toVector();

        // 创建目标位置的向量
        Vector targetPos = new Vector(x1, y1, z1);

        // 计算指向新方向的向量
        Vector direction = targetPos.subtract(currentPos).normalize();

        // 设置新的速度向量，方向为 direction，大小为原始速度的大小
        projectile.setVelocity(direction.multiply(speed));
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

    public static void continueForce(Entity entity, double x, double y, double z){
        // 获取当前箭的位置
        Vector currentPos = entity.getLocation().toVector();

        // 创建目标位置的向量
        Vector targetPos = new Vector(x, y, z);

        Vector change = targetPos.subtract(currentPos);

        entity.setVelocity(change);
    }
}
