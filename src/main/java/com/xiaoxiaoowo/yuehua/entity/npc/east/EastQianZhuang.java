package com.xiaoxiaoowo.yuehua.entity.npc.east;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.Book;
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

public final class EastQianZhuang {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 527.5, 33, 16.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("钱庄老板").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要7个交易项目
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
            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            recipesDefault.add(recipeDefault6);
            recipesDefault.add(recipeDefault7);
            it.setRecipes(recipesDefault);


            MerchantRecipe recipe = new MerchantRecipe(Book.QIAN_ZHUANG, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(Other.NPC_PAOPAO);
            it.setRecipe(0, recipe);


            ItemStack tongQian = Money.tongQian.clone();
            ItemStack jinYuanBao = Money.jinYuanBao.clone();
            ItemStack yinPiao = Money.yinPiao.clone();
            ItemStack zuanShi = Money.zuanShi.clone();


            tongQian.setAmount(10);
            jinYuanBao.setAmount(1);
            MerchantRecipe recipe1 = new MerchantRecipe(jinYuanBao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(tongQian);
            MerchantRecipe recipe4 = new MerchantRecipe(tongQian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(jinYuanBao);
            it.setRecipe(1, recipe1);
            it.setRecipe(2, recipe4);


            jinYuanBao.setAmount(10);
            yinPiao.setAmount(1);
            MerchantRecipe recipe2 = new MerchantRecipe(yinPiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(jinYuanBao);
            MerchantRecipe recipe5 = new MerchantRecipe(jinYuanBao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(yinPiao);
            it.setRecipe(3, recipe2);
            it.setRecipe(4, recipe5);


            yinPiao.setAmount(10);
            zuanShi.setAmount(1);
            MerchantRecipe recipe3 = new MerchantRecipe(zuanShi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(yinPiao);
            MerchantRecipe recipe6 = new MerchantRecipe(yinPiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(zuanShi);
            it.setRecipe(5, recipe3);
            it.setRecipe(6, recipe6);

        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:taiga\"}");
    }
}
