package com.xiaoxiaoowo.yuehua.entity.npc.chat.xian;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Mission;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Xe1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3336.5, 68, 1034.5, 0, 0);

        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            // 村民基础设置
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            // 设置自定义名字
            it.customName(Component.translatable("pl.npc.name.xe1").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            // 设置交易项目
            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易1：书
            ItemStack buyItem1 = Other.NPC_PAOPAO.clone();

            ItemStack sellItem1 = new ItemStack(org.bukkit.Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9得了相思病的织女");
                bookMeta.setAuthor("§9织女");
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xe1.page1"),
                        Component.translatable("pl.book.xe1.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // 交易2：物品
            ItemStack buyItem2 = RaceProvince.xian.clone();
            ItemStack sellItem2 = Mission.zhinvxin.clone();

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        // 设置村民外观和职业
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}

