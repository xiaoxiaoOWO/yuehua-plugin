package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.guis.Recipe;
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

public final class ArmorHead {
    //通用
    public static final ItemStack tou1 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack touSp2 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack touSp3 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack touSp4 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack touSp5 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack touSp6 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack touSp7 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack touSp8 = new ItemStack(Material.DIAMOND_HELMET);

    //战士
    public static final ItemStack zhanTou2 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack zhanTou3 = new ItemStack(Material.IRON_HELMET);
    public static final ItemStack zhanTou4 = new ItemStack(Material.IRON_HELMET);
    public static final ItemStack zhanTou5 = new ItemStack(Material.IRON_HELMET);
    public static final ItemStack zhanTou6 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack zhanTou7 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack zhanTou8 = new ItemStack(Material.DIAMOND_HELMET);

    //弓箭手
    public static final ItemStack gongTou2 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack gongTou3 = new ItemStack(Material.GOLDEN_HELMET);
    public static final ItemStack gongTou4 = new ItemStack(Material.GOLDEN_HELMET);
    public static final ItemStack gongTou5 = new ItemStack(Material.GOLDEN_HELMET);
    public static final ItemStack gongTou6 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack gongTou7 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack gongTou8 = new ItemStack(Material.DIAMOND_HELMET);


    //炼丹师
    public static final ItemStack danTou2 = new ItemStack(Material.LEATHER_HELMET);
    public static final ItemStack danTou3 = new ItemStack(Material.CHAINMAIL_HELMET);
    public static final ItemStack danTou4 = new ItemStack(Material.CHAINMAIL_HELMET);
    public static final ItemStack danTou5 = new ItemStack(Material.CHAINMAIL_HELMET);
    public static final ItemStack danTou6 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack danTou7 = new ItemStack(Material.DIAMOND_HELMET);
    public static final ItemStack danTou8 = new ItemStack(Material.DIAMOND_HELMET);

    static {
        ItemMeta tou1Meta = tou1.getItemMeta();
        ItemMeta touSp2Meta = touSp2.getItemMeta();
        ItemMeta touSp3Meta = touSp3.getItemMeta();
        ItemMeta touSp4Meta = touSp4.getItemMeta();
        ItemMeta touSp5Meta = touSp5.getItemMeta();
        ItemMeta touSp6Meta = touSp6.getItemMeta();
        ItemMeta touSp7Meta = touSp7.getItemMeta();
        ItemMeta touSp8Meta = touSp8.getItemMeta();
        ItemMeta zhanTou2Meta = zhanTou2.getItemMeta();
        ItemMeta zhanTou3Meta = zhanTou3.getItemMeta();
        ItemMeta zhanTou4Meta = zhanTou4.getItemMeta();
        ItemMeta zhanTou5Meta = zhanTou5.getItemMeta();
        ItemMeta zhanTou6Meta = zhanTou6.getItemMeta();
        ItemMeta zhanTou7Meta = zhanTou7.getItemMeta();
        ItemMeta zhanTou8Meta = zhanTou8.getItemMeta();
        ItemMeta gongTou2Meta = gongTou2.getItemMeta();
        ItemMeta gongTou3Meta = gongTou3.getItemMeta();
        ItemMeta gongTou4Meta = gongTou4.getItemMeta();
        ItemMeta gongTou5Meta = gongTou5.getItemMeta();
        ItemMeta gongTou6Meta = gongTou6.getItemMeta();
        ItemMeta gongTou7Meta = gongTou7.getItemMeta();
        ItemMeta gongTou8Meta = gongTou8.getItemMeta();
        ItemMeta danTou2Meta = danTou2.getItemMeta();
        ItemMeta danTou3Meta = danTou3.getItemMeta();
        ItemMeta danTou4Meta = danTou4.getItemMeta();
        ItemMeta danTou5Meta = danTou5.getItemMeta();
        ItemMeta danTou6Meta = danTou6.getItemMeta();
        ItemMeta danTou7Meta = danTou7.getItemMeta();
        ItemMeta danTou8Meta = danTou8.getItemMeta();

        tou1Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        touSp2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        touSp3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        touSp4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        touSp5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        touSp6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        touSp7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        touSp8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTou2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTou3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTou4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTou5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTou6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTou7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanTou8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTou2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTou3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTou4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTou5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTou6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTou7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongTou8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTou2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTou3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTou4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTou5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTou6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTou7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danTou8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        tou1Meta.setUnbreakable(true);
        touSp2Meta.setUnbreakable(true);
        touSp3Meta.setUnbreakable(true);
        touSp4Meta.setUnbreakable(true);
        touSp5Meta.setUnbreakable(true);
        touSp6Meta.setUnbreakable(true);
        touSp7Meta.setUnbreakable(true);
        touSp8Meta.setUnbreakable(true);
        zhanTou2Meta.setUnbreakable(true);
        zhanTou3Meta.setUnbreakable(true);
        zhanTou4Meta.setUnbreakable(true);
        zhanTou5Meta.setUnbreakable(true);
        zhanTou6Meta.setUnbreakable(true);
        zhanTou7Meta.setUnbreakable(true);
        zhanTou8Meta.setUnbreakable(true);
        gongTou2Meta.setUnbreakable(true);
        gongTou3Meta.setUnbreakable(true);
        gongTou4Meta.setUnbreakable(true);
        gongTou5Meta.setUnbreakable(true);
        gongTou6Meta.setUnbreakable(true);
        gongTou7Meta.setUnbreakable(true);
        gongTou8Meta.setUnbreakable(true);
        danTou2Meta.setUnbreakable(true);
        danTou3Meta.setUnbreakable(true);
        danTou4Meta.setUnbreakable(true);
        danTou5Meta.setUnbreakable(true);
        danTou6Meta.setUnbreakable(true);
        danTou7Meta.setUnbreakable(true);
        danTou8Meta.setUnbreakable(true);

        tou1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        touSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        touSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        touSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        touSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        touSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        touSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        touSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        zhanTou2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        zhanTou3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        zhanTou4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        zhanTou5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        zhanTou6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        zhanTou7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        zhanTou8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        gongTou2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        gongTou3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        gongTou4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        gongTou5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        gongTou6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        gongTou7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        gongTou8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        danTou2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        danTou3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        danTou4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        danTou5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        danTou6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        danTou7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);
        danTou8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.TOU_ARMOR);

        tou1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        touSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        touSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        touSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        touSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        touSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        touSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        touSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        zhanTou2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        zhanTou3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        zhanTou4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        zhanTou5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        zhanTou6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        zhanTou7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        zhanTou8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        gongTou2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        gongTou3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        gongTou4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        gongTou5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        gongTou6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        gongTou7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        gongTou8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        danTou2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        danTou3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        danTou4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        danTou5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        danTou6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        danTou7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);
        danTou8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.TOU_ARMOR_TOUGHNESS);

        tou1Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        touSp2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        touSp3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        touSp4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        touSp5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        touSp6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        touSp7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        touSp8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        zhanTou2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        zhanTou3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        zhanTou4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        zhanTou5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        zhanTou6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        zhanTou7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        zhanTou8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        gongTou2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        gongTou3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        gongTou4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        gongTou5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        gongTou6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        gongTou7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        gongTou8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        danTou2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        danTou3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        danTou4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        danTou5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        danTou6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        danTou7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);
        danTou8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.TOU_KNOCKBACK_RESISTANCE);

        PersistentDataContainer pdctou1 = tou1Meta.getPersistentDataContainer();
        PersistentDataContainer pdctouSp2 = touSp2Meta.getPersistentDataContainer();
        PersistentDataContainer pdctouSp3 = touSp3Meta.getPersistentDataContainer();
        PersistentDataContainer pdctouSp4 = touSp4Meta.getPersistentDataContainer();
        PersistentDataContainer pdctouSp5 = touSp5Meta.getPersistentDataContainer();
        PersistentDataContainer pdctouSp6 = touSp6Meta.getPersistentDataContainer();
        PersistentDataContainer pdctouSp7 = touSp7Meta.getPersistentDataContainer();
        PersistentDataContainer pdctouSp8 = touSp8Meta.getPersistentDataContainer();
        PersistentDataContainer pdczhanTou2 = zhanTou2Meta.getPersistentDataContainer();
        PersistentDataContainer pdczhanTou3 = zhanTou3Meta.getPersistentDataContainer();
        PersistentDataContainer pdczhanTou4 = zhanTou4Meta.getPersistentDataContainer();
        PersistentDataContainer pdczhanTou5 = zhanTou5Meta.getPersistentDataContainer();
        PersistentDataContainer pdczhanTou6 = zhanTou6Meta.getPersistentDataContainer();
        PersistentDataContainer pdczhanTou7 = zhanTou7Meta.getPersistentDataContainer();
        PersistentDataContainer pdczhanTou8 = zhanTou8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcgongTou2 = gongTou2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcgongTou3 = gongTou3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcgongTou4 = gongTou4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcgongTou5 = gongTou5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcgongTou6 = gongTou6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcgongTou7 = gongTou7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcgongTou8 = gongTou8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcdanTou2 = danTou2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcdanTou3 = danTou3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcdanTou4 = danTou4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcdanTou5 = danTou5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcdanTou6 = danTou6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcdanTou7 = danTou7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcdanTou8 = danTou8Meta.getPersistentDataContainer();

        pdctou1.set(DataContainer.id, PersistentDataType.STRING, "tou1");
        pdctouSp2.set(DataContainer.id, PersistentDataType.STRING, "touSp2");
        pdctouSp3.set(DataContainer.id, PersistentDataType.STRING, "touSp3");
        pdctouSp4.set(DataContainer.id, PersistentDataType.STRING, "touSp4");
        pdctouSp5.set(DataContainer.id, PersistentDataType.STRING, "touSp5");
        pdctouSp6.set(DataContainer.id, PersistentDataType.STRING, "touSp6");
        pdctouSp7.set(DataContainer.id, PersistentDataType.STRING, "touSp7");
        pdctouSp8.set(DataContainer.id, PersistentDataType.STRING, "touSp8");
        pdczhanTou2.set(DataContainer.id, PersistentDataType.STRING, "zhanTou2");
        pdczhanTou3.set(DataContainer.id, PersistentDataType.STRING, "zhanTou3");
        pdczhanTou4.set(DataContainer.id, PersistentDataType.STRING, "zhanTou4");
        pdczhanTou5.set(DataContainer.id, PersistentDataType.STRING, "zhanTou5");
        pdczhanTou6.set(DataContainer.id, PersistentDataType.STRING, "zhanTou6");
        pdczhanTou7.set(DataContainer.id, PersistentDataType.STRING, "zhanTou7");
        pdczhanTou8.set(DataContainer.id, PersistentDataType.STRING, "zhanTou8");
        pdcgongTou2.set(DataContainer.id, PersistentDataType.STRING, "gongTou2");
        pdcgongTou3.set(DataContainer.id, PersistentDataType.STRING, "gongTou3");
        pdcgongTou4.set(DataContainer.id, PersistentDataType.STRING, "gongTou4");
        pdcgongTou5.set(DataContainer.id, PersistentDataType.STRING, "gongTou5");
        pdcgongTou6.set(DataContainer.id, PersistentDataType.STRING, "gongTou6");
        pdcgongTou7.set(DataContainer.id, PersistentDataType.STRING, "gongTou7");
        pdcgongTou8.set(DataContainer.id, PersistentDataType.STRING, "gongTou8");
        pdcdanTou2.set(DataContainer.id, PersistentDataType.STRING, "danTou2");
        pdcdanTou3.set(DataContainer.id, PersistentDataType.STRING, "danTou3");
        pdcdanTou4.set(DataContainer.id, PersistentDataType.STRING, "danTou4");
        pdcdanTou5.set(DataContainer.id, PersistentDataType.STRING, "danTou5");
        pdcdanTou6.set(DataContainer.id, PersistentDataType.STRING, "danTou6");
        pdcdanTou7.set(DataContainer.id, PersistentDataType.STRING, "danTou7");
        pdcdanTou8.set(DataContainer.id, PersistentDataType.STRING, "danTou8");


        pdctou1.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctouSp2.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctouSp3.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctouSp4.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctouSp5.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctouSp6.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctouSp7.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdctouSp8.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdczhanTou2.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdczhanTou3.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdczhanTou4.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdczhanTou5.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdczhanTou6.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdczhanTou7.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdczhanTou8.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcgongTou2.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcgongTou3.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcgongTou4.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcgongTou5.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcgongTou6.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcgongTou7.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcgongTou8.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcdanTou2.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcdanTou3.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcdanTou4.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcdanTou5.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcdanTou6.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcdanTou7.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcdanTou8.set(DataContainer.job, PersistentDataType.INTEGER, 3);

        pdctou1.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdctouSp2.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdctouSp3.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdctouSp4.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdctouSp5.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdctouSp6.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdctouSp7.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdctouSp8.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdczhanTou2.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdczhanTou3.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdczhanTou4.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdczhanTou5.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdczhanTou6.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdczhanTou7.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdczhanTou8.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcgongTou2.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcgongTou3.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcgongTou4.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcgongTou5.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcgongTou6.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcgongTou7.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcgongTou8.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcdanTou2.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcdanTou3.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcdanTou4.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcdanTou5.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcdanTou6.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcdanTou7.set(DataContainer.slot, PersistentDataType.INTEGER, 39);
        pdcdanTou8.set(DataContainer.slot, PersistentDataType.INTEGER, 39);

        pdctou1.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdctouSp2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdctouSp3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdctouSp4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdctouSp5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdctouSp6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdctouSp7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdctouSp8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdczhanTou2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdczhanTou3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdczhanTou4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdczhanTou5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdczhanTou6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdczhanTou7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdczhanTou8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcgongTou2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcgongTou3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcgongTou4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcgongTou5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcgongTou6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcgongTou7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcgongTou8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcdanTou2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcdanTou3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcdanTou4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcdanTou5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcdanTou6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcdanTou7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcdanTou8.set(DataContainer.insertid, PersistentDataType.STRING, "null");

        pdctou1.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdctouSp2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdctouSp3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdctouSp4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdctouSp5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdctouSp6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdctouSp7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdctouSp8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdczhanTou2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdczhanTou3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdczhanTou4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdczhanTou5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdczhanTou6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdczhanTou7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdczhanTou8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcgongTou2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcgongTou3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcgongTou4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcgongTou5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcgongTou6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcgongTou7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcgongTou8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcdanTou2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcdanTou3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcdanTou4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcdanTou5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcdanTou6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcdanTou7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcdanTou8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");


        tou1Meta.displayName(Component.text("初心者皮帽").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        touSp2Meta.displayName(Component.text("芙蓉冠").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        touSp3Meta.displayName(Component.text("古松冠").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        touSp4Meta.displayName(Component.text("凭依冠").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        touSp5Meta.displayName(Component.text("三绫冠").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        touSp6Meta.displayName(Component.text("残昼").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        touSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        touSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanTou2Meta.displayName(Component.text("战狼头罩").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanTou3Meta.displayName(Component.text("饕餮头饰").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanTou4Meta.displayName(Component.text("甲骨头饰").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanTou5Meta.displayName(Component.text("龙须回").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanTou6Meta.displayName(Component.text("帝冠遗响[战]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanTou7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanTou8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongTou2Meta.displayName(Component.text("风行护额").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongTou3Meta.displayName(Component.text("虎皮头饰").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongTou4Meta.displayName(Component.text("蛇信").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongTou5Meta.displayName(Component.text("赤鹰眼").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongTou6Meta.displayName(Component.text("帝冠遗响[弓]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongTou7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongTou8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danTou2Meta.displayName(Component.text("丹顶鹤羽").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danTou3Meta.displayName(Component.text("华佗顶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danTou4Meta.displayName(Component.text("芍冠").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danTou5Meta.displayName(Component.text("七星冠").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danTou6Meta.displayName(Component.text("帝冠遗响[丹]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danTou7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danTou8Meta.displayName(Component.text("X").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));

        tou1Meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("tou1", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§f[守御] §f冷却: §b10s"),
                                Component.text("§f受到伤害后恢复§b2§f点生命"),
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

        touSp2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("touSp2", 2),
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

        touSp3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("touSp3", 2),
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

        touSp4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("touSp4", 2),
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

        touSp5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("touSp5", 2),
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

        touSp6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("touSp6", 2),
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

        touSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        touSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        zhanTou2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBZHAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTou2", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§a[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b12§f点近战伤害，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[200%近战伤害]§f点伤害"),
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

        zhanTou3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTou3", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§9[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b24§f点近战伤害，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[250%近战伤害]§f点伤害"),
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

        zhanTou4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTou4", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§d[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b48§f点近战伤害，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[300%近战伤害]§f点伤害"),
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

        zhanTou5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTou5", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§e[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b96§f点近战伤害，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[350%近战伤害]§f点伤害"),
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

        zhanTou6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("zhanTou6", 2),
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

        zhanTou7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        zhanTou8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        gongTou2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBGONG,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTou2", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§a[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b4§f点箭矢强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[600%箭矢强度]§f点伤害"),
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

        gongTou3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTou3", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§9[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b8§f点箭矢强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[750%箭矢强度]§f点伤害"),
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

        gongTou4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTou4", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§d[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b16§f点箭矢强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[900%箭矢强度]§f点伤害"),
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

        gongTou5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTou5", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§e[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b32§f点箭矢强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[1050%箭矢强度]§f点伤害"),
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

        gongTou6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("gongTou6", 2),
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

        gongTou7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        gongTou8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        danTou2Meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBDAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTou2", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§a[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b4§f点阵法强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[600%阵法强度]§f点伤害"),
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

        danTou3Meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTou3", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§9[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b8§f点阵法强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[750%阵法强度]§f点伤害"),
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

        danTou4Meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTou4", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§d[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b16§f点阵法强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[900%阵法强度]§f点伤害"),
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

        danTou5Meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTou5", 2),
                                ComponentSet.SHORTJINENG,
                                Component.text("§6[被动技]§e[守中藏锋] §f冷却: §b20s"),
                                Component.text("§f受到伤害后增加§b32§f点阵法强度，持续§b5s"),
                                Component.text("§f并对攻击者造成§b[1050%阵法强度]§f点伤害"),
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

        danTou6Meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("danTou6", 2),
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

        danTou7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        danTou8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        LeatherArmorMeta tou1LeatherMeta = (LeatherArmorMeta) tou1Meta;
        LeatherArmorMeta touSp2LeatherMeta = (LeatherArmorMeta) touSp2Meta;
        LeatherArmorMeta touSp3LeatherMeta = (LeatherArmorMeta) touSp3Meta;
        LeatherArmorMeta touSp4LeatherMeta = (LeatherArmorMeta) touSp4Meta;
        LeatherArmorMeta touSp5LeatherMeta = (LeatherArmorMeta) touSp5Meta;
        LeatherArmorMeta zhanTou2LeatherMeta = (LeatherArmorMeta) zhanTou2Meta;
        LeatherArmorMeta gongTou2LeatherMeta = (LeatherArmorMeta) gongTou2Meta;
        LeatherArmorMeta danTou2LeatherMeta = (LeatherArmorMeta) danTou2Meta;

        tou1LeatherMeta.setColor(Color.WHITE);
        touSp2LeatherMeta.setColor(Color.GREEN);
        touSp3LeatherMeta.setColor(Color.BLUE);
        touSp4LeatherMeta.setColor(Color.PURPLE);
        touSp5LeatherMeta.setColor(Color.YELLOW);

        zhanTou2LeatherMeta.setColor(Color.RED);
        gongTou2LeatherMeta.setColor(Color.GREEN);
        danTou2LeatherMeta.setColor(Color.BLUE);


        tou1.setItemMeta(tou1LeatherMeta);
        touSp2.setItemMeta(touSp2LeatherMeta);
        touSp3.setItemMeta(touSp3LeatherMeta);
        touSp4.setItemMeta(touSp4LeatherMeta);
        touSp5.setItemMeta(touSp5LeatherMeta);
        touSp6.setItemMeta(touSp6Meta);
        touSp7.setItemMeta(touSp7Meta);
        touSp8.setItemMeta(touSp8Meta);
        zhanTou2.setItemMeta(zhanTou2LeatherMeta);
        zhanTou3.setItemMeta(zhanTou3Meta);
        zhanTou4.setItemMeta(zhanTou4Meta);
        zhanTou5.setItemMeta(zhanTou5Meta);
        zhanTou6.setItemMeta(zhanTou6Meta);
        zhanTou7.setItemMeta(zhanTou7Meta);
        zhanTou8.setItemMeta(zhanTou8Meta);
        gongTou2.setItemMeta(gongTou2LeatherMeta);
        gongTou3.setItemMeta(gongTou3Meta);
        gongTou4.setItemMeta(gongTou4Meta);
        gongTou5.setItemMeta(gongTou5Meta);
        gongTou6.setItemMeta(gongTou6Meta);
        gongTou7.setItemMeta(gongTou7Meta);
        gongTou8.setItemMeta(gongTou8Meta);
        danTou2.setItemMeta(danTou2LeatherMeta);
        danTou3.setItemMeta(danTou3Meta);
        danTou4.setItemMeta(danTou4Meta);
        danTou5.setItemMeta(danTou5Meta);
        danTou6.setItemMeta(danTou6Meta);
        danTou7.setItemMeta(danTou7Meta);
        danTou8.setItemMeta(danTou8Meta);

    }

    public static void putId(){

        Recipe.idToItem.put("tou1",tou1);
        Recipe.idToItem.put("touSp2", touSp2);
        Recipe.idToItem.put("touSp3", touSp3);
        Recipe.idToItem.put("touSp4", touSp4);
        Recipe.idToItem.put("touSp5", touSp5);
        Recipe.idToItem.put("touSp6", touSp6);
        Recipe.idToItem.put("touSp7", touSp7);
        Recipe.idToItem.put("touSp8", touSp8);
        Recipe.idToItem.put("zhanTou2", zhanTou2);
        Recipe.idToItem.put("zhanTou3", zhanTou3);
        Recipe.idToItem.put("zhanTou4", zhanTou4);
        Recipe.idToItem.put("zhanTou5", zhanTou5);
        Recipe.idToItem.put("zhanTou6", zhanTou6);
        Recipe.idToItem.put("zhanTou7", zhanTou7);
        Recipe.idToItem.put("zhanTou8", zhanTou8);
        Recipe.idToItem.put("gongTou2", gongTou2);
        Recipe.idToItem.put("gongTou3", gongTou3);
        Recipe.idToItem.put("gongTou4", gongTou4);
        Recipe.idToItem.put("gongTou5", gongTou5);
        Recipe.idToItem.put("gongTou6", gongTou6);
        Recipe.idToItem.put("gongTou7", gongTou7);
        Recipe.idToItem.put("gongTou8", gongTou8);
        Recipe.idToItem.put("danTou2", danTou2);
        Recipe.idToItem.put("danTou3", danTou3);
        Recipe.idToItem.put("danTou4", danTou4);
        Recipe.idToItem.put("danTou5", danTou5);
        Recipe.idToItem.put("danTou6", danTou6);
        Recipe.idToItem.put("danTou7", danTou7);
        Recipe.idToItem.put("danTou8", danTou8);
    }

}
