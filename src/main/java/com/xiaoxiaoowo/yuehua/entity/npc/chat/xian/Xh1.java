package com.xiaoxiaoowo.yuehua.entity.npc.chat.xian;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
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

public final class Xh1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3180.5, 95, 889.5, 0, 0);

        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            // 村民基础设置
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            // 设置自定义名字
            it.customName(Component.translatable("pl.npc.name.xh1").color(NamedTextColor.AQUA));
            it.setCustomNameVisible(true);

            // 设置交易项目
            List<MerchantRecipe> recipes = new ArrayList<>();

            // 交易：书
            ItemStack buyItem = RaceProvince.xian.clone();

            ItemStack sellItem = new ItemStack(org.bukkit.Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.setTitle("§9与藏书阁管理员对话...");
                bookMeta.setAuthor("§9藏书阁管理员");
                bookMeta.pages(List.of(
                        Component.text("嘿，这位道友，向你打听一件事。你知道四圣兽吗？对啊，就是协助神族管理世界，但是后来遭到攻击而失踪的四圣兽。你知道我在藏书阁的禁区里面发现什么吗？居然是四圣兽的制作蓝图！虽然我看不懂里面的内容，但是很明显的这就是蓝图。这个发现实在太令我兴奋了。如果我们可以制作出四圣兽来，那么就可以和神族一较高下了啊！"),
                        Component.text("我现在没办法离开岗位，你帮我把这份蓝图拿去给这里最厉害的工匠-戒忍上仙，请他看看这份制作图究竟是真是假？")
                        )
                );
            });

            ItemStack sellItem2 = new ItemStack(Material.NETHER_WART, 1);
            sellItem2.editMeta(meta -> {
                meta.displayName(Component.translatable("pl.item.name.xian_hide_item1"));
                meta.lore(List.of(
                        Component.translatable("pl.item.lore.xian_hide_item1.a"),
                        Component.translatable("pl.item.lore.xian_hide_item1.b")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            MerchantRecipe recipe1 = new MerchantRecipe(sellItem2, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe1.addIngredient(sellItem);
            recipes.add(recipe1);

            it.setRecipes(recipes);
        });

        // 设置村民外观和职业
        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}

