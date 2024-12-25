package com.xiaoxiaoowo.yuehua.entity.npc.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
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

public final class MoneLootBuy2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 87.5, 47, 115.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("珍品收购员").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要6个交易项目
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
            it.setRecipes(recipesDefault);




            ItemStack jinyuanbao = Money.jinYuanBao.clone();

            ItemStack yaoniaoyu = MoneyLoot.YAO_NIAO_YU.clone();
            ItemStack yaoniaolei = MoneyLoot.YAO_NIAO_LEI.clone();
            ItemStack shanhushi = MoneyLoot.SHAN_HU_SHI.clone();

            ItemStack zhangqitoulu = MoneyLoot.ZHANG_QI_TOU_LU.clone();
            ItemStack gouyubai = MoneyLoot.GOU_YU_BAI.clone();
            ItemStack gouyuhei = MoneyLoot.GOU_YU_HEI.clone();

            jinyuanbao.setAmount(1);
            MerchantRecipe recipe0 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(yaoniaoyu);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(yaoniaolei);
            it.setRecipe(1,recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(shanhushi);
            it.setRecipe(2,recipe2);

            jinyuanbao.setAmount(2);
            MerchantRecipe recipe3 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(zhangqitoulu);
            it.setRecipe(3,recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gouyubai);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(jinyuanbao, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(gouyuhei);
            it.setRecipe(5,recipe5);






        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
