package com.xiaoxiaoowo.yuehua.entity.npc.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.itemstack.dz.Core;
import com.xiaoxiaoowo.yuehua.itemstack.dz.TehuaShui;
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

public final class Fabao2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 194.5, 54, 86.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("进阶法宝核心锻造师").color(NamedTextColor.AQUA));
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
            it.setRecipes(recipesDefault);



            ItemStack core3 = Core.CORE4.clone();
            core3.setAmount(4);
            ItemStack shui3 = TehuaShui.fabao4.clone();
            shui3.setAmount(1);

            ItemStack zhaoyaojing = Core.YUFUCHEN.clone();
            zhaoyaojing.setAmount(1);
            ItemStack juedouling = Core.LEIMINGGU.clone();
            juedouling.setAmount(1);
            ItemStack douqishi = Core.PANGUANBI.clone();
            douqishi.setAmount(1);
            ItemStack diaohungan = Core.SHELINZHU.clone();
            diaohungan.setAmount(1);
            ItemStack ruiyingyan = Core.DUOHUNTANG.clone();
            ruiyingyan.setAmount(1);
            ItemStack lvyexianzong = Core.QINGNVHANSHUANG.clone();
            lvyexianzong.setAmount(1);
            ItemStack buhunwang = Core.YANGSHOUJIAN.clone();
            buhunwang.setAmount(1);
            ItemStack kuyeling = Core.LUOBEIJINPIN.clone();
            kuyeling.setAmount(1);
            ItemStack luanshengu = Core.JINGULIAN.clone();
            luanshengu.setAmount(1);

            MerchantRecipe recipe0 = new MerchantRecipe(zhaoyaojing, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(core3);
            recipe0.addIngredient(shui3);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(juedouling, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(core3);
            recipe1.addIngredient(shui3);
            it.setRecipe(1,recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(douqishi, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(core3);
            recipe2.addIngredient(shui3);
            it.setRecipe(2,recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(diaohungan, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(core3);
            recipe3.addIngredient(shui3);
            it.setRecipe(3,recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(ruiyingyan, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(core3);
            recipe4.addIngredient(shui3);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(lvyexianzong, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(core3);
            recipe5.addIngredient(shui3);
            it.setRecipe(5,recipe5);

            MerchantRecipe recipe6 = new MerchantRecipe(buhunwang, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(core3);
            recipe6.addIngredient(shui3);
            it.setRecipe(6,recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(kuyeling, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(core3);
            recipe7.addIngredient(shui3);
            it.setRecipe(7,recipe7);

            MerchantRecipe recipe8 = new MerchantRecipe(luanshengu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(core3);
            recipe8.addIngredient(shui3);
            it.setRecipe(8,recipe8);





        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:snow\"}");
    }
}
