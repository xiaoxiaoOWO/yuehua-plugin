package com.xiaoxiaoowo.yuehua.entity.npc.chat.north;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Fish;
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

public final class Northm2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -336, 18, -687, 0, 0); // 使用指令中的坐标
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.northm2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 第一个交易：书籍交换
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta1 = (BookMeta) buyItem1.getItemMeta();
            if (bookMeta1 != null) {
                bookMeta1.setTitle("§9住在湖底的民族");
                bookMeta1.setAuthor("§9水渊");
                bookMeta1.pages(
                        List.of(
                                Component.translatable("pl.book.northm1.page1"),
                                Component.translatable("pl.book.northm1.page2")
                        )
                );
                buyItem1.setItemMeta(bookMeta1);
            }

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta2 = (BookMeta) sellItem1.getItemMeta();
            if (bookMeta2 != null) {
                bookMeta2.setTitle("§9洄游祭的准备工作");
                bookMeta2.setAuthor("§9洛禾");
                bookMeta2.pages(
                        List.of(
                                Component.translatable("pl.book.northm2.page1"),
                                Component.translatable("pl.book.northm2.page2"),
                                Component.translatable("pl.book.northm2.page3")
                        )
                );
                sellItem1.setItemMeta(bookMeta2);
            }

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // 第二个交易：书籍与鱼类交换
            ItemStack buyItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta3 = (BookMeta) buyItem2.getItemMeta();
            if (bookMeta3 != null) {
                bookMeta3.setTitle("§9洄游祭的准备工作");
                bookMeta3.setAuthor("§9洛禾");
                bookMeta3.pages(
                        List.of(Component.translatable("pl.book.northm2.page1"),
                                Component.translatable("pl.book.northm2.page2"),
                                Component.translatable("pl.book.northm2.page3")
                        )
                );
                buyItem2.setItemMeta(bookMeta3);
            }

            ItemStack buyBItem = Fish.xueyu.clone();
            buyBItem.setAmount(10);
            ItemStack sellItem2 = new ItemStack(Material.WRITTEN_BOOK, 1);
            BookMeta bookMeta4 = (BookMeta) sellItem2.getItemMeta();
            if (bookMeta4 != null) {
                bookMeta4.setTitle("§9玄武的认可");
                bookMeta4.setAuthor("§9洛禾");
                bookMeta4.pages(List.of(
                        Component.translatable("pl.book.northm3.page1")
                ));
                sellItem2.setItemMeta(bookMeta4);
            }

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, Integer.MAX_VALUE, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipe2.addIngredient(buyBItem);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        // 设置职业数据
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}

