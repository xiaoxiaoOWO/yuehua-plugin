package com.xiaoxiaoowo.yuehua.display.utils;

import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Transformation;
import org.bukkit.util.Vector;
import org.joml.Math;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class DisPlayUtils {

    public static BlockDisplay displayBlockCommmon(Location start, Vector end, BlockData blockData, Vector3f scale) {

        return GetEntity.world.spawn(start, BlockDisplay.class, it -> {
            it.setBlock(blockData);

            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);


            Vector direction = end.subtract(start.toVector());

            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);


        });
    }

    public static BlockDisplay displayBlockWithoutAngel(Location center, BlockData blockData, Vector3f scale) {
        return GetEntity.world.spawn(center, BlockDisplay.class, it -> {
            it.setBlock(blockData);

            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);


            // 将方向设置为实体的旋转
            it.setRotation(0, 0);


        });
    }

    public static ItemDisplay displayCommon(Location start, Vector end, ItemStack itemStack, Vector3f scale) {
        return GetEntity.world.spawn(start, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);

            Vector direction = end.subtract(start.toVector());

            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });
    }

    public static ItemDisplay displayCommon(Location start, Vector end, ItemStack itemStack, Vector3f scale, float distance, int time) {
        ItemDisplay itemDisplay = GetEntity.world.spawn(start, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);

            Vector direction = end.subtract(start.toVector());

            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });

        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(time);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, 0, distance);
            itemDisplay.setTransformation(transformation);
        }, 2);

        return itemDisplay;
    }

    /*
    angle正则向左边转
    * */
    public static ItemDisplay displayCommon(Location eyeLocation, double angle, ItemStack itemStack, Vector3f scale) {
        return GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);

            Vector eyedirection = eyeLocation.getDirection();

            // 计算 Right 向量
            Vector upReference = new Vector(0, 1, 0); // Y轴向量
            Vector right = upReference.getCrossProduct(eyedirection).normalize(); // Right
            // 计算 Up 向量
            Vector up = eyedirection.getCrossProduct(right).normalize(); // Up

            //弧度
            Vector direction = eyedirection.rotateAroundNonUnitAxis(up, angle).normalize();


            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });
    }

    public static ItemDisplay displayCommon(Location eyeLocation, double angle, ItemStack itemStack, Vector3f scale, float distance, int time) {
        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);

            Vector eyedirection = eyeLocation.getDirection();

            // 计算 Right 向量
            Vector upReference = new Vector(0, 1, 0); // Y轴向量
            Vector right = upReference.getCrossProduct(eyedirection).normalize(); // Right
            // 计算 Up 向量
            Vector up = eyedirection.getCrossProduct(right).normalize(); // Up

            //弧度
            Vector direction = eyedirection.rotateAroundNonUnitAxis(up, angle).normalize();

            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });

        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(time);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, 0, distance);
            itemDisplay.setTransformation(transformation);
        }, 2);

        return itemDisplay;
    }


    public static ItemDisplay displayCommon(Location eyeLocation, ItemStack itemStack, Vector3f scale) {
        return GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);
        });
    }

    public static ItemDisplay displayCommon(Location eyeLocation, ItemStack itemStack, Vector3f scale, float distance, int time) {
        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            it.setTransformation(transformation);
        });

        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(time);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, 0, distance);
            itemDisplay.setTransformation(transformation);
        }, 2);

        return itemDisplay;
    }

    public static ItemDisplay displayCommon(Location eyeLocation, ItemStack itemStack, Vector3f scale, float distance, int time, double dy) {
        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            transformation.getTranslation().set(0, dy, 0);
            it.setTransformation(transformation);
        });

        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(time);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, dy, distance);
            itemDisplay.setTransformation(transformation);
        }, 2);

        return itemDisplay;
    }


    public static ItemDisplay displayJian(Location start, Vector end, ItemStack itemStack, Vector3f scale) {
        return GetEntity.world.spawn(start, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            //旋转
            Quaternionf rotation = transformation.getLeftRotation();
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);

            it.setTransformation(transformation);

            Vector direction = end.subtract(start.toVector());

            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });
    }

    public static ItemDisplay displayJian(Location start, Vector end, ItemStack itemStack, Vector3f scale, float distance, int time) {
        ItemDisplay itemDisplay = GetEntity.world.spawn(start, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            //旋转
            Quaternionf rotation = transformation.getLeftRotation();
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);

            it.setTransformation(transformation);

            Vector direction = end.subtract(start.toVector());

            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });

        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(time);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, 0, distance);
            itemDisplay.setTransformation(transformation);
        }, 2);

        return itemDisplay;
    }

    /*
    angle正则向左边转
    * */
    public static ItemDisplay displayJian(Location eyeLocation, double angle, ItemStack itemStack, Vector3f scale) {
        return GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            //旋转
            Quaternionf rotation = transformation.getLeftRotation();
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);

            it.setTransformation(transformation);

            Vector eyedirection = eyeLocation.getDirection();

            // 计算 Right 向量
            Vector upReference = new Vector(0, 1, 0); // Y轴向量
            Vector right = upReference.getCrossProduct(eyedirection).normalize(); // Right
            // 计算 Up 向量
            Vector up = eyedirection.getCrossProduct(right).normalize(); // Up

            //弧度
            Vector direction = eyedirection.rotateAroundNonUnitAxis(up, angle).normalize();


            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });
    }

    public static ItemDisplay displayJian(Location eyeLocation, double angle, ItemStack itemStack, Vector3f scale, float distance, int time) {
        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            //旋转
            Quaternionf rotation = transformation.getLeftRotation();
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);

            it.setTransformation(transformation);

            Vector eyedirection = eyeLocation.getDirection();

            // 计算 Right 向量
            Vector upReference = new Vector(0, 1, 0); // Y轴向量
            Vector right = upReference.getCrossProduct(eyedirection).normalize(); // Right
            // 计算 Up 向量
            Vector up = eyedirection.getCrossProduct(right).normalize(); // Up

            //弧度
            Vector direction = eyedirection.rotateAroundNonUnitAxis(up, angle).normalize();

            // 计算 yaw 和 pitch
            float yaw = (float) Math.toDegrees(Math.atan2(-direction.getX(), direction.getZ()));
            float pitch = (float) Math.toDegrees(Math.atan2(-direction.getY(), direction.length()));

            // 将方向设置为实体的旋转
            it.setRotation(yaw, pitch);
        });

        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(time);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, 0, distance);
            itemDisplay.setTransformation(transformation);
        }, 2);

        return itemDisplay;
    }

    public static ItemDisplay displayJian(Location eyeLocation, ItemStack itemStack, Vector3f scale) {
        return GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            //旋转
            Quaternionf rotation = transformation.getLeftRotation();
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);

            it.setTransformation(transformation);
        });
    }

    //        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
    //            //物品与展示方式
    //            it.setItemStack(itemStack);
    //            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
    //            //大小
    //            Transformation transformation = it.getTransformation();
    //            transformation.getScale().set(scale);
    //            transformation.getTranslation().set(0, dy, 0);
    //            it.setTransformation(transformation);
    //        });
    //
    //        Scheduler.asyncLater(() -> {
    //            itemDisplay.setInterpolationDelay(0);
    //            itemDisplay.setInterpolationDuration(time);
    //
    //            Transformation transformation = itemDisplay.getTransformation();
    //            transformation.getTranslation().set(0, dy, distance);
    //            itemDisplay.setTransformation(transformation);
    //        }, 2);

    public static ItemDisplay displayJian(Location eyeLocation, ItemStack itemStack, Vector3f scale, float distance, int time, double dy) {
        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            //物品与展示方式
            it.setItemStack(itemStack);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
            //大小
            Transformation transformation = it.getTransformation();
            transformation.getScale().set(scale);
            transformation.getTranslation().set(0,dy,0);
            //旋转
            Quaternionf rotation = transformation.getLeftRotation();
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);

            it.setTransformation(transformation);
        });

        Scheduler.asyncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(time);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0, dy, distance);
            itemDisplay.setTransformation(transformation);
        }, 2);

        return itemDisplay;
    }
}
