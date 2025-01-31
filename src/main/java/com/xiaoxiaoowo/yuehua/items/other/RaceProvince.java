package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public final class RaceProvince {
    public final static ItemStack shen = new ItemStack(Material.PUMPKIN_SEEDS, 1);
    public final static ItemStack xian = new ItemStack(Material.PUMPKIN_SEEDS, 1);
    public final static ItemStack ren = new ItemStack(Material.PUMPKIN_SEEDS, 1);
    public final static ItemStack yao = new ItemStack(Material.PUMPKIN_SEEDS, 1);
    public final static ItemStack zhanShen = new ItemStack(Material.PUMPKIN_SEEDS, 1);

    static {


        ItemMeta itemMetaShen = shen.getItemMeta();
        ItemMeta itemMetaXian = xian.getItemMeta();
        ItemMeta itemMetaRen = ren.getItemMeta();
        ItemMeta itemMetaYao = yao.getItemMeta();
        ItemMeta itemMetaZhanShen = zhanShen.getItemMeta();

        itemMetaShen.setMaxStackSize(99);
        itemMetaXian.setMaxStackSize(99);
        itemMetaRen.setMaxStackSize(99);
        itemMetaYao.setMaxStackSize(99);
        itemMetaZhanShen.setMaxStackSize(99);

        itemMetaShen.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shen");
        itemMetaXian.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xian");
        itemMetaRen.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "ren");
        itemMetaYao.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yao");
        itemMetaZhanShen.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhanShen");


        itemMetaShen.displayName(
                Component.text("神族证明").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );

        itemMetaXian.displayName(
                Component.text("仙族证明").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );

        itemMetaRen.displayName(
                Component.text("人族证明").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)

        );

        itemMetaYao.displayName(
                Component.text("妖族证明").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );

        itemMetaZhanShen.displayName(
                Component.text("战神族证明").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );


        List<Component> loreShen = new ArrayList<>();
        List<Component> loreXian = new ArrayList<>();
        List<Component> loreRen = new ArrayList<>();
        List<Component> loreYao = new ArrayList<>();
        List<Component> loreZhanShen = new ArrayList<>();


        loreShen.add(Component
                .text("种族信物").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        loreXian.add(Component
                .text("种族信物").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        loreRen.add(Component
                .text("种族信物").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        loreYao.add(Component
                .text("种族信物").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        loreZhanShen.add(Component
                .text("种族信物").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );


        itemMetaShen.lore(loreShen);
        itemMetaXian.lore(loreXian);
        itemMetaRen.lore(loreRen);
        itemMetaYao.lore(loreYao);
        itemMetaZhanShen.lore(loreZhanShen);

        shen.setItemMeta(itemMetaShen);
        xian.setItemMeta(itemMetaXian);
        ren.setItemMeta(itemMetaRen);
        yao.setItemMeta(itemMetaYao);
        zhanShen.setItemMeta(itemMetaZhanShen);


        zhanShen.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "pumpkin_seeds/5"));
        yao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "pumpkin_seeds/4"));
        ren.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "pumpkin_seeds/3"));
        xian.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "pumpkin_seeds/2"));
        shen.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "pumpkin_seeds/1"));
    }

}
