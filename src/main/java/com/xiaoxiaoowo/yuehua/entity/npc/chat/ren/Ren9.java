package com.xiaoxiaoowo.yuehua.entity.npc.chat.ren;

import com.xiaoxiaoowo.yuehua.Yuehua;
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

public final class Ren9 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 1739, 149, 97, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.ren9"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Lime Dye Trade
            ItemStack buyItem = new ItemStack(Material.LIME_DYE, 1);
            buyItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.ren9"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat1a.ren9"),
                        Component.translatable("pl.npc.chat1b.ren9")
                ));
            });

            ItemStack sellItem = new ItemStack(Material.LIME_DYE, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.ren9"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat2a.ren9"),
                        Component.translatable("pl.npc.chat2b.ren9")
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
