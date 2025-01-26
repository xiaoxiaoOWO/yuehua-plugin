package com.xiaoxiaoowo.yuehua.entity.npc.chat.shen;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Shen3 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3328, 128, 260, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.shen3"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade item
            ItemStack buyItem = new ItemStack(Material.LIME_DYE, 1);
            ItemMeta buyMeta = buyItem.getItemMeta();
            buyMeta.displayName(Component.translatable("pl.npc.name.shen3"));
            buyMeta.lore(List.of(Component.translatable("pl.npc.chat1a.shen3")));
            buyItem.setItemMeta(buyMeta);

            // Sell item
            ItemStack sellItem = new ItemStack(Material.LIME_DYE, 1);
            ItemMeta sellMeta = sellItem.getItemMeta();
            sellMeta.displayName(Component.translatable("pl.npc.name.shen3"));
            sellMeta.lore(List.of(Component.translatable("pl.npc.chat2a.shen3")));
            sellItem.setItemMeta(sellMeta);

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}