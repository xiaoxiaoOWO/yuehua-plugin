package com.xiaoxiaoowo.yuehua.entity.npc.chat.south;

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
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Southm4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 244, 17, 720, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.southm3"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade: Book exchange
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9睿智的少女"));
                bookMeta.author(Component.text("§9莲心"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm3.page1"),
                        Component.translatable("pl.book.southm3.page2"),
                        Component.translatable("pl.book.southm3.page3"),
                        Component.translatable("pl.book.southm3.page4")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9火山的真相"));
                bookMeta.author(Component.text("§9莲心"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm4.page1"),
                        Component.translatable("pl.book.southm4.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second trade: Book for Blaze Powder
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9火山的真相"));
                bookMeta.author(Component.text("§9莲心"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm4.page1"),
                        Component.translatable("pl.book.southm4.page2")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.BLAZE_POWDER, 1);
            sellItem2.editMeta(meta -> {
                ItemMeta itemMeta = meta;
                itemMeta.displayName(Component.translatable("pl.item.name.southm2"));
                itemMeta.lore(List.of(Component.translatable("pl.item.lore.southm2a")));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:savanna\"}");
    }
}