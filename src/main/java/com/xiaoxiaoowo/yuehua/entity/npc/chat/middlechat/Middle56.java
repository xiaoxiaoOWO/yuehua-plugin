package com.xiaoxiaoowo.yuehua.entity.npc.chat.middlechat;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.liandan.Herb;
import com.xiaoxiaoowo.yuehua.items.other.Money;
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

public final class Middle56 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 34, 49, 52, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.middle56"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First recipe
            ItemStack buyItem1 = new ItemStack(Material.LIME_DYE, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.middle56"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat1a.middle56")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.LIME_DYE, 1);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.middle56"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat2a.middle56")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second recipe
            ItemStack buyItem2 = Herb.LingZhi.clone();
            buyItem2.setAmount(1);

            ItemStack sellItem2 = Money.jinYuanBao.clone();
            sellItem2.setAmount(1);

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}
