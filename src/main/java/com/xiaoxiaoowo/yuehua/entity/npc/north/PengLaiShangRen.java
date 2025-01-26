package com.xiaoxiaoowo.yuehua.entity.npc.north;

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

public final class PengLaiShangRen {
    public static void spawn() {
        Location location = new Location(Bukkit.getWorld("world"), 408.5, 35, -649.5, 0, 0); // 使用指令中的坐标
        Villager villager = Bukkit.getWorld("world").spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.text("§b蓬莱商人——李义"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易 1: NPC气泡换书籍 - 解决日渐增强的怨气
            ItemStack buyItem1 = new ItemStack(Material.LIME_DYE, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b蓬莱商人——李义"));
                meta.lore(List.of(
                        Component.text("§7§o啊啊啊，我的鲑鱼，全被渡口附近的魔物抢走了，岛主大人一定会生气的，怎么办")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.LIME_DYE, 1);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b蓬莱商人——李义"));
                meta.lore(List.of(
                        Component.text("§7§o啊？你说你能帮我抢回来吗？那拜托你了，这对我真的很重要，我这里的宝贝货物可与你分享！")
                ));
            });

            MerchantRecipe recipe1x = new MerchantRecipe(sellItem1, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe1x.addIngredient(buyItem1);
            recipes.add(recipe1x);

            ItemStack gongpin = Collection.PENG_LAI_SHANG_REN.clone();

            gongpin.setAmount(64);
            MerchantRecipe recipe0 = new MerchantRecipe(PINZHENG.qkd15Unlock, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(gongpin);
            recipes.add(recipe0);

            gongpin.setAmount(10);

            MerchantRecipe recipe1 = new MerchantRecipe(Food.penglai, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(gongpin);
            recipes.add(recipe1);


            gongpin.setAmount(50);
            MerchantRecipe recipe2 = new MerchantRecipe(TehuaShui.wuqi5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(gongpin);
            recipes.add(recipe2);

            gongpin.setAmount(2);
            ItemStack huixue3 = Food.huixue_3.clone();
            huixue3.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(gongpin);
            recipes.add(recipe3);

            gongpin.setAmount(2);
            MerchantRecipe recipe4 = new MerchantRecipe(YuShi.MI_YIN_SHI1.clone(), -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gongpin);
            recipes.add(recipe4);

            gongpin.setAmount(5);
            MerchantRecipe recipe5 = new MerchantRecipe(Ingredient.QIAN_NIAN_YU, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(gongpin);
            recipes.add(recipe5);

            gongpin.setAmount(2);
            ItemStack huixue2 = Food.huixue_2.clone();
            huixue2.setAmount(8);
            MerchantRecipe recipe6 = new MerchantRecipe(huixue2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(gongpin);
            recipes.add(recipe6);

            MerchantRecipe recipe7 = new MerchantRecipe(FuLing.zhusha, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(gongpin);
            recipes.add(recipe7);

            gongpin.setAmount(1);
            ItemStack tu = YuanSu.shui.clone();
            tu.setAmount(8);
            MerchantRecipe recipe8 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(gongpin);
            recipes.add(recipe8);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}
