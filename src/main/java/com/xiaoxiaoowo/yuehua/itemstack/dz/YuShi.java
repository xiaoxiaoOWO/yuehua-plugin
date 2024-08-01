package com.xiaoxiaoowo.yuehua.itemstack.dz;

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

public final class YuShi {
    //近战攻击，血色石
    public final static ItemStack XUE_SE_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack XUE_SE_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack XUE_SE_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack XUE_SE_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack XUE_SE_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack XUE_SE_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack XUE_SE_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack XUE_SE_SHI8 = new ItemStack(Material.EMERALD);

    //箭强，翠绿石
    public final static ItemStack CUI_LV_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack CUI_LV_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack CUI_LV_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack CUI_LV_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack CUI_LV_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack CUI_LV_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack CUI_LV_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack CUI_LV_SHI8 = new ItemStack(Material.EMERALD);

    //法强，靛蓝石
    public final static ItemStack DIAN_LAN_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack DIAN_LAN_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack DIAN_LAN_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack DIAN_LAN_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack DIAN_LAN_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack DIAN_LAN_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack DIAN_LAN_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack DIAN_LAN_SHI8 = new ItemStack(Material.EMERALD);

    //护甲，金黄石
    public final static ItemStack JIN_HUANG_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack JIN_HUANG_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack JIN_HUANG_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack JIN_HUANG_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack JIN_HUANG_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack JIN_HUANG_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack JIN_HUANG_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack JIN_HUANG_SHI8 = new ItemStack(Material.EMERALD);

    //格挡，厚土石
    public final static ItemStack HOU_TU_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack HOU_TU_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack HOU_TU_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack HOU_TU_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack HOU_TU_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack HOU_TU_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack HOU_TU_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack HOU_TU_SHI8 = new ItemStack(Material.EMERALD);

    //生命，紫晶石
    public final static ItemStack ZI_JING_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack ZI_JING_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack ZI_JING_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack ZI_JING_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack ZI_JING_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack ZI_JING_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack ZI_JING_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack ZI_JING_SHI8 = new ItemStack(Material.EMERALD);

    //暴击率，屠戮石
    public final static ItemStack TU_LU_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack TU_LU_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack TU_LU_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack TU_LU_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack TU_LU_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack TU_LU_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack TU_LU_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack TU_LU_SHI8 = new ItemStack(Material.EMERALD);

    //暴击效果，红月石
    public final static ItemStack HONG_YUE_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack HONG_YUE_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack HONG_YUE_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack HONG_YUE_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack HONG_YUE_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack HONG_YUE_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack HONG_YUE_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack HONG_YUE_SHI8 = new ItemStack(Material.EMERALD);

    //韧性，秘银石
    public final static ItemStack MI_YIN_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack MI_YIN_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack MI_YIN_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack MI_YIN_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack MI_YIN_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack MI_YIN_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack MI_YIN_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack MI_YIN_SHI8 = new ItemStack(Material.EMERALD);

    //生机，雨露石
    public final static ItemStack YU_LU_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack YU_LU_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack YU_LU_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack YU_LU_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack YU_LU_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack YU_LU_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack YU_LU_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack YU_LU_SHI8 = new ItemStack(Material.EMERALD);

    //法抗，冰霜石
    public final static ItemStack BING_SHUANG_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack BING_SHUANG_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack BING_SHUANG_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack BING_SHUANG_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack BING_SHUANG_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack BING_SHUANG_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack BING_SHUANG_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack BING_SHUANG_SHI8 = new ItemStack(Material.EMERALD);

    //破法，炎阳石
    public final static ItemStack YAN_YANG_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack YAN_YANG_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack YAN_YANG_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack YAN_YANG_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack YAN_YANG_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack YAN_YANG_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack YAN_YANG_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack YAN_YANG_SHI8 = new ItemStack(Material.EMERALD);

    //破甲，碎岩石
    public final static ItemStack SUI_YAN_SHI1 = new ItemStack(Material.EMERALD);
    public final static ItemStack SUI_YAN_SHI2 = new ItemStack(Material.EMERALD);
    public final static ItemStack SUI_YAN_SHI3 = new ItemStack(Material.EMERALD);
    public final static ItemStack SUI_YAN_SHI4 = new ItemStack(Material.EMERALD);
    public final static ItemStack SUI_YAN_SHI5 = new ItemStack(Material.EMERALD);
    public final static ItemStack SUI_YAN_SHI6 = new ItemStack(Material.EMERALD);
    public final static ItemStack SUI_YAN_SHI7 = new ItemStack(Material.EMERALD);
    public final static ItemStack SUI_YAN_SHI8 = new ItemStack(Material.EMERALD);


    static {
        XUE_SE_SHI1.setCustomModelData(1);
        XUE_SE_SHI2.setCustomModelData(2);
        XUE_SE_SHI3.setCustomModelData(3);
        XUE_SE_SHI4.setCustomModelData(4);
        XUE_SE_SHI5.setCustomModelData(5);
        XUE_SE_SHI6.setCustomModelData(6);
        XUE_SE_SHI7.setCustomModelData(7);
        XUE_SE_SHI8.setCustomModelData(8);

        CUI_LV_SHI1.setCustomModelData(9);
        CUI_LV_SHI2.setCustomModelData(10);
        CUI_LV_SHI3.setCustomModelData(11);
        CUI_LV_SHI4.setCustomModelData(12);
        CUI_LV_SHI5.setCustomModelData(13);
        CUI_LV_SHI6.setCustomModelData(14);
        CUI_LV_SHI7.setCustomModelData(15);
        CUI_LV_SHI8.setCustomModelData(16);

        DIAN_LAN_SHI1.setCustomModelData(17);
        DIAN_LAN_SHI2.setCustomModelData(18);
        DIAN_LAN_SHI3.setCustomModelData(19);
        DIAN_LAN_SHI4.setCustomModelData(20);
        DIAN_LAN_SHI5.setCustomModelData(21);
        DIAN_LAN_SHI6.setCustomModelData(22);
        DIAN_LAN_SHI7.setCustomModelData(23);
        DIAN_LAN_SHI8.setCustomModelData(24);

        JIN_HUANG_SHI1.setCustomModelData(25);
        JIN_HUANG_SHI2.setCustomModelData(26);
        JIN_HUANG_SHI3.setCustomModelData(27);
        JIN_HUANG_SHI4.setCustomModelData(28);
        JIN_HUANG_SHI5.setCustomModelData(29);
        JIN_HUANG_SHI6.setCustomModelData(30);
        JIN_HUANG_SHI7.setCustomModelData(31);
        JIN_HUANG_SHI8.setCustomModelData(32);

        HOU_TU_SHI1.setCustomModelData(33);
        HOU_TU_SHI2.setCustomModelData(34);
        HOU_TU_SHI3.setCustomModelData(35);
        HOU_TU_SHI4.setCustomModelData(36);
        HOU_TU_SHI5.setCustomModelData(37);
        HOU_TU_SHI6.setCustomModelData(38);
        HOU_TU_SHI7.setCustomModelData(39);
        HOU_TU_SHI8.setCustomModelData(40);

        ZI_JING_SHI1.setCustomModelData(41);
        ZI_JING_SHI2.setCustomModelData(42);
        ZI_JING_SHI3.setCustomModelData(43);
        ZI_JING_SHI4.setCustomModelData(44);
        ZI_JING_SHI5.setCustomModelData(45);
        ZI_JING_SHI6.setCustomModelData(46);
        ZI_JING_SHI7.setCustomModelData(47);
        ZI_JING_SHI8.setCustomModelData(48);

        TU_LU_SHI1.setCustomModelData(49);
        TU_LU_SHI2.setCustomModelData(50);
        TU_LU_SHI3.setCustomModelData(51);
        TU_LU_SHI4.setCustomModelData(52);
        TU_LU_SHI5.setCustomModelData(53);
        TU_LU_SHI6.setCustomModelData(54);
        TU_LU_SHI7.setCustomModelData(55);
        TU_LU_SHI8.setCustomModelData(56);

        HONG_YUE_SHI1.setCustomModelData(57);
        HONG_YUE_SHI2.setCustomModelData(58);
        HONG_YUE_SHI3.setCustomModelData(59);
        HONG_YUE_SHI4.setCustomModelData(60);
        HONG_YUE_SHI5.setCustomModelData(61);
        HONG_YUE_SHI6.setCustomModelData(62);
        HONG_YUE_SHI7.setCustomModelData(63);
        HONG_YUE_SHI8.setCustomModelData(64);

        MI_YIN_SHI1.setCustomModelData(65);
        MI_YIN_SHI2.setCustomModelData(66);
        MI_YIN_SHI3.setCustomModelData(67);
        MI_YIN_SHI4.setCustomModelData(68);
        MI_YIN_SHI5.setCustomModelData(69);
        MI_YIN_SHI6.setCustomModelData(70);
        MI_YIN_SHI7.setCustomModelData(71);
        MI_YIN_SHI8.setCustomModelData(72);

        YU_LU_SHI1.setCustomModelData(73);
        YU_LU_SHI2.setCustomModelData(74);
        YU_LU_SHI3.setCustomModelData(75);
        YU_LU_SHI4.setCustomModelData(76);
        YU_LU_SHI5.setCustomModelData(77);
        YU_LU_SHI6.setCustomModelData(78);
        YU_LU_SHI7.setCustomModelData(79);
        YU_LU_SHI8.setCustomModelData(80);

        BING_SHUANG_SHI1.setCustomModelData(81);
        BING_SHUANG_SHI2.setCustomModelData(82);
        BING_SHUANG_SHI3.setCustomModelData(83);
        BING_SHUANG_SHI4.setCustomModelData(84);
        BING_SHUANG_SHI5.setCustomModelData(85);
        BING_SHUANG_SHI6.setCustomModelData(86);
        BING_SHUANG_SHI7.setCustomModelData(87);
        BING_SHUANG_SHI8.setCustomModelData(88);

        YAN_YANG_SHI1.setCustomModelData(89);
        YAN_YANG_SHI2.setCustomModelData(90);
        YAN_YANG_SHI3.setCustomModelData(91);
        YAN_YANG_SHI4.setCustomModelData(92);
        YAN_YANG_SHI5.setCustomModelData(93);
        YAN_YANG_SHI6.setCustomModelData(94);
        YAN_YANG_SHI7.setCustomModelData(95);
        YAN_YANG_SHI8.setCustomModelData(96);

        SUI_YAN_SHI1.setCustomModelData(97);
        SUI_YAN_SHI2.setCustomModelData(98);
        SUI_YAN_SHI3.setCustomModelData(99);
        SUI_YAN_SHI4.setCustomModelData(100);
        SUI_YAN_SHI5.setCustomModelData(101);
        SUI_YAN_SHI6.setCustomModelData(102);
        SUI_YAN_SHI7.setCustomModelData(103);
        SUI_YAN_SHI8.setCustomModelData(104);

        ItemMeta xueseshi1 = XUE_SE_SHI1.getItemMeta();
        xueseshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi1");
        xueseshi1.displayName(
                Component.text("血色石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi1.lore(
                List.of(Component.text("稀有度:★ [普通]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b1"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta xueseshi2 = XUE_SE_SHI2.getItemMeta();
        xueseshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi2");
        xueseshi2.displayName(
                Component.text("血色石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi2.lore(
                List.of(Component.text("稀有度:★★ [优秀]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b2"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta xueseshi3 = XUE_SE_SHI3.getItemMeta();
        xueseshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi3");
        xueseshi3.displayName(
                Component.text("血色石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi3.lore(
                List.of(Component.text("稀有度:★★★ [精良]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b4"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta xueseshi4 = XUE_SE_SHI4.getItemMeta();
        xueseshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi4");
        xueseshi4.displayName(
                Component.text("血色石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi4.lore(
                List.of(Component.text("稀有度:★★★★ [珍奇]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b8"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta xueseshi5 = XUE_SE_SHI5.getItemMeta();
        xueseshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi5");
        xueseshi5.displayName(
                Component.text("血色石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi5.lore(
                List.of(Component.text("稀有度:★★★★★ [史诗]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b16"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta xueseshi6 = XUE_SE_SHI6.getItemMeta();
        xueseshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi6");
        xueseshi6.displayName(
                Component.text("血色石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi6.lore(
                List.of(Component.text("稀有度:★★★★★★ [传说]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b32"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta xueseshi7 = XUE_SE_SHI7.getItemMeta();
        xueseshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi7");
        xueseshi7.displayName(
                Component.text("血色石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi7.lore(
                List.of(Component.text("稀有度:★★★★★★★ [神器]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b64"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta xueseshi8 = XUE_SE_SHI8.getItemMeta();
        xueseshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueseshi8");
        xueseshi8.displayName(
                Component.text("血色石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        xueseshi8.lore(
                List.of(Component.text("稀有度:★★★★★★★★ [上古]").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f近战伤害 +§b128"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi1 = CUI_LV_SHI1.getItemMeta();
        cuilvshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi1");
        cuilvshi1.displayName(
                Component.text("翠绿石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi1.lore(
                List.of(Component.text("稀有度:★ [普通]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f箭矢强度 +§b1"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi2 = CUI_LV_SHI2.getItemMeta();
        cuilvshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi2");
        cuilvshi2.displayName(
                Component.text("翠绿石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi2.lore(
                List.of(Component.text("稀有度:★★ [优秀]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f箭矢强度 +§b2"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi3 = CUI_LV_SHI3.getItemMeta();
        cuilvshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi3");
        cuilvshi3.displayName(
                Component.text("翠绿石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi3.lore(
                List.of(Component.text("稀有度:★★★ [精良]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f箭矢强度 +§b4"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi4 = CUI_LV_SHI4.getItemMeta();
        cuilvshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi4");
        cuilvshi4.displayName(
                Component.text("翠绿石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi4.lore(
                List.of(Component.text("稀有度:★★★★ [珍奇]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f箭矢强度 +§b8"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi5 = CUI_LV_SHI5.getItemMeta();
        cuilvshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi5");
        cuilvshi5.displayName(
                Component.text("翠绿石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi5.lore(
                List.of(Component.text("稀有度:★★★★★ [史诗]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false),
                        Component.text("§f箭矢强度 +§b16"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi6 = CUI_LV_SHI6.getItemMeta();
        cuilvshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi6");
        cuilvshi6.displayName(
                Component.text("翠绿石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f箭矢强度 +§b32"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi7 = CUI_LV_SHI7.getItemMeta();
        cuilvshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi7");
        cuilvshi7.displayName(
                Component.text("翠绿石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f箭矢强度 +§b64"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta cuilvshi8 = CUI_LV_SHI8.getItemMeta();
        cuilvshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cuilvshi8");
        cuilvshi8.displayName(
                Component.text("翠绿石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        cuilvshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f箭矢强度 +§b128"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi1 = DIAN_LAN_SHI1.getItemMeta();
        dianlanshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi1");
        dianlanshi1.displayName(
                Component.text("靛蓝石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f阵法强度 +§b1"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi2 = DIAN_LAN_SHI2.getItemMeta();
        dianlanshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi2");
        dianlanshi2.displayName(
                Component.text("靛蓝石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f阵法强度 +§b2"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi3 = DIAN_LAN_SHI3.getItemMeta();
        dianlanshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi3");
        dianlanshi3.displayName(
                Component.text("靛蓝石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f阵法强度 +§b4"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi4 = DIAN_LAN_SHI4.getItemMeta();
        dianlanshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi4");
        dianlanshi4.displayName(
                Component.text("靛蓝石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f阵法强度 +§b8"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi5 = DIAN_LAN_SHI5.getItemMeta();
        dianlanshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi5");
        dianlanshi5.displayName(
                Component.text("靛蓝石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f阵法强度 +§b16"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi6 = DIAN_LAN_SHI6.getItemMeta();
        dianlanshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi6");
        dianlanshi6.displayName(
                Component.text("靛蓝石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f阵法强度 +§b32"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi7 = DIAN_LAN_SHI7.getItemMeta();
        dianlanshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi7");
        dianlanshi7.displayName(
                Component.text("靛蓝石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f阵法强度 +§b64"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta dianlanshi8 = DIAN_LAN_SHI8.getItemMeta();
        dianlanshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"dianlanshi8");
        dianlanshi8.displayName(
                Component.text("靛蓝石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        dianlanshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f阵法强度 +§b128"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta jinhuangshi1 = JIN_HUANG_SHI1.getItemMeta();
        jinhuangshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi1");
        jinhuangshi1.displayName(
                Component.text("金黄石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f护甲 +§b1"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta jinhuangshi2 = JIN_HUANG_SHI2.getItemMeta();
        jinhuangshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi2");
        jinhuangshi2.displayName(
                Component.text("金黄石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f护甲 +§b2"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta jinhuangshi3 = JIN_HUANG_SHI3.getItemMeta();
        jinhuangshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi3");
        jinhuangshi3.displayName(
                Component.text("金黄石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f护甲 +§b3"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta jinhuangshi4 = JIN_HUANG_SHI4.getItemMeta();
        jinhuangshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi4");
        jinhuangshi4.displayName(
                Component.text("金黄石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f护甲 +§b5"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta jinhuangshi5 = JIN_HUANG_SHI5.getItemMeta();
        jinhuangshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi5");
        jinhuangshi5.displayName(
                Component.text("金黄石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f护甲 +§b7"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta jinhuangshi6 = JIN_HUANG_SHI6.getItemMeta();
        jinhuangshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi6");
        jinhuangshi6.displayName(
                Component.text("金黄石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f护甲 +§b10"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta jinhuangshi7 = JIN_HUANG_SHI7.getItemMeta();
        jinhuangshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi7");
        jinhuangshi7.displayName(
                Component.text("金黄石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f护甲 +§b13"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );


        ItemMeta jinhuangshi8 = JIN_HUANG_SHI8.getItemMeta();
        jinhuangshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jinhuangshi8");
        jinhuangshi8.displayName(
                Component.text("金黄石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        jinhuangshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f护甲 +§b17"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi1 = HOU_TU_SHI1.getItemMeta();
        houtushi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi1");
        houtushi1.displayName(
                Component.text("厚土石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        houtushi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f格挡 +§b1"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi2 = HOU_TU_SHI2.getItemMeta();
        houtushi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi2");
        houtushi2.displayName(
                Component.text("厚土石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        houtushi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f格挡 +§b2"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi3 = HOU_TU_SHI3.getItemMeta();
        houtushi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi3");
        houtushi3.displayName(
                Component.text("厚土石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        houtushi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f格挡 +§b3"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi4 = HOU_TU_SHI4.getItemMeta();
        houtushi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi4");
        houtushi4.displayName(
                Component.text("厚土石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        houtushi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f格挡 +§b5"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi5 = HOU_TU_SHI5.getItemMeta();
        houtushi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi5");
        houtushi5.displayName(
                Component.text("厚土石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        houtushi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f格挡 +§b7"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi6 = HOU_TU_SHI6.getItemMeta();
        houtushi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi6");
        houtushi6.displayName(
                Component.text("厚土石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        houtushi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f格挡 +§b10"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi7 = HOU_TU_SHI7.getItemMeta();
        houtushi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi7");
        houtushi7.displayName(
                Component.text("厚土石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        houtushi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f格挡 +§b13"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta houtushi8 = HOU_TU_SHI8.getItemMeta();
        houtushi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"houtushi8");
        houtushi8.displayName(
                Component.text("厚土石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        houtushi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f格挡 +§b17"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi1 = ZI_JING_SHI1.getItemMeta();
        zijingshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi1");
        zijingshi1.displayName(
                Component.text("紫晶石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f生命 +§b1"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi2 = ZI_JING_SHI2.getItemMeta();
        zijingshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi2");
        zijingshi2.displayName(
                Component.text("紫晶石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f生命 +§b2"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi3 = ZI_JING_SHI3.getItemMeta();
        zijingshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi3");
        zijingshi3.displayName(
                Component.text("紫晶石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f生命 +§b4"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi4 = ZI_JING_SHI4.getItemMeta();
        zijingshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi4");
        zijingshi4.displayName(
                Component.text("紫晶石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f生命 +§b8"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi5 = ZI_JING_SHI5.getItemMeta();
        zijingshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi5");
        zijingshi5.displayName(
                Component.text("紫晶石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f生命 +§b16"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi6 = ZI_JING_SHI6.getItemMeta();
        zijingshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi6");
        zijingshi6.displayName(
                Component.text("紫晶石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f生命 +§b32"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi7 = ZI_JING_SHI7.getItemMeta();
        zijingshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi7");
        zijingshi7.displayName(
                Component.text("紫晶石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f生命 +§b64"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta zijingshi8 = ZI_JING_SHI8.getItemMeta();
        zijingshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zijingshi8");
        zijingshi8.displayName(
                Component.text("紫晶石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        zijingshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f生命 +§b128"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi1 = TU_LU_SHI1.getItemMeta();
        tulushi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi1");
        tulushi1.displayName(
                Component.text("屠戮石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        tulushi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f暴击率 +§b1%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi2 = TU_LU_SHI2.getItemMeta();
        tulushi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi2");
        tulushi2.displayName(
                Component.text("屠戮石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        tulushi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f暴击率 +§b2%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi3 = TU_LU_SHI3.getItemMeta();
        tulushi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi3");
        tulushi3.displayName(
                Component.text("屠戮石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        tulushi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f暴击率 +§b4%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi4 = TU_LU_SHI4.getItemMeta();
        tulushi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi4");
        tulushi4.displayName(
                Component.text("屠戮石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        tulushi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f暴击率 +§b7%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi5 = TU_LU_SHI5.getItemMeta();
        tulushi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi5");
        tulushi5.displayName(
                Component.text("屠戮石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        tulushi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f暴击率 +§b11%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi6 = TU_LU_SHI6.getItemMeta();
        tulushi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi6");
        tulushi6.displayName(
                Component.text("屠戮石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        tulushi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f暴击率 +§b16%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi7 = TU_LU_SHI7.getItemMeta();
        tulushi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi7");
        tulushi7.displayName(
                Component.text("屠戮石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        tulushi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f暴击率 +§b22%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta tulushi8 = TU_LU_SHI8.getItemMeta();
        tulushi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tulushi8");
        tulushi8.displayName(
                Component.text("屠戮石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        tulushi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f暴击率 +§b29%"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi1 = HONG_YUE_SHI1.getItemMeta();
        hongyueshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi1");
        hongyueshi1.displayName(
                Component.text("红月石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f暴击效果 +§b3"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi2 = HONG_YUE_SHI2.getItemMeta();
        hongyueshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi2");
        hongyueshi2.displayName(
                Component.text("红月石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f暴击效果 +§b6"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi3 = HONG_YUE_SHI3.getItemMeta();
        hongyueshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi3");
        hongyueshi3.displayName(
                Component.text("红月石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f暴击效果 +§b12"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi4 = HONG_YUE_SHI4.getItemMeta();
        hongyueshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi4");
        hongyueshi4.displayName(
                Component.text("红月石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f暴击效果 +§b21"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi5 = HONG_YUE_SHI5.getItemMeta();
        hongyueshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi5");
        hongyueshi5.displayName(
                Component.text("红月石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f暴击效果 +§b33"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi6 = HONG_YUE_SHI6.getItemMeta();
        hongyueshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi6");
        hongyueshi6.displayName(
                Component.text("红月石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f暴击效果 +§b48"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi7 = HONG_YUE_SHI7.getItemMeta();
        hongyueshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi7");
        hongyueshi7.displayName(
                Component.text("红月石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f暴击效果 +§b66"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta hongyueshi8 = HONG_YUE_SHI8.getItemMeta();
        hongyueshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hongyueshi8");
        hongyueshi8.displayName(
                Component.text("红月石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        hongyueshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f暴击效果 +§b87"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta miyinshi1 = MI_YIN_SHI1.getItemMeta();
        miyinshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi1");
        miyinshi1.displayName(
                Component.text("秘银石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f韧性 +§b2"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta miyinshi2 = MI_YIN_SHI2.getItemMeta();
        miyinshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi2");
        miyinshi2.displayName(
                Component.text("秘银石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f韧性 +§b4"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta miyinshi3 = MI_YIN_SHI3.getItemMeta();
        miyinshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi3");
        miyinshi3.displayName(
                Component.text("秘银石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f韧性 +§b6"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta miyinshi4 = MI_YIN_SHI4.getItemMeta();
        miyinshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi4");
        miyinshi4.displayName(
                Component.text("秘银石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f韧性 +§b10"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta miyinshi5 = MI_YIN_SHI5.getItemMeta();
        miyinshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi5");
        miyinshi5.displayName(
                Component.text("秘银石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f韧性 +§b14"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );


        ItemMeta miyinshi6 = MI_YIN_SHI6.getItemMeta();
        miyinshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi6");
        miyinshi6.displayName(
                Component.text("秘银石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f韧性 +§b20"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta miyinshi7 = MI_YIN_SHI7.getItemMeta();
        miyinshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi7");
        miyinshi7.displayName(
                Component.text("秘银石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f韧性 +§b26"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta miyinshi8 = MI_YIN_SHI8.getItemMeta();
        miyinshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miyinshi8");
        miyinshi8.displayName(
                Component.text("秘银石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        miyinshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f韧性 +§b34"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi1 = YU_LU_SHI1.getItemMeta();
        yulushi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi1");
        yulushi1.displayName(
                Component.text("雨露石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        yulushi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f生机 +§b2"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi2 = YU_LU_SHI2.getItemMeta();
        yulushi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi2");
        yulushi2.displayName(
                Component.text("雨露石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        yulushi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f生机 +§b4"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi3 = YU_LU_SHI3.getItemMeta();
        yulushi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi3");
        yulushi3.displayName(
                Component.text("雨露石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        yulushi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f生机 +§b6"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi4 = YU_LU_SHI4.getItemMeta();
        yulushi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi4");
        yulushi4.displayName(
                Component.text("雨露石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        yulushi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f生机 +§b10"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi5 = YU_LU_SHI5.getItemMeta();
        yulushi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi5");
        yulushi5.displayName(
                Component.text("雨露石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        yulushi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f生机 +§b14"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi6 = YU_LU_SHI6.getItemMeta();
        yulushi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi6");
        yulushi6.displayName(
                Component.text("雨露石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        yulushi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f生机 +§b20"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi7 = YU_LU_SHI7.getItemMeta();
        yulushi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi7");
        yulushi7.displayName(
                Component.text("雨露石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        yulushi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f生机 +§b26"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yulushi8 = YU_LU_SHI8.getItemMeta();
        yulushi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yulushi8");
        yulushi8.displayName(
                Component.text("雨露石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        yulushi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f生机 +§b34"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );


        ItemMeta bingshuangshi1 = BING_SHUANG_SHI1.getItemMeta();
        bingshuangshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi1");
        bingshuangshi1.displayName(
                Component.text("冰霜石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f法抗 +§b1"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta bingshuangshi2 = BING_SHUANG_SHI2.getItemMeta();
        bingshuangshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi2");
        bingshuangshi2.displayName(
                Component.text("冰霜石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f法抗 +§b2"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta bingshuangshi3 = BING_SHUANG_SHI3.getItemMeta();
        bingshuangshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi3");
        bingshuangshi3.displayName(
                Component.text("冰霜石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f法抗 +§b3"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta bingshuangshi4 = BING_SHUANG_SHI4.getItemMeta();
        bingshuangshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi4");
        bingshuangshi4.displayName(
                Component.text("冰霜石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f法抗 +§b5"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta bingshuangshi5 = BING_SHUANG_SHI5.getItemMeta();
        bingshuangshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi5");
        bingshuangshi5.displayName(
                Component.text("冰霜石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f法抗 +§b7"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta bingshuangshi6 = BING_SHUANG_SHI6.getItemMeta();
        bingshuangshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi6");
        bingshuangshi6.displayName(
                Component.text("冰霜石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f法抗 +§b10"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta bingshuangshi7 = BING_SHUANG_SHI7.getItemMeta();
        bingshuangshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi7");
        bingshuangshi7.displayName(
                Component.text("冰霜石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f法抗 +§b13"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );


        ItemMeta bingshuangshi8 = BING_SHUANG_SHI8.getItemMeta();
        bingshuangshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bingshuangshi8");
        bingshuangshi8.displayName(
                Component.text("冰霜石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        bingshuangshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f法抗 +§b17"),
                        Component.text("可镶嵌于护甲").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi1 = YAN_YANG_SHI1.getItemMeta();
        yanyangshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi1");
        yanyangshi1.displayName(
                Component.text("炎阳石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f破法 +§b1"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi2 = YAN_YANG_SHI2.getItemMeta();
        yanyangshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi2");
        yanyangshi2.displayName(
                Component.text("炎阳石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f破法 +§b2"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi3 = YAN_YANG_SHI3.getItemMeta();
        yanyangshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi3");
        yanyangshi3.displayName(
                Component.text("炎阳石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f破法 +§b4"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi4 = YAN_YANG_SHI4.getItemMeta();
        yanyangshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi4");
        yanyangshi4.displayName(
                Component.text("炎阳石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f破法 +§b8"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi5 = YAN_YANG_SHI5.getItemMeta();
        yanyangshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi5");
        yanyangshi5.displayName(
                Component.text("炎阳石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f破法 +§b16"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi6 = YAN_YANG_SHI6.getItemMeta();
        yanyangshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi6");
        yanyangshi6.displayName(
                Component.text("炎阳石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f破法 +§b32"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi7 = YAN_YANG_SHI7.getItemMeta();
        yanyangshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi7");
        yanyangshi7.displayName(
                Component.text("炎阳石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f破法 +§b64"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta yanyangshi8 = YAN_YANG_SHI8.getItemMeta();
        yanyangshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyangshi8");
        yanyangshi8.displayName(
                Component.text("炎阳石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        yanyangshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f破法 +§b128"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi1 = SUI_YAN_SHI1.getItemMeta();
        suiyanshi1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi1");
        suiyanshi1.displayName(
                Component.text("碎岩石☯一阶").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi1.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("§f破甲 +§b1"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi2 = SUI_YAN_SHI2.getItemMeta();
        suiyanshi2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi2");
        suiyanshi2.displayName(
                Component.text("碎岩石☯二阶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi2.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("§f破甲 +§b2"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi3 = SUI_YAN_SHI3.getItemMeta();
        suiyanshi3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi3");
        suiyanshi3.displayName(
                Component.text("碎岩石☯三阶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("§f破甲 +§b4"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi4 = SUI_YAN_SHI4.getItemMeta();
        suiyanshi4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi4");
        suiyanshi4.displayName(
                Component.text("碎岩石☯四阶").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("§f破甲 +§b8"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi5 = SUI_YAN_SHI5.getItemMeta();
        suiyanshi5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi5");
        suiyanshi5.displayName(
                Component.text("碎岩石☯五阶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi5.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("§f破甲 +§b16"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi6 = SUI_YAN_SHI6.getItemMeta();
        suiyanshi6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi6");
        suiyanshi6.displayName(
                Component.text("碎岩石☯六阶").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi6.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("§f破甲 +§b32"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi7 = SUI_YAN_SHI7.getItemMeta();
        suiyanshi7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi7");
        suiyanshi7.displayName(
                Component.text("碎岩石☯七阶").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi7.lore(
                List.of(ComponentSet.RARE7,
                        Component.text("§f破甲 +§b64"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        ItemMeta suiyanshi8 = SUI_YAN_SHI8.getItemMeta();
        suiyanshi8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"suiyanshi8");
        suiyanshi8.displayName(
                Component.text("碎岩石☯八阶").color(NamedTextColor.GOLD).decoration(TextDecoration.ITALIC,false)
        );
        suiyanshi8.lore(
                List.of(ComponentSet.RARE8,
                        Component.text("§f破甲 +§b128"),
                        Component.text("可镶嵌于主副武器").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );

        xueseshi1.setMaxStackSize(99);
        xueseshi2.setMaxStackSize(99);
        xueseshi3.setMaxStackSize(99);
        xueseshi4.setMaxStackSize(99);
        xueseshi5.setMaxStackSize(99);
        xueseshi6.setMaxStackSize(99);
        xueseshi7.setMaxStackSize(99);
        xueseshi8.setMaxStackSize(99);

        cuilvshi1.setMaxStackSize(99);
        cuilvshi2.setMaxStackSize(99);
        cuilvshi3.setMaxStackSize(99);
        cuilvshi4.setMaxStackSize(99);
        cuilvshi5.setMaxStackSize(99);
        cuilvshi6.setMaxStackSize(99);
        cuilvshi7.setMaxStackSize(99);
        cuilvshi8.setMaxStackSize(99);

        dianlanshi1.setMaxStackSize(99);
        dianlanshi2.setMaxStackSize(99);
        dianlanshi3.setMaxStackSize(99);
        dianlanshi4.setMaxStackSize(99);
        dianlanshi5.setMaxStackSize(99);
        dianlanshi6.setMaxStackSize(99);
        dianlanshi7.setMaxStackSize(99);
        dianlanshi8.setMaxStackSize(99);

        jinhuangshi1.setMaxStackSize(99);
        jinhuangshi2.setMaxStackSize(99);
        jinhuangshi3.setMaxStackSize(99);
        jinhuangshi4.setMaxStackSize(99);
        jinhuangshi5.setMaxStackSize(99);
        jinhuangshi6.setMaxStackSize(99);
        jinhuangshi7.setMaxStackSize(99);
        jinhuangshi8.setMaxStackSize(99);

        houtushi1.setMaxStackSize(99);
        houtushi2.setMaxStackSize(99);
        houtushi3.setMaxStackSize(99);
        houtushi4.setMaxStackSize(99);
        houtushi5.setMaxStackSize(99);
        houtushi6.setMaxStackSize(99);
        houtushi7.setMaxStackSize(99);
        houtushi8.setMaxStackSize(99);

        zijingshi1.setMaxStackSize(99);
        zijingshi2.setMaxStackSize(99);
        zijingshi3.setMaxStackSize(99);
        zijingshi4.setMaxStackSize(99);
        zijingshi5.setMaxStackSize(99);
        zijingshi6.setMaxStackSize(99);
        zijingshi7.setMaxStackSize(99);
        zijingshi8.setMaxStackSize(99);

        tulushi1.setMaxStackSize(99);
        tulushi2.setMaxStackSize(99);
        tulushi3.setMaxStackSize(99);
        tulushi4.setMaxStackSize(99);
        tulushi5.setMaxStackSize(99);
        tulushi6.setMaxStackSize(99);
        tulushi7.setMaxStackSize(99);
        tulushi8.setMaxStackSize(99);

        hongyueshi1.setMaxStackSize(99);
        hongyueshi2.setMaxStackSize(99);
        hongyueshi3.setMaxStackSize(99);
        hongyueshi4.setMaxStackSize(99);
        hongyueshi5.setMaxStackSize(99);
        hongyueshi6.setMaxStackSize(99);
        hongyueshi7.setMaxStackSize(99);
        hongyueshi8.setMaxStackSize(99);

        miyinshi1.setMaxStackSize(99);
        miyinshi2.setMaxStackSize(99);
        miyinshi3.setMaxStackSize(99);
        miyinshi4.setMaxStackSize(99);
        miyinshi5.setMaxStackSize(99);
        miyinshi6.setMaxStackSize(99);
        miyinshi7.setMaxStackSize(99);
        miyinshi8.setMaxStackSize(99);

        yulushi1.setMaxStackSize(99);
        yulushi2.setMaxStackSize(99);
        yulushi3.setMaxStackSize(99);
        yulushi4.setMaxStackSize(99);
        yulushi5.setMaxStackSize(99);
        yulushi6.setMaxStackSize(99);
        yulushi7.setMaxStackSize(99);
        yulushi8.setMaxStackSize(99);

        bingshuangshi1.setMaxStackSize(99);
        bingshuangshi2.setMaxStackSize(99);
        bingshuangshi3.setMaxStackSize(99);
        bingshuangshi4.setMaxStackSize(99);
        bingshuangshi5.setMaxStackSize(99);
        bingshuangshi6.setMaxStackSize(99);
        bingshuangshi7.setMaxStackSize(99);
        bingshuangshi8.setMaxStackSize(99);

        yanyangshi1.setMaxStackSize(99);
        yanyangshi2.setMaxStackSize(99);
        yanyangshi3.setMaxStackSize(99);
        yanyangshi4.setMaxStackSize(99);
        yanyangshi5.setMaxStackSize(99);
        yanyangshi6.setMaxStackSize(99);
        yanyangshi7.setMaxStackSize(99);
        yanyangshi8.setMaxStackSize(99);

        suiyanshi1.setMaxStackSize(99);
        suiyanshi2.setMaxStackSize(99);
        suiyanshi3.setMaxStackSize(99);
        suiyanshi4.setMaxStackSize(99);
        suiyanshi5.setMaxStackSize(99);
        suiyanshi6.setMaxStackSize(99);
        suiyanshi7.setMaxStackSize(99);
        suiyanshi8.setMaxStackSize(99);


        XUE_SE_SHI1.setItemMeta(xueseshi1);
        XUE_SE_SHI2.setItemMeta(xueseshi2);
        XUE_SE_SHI3.setItemMeta(xueseshi3);
        XUE_SE_SHI4.setItemMeta(xueseshi4);
        XUE_SE_SHI5.setItemMeta(xueseshi5);
        XUE_SE_SHI6.setItemMeta(xueseshi6);
        XUE_SE_SHI7.setItemMeta(xueseshi7);
        XUE_SE_SHI8.setItemMeta(xueseshi8);

        CUI_LV_SHI1.setItemMeta(cuilvshi1);
        CUI_LV_SHI2.setItemMeta(cuilvshi2);
        CUI_LV_SHI3.setItemMeta(cuilvshi3);
        CUI_LV_SHI4.setItemMeta(cuilvshi4);
        CUI_LV_SHI5.setItemMeta(cuilvshi5);
        CUI_LV_SHI6.setItemMeta(cuilvshi6);
        CUI_LV_SHI7.setItemMeta(cuilvshi7);
        CUI_LV_SHI8.setItemMeta(cuilvshi8);

        DIAN_LAN_SHI1.setItemMeta(dianlanshi1);
        DIAN_LAN_SHI2.setItemMeta(dianlanshi2);
        DIAN_LAN_SHI3.setItemMeta(dianlanshi3);
        DIAN_LAN_SHI4.setItemMeta(dianlanshi4);
        DIAN_LAN_SHI5.setItemMeta(dianlanshi5);
        DIAN_LAN_SHI6.setItemMeta(dianlanshi6);
        DIAN_LAN_SHI7.setItemMeta(dianlanshi7);
        DIAN_LAN_SHI8.setItemMeta(dianlanshi8);

        JIN_HUANG_SHI1.setItemMeta(jinhuangshi1);
        JIN_HUANG_SHI2.setItemMeta(jinhuangshi2);
        JIN_HUANG_SHI3.setItemMeta(jinhuangshi3);
        JIN_HUANG_SHI4.setItemMeta(jinhuangshi4);
        JIN_HUANG_SHI5.setItemMeta(jinhuangshi5);
        JIN_HUANG_SHI6.setItemMeta(jinhuangshi6);
        JIN_HUANG_SHI7.setItemMeta(jinhuangshi7);
        JIN_HUANG_SHI8.setItemMeta(jinhuangshi8);

        HOU_TU_SHI1.setItemMeta(houtushi1);
        HOU_TU_SHI2.setItemMeta(houtushi2);
        HOU_TU_SHI3.setItemMeta(houtushi3);
        HOU_TU_SHI4.setItemMeta(houtushi4);
        HOU_TU_SHI5.setItemMeta(houtushi5);
        HOU_TU_SHI6.setItemMeta(houtushi6);
        HOU_TU_SHI7.setItemMeta(houtushi7);
        HOU_TU_SHI8.setItemMeta(houtushi8);

        ZI_JING_SHI1.setItemMeta(zijingshi1);
        ZI_JING_SHI2.setItemMeta(zijingshi2);
        ZI_JING_SHI3.setItemMeta(zijingshi3);
        ZI_JING_SHI4.setItemMeta(zijingshi4);
        ZI_JING_SHI5.setItemMeta(zijingshi5);
        ZI_JING_SHI6.setItemMeta(zijingshi6);
        ZI_JING_SHI7.setItemMeta(zijingshi7);
        ZI_JING_SHI8.setItemMeta(zijingshi8);

        TU_LU_SHI1.setItemMeta(tulushi1);
        TU_LU_SHI2.setItemMeta(tulushi2);
        TU_LU_SHI3.setItemMeta(tulushi3);
        TU_LU_SHI4.setItemMeta(tulushi4);
        TU_LU_SHI5.setItemMeta(tulushi5);
        TU_LU_SHI6.setItemMeta(tulushi6);
        TU_LU_SHI7.setItemMeta(tulushi7);
        TU_LU_SHI8.setItemMeta(tulushi8);

        HONG_YUE_SHI1.setItemMeta(hongyueshi1);
        HONG_YUE_SHI2.setItemMeta(hongyueshi2);
        HONG_YUE_SHI3.setItemMeta(hongyueshi3);
        HONG_YUE_SHI4.setItemMeta(hongyueshi4);
        HONG_YUE_SHI5.setItemMeta(hongyueshi5);
        HONG_YUE_SHI6.setItemMeta(hongyueshi6);
        HONG_YUE_SHI7.setItemMeta(hongyueshi7);
        HONG_YUE_SHI8.setItemMeta(hongyueshi8);

        MI_YIN_SHI1.setItemMeta(miyinshi1);
        MI_YIN_SHI2.setItemMeta(miyinshi2);
        MI_YIN_SHI3.setItemMeta(miyinshi3);
        MI_YIN_SHI4.setItemMeta(miyinshi4);
        MI_YIN_SHI5.setItemMeta(miyinshi5);
        MI_YIN_SHI6.setItemMeta(miyinshi6);
        MI_YIN_SHI7.setItemMeta(miyinshi7);
        MI_YIN_SHI8.setItemMeta(miyinshi8);

        YU_LU_SHI1.setItemMeta(yulushi1);
        YU_LU_SHI2.setItemMeta(yulushi2);
        YU_LU_SHI3.setItemMeta(yulushi3);
        YU_LU_SHI4.setItemMeta(yulushi4);
        YU_LU_SHI5.setItemMeta(yulushi5);
        YU_LU_SHI6.setItemMeta(yulushi6);
        YU_LU_SHI7.setItemMeta(yulushi7);
        YU_LU_SHI8.setItemMeta(yulushi8);

        BING_SHUANG_SHI1.setItemMeta(bingshuangshi1);
        BING_SHUANG_SHI2.setItemMeta(bingshuangshi2);
        BING_SHUANG_SHI3.setItemMeta(bingshuangshi3);
        BING_SHUANG_SHI4.setItemMeta(bingshuangshi4);
        BING_SHUANG_SHI5.setItemMeta(bingshuangshi5);
        BING_SHUANG_SHI6.setItemMeta(bingshuangshi6);
        BING_SHUANG_SHI7.setItemMeta(bingshuangshi7);
        BING_SHUANG_SHI8.setItemMeta(bingshuangshi8);

        YAN_YANG_SHI1.setItemMeta(yanyangshi1);
        YAN_YANG_SHI2.setItemMeta(yanyangshi2);
        YAN_YANG_SHI3.setItemMeta(yanyangshi3);
        YAN_YANG_SHI4.setItemMeta(yanyangshi4);
        YAN_YANG_SHI5.setItemMeta(yanyangshi5);
        YAN_YANG_SHI6.setItemMeta(yanyangshi6);
        YAN_YANG_SHI7.setItemMeta(yanyangshi7);
        YAN_YANG_SHI8.setItemMeta(yanyangshi8);

        SUI_YAN_SHI1.setItemMeta(suiyanshi1);
        SUI_YAN_SHI2.setItemMeta(suiyanshi2);
        SUI_YAN_SHI3.setItemMeta(suiyanshi3);
        SUI_YAN_SHI4.setItemMeta(suiyanshi4);
        SUI_YAN_SHI5.setItemMeta(suiyanshi5);
        SUI_YAN_SHI6.setItemMeta(suiyanshi6);
        SUI_YAN_SHI7.setItemMeta(suiyanshi7);
        SUI_YAN_SHI8.setItemMeta(suiyanshi8);




    }




}
