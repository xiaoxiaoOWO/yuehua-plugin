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

public final class LaoZhe {
    public static void spawn() {
        Location location = new Location(Bukkit.getWorld("world"), -427.5, 111, 164.5, -180, 0); // 使用指令中的坐标
        Villager villager = Bukkit.getWorld("world").spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.text("§b喜欢阅读书籍的老者"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易 1: NPC气泡换书籍 - 解决日渐增强的怨气
            ItemStack buyItem1 = new ItemStack(Material.LIME_DYE, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b喜欢阅读书籍的老者"));
                meta.lore(List.of(
                        Component.text("§7§o可恶的山顶精怪，我珍藏多年的古籍全被它们抢走了，希望古籍不要有所损坏。"),
                        Component.text("§7§o这些古籍是我毕生心血所系，其中不乏稀世孤本，若是遗失，实在令人痛心。"),
                        Component.text("§7§o那群精怪经常出没在山顶上，据说它们专门打劫过路商旅和采药人。")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.LIME_DYE, 1);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.text("§b喜欢阅读书籍的老者"));
                meta.lore(List.of(
                        Component.text("§7§o我已年老，力不从心，可否劳烦大侠帮我取回古籍？"),
                        Component.text("§7§o我年轻时也曾是个武艺高强的侠客，如今已是风烛残年，实在无力与这些精怪周旋。"),
                        Component.text("§7§o恳请大侠出手相助，若能取回古籍，必有重谢。")
                ));
            });

            MerchantRecipe recipe1x = new MerchantRecipe(sellItem1, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe1x.addIngredient(buyItem1);
            recipes.add(recipe1x);

            ItemStack gongpin = Collection.SHEN_SHAN_ZHANG_ZHE.clone();

            gongpin.setAmount(64);
            MerchantRecipe recipe0 = new MerchantRecipe(PINZHENG.qkd12Unlock, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe0.addIngredient(gongpin);
            recipes.add(recipe0);

            gongpin.setAmount(10);

            MerchantRecipe recipe1 = new MerchantRecipe(Food.zhangzhe, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(gongpin);
            recipes.add(recipe1);

            gongpin.setAmount(50);
            MerchantRecipe recipe2 = new MerchantRecipe(TehuaShui.wuqi4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(gongpin);
            recipes.add(recipe2);

            gongpin.setAmount(3);
            ItemStack huixue3 = Food.huixue_3.clone();
            huixue3.setAmount(3);
            MerchantRecipe recipe3 = new MerchantRecipe(huixue3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(gongpin);
            recipes.add(recipe3);

            gongpin.setAmount(3);
            MerchantRecipe recipe4 = new MerchantRecipe(YuShi.SUI_YAN_SHI1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(gongpin);
            recipes.add(recipe4);


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
            ItemStack tu = YuanSu.jin.clone();
            tu.setAmount(7);
            MerchantRecipe recipe8 = new MerchantRecipe(tu, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(gongpin);
            recipes.add(recipe8);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}
