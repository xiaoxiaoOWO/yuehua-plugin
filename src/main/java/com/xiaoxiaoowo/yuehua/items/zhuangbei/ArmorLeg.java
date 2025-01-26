package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class ArmorLeg {
    //通用
    public static final ItemStack tui1 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack tuiSp2 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack tuiSp3 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack tuiSp4 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack tuiSp5 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack tuiSp6 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack tuiSp7 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack tuiSp8 = new ItemStack(Material.DIAMOND_LEGGINGS);

    //战士
    public static final ItemStack zhanTui2 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack zhanTui3 = new ItemStack(Material.IRON_LEGGINGS);
    public static final ItemStack zhanTui4 = new ItemStack(Material.IRON_LEGGINGS);
    public static final ItemStack zhanTui5 = new ItemStack(Material.IRON_LEGGINGS);
    public static final ItemStack zhanTui6 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack zhanTui7 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack zhanTui8 = new ItemStack(Material.DIAMOND_LEGGINGS);

    //弓箭手
    public static final ItemStack gongTui2 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack gongTui3 = new ItemStack(Material.GOLDEN_LEGGINGS);
    public static final ItemStack gongTui4 = new ItemStack(Material.GOLDEN_LEGGINGS);
    public static final ItemStack gongTui5 = new ItemStack(Material.GOLDEN_LEGGINGS);
    public static final ItemStack gongTui6 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack gongTui7 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack gongTui8 = new ItemStack(Material.DIAMOND_LEGGINGS);

    //炼丹师
    public static final ItemStack danTui2 = new ItemStack(Material.LEATHER_LEGGINGS);
    public static final ItemStack danTui3 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
    public static final ItemStack danTui4 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
    public static final ItemStack danTui5 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
    public static final ItemStack danTui6 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack danTui7 = new ItemStack(Material.DIAMOND_LEGGINGS);
    public static final ItemStack danTui8 = new ItemStack(Material.DIAMOND_LEGGINGS);

    static {
        ItemMeta tui1Meta = tui1.getItemMeta();
        ItemMeta tuiSp2Meta = tuiSp2.getItemMeta();
        ItemMeta tuiSp3Meta = tuiSp3.getItemMeta();
        ItemMeta tuiSp4Meta = tuiSp4.getItemMeta();
        ItemMeta tuiSp5Meta = tuiSp5.getItemMeta();
        ItemMeta tuiSp6Meta = tuiSp6.getItemMeta();
        ItemMeta tuiSp7Meta = tuiSp7.getItemMeta();
        ItemMeta tuiSp8Meta = tuiSp8.getItemMeta();
        ItemMeta zhanTui2Meta = zhanTui2.getItemMeta();
        ItemMeta zhanTui3Meta = zhanTui3.getItemMeta();
        ItemMeta zhanTui4Meta = zhanTui4.getItemMeta();
        ItemMeta zhanTui5Meta = zhanTui5.getItemMeta();
        ItemMeta zhanTui6Meta = zhanTui6.getItemMeta();
        ItemMeta zhanTui7Meta = zhanTui7.getItemMeta();
        ItemMeta zhanTui8Meta = zhanTui8.getItemMeta();
        ItemMeta gongTui2Meta = gongTui2.getItemMeta();
        ItemMeta gongTui3Meta = gongTui3.getItemMeta();
        ItemMeta gongTui4Meta = gongTui4.getItemMeta();
        ItemMeta gongTui5Meta = gongTui5.getItemMeta();
        ItemMeta gongTui6Meta = gongTui6.getItemMeta();
        ItemMeta gongTui7Meta = gongTui7.getItemMeta();
        ItemMeta gongTui8Meta = gongTui8.getItemMeta();
        ItemMeta danTui2Meta = danTui2.getItemMeta();
        ItemMeta danTui3Meta = danTui3.getItemMeta();
        ItemMeta danTui4Meta = danTui4.getItemMeta();
        ItemMeta danTui5Meta = danTui5.getItemMeta();
        ItemMeta danTui6Meta = danTui6.getItemMeta();
        ItemMeta danTui7Meta = danTui7.getItemMeta();
        ItemMeta danTui8Meta = danTui8.getItemMeta();

        tui1Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tuiSp2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tuiSp3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tuiSp4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tuiSp5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tuiSp6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tuiSp7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tuiSp8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTui2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTui3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTui4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTui5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTui6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTui7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTui8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTui2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTui3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTui4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTui5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTui6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTui7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTui8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTui2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTui3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTui4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTui5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTui6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTui7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTui8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        tui1Meta.setUnbreakable(true);
        tuiSp2Meta.setUnbreakable(true);
        tuiSp3Meta.setUnbreakable(true);
        tuiSp4Meta.setUnbreakable(true);
        tuiSp5Meta.setUnbreakable(true);
        tuiSp6Meta.setUnbreakable(true);
        tuiSp7Meta.setUnbreakable(true);
        tuiSp8Meta.setUnbreakable(true);
        zhanTui2Meta.setUnbreakable(true);
        zhanTui3Meta.setUnbreakable(true);
        zhanTui4Meta.setUnbreakable(true);
        zhanTui5Meta.setUnbreakable(true);
        zhanTui6Meta.setUnbreakable(true);
        zhanTui7Meta.setUnbreakable(true);
        zhanTui8Meta.setUnbreakable(true);
        gongTui2Meta.setUnbreakable(true);
        gongTui3Meta.setUnbreakable(true);
        gongTui4Meta.setUnbreakable(true);
        gongTui5Meta.setUnbreakable(true);
        gongTui6Meta.setUnbreakable(true);
        gongTui7Meta.setUnbreakable(true);
        gongTui8Meta.setUnbreakable(true);
        danTui2Meta.setUnbreakable(true);
        danTui3Meta.setUnbreakable(true);
        danTui4Meta.setUnbreakable(true);
        danTui5Meta.setUnbreakable(true);
        danTui6Meta.setUnbreakable(true);
        danTui7Meta.setUnbreakable(true);
        danTui8Meta.setUnbreakable(true);

        tui1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        tuiSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        tuiSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        tuiSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        tuiSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        tuiSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        tuiSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        tuiSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        zhanTui2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        zhanTui3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        zhanTui4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        zhanTui5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        zhanTui6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        zhanTui7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        zhanTui8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        gongTui2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        gongTui3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        gongTui4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        gongTui5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        gongTui6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        gongTui7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        gongTui8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        danTui2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        danTui3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        danTui4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        danTui5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        danTui6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        danTui7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);
        danTui8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TUI_ARMOR);

        tui1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        tuiSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        tuiSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        tuiSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        tuiSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        tuiSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        tuiSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        tuiSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        zhanTui2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        zhanTui3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        zhanTui4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        zhanTui5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        zhanTui6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        zhanTui7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        zhanTui8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        gongTui2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        gongTui3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        gongTui4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        gongTui5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        gongTui6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        gongTui7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        gongTui8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        danTui2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        danTui3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        danTui4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        danTui5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        danTui6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        danTui7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);
        danTui8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TUI_ARMOR_TOUGHNESS);

        tui1Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        tuiSp2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        tuiSp3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        tuiSp4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        tuiSp5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        tuiSp6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        tuiSp7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        tuiSp8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        zhanTui2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        zhanTui3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        zhanTui4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        zhanTui5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        zhanTui6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        zhanTui7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        zhanTui8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        gongTui2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        gongTui3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        gongTui4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        gongTui5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        gongTui6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        gongTui7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        gongTui8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        danTui2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        danTui3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        danTui4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        danTui5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        danTui6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        danTui7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);
        danTui8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TUI_KNOCKBACK_RESISTANCE);

        PersistentDataContainer pdcTui1 = tui1Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp2 = tuiSp2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp3 = tuiSp3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp4 = tuiSp4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp5 = tuiSp5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp6 = tuiSp6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp7 = tuiSp7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcTuiSp8 = tuiSp8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui2 = zhanTui2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui3 = zhanTui3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui4 = zhanTui4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui5 = zhanTui5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui6 = zhanTui6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui7 = zhanTui7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanTui8 = zhanTui8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui2 = gongTui2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui3 = gongTui3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui4 = gongTui4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui5 = gongTui5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui6 = gongTui6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui7 = gongTui7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongTui8 = gongTui8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui2 = danTui2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui3 = danTui3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui4 = danTui4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui5 = danTui5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui6 = danTui6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui7 = danTui7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanTui8 = danTui8Meta.getPersistentDataContainer();

        pdcTui1.set(DataContainer.id, PersistentDataType.STRING, "tui1");
        pdcTuiSp2.set(DataContainer.id, PersistentDataType.STRING, "tuiSp2");
        pdcTuiSp3.set(DataContainer.id, PersistentDataType.STRING, "tuiSp3");
        pdcTuiSp4.set(DataContainer.id, PersistentDataType.STRING, "tuiSp4");
        pdcTuiSp5.set(DataContainer.id, PersistentDataType.STRING, "tuiSp5");
        pdcTuiSp6.set(DataContainer.id, PersistentDataType.STRING, "tuiSp6");
        pdcTuiSp7.set(DataContainer.id, PersistentDataType.STRING, "tuiSp7");
        pdcTuiSp8.set(DataContainer.id, PersistentDataType.STRING, "tuiSp8");
        pdcZhanTui2.set(DataContainer.id, PersistentDataType.STRING, "zhanTui2");
        pdcZhanTui3.set(DataContainer.id, PersistentDataType.STRING, "zhanTui3");
        pdcZhanTui4.set(DataContainer.id, PersistentDataType.STRING, "zhanTui4");
        pdcZhanTui5.set(DataContainer.id, PersistentDataType.STRING, "zhanTui5");
        pdcZhanTui6.set(DataContainer.id, PersistentDataType.STRING, "zhanTui6");
        pdcZhanTui7.set(DataContainer.id, PersistentDataType.STRING, "zhanTui7");
        pdcZhanTui8.set(DataContainer.id, PersistentDataType.STRING, "zhanTui8");
        pdcGongTui2.set(DataContainer.id, PersistentDataType.STRING, "gongTui2");
        pdcGongTui3.set(DataContainer.id, PersistentDataType.STRING, "gongTui3");
        pdcGongTui4.set(DataContainer.id, PersistentDataType.STRING, "gongTui4");
        pdcGongTui5.set(DataContainer.id, PersistentDataType.STRING, "gongTui5");
        pdcGongTui6.set(DataContainer.id, PersistentDataType.STRING, "gongTui6");
        pdcGongTui7.set(DataContainer.id, PersistentDataType.STRING, "gongTui7");
        pdcGongTui8.set(DataContainer.id, PersistentDataType.STRING, "gongTui8");
        pdcDanTui2.set(DataContainer.id, PersistentDataType.STRING, "danTui2");
        pdcDanTui3.set(DataContainer.id, PersistentDataType.STRING, "danTui3");
        pdcDanTui4.set(DataContainer.id, PersistentDataType.STRING, "danTui4");
        pdcDanTui5.set(DataContainer.id, PersistentDataType.STRING, "danTui5");
        pdcDanTui6.set(DataContainer.id, PersistentDataType.STRING, "danTui6");
        pdcDanTui7.set(DataContainer.id, PersistentDataType.STRING, "danTui7");
        pdcDanTui8.set(DataContainer.id, PersistentDataType.STRING, "danTui8");


        pdcTui1.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTuiSp2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTuiSp3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTuiSp4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTuiSp5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTuiSp6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTuiSp7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTuiSp8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanTui2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanTui3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanTui4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanTui5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanTui6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanTui7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanTui8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongTui2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongTui3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongTui4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongTui5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongTui6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongTui7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongTui8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanTui2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanTui3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanTui4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanTui5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanTui6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanTui7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanTui8.set(DataContainer.insertid, PersistentDataType.STRING, "null");

        pdcTui1.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcTuiSp2.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcTuiSp3.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcTuiSp4.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcTuiSp5.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcTuiSp6.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcTuiSp7.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcTuiSp8.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcZhanTui2.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcZhanTui3.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcZhanTui4.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcZhanTui5.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcZhanTui6.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcZhanTui7.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcZhanTui8.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcGongTui2.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcGongTui3.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcGongTui4.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcGongTui5.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcGongTui6.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcGongTui7.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcGongTui8.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcDanTui2.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcDanTui3.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcDanTui4.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcDanTui5.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcDanTui6.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcDanTui7.set(DataContainer.enchantid, PersistentDataType.STRING,"null");
        pdcDanTui8.set(DataContainer.enchantid, PersistentDataType.STRING,"null");

        pdcTui1.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcTuiSp2.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcTuiSp3.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcTuiSp4.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcTuiSp5.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcTuiSp6.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcTuiSp7.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcTuiSp8.set(DataContainer.job,PersistentDataType.INTEGER,0);
        pdcZhanTui2.set(DataContainer.job,PersistentDataType.INTEGER,1);
        pdcZhanTui3.set(DataContainer.job,PersistentDataType.INTEGER,1);
        pdcZhanTui4.set(DataContainer.job,PersistentDataType.INTEGER,1);
        pdcZhanTui5.set(DataContainer.job,PersistentDataType.INTEGER,1);
        pdcZhanTui6.set(DataContainer.job,PersistentDataType.INTEGER,1);
        pdcZhanTui7.set(DataContainer.job,PersistentDataType.INTEGER,1);
        pdcZhanTui8.set(DataContainer.job,PersistentDataType.INTEGER,1);
        pdcGongTui2.set(DataContainer.job,PersistentDataType.INTEGER,2);
        pdcGongTui3.set(DataContainer.job,PersistentDataType.INTEGER,2);
        pdcGongTui4.set(DataContainer.job,PersistentDataType.INTEGER,2);
        pdcGongTui5.set(DataContainer.job,PersistentDataType.INTEGER,2);
        pdcGongTui6.set(DataContainer.job,PersistentDataType.INTEGER,2);
        pdcGongTui7.set(DataContainer.job,PersistentDataType.INTEGER,2);
        pdcGongTui8.set(DataContainer.job,PersistentDataType.INTEGER,2);
        pdcDanTui2.set(DataContainer.job,PersistentDataType.INTEGER,3);
        pdcDanTui3.set(DataContainer.job,PersistentDataType.INTEGER,3);
        pdcDanTui4.set(DataContainer.job,PersistentDataType.INTEGER,3);
        pdcDanTui5.set(DataContainer.job,PersistentDataType.INTEGER,3);
        pdcDanTui6.set(DataContainer.job,PersistentDataType.INTEGER,3);
        pdcDanTui7.set(DataContainer.job,PersistentDataType.INTEGER,3);
        pdcDanTui8.set(DataContainer.job,PersistentDataType.INTEGER,3);

        pdcTui1.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcTuiSp2.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcTuiSp3.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcTuiSp4.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcTuiSp5.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcTuiSp6.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcTuiSp7.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcTuiSp8.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcZhanTui2.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcZhanTui3.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcZhanTui4.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcZhanTui5.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcZhanTui6.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcZhanTui7.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcZhanTui8.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcGongTui2.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcGongTui3.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcGongTui4.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcGongTui5.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcGongTui6.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcGongTui7.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcGongTui8.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcDanTui2.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcDanTui3.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcDanTui4.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcDanTui5.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcDanTui6.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcDanTui7.set(DataContainer.slot,PersistentDataType.INTEGER,37);
        pdcDanTui8.set(DataContainer.slot,PersistentDataType.INTEGER,37);



        tui1Meta.displayName(Component.text("初心者皮裤").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        tuiSp2Meta.displayName(Component.text("百合裤").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        tuiSp3Meta.displayName(Component.text("新柳裤").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        tuiSp4Meta.displayName(Component.text("宿月裤").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        tuiSp5Meta.displayName(Component.text("司正裤").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        tuiSp6Meta.displayName(Component.text("厄夜").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        tuiSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        tuiSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanTui2Meta.displayName(Component.text("战狼皮裤").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanTui3Meta.displayName(Component.text("饕餮护胯").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanTui4Meta.displayName(Component.text("龟宁护胯").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanTui5Meta.displayName(Component.text("龙筋护腰").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanTui6Meta.displayName(Component.text("九黎羽护[战]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanTui7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanTui8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongTui2Meta.displayName(Component.text("风鳞裤").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongTui3Meta.displayName(Component.text("虎纹护胯").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongTui4Meta.displayName(Component.text("蛇鳞护胯").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongTui5Meta.displayName(Component.text("赤鹰羽").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongTui6Meta.displayName(Component.text("九黎羽护[弓]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongTui7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongTui8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danTui2Meta.displayName(Component.text("功夫裤").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danTui3Meta.displayName(Component.text("华佗叶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danTui4Meta.displayName(Component.text("川贝折").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danTui5Meta.displayName(Component.text("君尘拂").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danTui6Meta.displayName(Component.text("九黎羽护[丹]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danTui7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danTui8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        tui1Meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                Component.text("§7§o初始装备"),
                                Component.text("§7§o可以提供简易防护"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tui1", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§f[汲血] §f冷却: §b10s"),
                                Component.text("§f释放主动技能或阵法回复§b2§f点生命"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        tuiSp2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                Component.text("§7§o百合花瓣的纯净精华"),
                                Component.text("§7§o化作轻盈优雅的护膝"),
                                Component.text("§7§o拥有某方面的强大力量"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tuiSp2", 2),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        tuiSp3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                Component.text("§7§o春日新柳的生机之力"),
                                Component.text("§7§o编织成柔韧的护腿"),
                                Component.text("§7§o拥有某方面的强大力量"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tuiSp3", 2),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        tuiSp4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                Component.text("§7§o雨竹加工山魅遗留下来的精华后"),
                                Component.text("§7§o再灌注以仙灵制成的装备"),
                                Component.text("§7§o拥有某方面的强大力量"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tuiSp4", 2),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        tuiSp5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                Component.text("§7§o由散落在大陆各地的炼玉"),
                                Component.text("§7§o以独特的方式锻造而成"),
                                Component.text("§7§o拥有某方面的强大力量"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tuiSp5", 2),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        tuiSp6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                Component.text("§7§o深夜中最深沉的黑暗"),
                                Component.text("§7§o凝聚而成的诡秘护膝"),
                                Component.text("§7§o拥有某方面的强大力量"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tuiSp6", 2),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        tuiSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        tuiSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        zhanTui2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBZHAN,
                                Component.text("§7§o用草原狼的皮毛制成的皮套装"),
                                Component.text("§7§o毛皮很柔软不妨碍施展动作"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTui2", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§a[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b16+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b30%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        zhanTui3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                Component.text("§7§o附着了上古凶兽饕餮气息的套装"),
                                Component.text("§7§o装甲上绘有带着肃杀之气的图腾"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTui3", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§9[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b32+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b40%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        zhanTui4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                Component.text("§7§o寄宿着玄武之力的套装"),
                                Component.text("§7§o拥有惊人的防御力"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTui4", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§d[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b64+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b50%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        zhanTui5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                Component.text("§7§o承载青龙之力的套装"),
                                Component.text("§7§o光是看着就感觉到一阵寒栗"),
                                Component.text("§7§o攻击和防御效能都相当优秀"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTui5", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§e[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b128+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b60%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        zhanTui6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                Component.text("§7§o上古九黎部族的圣羽"),
                                Component.text("§7§o织就的神秘护腿"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTui6", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        zhanTui7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        zhanTui8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        gongTui2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBGONG,
                                Component.text("§7§o远方风之国度工匠手工打造"),
                                Component.text("§7§o制造时注入风之灵气"),
                                Component.text("§7§o穿戴后能像风一般行动迅速"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTui2", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§a[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b16+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b30%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        gongTui3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                Component.text("§7§o由坚硬的虎皮制成"),
                                Component.text("§7§o能提供较佳的防御"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTui3", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§9[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b32+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b40%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        gongTui4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                Component.text("§7§o采用最狡猾毒蛇的鳞片制成"),
                                Component.text("§7§o坚硬的鳞甲可以抵挡致命伤害"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTui4", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§d[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b64+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b50%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        gongTui5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                Component.text("§7§o用最珍贵的赤鹰羽毛制成"),
                                Component.text("§7§o承袭了猛禽的速度和力量"),
                                Component.text("§7§o穿戴者能够准确的瞄准并击中敌人的弱点"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTui5", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§e[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b128+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b60%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        gongTui6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                Component.text("§7§o上古九黎部族的圣羽"),
                                Component.text("§7§o织就的神秘护腿"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTui6", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        gongTui7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        gongTui8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        danTui2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBDAN,
                                Component.text("§7§o炼丹师学徒常用的服装"),
                                Component.text("§7§o提供各种大小的口袋方便炼丹使用"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTui2", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§a[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b16+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b30%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        danTui3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                Component.text("§7§o传说由神医华佗所设计"),
                                Component.text("§7§o为济世医者提供全方位的防护"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTui3", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§9[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b32+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b40%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        danTui4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                Component.text("§7§o集草药精华于一身的套装"),
                                Component.text("§7§o散发着清凉的自然气息"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTui4", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§d[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b64+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b50%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        danTui5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                Component.text("§7§o利用陨星的碎片打造的套装"),
                                Component.text("§7§o表面淡淡的星光若隐若现"),
                                Component.text("§7§o神圣的力量让邪恶生物都感到畏惧"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTui5", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§e[回息术灵] §f冷却: §b20s"),
                                Component.text("§f释放主动技能或阵法回复§b128+10%§f点生命"),
                                Component.text("§f并使这次技能或阵法伤害提升§b60%§f"),
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        danTui6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                Component.text("§7§o上古九黎部族的圣羽"),
                                Component.text("§7§o织就的神秘护腿"),
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTui6", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );
        danTui7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        danTui8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        LeatherArmorMeta tui1LeatherMeta = (LeatherArmorMeta) tui1Meta;
        LeatherArmorMeta tuiSp2LeatherMeta = (LeatherArmorMeta) tuiSp2Meta;
        LeatherArmorMeta tuiSp3LeatherMeta = (LeatherArmorMeta) tuiSp3Meta;
        LeatherArmorMeta tuiSp4LeatherMeta = (LeatherArmorMeta) tuiSp4Meta;
        LeatherArmorMeta tuiSp5LeatherMeta = (LeatherArmorMeta) tuiSp5Meta;
        LeatherArmorMeta zhanTui2LeatherMeta = (LeatherArmorMeta) zhanTui2Meta;
        LeatherArmorMeta gongTui2LeatherMeta = (LeatherArmorMeta) gongTui2Meta;
        LeatherArmorMeta danTui2LeatherMeta = (LeatherArmorMeta) danTui2Meta;

        tui1LeatherMeta.setColor(Color.WHITE);
        tuiSp2LeatherMeta.setColor(Color.GREEN);
        tuiSp3LeatherMeta.setColor(Color.BLUE);
        tuiSp4LeatherMeta.setColor(Color.PURPLE);
        tuiSp5LeatherMeta.setColor(Color.YELLOW);

        zhanTui2LeatherMeta.setColor(Color.RED);
        gongTui2LeatherMeta.setColor(Color.GREEN);
        danTui2LeatherMeta.setColor(Color.BLUE);



        tui1.setItemMeta(tui1LeatherMeta);
        tuiSp2.setItemMeta(tuiSp2LeatherMeta);
        tuiSp3.setItemMeta(tuiSp3LeatherMeta);
        tuiSp4.setItemMeta(tuiSp4LeatherMeta);
        tuiSp5.setItemMeta(tuiSp5LeatherMeta);
        tuiSp6.setItemMeta(tuiSp6Meta);
        tuiSp7.setItemMeta(tuiSp7Meta);
        tuiSp8.setItemMeta(tuiSp8Meta);
        zhanTui2.setItemMeta(zhanTui2LeatherMeta);
        zhanTui3.setItemMeta(zhanTui3Meta);
        zhanTui4.setItemMeta(zhanTui4Meta);
        zhanTui5.setItemMeta(zhanTui5Meta);
        zhanTui6.setItemMeta(zhanTui6Meta);
        zhanTui7.setItemMeta(zhanTui7Meta);
        zhanTui8.setItemMeta(zhanTui8Meta);
        gongTui2.setItemMeta(gongTui2LeatherMeta);
        gongTui3.setItemMeta(gongTui3Meta);
        gongTui4.setItemMeta(gongTui4Meta);
        gongTui5.setItemMeta(gongTui5Meta);
        gongTui6.setItemMeta(gongTui6Meta);
        gongTui7.setItemMeta(gongTui7Meta);
        gongTui8.setItemMeta(gongTui8Meta);
        danTui2.setItemMeta(danTui2LeatherMeta);
        danTui3.setItemMeta(danTui3Meta);
        danTui4.setItemMeta(danTui4Meta);
        danTui5.setItemMeta(danTui5Meta);
        danTui6.setItemMeta(danTui6Meta);
        danTui7.setItemMeta(danTui7Meta);
        danTui8.setItemMeta(danTui8Meta);




    }

    public static void putId(){
        Recipe.idToItem.put("tui1",tui1);
        Recipe.idToItem.put("tuiSp2", tuiSp2);
        Recipe.idToItem.put("tuiSp3", tuiSp3);
        Recipe.idToItem.put("tuiSp4", tuiSp4);
        Recipe.idToItem.put("tuiSp5", tuiSp5);
        Recipe.idToItem.put("tuiSp6", tuiSp6);
        Recipe.idToItem.put("tuiSp7", tuiSp7);
        Recipe.idToItem.put("tuiSp8", tuiSp8);
        Recipe.idToItem.put("zhanTui2", zhanTui2);
        Recipe.idToItem.put("zhanTui3", zhanTui3);
        Recipe.idToItem.put("zhanTui4", zhanTui4);
        Recipe.idToItem.put("zhanTui5", zhanTui5);
        Recipe.idToItem.put("zhanTui6", zhanTui6);
        Recipe.idToItem.put("zhanTui7", zhanTui7);
        Recipe.idToItem.put("zhanTui8", zhanTui8);
        Recipe.idToItem.put("gongTui2", gongTui2);
        Recipe.idToItem.put("gongTui3", gongTui3);
        Recipe.idToItem.put("gongTui4", gongTui4);
        Recipe.idToItem.put("gongTui5", gongTui5);
        Recipe.idToItem.put("gongTui6", gongTui6);
        Recipe.idToItem.put("gongTui7", gongTui7);
        Recipe.idToItem.put("gongTui8", gongTui8);
        Recipe.idToItem.put("danTui2", danTui2);
        Recipe.idToItem.put("danTui3", danTui3);
        Recipe.idToItem.put("danTui4", danTui4);
        Recipe.idToItem.put("danTui5", danTui5);
        Recipe.idToItem.put("danTui6", danTui6);
        Recipe.idToItem.put("danTui7", danTui7);
        Recipe.idToItem.put("danTui8", danTui8);
    }

}
