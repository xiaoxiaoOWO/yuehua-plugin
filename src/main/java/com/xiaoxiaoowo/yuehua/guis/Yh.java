package com.xiaoxiaoowo.yuehua.guis;

import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.items.monsterzhuangbei.Weapon;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.items.other.FuBen;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.YiQi;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public final class Yh implements CommandExecutor {
    public static final Inventory MAIN_MENU = Bukkit.createInventory(null, 54,
            Component.text("主菜单").color(NamedTextColor.AQUA));
    public static final Inventory QIAN_KUN_BAG = Bukkit.createInventory(null, 27,
            Component.text("乾坤盒").color(NamedTextColor.AQUA));
    public static final Inventory CHONG_HUA = Bukkit.createInventory(null, 36,
            Component.text("重华晶").color(NamedTextColor.AQUA));
    public static final Inventory ZA_XIANG = Bukkit.createInventory(null, 18,
            Component.text("杂项").color(NamedTextColor.AQUA));

    public static final ItemStack BACK_BEFORE = new ItemStack(Material.YELLOW_DYE);
    public static final ItemStack TO_NEXT = new ItemStack(Material.YELLOW_DYE);

    public static final ItemStack NO = new ItemStack(Material.YELLOW_DYE);
    public static final ItemStack CHONG_HUA_JING = new ItemStack(Material.YELLOW_DYE);


    static {
        ItemStack itemStack1 = new ItemStack(Material.BLUE_DYE);
        itemStack1.setCustomModelData(1);
        ItemMeta itemMeta1 = itemStack1.getItemMeta();
        itemMeta1.displayName(
                Component
                        .text("乾坤盒").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore1 = new ArrayList<>();
        lore1.add(
                Component
                        .text("可以容纳大量物品，需要逐步开启").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta1.lore(lore1);
        itemStack1.setItemMeta(itemMeta1);
        MAIN_MENU.setItem(0, itemStack1);

        ItemStack itemStack2 = new ItemStack(Material.BLUE_DYE);
        itemStack2.setCustomModelData(2);
        ItemMeta itemMeta2 = itemStack2.getItemMeta();
        itemMeta2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 1);
        itemMeta2.displayName(
                Component.text("乾坤盒☯一").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore2 = new ArrayList<>();
        lore2.add(
                Component.text("获取方式:织布坊").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta2.lore(lore2);
        itemStack2.setItemMeta(itemMeta2);
        QIAN_KUN_BAG.setItem(0, itemStack2);

        ItemStack itemStack3 = new ItemStack(Material.BLUE_DYE);
        itemStack3.setCustomModelData(3);
        ItemMeta itemMeta3 = itemStack3.getItemMeta();
        itemMeta3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 2);
        itemMeta3.displayName(
                Component
                        .text("乾坤盒☯二").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore3 = new ArrayList<>();
        lore3.add(
                Component
                        .text("获取方式:织布坊").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta3.lore(lore3);
        itemStack3.setItemMeta(itemMeta3);
        QIAN_KUN_BAG.setItem(1, itemStack3);

        ItemStack itemStack4 = new ItemStack(Material.BLUE_DYE);
        itemStack4.setCustomModelData(4);
        ItemMeta itemMeta4 = itemStack4.getItemMeta();
        itemMeta4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 3);
        itemMeta4.displayName(
                Component
                        .text("乾坤盒☯三").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore4 = new ArrayList<>();
        lore4.add(
                Component
                        .text("获取方式:织布坊").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta4.lore(lore4);
        itemStack4.setItemMeta(itemMeta4);
        QIAN_KUN_BAG.setItem(2, itemStack4);

        ItemStack itemStack5 = new ItemStack(Material.BLUE_DYE);
        itemStack5.setCustomModelData(5);
        ItemMeta itemMeta5 = itemStack5.getItemMeta();
        itemMeta5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 4);
        itemMeta5.displayName(
                Component
                        .text("乾坤盒☯四").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore5 = new ArrayList<>();
        lore5.add(
                Component
                        .text("获取方式:织布坊").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta5.lore(lore5);
        itemStack5.setItemMeta(itemMeta5);
        QIAN_KUN_BAG.setItem(3, itemStack5);

        ItemStack itemStack6 = new ItemStack(Material.BLUE_DYE);
        itemStack6.setCustomModelData(6);
        ItemMeta itemMeta6 = itemStack6.getItemMeta();
        itemMeta6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 5);
        itemMeta6.displayName(
                Component
                        .text("乾坤盒☯五").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore6 = new ArrayList<>();
        lore6.add(
                Component
                        .text("获取方式:等级100").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta6.lore(lore6);
        itemStack6.setItemMeta(itemMeta6);
        QIAN_KUN_BAG.setItem(4, itemStack6);

        ItemStack itemStack7 = new ItemStack(Material.BLUE_DYE);
        itemStack7.setCustomModelData(7);
        ItemMeta itemMeta7 = itemStack7.getItemMeta();
        itemMeta7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 6);
        itemMeta7.displayName(
                Component
                        .text("乾坤盒☯六").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        List<Component> lore7 = new ArrayList<>();
        lore7.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta7.lore(lore7);
        itemStack7.setItemMeta(itemMeta7);
        QIAN_KUN_BAG.setItem(5, itemStack7);

        ItemStack itemStack8 = new ItemStack(Material.BLUE_DYE);
        itemStack8.setCustomModelData(8);
        ItemMeta itemMeta8 = itemStack8.getItemMeta();
        itemMeta8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 7);
        itemMeta8.displayName(
                Component
                        .text("乾坤盒☯七").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore8 = new ArrayList<>();
        lore8.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta8.lore(lore8);

        itemStack8.setItemMeta(itemMeta8);
        QIAN_KUN_BAG.setItem(6, itemStack8);

        ItemStack itemStack9 = new ItemStack(Material.BLUE_DYE);
        itemStack9.setCustomModelData(9);
        ItemMeta itemMeta9 = itemStack9.getItemMeta();
        itemMeta9.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 8);
        itemMeta9.displayName(
                Component
                        .text("乾坤盒☯八").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore9 = new ArrayList<>();
        lore9.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta9.lore(lore9);
        itemStack9.setItemMeta(itemMeta9);
        QIAN_KUN_BAG.setItem(7, itemStack9);

        ItemStack itemStack10 = new ItemStack(Material.BLUE_DYE);
        itemStack10.setCustomModelData(10);
        ItemMeta itemMeta10 = itemStack10.getItemMeta();
        itemMeta10.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 9);
        itemMeta10.displayName(
                Component
                        .text("乾坤盒☯九").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> lore10 = new ArrayList<>();
        lore10.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        itemMeta10.lore(lore10);
        itemStack10.setItemMeta(itemMeta10);
        QIAN_KUN_BAG.setItem(8, itemStack10);

        ItemStack QINKUNHE10 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE10.setCustomModelData(11);
        ItemMeta QINKUNHE10Meta = QINKUNHE10.getItemMeta();
        QINKUNHE10Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 10);
        QINKUNHE10Meta.displayName(
                Component
                        .text("乾坤盒☯十").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE10Lore = new ArrayList<>();
        QINKUNHE10Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE10Meta.lore(QINKUNHE10Lore);
        QINKUNHE10.setItemMeta(QINKUNHE10Meta);
        QIAN_KUN_BAG.setItem(9, QINKUNHE10);

        ItemStack QINKUNHE11 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE11.setCustomModelData(12);
        ItemMeta QINKUNHE11Meta = QINKUNHE11.getItemMeta();
        QINKUNHE11Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 11);
        QINKUNHE11Meta.displayName(
                Component
                        .text("乾坤盒☯十一").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE11Lore = new ArrayList<>();
        QINKUNHE11Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE11Meta.lore(QINKUNHE11Lore);
        QINKUNHE11.setItemMeta(QINKUNHE11Meta);
        QIAN_KUN_BAG.setItem(10, QINKUNHE11);

        ItemStack QINKUNHE12 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE12.setCustomModelData(13);
        ItemMeta QINKUNHE12Meta = QINKUNHE12.getItemMeta();
        QINKUNHE12Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 12);
        QINKUNHE12Meta.displayName(
                Component
                        .text("乾坤盒☯十二").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE12Lore = new ArrayList<>();
        QINKUNHE12Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE12Meta.lore(QINKUNHE12Lore);
        QINKUNHE12.setItemMeta(QINKUNHE12Meta);
        QIAN_KUN_BAG.setItem(11, QINKUNHE12);

        ItemStack QINKUNHE13 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE13.setCustomModelData(14);
        ItemMeta QINKUNHE13Meta = QINKUNHE13.getItemMeta();
        QINKUNHE13Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 13);
        QINKUNHE13Meta.displayName(
                Component
                        .text("乾坤盒☯十三").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE13Lore = new ArrayList<>();
        QINKUNHE13Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE13Meta.lore(QINKUNHE13Lore);
        QINKUNHE13.setItemMeta(QINKUNHE13Meta);
        QIAN_KUN_BAG.setItem(12, QINKUNHE13);

        ItemStack QINKUNHE14 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE14.setCustomModelData(15);
        ItemMeta QINKUNHE14Meta = QINKUNHE14.getItemMeta();
        QINKUNHE14Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 14);
        QINKUNHE14Meta.displayName(
                Component
                        .text("乾坤盒☯十四").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE14Lore = new ArrayList<>();
        QINKUNHE14Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE14Meta.lore(QINKUNHE14Lore);
        QINKUNHE14.setItemMeta(QINKUNHE14Meta);
        QIAN_KUN_BAG.setItem(13, QINKUNHE14);

        ItemStack QINKUNHE15 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE15.setCustomModelData(16);
        ItemMeta QINKUNHE15Meta = QINKUNHE15.getItemMeta();
        QINKUNHE15Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 15);
        QINKUNHE15Meta.displayName(
                Component
                        .text("乾坤盒☯十五").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE15Lore = new ArrayList<>();
        QINKUNHE15Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE15Meta.lore(QINKUNHE15Lore);
        QINKUNHE15.setItemMeta(QINKUNHE15Meta);
        QIAN_KUN_BAG.setItem(14, QINKUNHE15);

        ItemStack QINKUNHE16 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE16.setCustomModelData(17);
        ItemMeta QINKUNHE16Meta = QINKUNHE16.getItemMeta();
        QINKUNHE16Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 16);
        QINKUNHE16Meta.displayName(
                Component
                        .text("乾坤盒☯十六").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE16Lore = new ArrayList<>();
        QINKUNHE16Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE16Meta.lore(QINKUNHE16Lore);
        QINKUNHE16.setItemMeta(QINKUNHE16Meta);
        QIAN_KUN_BAG.setItem(15, QINKUNHE16);

        ItemStack QINKUNHE17 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE17.setCustomModelData(18);
        ItemMeta QINKUNHE17Meta = QINKUNHE17.getItemMeta();
        QINKUNHE17Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 17);
        QINKUNHE17Meta.displayName(
                Component
                        .text("乾坤盒☯十七").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE17Lore = new ArrayList<>();
        QINKUNHE17Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE17Meta.lore(QINKUNHE17Lore);
        QINKUNHE17.setItemMeta(QINKUNHE17Meta);
        QIAN_KUN_BAG.setItem(16, QINKUNHE17);

        ItemStack QINKUNHE18 = new ItemStack(Material.BLUE_DYE);
        QINKUNHE18.setCustomModelData(19);
        ItemMeta QINKUNHE18Meta = QINKUNHE18.getItemMeta();
        QINKUNHE18Meta.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.INTEGER, 18);
        QINKUNHE18Meta.displayName(
                Component
                        .text("乾坤盒☯十八").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        List<Component> QINKUNHE18Lore = new ArrayList<>();
        QINKUNHE18Lore.add(
                Component
                        .text("获取方式:使用解锁道具").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
        );
        QINKUNHE18Meta.lore(QINKUNHE18Lore);
        QINKUNHE18.setItemMeta(QINKUNHE18Meta);
        QIAN_KUN_BAG.setItem(17, QINKUNHE18);


        ItemMeta itemMeta11 = BACK_BEFORE.getItemMeta();
        itemMeta11.setCustomModelData(1);
        itemMeta11.displayName(
                Component
                        .text("返回上一页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        BACK_BEFORE.setItemMeta(itemMeta11);
        QIAN_KUN_BAG.setItem(26, BACK_BEFORE);

        ItemStack itemStack12 = new ItemStack(Material.YELLOW_DYE);
        itemStack12.setCustomModelData(4);
        ItemMeta itemMeta12 = itemStack12.getItemMeta();
        itemMeta12.displayName(
                Component
                        .text("开启/关闭TPS显示").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack12.setItemMeta(itemMeta12);
        ZA_XIANG.setItem(0, itemStack12);

        ItemStack itemStack13 = new ItemStack(Material.YELLOW_DYE);
        itemStack13.setCustomModelData(3);
        ItemMeta itemMeta13 = itemStack13.getItemMeta();
        itemMeta13.displayName(
                Component
                        .text("开启/关闭内存显示").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack13.setItemMeta(itemMeta13);
        ZA_XIANG.setItem(1, itemStack13);

        ItemStack itemStack14 = new ItemStack(Material.YELLOW_DYE);
        itemStack14.setCustomModelData(6);
        ItemMeta itemMeta14 = itemStack14.getItemMeta();
        itemMeta14.displayName(
                Component
                        .text("开启/关闭夜视").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack14.setItemMeta(itemMeta14);
        ZA_XIANG.setItem(2, itemStack14);

        ItemStack itemStack15 = new ItemStack(Material.YELLOW_DYE);
        itemStack15.setCustomModelData(5);
        ItemMeta itemMeta15 = itemStack15.getItemMeta();
        itemMeta15.displayName(
                Component
                        .text("饰品槽").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta15.lore(
                List.of(
                        Component
                                .text("需逐步开启").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        itemStack15.setItemMeta(itemMeta15);
        MAIN_MENU.setItem(2, itemStack15);

        NO.setCustomModelData(2);
        ItemMeta itemMeta16 = NO.getItemMeta();
        itemMeta16.displayName(
                Component
                        .text("此槽位未开启").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta16.lore(
                List.of(
                        Component
                                .text("开启条件：见明珠堂").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );

        NO.setItemMeta(itemMeta16);

        CHONG_HUA_JING.setCustomModelData(7);
        ItemMeta itemMeta17 = CHONG_HUA_JING.getItemMeta();
        itemMeta17.displayName(
                Component
                        .text("重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta17.lore(
                List.of(
                        Component
                                .text("便捷传送").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("需要先在地点附近使用一次重华晶标记").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("之后便可传送").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("初始等级为1，CD为5分钟").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        CHONG_HUA_JING.setItemMeta(itemMeta17);
        MAIN_MENU.setItem(4, CHONG_HUA_JING);

        ItemStack checkChonghua = new ItemStack(Material.YELLOW_DYE);
        checkChonghua.setCustomModelData(7);
        ItemMeta checkChonghuaMeta = checkChonghua.getItemMeta();
        checkChonghuaMeta.displayName(
                Component
                        .text("查询重华晶等级").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        checkChonghua.setItemMeta(checkChonghuaMeta);
        CHONG_HUA.setItem(27, checkChonghua);

        ItemStack itemStack18 = new ItemStack(Material.YELLOW_DYE);
        itemStack18.setCustomModelData(7);
        ItemMeta itemMeta18 = itemStack18.getItemMeta();
        itemMeta18.displayName(
                Component
                        .text("皇城中心").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack18.setItemMeta(itemMeta18);
        CHONG_HUA.setItem(0, itemStack18);

        ItemStack itemStack19 = new ItemStack(Material.YELLOW_DYE);
        itemStack19.setCustomModelData(7);
        ItemMeta itemMeta19 = itemStack19.getItemMeta();
        itemMeta19.displayName(
                Component
                        .text("龙须镇").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack19.setItemMeta(itemMeta19);
        CHONG_HUA.setItem(1, itemStack19);

        ItemStack itemStack20 = new ItemStack(Material.YELLOW_DYE);
        itemStack20.setCustomModelData(7);
        ItemMeta itemMeta20 = itemStack20.getItemMeta();
        itemMeta20.displayName(
                Component
                        .text("山神庙").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack20.setItemMeta(itemMeta20);
        CHONG_HUA.setItem(2, itemStack20);

        ItemStack itemStack21 = new ItemStack(Material.YELLOW_DYE);
        itemStack21.setCustomModelData(7);
        ItemMeta itemMeta21 = itemStack21.getItemMeta();
        itemMeta21.displayName(
                Component
                        .text("青龙祭坛入口").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack21.setItemMeta(itemMeta21);
        CHONG_HUA.setItem(3, itemStack21);


        ItemStack itemStack22 = new ItemStack(Material.YELLOW_DYE);
        itemStack22.setCustomModelData(7);
        ItemMeta itemMeta22 = itemStack22.getItemMeta();
        itemMeta22.displayName(
                Component
                        .text("沙漠客栈").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack22.setItemMeta(itemMeta22);
        CHONG_HUA.setItem(4, itemStack22);

        ItemStack itemStack23 = new ItemStack(Material.YELLOW_DYE);
        itemStack23.setCustomModelData(7);
        ItemMeta itemMeta23 = itemStack23.getItemMeta();
        itemMeta23.displayName(
                Component
                        .text("沙漠村庄").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack23.setItemMeta(itemMeta23);
        CHONG_HUA.setItem(5, itemStack23);

        ItemStack itemStack24 = new ItemStack(Material.YELLOW_DYE);
        itemStack24.setCustomModelData(7);
        ItemMeta itemMeta24 = itemStack24.getItemMeta();
        itemMeta24.displayName(
                Component
                        .text("朱雀祭坛入口").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack24.setItemMeta(itemMeta24);
        CHONG_HUA.setItem(6, itemStack24);

        ItemStack itemStack25 = new ItemStack(Material.YELLOW_DYE);
        itemStack25.setCustomModelData(7);
        ItemMeta itemMeta25 = itemStack25.getItemMeta();
        itemMeta25.displayName(
                Component
                        .text("陈大夫").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack25.setItemMeta(itemMeta25);
        CHONG_HUA.setItem(7, itemStack25);

        ItemStack itemStack26 = new ItemStack(Material.YELLOW_DYE);
        itemStack26.setCustomModelData(7);
        ItemMeta itemMeta26 = itemStack26.getItemMeta();
        itemMeta26.displayName(
                Component
                        .text("山洞村庄").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack26.setItemMeta(itemMeta26);
        CHONG_HUA.setItem(8, itemStack26);

        ItemStack itemStack27 = new ItemStack(Material.YELLOW_DYE);
        itemStack27.setCustomModelData(7);
        ItemMeta itemMeta27 = itemStack27.getItemMeta();
        itemMeta27.displayName(
                Component
                        .text("白虎祭坛入口").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack27.setItemMeta(itemMeta27);
        CHONG_HUA.setItem(9, itemStack27);

        ItemStack itemStack28 = new ItemStack(Material.YELLOW_DYE);
        itemStack28.setCustomModelData(7);
        ItemMeta itemMeta28 = itemStack28.getItemMeta();
        itemMeta28.displayName(
                Component
                        .text("水族村庄").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack28.setItemMeta(itemMeta28);
        CHONG_HUA.setItem(10, itemStack28);

        ItemStack itemStack29 = new ItemStack(Material.YELLOW_DYE);
        itemStack29.setCustomModelData(7);
        ItemMeta itemMeta29 = itemStack29.getItemMeta();
        itemMeta29.displayName(
                Component
                        .text("蓬莱渡口").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack29.setItemMeta(itemMeta29);
        CHONG_HUA.setItem(11, itemStack29);

        ItemStack itemStack30 = new ItemStack(Material.YELLOW_DYE);
        itemStack30.setCustomModelData(7);
        ItemMeta itemMeta30 = itemStack30.getItemMeta();
        itemMeta30.displayName(
                Component
                        .text("玄武祭坛入口").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack30.setItemMeta(itemMeta30);
        CHONG_HUA.setItem(12, itemStack30);

        ItemStack itemStack31 = new ItemStack(Material.YELLOW_DYE);
        itemStack31.setCustomModelData(7);
        ItemMeta itemMeta31 = itemStack31.getItemMeta();
        itemMeta31.displayName(
                Component
                        .text("古墓").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack31.setItemMeta(itemMeta31);
        CHONG_HUA.setItem(13, itemStack31);

        ItemStack itemStack32 = new ItemStack(Material.YELLOW_DYE);
        itemStack32.setCustomModelData(7);
        ItemMeta itemMeta32 = itemStack32.getItemMeta();
        itemMeta32.displayName(
                Component
                        .text("火焰魔王巢穴").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack32.setItemMeta(itemMeta32);
        CHONG_HUA.setItem(14, itemStack32);

        ItemStack itemStack33 = new ItemStack(Material.YELLOW_DYE);
        itemStack33.setCustomModelData(7);
        ItemMeta itemMeta33 = itemStack33.getItemMeta();
        itemMeta33.displayName(
                Component
                        .text("镇妖塔").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack33.setItemMeta(itemMeta33);
        CHONG_HUA.setItem(15, itemStack33);

        ItemStack itemStack34 = new ItemStack(Material.YELLOW_DYE);
        itemStack34.setCustomModelData(7);
        ItemMeta itemMeta34 = itemStack34.getItemMeta();
        itemMeta34.displayName(
                Component
                        .text("哭声回荡的山谷").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack34.setItemMeta(itemMeta34);
        CHONG_HUA.setItem(16, itemStack34);

        ItemStack itemStack35 = new ItemStack(Material.YELLOW_DYE);
        itemStack35.setCustomModelData(7);
        ItemMeta itemMeta35 = itemStack35.getItemMeta();
        itemMeta35.displayName(
                Component
                        .text("圣山").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemStack35.setItemMeta(itemMeta35);
        CHONG_HUA.setItem(17, itemStack35);

        CHONG_HUA.setItem(35, BACK_BEFORE);

        ItemStack quanqiushichang = new ItemStack(Material.YELLOW_DYE);
        quanqiushichang.setCustomModelData(8);
        ItemMeta itemMeta36 = quanqiushichang.getItemMeta();
        itemMeta36.displayName(
                Component
                        .text("月华市场").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta36.lore(
                List.of(
                        Component.text("月华市场是一个全服性的交易市场,使用规则如下：").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("主手手持要出售的物品，输入sell指令即可出售物品").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("指令格式：/sell <金额> <数量>").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("上架商品扣取1%的税费，至少收取1铜钱").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("上架大量垃圾或价格过高的商品占用市场空间将被管理员惩罚").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC),
                        Component.text("对他人上架的商品点击即可购买").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        quanqiushichang.setItemMeta(itemMeta36);
        MAIN_MENU.setItem(3, quanqiushichang);

        ItemStack playerInfo = new ItemStack(Material.YELLOW_DYE);
        playerInfo.setCustomModelData(9);
        ItemMeta itemMeta37 = playerInfo.getItemMeta();
        itemMeta37.displayName(
                Component
                        .text("属性查询").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        playerInfo.setItemMeta(itemMeta37);
        MAIN_MENU.setItem(15, playerInfo);

        TO_NEXT.setCustomModelData(10);
        ItemMeta itemMeta38 = TO_NEXT.getItemMeta();
        itemMeta38.displayName(
                Component
                        .text("前往下一页").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        TO_NEXT.setItemMeta(itemMeta38);


        ItemStack zaxiang = new ItemStack(Material.YELLOW_DYE);
        zaxiang.setCustomModelData(11);
        ItemMeta itemMeta139 = zaxiang.getItemMeta();
        itemMeta139.displayName(
                Component
                        .text("杂项").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        zaxiang.setItemMeta(itemMeta139);
        MAIN_MENU.setItem(53, zaxiang);

        ItemStack book_mainTask = new ItemStack(Material.YELLOW_DYE);
        book_mainTask.setCustomModelData(12);
        ItemMeta itemMeta141 = book_mainTask.getItemMeta();
        itemMeta141.displayName(
                Component
                        .text("探索任务").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        book_mainTask.setItemMeta(itemMeta141);
        MAIN_MENU.setItem(12, book_mainTask);

        ItemStack shiguang = new ItemStack(Material.CLOCK);
        shiguang.editMeta(meta -> {
            meta.displayName(Component.text("时光之礼").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
            meta.lore(
                    List.of(
                            Component.text("你在月华之前周目的游玩成果，将会以时光之礼的形式回馈").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                    )
            );

        });
        MAIN_MENU.setItem(52, shiguang);

        ItemStack book_xuanShang = new ItemStack(Material.YELLOW_DYE);
        book_xuanShang.setCustomModelData(12);
        ItemMeta itemMeta142 = book_xuanShang.getItemMeta();
        itemMeta142.displayName(
                Component
                        .text("悬赏任务").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMeta142.lore(
                List.of(
                        Component.text("需要在悬赏局——悬赏局局长处接取任务").color(NamedTextColor.GRAY).decorate(TextDecoration.ITALIC)
                )
        );
        book_xuanShang.setItemMeta(itemMeta142);
        MAIN_MENU.setItem(13, book_xuanShang);


        ItemStack book_yuehua = new ItemStack(Material.YELLOW_DYE);
        book_yuehua.setCustomModelData(12);
        ItemMeta itemMeta40 = book_yuehua.getItemMeta();
        itemMeta40.displayName(
                Component
                        .text("重新获取书籍——新手指引").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        book_yuehua.setItemMeta(itemMeta40);
        ZA_XIANG.setItem(8, book_yuehua);

        ItemStack book_shuxing = new ItemStack(Material.YELLOW_DYE);
        book_shuxing.setCustomModelData(12);
        ItemMeta itemMetashuxing = book_shuxing.getItemMeta();
        itemMetashuxing.displayName(
                Component
                        .text("重新获取书籍——属性与战斗机制介绍").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        book_shuxing.setItemMeta(itemMetashuxing);
        ZA_XIANG.setItem(9, book_shuxing);

        ItemStack book_neirong = new ItemStack(Material.YELLOW_DYE);
        book_neirong.setCustomModelData(12);
        ItemMeta itemMetaneirong = book_neirong.getItemMeta();
        itemMetaneirong.displayName(
                Component
                        .text("重新获取书籍——基本游戏内容介绍").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        book_neirong.setItemMeta(itemMetaneirong);
        ZA_XIANG.setItem(10, book_neirong);

        ItemStack book_wanfa = new ItemStack(Material.YELLOW_DYE);
        book_wanfa.setCustomModelData(12);
        ItemMeta itemMeta43 = book_wanfa.getItemMeta();
        itemMeta43.displayName(
                Component
                        .text("重新获取书籍——特殊玩法介绍").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        book_wanfa.setItemMeta(itemMeta43);
        ZA_XIANG.setItem(11, book_wanfa);

        ItemStack book_jinji = new ItemStack(Material.YELLOW_DYE);
        book_jinji.setCustomModelData(12);
        ItemMeta itemMeta44 = book_jinji.getItemMeta();
        itemMeta44.displayName(
                Component
                        .text("重新获取书籍——服务器禁忌/规则").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        book_jinji.setItemMeta(itemMeta44);
        ZA_XIANG.setItem(12, book_jinji);


        ItemStack paopao = new ItemStack(Material.YELLOW_DYE);
        paopao.setCustomModelData(13);
        ItemMeta itemMeta41 = paopao.getItemMeta();
        itemMeta41.displayName(
                Component
                        .text("领取NPC兑换泡泡").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        paopao.setItemMeta(itemMeta41);
        ZA_XIANG.setItem(6, paopao);

        ItemStack zhengming = new ItemStack(Material.YELLOW_DYE);
        zhengming.setCustomModelData(14);
        ItemMeta itemMeta42 = zhengming.getItemMeta();
        itemMeta42.displayName(
                Component
                        .text("领取种族证明").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        zhengming.setItemMeta(itemMeta42);
        ZA_XIANG.setItem(7, zhengming);

//        ItemStack chonghuaOp = new ItemStack(Material.YELLOW_DYE);
//        ItemMeta chonghuaOpMeta = chonghuaOp.getItemMeta();
//        chonghuaOpMeta.setCustomModelData(7);
//        chonghuaOpMeta.displayName(
//                Component
//                        .text("OP重华晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC,false).decoration(TextDecoration.BOLD,true)
//        );
//        chonghuaOp.setItemMeta(chonghuaOpMeta);
//
//        MAIN_MENU.setItem(52,chonghuaOp);
        ZA_XIANG.setItem(17, BACK_BEFORE);

        ItemStack killYourSelf = new ItemStack(Material.POTION);
        ItemMeta itemMetaKill = killYourSelf.getItemMeta();
        PotionMeta potionMeta = (PotionMeta) itemMetaKill;
        potionMeta.setColor(Color.BLACK);
        potionMeta.displayName(
                Component.text("鹤顶红").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        potionMeta.lore(
                List.of(
                        Component.text("点击自杀").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
                )
        );
        potionMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        killYourSelf.setItemMeta(potionMeta);
        MAIN_MENU.setItem(45, killYourSelf);

        ItemStack oneStepBank = YuanSu.jin.clone();
        ItemMeta itemMetaBank = oneStepBank.getItemMeta();
        itemMetaBank.displayName(
                Component.text("便捷存储").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMetaBank.lore(
                List.of(
                        Component.text("点击存储背包内所有的元素和货币").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
                )
        );
        oneStepBank.setItemMeta(itemMetaBank);
        MAIN_MENU.setItem(5, oneStepBank);

        ItemStack realBank = YuanSu.bagging_jin.clone();
        ItemMeta itemMetaRealBank = realBank.getItemMeta();
        itemMetaRealBank.displayName(
                Component.text("元素银行").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        realBank.setItemMeta(itemMetaRealBank);
        MAIN_MENU.setItem(6, realBank);

        ItemStack money = Money.yinPiao.clone();
        ItemMeta itemMetaMoney = money.getItemMeta();
        itemMetaMoney.displayName(
                Component.text("金钱银行").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        money.setItemMeta(itemMetaMoney);
        MAIN_MENU.setItem(7, money);

        ItemStack arrow = YiQi.NIEPANYUNANG.clone();
        ItemMeta itemMetaArrow = arrow.getItemMeta();
        itemMetaArrow.displayName(
                Component.text("箭袋").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMetaArrow.lore(
                List.of(

                )
        );
        arrow.setItemMeta(itemMetaArrow);
        MAIN_MENU.setItem(9, arrow);
        MAIN_MENU.setItem(8, arrow);

        ItemStack shardInventory = new ItemStack(Material.BLUE_DYE);
        ItemMeta itemMetaShard = shardInventory.getItemMeta();
        itemMetaShard.setCustomModelData(20);
        itemMetaShard.displayName(
                Component.text("混元袋☯无界").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMetaShard.lore(
                List.of(
                        Component.text("解锁后方可打开").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false),
                        Component.text("当你处于一个小队中时，将打开队长的混元袋").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false),
                        Component.text("若你则是队长，则将打开自己的混元袋").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
                )
        );
        shardInventory.setItemMeta(itemMetaShard);

        ItemStack chengjiuPoint = new ItemStack(Material.YELLOW_DYE);
        ItemMeta chengjiuMeta = chengjiuPoint.getItemMeta();
        chengjiuMeta.setCustomModelData(19);
        chengjiuMeta.displayName(
                Component.text("成就点数查询").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        chengjiuMeta.lore(
                List.of(
                        Component.text("点击查看你的成就点数").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
                )
        );
        chengjiuPoint.setItemMeta(chengjiuMeta);
        MAIN_MENU.setItem(16, chengjiuPoint);

        ItemStack fubenCount = FuBen.keyJin.clone();
        ItemMeta fubenMeta = fubenCount.getItemMeta();
        fubenMeta.displayName(
                Component.text("副本次数查询").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        fubenMeta.lore(
                List.of(
                        Component.text("点击查看你的副本通关次数").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
                )
        );
        fubenCount.setItemMeta(fubenMeta);
        MAIN_MENU.setItem(17, fubenCount);


        MAIN_MENU.setItem(1, shardInventory);

        ItemStack recipe = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookMeta = (BookMeta) recipe.getItemMeta();
        bookMeta.setTitle(
                "§b锻造配方"
        );
        bookMeta.setAuthor(
                "§7§o神秘的锻造大师"
        );
        recipe.setItemMeta(bookMeta);
        MAIN_MENU.setItem(9, recipe);

        ItemStack recipeDan = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookMeta1 = (BookMeta) recipeDan.getItemMeta();
        bookMeta1.setTitle(
                "§b丹药配方"
        );
        bookMeta1.setAuthor(
                "§7§o不知名炼丹师"
        );
        recipeDan.setItemMeta(bookMeta1);
        MAIN_MENU.setItem(10, recipeDan);

        ItemStack recipeDanDan = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookMeta2 = (BookMeta) recipeDanDan.getItemMeta();
        bookMeta2.setTitle(
                "§b丹药配方[仅炼丹]"
        );
        bookMeta2.setAuthor(
                "§7§o某知名炼丹师"
        );
        recipeDanDan.setItemMeta(bookMeta2);
        MAIN_MENU.setItem(11, recipeDanDan);

//        ItemStack gonggao = new ItemStack(Material.WRITTEN_BOOK);
//        BookMeta bookMeta3 = (BookMeta) gonggao.getItemMeta();
//        bookMeta3.setTitle(
//                "§b更新公告"
//        );
//        bookMeta3.setAuthor(
//                "§7§oxiaoxiaoOWO"
//        );
//        gonggao.setItemMeta(bookMeta3);
//        MAIN_MENU.setItem(53,gonggao);

        ItemStack noise = new ItemStack(Material.REDSTONE);
        ItemMeta itemMetaNoise = noise.getItemMeta();
        itemMetaNoise.displayName(
                Component
                        .text("开启/关闭被动技能的文本提示").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        noise.setItemMeta(itemMetaNoise);
        ZA_XIANG.setItem(3, noise);


        ItemStack noise2 = new ItemStack(Material.REDSTONE);
        ItemMeta itemMetaNoise2 = noise2.getItemMeta();
        itemMetaNoise2.displayName(
                Component
                        .text("开启/关闭被动技能的音效").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        noise2.setItemMeta(itemMetaNoise2);
        ZA_XIANG.setItem(4, noise2);

        ItemStack noise3 = new ItemStack(Material.REDSTONE);
        ItemMeta itemMetaNoise3 = noise3.getItemMeta();
        itemMetaNoise3.displayName(
                Component
                        .text("开启/关闭阵法的文本提示").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        noise3.setItemMeta(itemMetaNoise3);
        ZA_XIANG.setItem(5, noise3);

        ItemStack shuilang = Food.shuilangniemianren.clone();
        ItemMeta itemMetaShui = shuilang.getItemMeta();
        itemMetaShui.displayName(
                Component.text("伏龙的赈灾粮——免费领取水狼捏面人").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMetaShui.lore(
                List.of(
                        Component.text("每6小时可领取一次").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
                )
        );
        shuilang.setItemMeta(itemMetaShui);
        MAIN_MENU.setItem(18, shuilang);

        ItemStack show = Weapon.KUN_LUN_FEI_XIAN_JIAN.clone();
        ItemMeta itemMetaShow = show.getItemMeta();
        itemMetaShow.addItemFlags(ZeroAttributeModifier.itemFlags);
        itemMetaShow.displayName(
                Component.text("展示手持物品").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        show.setItemMeta(itemMetaShow);
        MAIN_MENU.setItem(14, show);

        ItemStack lunhuizhuanshi = Other.CHONG_SHENG_STONE.clone();
        ItemMeta itemMetaLun = lunhuizhuanshi.getItemMeta();
        itemMetaLun.displayName(
                Component.text("轮回转世").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMetaLun.lore(
                List.of(
                        Component.text("必须清空自己的背包，而末影箱，饰品槽，乾坤盒不需要清理").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false),
                        Component.text("轮回转世将花费存款中的300铜钱").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false),
                        Component.text("除此之外，不会扣除其它任何物品，属性等").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
                )
        );

        lunhuizhuanshi.setItemMeta(itemMetaLun);
        MAIN_MENU.setItem(19, lunhuizhuanshi);

        ItemStack kill = com.xiaoxiaoowo.yuehua.items.zhuangbei.Weapon.XUAN_YUAN.clone();
        ItemMeta itemMetaKillCheck = kill.getItemMeta();
        itemMetaKillCheck.displayName(
                Component.text("查询怪物击杀数").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        itemMetaKillCheck.lore(
                List.of(
                        Component.text("查询你的怪物击杀数").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, false)
                )
        );
        kill.setItemMeta(itemMetaKillCheck);
        MAIN_MENU.setItem(20, kill);

    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        Scheduler.sync(() -> player.openInventory(MAIN_MENU));
        return true;
    }
}
