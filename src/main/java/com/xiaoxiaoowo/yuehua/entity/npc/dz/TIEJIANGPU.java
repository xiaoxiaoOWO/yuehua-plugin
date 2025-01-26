package com.xiaoxiaoowo.yuehua.entity.npc.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.Book;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.*;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.ArmorChest;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.ArmorFeet;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.ArmorHead;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.ArmorLeg;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.BiWeapon;
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

public final class TIEJIANGPU {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 80.5, 46, 140.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("铁匠铺掌柜").color(NamedTextColor.AQUA));
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
            MerchantRecipe recipeDefault9 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault9.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault10 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault10.addIngredient(Other.ARROW);
            MerchantRecipe recipeDefault11 = new MerchantRecipe(Other.ARROW, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipeDefault11.addIngredient(Other.ARROW);

            recipesDefault.add(recipeDefault1);
            recipesDefault.add(recipeDefault2);
            recipesDefault.add(recipeDefault3);
            recipesDefault.add(recipeDefault4);
            recipesDefault.add(recipeDefault5);
            recipesDefault.add(recipeDefault6);
            recipesDefault.add(recipeDefault7);
            recipesDefault.add(recipeDefault8);
            recipesDefault.add(recipeDefault9);
            recipesDefault.add(recipeDefault10);
            recipesDefault.add(recipeDefault11);
            it.setRecipes(recipesDefault);

            ItemStack npcPaoPao = Other.NPC_PAOPAO;
            MerchantRecipe recipe = new MerchantRecipe(Book.DZ, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(npcPaoPao);
            it.setRecipe(0, recipe);

            ItemStack tongqian = Money.tongQian.clone();
            tongqian.setAmount(10);

            MerchantRecipe recipe1 = new MerchantRecipe(ArmorHead.tou1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(tongqian);
            it.setRecipe(1, recipe1);

            MerchantRecipe recipe2 = new MerchantRecipe(ArmorChest.xiong1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(tongqian);
            it.setRecipe(2, recipe2);

            MerchantRecipe recipe3 = new MerchantRecipe(ArmorLeg.tui1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(tongqian);
            it.setRecipe(3, recipe3);

            MerchantRecipe recipe4 = new MerchantRecipe(ArmorFeet.xie1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(tongqian);
            it.setRecipe(4,recipe4);

            MerchantRecipe recipe5 = new MerchantRecipe(Weapon.TAO_MU_JIAN, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(tongqian);
            it.setRecipe(5,recipe5);

            MerchantRecipe recipe6 = new MerchantRecipe(Weapon.TENG_MU_GONG, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(tongqian);
            it.setRecipe(6,recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(Weapon.HEI_TIE_GUO, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(tongqian);
            it.setRecipe(7,recipe7);

            ItemStack jinyuanbao = Money.yinPiao.clone();
            jinyuanbao.setAmount(1);

            MerchantRecipe recipe8 = new MerchantRecipe(BiWeapon.FEIREN, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(jinyuanbao);
            it.setRecipe(8,recipe8);

            MerchantRecipe recipe9 = new MerchantRecipe(BiWeapon.HEITIECHONG, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(jinyuanbao);
            it.setRecipe(9,recipe9);

            MerchantRecipe recipe10 = new MerchantRecipe(BiWeapon.XIAO, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe10.addIngredient(jinyuanbao);
            it.setRecipe(10,recipe10);

        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:leatherworker\",level:100,type:\"minecraft:desert\"}");
    }
}
