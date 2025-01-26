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

public final class ShiRi {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 272, 45, -189, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.zhanmain5"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Trade - Book ZM4 for ZM5
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9族长的嘱托"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm4.page1"),
                        Component.translatable("pl.book.zm4.page2"),
                        Component.translatable("pl.book.zm4.page3")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9蚀日的报告"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm5.page1"),
                        Component.translatable("pl.book.zm5.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);


            // Third Trade - Book ZM8 for ZM9
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9四兽依旧不知所踪"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.zm8.page1")));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9收集祝福之力"));
                bookMeta.author(Component.text("§9[必读]战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm9.page1"),
                        Component.translatable("pl.book.zm9.page2"),
                        Component.translatable("pl.book.zm9.page3")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            // Fourth Trade - Book ZM9 for ZM10
            ItemStack buyItem4 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9收集祝福之力"));
                bookMeta.author(Component.text("§9[必读]战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm9.page1"),
                        Component.translatable("pl.book.zm9.page2"),
                        Component.translatable("pl.book.zm9.page3")
                ));
            });

            ItemStack sellItem4 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9前往蓬莱"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.zm10.page1")));
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
