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

public final class XUESHIPIN {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 221.5, 46, 74.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("三学饰品核心锻造师").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要12个交易项目
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
            MerchantRecipe recipeDefault5 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault5.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault5);
            MerchantRecipe recipeDefault6 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault6.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault6);
            MerchantRecipe recipeDefault7 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault7.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault7);
            MerchantRecipe recipeDefault8 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault8.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault8);
            MerchantRecipe recipeDefault9 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault9.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault9);
            it.setRecipes(recipesDefault);



            ItemStack core3 = Core.CORE3.clone();
            ItemStack core4 = Core.CORE4.clone();
            ItemStack core5 = Core.CORE5.clone();


            core3.setAmount(3);
            core4.setAmount(4);
            core5.setAmount(5);

            ItemStack shui2 = TehuaShui.shipin2.clone();
            ItemStack shui3 = TehuaShui.shipin3.clone();
            ItemStack shui4 = TehuaShui.shipin4.clone();
            ItemStack shui5 = TehuaShui.shipin5.clone();

            shui2.setAmount(1);
            shui3.setAmount(1);
            shui4.setAmount(1);
            shui5.setAmount(1);

            ItemStack kaishandao = Core.CHAN_DING_FA_JIE.clone();
            kaishandao.setAmount(1);
            ItemStack jutongzhanchui = Core.CHAN_DING_SHENG_JIE.clone();
            jutongzhanchui.setAmount(1);
            ItemStack pokongfu = Core.CHAN_DING_FO_JIE.clone();
            pokongfu.setAmount(1);
            ItemStack sanbaoyuri = Core.ZHI_HUI_FA_JIE.clone();
            sanbaoyuri.setAmount(1);
            ItemStack qintongjian = Core.ZHI_HUI_SHENG_JIE.clone();
            qintongjian.setAmount(1);
            ItemStack chitongjian = Core.ZHI_HUI_FO_JIE.clone();
            chitongjian.setAmount(1);
            ItemStack taiji = Core.CHI_JIE_FA_JIE.clone();
            taiji.setAmount(1);
            ItemStack kunlunfeixianjian = Core.CHI_JIE_SHENG_JIE.clone();
            kunlunfeixianjian.setAmount(1);
            ItemStack yinyueqiang = Core.CHI_JIE_FO_JIE.clone();
            yinyueqiang.setAmount(1);

            MerchantRecipe recipe0 = new MerchantRecipe(kaishandao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(core3);
            recipe0.addIngredient(shui3);
            it.setRecipe(0, recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(jutongzhanchui, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(core4);
            recipe1.addIngredient(shui4);
            it.setRecipe(1, recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(pokongfu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(core5);
            recipe2.addIngredient(shui5);
            it.setRecipe(2, recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(sanbaoyuri, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(core3);
            recipe3.addIngredient(shui3);
            it.setRecipe(3, recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(qintongjian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(core4);
            recipe4.addIngredient(shui4);
            it.setRecipe(4, recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(chitongjian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(core5);
            recipe5.addIngredient(shui5);
            it.setRecipe(5, recipe5);

            MerchantRecipe recipe6 = new MerchantRecipe(taiji, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(core3);
            recipe6.addIngredient(shui3);
            it.setRecipe(6, recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(kunlunfeixianjian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(core4);
            recipe7.addIngredient(shui4);
            it.setRecipe(7, recipe7);

            MerchantRecipe recipe8 = new MerchantRecipe(yinyueqiang, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(core5);
            recipe8.addIngredient(shui5);
            it.setRecipe(8, recipe8);


        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:snow\"}");
    }
}
