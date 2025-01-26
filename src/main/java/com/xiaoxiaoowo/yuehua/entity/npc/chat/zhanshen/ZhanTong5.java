package com.xiaoxiaoowo.yuehua.entity.npc.chat.zhanshen;

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

public final class ZhanTong5 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3259 ,23 ,-277, 0, 0);

        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            // 基本设置
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            // 自定义名字
            it.customName(Component.translatable("pl.npc.name.zhantong5").color(NamedTextColor.AQUA));
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
            MerchantRecipe recipeDefault9 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault9.addIngredient(Other.ARROW);
            recipesDefault.add(recipeDefault9);
            it.setRecipes(recipesDefault);




            ItemStack tongqian = Money.tongQian.clone();


            ItemStack zhizhuyan = MoneyLoot.ZHI_ZHU_YAN.clone();
            ItemStack pi_ge = MoneyLoot.PI_GE.clone();
            ItemStack tui_zi_pi = MoneyLoot.TU_ZI_PI.clone();

            ItemStack meitan = MoneyLoot.MEI_TAN.clone();
            ItemStack xiaoma = MoneyLoot.XIAO_MAI.clone();
            ItemStack fuzhu = MoneyLoot.FU_ZHU.clone();

            ItemStack xirang = MoneyLoot.XI_RANG.clone();
            ItemStack taoci_sui = MoneyLoot.TAO_CI_SUI.clone();
            ItemStack cuitie = MoneyLoot.CU_TIE.clone();


            tongqian.setAmount(4);
            MerchantRecipe recipe0 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(zhizhuyan);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(tui_zi_pi);
            it.setRecipe(1,recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(pi_ge);
            it.setRecipe(2,recipe2);

            tongqian.setAmount(6);
            MerchantRecipe recipe3 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(meitan);
            it.setRecipe(3,recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(xiaoma);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(fuzhu);
            it.setRecipe(5,recipe5);

            tongqian.setAmount(9);

            MerchantRecipe recipe6 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(xirang);
            it.setRecipe(6,recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(taoci_sui);
            it.setRecipe(7,recipe7);

            MerchantRecipe recipe8 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(cuitie);
            it.setRecipe(8,recipe8);
        });

        // 村民职业与外观设置
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:desert\"}");
    }
}


