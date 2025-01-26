package com.xiaoxiaoowo.yuehua.entity.npc.chat.xian;

import com.xiaoxiaoowo.yuehua.Yuehua;
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

public final class XianMain4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3205.5, 85, 860.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.xianmain4"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9仙器铺掌柜的招待");
                bookMeta.setAuthor("§9仙族主线");
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm2.page1"),
                        Component.translatable("pl.book.xm2.page2")
                ));
            });

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9灵丹铺掌柜的招待");
                bookMeta.setAuthor("§9仙族主线");
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm3.page1"),
                        Component.translatable("pl.book.xm3.page2")
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
