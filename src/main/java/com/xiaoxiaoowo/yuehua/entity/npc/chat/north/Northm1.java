package com.xiaoxiaoowo.yuehua.entity.npc.chat.north;

import com.xiaoxiaoowo.yuehua.Yuehua;
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

public final class Northm1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -301, 19, -676, 0, 0); // 使用指令中的坐标
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.northm1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Trade: Pink Dye for a written book with custom title and pages
            ItemStack buyItem = Other.NPC_PAOPAO.clone();

            // Create the book item for selling
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta = (BookMeta) sellItem.getItemMeta();
            if (bookMeta != null) {
                bookMeta.setTitle("§9住在湖底的民族");
                bookMeta.setAuthor("§9水渊");
                bookMeta.pages(
                        List.of(
                                Component.translatable("pl.book.northm1.page1"),
                                Component.translatable("pl.book.northm1.page2")
                        )
                );
                sellItem.setItemMeta(bookMeta);
            }

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}


