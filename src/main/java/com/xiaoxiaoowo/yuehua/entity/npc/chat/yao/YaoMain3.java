package com.xiaoxiaoowo.yuehua.entity.npc.chat.yao;

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

public final class YaoMain3 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 2648, 96, 862, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.yaomain3"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade - Purple dye for book
            {
                ItemStack buyItem = RaceProvince.yao.clone();

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9铁匠铺掌柜的招待"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(Component.translatable("pl.book.ym2.page1")));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:jungle\"}");
    }
}