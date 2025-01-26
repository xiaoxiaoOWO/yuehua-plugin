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

public final class Zhanmain6 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 591, 33, 46, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.zhanmain6"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Trade - Book ZM5 for ZM6
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9蚀日的报告"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm5.page1"),
                        Component.translatable("pl.book.zm5.page2")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9龙鳞之森的异常"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm6.page1"),
                        Component.translatable("pl.book.zm6.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Trade - Book ZM7 for ZM8
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9青龙试炼"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm7.page1"),
                        Component.translatable("pl.book.zm7.page2")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9四兽依旧不知所踪"));
                bookMeta.author(Component.text("§9战神族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zm8.page1")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:desert\"}");
    }
}
