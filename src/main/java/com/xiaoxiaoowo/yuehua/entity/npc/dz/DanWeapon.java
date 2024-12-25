package com.xiaoxiaoowo.yuehua.entity.npc.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.Core;
import com.xiaoxiaoowo.yuehua.items.dz.TehuaShui;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class DanWeapon {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 88.5, 46, 140.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("铸炉师").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要4个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();
            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            MerchantRecipe recipeDefault2 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault2.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault2);
            MerchantRecipe recipeDefault3 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault3.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault3);
            MerchantRecipe recipeDefault4 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault4.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault4);
            it.setRecipes(recipesDefault);


            ItemStack core2 = Core.CORE2.clone();
            ItemStack core3 = Core.CORE3.clone();
            ItemStack core4 = Core.CORE4.clone();
            ItemStack core5 = Core.CORE5.clone();

            core2.setAmount(2);
            core3.setAmount(3);
            core4.setAmount(4);
            core5.setAmount(5);

            ItemStack shui2 = TehuaShui.wuqi2.clone();
            ItemStack shui3 = TehuaShui.wuqi3.clone();
            ItemStack shui4 = TehuaShui.wuqi4.clone();
            ItemStack shui5 = TehuaShui.wuqi5.clone();

            shui2.setAmount(1);
            shui3.setAmount(1);
            shui4.setAmount(1);
            shui5.setAmount(1);

            ItemStack kaishandao = Core.QIN_TONG_GUO.clone();
            kaishandao.setAmount(1);
            ItemStack jutongzhanchui = Core.LIAN_DAN_LU.clone();
            jutongzhanchui.setAmount(1);
            ItemStack pokongfu = Core.SUO_HUN_LU.clone();
            pokongfu.setAmount(1);
            ItemStack sanbaoyuri = Core.QI_SHA_DING.clone();
            sanbaoyuri.setAmount(1);


            MerchantRecipe recipe0 = new MerchantRecipe(kaishandao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(core2);
            recipe0.addIngredient(shui2);
            it.setRecipe(0, recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(jutongzhanchui, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(core3);
            recipe1.addIngredient(shui3);
            it.setRecipe(1, recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(pokongfu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(core4);
            recipe2.addIngredient(shui4);
            it.setRecipe(2, recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(sanbaoyuri, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(core5);
            recipe3.addIngredient(shui5);
            it.setRecipe(3, recipe3);




        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:desert\"}");
    }
}
