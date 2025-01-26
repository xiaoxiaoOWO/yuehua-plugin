package com.xiaoxiaoowo.yuehua.entity.npc.chat.ren;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
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

public final class Supply4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 1600, 140, 112, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.supply4"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 1. Cocoa Beans for Supply Book
            recipes.add(createBookRecipe(
                    Material.COCOA_BEANS,
                    "pl.item.name.zm4",
                    "pl.item.lore.zm4",
                    "§6村落补给品领取说明",
                    "§9补给品管理人-简方",
                    "panling:book_supply4",
                    "pl.book.supply4.page1"
            ));

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }

    private static MerchantRecipe createBookRecipe(
            Material buyMaterial,
            String buyNameKey,
            String buyLoreKey,
            String bookTitle,
            String bookAuthor,
            String bookId,
            String bookPageKey
    ) {
        ItemStack buyItem = RaceProvince.ren.clone();

        ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
        sellItem.editMeta(meta -> {
            BookMeta bookMeta = (BookMeta) meta;
            bookMeta.title(Component.text(bookTitle));
            bookMeta.author(Component.text(bookAuthor));
            bookMeta.pages(List.of(Component.translatable(bookPageKey)));
        });

        MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
        recipe.addIngredient(buyItem);
        return recipe;
    }
}
