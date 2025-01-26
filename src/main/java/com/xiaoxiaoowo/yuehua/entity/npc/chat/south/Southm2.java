package com.xiaoxiaoowo.yuehua.entity.npc.chat.south;

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

public final class Southm2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 11, 48, 813, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.southm2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade item (book)
            ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9充斥着忧愁气氛的小镇"));
                bookMeta.author(Component.text("§9绿洲小镇的镇长"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm1.page1"),
                        Component.translatable("pl.book.southm1.page2")
                ));
            });

            // Sell item (second book)
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9火山之神的代言人"));
                bookMeta.author(Component.text("§9巫者红鸾"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm2.page1"),
                        Component.translatable("pl.book.southm2.page2")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}