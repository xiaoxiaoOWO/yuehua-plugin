package com.xiaoxiaoowo.yuehua.entity.npc.chat.shen;

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

public final class Shenmain1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3195, 76, 374, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.shenmain1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade item
            ItemStack buyItem = RaceProvince.shen.clone();
            // Sell item (Paper)
            ItemStack sellItem = new ItemStack(Material.NETHER_WART, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newshen"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newshena"),
                        Component.translatable("pl.item.lore.newshenb"),
                        Component.translatable("pl.item.lore.newshenc")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}
