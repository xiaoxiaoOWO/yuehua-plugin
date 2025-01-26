package com.xiaoxiaoowo.yuehua.entity.npc.chat.middle;

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

public final class YuLuo {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 185, 66, -158, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.xianmain5"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First Trade - Book XM4 for XM5
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9人界的动荡"));
                bookMeta.author(Component.text("§9仙族主线"));
                bookMeta.pages(List.of(Component.translatable("pl.book.xm4.page1")));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9羽罗的报告"));
                bookMeta.author(Component.text("§9仙族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm5.page1"),
                        Component.translatable("pl.book.xm5.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);


            // Third Trade - Book XM7 for XM8
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9衰退的龙之力"));
                bookMeta.author(Component.text("§9仙族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm7.page1"),
                        Component.translatable("pl.book.xm7.page2"),
                        Component.translatable("pl.book.xm7.page3")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9未知的圣兽行踪"));
                bookMeta.author(Component.text("§9[必读]仙族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.xm8.page1"),
                        Component.translatable("pl.book.xm8.page2"),
                        Component.translatable("pl.book.xm8.page3")
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
