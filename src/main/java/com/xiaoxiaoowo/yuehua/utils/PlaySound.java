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

    public static void success(Player player) {
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

    public static void explode(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_GENERIC_EXPLODE);
    }

    public static void load(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ITEM_ARMOR_EQUIP_NETHERITE);
    }

    public static void zishuijinStep(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_AMETHYST_BLOCK_STEP);
    }

    public static void zishuijinHit(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_AMETHYST_BLOCK_HIT);
    }

    public static void pickUp(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_ITEM_PICKUP);
    }

    public static void pickupOrb(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP);
    }

    public static void itemMaceSmashGround(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ITEM_MACE_SMASH_GROUND);
    }

    public static void entityBlazeShoot(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.ENTITY_BLAZE_SHOOT);
    }

    public static void entityShoot(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_ARROW_SHOOT);
    }

    public static void playerSwim(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.ENTITY_GENERIC_SWIM);
    }

    public static void openInventory(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_BARREL_OPEN);
    }

    public static void closeInventory(Player player) {
        SendInformation.sendSoundAtEntity(player, Sound.BLOCK_BARREL_CLOSE);
    }

    public static void teleport(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_PLAYER_TELEPORT);
    }

    public static void teleportIn(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.BLOCK_PORTAL_TRAVEL);
    }

    public static void bigSuccess(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.UI_TOAST_CHALLENGE_COMPLETE);
    }

    public static void wind(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_WIND_CHARGE_WIND_BURST);
    }

    public static void breezeLand(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_BREEZE_LAND);
    }

    public static void entityVillagerWorkFletcher(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_VILLAGER_WORK_FLETCHER);
    }

    public static void entityVillagerWorkMason(Player player){
        SendInformation.sendSoundAtEntity(player,Sound.ENTITY_VILLAGER_WORK_MASON);
    }


    public static void huxiao(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:huxiao");
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

    public static void heal(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:heal");
    }

    public static void cure(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:cure");
    }

    public static void saleFinish(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:salefinish");
    }

    public static void gonggao(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:gonggao");
    }

    public static void zhandou(Player player) {
        SendInformation.sendSoundAtEntity(player, "minecraft:zhandou");
    }

    //神仙人妖战
    public static void storyshen(Player player){
        SendInformation.sendSoundAtEntity(player,"minecraft:shen_story");
    }

    public static void storyxian(Player player){
        SendInformation.sendSoundAtEntity(player,"minecraft:xian_story");
    }

    public static void storyren(Player player){
        SendInformation.sendSoundAtEntity(player,"minecraft:ren_story");
    }

    public static void storyyao(Player player){
        SendInformation.sendSoundAtEntity(player,"minecraft:yao_story");
    }

    public static void storyzhan(Player player){
        SendInformation.sendSoundAtEntity(player,"minecraft:zhan_story");
    }



    public static void shen(Player player) {
        SendInformation.sendBgm(player, "minecraft:shen", 0.5f);
    }

    public static void xian(Player player) {
        SendInformation.sendBgm(player, "minecraft:xian", 0.5f);
    }

    public static void ren(Player player) {
        SendInformation.sendBgm(player, "minecraft:ren", 0.5f);
    }

    public static void yao(Player player) {
        SendInformation.sendBgm(player, "minecraft:yao", 0.5f);
    }

    public static void zhan(Player player) {
        SendInformation.sendBgm(player, "minecraft:zhan", 0.5f);
    }

    public static void penglai(Player player) {
        SendInformation.sendBgm(player, "minecraft:penglai", 0.5f);
    }

    public static void middle(Player player) {
        SendInformation.sendBgm(player, "minecraft:middle", 0.5f);
    }

    public static void senlinrukou(Player player) {
        SendInformation.sendBgm(player, "minecraft:senlinrukou",0.5f);
    }

    public static void senlinzhongxin(Player player) {
        SendInformation.sendBgm(player, "minecraft:senlinzhongxin",0.5f);
    }

    public static void senlinshenchu(Player player){
        SendInformation.sendBgm(player, "minecraft:senlinshenchu",0.5f);
    }

    public static void beifang(Player player) {
        SendInformation.sendBgm(player, "minecraft:beifang",0.5f);
    }

    public static void shuizucunzhuang(Player player) {
        SendInformation.sendBgm(player, "minecraft:shuizucunzhuang",0.5f);
    }

    public static void shandong(Player player) {
        SendInformation.sendBgm(player, "minecraft:shandong",0.5f);
    }

    public static void qiansiguan(Player player) {
        SendInformation.sendBgm(player, "minecraft:qiansigu",0.5f);
    }

    public static void shamo(Player player) {
        SendInformation.sendBgm(player, "minecraft:shamo",0.5f);
    }

    public static void shamorukou(Player player) {
        SendInformation.sendBgm(player, "minecraft:shamorukou",0.5f);
    }

    public static void xumishan(Player player) {
        SendInformation.sendBgm(player, "minecraft:xumishan",0.5f);
    }

    public static void taolin(Player player) {
        SendInformation.sendBgm(player, "minecraft:taolin",0.5f);
    }

    public static void tuzuwu(Player player) {
        SendInformation.sendBgm(player, "minecraft:tuzuwu",0.5f);
    }

}
