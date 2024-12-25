package com.xiaoxiaoowo.yuehua.entity.npc.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
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

public final class Ys2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 82.5, 46, 152.5, -90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("元素浓缩师").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要10个交易项目
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
            it.setRecipes(recipesDefault);


            ItemStack jin = YuanSu.jin.clone();
            ItemStack mu = YuanSu.mu.clone();
            ItemStack shui = YuanSu.shui.clone();
            ItemStack huo = YuanSu.huo.clone();
            ItemStack tu = YuanSu.tu.clone();

            jin.setAmount(32);
            mu.setAmount(32);
            shui.setAmount(32);
            huo.setAmount(32);
            tu.setAmount(32);

            ItemStack jin_jinlian = YuanSu.concentrated_jin.clone();
            ItemStack mu_jinlian = YuanSu.concentrated_mu.clone();
            ItemStack shui_jinlian = YuanSu.concentrated_shui.clone();
            ItemStack huo_jinlian = YuanSu.concentrated_huo.clone();
            ItemStack tu_jinlian = YuanSu.concentrated_tu.clone();

            ItemStack tongqian = Money.tongQian.clone();
            tongqian.setAmount(5);

            MerchantRecipe recipe0 = new MerchantRecipe(jin_jinlian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(jin);
            recipe0.addIngredient(tongqian);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(mu_jinlian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(mu);
            recipe1.addIngredient(tongqian);
            it.setRecipe(1,recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(shui_jinlian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(shui);
            recipe2.addIngredient(tongqian);
            it.setRecipe(2,recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(huo_jinlian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(huo);
            recipe3.addIngredient(tongqian);
            it.setRecipe(3,recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(tu_jinlian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(tu);
            recipe4.addIngredient(tongqian);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(jin, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(jin_jinlian);
            recipe5.addIngredient(tongqian);
            it.setRecipe(5,recipe5);

            MerchantRecipe recipe6 = new MerchantRecipe(mu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(mu_jinlian);
            recipe6.addIngredient(tongqian);
            it.setRecipe(6,recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(shui, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(shui_jinlian);
            recipe7.addIngredient(tongqian);
            it.setRecipe(7,recipe7);

            MerchantRecipe recipe8 = new MerchantRecipe(huo, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(huo_jinlian);
            recipe8.addIngredient(tongqian);
            it.setRecipe(8,recipe8);

            MerchantRecipe recipe9 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(tu_jinlian);
            recipe9.addIngredient(tongqian);
            it.setRecipe(9,recipe9);



        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
