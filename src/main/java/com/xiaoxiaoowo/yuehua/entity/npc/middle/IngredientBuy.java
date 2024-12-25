package com.xiaoxiaoowo.yuehua.entity.npc.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.Core;
import com.xiaoxiaoowo.yuehua.items.dz.Ingredient;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.MoneyLoot;
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

public final class IngredientBuy {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 89.5, 46, 134.5, 90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("锻材收购员").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要8个交易项目
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
            MerchantRecipe recipeDefault10 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault10.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault10);
            MerchantRecipe recipeDefault11 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault11.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault11);
            MerchantRecipe recipeDefault12 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault12.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault12);
            it.setRecipes(recipesDefault);




            ItemStack jinyuanbao = Money.jinYuanBao.clone();
            ItemStack yinpiao = Money.yinPiao.clone();





            jinyuanbao.setAmount(3);
            MerchantRecipe recipe0 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(Ingredient.BI_SHI_SUI);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(Ingredient.AO_LANG_PI);
            it.setRecipe(1,recipe1);

            jinyuanbao.setAmount(5);
            MerchantRecipe recipe2 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(Ingredient.CHI_TONG_DING);
            it.setRecipe(2,recipe2);


            MerchantRecipe recipe3 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(Ingredient.BA_JIAO_YE);
            it.setRecipe(3,recipe3);

            yinpiao.setAmount(1);
            MerchantRecipe recipe4 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(Ingredient.XUAN_TIE_DING);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(Ingredient.LIU_YIN_CHOU);
            it.setRecipe(5,recipe5);

            yinpiao.setAmount(2);


            MerchantRecipe recipe6 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(Ingredient.LING_YU_JIAN);
            it.setRecipe(6,recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(Ingredient.NIE_PAN_YU);
            it.setRecipe(7,recipe7);

            jinyuanbao.setAmount(3);
            MerchantRecipe recipe8 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(Core.CORE2);
            it.setRecipe(8,recipe8);

            jinyuanbao.setAmount(5);
            MerchantRecipe recipe9 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(Core.CORE3);
            it.setRecipe(9,recipe9);


            yinpiao.setAmount(1);
            MerchantRecipe recipe10 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe10.addIngredient(Core.CORE4);
            it.setRecipe(10,recipe10);


            yinpiao.setAmount(2);
            MerchantRecipe recipe11 = new MerchantRecipe(yinpiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe11.addIngredient(Core.CORE5);
            it.setRecipe(11,recipe11);





        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:desert\"}");
    }
}
