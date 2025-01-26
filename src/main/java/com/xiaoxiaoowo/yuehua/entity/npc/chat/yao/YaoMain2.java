package com.xiaoxiaoowo.yuehua.entity.npc.chat.yao;

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

public final class YaoMain2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 2784, 53, 864, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.yaomain2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade - Leading paper for book
            {
                ItemStack buyItem = new ItemStack(Material.NETHER_WART, 1);
                buyItem.editMeta(meta -> {
                    meta.displayName(Component.translatable("pl.item.name.newyao"));
                    meta.lore(List.of(
                            Component.translatable("pl.item.lore.newyaoa"),
                            Component.translatable("pl.item.lore.newyaob")
                    ));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9妖族据点-叶灵谷"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(Component.translatable("pl.book.ym1.page1")));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // Second trade - Book for change papers
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9妖族据点-叶灵谷"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(Component.translatable("pl.book.ym1.page1")));
                });

                ItemStack sellItem = new ItemStack(Material.NETHER_WART, 6);
                sellItem.editMeta(meta -> {
                    meta.displayName(Component.translatable("pl.item.name.newchange"));
                    meta.lore(List.of(Component.translatable("pl.item.lore.newchange")));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // Third trade - Library guide book for elder's message book
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9图书馆导览"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(Component.translatable("pl.book.ym4.page1")));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9大长老的求救信息"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(
                            Component.translatable("pl.book.ym5.page1"),
                            Component.translatable("pl.book.ym5.page2")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }


            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:toolsmith\",level:26,type:\"minecraft:jungle\"}");
    }
}