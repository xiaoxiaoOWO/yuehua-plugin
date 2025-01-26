package com.xiaoxiaoowo.yuehua.entity.npc.chat.south;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Tezhan2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -456, 95, 361, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.tezhan2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Prepare Money3 Brick
            ItemStack buyItem = Other.NPC_PAOPAO.clone();



            // Third trade: Book about Dragon Scale Forest
            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9龙鳞之森中的皇族陵墓"));
                bookMeta.author(Component.text("§9情报屋小道消息"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te9.page1"),
                        Component.translatable("pl.book.te9.page2")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem);
            recipes.add(recipe3);

            // Fourth trade: Book about Desert Cave
            ItemStack sellItem4 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9焱砂大漠中的危险洞窟"));
                bookMeta.author(Component.text("§9情报屋小道消息"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te10.page1"),
                        Component.translatable("pl.book.te10.page2"),
                        Component.translatable("pl.book.te10.page3")
                ));
            });

            MerchantRecipe recipe4 = new MerchantRecipe(sellItem4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyItem);
            recipes.add(recipe4);

            // Fifth trade: Book about Ice Valley
            ItemStack sellItem5 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem5.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9西北方中的冰雪山谷"));
                bookMeta.author(Component.text("§9情报屋小道消息"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.te11.page1"),
                        Component.translatable("pl.book.te11.page2")
                ));
            });

            MerchantRecipe recipe5 = new MerchantRecipe(sellItem5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(buyItem);
            recipes.add(recipe5);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:desert\"}");
    }
}
