package com.xiaoxiaoowo.yuehua.entity.npc.east;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.Ingredient;
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

public final class EastIngerBue {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 586.5, 33, 61.5, 90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("珍品收藏家").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要9个交易项目
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
            it.setRecipes(recipesDefault);




            ItemStack tongqian = Money.jinYuanBao.clone();



            tongqian.setAmount(1);
            MerchantRecipe recipe0 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(Ingredient.DU_ZHU_YA);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(Ingredient.HUANG_TONG_KUANG);
            it.setRecipe(1,recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(Ingredient.BAI_SHE_LIN);
            it.setRecipe(2,recipe2);


            MerchantRecipe recipe3 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(Ingredient.KU_XIU_GU);
            it.setRecipe(3,recipe3);

            tongqian.setAmount(3);
            MerchantRecipe recipe4 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(Ingredient.ZHU_WANG_YAN);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(Ingredient.HE_SHUI_LING);
            it.setRecipe(5,recipe5);


            MerchantRecipe recipe6 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(Ingredient.MENG_DU_SU);
            it.setRecipe(6,recipe6);





        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}