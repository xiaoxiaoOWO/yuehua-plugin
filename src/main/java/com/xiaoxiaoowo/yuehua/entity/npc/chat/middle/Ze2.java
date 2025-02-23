package com.xiaoxiaoowo.yuehua.entity.npc.chat.middle;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Ze2 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 276, 24, -183, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.ze2"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            ItemStack buyItem = new ItemStack(Material.WRITTEN_BOOK);
            buyItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.title(Component.text("§9离家出走的小少爷"));
                bookMeta.author(Component.text("§9公孙小少爷"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ze1.page1"),
                        Component.translatable("pl.book.ze1.page2")
                ));
            });

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zhanshenzhixian");
                bookMeta.title(Component.text("§9蚀日的委托"));
                bookMeta.author(Component.text("§9蚀日"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ze2.page1"),
                        Component.translatable("pl.book.ze2.page2"),
                        Component.translatable("pl.book.ze2.page3"),
                        Component.translatable("pl.book.ze2.page4")
                ));
            });

            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:desert\"}");
    }
}
