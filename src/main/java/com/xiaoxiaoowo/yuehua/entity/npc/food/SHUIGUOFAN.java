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

public final class SHUIGUOFAN {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 119.5, 46, 186.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(false);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("水果小贩").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要8个交易项目
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
            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            recipesDefault.add(recipeDefault6);
            recipesDefault.add(recipeDefault7);
            recipesDefault.add(recipeDefault8);
            recipesDefault.add(recipeDefault9);
            it.setRecipes(recipesDefault);

            ItemStack tongqian = Money.tongQian.clone();
            ItemStack pinguo = Food.pinGuo.clone();
            ItemStack xiguapian = Food.xiguapian.clone();
            ItemStack qinpinguo = Food.qinpinGuo.clone();
            ItemStack putao = Food.putao.clone();
            ItemStack li = Food.li.clone();
            ItemStack xiangjiao = Food.xiangjiao.clone();
            ItemStack caomei = Food.caomei.clone();
            ItemStack bolo = Food.bolo.clone();
            ItemStack fengmi = Food.fengmi.clone();


            tongqian.setAmount(4);
            pinguo.setAmount(5);
            MerchantRecipe recipe0 = new MerchantRecipe(pinguo, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(tongqian);
            it.setRecipe(0, recipe0);


            tongqian.setAmount(6);
            xiguapian.setAmount(5);
            MerchantRecipe recipe1 = new MerchantRecipe(xiguapian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(tongqian);
            it.setRecipe(1, recipe1);

            tongqian.setAmount(8);
            qinpinguo.setAmount(5);
            MerchantRecipe recipe2 = new MerchantRecipe(qinpinguo, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(tongqian);
            it.setRecipe(2, recipe2);

            tongqian.setAmount(10);
            putao.setAmount(5);
            MerchantRecipe recipe3 = new MerchantRecipe(putao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(tongqian);
            it.setRecipe(3, recipe3);

            tongqian.setAmount(12);
            li.setAmount(5);
            MerchantRecipe recipe4 = new MerchantRecipe(li, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(tongqian);
            it.setRecipe(4, recipe4);

            tongqian.setAmount(14);
            xiangjiao.setAmount(5);
            MerchantRecipe recipe5 = new MerchantRecipe(xiangjiao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(tongqian);
            it.setRecipe(5, recipe5);

            tongqian.setAmount(16);
            caomei.setAmount(5);
            MerchantRecipe recipe6 = new MerchantRecipe(caomei, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(tongqian);
            it.setRecipe(6, recipe6);

            tongqian.setAmount(18);
            bolo.setAmount(5);
            MerchantRecipe recipe7 = new MerchantRecipe(bolo, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(tongqian);
            it.setRecipe(7, recipe7);

            tongqian.setAmount(40);
            fengmi.setAmount(5);
            MerchantRecipe recipe8 = new MerchantRecipe(fengmi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(tongqian);
            it.setRecipe(8, recipe8);







        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
