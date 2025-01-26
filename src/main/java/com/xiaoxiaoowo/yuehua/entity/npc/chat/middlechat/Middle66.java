package com.xiaoxiaoowo.yuehua.entity.npc.chat.middlechat;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.liandan.Herb;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Middle66 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 210, 65, -230, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.middle66"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First recipe (Lime Dye)
            ItemStack buyItem1 = new ItemStack(Material.LIME_DYE, 1);
            buyItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.middle66"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat1a.middle66")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.LIME_DYE, 1);
            sellItem1.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.npc.name.middle66"));
                meta.lore(List.of(
                        Component.translatable("pl.npc.chat2a.middle66"),
                        Component.translatable("pl.npc.chat2b.middle66")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);


            // Third recipe (Rabbit for Honey)
            ItemStack buyItem3 = Herb.HeShouWu.clone();
            buyItem3.setAmount(3);

            ItemStack sellItem3 = Food.fengmi.clone();
            sellItem3.editMeta(meta -> {
                meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"gongmixinqitian");
                meta.displayName(Component.translatable("pl.item.name.honey"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.honeya"),
                        Component.translatable("pl.item.lore.honeyb")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}
