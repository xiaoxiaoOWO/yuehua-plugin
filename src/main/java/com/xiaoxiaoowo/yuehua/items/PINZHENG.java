package com.xiaoxiaoowo.yuehua.items;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class PINZHENG {
    public static final ItemStack qkd1Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd2Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd3Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd4Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd6Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd7Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd8Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd9Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd10Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd11Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd12Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd13Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd14Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd15Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd16Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd17Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack qkd18Unlock = new ItemStack(Material.INK_SAC);
    public static final ItemStack hunyuandaiUnlock = new ItemStack(Material.INK_SAC);

    public static final ItemStack shipincao1 = new ItemStack(Material.INK_SAC);
    public static final ItemStack shipincao2 = new ItemStack(Material.INK_SAC);
    public static final ItemStack shipincao3 = new ItemStack(Material.INK_SAC);
    public static final ItemStack shipincao4 = new ItemStack(Material.INK_SAC);
    public static final ItemStack shipincao5 = new ItemStack(Material.INK_SAC);
    public static final ItemStack shipincao6 = new ItemStack(Material.INK_SAC);
    public static final ItemStack shipincao7 = new ItemStack(Material.INK_SAC);
    public static final ItemStack shipincao8 = new ItemStack(Material.INK_SAC);

    public static final ItemStack chonghua2 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua3 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua4 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua5 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua6 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua7 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua8 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua9 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua10 = new ItemStack(Material.INK_SAC);
    public static final ItemStack chonghua11 = new ItemStack(Material.INK_SAC);

    public static final ItemStack BanHeYueBin = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack YiHeYueBin = new ItemStack(Material.INK_SAC, 1);

    public static final ItemStack yushi1 = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack yushi2 = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack yushi3 = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack yushi4 = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack yushi5 = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack yushi6 = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack yushi7 = new ItemStack(Material.INK_SAC, 1);
    public static final ItemStack yushi8 = new ItemStack(Material.INK_SAC, 1);

    public static final ItemStack yemingzhu = new ItemStack(Material.INK_SAC, 1);

    public static final ItemStack yaoshihe = new ItemStack(Material.INK_SAC);
    public static final ItemStack yaoshihe2 = new ItemStack(Material.INK_SAC);
    public static final ItemStack yaoshihe3 = new ItemStack(Material.INK_SAC);


    static {
        ItemMeta yemingzhuMeta = yemingzhu.getItemMeta();
        yemingzhuMeta.setCustomModelData(4);
        yemingzhuMeta.setMaxStackSize(1);
        yemingzhuMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yemingzhu");
        yemingzhuMeta.displayName(
                Component.text("§b夜明珠")
        );
        yemingzhuMeta.lore(
                List.of(
                        Component.text("右键使用解锁菜单中杂项的夜视使用权限").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yemingzhu.setItemMeta(yemingzhuMeta);

        ItemMeta yaoshiheMeta = yaoshihe.getItemMeta();
        yaoshiheMeta.setCustomModelData(12);
        yaoshiheMeta.setMaxStackSize(1);
        yaoshiheMeta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaoshihe");
        yaoshiheMeta.displayName(
                Component.text("§c珍品盒☯幸运钥匙")
        );
        yaoshiheMeta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("右键打开获得随机一个幸运钥匙").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yaoshihe.setItemMeta(yaoshiheMeta);

        ItemMeta yaoshihe2Meta = yaoshihe2.getItemMeta();
        yaoshihe2Meta.setCustomModelData(12);
        yaoshihe2Meta.setMaxStackSize(1);
        yaoshihe2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaoshihe2");
        yaoshihe2Meta.displayName(
                Component.text("§4典藏盒☯幸运钥匙")
        );
        yaoshihe2Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        Component.text("右键打开获得随机两个幸运钥匙").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yaoshihe2.setItemMeta(yaoshihe2Meta);

        ItemMeta yaoshihe3Meta = yaoshihe3.getItemMeta();
        yaoshihe3Meta.setCustomModelData(12);
        yaoshihe3Meta.setMaxStackSize(1);
        yaoshihe3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yaoshihe3");
        yaoshihe3Meta.displayName(
                Component.text("§6古神盒☯幸运钥匙")
        );
        yaoshihe3Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        Component.text("右键打开获得随机五个幸运钥匙").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yaoshihe3.setItemMeta(yaoshihe3Meta);


        ItemMeta yushi1Meta = yushi1.getItemMeta();
        yushi1Meta.setCustomModelData(5);
        yushi1Meta.setMaxStackSize(1);
        yushi1Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag1");
        yushi1Meta.displayName(
                Component.text("§f一袋普通玉石")
        );
        yushi1Meta.lore(
                List.of(
                        ComponentSet.RARE1,
                        Component.text("右键打开获得随机6个一阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi1.setItemMeta(yushi1Meta);

        ItemMeta yushi2Meta = yushi2.getItemMeta();
        yushi2Meta.setCustomModelData(5);
        yushi2Meta.setMaxStackSize(1);
        yushi2Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag2");
        yushi2Meta.displayName(
                Component.text("§a一袋优秀玉石")
        );
        yushi2Meta.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("右键打开获得随机5个二阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi2.setItemMeta(yushi2Meta);

        ItemMeta yushi3Meta = yushi3.getItemMeta();
        yushi3Meta.setCustomModelData(5);
        yushi3Meta.setMaxStackSize(1);
        yushi3Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag3");
        yushi3Meta.displayName(
                Component.text("§9一袋精良玉石")
        );
        yushi3Meta.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("右键打开获得随机4个三阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi3.setItemMeta(yushi3Meta);

        ItemMeta yushi4Meta = yushi4.getItemMeta();
        yushi4Meta.setCustomModelData(5);
        yushi4Meta.setMaxStackSize(1);
        yushi4Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag4");
        yushi4Meta.displayName(
                Component.text("§d一袋珍奇玉石")
        );
        yushi4Meta.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("右键打开获得随机3个四阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi4.setItemMeta(yushi4Meta);

        ItemMeta yushi5Meta = yushi5.getItemMeta();
        yushi5Meta.setCustomModelData(5);
        yushi5Meta.setMaxStackSize(1);
        yushi5Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag5");
        yushi5Meta.displayName(
                Component.text("§e一袋史诗玉石")
        );
        yushi5Meta.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("右键打开获得随机2个五阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi5.setItemMeta(yushi5Meta);

        ItemMeta yushi6Meta = yushi6.getItemMeta();
        yushi6Meta.setCustomModelData(18);
        yushi6Meta.setMaxStackSize(1);
        yushi6Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag6");
        yushi6Meta.displayName(
                Component.text("§c珍品盒☯传说玉石")
        );
        yushi6Meta.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("右键打开获得随机1个六阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi6.setItemMeta(yushi6Meta);

        ItemMeta yushi7Meta = yushi7.getItemMeta();
        yushi7Meta.setCustomModelData(18);
        yushi7Meta.setMaxStackSize(1);
        yushi7Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag7");
        yushi7Meta.displayName(
                Component.text("§4典藏盒☯神器玉石")
        );
        yushi7Meta.lore(
                List.of(
                        ComponentSet.RARE7,
                        Component.text("右键打开获得随机1个七阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi7.setItemMeta(yushi7Meta);


        ItemMeta yushi8Meta = yushi8.getItemMeta();
        yushi8Meta.setCustomModelData(18);
        yushi8Meta.setMaxStackSize(1);
        yushi8Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yushibag8");
        yushi8Meta.displayName(
                Component.text("§6古神盒☯上古玉石")
        );
        yushi8Meta.lore(
                List.of(
                        ComponentSet.RARE8,
                        Component.text("右键打开获得随机1个八阶玉石").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        yushi8.setItemMeta(yushi8Meta);


        qkd1Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd1Unlock = qkd1Unlock.getItemMeta();
        itemMetaqkd1Unlock.setMaxStackSize(1);
        itemMetaqkd1Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd1unlock");
        itemMetaqkd1Unlock.displayName(
                Component.text("乾坤盒☯一").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd1Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯一").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd1Unlock.setItemMeta(itemMetaqkd1Unlock);

        qkd2Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd2Unlock = qkd2Unlock.getItemMeta();
        itemMetaqkd2Unlock.setMaxStackSize(1);
        itemMetaqkd2Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd2unlock");
        itemMetaqkd2Unlock.displayName(
                Component.text("乾坤盒☯二").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd2Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯二").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd2Unlock.setItemMeta(itemMetaqkd2Unlock);

        qkd3Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd3Unlock = qkd3Unlock.getItemMeta();
        itemMetaqkd3Unlock.setMaxStackSize(1);
        itemMetaqkd3Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd3unlock");
        itemMetaqkd3Unlock.displayName(
                Component.text("乾坤盒☯三").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd3Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯三").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd3Unlock.setItemMeta(itemMetaqkd3Unlock);

        qkd4Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd4Unlock = qkd4Unlock.getItemMeta();
        itemMetaqkd4Unlock.setMaxStackSize(1);
        itemMetaqkd4Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd4unlock");
        itemMetaqkd4Unlock.displayName(
                Component.text("乾坤盒☯四").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd4Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯四").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd4Unlock.setItemMeta(itemMetaqkd4Unlock);

        qkd6Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd6Unlock = qkd6Unlock.getItemMeta();
        itemMetaqkd6Unlock.setMaxStackSize(1);
        itemMetaqkd6Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd6unlock");
        itemMetaqkd6Unlock.displayName(
                Component.text("乾坤盒☯六").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd6Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯六").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd6Unlock.setItemMeta(itemMetaqkd6Unlock);

        qkd7Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd7Unlock = qkd7Unlock.getItemMeta();
        itemMetaqkd7Unlock.setMaxStackSize(1);
        itemMetaqkd7Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd7unlock");
        itemMetaqkd7Unlock.displayName(
                Component.text("乾坤盒☯七").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd7Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯七").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd7Unlock.setItemMeta(itemMetaqkd7Unlock);

        qkd8Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd8Unlock = qkd8Unlock.getItemMeta();
        itemMetaqkd8Unlock.setMaxStackSize(1);
        itemMetaqkd8Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd8unlock");
        itemMetaqkd8Unlock.displayName(
                Component.text("乾坤盒☯八").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd8Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯八").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd8Unlock.setItemMeta(itemMetaqkd8Unlock);

        qkd9Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd9Unlock = qkd9Unlock.getItemMeta();
        itemMetaqkd9Unlock.setMaxStackSize(1);
        itemMetaqkd9Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd9unlock");
        itemMetaqkd9Unlock.displayName(
                Component.text("乾坤盒☯九").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd9Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯九").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd9Unlock.setItemMeta(itemMetaqkd9Unlock);

        qkd10Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd10Unlock = qkd10Unlock.getItemMeta();
        itemMetaqkd10Unlock.setMaxStackSize(1);
        itemMetaqkd10Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd10unlock");
        itemMetaqkd10Unlock.displayName(
                Component.text("乾坤盒☯十").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd10Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd10Unlock.setItemMeta(itemMetaqkd10Unlock);

        qkd11Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd11Unlock = qkd11Unlock.getItemMeta();
        itemMetaqkd11Unlock.setMaxStackSize(1);
        itemMetaqkd11Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd11unlock");
        itemMetaqkd11Unlock.displayName(
                Component.text("乾坤盒☯十一").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd11Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十一").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd11Unlock.setItemMeta(itemMetaqkd11Unlock);

        qkd12Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd12Unlock = qkd12Unlock.getItemMeta();
        itemMetaqkd12Unlock.setMaxStackSize(1);
        itemMetaqkd12Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd12unlock");
        itemMetaqkd12Unlock.displayName(
                Component.text("乾坤盒☯十二").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd12Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十二").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd12Unlock.setItemMeta(itemMetaqkd12Unlock);

        qkd13Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd13Unlock = qkd13Unlock.getItemMeta();
        itemMetaqkd13Unlock.setMaxStackSize(1);
        itemMetaqkd13Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd13unlock");
        itemMetaqkd13Unlock.displayName(
                Component.text("乾坤盒☯十三").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd13Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十三").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd13Unlock.setItemMeta(itemMetaqkd13Unlock);

        qkd14Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd14Unlock = qkd14Unlock.getItemMeta();
        itemMetaqkd14Unlock.setMaxStackSize(1);
        itemMetaqkd14Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd14unlock");
        itemMetaqkd14Unlock.displayName(
                Component.text("乾坤盒☯十四").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd14Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十四").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd14Unlock.setItemMeta(itemMetaqkd14Unlock);

        qkd15Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd15Unlock = qkd15Unlock.getItemMeta();
        itemMetaqkd15Unlock.setMaxStackSize(1);
        itemMetaqkd15Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd15unlock");
        itemMetaqkd15Unlock.displayName(
                Component.text("乾坤盒☯十五").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd15Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十五").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd15Unlock.setItemMeta(itemMetaqkd15Unlock);

        qkd16Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd16Unlock = qkd16Unlock.getItemMeta();
        itemMetaqkd16Unlock.setMaxStackSize(1);
        itemMetaqkd16Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd16unlock");
        itemMetaqkd16Unlock.displayName(
                Component.text("乾坤盒☯十六").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd16Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十六").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd16Unlock.setItemMeta(itemMetaqkd16Unlock);

        qkd17Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd17Unlock = qkd17Unlock.getItemMeta();
        itemMetaqkd17Unlock.setMaxStackSize(1);
        itemMetaqkd17Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd17unlock");
        itemMetaqkd17Unlock.displayName(
                Component.text("乾坤盒☯十七").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd17Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十七").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd17Unlock.setItemMeta(itemMetaqkd17Unlock);

        qkd18Unlock.setCustomModelData(1);
        ItemMeta itemMetaqkd18Unlock = qkd18Unlock.getItemMeta();
        itemMetaqkd18Unlock.setMaxStackSize(1);
        itemMetaqkd18Unlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qkd18unlock");
        itemMetaqkd18Unlock.displayName(
                Component.text("乾坤盒☯十八").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetaqkd18Unlock.lore(
                List.of(
                        Component.text("右键解锁乾坤盒☯十八").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        qkd18Unlock.setItemMeta(itemMetaqkd18Unlock);

        hunyuandaiUnlock.setCustomModelData(1);
        ItemMeta itemMetahunyuandaiUnlock = hunyuandaiUnlock.getItemMeta();
        itemMetahunyuandaiUnlock.setMaxStackSize(1);
        itemMetahunyuandaiUnlock.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "hunyuandaiunlock");
        itemMetahunyuandaiUnlock.displayName(
                Component.text("混元袋☯无界").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetahunyuandaiUnlock.lore(
                List.of(
                        Component.text("右键解锁混元袋☯无界").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        hunyuandaiUnlock.setItemMeta(itemMetahunyuandaiUnlock);

        shipincao1.setCustomModelData(1);
        ItemMeta itemMetashipincao1 = shipincao1.getItemMeta();
        itemMetashipincao1.setMaxStackSize(1);
        itemMetashipincao1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao1");
        itemMetashipincao1.displayName(
                Component.text("饰品槽钻孔器[一]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao1.lore(
                List.of(
                        Component.text("右键解锁饰品槽一号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao1.setItemMeta(itemMetashipincao1);

        // 创建2-7的饰品槽钻孔器代码


        shipincao2.setCustomModelData(1);
        ItemMeta itemMetashipincao2 = shipincao2.getItemMeta();
        itemMetashipincao2.setMaxStackSize(1);
        itemMetashipincao2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao2");
        itemMetashipincao2.displayName(
                Component.text("饰品槽钻孔器[二]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao2.lore(
                List.of(
                        Component.text("右键解锁饰品槽二号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao2.setItemMeta(itemMetashipincao2);


        shipincao3.setCustomModelData(1);
        ItemMeta itemMetashipincao3 = shipincao3.getItemMeta();
        itemMetashipincao3.setMaxStackSize(1);
        itemMetashipincao3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao3");
        itemMetashipincao3.displayName(
                Component.text("饰品槽钻孔器[三]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao3.lore(
                List.of(
                        Component.text("右键解锁饰品槽三号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao3.setItemMeta(itemMetashipincao3);

        shipincao4.setCustomModelData(1);
        ItemMeta itemMetashipincao4 = shipincao4.getItemMeta();
        itemMetashipincao4.setMaxStackSize(1);
        itemMetashipincao4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao4");
        itemMetashipincao4.displayName(
                Component.text("饰品槽钻孔器[四]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao4.lore(
                List.of(
                        Component.text("右键解锁饰品槽四号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao4.setItemMeta(itemMetashipincao4);


        shipincao5.setCustomModelData(1);
        ItemMeta itemMetashipincao5 = shipincao5.getItemMeta();
        itemMetashipincao5.setMaxStackSize(1);
        itemMetashipincao5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao5");
        itemMetashipincao5.displayName(
                Component.text("饰品槽钻孔器[五]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao5.lore(
                List.of(
                        Component.text("右键解锁饰品槽五号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao5.setItemMeta(itemMetashipincao5);


        shipincao6.setCustomModelData(1);
        ItemMeta itemMetashipincao6 = shipincao6.getItemMeta();
        itemMetashipincao6.setMaxStackSize(1);
        itemMetashipincao6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao6");
        itemMetashipincao6.displayName(
                Component.text("饰品槽钻孔器[六]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao6.lore(
                List.of(
                        Component.text("右键解锁饰品槽六号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao6.setItemMeta(itemMetashipincao6);


        shipincao7.setCustomModelData(1);
        ItemMeta itemMetashipincao7 = shipincao7.getItemMeta();
        itemMetashipincao7.setMaxStackSize(1);
        itemMetashipincao7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao7");
        itemMetashipincao7.displayName(
                Component.text("饰品槽钻孔器[七]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao7.lore(
                List.of(
                        Component.text("右键解锁饰品槽七号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao7.setItemMeta(itemMetashipincao7);

        shipincao8.setCustomModelData(1);
        ItemMeta itemMetashipincao8 = shipincao8.getItemMeta();
        itemMetashipincao8.setMaxStackSize(1);
        itemMetashipincao8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shipincao8");
        itemMetashipincao8.displayName(
                Component.text("饰品槽钻孔器[八]").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetashipincao8.lore(
                List.of(
                        Component.text("右键解锁饰品槽八号槽位").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        shipincao8.setItemMeta(itemMetashipincao8);

        chonghua2.setCustomModelData(1);
        ItemMeta itemMetachonghua2 = chonghua2.getItemMeta();
        itemMetachonghua2.setMaxStackSize(1);
        itemMetachonghua2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua2");
        itemMetachonghua2.displayName(
                Component.text("二阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua2.lore(
                List.of(
                        Component.text("右键升级为2阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低30s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua2.setItemMeta(itemMetachonghua2);

        // 3阶重华晶
        chonghua3.setCustomModelData(1);
        ItemMeta itemMetachonghua3 = chonghua3.getItemMeta();
        itemMetachonghua3.setMaxStackSize(1);
        itemMetachonghua3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua3");
        itemMetachonghua3.displayName(
                Component.text("三阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua3.lore(
                List.of(
                        Component.text("右键升级为3阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低60s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua3.setItemMeta(itemMetachonghua3);

// 4阶重华晶
        chonghua4.setCustomModelData(1);
        ItemMeta itemMetachonghua4 = chonghua4.getItemMeta();
        itemMetachonghua4.setMaxStackSize(1);
        itemMetachonghua4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua4");
        itemMetachonghua4.displayName(
                Component.text("四阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua4.lore(
                List.of(
                        Component.text("右键升级为4阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低90s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua4.setItemMeta(itemMetachonghua4);

// 5阶重华晶
        chonghua5.setCustomModelData(1);
        ItemMeta itemMetachonghua5 = chonghua5.getItemMeta();
        itemMetachonghua5.setMaxStackSize(1);
        itemMetachonghua5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua5");
        itemMetachonghua5.displayName(
                Component.text("五阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua5.lore(
                List.of(
                        Component.text("右键升级为5阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低120s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua5.setItemMeta(itemMetachonghua5);

// 6阶重华晶
        chonghua6.setCustomModelData(1);
        ItemMeta itemMetachonghua6 = chonghua6.getItemMeta();
        itemMetachonghua6.setMaxStackSize(1);
        itemMetachonghua6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua6");
        itemMetachonghua6.displayName(
                Component.text("六阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua6.lore(
                List.of(
                        Component.text("右键升级为6阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低150s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua6.setItemMeta(itemMetachonghua6);

// 7阶重华晶
        chonghua7.setCustomModelData(1);
        ItemMeta itemMetachonghua7 = chonghua7.getItemMeta();
        itemMetachonghua7.setMaxStackSize(1);
        itemMetachonghua7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua7");
        itemMetachonghua7.displayName(
                Component.text("七阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua7.lore(
                List.of(
                        Component.text("右键升级为7阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低180s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua7.setItemMeta(itemMetachonghua7);

// 8阶重华晶
        chonghua8.setCustomModelData(1);
        ItemMeta itemMetachonghua8 = chonghua8.getItemMeta();
        itemMetachonghua8.setMaxStackSize(1);
        itemMetachonghua8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua8");
        itemMetachonghua8.displayName(
                Component.text("八阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua8.lore(
                List.of(
                        Component.text("右键升级为8阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低210s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua8.setItemMeta(itemMetachonghua8);

// 9阶重华晶
        chonghua9.setCustomModelData(1);
        ItemMeta itemMetachonghua9 = chonghua9.getItemMeta();
        itemMetachonghua9.setMaxStackSize(1);
        itemMetachonghua9.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua9");
        itemMetachonghua9.displayName(
                Component.text("九阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua9.lore(
                List.of(
                        Component.text("右键升级为9阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低240s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua9.setItemMeta(itemMetachonghua9);

// 10阶重华晶
        chonghua10.setCustomModelData(1);
        ItemMeta itemMetachonghua10 = chonghua10.getItemMeta();
        itemMetachonghua10.setMaxStackSize(1);
        itemMetachonghua10.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua10");
        itemMetachonghua10.displayName(
                Component.text("十阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua10.lore(
                List.of(
                        Component.text("右键升级为10阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("冷却时间降低270s").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua10.setItemMeta(itemMetachonghua10);

// 11阶重华晶
        chonghua11.setCustomModelData(1);
        ItemMeta itemMetachonghua11 = chonghua11.getItemMeta();
        itemMetachonghua11.setMaxStackSize(1);
        itemMetachonghua11.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chonghua11");
        itemMetachonghua11.displayName(
                Component.text("十一阶重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        itemMetachonghua11.lore(
                List.of(
                        Component.text("右键升级为11阶重华晶").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true),
                        Component.text("无冷却").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        chonghua11.setItemMeta(itemMetachonghua11);

        BanHeYueBin.setCustomModelData(2);
        ItemMeta itemMeta17 = BanHeYueBin.getItemMeta();
        itemMeta17.setMaxStackSize(1);
        itemMeta17.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "banheyuebin");
        itemMeta17.displayName(
                Component.text("半盒月饼").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta17.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("打开获得随机6种月饼").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        BanHeYueBin.setItemMeta(itemMeta17);

        YiHeYueBin.setCustomModelData(3);
        ItemMeta itemMeta18 = YiHeYueBin.getItemMeta();
        itemMeta18.setMaxStackSize(1);
        itemMeta18.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yiheyuebin");
        itemMeta18.displayName(
                Component.text("一盒月饼").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta18.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("打开获得随机12种月饼").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        YiHeYueBin.setItemMeta(itemMeta18);
    }
}
