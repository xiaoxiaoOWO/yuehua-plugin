package com.xiaoxiaoowo.yuehua.entity.npc.chat.penglai;
import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Mission;
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

public final class Te32 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 368, 52, -668, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.te32"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Recipe: Pink Dye for Book
            ItemStack buyItem1 = Other.NPC_PAOPAO.clone();

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9永生之法的秘密"));
                bookMeta.author(Component.text("§9梓决"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te32.page1"),
                        Component.translatable("pl.book.te32.page2"),
                        Component.translatable("pl.book.te32.page3"),
                        Component.translatable("pl.book.te32.page4"),
                        Component.translatable("pl.book.te32.page5"),
                        Component.translatable("pl.book.te32.page6"),
                        Component.translatable("pl.book.te32.page7")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Recipe: Pink Dye for Nether Wart
            ItemStack buyItem2 = Other.NPC_PAOPAO.clone();

            ItemStack sellItem2 = Mission.yuzhu.clone();

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:fisherman\",level:26,type:\"minecraft:taiga\"}");
    }
}
