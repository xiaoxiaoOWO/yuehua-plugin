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

public final class LiGongGong {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 172, 66, -158, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.renmain5"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First recipe (Book RM4 to RM5)
            ItemStack buyItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9村长担忧的事情"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm4.page1")
                ));
            });

            ItemStack sellItem1 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem1.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9李公公的委托"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm5.page1"),
                        Component.translatable("pl.book.rm5.page2")
                ));
            });

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem1, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(buyItem1);
            recipes.add(recipe1);


            // Third recipe (Book RM7 to RM8)
            ItemStack buyItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9青龙分魂"));
                bookMeta.author(Component.text("§9人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm7.page1"),
                        Component.translatable("pl.book.rm7.page2")
                ));
            });

            ItemStack sellItem3 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem3.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9收集祝福之力"));
                bookMeta.author(Component.text("§9[必读]人族主线"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.rm8.page1"),
                        Component.translatable("pl.book.rm8.page2")
                ));
            });

            MerchantRecipe recipe3 = new MerchantRecipe(sellItem3, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe3.addIngredient(buyItem3);
            recipes.add(recipe3);

            // Fourth recipe (Purple Dye for Yao Hide Book)
            ItemStack buyItem4 = new ItemStack(Material.WRITTEN_BOOK);
            buyItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与药童对话..."));
                bookMeta.author(Component.text("§9药童"));
                bookMeta.pages(List.of(
                        Component.text("你向药童询问了炼丹与妖族内丹相关的问题唉？你问我为什么炼丹要这么炼？这有什么好问的啊？该不会你连基础炼丹法都没读熟吗？诺，就是这本。小药童向你展示了手中的基础炼丹法不过这本不能给你，这是我亲自到皇宫领来的。"),
                        Component.text("你想要的话，自己去找大内总管-李公公要一份吧。里面基础的炼丹方法都写得非常清楚呢。甚至还讲解如何捕捉妖怪取内丹，是非常实用的一本书喔。")
                ));
            });

            ItemStack sellItem4 = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem4.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与大内总管-李公公对话..."));
                bookMeta.author(Component.text("§9大内总管-李公公"));
                bookMeta.pages(List.of(
                        Component.text("咦？你要领取基础炼丹法？可是今年度的早就算好了啊，怎么会少？太糟糕了，枉费我号称「精打细算」，我这就去找一本给你啰。啥？不用了？那你这小家伙到底是来找我做啥的？喔……想问这基础炼丹法是谁写的？这还用问啊，这当然是神族炼丹的第一把交椅-太上老君神上，亲自撰写的啰。"),
                        Component.text("他可是唯一一位研究出特殊药引和特殊丹药的丹神呢。有了这本基础炼丹法，我们可以更容易炼制出上品仙丹。又可以顺便铲除那些对环境有害的妖族妖怪，真是一举数得呢。如果对基础炼丹法有不懂的地方，也只能亲自请教太上老君了。")
                ));
            });

            MerchantRecipe recipe4 = new MerchantRecipe(sellItem4, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe4.addIngredient(buyItem4);
            recipes.add(recipe4);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}
