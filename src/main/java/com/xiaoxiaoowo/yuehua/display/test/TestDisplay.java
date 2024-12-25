package com.xiaoxiaoowo.yuehua.display.test;

import com.xiaoxiaoowo.yuehua.items.zhuangbei.Weapon;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Transformation;
import org.bukkit.util.Vector;
import org.joml.Math;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class TestDisplay {

    public static void test(Player player) {
        Location eyeLocation = player.getEyeLocation();
        GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            it.setItemStack(Weapon.KUN_LUN_FEI_XIAN_JIAN);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);

            Transformation transformation = it.getTransformation();
            transformation.getScale().set(2, 2, 2);
            Quaternionf rotation = transformation.getLeftRotation();
            // 添加X轴旋转(pitch)
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);
            it.setTransformation(transformation);
        });
    }

    public static void test2(Player player) {
        Location eyeLocation = player.getEyeLocation();
        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class, it -> {
            it.setItemStack(Weapon.KUN_LUN_FEI_XIAN_JIAN);
            it.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);

            Transformation transformation = it.getTransformation();
            transformation.getScale().set(2, 2, 2);
            Quaternionf rotation = transformation.getLeftRotation();
            // 添加X轴旋转(pitch)
            rotation.rotateX(Math.toRadians(-10));
            transformation.getLeftRotation().set(rotation);
            it.setTransformation(transformation);
        });

        Scheduler.syncLater(() -> {
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(5 * 20);

            Transformation transformation = itemDisplay.getTransformation();
            transformation.getTranslation().set(0,0,10);
            itemDisplay.setTransformation(transformation);
        }, 2);
    }

    public static void test3(Player player) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize();
        ItemDisplay itemDisplay = (ItemDisplay) GetEntity.world.spawnEntity(eyeLocation, EntityType.ITEM_DISPLAY);
        itemDisplay.setItemStack(new ItemStack(Material.DIAMOND_SWORD));
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
    }

    public static void test4(Player player) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize();
        ItemDisplay itemDisplay = (ItemDisplay) GetEntity.world.spawnEntity(eyeLocation, EntityType.ITEM_DISPLAY);
        itemDisplay.setItemStack(new ItemStack(Material.DIAMOND_SWORD));
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.THIRDPERSON_LEFTHAND);
        // 计算 Right 向量
        Vector upReference = new Vector(0, 1, 0); // Y轴向量
        Vector right = upReference.getCrossProduct(direction).normalize(); // Right
        Vector3f axis = right.toVector3f();
        Transformation transformation = itemDisplay.getTransformation();
        transformation.getLeftRotation().fromAxisAngleRad(axis, (float) (Math.PI / 4));

        itemDisplay.setTransformation(transformation);
    }

    public static void test5(Player player) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize();
        ItemDisplay itemDisplay = (ItemDisplay) GetEntity.world.spawnEntity(eyeLocation, EntityType.ITEM_DISPLAY);
        itemDisplay.setItemStack(new ItemStack(Material.DIAMOND_SWORD));
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.HEAD);
    }

    public static void test6(Player player) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize();
        ItemDisplay itemDisplay = (ItemDisplay) GetEntity.world.spawnEntity(eyeLocation, EntityType.ITEM_DISPLAY);
        itemDisplay.setItemStack(new ItemStack(Material.DIAMOND_SWORD));
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GUI);
    }

    public static void test7(Player player) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize();
        ItemDisplay itemDisplay = (ItemDisplay) GetEntity.world.spawnEntity(eyeLocation, EntityType.ITEM_DISPLAY);
        itemDisplay.setItemStack(new ItemStack(Material.DIAMOND_SWORD));
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
    }

    public static void test8(Player player) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize();
        ItemDisplay itemDisplay = (ItemDisplay) GetEntity.world.spawnEntity(eyeLocation, EntityType.ITEM_DISPLAY);
        itemDisplay.setItemStack(new ItemStack(Material.DIAMOND_SWORD));
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.FIXED);
    }

    public static void test9(Player player) {
        Location eyeLocation = player.getEyeLocation();
        Vector direction = eyeLocation.getDirection().normalize();
        ItemDisplay itemDisplay = (ItemDisplay) GetEntity.world.spawnEntity(eyeLocation, EntityType.ITEM_DISPLAY);
        itemDisplay.setItemStack(new ItemStack(Material.DIAMOND_SWORD));
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.NONE);
    }


    public static void test277(Player player) {
        Location location = player.getLocation();
        Location eyeLocation = player.getEyeLocation();
        ItemDisplay itemDisplay = GetEntity.world.spawn(eyeLocation, ItemDisplay.class);
        ItemStack itemStack = Weapon.KUN_LUN_FEI_XIAN_JIAN;
        itemDisplay.setItemStack(itemStack);
        itemDisplay.setItemDisplayTransform(ItemDisplay.ItemDisplayTransform.GROUND);
        itemDisplay.setRotation(location.getYaw(), location.getPitch());
        Scheduler.syncLater(() -> {
            Vector direction = eyeLocation.getDirection().normalize().multiply(10);
            itemDisplay.setInterpolationDelay(0);
            itemDisplay.setInterpolationDuration(10 * 20);
            Transformation transformation = itemDisplay.getTransformation();
            transformation.getScale().set(2, 2, 2);

            transformation.getTranslation().set(
                    direction.getX(),
                    direction.getY(),
                    direction.getZ()
            );
            itemDisplay.setTransformation(transformation);
        }, 2);
    }
}
