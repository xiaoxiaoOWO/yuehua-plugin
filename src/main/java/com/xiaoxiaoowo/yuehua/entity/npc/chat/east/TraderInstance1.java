package com.xiaoxiaoowo.yuehua.entity.npc.chat.east;

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

public final class TraderInstance1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 616, 9, -144, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.trader_instance1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Trade - Core Iron Armor Helmet for Instance Collection
            ItemStack buyItem1 = new ItemStack(Material.RAW_GOLD, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.core_iron_armor_helmet"));
                meta.lore(List.of(
                        Component.translatable("pl.lore.rare6"),
                        Component.translatable("pl.lore.limit_lvl_50"),
                        Component.translatable("pl.item.lore.core_iron_armor_helmet.a"),
                        Component.translatable("pl.item.lore.core_iron_armor_helmet.b"),
                        Component.translatable("pl.item.lore.core_iron_armor_helmet.c"),
                        Component.translatable("pl.item.lore.core_iron_armor_helmet.d"),
                        Component.translatable("pl.item.lore.core_iron_armor_helmet.e")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.ORANGE_DYE, 16);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.instance1_collection"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.instance1_collectiona"),
                        Component.translatable("pl.item.lore.instance1_collectionb")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Trade - Instance Collection for Refine Stone Legend
            ItemStack buyItem2 = sellItem1.clone();
            buyItem2.setAmount(16);

            ItemStack sellItem2 = new ItemStack(Material.FIRE_CHARGE, 1);
            sellItem2.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.refine_stone_legend0"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.refine_stone_legend0.a"),
                        Component.translatable("pl.item.lore.refine_stone_legend0.b"),
                        Component.translatable("pl.item.lore.refine_stone_legend0.c")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Third Trade - Instance Collection for Feather Branch
            ItemStack buyItem3 = sellItem1.clone();
            buyItem3.setAmount(4);

            ItemStack sellItem3 = new ItemStack(Material.WHITE_DYE, 1);
            sellItem3.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.feather_branch5"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.feather_branch5a"),
                        Component.translatable("pl.item.lore.feather_branchb"),
                        Component.translatable("pl.item.lore.feather_branchc"),
                        Component.translatable("pl.item.lore.feather_branchd")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            // Fourth Trade - Instance Collection for Armor Core
            ItemStack buyItem4 = sellItem1.clone();
            buyItem4.setAmount(2);

            ItemStack sellItem4 = new ItemStack(Material.IRON_NUGGET, 1);
            sellItem4.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.acore5"));
                meta.lore(List.of(
                        Component.translatable("pl.lore.rare5"),
                        Component.translatable("pl.item.lore.acore5a"),
                        Component.translatable("pl.item.lore.acore5b")
                ));
            });

            MerchantRecipe recipe4 = new MerchantRecipe(sellItem4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyItem4);
            recipes.add(recipe4);

            // Fifth Trade - Instance Collection for Weapon Core
            ItemStack buyItem5 = sellItem1.clone();
            buyItem5.setAmount(4);

            ItemStack sellItem5 = new ItemStack(Material.DIAMOND, 1);
            sellItem5.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.wcore5"));
                meta.lore(List.of(
                        Component.translatable("pl.lore.rare5"),
                        Component.translatable("pl.item.lore.wcore5a"),
                        Component.translatable("pl.item.lore.wcoreb")
                ));
            });

            MerchantRecipe recipe5 = new MerchantRecipe(sellItem5, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe5.addIngredient(buyItem5);
            recipes.add(recipe5);

            // Sixth Trade - Instance Collection for YY3
            ItemStack buyItem6 = sellItem1.clone();
            buyItem6.setAmount(2);

            ItemStack sellItem6 = new ItemStack(Material.POISONOUS_POTATO, 1);
            sellItem6.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.yy3"));
                meta.lore(List.of(Component.translatable("pl.item.lore.yy")));
            });

            MerchantRecipe recipe6 = new MerchantRecipe(sellItem6, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe6.addIngredient(buyItem6);
            recipes.add(recipe6);

            // Seventh Trade - Instance Collection for YY2
            ItemStack buyItem7 = sellItem1.clone();
            buyItem7.setAmount(1);

            ItemStack sellItem7 = new ItemStack(Material.POISONOUS_POTATO, 4);
            sellItem7.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.yy2"));
                meta.lore(List.of(Component.translatable("pl.item.lore.yy")));
            });

            MerchantRecipe recipe7 = new MerchantRecipe(sellItem7, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe7.addIngredient(buyItem7);
            recipes.add(recipe7);

            // Eighth Trade - Instance Collection for Enchant Stone Part
            ItemStack buyItem8 = sellItem1.clone();
            buyItem8.setAmount(1);

            ItemStack sellItem8 = new ItemStack(Material.LIGHT_GRAY_DYE, 8);
            sellItem8.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.enchant_stonepart"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.enchant_stoneparta"),
                        Component.translatable("pl.item.lore.enchant_stonepartb")
                ));
            });

            MerchantRecipe recipe8 = new MerchantRecipe(sellItem8, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe8.addIngredient(buyItem8);
            recipes.add(recipe8);

            // Ninth Trade - Instance Collection for Gold Ingot
            ItemStack buyItem9 = sellItem1.clone();
            buyItem9.setAmount(1);

            ItemStack sellItem9 = new ItemStack(Material.GOLD_INGOT, 5);
            sellItem9.editMeta(meta -> meta.displayName(Component.translatable("pl.item.name.gold")));

            MerchantRecipe recipe9 = new MerchantRecipe(sellItem9, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe9.addIngredient(buyItem9);
            recipes.add(recipe9);

            // Tenth Trade - Instance Collection for Element Tick
            ItemStack buyItem10 = sellItem1.clone();
            buyItem10.setAmount(1);

            ItemStack sellItem10 = new ItemStack(Material.PAPER, 10);
            sellItem10.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.element_tick"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.element_ticka"),
                        Component.translatable("pl.item.lore.element_tickb")
                ));
            });

            MerchantRecipe recipe10 = new MerchantRecipe(sellItem10, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe10.addIngredient(buyItem10);
            recipes.add(recipe10);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}
