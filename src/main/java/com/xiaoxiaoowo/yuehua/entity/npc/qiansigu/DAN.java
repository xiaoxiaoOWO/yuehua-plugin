package com.xiaoxiaoowo.yuehua.entity.npc.qiansigu;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.items.other.Money;
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

public final class DAN {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -733.5, 102, 505.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("千思谷炼丹师").color(NamedTextColor.AQUA));
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

            ItemStack tongqian = Money.tongQian.clone();
            ItemStack yinyuan = Money.jinYuanBao.clone();
            ItemStack huixue3 = Food.huixue_3.clone();
            ItemStack huixue4 = Food.huixue_4.clone();
            ItemStack jiedu3 = Food.jiedu_3.clone();
            ItemStack jiedu4 = Food.jiedu_4.clone();

            huixue3.setAmount(1);
            huixue4.setAmount(1);
            jiedu3.setAmount(1);
            jiedu4.setAmount(1);

            tongqian.setAmount(3);
            yinyuan.setAmount(3);
            MerchantRecipe recipe0 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(yinyuan);
            recipe0.addIngredient(tongqian);
            it.setRecipe(0, recipe0);

            yinyuan.setAmount(11);
            MerchantRecipe recipe1 = new MerchantRecipe(huixue4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(yinyuan);
            it.setRecipe(1, recipe1);

            tongqian.setAmount(9);
            MerchantRecipe recipe2 = new MerchantRecipe(jiedu3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(tongqian);
            it.setRecipe(2, recipe2);


            tongqian.setAmount(27);
            MerchantRecipe recipe3 = new MerchantRecipe(jiedu4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(tongqian);
            it.setRecipe(3, recipe3);



        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
