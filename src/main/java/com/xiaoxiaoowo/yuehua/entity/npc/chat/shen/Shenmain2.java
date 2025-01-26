package com.xiaoxiaoowo.yuehua.entity.npc.chat.shen;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Shenmain2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3336, 158, 118, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.shenmain2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade: Paper for Book
            ItemStack buyPaper = new ItemStack(Material.NETHER_WART, 1);
            buyPaper.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newshen"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newshena"),
                        Component.translatable("pl.item.lore.newshenb"),
                        Component.translatable("pl.item.lore.newshenc")
                ));
            });

            ItemStack sellBook1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellBook1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9冷漠的神族长老"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm1.page1")));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellBook1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyPaper);
            recipes.add(recipe1);

            // Second trade: Book for Change Paper
            ItemStack buyBook1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyBook1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9冷漠的神族长老"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm1.page1")));
            });

            ItemStack sellChangePaper = new ItemStack(Material.NETHER_WART, 6);
            sellChangePaper.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newchange"));
                meta.lore(List.of(Component.translatable("pl.item.lore.newchange")));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellChangePaper, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyBook1);
            recipes.add(recipe2);

            // Third trade: Book for another Book
            ItemStack buyBook2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyBook2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9丹塔负责人的解说"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm3.page1")));
            });

            ItemStack sellBook2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellBook2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9神族长老的委托"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm4.page1")));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellBook2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyBook2);
            recipes.add(recipe3);

            // Fourth trade: Book for another Book
            ItemStack buyBook3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyBook3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9封闭的圣山？"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm7.page1")));
            });

            ItemStack sellBook3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellBook3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9无法控制的圣兽们"));
                bookMeta.author(Component.text("§9[必读]神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.sm8.page1"),
                        Component.translatable("pl.book.sm8.page2")
                ));
            });

            MerchantRecipe recipe4 = new MerchantRecipe(sellBook3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyBook3);
            recipes.add(recipe4);

            // Fifth trade: Book for another Book
            ItemStack buyBook4 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyBook4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9无法控制的圣兽们"));
                bookMeta.author(Component.text("§9[必读]神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.sm8.page1"),
                        Component.translatable("pl.book.sm8.page2")
                ));
            });

            ItemStack sellBook4 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellBook4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9前往蓬莱"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm9.page1")));
            });

            MerchantRecipe recipe5 = new MerchantRecipe(sellBook4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(buyBook4);
            recipes.add(recipe5);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:swamp\"}");
    }
}
