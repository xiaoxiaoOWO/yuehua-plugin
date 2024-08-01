package com.xiaoxiaoowo.yuehua.itemstack.zhuangbei;

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

public final class ArmorChest {
    //通用
    public static final ItemStack xiong1 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack xiongSp2 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack xiongSp3 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack xiongSp4 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack xiongSp5 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack xiongSp6 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack xiongSp7 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack xiongSp8 = new ItemStack(Material.DIAMOND_CHESTPLATE);

    //战士
    public static final ItemStack zhanXiong2 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack zhanXiong3 = new ItemStack(Material.IRON_CHESTPLATE);
    public static final ItemStack zhanXiong4 = new ItemStack(Material.IRON_CHESTPLATE);
    public static final ItemStack zhanXiong5 = new ItemStack(Material.IRON_CHESTPLATE);
    public static final ItemStack zhanXiong6 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack zhanXiong7 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack zhanXiong8 = new ItemStack(Material.DIAMOND_CHESTPLATE);

    //弓箭手
    public static final ItemStack gongXiong2 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack gongXiong3 = new ItemStack(Material.GOLDEN_CHESTPLATE);
    public static final ItemStack gongXiong4 = new ItemStack(Material.GOLDEN_CHESTPLATE);
    public static final ItemStack gongXiong5 = new ItemStack(Material.GOLDEN_CHESTPLATE);
    public static final ItemStack gongXiong6 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack gongXiong7 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack gongXiong8 = new ItemStack(Material.DIAMOND_CHESTPLATE);

    //炼丹师
    public static final ItemStack danXiong2 = new ItemStack(Material.LEATHER_CHESTPLATE);
    public static final ItemStack danXiong3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
    public static final ItemStack danXiong4 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
    public static final ItemStack danXiong5 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
    public static final ItemStack danXiong6 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack danXiong7 = new ItemStack(Material.DIAMOND_CHESTPLATE);
    public static final ItemStack danXiong8 = new ItemStack(Material.DIAMOND_CHESTPLATE);


    static {
        ItemMeta xiong1Meta = xiong1.getItemMeta();
        ItemMeta xiongSp2Meta = xiongSp2.getItemMeta();
        ItemMeta xiongSp3Meta = xiongSp3.getItemMeta();
        ItemMeta xiongSp4Meta = xiongSp4.getItemMeta();
        ItemMeta xiongSp5Meta = xiongSp5.getItemMeta();
        ItemMeta xiongSp6Meta = xiongSp6.getItemMeta();
        ItemMeta xiongSp7Meta = xiongSp7.getItemMeta();
        ItemMeta xiongSp8Meta = xiongSp8.getItemMeta();
        ItemMeta zhanXiong2Meta = zhanXiong2.getItemMeta();
        ItemMeta zhanXiong3Meta = zhanXiong3.getItemMeta();
        ItemMeta zhanXiong4Meta = zhanXiong4.getItemMeta();
        ItemMeta zhanXiong5Meta = zhanXiong5.getItemMeta();
        ItemMeta zhanXiong6Meta = zhanXiong6.getItemMeta();
        ItemMeta zhanXiong7Meta = zhanXiong7.getItemMeta();
        ItemMeta zhanXiong8Meta = zhanXiong8.getItemMeta();
        ItemMeta gongXiong2Meta = gongXiong2.getItemMeta();
        ItemMeta gongXiong3Meta = gongXiong3.getItemMeta();
        ItemMeta gongXiong4Meta = gongXiong4.getItemMeta();
        ItemMeta gongXiong5Meta = gongXiong5.getItemMeta();
        ItemMeta gongXiong6Meta = gongXiong6.getItemMeta();
        ItemMeta gongXiong7Meta = gongXiong7.getItemMeta();
        ItemMeta gongXiong8Meta = gongXiong8.getItemMeta();
        ItemMeta danXiong2Meta = danXiong2.getItemMeta();
        ItemMeta danXiong3Meta = danXiong3.getItemMeta();
        ItemMeta danXiong4Meta = danXiong4.getItemMeta();
        ItemMeta danXiong5Meta = danXiong5.getItemMeta();
        ItemMeta danXiong6Meta = danXiong6.getItemMeta();
        ItemMeta danXiong7Meta = danXiong7.getItemMeta();
        ItemMeta danXiong8Meta = danXiong8.getItemMeta();

        xiong1Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiongSp2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiongSp3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiongSp4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiongSp5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiongSp6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiongSp7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiongSp8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXiong2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXiong3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXiong4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXiong5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXiong6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXiong7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXiong8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXiong2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXiong3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXiong4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXiong5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXiong6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXiong7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXiong8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXiong2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXiong3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXiong4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXiong5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXiong6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXiong7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXiong8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        xiong1Meta.setUnbreakable(true);
        xiongSp2Meta.setUnbreakable(true);
        xiongSp3Meta.setUnbreakable(true);
        xiongSp4Meta.setUnbreakable(true);
        xiongSp5Meta.setUnbreakable(true);
        xiongSp6Meta.setUnbreakable(true);
        xiongSp7Meta.setUnbreakable(true);
        xiongSp8Meta.setUnbreakable(true);
        zhanXiong2Meta.setUnbreakable(true);
        zhanXiong3Meta.setUnbreakable(true);
        zhanXiong4Meta.setUnbreakable(true);
        zhanXiong5Meta.setUnbreakable(true);
        zhanXiong6Meta.setUnbreakable(true);
        zhanXiong7Meta.setUnbreakable(true);
        zhanXiong8Meta.setUnbreakable(true);
        gongXiong2Meta.setUnbreakable(true);
        gongXiong3Meta.setUnbreakable(true);
        gongXiong4Meta.setUnbreakable(true);
        gongXiong5Meta.setUnbreakable(true);
        gongXiong6Meta.setUnbreakable(true);
        gongXiong7Meta.setUnbreakable(true);
        gongXiong8Meta.setUnbreakable(true);
        danXiong2Meta.setUnbreakable(true);
        danXiong3Meta.setUnbreakable(true);
        danXiong4Meta.setUnbreakable(true);
        danXiong5Meta.setUnbreakable(true);
        danXiong6Meta.setUnbreakable(true);
        danXiong7Meta.setUnbreakable(true);
        danXiong8Meta.setUnbreakable(true);

        xiong1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        xiongSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        xiongSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        xiongSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        xiongSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        xiongSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        xiongSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        xiongSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        zhanXiong2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        zhanXiong3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        zhanXiong4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        zhanXiong5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        zhanXiong6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        zhanXiong7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        zhanXiong8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        gongXiong2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        gongXiong3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        gongXiong4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        gongXiong5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        gongXiong6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        gongXiong7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        gongXiong8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        danXiong2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        danXiong3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        danXiong4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        danXiong5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        danXiong6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        danXiong7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);
        danXiong8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.XIONG_ARMOR);

        xiong1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        xiongSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        xiongSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        xiongSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        xiongSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        xiongSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        xiongSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        xiongSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        zhanXiong2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        zhanXiong3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        zhanXiong4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        zhanXiong5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        zhanXiong6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        zhanXiong7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        zhanXiong8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        gongXiong2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        gongXiong3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        gongXiong4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        gongXiong5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        gongXiong6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        gongXiong7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        gongXiong8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        danXiong2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        danXiong3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        danXiong4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        danXiong5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        danXiong6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        danXiong7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);
        danXiong8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.XIONG_ARMOR_TOUGHNESS);

        xiong1Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        xiongSp2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        xiongSp3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        xiongSp4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        xiongSp5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        xiongSp6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        xiongSp7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        xiongSp8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        zhanXiong2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        zhanXiong3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        zhanXiong4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        zhanXiong5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        zhanXiong6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        zhanXiong7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        zhanXiong8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        gongXiong2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        gongXiong3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        gongXiong4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        gongXiong5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        gongXiong6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        gongXiong7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        gongXiong8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        danXiong2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        danXiong3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        danXiong4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        danXiong5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        danXiong6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        danXiong7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);
        danXiong8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.XIONG_KNOCKBACK_RESISTANCE);


        PersistentDataContainer pdcXiong1 = xiong1Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp2 = xiongSp2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp3 = xiongSp3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp4 = xiongSp4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp5 = xiongSp5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp6 = xiongSp6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp7 = xiongSp7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcXiongSp8 = xiongSp8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong2 = zhanXiong2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong3 = zhanXiong3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong4 = zhanXiong4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong5 = zhanXiong5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong6 = zhanXiong6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong7 = zhanXiong7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcZhanXiong8 = zhanXiong8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong2 = gongXiong2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong3 = gongXiong3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong4 = gongXiong4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong5 = gongXiong5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong6 = gongXiong6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong7 = gongXiong7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcGongXiong8 = gongXiong8Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong2 = danXiong2Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong3 = danXiong3Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong4 = danXiong4Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong5 = danXiong5Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong6 = danXiong6Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong7 = danXiong7Meta.getPersistentDataContainer();
        PersistentDataContainer pdcDanXiong8 = danXiong8Meta.getPersistentDataContainer();

        pdcXiong1.set(DataContainer.id, PersistentDataType.STRING, "xiong1");
        pdcXiongSp2.set(DataContainer.id, PersistentDataType.STRING, "xiongSp2");
        pdcXiongSp3.set(DataContainer.id, PersistentDataType.STRING, "xiongSp3");
        pdcXiongSp4.set(DataContainer.id, PersistentDataType.STRING, "xiongSp4");
        pdcXiongSp5.set(DataContainer.id, PersistentDataType.STRING, "xiongSp5");
        pdcXiongSp6.set(DataContainer.id, PersistentDataType.STRING, "xiongSp6");
        pdcXiongSp7.set(DataContainer.id, PersistentDataType.STRING, "xiongSp7");
        pdcXiongSp8.set(DataContainer.id, PersistentDataType.STRING, "xiongSp8");
        pdcZhanXiong2.set(DataContainer.id, PersistentDataType.STRING, "zhanXiong2");
        pdcZhanXiong3.set(DataContainer.id, PersistentDataType.STRING, "zhanXiong3");
        pdcZhanXiong4.set(DataContainer.id, PersistentDataType.STRING, "zhanXiong4");
        pdcZhanXiong5.set(DataContainer.id, PersistentDataType.STRING, "zhanXiong5");
        pdcZhanXiong6.set(DataContainer.id, PersistentDataType.STRING, "zhanXiong6");
        pdcZhanXiong7.set(DataContainer.id, PersistentDataType.STRING, "zhanXiong7");
        pdcZhanXiong8.set(DataContainer.id, PersistentDataType.STRING, "zhanXiong8");
        pdcGongXiong2.set(DataContainer.id, PersistentDataType.STRING, "gongXiong2");
        pdcGongXiong3.set(DataContainer.id, PersistentDataType.STRING, "gongXiong3");
        pdcGongXiong4.set(DataContainer.id, PersistentDataType.STRING, "gongXiong4");
        pdcGongXiong5.set(DataContainer.id, PersistentDataType.STRING, "gongXiong5");
        pdcGongXiong6.set(DataContainer.id, PersistentDataType.STRING, "gongXiong6");
        pdcGongXiong7.set(DataContainer.id, PersistentDataType.STRING, "gongXiong7");
        pdcGongXiong8.set(DataContainer.id, PersistentDataType.STRING, "gongXiong8");
        pdcDanXiong2.set(DataContainer.id, PersistentDataType.STRING, "danXiong2");
        pdcDanXiong3.set(DataContainer.id, PersistentDataType.STRING, "danXiong3");
        pdcDanXiong4.set(DataContainer.id, PersistentDataType.STRING, "danXiong4");
        pdcDanXiong5.set(DataContainer.id, PersistentDataType.STRING, "danXiong5");
        pdcDanXiong6.set(DataContainer.id, PersistentDataType.STRING, "danXiong6");
        pdcDanXiong7.set(DataContainer.id, PersistentDataType.STRING, "danXiong7");
        pdcDanXiong8.set(DataContainer.id, PersistentDataType.STRING, "danXiong8");

        pdcXiong1.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXiongSp2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXiongSp3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXiongSp4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXiongSp5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXiongSp6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXiongSp7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXiongSp8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhanXiong2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhanXiong3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhanXiong4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhanXiong5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhanXiong6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhanXiong7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhanXiong8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcGongXiong2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcGongXiong3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcGongXiong4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcGongXiong5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcGongXiong6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcGongXiong7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcGongXiong8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcDanXiong2.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcDanXiong3.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcDanXiong4.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcDanXiong5.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcDanXiong6.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcDanXiong7.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcDanXiong8.set(DataContainer.enchantid, PersistentDataType.STRING, "null");

        pdcXiong1.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXiongSp2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXiongSp3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXiongSp4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXiongSp5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXiongSp6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXiongSp7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXiongSp8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanXiong2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanXiong3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanXiong4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanXiong5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanXiong6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanXiong7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhanXiong8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongXiong2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongXiong3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongXiong4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongXiong5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongXiong6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongXiong7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcGongXiong8.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanXiong2.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanXiong3.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanXiong4.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanXiong5.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanXiong6.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanXiong7.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcDanXiong8.set(DataContainer.insertid, PersistentDataType.STRING, "null");

        pdcXiong1.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcXiongSp2.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcXiongSp3.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcXiongSp4.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcXiongSp5.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcXiongSp6.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcXiongSp7.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcXiongSp8.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcZhanXiong2.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcZhanXiong3.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcZhanXiong4.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcZhanXiong5.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcZhanXiong6.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcZhanXiong7.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcZhanXiong8.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcGongXiong2.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcGongXiong3.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcGongXiong4.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcGongXiong5.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcGongXiong6.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcGongXiong7.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcGongXiong8.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcDanXiong2.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcDanXiong3.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcDanXiong4.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcDanXiong5.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcDanXiong6.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcDanXiong7.set(DataContainer.slot, PersistentDataType.INTEGER, 38);
        pdcDanXiong8.set(DataContainer.slot, PersistentDataType.INTEGER, 38);

        pdcXiong1.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcXiongSp2.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcXiongSp3.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcXiongSp4.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcXiongSp5.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcXiongSp6.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcXiongSp7.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcXiongSp8.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        pdcZhanXiong2.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcZhanXiong3.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcZhanXiong4.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcZhanXiong5.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcZhanXiong6.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcZhanXiong7.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcZhanXiong8.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcGongXiong2.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcGongXiong3.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcGongXiong4.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcGongXiong5.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcGongXiong6.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcGongXiong7.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcGongXiong8.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcDanXiong2.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcDanXiong3.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcDanXiong4.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcDanXiong5.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcDanXiong6.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcDanXiong7.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcDanXiong8.set(DataContainer.job, PersistentDataType.INTEGER, 3);

        xiong1Meta.displayName(Component.text("初心者皮甲").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        xiongSp2Meta.displayName(Component.text("绿菊甲").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        xiongSp3Meta.displayName(Component.text("翠竹甲").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        xiongSp4Meta.displayName(Component.text("洛水甲").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        xiongSp5Meta.displayName(Component.text("乐游甲").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        xiongSp6Meta.displayName(Component.text("如狱").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        xiongSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        xiongSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanXiong2Meta.displayName(Component.text("战狼硬甲").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanXiong3Meta.displayName(Component.text("饕餮战甲").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanXiong4Meta.displayName(Component.text("玄灵武甲").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanXiong5Meta.displayName(Component.text("龙鳞软甲").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanXiong6Meta.displayName(Component.text("鬼火焚铠[战]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanXiong7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanXiong8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongXiong2Meta.displayName(Component.text("听风皮甲").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongXiong3Meta.displayName(Component.text("虎牙胸甲").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongXiong4Meta.displayName(Component.text("蛇皮锁甲").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongXiong5Meta.displayName(Component.text("赤鹰翼").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongXiong6Meta.displayName(Component.text("鬼火焚凯[弓]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongXiong7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongXiong8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danXiong2Meta.displayName(Component.text("丹魂皮甲").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danXiong3Meta.displayName(Component.text("炼丹袍").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danXiong4Meta.displayName(Component.text("华佗裳").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danXiong5Meta.displayName(Component.text("地黄袍").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danXiong6Meta.displayName(Component.text("太上神袍[丹]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danXiong7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danXiong8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        xiong1Meta.lore(
                List.of(
                        ComponentSet.RARE1,
                        ComponentSet.JOBALL,
                        ComponentSet.SHORTSHUXIN,
                        Component.text("§f生命 +§b2   §f护甲 +§b1"),
                        Component.text("§f移速 +§b1%   §f跳跃力 +§b1"),
                        ComponentSet.SHORTJINENG,
                        Component.text("§6[被动技][坚韧] §f冷却: §b30s"),
                        Component.text("§f获得§b5§f点护甲和法抗，持续§b5s"),
                        ComponentSet.SHORTFULINGXIANGQIAN,
                        Component.text("§a附灵: §f[无]"),
                        Component.text("§a镶嵌: §f[无]")
                )
        );
        xiongSp2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        xiongSp3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        xiongSp4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        xiongSp5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        xiongSp6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        xiongSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        xiongSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        zhanXiong2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        zhanXiong3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        zhanXiong4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        zhanXiong5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        zhanXiong6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        zhanXiong7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        zhanXiong8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        gongXiong2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        gongXiong3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        gongXiong4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        gongXiong5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        gongXiong6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        gongXiong7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        gongXiong8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        danXiong2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        danXiong3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        danXiong4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        danXiong5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        danXiong6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        danXiong7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        danXiong8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        LeatherArmorMeta xiong1LetherMeta = (LeatherArmorMeta) xiong1Meta;
        LeatherArmorMeta xiongSp2LetherMeta = (LeatherArmorMeta) xiongSp2Meta;
        LeatherArmorMeta xiongSp3LetherMeta = (LeatherArmorMeta) xiongSp3Meta;
        LeatherArmorMeta xiongSp4LetherMeta = (LeatherArmorMeta) xiongSp4Meta;
        LeatherArmorMeta xiongSp5LetherMeta = (LeatherArmorMeta) xiongSp5Meta;
        LeatherArmorMeta zhanXiong2LetherMeta = (LeatherArmorMeta) zhanXiong2Meta;
        LeatherArmorMeta gongXiong2LetherMeta = (LeatherArmorMeta) gongXiong2Meta;
        LeatherArmorMeta danXiong2LetherMeta = (LeatherArmorMeta) danXiong2Meta;

        xiong1LetherMeta.setColor(Color.WHITE);
        xiongSp2LetherMeta.setColor(Color.GREEN);
        xiongSp3LetherMeta.setColor(Color.BLUE);
        xiongSp4LetherMeta.setColor(Color.PURPLE);
        xiongSp5LetherMeta.setColor(Color.YELLOW);
        zhanXiong2LetherMeta.setColor(Color.RED);
        gongXiong2LetherMeta.setColor(Color.GREEN);
        danXiong2LetherMeta.setColor(Color.BLUE);

        xiong1.setItemMeta(xiong1LetherMeta);
        xiongSp2.setItemMeta(xiongSp2LetherMeta);
        xiongSp3.setItemMeta(xiongSp3LetherMeta);
        xiongSp4.setItemMeta(xiongSp4LetherMeta);
        xiongSp5.setItemMeta(xiongSp5LetherMeta);
        xiongSp6.setItemMeta(xiongSp6Meta);
        xiongSp7.setItemMeta(xiongSp7Meta);
        xiongSp8.setItemMeta(xiongSp8Meta);
        zhanXiong2.setItemMeta(zhanXiong2LetherMeta);
        zhanXiong3.setItemMeta(zhanXiong3Meta);
        zhanXiong4.setItemMeta(zhanXiong4Meta);
        zhanXiong5.setItemMeta(zhanXiong5Meta);
        zhanXiong6.setItemMeta(zhanXiong6Meta);
        zhanXiong7.setItemMeta(zhanXiong7Meta);
        zhanXiong8.setItemMeta(zhanXiong8Meta);
        gongXiong2.setItemMeta(gongXiong2LetherMeta);
        gongXiong3.setItemMeta(gongXiong3Meta);
        gongXiong4.setItemMeta(gongXiong4Meta);
        gongXiong5.setItemMeta(gongXiong5Meta);
        gongXiong6.setItemMeta(gongXiong6Meta);
        gongXiong7.setItemMeta(gongXiong7Meta);
        gongXiong8.setItemMeta(gongXiong8Meta);
        danXiong2.setItemMeta(danXiong2LetherMeta);
        danXiong3.setItemMeta(danXiong3Meta);
        danXiong4.setItemMeta(danXiong4Meta);
        danXiong5.setItemMeta(danXiong5Meta);
        danXiong6.setItemMeta(danXiong6Meta);
        danXiong7.setItemMeta(danXiong7Meta);
        danXiong8.setItemMeta(danXiong8Meta);

    }

}
