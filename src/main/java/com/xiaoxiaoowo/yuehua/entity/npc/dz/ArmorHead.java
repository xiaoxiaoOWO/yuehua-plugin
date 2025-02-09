package com.xiaoxiaoowo.yuehua.entity.npc.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.Core;
import com.xiaoxiaoowo.yuehua.items.dz.TehuaShui;
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

public final class ArmorHead {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 76.5, 46, 145.5, -180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("锻盔师").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要12个交易项目
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
            MerchantRecipe recipeDefault13 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault13.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault13);
            MerchantRecipe recipeDefault14 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault14.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault14);
            MerchantRecipe recipeDefault15 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault15.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault15);
            MerchantRecipe recipeDefault16 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault16.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault16);

            it.setRecipes(recipesDefault);


            ItemStack core2 = Core.CORE2.clone();
            ItemStack core3 = Core.CORE3.clone();
            ItemStack core4 = Core.CORE4.clone();
            ItemStack core5 = Core.CORE5.clone();

            core2.setAmount(2);
            core3.setAmount(3);
            core4.setAmount(4);
            core5.setAmount(5);

            ItemStack zhanTou2 = Core.zhanTou2.clone();
            ItemStack zhanTou3 = Core.zhanTou3.clone();
            ItemStack zhanTou4 = Core.zhanTou4.clone();
            ItemStack zhanTou5 = Core.zhanTou5.clone();

            zhanTou2.setAmount(1);
            zhanTou3.setAmount(1);
            zhanTou4.setAmount(1);
            zhanTou5.setAmount(1);


            ItemStack gongTou2 = Core.gongTou2.clone();
            ItemStack gongTou3 = Core.gongTou3.clone();
            ItemStack gongTou4 = Core.gongTou4.clone();
            ItemStack gongTou5 = Core.gongTou5.clone();

            gongTou2.setAmount(1);
            gongTou3.setAmount(1);
            gongTou4.setAmount(1);
            gongTou5.setAmount(1);

            ItemStack danTou2 = Core.danTou2.clone();
            ItemStack danTou3 = Core.danTou3.clone();
            ItemStack danTou4 = Core.danTou4.clone();
            ItemStack danTou5 = Core.danTou5.clone();

            danTou2.setAmount(1);
            danTou3.setAmount(1);
            danTou4.setAmount(1);
            danTou5.setAmount(1);

            ItemStack shui2 = TehuaShui.fangju2.clone();
            ItemStack shui3 = TehuaShui.fangju3.clone();
            ItemStack shui4 = TehuaShui.fangju4.clone();
            ItemStack shui5 = TehuaShui.fangju5.clone();

            shui2.setAmount(1);
            shui3.setAmount(1);
            shui4.setAmount(1);
            shui5.setAmount(1);

            MerchantRecipe recipe0 = new MerchantRecipe(zhanTou2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(core2);
            recipe0.addIngredient(shui2);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(zhanTou3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(core3);
            recipe1.addIngredient(shui3);
            it.setRecipe(1,recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(zhanTou4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(core4);
            recipe2.addIngredient(shui4);
            it.setRecipe(2,recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(zhanTou5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(core5);
            recipe3.addIngredient(shui5);
            it.setRecipe(3,recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(gongTou2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(core2);
            recipe4.addIngredient(shui2);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(gongTou3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(core3);
            recipe5.addIngredient(shui3);
            it.setRecipe(5,recipe5);

            MerchantRecipe recipe6 = new MerchantRecipe(gongTou4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(core4);
            recipe6.addIngredient(shui4);
            it.setRecipe(6,recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(gongTou5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(core5);
            recipe7.addIngredient(shui5);
            it.setRecipe(7,recipe7);

            MerchantRecipe recipe8 = new MerchantRecipe(danTou2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(core2);
            recipe8.addIngredient(shui2);
            it.setRecipe(8,recipe8);

            MerchantRecipe recipe9 = new MerchantRecipe(danTou3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(core3);
            recipe9.addIngredient(shui3);
            it.setRecipe(9,recipe9);

            MerchantRecipe recipe10 = new MerchantRecipe(danTou4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe10.addIngredient(core4);
            recipe10.addIngredient(shui4);
            it.setRecipe(10,recipe10);

            MerchantRecipe recipe11 = new MerchantRecipe(danTou5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe11.addIngredient(core5);
            recipe11.addIngredient(shui5);
            it.setRecipe(11,recipe11);

            MerchantRecipe recipe12 = new MerchantRecipe(Core.touSp2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe12.addIngredient(core2);
            recipe12.addIngredient(shui2);
            it.setRecipe(12,recipe12);

            MerchantRecipe recipe13 = new MerchantRecipe(Core.touSp3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe13.addIngredient(core3);
            recipe13.addIngredient(shui3);
            it.setRecipe(13,recipe13);

            MerchantRecipe recipe14 = new MerchantRecipe(Core.touSp4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe14.addIngredient(core4);
            recipe14.addIngredient(shui4);
            it.setRecipe(14,recipe14);

            MerchantRecipe recipe15 = new MerchantRecipe(Core.touSp5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe15.addIngredient(core5);
            recipe15.addIngredient(shui5);
            it.setRecipe(15,recipe15);


        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:desert\"}");
    }
}
