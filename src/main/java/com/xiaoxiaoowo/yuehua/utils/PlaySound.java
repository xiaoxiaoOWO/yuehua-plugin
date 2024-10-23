package com.xiaoxiaoowo.yuehua.utils;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public final class PlaySound {
    public static void dz(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_ANVIL_USE);
    }

    public static void liandan(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_BREWING_STAND_BREW);
    }

    public static void fuling(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_ENCHANTMENT_TABLE_USE);
    }

    public static void insert(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_GRINDSTONE_USE);
    }

    public static void fail(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_FIRE_EXTINGUISH);
    }

    public static void levelup(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.ENTITY_PLAYER_LEVELUP);
    }

    public static void SmithingTableUse(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.BLOCK_SMITHING_TABLE_USE);
    }


    public static void zishuijinPlace(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_AMETHYST_BLOCK_PLACE);
    }

    public static void zishuijinBreak(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_AMETHYST_BLOCK_BREAK);
    }

    public static void zishuijinStep(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_AMETHYST_BLOCK_STEP);
    }

    public static void zishuijinHit(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_AMETHYST_BLOCK_HIT);
    }

    public static void pickupOrb(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP);
    }

    public static void openInventory(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_BARREL_OPEN);
    }

    public static void closeInventory(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_BARREL_CLOSE);
    }

    public static void jin(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:jin");
    }

    public static void mu(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:mu");
    }

    public static void shui(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:shui");
    }

    public static void huo(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:huo");
    }

    public static void tu(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:tu");
    }


    public static void zhiliao(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:zhiliao");
    }

    public static void gonggao(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:gonggao");
    }

    public static void zhandou(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:zhandou");
    }

    public static void shen(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:shen", 12.5f);
    }

    public static void xian(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:xian", 18.75f);
    }

    public static void ren(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:ren", 12.5f);
    }

    public static void yao(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:yao", 12.5f);
    }

    public static void zhan(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:zhan", 12.5f);
    }

    public static void penglai(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:penglai", 10f);
    }

    public static void middle(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:middle", 18.75f);
    }

}
