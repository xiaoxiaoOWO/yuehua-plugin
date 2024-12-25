package com.xiaoxiaoowo.yuehua.items.dz;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class TehuaShui {
    public static final ItemStack wuqi2 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack wuqi3 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack wuqi4 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack wuqi5 = new ItemStack(Material.HEART_OF_THE_SEA);

    public static final ItemStack fangju2 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack fangju3 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack fangju4 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack fangju5 = new ItemStack(Material.HEART_OF_THE_SEA);

    public static final ItemStack qiyi2 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack qiyi3 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack qiyi4 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack qiyi5 = new ItemStack(Material.HEART_OF_THE_SEA);

    public static final ItemStack fabao2 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack fabao3 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack fabao4 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack fabao5 = new ItemStack(Material.HEART_OF_THE_SEA);

    public static final ItemStack shipin2 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack shipin3 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack shipin4 = new ItemStack(Material.HEART_OF_THE_SEA);
    public static final ItemStack shipin5 = new ItemStack(Material.HEART_OF_THE_SEA);


    static {
        ItemMeta wuqi2Meta = wuqi2.getItemMeta();
        ItemMeta wuqi3Meta = wuqi3.getItemMeta();
        ItemMeta wuqi4Meta = wuqi4.getItemMeta();
        ItemMeta wuqi5Meta = wuqi5.getItemMeta();

        ItemMeta fangju2Meta = fangju2.getItemMeta();
        ItemMeta fangju3Meta = fangju3.getItemMeta();
        ItemMeta fangju4Meta = fangju4.getItemMeta();
        ItemMeta fangju5Meta = fangju5.getItemMeta();

        ItemMeta qiyi2Meta = qiyi2.getItemMeta();
        ItemMeta qiyi3Meta = qiyi3.getItemMeta();
        ItemMeta qiyi4Meta = qiyi4.getItemMeta();
        ItemMeta qiyi5Meta = qiyi5.getItemMeta();

        ItemMeta fabao2Meta = fabao2.getItemMeta();
        ItemMeta fabao3Meta = fabao3.getItemMeta();
        ItemMeta fabao4Meta = fabao4.getItemMeta();
        ItemMeta fabao5Meta = fabao5.getItemMeta();

        ItemMeta shipin2Meta = shipin2.getItemMeta();
        ItemMeta shipin3Meta = shipin3.getItemMeta();
        ItemMeta shipin4Meta = shipin4.getItemMeta();
        ItemMeta shipin5Meta = shipin5.getItemMeta();

        wuqi2Meta.setMaxStackSize(99);
        wuqi3Meta.setMaxStackSize(99);
        wuqi4Meta.setMaxStackSize(99);
        wuqi5Meta.setMaxStackSize(99);

        fangju2Meta.setMaxStackSize(99);
        fangju3Meta.setMaxStackSize(99);
        fangju4Meta.setMaxStackSize(99);
        fangju5Meta.setMaxStackSize(99);

        qiyi2Meta.setMaxStackSize(99);
        qiyi3Meta.setMaxStackSize(99);
        qiyi4Meta.setMaxStackSize(99);
        qiyi5Meta.setMaxStackSize(99);

        fabao2Meta.setMaxStackSize(99);
        fabao3Meta.setMaxStackSize(99);
        fabao4Meta.setMaxStackSize(99);
        fabao5Meta.setMaxStackSize(99);

        shipin2Meta.setMaxStackSize(99);
        shipin3Meta.setMaxStackSize(99);
        shipin4Meta.setMaxStackSize(99);
        shipin5Meta.setMaxStackSize(99);

        wuqi2Meta.setCustomModelData(1);
        wuqi3Meta.setCustomModelData(1);
        wuqi4Meta.setCustomModelData(1);
        wuqi5Meta.setCustomModelData(1);

        fangju2Meta.setCustomModelData(1);
        fangju3Meta.setCustomModelData(1);
        fangju4Meta.setCustomModelData(1);
        fangju5Meta.setCustomModelData(1);

        qiyi2Meta.setCustomModelData(1);
        qiyi3Meta.setCustomModelData(1);
        qiyi4Meta.setCustomModelData(1);
        qiyi5Meta.setCustomModelData(1);

        fabao2Meta.setCustomModelData(1);
        fabao3Meta.setCustomModelData(1);
        fabao4Meta.setCustomModelData(1);
        fabao5Meta.setCustomModelData(1);

        shipin2Meta.setCustomModelData(1);
        shipin3Meta.setCustomModelData(1);
        shipin4Meta.setCustomModelData(1);
        shipin5Meta.setCustomModelData(1);

        PersistentDataContainer pdcwuqi2 = wuqi2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcwuqi3 = wuqi3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcwuqi4 = wuqi4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcwuqi5 = wuqi5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfangju2 = fangju2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfangju3 = fangju3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfangju4 = fangju4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfangju5 = fangju5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcqiyi2 = qiyi2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcqiyi3 = qiyi3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcqiyi4 = qiyi4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcqiyi5 = qiyi5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfabao2 = fabao2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfabao3 = fabao3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfabao4 = fabao4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcfabao5 = fabao5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcshipin2 = shipin2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcshipin3 = shipin3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcshipin4 = shipin4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcshipin5 = shipin5Meta.getPersistentDataContainer();

        pdcwuqi2.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiwuqi2");
        pdcwuqi3.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiwuqi3");
        pdcwuqi4.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiwuqi4");
        pdcwuqi5.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiwuqi5");

        pdcfangju2.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifangju2");
        pdcfangju3.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifangju3");
        pdcfangju4.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifangju4");
        pdcfangju5.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifangju5");

        pdcqiyi2.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiquiyi2");
        pdcqiyi3.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiquiyi3");
        pdcqiyi4.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiquiyi4");
        pdcqiyi5.set(DataContainer.id, PersistentDataType.STRING,"tehuashuiquiyi5");

        pdcfabao2.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifabao2");
        pdcfabao3.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifabao3");
        pdcfabao4.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifabao4");
        pdcfabao5.set(DataContainer.id, PersistentDataType.STRING,"tehuashuifabao5");

        pdcshipin2.set(DataContainer.id, PersistentDataType.STRING,"tehuashuishipin2");
        pdcshipin3.set(DataContainer.id, PersistentDataType.STRING,"tehuashuishipin3");
        pdcshipin4.set(DataContainer.id, PersistentDataType.STRING,"tehuashuishipin4");
        pdcshipin5.set(DataContainer.id, PersistentDataType.STRING,"tehuashuishipin5");

        wuqi2Meta.displayName(
                Component.text("核心特化露[二阶武器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );

        wuqi3Meta.displayName(
                Component.text("核心特化露[三阶武器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        wuqi4Meta.displayName(
                Component.text("核心特化露[四阶武器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        wuqi5Meta.displayName(
                Component.text("核心特化露[五阶武器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        fangju2Meta.displayName(
                Component.text("核心特化露[二阶防具]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );

        fangju3Meta.displayName(
                Component.text("核心特化露[三阶防具]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        fangju4Meta.displayName(
                Component.text("核心特化露[四阶防具]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        fangju5Meta.displayName(
                Component.text("核心特化露[五阶防具]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        qiyi2Meta.displayName(
                Component.text("核心特化露[二阶异器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );

        qiyi3Meta.displayName(
                Component.text("核心特化露[三阶异器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        qiyi4Meta.displayName(
                Component.text("核心特化露[四阶异器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        qiyi5Meta.displayName(
                Component.text("核心特化露[五阶异器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        fabao2Meta.displayName(
                Component.text("核心特化露[二阶法宝]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );

        fabao3Meta.displayName(
                Component.text("核心特化露[三阶法宝]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        fabao4Meta.displayName(
                Component.text("核心特化露[四阶法宝]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        fabao5Meta.displayName(
                Component.text("核心特化露[五阶法宝]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        shipin2Meta.displayName(
                Component.text("核心特化露[二阶饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );

        shipin3Meta.displayName(
                Component.text("核心特化露[三阶饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        shipin4Meta.displayName(
                Component.text("核心特化露[四阶饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        shipin5Meta.displayName(
                Component.text("核心特化露[五阶饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        wuqi2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        wuqi3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        wuqi4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        wuqi5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        fangju2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        fangju3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        fangju4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        fangju5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        qiyi2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        qiyi3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        qiyi4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        qiyi5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        fabao2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        fabao3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        fabao4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        fabao5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        shipin2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        shipin3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        shipin4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        shipin5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        wuqi2.setItemMeta(wuqi2Meta);
        wuqi3.setItemMeta(wuqi3Meta);
        wuqi4.setItemMeta(wuqi4Meta);
        wuqi5.setItemMeta(wuqi5Meta);

        fangju2.setItemMeta(fangju2Meta);
        fangju3.setItemMeta(fangju3Meta);
        fangju4.setItemMeta(fangju4Meta);
        fangju5.setItemMeta(fangju5Meta);

        qiyi2.setItemMeta(qiyi2Meta);
        qiyi3.setItemMeta(qiyi3Meta);
        qiyi4.setItemMeta(qiyi4Meta);
        qiyi5.setItemMeta(qiyi5Meta);

        fabao2.setItemMeta(fabao2Meta);
        fabao3.setItemMeta(fabao3Meta);
        fabao4.setItemMeta(fabao4Meta);
        fabao5.setItemMeta(fabao5Meta);

        shipin2.setItemMeta(shipin2Meta);
        shipin3.setItemMeta(shipin3Meta);
        shipin4.setItemMeta(shipin4Meta);
        shipin5.setItemMeta(shipin5Meta);






    }

}
