package com.xiaoxiaoowo.yuehua.entity.npc.chat.shen;

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

public final class Shenmain4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3346, 120, 358, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.shenmain4"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade: Book for another Book
            ItemStack buyBook = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyBook.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9资源中心负责人的介绍"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm2.page1")));
            });

            ItemStack sellBook = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellBook.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9丹塔负责人的解说"));
                bookMeta.author(Component.text("§9神族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.sm3.page1")));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellBook, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyBook);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}
