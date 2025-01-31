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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Renmain1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 1677, 134, 141, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.renmain1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Cocoa Beans for Paper Trade
            ItemStack buyItem = RaceProvince.ren.clone();

            ItemStack sellItem = new ItemStack(Material.NETHER_WART, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newren"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newrena"),
                        Component.translatable("pl.item.lore.newrenb"),
                        Component.translatable("pl.item.lore.newrenc")
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