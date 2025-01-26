package com.xiaoxiaoowo.yuehua.entity.npc.chat.middle;


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

public final class Mainx {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 243, 64, -205, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.mainx"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Trade - Book RM8 for RM9
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9收集祝福之力"));
                bookMeta.author(Component.text("§9[必读]人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm8.page1"),
                        Component.translatable("pl.book.rm8.page2")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9圣兽的去向"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm9.page1"),
                        Component.translatable("pl.book.rm9.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Trade - Book XM8 for XM9
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9未知的圣兽行踪"));
                bookMeta.author(Component.text("§9[必读]仙族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm8.page1"),
                        Component.translatable("pl.book.xm8.page2"),
                        Component.translatable("pl.book.xm8.page3")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9祝福之地"));
                bookMeta.author(Component.text("§9仙族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm9.page1"),
                        Component.translatable("pl.book.xm9.page2")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Third Trade - Book SM5 for SM6
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9人皇的顾虑"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.sm5.page1")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9圣山的异常状况"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.sm6.page1"),
                        Component.translatable("pl.book.sm6.page2")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            // Fourth Trade - Book SM6 for SM7
            ItemStack buyItem4 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9圣山的异常状况"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.sm6.page1"),
                        Component.translatable("pl.book.sm6.page2")
                ));
            });

            ItemStack sellItem4 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9封闭的圣山？"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.sm7.page1")
                ));
            });

            MerchantRecipe recipe4 = new MerchantRecipe(sellItem4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyItem4);
            recipes.add(recipe4);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}
