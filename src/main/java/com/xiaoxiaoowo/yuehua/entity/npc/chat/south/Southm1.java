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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Southm1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -16, 48, 805, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.southm1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Trade - Bubble for Book 1
            ItemStack buyItem1 = Other.NPC_PAOPAO.clone();

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9充斥着忧愁气氛的小镇"));
                bookMeta.author(Component.text("§9绿洲小镇的镇长"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm1.page1"),
                        Component.translatable("pl.book.southm1.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Trade - Blaze Powder for Book 2
            ItemStack buyItem2 = new ItemStack(Material.BLAZE_POWDER, 1);
            buyItem2.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.southm2"));
                meta.lore(List.of(Component.translatable("pl.item.lore.southm2a")));
            });

            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9揭发真相"));
                bookMeta.author(Component.text("§9绿洲小镇的镇长"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm5.page1"),
                        Component.translatable("pl.book.southm5.page2")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Third Trade - Book 2 for Book 3
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9揭发真相"));
                bookMeta.author(Component.text("§9绿洲小镇的镇长"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm5.page1"),
                        Component.translatable("pl.book.southm5.page2")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9致无以回报的陌生人"));
                bookMeta.author(Component.text("§9莲心"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm6.page1"),
                        Component.translatable("pl.book.southm6.page2"),
                        Component.translatable("pl.book.southm6.page3")
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
