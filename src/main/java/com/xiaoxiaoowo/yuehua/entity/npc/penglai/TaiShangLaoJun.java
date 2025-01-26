package com.xiaoxiaoowo.yuehua.entity.npc.penglai;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Mission;
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

public final class TaiShangLaoJun {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 339.5, 33, -715.5, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("§b太上老君"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            {
                ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                buyItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9与大内总管-李公公对话..."));
                    bookMeta.author(Component.text("§9大内总管-李公公"));
                    bookMeta.pages(List.of(
                            Component.text("咦？你要领取基础炼丹法？可是今年度的早就算好了啊，怎么会少？太糟糕了，枉费我号称「精打细算」，我这就去找一本给你啰。啥？不用了？那你这小家伙到底是来找我做啥的？喔……想问这基础炼丹法是谁写的？这还用问啊，这当然是神族炼丹的第一把交椅-太上老君神上，亲自撰写的啰。"),
                            Component.text("他可是唯一一位研究出特殊药引和特殊丹药的丹神呢。有了这本基础炼丹法，我们可以更容易炼制出上品仙丹。又可以顺便铲除那些对环境有害的妖族妖怪，真是一举数得呢。如果对基础炼丹法有不懂的地方，也只能亲自请教太上老君了。")
                    ));
                });

                ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
                sellItem.editMeta(meta -> {
                    BookMeta bookMeta = (BookMeta) meta;
                    bookMeta.title(Component.text("§9与太上老君对话..."));
                    bookMeta.author(Component.text("§9太上老君"));
                    bookMeta.pages(List.of(
                            Component.text("年轻人，来找本君究竟有何贵干呢？什么？你说我的炼丹技术太差？呃……基础炼丹法啊……这本的确是写得不太好……原来你是妖族的，怪不得你会如此生气……也是我的责任啊…唉……这件事情，其实我一直很懊悔，但是木已成舟，无法更改了……如果你真的想知道，那么就拿着这把钥匙，到后面的书房来找我吧。")
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
                    bookMeta.title(Component.text("§9与太上老君对话..."));
                    bookMeta.author(Component.text("§9太上老君"));
                    bookMeta.pages(List.of(
                            Component.text("年轻人，来找本君究竟有何贵干呢？什么？你说我的炼丹技术太差？呃……基础炼丹法啊……这本的确是写得不太好……原来你是妖族的，怪不得你会如此生气……也是我的责任啊…唉……这件事情，其实我一直很懊悔，但是木已成舟，无法更改了……如果你真的想知道，那么就拿着这把钥匙，到后面的书房来找我吧。")
                    ));
                });

                ItemStack sellItem = Mission.yaohide.clone();

                MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
                recipe.addIngredient(buyItem);
                recipes.add(recipe);

            }



            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:cleric\",level:26,type:\"minecraft:snow\"}");
    }
}
