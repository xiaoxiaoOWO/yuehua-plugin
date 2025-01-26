package com.xiaoxiaoowo.yuehua.entity.npc.chat.east;

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

public final class Maindragon {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 1696, 103, 852, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.maindragon"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Trade - Book RM6 for RM7
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9镇长的不满"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm6.page1"),
                        Component.translatable("pl.book.rm6.page2")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9青龙分魂"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm7.page1"),
                        Component.translatable("pl.book.rm7.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Trade - Book XM6 for XM7
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9森林中的异变"));
                bookMeta.author(Component.text("§9仙族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm6.page1"),
                        Component.translatable("pl.book.xm6.page2"),
                        Component.translatable("pl.book.xm6.page3")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9衰退的龙之力"));
                bookMeta.author(Component.text("§9仙族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm7.page1"),
                        Component.translatable("pl.book.xm7.page2"),
                        Component.translatable("pl.book.xm7.page3")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Third Trade - Book YM8 for YM9
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9森林中的祭坛"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym8.page1"),
                        Component.translatable("pl.book.ym8.page2")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9试探结界"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym9.page1")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}