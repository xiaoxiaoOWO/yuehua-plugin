package com.xiaoxiaoowo.yuehua.entity.npc.chat.penglai;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
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

public final class ShouShanRen {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -25.5, 47, -910.5, -90, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("§b守山人"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 购买书籍 1
            ItemStack sellItem = PINZHENG.finishMain.clone();

            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9进入圣山"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.sm10.page1"),
                        Component.translatable("pl.book.sm10.page2"),
                        Component.translatable("pl.book.sm10.page3")
                ));
            });

            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta4 = (BookMeta) buyItem2.getItemMeta();  // 强制转换为 BookMeta
            if (bookMeta4 != null) {
                bookMeta4.title(Component.text("§9圣山的异常"));
                bookMeta4.setAuthor("§9仙族主线");
                bookMeta4.pages(List.of(Component.translatable("pl.book.xm10.page1"), Component.translatable("pl.book.xm10.page2"), Component.translatable("pl.book.xm10.page3")));
                buyItem2.setItemMeta(bookMeta4);
            }

            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta2 = (BookMeta) buyItem3.getItemMeta();  // 强制转换为 BookMeta
            if (bookMeta2 != null) {
                bookMeta2.title(Component.text("§9沉睡的圣兽们"));
                bookMeta2.setAuthor("§9人族主线");
                bookMeta2.pages(List.of(Component.translatable("pl.book.rm10.page1"), Component.translatable("pl.book.rm10.page2"), Component.translatable("pl.book.rm10.page3")));
                buyItem3.setItemMeta(bookMeta2);
            }

            ItemStack buyItem4 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9圣山结界"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym12.page1"),
                        Component.translatable("pl.book.ym12.page2"),
                        Component.translatable("pl.book.ym12.page3")
                ));
            });

            ItemStack buyItem5 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem5.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9四圣兽沉睡之处"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm11.page1")
                ));
            });


            // 创建交易 1
            MerchantRecipe recipe1 = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // 创建交易 2
            MerchantRecipe recipe2 = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // 创建交易 3
            MerchantRecipe recipe3 = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            // 创建交易 4
            MerchantRecipe recipe4 = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyItem4);
            recipes.add(recipe4);

            // 创建交易 5
            MerchantRecipe recipe5 = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(buyItem5);
            recipes.add(recipe5);


            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}
