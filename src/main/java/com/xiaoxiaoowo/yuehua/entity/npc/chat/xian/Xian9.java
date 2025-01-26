package com.xiaoxiaoowo.yuehua.entity.npc.chat.xian;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Xian9 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3229.5, 50, 980.5, 0, 0);

        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            // 村民基础设置
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            // 设置自定义名字
            it.customName(Component.translatable("pl.npc.name.xian9").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            // 设置交易项目
            List<MerchantRecipe> recipes = new ArrayList<>();

            // 创建交易1
            ItemStack buyItem = new ItemStack(org.bukkit.Material.LIME_DYE, 1);
            buyItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.xian9"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat1a.xian9")
                ));
            });

            ItemStack sellItem = new ItemStack(org.bukkit.Material.LIME_DYE, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.xian9"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat2a.xian9"),
                        Component.translatable("pl.npc.chat2b.xian9")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        // 设置村民外观和职业
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}
