package com.xiaoxiaoowo.yuehua.entity.npc.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.items.liandan.Herb;
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

public final class CAOYAOSHOUCANGJIA {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 260.5, 49, 23.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("草药收藏家").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要3个交易项目
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
            it.setRecipes(recipesDefault);


            ItemStack renshen = Herb.RenShen.clone();
            renshen.setAmount(1);
            ItemStack linzhi = Herb.LingZhi.clone();
            linzhi.setAmount(1);
            ItemStack heshouwu = Herb.HeShouWu.clone();
            heshouwu.setAmount(1);
            ItemStack tongqian = Money.tongQian.clone();
            tongqian.setAmount(8);

            MerchantRecipe recipe0 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(renshen);
            it.setRecipe(0,recipe0);

            MerchantRecipe recipe1 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(heshouwu);
            it.setRecipe(1,recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(tongqian, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(linzhi);
            it.setRecipe(2,recipe2);


        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:100,type:\"minecraft:plains\"}");
    }
}
