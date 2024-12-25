package com.xiaoxiaoowo.yuehua.entity.npc.tea;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.*;
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

public final class XIAOER {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 62.5, 47, 110.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("茶馆小二").color(NamedTextColor.AQUA));
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

            ItemStack jinyuanbao = Money.yinPiao.clone();
            jinyuanbao.setAmount(5);

            MerchantRecipe recipe0 = new MerchantRecipe(Food.tieguanyin, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(jinyuanbao);
            it.setRecipe(0, recipe0);


            MerchantRecipe recipe1 = new MerchantRecipe(Food.puer, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(jinyuanbao);
            it.setRecipe(1, recipe1);


            MerchantRecipe recipe2 = new MerchantRecipe(Food.maojian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(jinyuanbao);
            it.setRecipe(2, recipe2);


            MerchantRecipe recipe3 = new MerchantRecipe(Food.longjin, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(jinyuanbao);
            it.setRecipe(3, recipe3);





        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
