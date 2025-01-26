package com.xiaoxiaoowo.yuehua.entity.npc.chat.yao;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.*;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class YaoTong1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 2649, 96, 863, -180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.tong1"));
            it.setCustomNameVisible(true);

            //需要1个交易项目
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

            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            recipesDefault.add(recipeDefault6);
            recipesDefault.add(recipeDefault7);
            recipesDefault.add(recipeDefault8);
            it.setRecipes(recipesDefault);

            ItemStack sellItem = new ItemStack(Material.NETHER_WART, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newchange"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newchange")
                ));
            });


            MerchantRecipe recipe1 = new MerchantRecipe(ArmorHead.tou1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(sellItem);
            it.setRecipe(0, recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(ArmorChest.xiong1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(sellItem);
            it.setRecipe(1, recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(ArmorLeg.tui1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(sellItem);
            it.setRecipe(2, recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(ArmorFeet.xie1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(sellItem);
            it.setRecipe(3, recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(Weapon.TAO_MU_JIAN, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(sellItem);
            it.setRecipe(4, recipe5);

            MerchantRecipe recipe6 = new MerchantRecipe(Weapon.TENG_MU_GONG, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(sellItem);
            it.setRecipe(5, recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(Weapon.HEI_TIE_GUO, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(sellItem);
            it.setRecipe(6, recipe7);


            MerchantRecipe recipe8 = new MerchantRecipe(YiQi.FANGSHENDUANBI, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(sellItem);
            it.setRecipe(7, recipe8);


        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:jungle\"}");
    }

}
