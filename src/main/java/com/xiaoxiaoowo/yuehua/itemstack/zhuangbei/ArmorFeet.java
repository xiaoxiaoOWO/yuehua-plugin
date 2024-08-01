package com.xiaoxiaoowo.yuehua.itemstack.zhuangbei;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class ArmorFeet {
    //通用
    public static final ItemStack xie1 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack xieSp2 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack xieSp3 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack xieSp4 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack xieSp5 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack xieSp6 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack xieSp7 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack xieSp8 = new ItemStack(Material.DIAMOND_BOOTS);

    //战士
    public static final ItemStack zhanXie2 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack zhanXie3 = new ItemStack(Material.IRON_BOOTS);
    public static final ItemStack zhanXie4 = new ItemStack(Material.IRON_BOOTS);
    public static final ItemStack zhanXie5 = new ItemStack(Material.IRON_BOOTS);
    public static final ItemStack zhanXie6 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack zhanXie7 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack zhanXie8 = new ItemStack(Material.DIAMOND_BOOTS);

    //弓箭手
    public static final ItemStack gongXie2 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack gongXie3 = new ItemStack(Material.GOLDEN_BOOTS);
    public static final ItemStack gongXie4 = new ItemStack(Material.GOLDEN_BOOTS);
    public static final ItemStack gongXie5 = new ItemStack(Material.GOLDEN_BOOTS);
    public static final ItemStack gongXie6 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack gongXie7 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack gongXie8 = new ItemStack(Material.DIAMOND_BOOTS);

    // 炼丹师
    public static final ItemStack danXie2 = new ItemStack(Material.LEATHER_BOOTS);
    public static final ItemStack danXie3 = new ItemStack(Material.CHAINMAIL_BOOTS);
    public static final ItemStack danXie4 = new ItemStack(Material.CHAINMAIL_BOOTS);
    public static final ItemStack danXie5 = new ItemStack(Material.CHAINMAIL_BOOTS);
    public static final ItemStack danXie6 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack danXie7 = new ItemStack(Material.DIAMOND_BOOTS);
    public static final ItemStack danXie8 = new ItemStack(Material.DIAMOND_BOOTS);

    static {
        ItemMeta xie1Meta = xie1.getItemMeta();
        ItemMeta xieSp2Meta = xieSp2.getItemMeta();
        ItemMeta xieSp3Meta = xieSp3.getItemMeta();
        ItemMeta xieSp4Meta = xieSp4.getItemMeta();
        ItemMeta xieSp5Meta = xieSp5.getItemMeta();
        ItemMeta xieSp6Meta = xieSp6.getItemMeta();
        ItemMeta xieSp7Meta = xieSp7.getItemMeta();
        ItemMeta xieSp8Meta = xieSp8.getItemMeta();
        ItemMeta zhanXie2Meta = zhanXie2.getItemMeta();
        ItemMeta zhanXie3Meta = zhanXie3.getItemMeta();
        ItemMeta zhanXie4Meta = zhanXie4.getItemMeta();
        ItemMeta zhanXie5Meta = zhanXie5.getItemMeta();
        ItemMeta zhanXie6Meta = zhanXie6.getItemMeta();
        ItemMeta zhanXie7Meta = zhanXie7.getItemMeta();
        ItemMeta zhanXie8Meta = zhanXie8.getItemMeta();
        ItemMeta gongXie2Meta = gongXie2.getItemMeta();
        ItemMeta gongXie3Meta = gongXie3.getItemMeta();
        ItemMeta gongXie4Meta = gongXie4.getItemMeta();
        ItemMeta gongXie5Meta = gongXie5.getItemMeta();
        ItemMeta gongXie6Meta = gongXie6.getItemMeta();
        ItemMeta gongXie7Meta = gongXie7.getItemMeta();
        ItemMeta gongXie8Meta = gongXie8.getItemMeta();
        ItemMeta danXie2Meta = danXie2.getItemMeta();
        ItemMeta danXie3Meta = danXie3.getItemMeta();
        ItemMeta danXie4Meta = danXie4.getItemMeta();
        ItemMeta danXie5Meta = danXie5.getItemMeta();
        ItemMeta danXie6Meta = danXie6.getItemMeta();
        ItemMeta danXie7Meta = danXie7.getItemMeta();
        ItemMeta danXie8Meta = danXie8.getItemMeta();

        xie1Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xieSp2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xieSp3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xieSp4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xieSp5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xieSp6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xieSp7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xieSp8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXie2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXie3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXie4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXie5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXie6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXie7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhanXie8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXie2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXie3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXie4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXie5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXie6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXie7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        gongXie8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXie2Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXie3Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXie4Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXie5Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXie6Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXie7Meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        danXie8Meta.addItemFlags(ZeroAttributeModifier.itemFlags);


        xie1Meta.setUnbreakable(true);
        xieSp2Meta.setUnbreakable(true);
        xieSp3Meta.setUnbreakable(true);
        xieSp4Meta.setUnbreakable(true);
        xieSp5Meta.setUnbreakable(true);
        xieSp6Meta.setUnbreakable(true);
        xieSp7Meta.setUnbreakable(true);
        xieSp8Meta.setUnbreakable(true);
        zhanXie2Meta.setUnbreakable(true);
        zhanXie3Meta.setUnbreakable(true);
        zhanXie4Meta.setUnbreakable(true);
        zhanXie5Meta.setUnbreakable(true);
        zhanXie6Meta.setUnbreakable(true);
        zhanXie7Meta.setUnbreakable(true);
        zhanXie8Meta.setUnbreakable(true);
        gongXie2Meta.setUnbreakable(true);
        gongXie3Meta.setUnbreakable(true);
        gongXie4Meta.setUnbreakable(true);
        gongXie5Meta.setUnbreakable(true);
        gongXie6Meta.setUnbreakable(true);
        gongXie7Meta.setUnbreakable(true);
        gongXie8Meta.setUnbreakable(true);
        danXie2Meta.setUnbreakable(true);
        danXie3Meta.setUnbreakable(true);
        danXie4Meta.setUnbreakable(true);
        danXie5Meta.setUnbreakable(true);
        danXie6Meta.setUnbreakable(true);
        danXie7Meta.setUnbreakable(true);
        danXie8Meta.setUnbreakable(true);

        xie1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        xieSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        xieSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        xieSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        xieSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        xieSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        xieSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        xieSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        zhanXie2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        zhanXie3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        zhanXie4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        zhanXie5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        zhanXie6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        zhanXie7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        zhanXie8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        gongXie2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        gongXie3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        gongXie4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        gongXie5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        gongXie6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        gongXie7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        gongXie8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        danXie2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        danXie3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        danXie4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        danXie5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        danXie6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        danXie7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);
        danXie8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR, ZeroAttributeModifier.JIAO_ARMOR);

        xie1Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        xieSp2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        xieSp3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        xieSp4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        xieSp5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        xieSp6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        xieSp7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        xieSp8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        zhanXie2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        zhanXie3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        zhanXie4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        zhanXie5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        zhanXie6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        zhanXie7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        zhanXie8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        gongXie2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        gongXie3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        gongXie4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        gongXie5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        gongXie6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        gongXie7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        gongXie8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        danXie2Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        danXie3Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        danXie4Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        danXie5Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        danXie6Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        danXie7Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);
        danXie8Meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, ZeroAttributeModifier.JIAO_ARMOR_TOUGHNESS);

        xie1Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        xieSp2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        xieSp3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        xieSp4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        xieSp5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        xieSp6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        xieSp7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        xieSp8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        zhanXie2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        zhanXie3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        zhanXie4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        zhanXie5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        zhanXie6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        zhanXie7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        zhanXie8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        gongXie2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        gongXie3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        gongXie4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        gongXie5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        gongXie6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        gongXie7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        gongXie8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        danXie2Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        danXie3Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        danXie4Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        danXie5Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        danXie6Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        danXie7Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);
        danXie8Meta.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, ZeroAttributeModifier.JIAO_KNOCKBACK_RESISTANCE);

        PersistentDataContainer xie1Data = xie1Meta.getPersistentDataContainer();
        PersistentDataContainer xieSp2Data = xieSp2Meta.getPersistentDataContainer();
        PersistentDataContainer xieSp3Data = xieSp3Meta.getPersistentDataContainer();
        PersistentDataContainer xieSp4Data = xieSp4Meta.getPersistentDataContainer();
        PersistentDataContainer xieSp5Data = xieSp5Meta.getPersistentDataContainer();
        PersistentDataContainer xieSp6Data = xieSp6Meta.getPersistentDataContainer();
        PersistentDataContainer xieSp7Data = xieSp7Meta.getPersistentDataContainer();
        PersistentDataContainer xieSp8Data = xieSp8Meta.getPersistentDataContainer();
        PersistentDataContainer zhanXie2Data = zhanXie2Meta.getPersistentDataContainer();
        PersistentDataContainer zhanXie3Data = zhanXie3Meta.getPersistentDataContainer();
        PersistentDataContainer zhanXie4Data = zhanXie4Meta.getPersistentDataContainer();
        PersistentDataContainer zhanXie5Data = zhanXie5Meta.getPersistentDataContainer();
        PersistentDataContainer zhanXie6Data = zhanXie6Meta.getPersistentDataContainer();
        PersistentDataContainer zhanXie7Data = zhanXie7Meta.getPersistentDataContainer();
        PersistentDataContainer zhanXie8Data = zhanXie8Meta.getPersistentDataContainer();
        PersistentDataContainer gongXie2Data = gongXie2Meta.getPersistentDataContainer();
        PersistentDataContainer gongXie3Data = gongXie3Meta.getPersistentDataContainer();
        PersistentDataContainer gongXie4Data = gongXie4Meta.getPersistentDataContainer();
        PersistentDataContainer gongXie5Data = gongXie5Meta.getPersistentDataContainer();
        PersistentDataContainer gongXie6Data = gongXie6Meta.getPersistentDataContainer();
        PersistentDataContainer gongXie7Data = gongXie7Meta.getPersistentDataContainer();
        PersistentDataContainer gongXie8Data = gongXie8Meta.getPersistentDataContainer();
        PersistentDataContainer danXie2Data = danXie2Meta.getPersistentDataContainer();
        PersistentDataContainer danXie3Data = danXie3Meta.getPersistentDataContainer();
        PersistentDataContainer danXie4Data = danXie4Meta.getPersistentDataContainer();
        PersistentDataContainer danXie5Data = danXie5Meta.getPersistentDataContainer();
        PersistentDataContainer danXie6Data = danXie6Meta.getPersistentDataContainer();
        PersistentDataContainer danXie7Data = danXie7Meta.getPersistentDataContainer();
        PersistentDataContainer danXie8Data = danXie8Meta.getPersistentDataContainer();

        xie1Data.set(DataContainer.id, PersistentDataType.STRING, "xie1");
        xieSp2Data.set(DataContainer.id, PersistentDataType.STRING, "xieSp2");
        xieSp3Data.set(DataContainer.id, PersistentDataType.STRING, "xieSp3");
        xieSp4Data.set(DataContainer.id, PersistentDataType.STRING, "xieSp4");
        xieSp5Data.set(DataContainer.id, PersistentDataType.STRING, "xieSp5");
        xieSp6Data.set(DataContainer.id, PersistentDataType.STRING, "xieSp6");
        xieSp7Data.set(DataContainer.id, PersistentDataType.STRING, "xieSp7");
        xieSp8Data.set(DataContainer.id, PersistentDataType.STRING, "xieSp8");
        zhanXie2Data.set(DataContainer.id, PersistentDataType.STRING, "zhanXie2");
        zhanXie3Data.set(DataContainer.id, PersistentDataType.STRING, "zhanXie3");
        zhanXie4Data.set(DataContainer.id, PersistentDataType.STRING, "zhanXie4");
        zhanXie5Data.set(DataContainer.id, PersistentDataType.STRING, "zhanXie5");
        zhanXie6Data.set(DataContainer.id, PersistentDataType.STRING, "zhanXie6");
        zhanXie7Data.set(DataContainer.id, PersistentDataType.STRING, "zhanXie7");
        zhanXie8Data.set(DataContainer.id, PersistentDataType.STRING, "zhanXie8");
        gongXie2Data.set(DataContainer.id, PersistentDataType.STRING, "gongXie2");
        gongXie3Data.set(DataContainer.id, PersistentDataType.STRING, "gongXie3");
        gongXie4Data.set(DataContainer.id, PersistentDataType.STRING, "gongXie4");
        gongXie5Data.set(DataContainer.id, PersistentDataType.STRING, "gongXie5");
        gongXie6Data.set(DataContainer.id, PersistentDataType.STRING, "gongXie6");
        gongXie7Data.set(DataContainer.id, PersistentDataType.STRING, "gongXie7");
        gongXie8Data.set(DataContainer.id, PersistentDataType.STRING, "gongXie8");
        danXie2Data.set(DataContainer.id, PersistentDataType.STRING, "danXie2");
        danXie3Data.set(DataContainer.id, PersistentDataType.STRING, "danXie3");
        danXie4Data.set(DataContainer.id, PersistentDataType.STRING, "danXie4");
        danXie5Data.set(DataContainer.id, PersistentDataType.STRING, "danXie5");
        danXie6Data.set(DataContainer.id, PersistentDataType.STRING, "danXie6");
        danXie7Data.set(DataContainer.id, PersistentDataType.STRING, "danXie7");
        danXie8Data.set(DataContainer.id, PersistentDataType.STRING, "danXie8");

        xie1Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        xieSp2Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        xieSp3Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        xieSp4Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        xieSp5Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        xieSp6Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        xieSp7Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        xieSp8Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        zhanXie2Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        zhanXie3Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        zhanXie4Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        zhanXie5Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        zhanXie6Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        zhanXie7Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        zhanXie8Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        gongXie2Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        gongXie3Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        gongXie4Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        gongXie5Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        gongXie6Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        gongXie7Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        gongXie8Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        danXie2Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        danXie3Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        danXie4Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        danXie5Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        danXie6Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        danXie7Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        danXie8Data.set(DataContainer.insertid, PersistentDataType.STRING, "null");

        xie1Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        xieSp2Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        xieSp3Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        xieSp4Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        xieSp5Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        xieSp6Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        xieSp7Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        xieSp8Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        zhanXie2Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        zhanXie3Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        zhanXie4Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        zhanXie5Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        zhanXie6Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        zhanXie7Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        zhanXie8Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        gongXie2Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        gongXie3Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        gongXie4Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        gongXie5Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        gongXie6Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        gongXie7Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        gongXie8Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        danXie2Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        danXie3Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        danXie4Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        danXie5Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        danXie6Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        danXie7Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        danXie8Data.set(DataContainer.enchantid, PersistentDataType.STRING, "null");

        xie1Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        xieSp2Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        xieSp3Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        xieSp4Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        xieSp5Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        xieSp6Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        xieSp7Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        xieSp8Data.set(DataContainer.job, PersistentDataType.INTEGER, 0);
        zhanXie2Data.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        zhanXie3Data.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        zhanXie4Data.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        zhanXie5Data.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        zhanXie6Data.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        zhanXie7Data.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        zhanXie8Data.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        gongXie2Data.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        gongXie3Data.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        gongXie4Data.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        gongXie5Data.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        gongXie6Data.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        gongXie7Data.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        gongXie8Data.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        danXie2Data.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        danXie3Data.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        danXie4Data.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        danXie5Data.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        danXie6Data.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        danXie7Data.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        danXie8Data.set(DataContainer.job, PersistentDataType.INTEGER, 3);

        xie1Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        xieSp2Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        xieSp3Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        xieSp4Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        xieSp5Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        xieSp6Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        xieSp7Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        xieSp8Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        zhanXie2Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        zhanXie3Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        zhanXie4Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        zhanXie5Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        zhanXie6Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        zhanXie7Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        zhanXie8Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        gongXie2Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        gongXie3Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        gongXie4Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        gongXie5Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        gongXie6Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        gongXie7Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        gongXie8Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        danXie2Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        danXie3Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        danXie4Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        danXie5Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        danXie6Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        danXie7Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);
        danXie8Data.set(DataContainer.slot, PersistentDataType.INTEGER, 36);

        xie1Meta.displayName(Component.text("初心者皮鞋").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        xieSp2Meta.displayName(Component.text("牡丹鞋").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        xieSp3Meta.displayName(Component.text("幽兰鞋").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        xieSp4Meta.displayName(Component.text("观天羽").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        xieSp5Meta.displayName(Component.text("听音羽").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        xieSp6Meta.displayName(Component.text("犹绝").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        xieSp7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        xieSp8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        zhanXie2Meta.displayName(Component.text("战狼长筒靴").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        zhanXie3Meta.displayName(Component.text("凶兽蹄").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        zhanXie4Meta.displayName(Component.text("灵龟出水").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        zhanXie5Meta.displayName(Component.text("龙爪履").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        zhanXie6Meta.displayName(Component.text("沉潜殇履[战]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        zhanXie7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        zhanXie8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        gongXie2Meta.displayName(Component.text("风羽草鞋").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        gongXie3Meta.displayName(Component.text("虎皮靴").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        gongXie4Meta.displayName(Component.text("蛇行足").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        gongXie5Meta.displayName(Component.text("赤鹰爪").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        gongXie6Meta.displayName(Component.text("沉潜殇履[弓]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        gongXie7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        gongXie8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        danXie2Meta.displayName(Component.text("功夫鞋").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        danXie3Meta.displayName(Component.text("华佗石").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        danXie4Meta.displayName(Component.text("紫苏叶履").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        danXie5Meta.displayName(Component.text("文武曲").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        danXie6Meta.displayName(Component.text("沉潜殇履[丹]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        danXie7Meta.displayName(Component.text("X").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false));
        danXie8Meta.displayName(Component.text("X").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));

        xie1Meta.lore(
                List.of(
                        ComponentSet.RARE1,
                        ComponentSet.JOBALL,
                        ComponentSet.SHORTSHUXIN,
                        Component.text("§f生命 +§b2   §f护甲 +§b1"),
                        Component.text("§f移速 +§b1%   §f跳跃力 +§b1"),
                        ComponentSet.SHORTJINENG,
                        Component.text("§6[被动技][踏风] §f冷却: §b30s"),
                        Component.text("§f获得迅捷I，持续§b5s"),
                        ComponentSet.SHORTFULINGXIANGQIAN,
                        Component.text("§a附灵: §f[无]"),
                        Component.text("§a镶嵌: §f[无]")
                )
        );
        xieSp2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        xieSp3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        xieSp4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        xieSp5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        xieSp6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        xieSp7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        xieSp8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        zhanXie2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        zhanXie3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        zhanXie4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        zhanXie5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        zhanXie6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        zhanXie7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        zhanXie8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        gongXie2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        gongXie3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        gongXie4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        gongXie5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        gongXie6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        gongXie7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        gongXie8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );
        danXie2Meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        danXie3Meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        danXie4Meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        danXie5Meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        danXie6Meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        danXie7Meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        danXie8Meta.lore(
                List.of(
                        ComponentSet.RARE8
                )
        );

        LeatherArmorMeta xie1LeatherArmorMeta = (LeatherArmorMeta) xie1Meta;
        LeatherArmorMeta xieSp2LeatherArmorMeta = (LeatherArmorMeta) xieSp2Meta;
        LeatherArmorMeta xieSp3LeatherArmorMeta = (LeatherArmorMeta) xieSp3Meta;
        LeatherArmorMeta xieSp4LeatherArmorMeta = (LeatherArmorMeta) xieSp4Meta;
        LeatherArmorMeta xieSp5LeatherArmorMeta = (LeatherArmorMeta) xieSp5Meta;
        LeatherArmorMeta zhan2LeatherArmorMeta = (LeatherArmorMeta) zhanXie2Meta;
        LeatherArmorMeta gong2LeatherArmorMeta = (LeatherArmorMeta) gongXie2Meta;
        LeatherArmorMeta dan2LeatherArmorMeta = (LeatherArmorMeta) danXie2Meta;

        xie1.setItemMeta(xie1LeatherArmorMeta);
        xieSp2.setItemMeta(xieSp2LeatherArmorMeta);
        xieSp3.setItemMeta(xieSp3LeatherArmorMeta);
        xieSp4.setItemMeta(xieSp4LeatherArmorMeta);
        xieSp5.setItemMeta(xieSp5LeatherArmorMeta);
        xieSp6.setItemMeta(xieSp6Meta);
        xieSp7.setItemMeta(xieSp7Meta);
        xieSp8.setItemMeta(xieSp8Meta);
        zhanXie2.setItemMeta(zhan2LeatherArmorMeta);
        zhanXie3.setItemMeta(zhanXie3Meta);
        zhanXie4.setItemMeta(zhanXie4Meta);
        zhanXie5.setItemMeta(zhanXie5Meta);
        zhanXie6.setItemMeta(zhanXie6Meta);
        zhanXie7.setItemMeta(zhanXie7Meta);
        zhanXie8.setItemMeta(zhanXie8Meta);
        gongXie2.setItemMeta(gong2LeatherArmorMeta);
        gongXie3.setItemMeta(gongXie3Meta);
        gongXie4.setItemMeta(gongXie4Meta);
        gongXie5.setItemMeta(gongXie5Meta);
        gongXie6.setItemMeta(gongXie6Meta);
        gongXie7.setItemMeta(gongXie7Meta);
        gongXie8.setItemMeta(gongXie8Meta);
        danXie2.setItemMeta(dan2LeatherArmorMeta);
        danXie3.setItemMeta(danXie3Meta);
        danXie4.setItemMeta(danXie4Meta);
        danXie5.setItemMeta(danXie5Meta);
        danXie6.setItemMeta(danXie6Meta);
        danXie7.setItemMeta(danXie7Meta);
        danXie8.setItemMeta(danXie8Meta);


    }


}
