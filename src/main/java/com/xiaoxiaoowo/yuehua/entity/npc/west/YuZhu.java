package com.xiaoxiaoowo.yuehua.entity.npc.west;

import com.xiaoxiaoowo.yuehua.items.PINZHENG;
import com.xiaoxiaoowo.yuehua.items.dz.*;
import com.xiaoxiaoowo.yuehua.items.other.Collection;
import com.xiaoxiaoowo.yuehua.items.other.Food;
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

public final class YuZhu {
    public static void spawn() {
        Location location = new Location(Bukkit.getWorld("world"), -318.5, 115, -423.5, -90, 0); // 使用指令中的坐标
        Villager villager = Bukkit.getWorld("world").spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.text("§b雨竹"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易 1: NPC气泡换书籍 - 解决日渐增强的怨气
            ItemStack buyItem1 = new ItemStack(Material.LIME_DYE, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b雨竹"));
                meta.lore(List.of(
                        Component.text("§7§o好久没有人到这里来了啊…你好,我是雨竹,负责掌管这座地仙庙."),
                        Component.text("§7§o我…有特殊的原因,不能离开这里.原本以我的灵力可以维持这座小庙不至于年久失修."),
                        Component.text("§7§o但近十几年来,不知道从哪边来了一群山魅,在这山中作祟,甚至在这小庙后方筑起了巢."),
                        Component.text("§7§o我的灵力都耗费在抵抗它们了,于是如你所见,这地仙庙就变得如此残破不堪了.")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.LIME_DYE, 1);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b雨竹"));
                meta.lore(List.of(
                        Component.text("§7§o为了补充我消耗的灵力,可否麻烦你帮忙进入山魅所筑的迷宫,帮我封印它们呢？"),
                        Component.text("§7§o每带回一些山魅,做为回报,我愿意为你换取一部分物品")
                ));
            });

            MerchantRecipe recipe1x = new MerchantRecipe(sellItem1, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe1x.addIngredient(buyItem1);
            recipes.add(recipe1x);

            ItemStack gongpin = Collection.YU_ZHU.clone();

            gongpin.setAmount(64);
            MerchantRecipe recipe0 = new MerchantRecipe(PINZHENG.qkd13Unlock, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(gongpin);
            recipes.add(recipe0);

            gongpin.setAmount(50);
            MerchantRecipe recipe2 = new MerchantRecipe(TehuaShui.fabao4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(gongpin);
            recipes.add(recipe2);

            gongpin.setAmount(3);
            ItemStack huixue3 = Food.huixue_3.clone();
            huixue3.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(gongpin);
            recipes.add(recipe3);

            gongpin.setAmount(3);
            MerchantRecipe recipe4 = new MerchantRecipe(YuShi.HOU_TU_SHI1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gongpin);
            recipes.add(recipe4);

            gongpin.setAmount(5);
            MerchantRecipe recipe5 = new MerchantRecipe(Ingredient.SHAN_MEI_JIN_TIE, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(gongpin);
            recipes.add(recipe5);

            gongpin.setAmount(2);
            ItemStack huixue2 = Food.huixue_2.clone();
            huixue2.setAmount(7);
            MerchantRecipe recipe6 = new MerchantRecipe(huixue2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(gongpin);
            recipes.add(recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(FuLing.zhusha, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(gongpin);
            recipes.add(recipe7);

            gongpin.setAmount(1);
            ItemStack tu = YuanSu.tu.clone();
            tu.setAmount(7);
            MerchantRecipe recipe8 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(gongpin);
            recipes.add(recipe8);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}
