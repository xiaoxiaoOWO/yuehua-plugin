package com.xiaoxiaoowo.yuehua.entity.npc.chat.ren;

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

public final class Renmain2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 1686, 143, 105, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.renmain2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Recipe: New Player Paper for Book
            ItemStack buyItem1 = new ItemStack(Material.NETHER_WART, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newren"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newrena"),
                        Component.translatable("pl.item.lore.newrenb"),
                        Component.translatable("pl.item.lore.newrenc")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9新手上路"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm1.page1")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Recipe: Book for Change Papers
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9新手上路"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm1.page1")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.NETHER_WART, 6);
            sellItem2.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newchange"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newchange")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Third Recipe: Book Exchange
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9丹药铺掌柜的招待"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm3.page1")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9村长担忧的事情"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm4.page1")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}
