package com.xiaoxiaoowo.yuehua.entity.npc.chat.middlechat;

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

public final class Middle57 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 61, 47, 117, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.middle57"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First recipe (Lime Dye)
            ItemStack buyItem1 = new ItemStack(Material.LIME_DYE, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.middle57"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat1a.middle57"),
                        Component.translatable("pl.npc.chat1b.middle57")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.LIME_DYE, 1);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.middle57"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat2a.middle57"),
                        Component.translatable("pl.npc.chat2b.middle57")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);



            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}
