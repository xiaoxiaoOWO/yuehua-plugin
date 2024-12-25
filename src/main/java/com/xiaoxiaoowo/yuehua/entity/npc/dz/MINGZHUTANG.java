package com.xiaoxiaoowo.yuehua.entity.npc.dz;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.Book;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
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

public final class MINGZHUTANG {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 218.5, 46, 74.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            //村民基础，无AI，静音，不自然移除，无敌,年龄
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            //名字
            it.customName(Component.text("明珠堂堂主").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            //需要1个交易项目
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
            ItemStack npcPaoPao = Other.NPC_PAOPAO;


            MerchantRecipe recipe = new MerchantRecipe(Book.SHIPINDZ, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(npcPaoPao);
            it.setRecipe(0, recipe);

            ItemStack shipin1 = PINZHENG.shipincao1.clone();
            ItemStack shipin2 = PINZHENG.shipincao2.clone();
            ItemStack shipin3 = PINZHENG.shipincao3.clone();
            ItemStack shipin4 = PINZHENG.shipincao4.clone();
            ItemStack shipin5 = PINZHENG.shipincao5.clone();
            ItemStack shipin6 = PINZHENG.shipincao6.clone();
            ItemStack shipin7 = PINZHENG.shipincao7.clone();

            shipin1.setAmount(1);
            shipin2.setAmount(1);
            shipin3.setAmount(1);
            shipin4.setAmount(1);
            shipin5.setAmount(1);
            shipin6.setAmount(1);
            shipin7.setAmount(1);

            ItemStack jinyuanbao = Money.yinPiao.clone();
            ItemStack yinpiao = Money.zuanShi.clone();

            jinyuanbao.setAmount(1);
            MerchantRecipe recipe1 = new MerchantRecipe(shipin1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(jinyuanbao);
            it.setRecipe(1,recipe1);

            jinyuanbao.setAmount(4);
            MerchantRecipe recipe2 = new MerchantRecipe(shipin2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(jinyuanbao);
            it.setRecipe(2,recipe2);

            jinyuanbao.setAmount(8);
            MerchantRecipe recipe3 = new MerchantRecipe(shipin3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(jinyuanbao);
            it.setRecipe(3,recipe3);

            yinpiao.setAmount(1);
            MerchantRecipe recipe4 = new MerchantRecipe(shipin4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(yinpiao);
            it.setRecipe(4,recipe4);

            yinpiao.setAmount(4);
            MerchantRecipe recipe5 = new MerchantRecipe(shipin5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(yinpiao);
            it.setRecipe(5,recipe5);

            yinpiao.setAmount(8);
            MerchantRecipe recipe6 = new MerchantRecipe(shipin6, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(yinpiao);
            it.setRecipe(6,recipe6);

            yinpiao.setAmount(15);
            MerchantRecipe recipe7 = new MerchantRecipe(shipin7, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(yinpiao);
            it.setRecipe(7,recipe7);

            yinpiao.setAmount(35);
            MerchantRecipe recipe8 = new MerchantRecipe(PINZHENG.shipincao8, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(yinpiao);
            it.setRecipe(8,recipe8);



        });
        //村民外观
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:armorer\",level:100,type:\"minecraft:snow\"}");
    }
}
