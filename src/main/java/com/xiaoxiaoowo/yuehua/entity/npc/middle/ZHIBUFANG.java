package com.xiaoxiaoowo.yuehua.entity.npc.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
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

public final class ZHIBUFANG {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 34.5, 47, -123.5, -90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("织布坊掌柜").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要5个交易项目
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
            it.setRecipes(recipesDefault);


            ItemStack qkd1 = PINZHENG.qkd1Unlock.clone();
            ItemStack qkd2 = PINZHENG.qkd2Unlock.clone();
            ItemStack qkd3 = PINZHENG.qkd3Unlock.clone();
            ItemStack qkd4 = PINZHENG.qkd4Unlock.clone();

            ItemStack hunyuandai = PINZHENG.hunyuandaiUnlock.clone();

            qkd1.setAmount(1);
            qkd2.setAmount(1);
            qkd3.setAmount(1);
            qkd4.setAmount(1);
            hunyuandai.setAmount(1);

            ItemStack jinyuanbao = Money.yinPiao.clone();
            ItemStack yinpiao = Money.zuanShi.clone();

            jinyuanbao.setAmount(1);
            MerchantRecipe recipe0 = new MerchantRecipe(qkd1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(jinyuanbao);
            it.setRecipe(0,recipe0);

            jinyuanbao.setAmount(3);
            MerchantRecipe recipe1 = new MerchantRecipe(qkd2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(jinyuanbao);
            it.setRecipe(1,recipe1);

            yinpiao.setAmount(1);
            MerchantRecipe recipe2 = new MerchantRecipe(qkd3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(yinpiao);
            it.setRecipe(2,recipe2);

            yinpiao.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(qkd4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(yinpiao);
            it.setRecipe(3,recipe3);

            yinpiao.setAmount(5);
            MerchantRecipe recipe4 = new MerchantRecipe(hunyuandai, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(yinpiao);
            it.setRecipe(4,recipe4);




        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:armorer\",level:100,type:\"minecraft:jungle\"}");
    }
}
