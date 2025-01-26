package com.xiaoxiaoowo.yuehua.entity.npc.chat.xian;

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

public final class XianMain1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3190.5, 103, 784.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.xianmain1"));
            it.setCustomNameVisible(true);

            // 设置交易项目
            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易：引路纸
            ItemStack buyItem = RaceProvince.xian;

            ItemStack sellItem = new ItemStack(Material.NETHER_WART, 1);
            sellItem.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.newxian"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.newxiana"),
                        Component.translatable("pl.item.lore.newxianb"),
                        Component.translatable("pl.item.lore.newxianc")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}
