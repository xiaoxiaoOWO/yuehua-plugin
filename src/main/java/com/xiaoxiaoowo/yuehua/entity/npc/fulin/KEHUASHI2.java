package com.xiaoxiaoowo.yuehua.entity.npc.fulin;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.itemstack.dz.FuLing;
import com.xiaoxiaoowo.yuehua.itemstack.other.Other;
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

public final class KEHUASHI2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3180.5, 120, 886.5, 90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("中级刻画师").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要13个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();
            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault2 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault2.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault3 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault3.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault4 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault4.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault5 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault5.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault6 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault6.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault7 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault7.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault8 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault8.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault9 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault9.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault10 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault10.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault11 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault11.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault12 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault12.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault13 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault13.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            recipesDefault.add(recipeDefault6);
            recipesDefault.add(recipeDefault7);
            recipesDefault.add(recipeDefault8);
            recipesDefault.add(recipeDefault9);
            recipesDefault.add(recipeDefault10);
            recipesDefault.add(recipeDefault11);
            recipesDefault.add(recipeDefault12);
            recipesDefault.add(recipeDefault13);
            it.setRecipes(recipesDefault);


            ItemStack zhusha = FuLing.zhusha.clone();
            zhusha.setAmount(36);
            ItemStack shouhu1 = FuLing.shouhu2.clone();
            ItemStack yankai1 = FuLing.yankai2.clone();
            ItemStack luoshi1 = FuLing.luoshi2.clone();
            ItemStack wanfa1 = FuLing.wanfa2.clone();
            ItemStack yuti1 = FuLing.yuti2.clone();
            ItemStack liren1 = FuLing.liren2.clone();
            ItemStack qianggong1 = FuLing.qiangong2.clone();
            ItemStack qiangren1 = FuLing.qiangren2.clone();
            ItemStack shuangjia1 = FuLing.shuangjia2.clone();
            ItemStack huixin1 = FuLing.huixin2.clone();
            ItemStack guantong1 = FuLing.guantong2.clone();
            ItemStack juli1 = FuLing.juli2.clone();
            ItemStack bujin1 = FuLing.bujin2.clone();


            MerchantRecipe recipe0 = new MerchantRecipe(shouhu1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(zhusha);
            MerchantRecipe recipe1 = new MerchantRecipe(yankai1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(zhusha);
            MerchantRecipe recipe2 = new MerchantRecipe(luoshi1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(zhusha);
            MerchantRecipe recipe3 = new MerchantRecipe(wanfa1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(zhusha);
            MerchantRecipe recipe4 = new MerchantRecipe(yuti1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(zhusha);
            MerchantRecipe recipe5 = new MerchantRecipe(liren1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(zhusha);
            MerchantRecipe recipe6 = new MerchantRecipe(qianggong1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(zhusha);
            MerchantRecipe recipe7 = new MerchantRecipe(qiangren1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(zhusha);
            MerchantRecipe recipe8 = new MerchantRecipe(shuangjia1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(zhusha);
            MerchantRecipe recipe9 = new MerchantRecipe(huixin1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(zhusha);
            MerchantRecipe recipe10 = new MerchantRecipe(guantong1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe10.addIngredient(zhusha);
            MerchantRecipe recipe11 = new MerchantRecipe(juli1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe11.addIngredient(zhusha);
            MerchantRecipe recipe12 = new MerchantRecipe(bujin1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe12.addIngredient(zhusha);

            it.setRecipe(0, recipe0);
            it.setRecipe(1, recipe1);
            it.setRecipe(2, recipe2);
            it.setRecipe(3, recipe3);
            it.setRecipe(4, recipe4);
            it.setRecipe(5, recipe5);
            it.setRecipe(6, recipe6);
            it.setRecipe(7, recipe7);
            it.setRecipe(8, recipe8);
            it.setRecipe(9, recipe9);
            it.setRecipe(10, recipe10);
            it.setRecipe(11, recipe11);
            it.setRecipe(12, recipe12);

        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:taiga\"}");
    }
}
