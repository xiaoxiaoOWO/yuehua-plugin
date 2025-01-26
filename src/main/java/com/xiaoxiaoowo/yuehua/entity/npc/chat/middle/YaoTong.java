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

public final class YaoTong {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 263.5, 49, 23.5, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.yh2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            buyItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与炼丹铺掌柜对话..."));
                bookMeta.author(Component.text("§9炼丹铺掌柜"));
                bookMeta.pages(List.of(
                        Component.text("朋友啊，你是否要出谷到外面去？那你可以帮我个忙吗？是这样的，你应该也知道，我们妖族有自己的炼丹方法，完全不需要使用内丹。但是人仙二族不知道是哪里弄到的方子，每一味药都需要用我族族人的内丹才能炼制。这根本是变相的屠杀啊……更何况他们炼制的丹药还没有我们用天然材料的方法来的有效。"),
                        Component.text("你这次到人族的城里去，帮我问问他们炼丹寨里的人，究竟是谁发明这种损人不利己的炼丹法。要是让我知道是谁，看我不冲过去把他碎尸万段……哼。")
                ));
            });

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与药童对话..."));
                bookMeta.author(Component.text("§9药童"));
                bookMeta.pages(List.of(
                        Component.text("你向药童询问了炼丹与妖族内丹相关的问题唉？你问我为什么炼丹要这么炼？这有什么好问的啊？该不会你连基础炼丹法都没读熟吗？诺，就是这本。小药童向你展示了手中的基础炼丹法不过这本不能给你，这是我亲自到皇宫领来的。"),
                        Component.text("你想要的话，自己去找大内总管-李公公要一份吧。里面基础的炼丹方法都写得非常清楚呢。甚至还讲解如何捕捉妖怪取内丹，是非常实用的一本书喔。")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:plains\"}");
    }
}
