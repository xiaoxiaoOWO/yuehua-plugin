package com.xiaoxiaoowo.yuehua.entity.npc.chat.yao;

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

public final class YaoMain5 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 2742, 53, 867, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.yaomain5"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade - Nether wart for book
            {
                ItemStack buyItem = new ItemStack(Material.NETHER_WART, 1);
                buyItem.editMeta(meta -> {
                    meta.displayName(Component.translatable("pl.item.name.yaomain3"));
                    meta.lore(List.of(Component.translatable("pl.item.lore.yaomain3")));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9图书馆导览"));
                    bookMeta.author(Component.text("§9妖族主线"));
                    bookMeta.pages(List.of(Component.translatable("pl.book.ym4.page1")));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // Third trade - Purple dye for book
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9与燃灯对话..."));
                    bookMeta.author(Component.text("§9燃灯"));
                    bookMeta.pages(List.of(
                            Component.text("神族自盘古开天辟地起，就继承他的血脉而存在着。而人仙二族，均出自我族的女娲之手。只有妖族，不知从何而来，为何而生。而当我族的族人想要探索妖族的秘密时，却受到世界意志-天道的阻挠。这就像是当年长老想要一举歼灭反抗的妖族，却因为天道的妨碍而作罢。"),
                            Component.text("天道究竟为何要维护妖族？又为何要制约我族？这些问题一直萦绕在我的心头挥之不去。朋友啊，有机会的话，可否请你潜入妖族村落中，到它们号称世界最齐全的图书馆去看看？或许会有所发现也不一定。")

                    ));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9与图书管理员对话..."));
                    bookMeta.author(Component.text("§9图书管理员"));
                    bookMeta.pages(List.of(
                            Component.text("你好，对妖族友善的神族朋友。有问题想要请教我吗？当然没问题，很乐意为你服务。我族的起源……？这倒是个有趣的问题。我族关于起源的记载相当稀少，就我所知，大部分的记载都是有关于其他几族的起源。我看看喔……这卷卷宗里似乎有记载。"),
                            Component.text("嗯……里面有提到我族出现的时间比神族稍晚，但是比人仙二族要早。不过并没有提到为何而出现，又或者是怎么出现的。毕竟对于自己的起源，除非像是神族一样直接继承部分盘古古神的记忆，不然应该都是不甚清楚的。人总不可能知道自己诞生的过程，你说是吧？"),
                            Component.text("不过尽管如此，也还是有办法的。在大陆的南方沙漠里，有一座古石碑。据说它自盘古开天就存在了，上面记载着一些没有人看得懂的信息。若有人可以翻译它的话，或许可以帮你解答你的疑惑。")
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
