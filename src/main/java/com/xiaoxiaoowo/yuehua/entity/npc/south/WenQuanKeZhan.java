package com.xiaoxiaoowo.yuehua.entity.npc.south;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
import com.xiaoxiaoowo.yuehua.items.dz.*;
import com.xiaoxiaoowo.yuehua.items.other.Collection;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class WenQuanKeZhan {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -461.5, 95, 359.5, -90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("温泉客栈的大老板").color(NamedTextColor.AQUA));
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
            MerchantRecipe recipeDefault8 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault8.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault8);
            it.setRecipes(recipesDefault);


            ItemStack gongpin = Collection.WEN_QUAN_KE_ZHAN.clone();

            gongpin.setAmount(64);
            MerchantRecipe recipe0 = new MerchantRecipe(PINZHENG.qkd10Unlock, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(gongpin);
            it.setRecipe(0, recipe0);

            gongpin.setAmount(50);
            MerchantRecipe recipe2 = new MerchantRecipe(TehuaShui.fabao3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(gongpin);
            it.setRecipe(1, recipe2);

            gongpin.setAmount(4);
            ItemStack huixue3 = Food.huixue_3.clone();
            huixue3.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(gongpin);
            it.setRecipe(2, recipe3);

            gongpin.setAmount(4);
            MerchantRecipe recipe4 = new MerchantRecipe(YuShi.XUE_SE_SHI1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gongpin);
            it.setRecipe(3, recipe4);

            gongpin.setAmount(5);
            MerchantRecipe recipe5 = new MerchantRecipe(Ingredient.WAN_YUE_YIN, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(gongpin);
            it.setRecipe(4, recipe5);

            gongpin.setAmount(2);
            ItemStack huixue2 = Food.huixue_2.clone();
            huixue2.setAmount(6);
            MerchantRecipe recipe6 = new MerchantRecipe(huixue2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(gongpin);
            it.setRecipe(5, recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(FuLing.zhusha, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(gongpin);
            it.setRecipe(6, recipe7);

            gongpin.setAmount(1);
            ItemStack tu = YuanSu.jin.clone();
            tu.setAmount(6);
            MerchantRecipe recipe8 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(gongpin);
            it.setRecipe(7, recipe8);

            ItemStack buyItem = new ItemStack(Material.LIME_DYE, 1);
            buyItem.editMeta(meta -> {
                meta.displayName(Component.text("§b温泉客栈的大老板"));
                meta.lore(List.of(Component.text("§7§o哎呀呀,现在沙漠边境越来越难看到你们这些年轻人了.这里是有名的温泉客栈情报屋。"),
                        Component.text("§7§o怎么样？最近缺人手,想不想来做点工作？工资不错的喔～或是我们客栈也专门贩卖各种情报,有没有兴趣啊？")));
            });

            ItemStack sellItem = new ItemStack(Material.LIME_DYE, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.text("§b温泉客栈的大老板"));
                meta.lore(List.of(Component.text("§7§o不管是要工资报酬还是想要情报,都请去附近沙漠的怪物身上拿些补给品来吧.最近客栈都没什么行商经过,补给品快要不够用了呢.")));
            });

            MerchantRecipe firstRecipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            firstRecipe.addIngredient(buyItem);

            List<MerchantRecipe> recipes = new ArrayList<>(it.getRecipes());
            recipes.addFirst(firstRecipe);
            it.setRecipes(recipes);


        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:desert\"}");
    }
}
