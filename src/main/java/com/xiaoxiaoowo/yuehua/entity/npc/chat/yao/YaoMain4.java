package com.xiaoxiaoowo.yuehua.entity.npc.chat.yao;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.commands.opcommand.R;
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

public final class YaoMain4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 2656, 89, 895, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.yaomain4"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade - Book for book
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9铁匠铺掌柜的招待"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(Component.translatable("pl.book.ym2.page1")));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9丹药铺掌柜的招待"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(
                            Component.translatable("pl.book.ym3.page1"),
                            Component.translatable("pl.book.ym3.page2")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // Second trade - Book for nether wart
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9丹药铺掌柜的招待"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(
                            Component.translatable("pl.book.ym3.page1"),
                            Component.translatable("pl.book.ym3.page2")
                    ));
                });

                ItemStack sellItem = new ItemStack(Material.NETHER_WART, 1);
                sellItem.editMeta(meta -> {
                    meta.displayName(Component.translatable("pl.item.name.yaomain3"));
                    meta.lore(List.of(Component.translatable("pl.item.lore.yaomain3")));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // Third trade - Purple dye for book
            {
                ItemStack buyItem = RaceProvince.yao.clone();

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9与炼丹铺掌柜对话..."));
                    bookMeta.author(Component.text("§9炼丹铺掌柜"));
                    bookMeta.pages(List.of(
                            Component.text("朋友啊，你是否要出谷到外面去？那你可以帮我个忙吗？是这样的，你应该也知道，我们妖族有自己的炼丹方法，完全不需要使用内丹。但是人仙二族不知道是哪里弄到的方子，每一味药都需要用我族族人的内丹才能炼制。这根本是变相的屠杀啊……更何况他们炼制的丹药还没有我们用天然材料的方法来的有效。"),
                            Component.text("你这次到人族的城里去，帮我问问他们炼丹寨里的人，究竟是谁发明这种损人不利己的炼丹法。要是让我知道是谁，看我不冲过去把他碎尸万段……哼。")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:jungle\"}");
    }
}
