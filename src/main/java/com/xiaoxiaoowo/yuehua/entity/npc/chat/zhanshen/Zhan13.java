package com.xiaoxiaoowo.yuehua.entity.npc.chat.zhanshen;

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

public final class Zhan13 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3162, 37, -205, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.zhan13"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade item (buy)
            ItemStack buyItem = new ItemStack(Material.PINK_DYE, 1);
            buyItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.npcbubble"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.npcbubblea"),
                        Component.translatable("pl.item.lore.npcbubbleb")
                ));
            });

            // Sell item (book)
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9关于战神族的传奇-蚩尤"));
                bookMeta.author(Component.text("§9瞻仰战神联盟盟主雕像的男子"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.zhanchat13.page1"),
                        Component.translatable("pl.book.zhanchat13.page2"),
                        Component.translatable("pl.book.zhanchat13.page3")
                ));
            });

            // Create merchant recipe
            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:desert\"}");
    }
}
