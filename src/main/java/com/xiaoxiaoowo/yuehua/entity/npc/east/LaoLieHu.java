package com.xiaoxiaoowo.yuehua.entity.npc.east;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.YiQi;
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

public final class LaoLieHu {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 508.5, 51, 33.5, -90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("老者").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要7个交易项目
            List<MerchantRecipe> recipesDefault = new ArrayList<>();
            MerchantRecipe recipeDefault1 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault1.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault1);
            MerchantRecipe recipeDefault2 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault2.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault2);
            it.setRecipes(recipesDefault);


            ItemStack yinpiao = Money.yinPiao.clone();
            yinpiao.setAmount(1);
            MerchantRecipe recipe = new MerchantRecipe(YiQi.LAOLIEHUJIANDAI, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(yinpiao);
            it.setRecipe(0, recipe);


            MerchantRecipe recipe1 = new MerchantRecipe(YiQi.LAOZHANSHIDUNPAI, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(yinpiao);
            it.setRecipe(1, recipe1);

            ItemStack buyItem = new ItemStack(Material.LIME_DYE, 1);
            buyItem.editMeta(meta -> {
                meta.displayName(Component.translatable("§b老者"));
                meta.lore(List.of(Component.translatable("§7§o真怀恋以前和战友们一起在前线御敌的时光啊")));
            });

            ItemStack sellItem = new ItemStack(Material.LIME_DYE, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("§b老者"));
                meta.lore(List.of(Component.translatable("§7§o如今这些我也用不上了，你如果需要便拿去吧")));
            });

            MerchantRecipe firstRecipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            firstRecipe.addIngredient(buyItem);

            List<MerchantRecipe> recipes = new ArrayList<>(it.getRecipes());
            recipes.addFirst(firstRecipe);
            it.setRecipes(recipes);

        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:taiga\"}");
    }
}
