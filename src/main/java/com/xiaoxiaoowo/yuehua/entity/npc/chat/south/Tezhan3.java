package com.xiaoxiaoowo.yuehua.entity.npc.chat.south;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Tezhan3 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -452, 95, 355, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.tezhan3"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Prepare Money3 Brick
            ItemStack buyItem = Other.NPC_PAOPAO.clone();

            // First trade: Book about Nüwa's Trial
            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9人族禁地女娲的试炼"));
                bookMeta.author(Component.text("§9情报屋小道消息"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te12.page1"),
                        Component.translatable("pl.book.te12.page2"),
                        Component.translatable("pl.book.te12.page3")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem);
            recipes.add(recipe1);

            // Second trade: Book about Pangu's Trial
            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9神族领地盘古的试炼"));
                bookMeta.author(Component.text("§9情报屋小道消息"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te13.page1"),
                        Component.translatable("pl.book.te13.page2"),
                        Component.translatable("pl.book.te13.page3")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem);
            recipes.add(recipe2);

            // Third trade: Book about Chiyou's Trial
            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9战神隐居地蚩尤的试炼"));
                bookMeta.author(Component.text("§9情报屋小道消息"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te14.page1"),
                        Component.translatable("pl.book.te14.page2"),
                        Component.translatable("pl.book.te14.page3")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem);
            recipes.add(recipe3);

            // Fourth trade: Book about Legendary Utopia
            ItemStack sellItem4 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9传说中大陆边缘的世外桃源？"));
                bookMeta.author(Component.text("§9情报屋小道消息"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te15.page1"),
                        Component.translatable("pl.book.te15.page2"),
                        Component.translatable("pl.book.te15.page3")
                ));
            });

            MerchantRecipe recipe4 = new MerchantRecipe(sellItem4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyItem);
            recipes.add(recipe4);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:desert\"}");
    }
}
