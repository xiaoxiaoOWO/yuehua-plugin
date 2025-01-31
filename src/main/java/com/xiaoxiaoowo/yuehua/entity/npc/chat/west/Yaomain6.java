package com.xiaoxiaoowo.yuehua.entity.npc.chat.west;

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

public final class Yaomain6 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -197, 65, -173, 0, 0); // 使用指令中的坐标
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.yaomain6"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade: Book "大长老的求救信息"
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9大长老的求救信息"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym5.page1"),
                        Component.translatable("pl.book.ym5.page2")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9华夭的协助"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym6.page1"),
                        Component.translatable("pl.book.ym6.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second trade: Book "被囚禁的大长老"
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9被囚禁的大长老"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym7.page1"),
                        Component.translatable("pl.book.ym7.page2")
                ));
            });

            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem2.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9森林中的祭坛"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym8.page1"),
                        Component.translatable("pl.book.ym8.page2")
                ));
            });

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            // Third trade: Book "试探结界"
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9试探结界"));
                bookMeta.author(Component.text("§9妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym9.page1")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9结界逐渐消失？"));
                bookMeta.author(Component.text("§9[必读]妖族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ym10.page1"),
                        Component.translatable("pl.book.ym10.page2"),
                        Component.translatable("pl.book.ym10.page3"),
                        Component.translatable("pl.book.ym10.page4")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:savanna\"}");
    }
}

