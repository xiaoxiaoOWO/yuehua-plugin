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

public final class XianMain2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3337.5, 109, 941.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.xianmain2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // 第一个交易
            {
                ItemStack buyItem = new ItemStack(Material.NETHER_WART, 1);
                buyItem.editMeta(meta -> {
                    meta.displayName(Component.translatable("pl.item.name.newxian"));
                    meta.lore(List.of(
                            Component.translatable("pl.item.lore.newxiana"),
                            Component.translatable("pl.item.lore.newxianb"),
                            Component.translatable("pl.item.lore.newxianc")
                    ));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9与仙族盟主会面");
                    bookMeta.setAuthor("§9仙族主线");
                    bookMeta.pages(List.of(
                            Component.translatable("pl.book.xm1.page1")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // 第二个交易
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9与仙族盟主会面");
                    bookMeta.setAuthor("§9仙族主线");
                    bookMeta.pages(List.of(
                            Component.translatable("pl.book.xm1.page1")
                    ));
                });

                ItemStack sellItem = new ItemStack(Material.NETHER_WART, 6);
                sellItem.editMeta(meta -> {
                    meta.displayName(Component.translatable("pl.item.name.newchange"));
                    meta.lore(List.of(
                            Component.translatable("pl.item.lore.newchange")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // 第三个交易
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9灵丹铺掌柜的招待");
                    bookMeta.setAuthor("§9仙族主线");
                    bookMeta.pages(List.of(
                            Component.translatable("pl.book.xm3.page1"),
                            Component.translatable("pl.book.xm3.page2")
                    ));
                });


                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9人界的动荡");
                    bookMeta.setAuthor("§9仙族主线");
                    bookMeta.pages(List.of(
                            Component.translatable("pl.book.xm4.page1")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // 第四个交易
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9与刘子骥对话..."));
                    bookMeta.author(Component.text("§9刘子骥"));
                    bookMeta.pages(List.of(
                            Component.text("唉……其他族的守护神有时候都会降下神迹，帮助他们的种族渡过难关。唯有我族的女娲，从来没有出现过。虽然传说都说女娲造了我们人类，但是究竟有没有人真的看过呢？虽然人族的女娲祝福还是存在，但是我还是很纳闷啊……女娲究竟到哪里去了呢……这位朋友，请问你知道答案吗？"),
                            Component.text("……不知道啊……没关系，如果未来你得到了任何关于女娲的消息，请一定要告诉我啊！至于要去哪里获得信息……那只有去找人族最长寿的人吧！喔不对，应该是仙族最长寿的人。毕竟人会成仙，而仙的寿命更长。所以去找活的最久的仙人，或许就能知道女娲的去向了！麻烦你了，如果你有机会到仙族蜀山的话一定要帮我问问看啊。")
                    ));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9与仙族盟主对话...");
                    bookMeta.setAuthor("§9仙族盟主");
                    bookMeta.pages(List.of(
                            Component.text("关于最长寿的仙人？你问这个做什么呢？你说女娲啊…..这太久远了，即使是目前最长寿的仙人大概也无法回答你的问题吧。女娲从很久以前就不再出现了。不过如果你真的那么有兴趣的话，我帮你找找看，我记得有这方面的文献……有了，这是第一任仙族盟主留下来的玉简……里面记载了一些关于女娲的事情。"),
                            Component.text("神族女娲，是人族的创造者。女娲利用自己的脊椎骨，沾了泥水甩动，掉落的泥块化为人族的祖先。嗯……历史的部分好像只到女娲创造人类，之后就没有关于他的任何信息了。前面也只有提到她与神族的药草之神-神农氏非常要好，除此之外没有其他的记载。神农氏似乎隐居在凡间，不过我也不知道他在哪。若你有幸遇到这位传说中的药神，问问他或许会知道的更清楚些。")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }

            // 第五个交易
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9与管理员-墨仙对话...");
                    bookMeta.setAuthor("§9管理员-墨仙");
                    bookMeta.pages(List.of(
                            Component.text("你好，我是管理仙族历史的墨仙。请问需要查询什么？四圣兽，是由仙族设计，神仙二族共同制作的强大法器。它们拥有自己的意志，但是指挥权还是握在仙族手中。制作完成后，仙族将四圣兽的指挥权赠送给神族，作为二族友好的象征。而神族也善用了四圣兽的能力，将世界管理的井井有条。"),
                            Component.text("但是百年前战神一族的攻击，令四圣兽负伤失踪，不知去向。嗯……大概就是这些。唉？你很意外四圣兽是我族送给神族的吗？我看看喔……当初做决定的好像是那时的仙族盟主。如果还是很疑惑的话，不妨去找现任的盟主问问看？历代盟主都会有传承的文献，或许那里有你需要的记载。")
                    ));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9与仙族盟主对话...");
                    bookMeta.setAuthor("§9仙族盟主");
                    bookMeta.pages(List.of(
                            Component.text("关于四圣兽的事情？原来如此。这件事情我也颇有兴趣。要不是你提到，我还真的不知道四圣兽是我们送给神族的。我来找找看那一任盟主的日志……咦？这卷卷宗是哪里来的？之前整理的时候怎么没有看到？盟主打开卷宗，邀你一起看"),
                            Component.text("卷宗内容：\n" +
                                    "四圣兽，将是我族获得永生的关键。这个计划太过重要，我将它藏在一枚玉简中。并将玉简和某位值得托付的族人一起封印在虎爪山上的某处。只有想知道四圣兽计划的仙族同胞才能发现这宗卷宗。请带着卷宗，前往虎爪山的庙中，寻找一位名叫「雨竹」的仙人。剩下的事情，他会告诉你的。"),
                            Component.text("看来我们发现了一个惊天的大秘密啊……我不能离开这里，你快带着卷宗，到上面所标示的庙中去找这位仙人。如果真的能获得永生之法……我们超越神族的未来就指日可待了。")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);
            }
            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.setTitle("§9与仙族盟主对话...");
                    bookMeta.setAuthor("§9仙族盟主");
                    bookMeta.pages(List.of(
                            Component.text("关于四圣兽的事情？原来如此。这件事情我也颇有兴趣。要不是你提到，我还真的不知道四圣兽是我们送给神族的。我来找找看那一任盟主的日志……咦？这卷卷宗是哪里来的？之前整理的时候怎么没有看到？盟主打开卷宗，邀你一起看"),
                            Component.text("卷宗内容：\n" +
                                    "四圣兽，将是我族获得永生的关键。这个计划太过重要，我将它藏在一枚玉简中。并将玉简和某位值得托付的族人一起封印在虎爪山上的某处。只有想知道四圣兽计划的仙族同胞才能发现这宗卷宗。请带着卷宗，前往虎爪山的庙中，寻找一位名叫「雨竹」的仙人。剩下的事情，他会告诉你的。"),
                            Component.text("看来我们发现了一个惊天的大秘密啊……我不能离开这里，你快带着卷宗，到上面所标示的庙中去找这位仙人。如果真的能获得永生之法……我们超越神族的未来就指日可待了。")
                    ));
                });
                ItemStack sellItem = new ItemStack(Material.NETHER_WART, 1);
                sellItem.editMeta(meta -> {
                    meta.displayName(Component.translatable("pl.item.name.xian_hide_key"));
                    meta.lore(List.of(
                            Component.translatable("pl.item.lore.xian_hide_key.a"),
                            Component.translatable("pl.item.lore.xian_hide_key.b"),
                            Component.translatable("pl.item.lore.xian_hide_key.c")
                    ));
                });

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);

            }

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:librarian\",level:26,type:\"minecraft:taiga\"}");
    }
}
