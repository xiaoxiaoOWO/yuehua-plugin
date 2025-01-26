package com.xiaoxiaoowo.yuehua.entity.npc.chat.west;

import com.xiaoxiaoowo.yuehua.Yuehua;
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

public final class Rh4 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, -112, 33, 133, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.rh4"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Cocoa Beans -> Written Book
            ItemStack buyItem = RaceProvince.ren.clone();

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与神农氏对话..."));
                bookMeta.author(Component.text("§9神农氏"));
                bookMeta.pages(List.of(
                        Component.text("唉……你是人族的人，想知道女娲的去向也是很正常的。你一定很奇怪，虽然身为守护神，但是女娲自从造了人之后，却一次也没有去看过你们吧？不是因为不想去，而是因为去不了。因为女娲……她已经死了。是的，你没有听错，她已经死了。"),
                        Component.text("神照理说是不会死的，因为我们与天地同寿。只有一个例外，那就是被另一个能力更强大的神所杀。杀死女娲的……正是神族的长老。我不知道他到底为什么要杀女娲……明明，就是长老吩咐女娲去造人的……他说用个新的种族可以抵制妖族的扩大。"),
                        Component.text("但是，就在女娲完成任务，回来回报的时候，长老就将她给杀了。只有我……只有我看到了……我不敢告诉任何人，生怕一样会被长老杀了灭口。所以我离开神族的领地，尽可能隐瞒我神族的身份，不与任何同族人往来，就是怕长老找上门来……"),
                        Component.text("女娲死前其实大概也知道这件事情，她告诉我：「如果我出了什么事情，人族的孩子就拜托你了。」我还不能死，因为我答应了女娲。所以我代替她，不断庇佑你们。但对于那些祈祷女娲降临的人们，我实在没办法现身告诉他们真相：他们所敬爱的神，早就已经不在了……"),
                        Component.text("今天这些话，你就放在心里，绝对不要说出去。如果说出去的话，只会引来杀机。\n" +
                                "真相是危险的……不能自保，就不要泄漏它。人族隐藏剧情路线到此结束。")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, false);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:cartographer\",level:26,type:\"minecraft:snow\"}");
    }
}

