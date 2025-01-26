package com.xiaoxiaoowo.yuehua.entity.npc.chat.ren;

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

public final class Rh1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 1713, 49, 159, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.rh1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Cocoa Beans for Book Trade
            ItemStack buyItem = RaceProvince.ren.clone();

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与刘子骥对话..."));
                bookMeta.author(Component.text("§9刘子骥"));
                bookMeta.pages(List.of(
                        Component.text("唉……其他族的守护神有时候都会降下神迹，帮助他们的种族渡过难关。唯有我族的女娲，从来没有出现过。虽然传说都说女娲造了我们人类，但是究竟有没有人真的看过呢？虽然人族的女娲祝福还是存在，但是我还是很纳闷啊……女娲究竟到哪里去了呢……这位朋友，请问你知道答案吗？"),
                        Component.text("……不知道啊……没关系，如果未来你得到了任何关于女娲的消息，请一定要告诉我啊！至于要去哪里获得信息……那只有去找人族最长寿的人吧！喔不对，应该是仙族最长寿的人。毕竟人会成仙，而仙的寿命更长。所以去找活的最久的仙人，或许就能知道女娲的去向了！麻烦你了，如果你有机会到仙族蜀山的话一定要帮我问问看啊。")
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