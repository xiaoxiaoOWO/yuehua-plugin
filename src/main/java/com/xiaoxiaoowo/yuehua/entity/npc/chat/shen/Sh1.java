package com.xiaoxiaoowo.yuehua.entity.npc.chat.shen;

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

public final class Sh1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 3318, 115, 354, 0, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);
            it.customName(Component.translatable("pl.npc.name.sh1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // First trade item
            ItemStack buyItem = RaceProvince.shen.clone();

            // Sell item (Written Book)
            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9与燃灯对话..."));
                bookMeta.author(Component.text("§9燃灯"));
                bookMeta.pages(List.of(
                        Component.text("神族自盘古开天辟地起，就继承他的血脉而存在着。而人仙二族，均出自我族的女娲之手。只有妖族，不知从何而来，为何而生。而当我族的族人想要探索妖族的秘密时，却受到世界意志-天道的阻挠。这就像是当年长老想要一举歼灭反抗的妖族，却因为天道的妨碍而作罢。"),
                        Component.text("天道究竟为何要维护妖族？又为何要制约我族？这些问题一直萦绕在我的心头挥之不去。朋友啊，有机会的话，可否请你潜入妖族村落中，到它们号称世界最齐全的图书馆去看看？或许会有所发现也不一定。")

                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:snow\"}");
    }
}
