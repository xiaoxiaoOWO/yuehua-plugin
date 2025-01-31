package com.xiaoxiaoowo.yuehua.entity.npc.chat.north;

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

public final class North2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -289, 22, -667, 0, 0); // 使用指令中的坐标
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.north2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Trade: Lime Dye for Lime Dye with custom name and lore
            ItemStack buyItem = new ItemStack(Material.LIME_DYE, 1);
            buyItem.editMeta(meta -> {
                ItemMeta itemMeta = (ItemMeta) meta;
                itemMeta.displayName(Component.translatable("pl.npc.name.north2"));
                itemMeta.lore(List.of(
                        Component.translatable("pl.npc.chat1a.north2"),
                        Component.translatable("pl.npc.chat1b.north2")
                ));
            });

            ItemStack sellItem = new ItemStack(Material.LIME_DYE, 1);
            sellItem.editMeta(meta -> {
                ItemMeta itemMeta = (ItemMeta) meta;
                itemMeta.displayName(Component.translatable("pl.npc.name.north2"));
                itemMeta.lore(List.of(
                        Component.translatable("pl.npc.chat2a.north2"),
                        Component.translatable("pl.npc.chat2b.north2")
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

