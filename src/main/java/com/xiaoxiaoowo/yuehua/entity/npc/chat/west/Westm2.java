package com.xiaoxiaoowo.yuehua.entity.npc.chat.west;

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

public final class Westm2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -583, 109, 188, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.westm2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Written Book (失踪的儿子) -> Written Book (不告而别的苦衷)
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9失踪的儿子"));
                bookMeta.author(Component.text("§9伤心的老爷爷"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.westm1.page1"),
                        Component.translatable("pl.book.westm1.page2"),
                        Component.translatable("pl.book.westm1.page3")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9不告而别的苦衷"));
                bookMeta.author(Component.text("§9孤伶伶的小男孩"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.westm2.page1"),
                        Component.translatable("pl.book.westm2.page2"),
                        Component.translatable("pl.book.westm2.page3"),
                        Component.translatable("pl.book.westm2.page4")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, false);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Written Book (不告而别的苦衷) -> Nether Wart (西部任务)
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9不告而别的苦衷"));
                bookMeta.author(Component.text("§9孤伶伶的小男孩"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.westm2.page1"),
                        Component.translatable("pl.book.westm2.page2"),
                        Component.translatable("pl.book.westm2.page3"),
                        Component.translatable("pl.book.westm2.page4")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.RABBIT_FOOT, 1);
            sellItem2.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.westm"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.westma"),
                        Component.translatable("pl.item.lore.westmb")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, false);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Written Book (平安就好) -> Written Book (虎子的回报)
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9平安就好"));
                bookMeta.author(Component.text("§9伤心的老爷爷"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.westm3.page1"),
                        Component.translatable("pl.book.westm3.page2")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9虎子的回报"));
                bookMeta.author(Component.text("§9孤伶伶的小男孩"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.westm4.page1"),
                        Component.translatable("pl.book.westm4.page2")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, false);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}

