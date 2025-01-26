package com.xiaoxiaoowo.yuehua.entity.npc.chat.east;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Mission;
import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Re1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 533, 33, 41, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.re1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            ItemStack buyItem1 = RaceProvince.ren.clone();

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9帮小兔子回家"));
                bookMeta.author(Component.text("§9路边的小妹妹"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.re1.page1"),
                        Component.translatable("pl.book.re1.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second Trade - Cocoa Bean for Nether Wart
            ItemStack buyItem2 = RaceProvince.ren.clone();
            ItemStack sellItem2 = Mission.tuzi.clone();

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:savanna\"}");
    }
}
