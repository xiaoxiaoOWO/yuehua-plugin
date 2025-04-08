package com.xiaoxiaoowo.yuehua.guis.dz;

import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.items.dz.Core;
import com.xiaoxiaoowo.yuehua.items.dz.Ingredient;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.items.other.Feather;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.*;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class Recipe {
    public static final boolean needRenew = false;

    public static final Inventory zhanArmor = Bukkit.createInventory(null, 54, Component.text("护甲配方[战][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory gongArmor = Bukkit.createInventory(null, 54, Component.text("护甲配方[弓][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory danArmor = Bukkit.createInventory(null, 54, Component.text("护甲配方[丹][第一页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanWeapon = Bukkit.createInventory(null, 54, Component.text("武器配方[战][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory gongWeapon = Bukkit.createInventory(null, 54, Component.text("武器配方[弓][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory danWeapon = Bukkit.createInventory(null, 54, Component.text("武器配方[丹][第一页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanBiWeapon = Bukkit.createInventory(null, 54, Component.text("副武器配方[战][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory gongBiWeapon = Bukkit.createInventory(null, 54, Component.text("副武器配方[弓][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory danBiWeapon = Bukkit.createInventory(null, 54, Component.text("副武器配方[丹][第一页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanFaBao = Bukkit.createInventory(null, 54, Component.text("法宝配方[战][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory gongFaBao = Bukkit.createInventory(null, 54, Component.text("法宝配方[弓][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory danFaBao = Bukkit.createInventory(null, 54, Component.text("法宝配方[丹][第一页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanYiQi = Bukkit.createInventory(null, 54, Component.text("异器配方[战][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory gongYiQi = Bukkit.createInventory(null, 54, Component.text("异器配方[弓][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory danYiQi = Bukkit.createInventory(null, 54, Component.text("异器配方[丹][第一页]").color(NamedTextColor.AQUA));

    public static final Inventory shipin = Bukkit.createInventory(null, 54, Component.text("饰品配方[第一页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanArmor2 = Bukkit.createInventory(null, 54, Component.text("护甲配方[战][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory gongArmor2 = Bukkit.createInventory(null, 54, Component.text("护甲配方[弓][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory danArmor2 = Bukkit.createInventory(null, 54, Component.text("护甲配方[丹][第二页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanWeapon2 = Bukkit.createInventory(null, 54, Component.text("武器配方[战][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory gongWeapon2 = Bukkit.createInventory(null, 54, Component.text("武器配方[弓][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory danWeapon2 = Bukkit.createInventory(null, 54, Component.text("武器配方[丹][第二页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanBiWeapon2 = Bukkit.createInventory(null, 54, Component.text("副武器配方[战][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory gongBiWeapon2 = Bukkit.createInventory(null, 54, Component.text("副武器配方[弓][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory danBiWeapon2 = Bukkit.createInventory(null, 54, Component.text("副武器配方[丹][第二页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanFaBao2 = Bukkit.createInventory(null, 54, Component.text("法宝配方[战][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory gongFaBao2 = Bukkit.createInventory(null, 54, Component.text("法宝配方[弓][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory danFaBao2 = Bukkit.createInventory(null, 54, Component.text("法宝配方[丹][第二页]").color(NamedTextColor.AQUA));

    public static final Inventory zhanYiQi2 = Bukkit.createInventory(null, 54, Component.text("异器配方[战][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory gongYiQi2 = Bukkit.createInventory(null, 54, Component.text("异器配方[弓][第二页]").color(NamedTextColor.AQUA));
    public static final Inventory danYiQi2 = Bukkit.createInventory(null, 54, Component.text("异器配方[丹][第二页]").color(NamedTextColor.AQUA));

    public static final Inventory shipin2 = Bukkit.createInventory(null, 54, Component.text("饰品配方[第二页]").color(NamedTextColor.AQUA));

    public static final Inventory recipeAllDan = Bukkit.createInventory(null, 54, Component.text("丹药配方[第一页]").color(NamedTextColor.AQUA));
    public static final Inventory recipeAllDan2 = Bukkit.createInventory(null, 54, Component.text("丹药配方[第二页]").color(NamedTextColor.AQUA));
    public static final Inventory recipeDanDan = Bukkit.createInventory(null, 54, Component.text("丹药配方[仅炼丹][第一页]").color(NamedTextColor.AQUA));
    public static final Inventory recipeDanDan2 = Bukkit.createInventory(null, 54, Component.text("丹药配方[仅炼丹][第二页]").color(NamedTextColor.AQUA));

    public static final Inventory recipeOther = Bukkit.createInventory(null, 54, Component.text("其它配方[第一页]").color(NamedTextColor.AQUA));
    public static final Inventory recipeOther2 = Bukkit.createInventory(null, 54, Component.text("其它配方[第二页]").color(NamedTextColor.AQUA));

    public static final HashMap<String, Inventory> zhanarmorContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> gongarmorContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> danarmorContents = new HashMap<>(300);

    public static final HashMap<String, Inventory> zhanweaponContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> gongweaponContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> danweaponContents = new HashMap<>(300);

    public static final HashMap<String, Inventory> zhanbiweaponContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> gongbiweaponContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> danbiweaponContents = new HashMap<>(300);

    public static final HashMap<String, Inventory> zhanfabaoContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> gongfabaoContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> danfabaoContents = new HashMap<>(300);

    public static final HashMap<String, Inventory> zhanyiqiContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> gongyiqiContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> danyiqiContents = new HashMap<>(300);

    public static final HashMap<String, Inventory> shipinContents = new HashMap<>(300);

    public static final HashMap<String, Inventory> danContents = new HashMap<>(300);
    public static final HashMap<String, Inventory> dandanContents = new HashMap<>(300);

    public static final HashMap<String, Inventory> otherContents = new HashMap<>(300);

    public static final HashMap<String, ItemStack> idToItem = new HashMap<>(4000);

    static {


        SQL.initialRecipe();

        zhanArmor.setItem(0, Yh.TO_NEXT);
        gongArmor.setItem(0, Yh.TO_NEXT);
        danArmor.setItem(0, Yh.TO_NEXT);

        zhanWeapon.setItem(0, Yh.TO_NEXT);
        gongWeapon.setItem(0, Yh.TO_NEXT);
        danWeapon.setItem(0, Yh.TO_NEXT);

        zhanBiWeapon.setItem(0, Yh.TO_NEXT);
        gongBiWeapon.setItem(0, Yh.TO_NEXT);
        danBiWeapon.setItem(0, Yh.TO_NEXT);

        zhanFaBao.setItem(0, Yh.TO_NEXT);
        gongFaBao.setItem(0, Yh.TO_NEXT);
        danFaBao.setItem(0, Yh.TO_NEXT);

        zhanYiQi.setItem(0, Yh.TO_NEXT);
        gongYiQi.setItem(0, Yh.TO_NEXT);
        danYiQi.setItem(0, Yh.TO_NEXT);

        shipin.setItem(0, Yh.TO_NEXT);

        zhanArmor.setItem(53, Yh.BACK_BEFORE);
        gongArmor.setItem(53, Yh.BACK_BEFORE);
        danArmor.setItem(53, Yh.BACK_BEFORE);

        zhanWeapon.setItem(53, Yh.BACK_BEFORE);
        gongWeapon.setItem(53, Yh.BACK_BEFORE);
        danWeapon.setItem(53, Yh.BACK_BEFORE);

        zhanBiWeapon.setItem(53, Yh.BACK_BEFORE);
        gongBiWeapon.setItem(53, Yh.BACK_BEFORE);
        danBiWeapon.setItem(53, Yh.BACK_BEFORE);

        zhanFaBao.setItem(53, Yh.BACK_BEFORE);
        gongFaBao.setItem(53, Yh.BACK_BEFORE);
        danFaBao.setItem(53, Yh.BACK_BEFORE);

        zhanYiQi.setItem(53, Yh.BACK_BEFORE);
        gongYiQi.setItem(53, Yh.BACK_BEFORE);
        danYiQi.setItem(53, Yh.BACK_BEFORE);

        shipin.setItem(53, Yh.BACK_BEFORE);

        zhanArmor2.setItem(53, Yh.BACK_BEFORE);
        gongArmor2.setItem(53, Yh.BACK_BEFORE);
        danArmor2.setItem(53, Yh.BACK_BEFORE);

        zhanWeapon2.setItem(53, Yh.BACK_BEFORE);
        gongWeapon2.setItem(53, Yh.BACK_BEFORE);
        danWeapon2.setItem(53, Yh.BACK_BEFORE);

        zhanBiWeapon2.setItem(53, Yh.BACK_BEFORE);
        gongBiWeapon2.setItem(53, Yh.BACK_BEFORE);
        danBiWeapon2.setItem(53, Yh.BACK_BEFORE);

        zhanFaBao2.setItem(53, Yh.BACK_BEFORE);
        gongFaBao2.setItem(53, Yh.BACK_BEFORE);
        danFaBao2.setItem(53, Yh.BACK_BEFORE);

        zhanYiQi2.setItem(53, Yh.BACK_BEFORE);
        gongYiQi2.setItem(53, Yh.BACK_BEFORE);
        danYiQi2.setItem(53, Yh.BACK_BEFORE);

        shipin2.setItem(53, Yh.BACK_BEFORE);

        recipeAllDan.setItem(0, Yh.TO_NEXT);
        recipeDanDan.setItem(0, Yh.TO_NEXT);

        recipeAllDan.setItem(53, Yh.BACK_BEFORE);
        recipeDanDan.setItem(53, Yh.BACK_BEFORE);
        recipeAllDan2.setItem(53, Yh.BACK_BEFORE);
        recipeDanDan2.setItem(53, Yh.BACK_BEFORE);

        recipeOther.setItem(0,Yh.TO_NEXT);
        recipeOther.setItem(53,Yh.BACK_BEFORE);
        recipeOther2.setItem(53,Yh.BACK_BEFORE);

        ArmorChest.putId();
        ArmorFeet.putId();
        ArmorHead.putId();
        ArmorLeg.putId();

        Weapon.putId();
        BiWeapon.putId();
        Fabao.putId();
        Shipin.putId();
        YiQi.putId();
        Feather.putId();
        Core.putId();
        Ingredient.putId();
        YuanSu.putId();

    }

    public static void updateAllInventories() {
        // Update standalone inventories
        newItemLore(zhanArmor);
        newItemLore(gongArmor);
        newItemLore(danArmor);

        newItemLore(zhanWeapon);
        newItemLore(gongWeapon);
        newItemLore(danWeapon);

        newItemLore(zhanBiWeapon);
        newItemLore(gongBiWeapon);
        newItemLore(danBiWeapon);

        newItemLore(zhanFaBao);
        newItemLore(gongFaBao);
        newItemLore(danFaBao);

        newItemLore(zhanYiQi);
        newItemLore(gongYiQi);
        newItemLore(danYiQi);

        newItemLore(shipin);

        newItemLore(zhanArmor2);
        newItemLore(gongArmor2);
        newItemLore(danArmor2);

        newItemLore(zhanWeapon2);
        newItemLore(gongWeapon2);
        newItemLore(danWeapon2);

        newItemLore(zhanBiWeapon2);
        newItemLore(gongBiWeapon2);
        newItemLore(danBiWeapon2);

        newItemLore(zhanFaBao2);
        newItemLore(gongFaBao2);
        newItemLore(danFaBao2);

        newItemLore(zhanYiQi2);
        newItemLore(gongYiQi2);
        newItemLore(danYiQi2);

        newItemLore(shipin2);

        newItemLore(recipeAllDan);
        newItemLore(recipeDanDan);
        newItemLore(recipeAllDan2);
        newItemLore(recipeDanDan2);

        newItemLore(recipeOther);
        newItemLore(recipeOther2);

        // Update inventories in HashMaps
        zhanarmorContents.values().forEach(Recipe::newItemLore);
        gongarmorContents.values().forEach(Recipe::newItemLore);
        danarmorContents.values().forEach(Recipe::newItemLore);

        zhanweaponContents.values().forEach(Recipe::newItemLore);
        gongweaponContents.values().forEach(Recipe::newItemLore);
        danweaponContents.values().forEach(Recipe::newItemLore);

        zhanbiweaponContents.values().forEach(Recipe::newItemLore);
        gongbiweaponContents.values().forEach(Recipe::newItemLore);
        danbiweaponContents.values().forEach(Recipe::newItemLore);

        zhanfabaoContents.values().forEach(Recipe::newItemLore);
        gongfabaoContents.values().forEach(Recipe::newItemLore);
        danfabaoContents.values().forEach(Recipe::newItemLore);

        zhanyiqiContents.values().forEach(Recipe::newItemLore);
        gongyiqiContents.values().forEach(Recipe::newItemLore);
        danyiqiContents.values().forEach(Recipe::newItemLore);

        shipinContents.values().forEach(Recipe::newItemLore);

        danContents.values().forEach(Recipe::newItemLore);
        dandanContents.values().forEach(Recipe::newItemLore);

        otherContents.values().forEach(Recipe::newItemLore);

        Player player = Bukkit.getPlayer("xiaoxiaoOWO");
        SendInformation.sendMes(player, Component.text("§e[描述修复]§b结束"));
    }


    public static void newItemLore(Inventory inventory) {
        int size = inventory.getSize();
        for (int i = 0; i < size; i++) {
            ItemStack itemStack = inventory.getItem(i);
            if (itemStack == null) {
                continue;
            }
            if (itemStack.getDisplayName().contains("返回上一页")) {
                inventory.setItem(i, Yh.BACK_BEFORE);
            }

            ItemMeta itemMeta = itemStack.getItemMeta();
            PersistentDataContainer pdc = itemMeta.getPersistentDataContainer();
            String id = pdc.getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            ItemStack itemNew = Recipe.idToItem.get(id);
            if (itemNew != null) {
                itemNew.setAmount(itemStack.getAmount());
                inventory.setItem(i, itemNew);
            }
        }

    }

    public static void newItemLorePlayer(PlayerInventory playerInventory) {
        if (!needRenew) {
            return;
        }

        for (ItemStack itemStack : playerInventory.getContents()) {
            if (itemStack == null) {
                continue;
            }
            ItemMeta itemMeta = itemStack.getItemMeta();
            if (itemMeta == null) {
                continue;
            }
            PersistentDataContainer pdc = itemMeta.getPersistentDataContainer();

            String id = pdc.getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
            ItemStack itemNew = Recipe.idToItem.get(id);
            if (itemNew == null) {
                continue;
            }
            List<Component> newlore = itemNew.lore();
            if (newlore == null) {
                continue;
            }
            List<Component> lore = new ArrayList<>(newlore);

            if (pdc.has(DataContainer.enchantid)) {
                if (lore.size() < 3) {
                    return;
                }

                List<Component> loreOld = itemMeta.lore();
                if (loreOld == null) {
                    continue;
                }
                int size = loreOld.size();
                if (size < 3) {
                    continue;
                }
                Component oldInsert = loreOld.get(size - 1);
                Component oldEnchant = loreOld.get(size - 2);
                lore.removeLast();
                lore.removeLast();
                lore.add(oldEnchant);
                lore.add(oldInsert);
                itemMeta.lore(lore);
                itemStack.setItemMeta(itemMeta);
                continue;
            }

            if (pdc.has(DataContainer.insertid)) {
                if (lore.size() < 2) {
                    return;
                }
                List<Component> loreOld = itemMeta.lore();
                if (loreOld == null) {
                    continue;
                }
                int size = loreOld.size();
                if (size < 2) {
                    continue;
                }
                Component oldInsert = loreOld.get(size - 1);
                lore.removeLast();
                lore.add(oldInsert);
                itemMeta.lore(lore);
                itemStack.setItemMeta(itemMeta);
                continue;
            }
            itemMeta.lore(lore);
            itemStack.setItemMeta(itemMeta);


        }
    }


}
