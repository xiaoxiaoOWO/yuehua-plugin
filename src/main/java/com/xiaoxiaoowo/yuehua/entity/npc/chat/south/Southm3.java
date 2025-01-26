package com.xiaoxiaoowo.yuehua.entity.npc.chat.south;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.items.liandan.Dan;
import com.xiaoxiaoowo.yuehua.items.other.Food;
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

public final class Southm3 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 375, 50, 767, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.southm3"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade: Book exchange
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9火山之神的代言人"));
                bookMeta.author(Component.text("§9巫者红鸾"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm2.page1"),
                        Component.translatable("pl.book.southm2.page2")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9睿智的少女"));
                bookMeta.author(Component.text("§9莲心"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.southm3.page1"),
                        Component.translatable("pl.book.southm3.page2"),
                        Component.translatable("pl.book.southm3.page3"),
                        Component.translatable("pl.book.southm3.page4")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);

            // Second trade: Potion recipe
            ItemStack buyItem2 = Dan.YAOYIN1.clone();
            buyItem2.setAmount(3);

            ItemStack buyItem3 = YuanSu.tu.clone();
            buyItem3.setAmount(10);

            ItemStack sellItem2 = Food.lianxin.clone();
            sellItem2.setAmount(1);

            MerchantRecipe recipe2 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe2.addIngredient(buyItem2);
            recipe2.addIngredient(buyItem3);
            recipes.add(recipe2);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:savanna\"}");
    }
}
