package com.xiaoxiaoowo.yuehua.entity.npc.chat.penglai;

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

public final class Mainxx {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 347, 44, -653, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.mainxx"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 购买书籍 1
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta1 = (BookMeta) buyItem1.getItemMeta();  // 强制转换为 BookMeta
            if (bookMeta1 != null) {
                bookMeta1.title(Component.text("§9圣兽的去向"));
                bookMeta1.setAuthor("§9人族主线");
                bookMeta1.pages(List.of(Component.translatable("pl.book.rm9.page1"), Component.translatable("pl.book.rm9.page2")));
                buyItem1.setItemMeta(bookMeta1);
            }

            // 出售书籍 1
            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta2 = (BookMeta) sellItem1.getItemMeta();  // 强制转换为 BookMeta
            if (bookMeta2 != null) {
                bookMeta2.title(Component.text("§9沉睡的圣兽们"));
                bookMeta2.setAuthor("§9人族主线");
                bookMeta2.pages(List.of(Component.translatable("pl.book.rm10.page1"), Component.translatable("pl.book.rm10.page2"), Component.translatable("pl.book.rm10.page3")));
                sellItem1.setItemMeta(bookMeta2);
            }

            // 购买书籍 2
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta3 = (BookMeta) buyItem2.getItemMeta();  // 强制转换为 BookMeta
            if (bookMeta3 != null) {
                bookMeta3.title(Component.text("§9祝福之地"));
                bookMeta3.setAuthor("§9仙族主线");
                bookMeta3.pages(List.of(Component.translatable("pl.book.xm9.page1"), Component.translatable("pl.book.xm9.page2")));
                buyItem2.setItemMeta(bookMeta3);
            }

            // 出售书籍 2
            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta4 = (BookMeta) sellItem2.getItemMeta();  // 强制转换为 BookMeta
            if (bookMeta4 != null) {
                bookMeta4.title(Component.text("§9圣山的异常"));
                bookMeta4.setAuthor("§9仙族主线");
                bookMeta4.pages(List.of(Component.translatable("pl.book.xm10.page1"), Component.translatable("pl.book.xm10.page2"), Component.translatable("pl.book.xm10.page3")));
                sellItem2.setItemMeta(bookMeta4);
            }

            // 创建交易 1
            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // 创建交易 2
            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}
