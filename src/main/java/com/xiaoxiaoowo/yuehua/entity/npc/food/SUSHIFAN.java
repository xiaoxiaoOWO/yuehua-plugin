package com.xiaoxiaoowo.yuehua.entity.npc.food;

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

public final class SUSHIFAN {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 147.5, 46, 184.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(false);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("素食小贩").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要6个交易项目
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
            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            it.setRecipes(recipesDefault);

            ItemStack tongqian = Money.tongQian.clone();
            ItemStack huluobo = Food.huluobo.clone();
            ItemStack baoZi = Food.baoZi.clone();
            ItemStack kaoDiGua = Food.kaoDiGua.clone();
            ItemStack xiBing = Food.xiBing.clone();
            ItemStack foTiaoQiang = Food.foTiaoQiang.clone();


            tongqian.setAmount(1);
            huluobo.setAmount(5);
            MerchantRecipe recipe0 = new MerchantRecipe(huluobo, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(tongqian);
            it.setRecipe(0, recipe0);



            tongqian.setAmount(2);
            baoZi.setAmount(5);
            MerchantRecipe recipe2 = new MerchantRecipe(baoZi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(tongqian);
            it.setRecipe(1, recipe2);

            tongqian.setAmount(3);
            kaoDiGua.setAmount(5);
            MerchantRecipe recipe3 = new MerchantRecipe(kaoDiGua, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(tongqian);
            it.setRecipe(2, recipe3);

            tongqian.setAmount(4);
            xiBing.setAmount(5);
            MerchantRecipe recipe4 = new MerchantRecipe(xiBing, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(tongqian);
            it.setRecipe(3, recipe4);

            tongqian.setAmount(5);
            foTiaoQiang.setAmount(5);
            MerchantRecipe recipe5 = new MerchantRecipe(foTiaoQiang, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(tongqian);
            it.setRecipe(4, recipe5);








        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
