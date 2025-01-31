package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class XP {
    //前4个怪物可掉落
    public static final ItemStack XP_10 = new ItemStack(Material.RAW_GOLD, 1);
    public static final ItemStack XP_20 = new ItemStack(Material.RAW_GOLD, 1);
    public static final ItemStack XP_50 = new ItemStack(Material.RAW_GOLD, 1);
    public static final ItemStack XP_100 = new ItemStack(Material.RAW_GOLD, 1);
    public static final ItemStack XP_200 = new ItemStack(Material.RAW_GOLD, 1);
    public static final ItemStack XP_500 = new ItemStack(Material.RAW_GOLD, 1);

    static {


        ItemMeta itemMeta1 = XP_10.getItemMeta();
        ItemMeta itemMeta2 = XP_20.getItemMeta();
        ItemMeta itemMeta5 = XP_50.getItemMeta();
        ItemMeta itemMeta10 = XP_100.getItemMeta();
        ItemMeta itemMeta20 = XP_200.getItemMeta();
        ItemMeta itemMeta50 = XP_500.getItemMeta();

        itemMeta1.setMaxStackSize(99);
        itemMeta2.setMaxStackSize(99);
        itemMeta5.setMaxStackSize(99);
        itemMeta10.setMaxStackSize(99);
        itemMeta20.setMaxStackSize(99);
        itemMeta50.setMaxStackSize(99);

        itemMeta1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xp10");
        itemMeta2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xp20");
        itemMeta5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xp50");
        itemMeta10.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xp100");
        itemMeta20.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xp200");
        itemMeta50.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xp500");

        itemMeta1.displayName(
                Component
                        .text("江湖心得[10点]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta2.displayName(
                Component
                        .text("江湖心得[20点]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta5.displayName(
                Component
                        .text("江湖心得[50点]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta10.displayName(
                Component
                        .text("江湖心得[100点]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta20.displayName(
                Component
                        .text("江湖心得[200点]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta50.displayName(
                Component
                        .text("江湖心得[500点]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );


        itemMeta1.lore(
                List.of(
                        ComponentSet.RARE1,
                        Component.text("使用获得10点经验").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                ));

        itemMeta2.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("使用获得20点经验").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );

        itemMeta5.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("使用获得50点经验").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );

        itemMeta10.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("使用获得100点经验").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );
        itemMeta20.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("使用获得200点经验").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );

        itemMeta50.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("使用获得500点经验").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true))
        );

        XP_10.setItemMeta(itemMeta1);
        XP_20.setItemMeta(itemMeta2);
        XP_50.setItemMeta(itemMeta5);
        XP_100.setItemMeta(itemMeta10);
        XP_200.setItemMeta(itemMeta20);
        XP_500.setItemMeta(itemMeta50);
        XP_500.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "raw_gold/1"));
        XP_200.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "raw_gold/1"));
        XP_100.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "raw_gold/1"));
        XP_50.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "raw_gold/1"));
        XP_20.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "raw_gold/1"));
        XP_10.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "raw_gold/1"));
    }
}
