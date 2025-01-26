package com.xiaoxiaoowo.yuehua.entity.npc.chat.shen;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Money;
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

public final class Se2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3297, 113, 390, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.se2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade item (Book trade)
            ItemStack buyBookItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyBookItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9下落不明的爱人"));
                bookMeta.author(Component.text("§9芊无"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.se1.page1"),
                        Component.translatable("pl.book.se1.page2"),
                        Component.translatable("pl.book.se1.page3"),
                        Component.translatable("pl.book.se1.page4"),
                        Component.translatable("pl.book.se1.page5")
                ));
            });

            // Second trade item (Gold Ingot)
            ItemStack buyGoldItem = Money.jinYuanBao.clone();
            buyGoldItem.setAmount(1);

            // Sell item (Another Book)
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9打听尘嚣天君的下落"));
                bookMeta.author(Component.text("§9包打听"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.se2.page1"),
                        Component.translatable("pl.book.se2.page2")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyBookItem);
            recipe.addIngredient(buyGoldItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}
