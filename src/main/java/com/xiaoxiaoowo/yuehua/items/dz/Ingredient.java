package com.xiaoxiaoowo.yuehua.items.dz;

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

public final class Ingredient {
    //(只掉自己专属)材料掉率20%，（两种都掉）核心掉率1%

    /**
     * 武器装备核心区
     */
    //2阶
    public final static ItemStack BI_SHI_SUI = new ItemStack(Material.STRING, 1);
    public final static ItemStack AO_LANG_PI = new ItemStack(Material.STRING, 1);

    //3阶
    public final static ItemStack CHI_TONG_DING = new ItemStack(Material.STRING, 1);
    public final static ItemStack BA_JIAO_YE = new ItemStack(Material.STRING, 1);

    //4阶
    public final static ItemStack XUAN_TIE_DING = new ItemStack(Material.STRING, 1);
    public final static ItemStack LIU_YIN_CHOU = new ItemStack(Material.STRING, 1);

    //5阶
    public final static ItemStack LING_YU_JIAN = new ItemStack(Material.STRING, 1);
    public final static ItemStack NIE_PAN_YU = new ItemStack(Material.STRING, 1);


    //6阶
    public final static ItemStack SHEN_ZAO_TIE = new ItemStack(Material.STRING, 1);
    public final static ItemStack HUANG_TU_SHEN_QIU = new ItemStack(Material.STRING, 1);
    public final static ItemStack YAN_GUI_ZHI_JIN = new ItemStack(Material.STRING, 1);
    public final static ItemStack LIU_GUANG_LIN_JUAN = new ItemStack(Material.STRING, 1);
    public final static ItemStack MING_LEI_YOU_SHA = new ItemStack(Material.STRING, 1);
    public final static ItemStack ZHANG_NIE_YIN_TIE = new ItemStack(Material.STRING, 1);

    //7阶
    public final static ItemStack QI_CAI_XIAN_YU = new ItemStack(Material.STRING, 1);

    /*区域特产区*/

    //东方
    public final static ItemStack DU_ZHU_YA = new ItemStack(Material.STRING, 1);
    public final static ItemStack KU_XIU_GU = new ItemStack(Material.STRING, 1);
    public final static ItemStack BAI_SHE_LIN = new ItemStack(Material.STRING, 1);
    public final static ItemStack HUANG_TONG_KUANG = new ItemStack(Material.STRING, 1);

    //南方
    public final static ItemStack RONG_YAN_SHA = new ItemStack(Material.STRING, 1);
    public final static ItemStack YAN_YANG_HUA = new ItemStack(Material.STRING, 1);
    public final static ItemStack GUI_YOU_HUO = new ItemStack(Material.STRING, 1);
    public final static ItemStack CHI_SHA_MO = new ItemStack(Material.STRING, 1);

    //西方
    public final static ItemStack LIU_LUO_ZHU = new ItemStack(Material.STRING, 1);
    public final static ItemStack YU_HENG_SHI = new ItemStack(Material.STRING, 1);
    public final static ItemStack RONG_LIAN_SHI = new ItemStack(Material.STRING, 1);
    public final static ItemStack TIAN_SHU_SHI = new ItemStack(Material.STRING, 1);

    //北方
    public final static ItemStack CHEN_SHUI_TIE = new ItemStack(Material.STRING, 1);
    public final static ItemStack JI_LANG_LUO = new ItemStack(Material.STRING, 1);
    public final static ItemStack MING_HAI_JIN = new ItemStack(Material.STRING, 1);
    public final static ItemStack BI_BO_JING = new ItemStack(Material.STRING, 1);

    //特殊
    public final static ItemStack QI_CAI_JIN = new ItemStack(Material.STRING, 1);
    public final static ItemStack WAN_YUE_YIN = new ItemStack(Material.STRING, 1);
    public final static ItemStack SHAN_MEI_JIN_TIE = new ItemStack(Material.STRING, 1);
    public final static ItemStack QIAN_NIAN_YU = new ItemStack(Material.STRING, 1);
    public final static ItemStack XUE_YING_SHI = new ItemStack(Material.STRING, 1);

    //6阶材料
    public final static ItemStack CHENG_YAN_SHEN_HUO = new ItemStack(Material.STRING, 1);
    public final static ItemStack CHI_YANG_SHEN_HUO = new ItemStack(Material.STRING, 1);
    public final static ItemStack LIANG_JIE_SHUANG_YAN = new ItemStack(Material.STRING, 1);
    public final static ItemStack YAO_CHI_LING_ZHU = new ItemStack(Material.STRING, 1);
    public final static ItemStack YAO_CHI_XIAN_LU = new ItemStack(Material.STRING, 1);
    public final static ItemStack QIAN_CHEN_JING = new ItemStack(Material.STRING, 1);
    public final static ItemStack TIAN_SHAN_XUE_LIAN = new ItemStack(Material.STRING, 1);
    public final static ItemStack QIAN_NIAN_BIN_PO = new ItemStack(Material.STRING, 1);
    public final static ItemStack BIN_LONG_LIN_JIA = new ItemStack(Material.STRING, 1);
    public final static ItemStack WAN_NIAN_BIN_HUN = new ItemStack(Material.STRING, 1);

    //BOSS材料

    //蜘蛛女王
    public final static ItemStack ZHU_WANG_YAN  = new ItemStack(Material.STRING, 1);

    //涧溪鬼魅
    public final static ItemStack HE_SHUI_LING = new ItemStack(Material.STRING,1);

    //林幽毒蛛
    public final static ItemStack MENG_DU_SU = new ItemStack(Material.STRING, 1);

    //凶神太岁
    public final static ItemStack TAI_SUI = new ItemStack(Material.STRING, 1);

    //马贼团长
    public final static ItemStack TUAN_ZHANG_LING = new ItemStack(Material.STRING, 1);

    //紫焰燃灵
    public final static ItemStack ZI_YAN = new ItemStack(Material.STRING, 1);

    //焦骨战士
    public final static ItemStack JIAO_GU = new ItemStack(Material.STRING, 1);

    //巨力金刚
    public final static ItemStack JIN_GANG = new ItemStack(Material.STRING, 1);

    //幽窟厉尸
    public final static ItemStack YAO_SHI_NEI_DAN = new ItemStack(Material.STRING, 1);

    //千里小白
    public final static ItemStack BAI_GU = new ItemStack(Material.STRING, 1);

    //潜渊光魦
    public final static ItemStack MIAO_LING = new ItemStack(Material.STRING, 1);

    //渊海奇蛟
    public final static ItemStack YUAN_XUAN_FANG = new ItemStack(Material.STRING, 1);


    static {
        BI_SHI_SUI.setCustomModelData(1);
        AO_LANG_PI.setCustomModelData(2);
        CHI_TONG_DING.setCustomModelData(3);
        BA_JIAO_YE.setCustomModelData(4);
        XUAN_TIE_DING.setCustomModelData(5);
        LIU_YIN_CHOU.setCustomModelData(6);
        LING_YU_JIAN.setCustomModelData(7);
        NIE_PAN_YU.setCustomModelData(8);
        SHEN_ZAO_TIE.setCustomModelData(9);
        HUANG_TU_SHEN_QIU.setCustomModelData(10);
        YAN_GUI_ZHI_JIN.setCustomModelData(11);
        LIU_GUANG_LIN_JUAN.setCustomModelData(12);
        MING_LEI_YOU_SHA.setCustomModelData(13);
        QI_CAI_XIAN_YU.setCustomModelData(14);
        DU_ZHU_YA.setCustomModelData(15);
        KU_XIU_GU.setCustomModelData(16);
        BAI_SHE_LIN.setCustomModelData(17);
        HUANG_TONG_KUANG.setCustomModelData(18);
        RONG_YAN_SHA.setCustomModelData(19);
        YAN_YANG_HUA.setCustomModelData(20);
        GUI_YOU_HUO.setCustomModelData(21);
        CHI_SHA_MO.setCustomModelData(22);
        LIU_LUO_ZHU.setCustomModelData(23);
        YU_HENG_SHI.setCustomModelData(24);
        RONG_LIAN_SHI.setCustomModelData(25);
        TIAN_SHU_SHI.setCustomModelData(26);
        CHEN_SHUI_TIE.setCustomModelData(27);
        JI_LANG_LUO.setCustomModelData(28);
        MING_HAI_JIN.setCustomModelData(29);
        BI_BO_JING.setCustomModelData(30);
        QI_CAI_JIN.setCustomModelData(31);
        WAN_YUE_YIN.setCustomModelData(32);
        QIAN_NIAN_YU.setCustomModelData(33);
        XUE_YING_SHI.setCustomModelData(34);
        SHAN_MEI_JIN_TIE.setCustomModelData(35);
        ZHANG_NIE_YIN_TIE.setCustomModelData(36);
        CHENG_YAN_SHEN_HUO.setCustomModelData(37);
        CHI_YANG_SHEN_HUO.setCustomModelData(38);
        LIANG_JIE_SHUANG_YAN.setCustomModelData(39);
        YAO_CHI_LING_ZHU.setCustomModelData(40);
        YAO_CHI_XIAN_LU.setCustomModelData(41);
        QIAN_CHEN_JING.setCustomModelData(42);
        TIAN_SHAN_XUE_LIAN.setCustomModelData(43);
        QIAN_NIAN_BIN_PO.setCustomModelData(44);
        BIN_LONG_LIN_JIA.setCustomModelData(45);
        WAN_NIAN_BIN_HUN.setCustomModelData(46);
        ZHU_WANG_YAN.setCustomModelData(47);
        HE_SHUI_LING.setCustomModelData(48);
        MENG_DU_SU.setCustomModelData(49);
        TAI_SUI.setCustomModelData(50);
        TUAN_ZHANG_LING.setCustomModelData(51);
        ZI_YAN.setCustomModelData(52);
        JIAO_GU.setCustomModelData(53);
        JIN_GANG.setCustomModelData(54);
        YAO_SHI_NEI_DAN.setCustomModelData(55);
        BAI_GU.setCustomModelData(56);
        MIAO_LING.setCustomModelData(57);
        YUAN_XUAN_FANG.setCustomModelData(58);

        ItemMeta bishisui = BI_SHI_SUI.getItemMeta();
        bishisui.setMaxStackSize(99);
        bishisui.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bishisui");
        bishisui.displayName(
                Component.text("碧石碎").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        bishisui.lore(
               List.of(
                       ComponentSet.RARE2,
                       Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
               )
        );
        BI_SHI_SUI.setItemMeta(bishisui);

        ItemMeta aolangpi = AO_LANG_PI.getItemMeta();
        aolangpi.setMaxStackSize(99);
        aolangpi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"aolangpi");
        aolangpi.displayName(
                Component.text("獒狼皮").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        aolangpi.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        AO_LANG_PI.setItemMeta(aolangpi);

        ItemMeta chitongding = CHI_TONG_DING.getItemMeta();
        chitongding.setMaxStackSize(99);
        chitongding.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"chitongding");
        chitongding.displayName(
                Component.text("赤铜锭").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        chitongding.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        CHI_TONG_DING.setItemMeta(chitongding);

        ItemMeta bajiaoye = BA_JIAO_YE.getItemMeta();
        bajiaoye.setMaxStackSize(99);
        bajiaoye.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bajiaoye");
        bajiaoye.displayName(
                Component.text("芭蕉叶").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        bajiaoye.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        BA_JIAO_YE.setItemMeta(bajiaoye);

        ItemMeta xuantieding = XUAN_TIE_DING.getItemMeta();
        xuantieding.setMaxStackSize(99);
        xuantieding.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xuantieding");
        xuantieding.displayName(
                Component.text("玄铁锭").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        xuantieding.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        XUAN_TIE_DING.setItemMeta(xuantieding);

        ItemMeta liuyinchou = LIU_YIN_CHOU.getItemMeta();
        liuyinchou.setMaxStackSize(99);
        liuyinchou.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"liuyinchou");
        liuyinchou.displayName(
                Component.text("流音绸").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        liuyinchou.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        LIU_YIN_CHOU.setItemMeta(liuyinchou);

        ItemMeta lingyujian = LING_YU_JIAN.getItemMeta();
        lingyujian.setMaxStackSize(99);
        lingyujian.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"lingyujian");
        lingyujian.displayName(
                Component.text("灵玉简").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        lingyujian.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        LING_YU_JIAN.setItemMeta(lingyujian);

        ItemMeta niepanyu = NIE_PAN_YU.getItemMeta();
        niepanyu.setMaxStackSize(99);
        niepanyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"niepanyu");
        niepanyu.displayName(
                Component.text("涅槃羽").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        niepanyu.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        NIE_PAN_YU.setItemMeta(niepanyu);

        ItemMeta shenzaotie = SHEN_ZAO_TIE.getItemMeta();
        shenzaotie.setMaxStackSize(99);
        shenzaotie.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"shenzaotie");
        shenzaotie.displayName(
                Component.text("神造铁").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        shenzaotie.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        SHEN_ZAO_TIE.setItemMeta(shenzaotie);

        ItemMeta huangtushenqiu = HUANG_TU_SHEN_QIU.getItemMeta();
        huangtushenqiu.setMaxStackSize(99);
        huangtushenqiu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"huangtushenqiu");
        huangtushenqiu.displayName(
                Component.text("皇图神裘").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        huangtushenqiu.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        HUANG_TU_SHEN_QIU.setItemMeta(huangtushenqiu);

        ItemMeta yanguizhijin = YAN_GUI_ZHI_JIN.getItemMeta();
        yanguizhijin.setMaxStackSize(99);
        yanguizhijin.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanguizhijin");
        yanguizhijin.displayName(
                Component.text("炎鬼织锦").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        yanguizhijin.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        YAN_GUI_ZHI_JIN.setItemMeta(yanguizhijin);

        ItemMeta liuguanglinjuan = LIU_GUANG_LIN_JUAN.getItemMeta();
        liuguanglinjuan.setMaxStackSize(99);
        liuguanglinjuan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"liuguanglinjuan");
        liuguanglinjuan.displayName(
                Component.text("流光灵绢").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        liuguanglinjuan.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        LIU_GUANG_LIN_JUAN.setItemMeta(liuguanglinjuan);

        ItemMeta mingleiyousha = MING_LEI_YOU_SHA.getItemMeta();
        mingleiyousha.setMaxStackSize(99);
        mingleiyousha.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"mingleiyousha");
        mingleiyousha.displayName(
                Component.text("鸣泪幽纱").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        mingleiyousha.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        MING_LEI_YOU_SHA.setItemMeta(mingleiyousha);

        ItemMeta zhangnieyintie = ZHANG_NIE_YIN_TIE.getItemMeta();
        zhangnieyintie.setMaxStackSize(99);
        zhangnieyintie.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zhangnieyintie");
        zhangnieyintie.displayName(
                Component.text("瘴孽阴铁").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        zhangnieyintie.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        ZHANG_NIE_YIN_TIE.setItemMeta(zhangnieyintie);

        ItemMeta qicaixianyu = QI_CAI_XIAN_YU.getItemMeta();
        qicaixianyu.setMaxStackSize(99);
        qicaixianyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"qicaixianyu");
        qicaixianyu.displayName(
                Component.text("七彩仙玉").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC,false)
        );
        qicaixianyu.lore(
                List.of(
                        ComponentSet.RARE7,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        QI_CAI_XIAN_YU.setItemMeta(qicaixianyu);

        ItemMeta duzhuya = DU_ZHU_YA.getItemMeta();
        duzhuya.setMaxStackSize(99);
        duzhuya.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"duzhuya");
        duzhuya.displayName(
                Component.text("毒蛛牙").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        duzhuya.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        DU_ZHU_YA.setItemMeta(duzhuya);

        ItemMeta kuxiugu = KU_XIU_GU.getItemMeta();
        kuxiugu.setMaxStackSize(99);
        kuxiugu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"kuxiugu");
        kuxiugu.displayName(
                Component.text("枯朽骨").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        kuxiugu.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        KU_XIU_GU.setItemMeta(kuxiugu);

        ItemMeta baishelin = BAI_SHE_LIN.getItemMeta();
        baishelin.setMaxStackSize(99);
        baishelin.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"baishelin");
        baishelin.displayName(
                Component.text("白蛇鳞").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        baishelin.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        BAI_SHE_LIN.setItemMeta(baishelin);

        ItemMeta huangtongkuang = HUANG_TONG_KUANG.getItemMeta();
        huangtongkuang.setMaxStackSize(99);
        huangtongkuang.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"huangtongkuang");
        huangtongkuang.displayName(
                Component.text("黄铜矿").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        huangtongkuang.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        HUANG_TONG_KUANG.setItemMeta(huangtongkuang);

        ItemMeta rongyansha = RONG_YAN_SHA.getItemMeta();
        rongyansha.setMaxStackSize(99);
        rongyansha.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"rongyansha");
        rongyansha.displayName(
                Component.text("熔岩砂").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        rongyansha.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        RONG_YAN_SHA.setItemMeta(rongyansha);

        ItemMeta yanyanghua = YAN_YANG_HUA.getItemMeta();
        yanyanghua.setMaxStackSize(99);
        yanyanghua.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yanyanghua");
        yanyanghua.displayName(
                Component.text("炎阳花").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        yanyanghua.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        YAN_YANG_HUA.setItemMeta(yanyanghua);

        ItemMeta guiyouhuo = GUI_YOU_HUO.getItemMeta();
        guiyouhuo.setMaxStackSize(99);
        guiyouhuo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"guiyouhuo");
        guiyouhuo.displayName(
                Component.text("鬼幽火").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        guiyouhuo.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        GUI_YOU_HUO.setItemMeta(guiyouhuo);

        ItemMeta chishamo = CHI_SHA_MO.getItemMeta();
        chishamo.setMaxStackSize(99);
        chishamo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"chishamo");
        chishamo.displayName(
                Component.text("赤砂末").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        chishamo.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        CHI_SHA_MO.setItemMeta(chishamo);

        ItemMeta liuluozhu = LIU_LUO_ZHU.getItemMeta();
        liuluozhu.setMaxStackSize(99);
        liuluozhu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"liuluozhu");
        liuluozhu.displayName(
                Component.text("琉洛珠").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        liuluozhu.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        LIU_LUO_ZHU.setItemMeta(liuluozhu);

        ItemMeta yuhengshi = YU_HENG_SHI.getItemMeta();
        yuhengshi.setMaxStackSize(99);
        yuhengshi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yuhengshi");
        yuhengshi.displayName(
                Component.text("玉衡石").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        yuhengshi.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        YU_HENG_SHI.setItemMeta(yuhengshi);

        ItemMeta ronglianshi = RONG_LIAN_SHI.getItemMeta();
        ronglianshi.setMaxStackSize(99);
        ronglianshi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"ronglianshi");
        ronglianshi.displayName(
                Component.text("熔炼石").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        ronglianshi.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        RONG_LIAN_SHI.setItemMeta(ronglianshi);

        ItemMeta tianshushi = TIAN_SHU_SHI.getItemMeta();
        tianshushi.setMaxStackSize(99);
        tianshushi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tianshushi");
        tianshushi.displayName(
                Component.text("天枢石").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        tianshushi.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        TIAN_SHU_SHI.setItemMeta(tianshushi);

        ItemMeta chenshuitie = CHEN_SHUI_TIE.getItemMeta();
        chenshuitie.setMaxStackSize(99);
        chenshuitie.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"chenshuitie");
        chenshuitie.displayName(
                Component.text("沉水铁").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        chenshuitie.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        CHEN_SHUI_TIE.setItemMeta(chenshuitie);

        ItemMeta jilangluo = JI_LANG_LUO.getItemMeta();
        jilangluo.setMaxStackSize(99);
        jilangluo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jilangluo");
        jilangluo.displayName(
                Component.text("激浪螺").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        jilangluo.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        JI_LANG_LUO.setItemMeta(jilangluo);

        ItemMeta minghaijin = MING_HAI_JIN.getItemMeta();
        minghaijin.setMaxStackSize(99);
        minghaijin.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"minghaijin");
        minghaijin.displayName(
                Component.text("冥海晶").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        minghaijin.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        MING_HAI_JIN.setItemMeta(minghaijin);

        ItemMeta bibojing = BI_BO_JING.getItemMeta();
        bibojing.setMaxStackSize(99);
        bibojing.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bibojing");
        bibojing.displayName(
                Component.text("碧波净").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        bibojing.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        BI_BO_JING.setItemMeta(bibojing);

        ItemMeta qicaijin = QI_CAI_JIN.getItemMeta();
        qicaijin.setMaxStackSize(99);
        qicaijin.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"qicaijin");
        qicaijin.displayName(
                Component.text("七彩晶").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );
        qicaijin.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        QI_CAI_JIN.setItemMeta(qicaijin);


        ItemMeta wanyueyin = WAN_YUE_YIN.getItemMeta();
        wanyueyin.setMaxStackSize(99);
        wanyueyin.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"wanyueyin");
        wanyueyin.displayName(
                Component.text("挽月银").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );
        wanyueyin.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        WAN_YUE_YIN.setItemMeta(wanyueyin);

        ItemMeta qiannianyu = QIAN_NIAN_YU.getItemMeta();
        qiannianyu.setMaxStackSize(99);
        qiannianyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"qiannianyu");
        qiannianyu.displayName(
                Component.text("千炼玉").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        qiannianyu.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        QIAN_NIAN_YU.setItemMeta(qiannianyu);

        ItemMeta shanmeijintie = SHAN_MEI_JIN_TIE.getItemMeta();
        shanmeijintie.setMaxStackSize(99);
        shanmeijintie.getPersistentDataContainer().set(DataContainer.id,PersistentDataType.STRING,"shanmeijintie");
        shanmeijintie.displayName(
                Component.text("山魅精铁").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        shanmeijintie.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        SHAN_MEI_JIN_TIE.setItemMeta(shanmeijintie);

        ItemMeta xueyingshi = XUE_YING_SHI.getItemMeta();
        xueyingshi.setMaxStackSize(99);
        xueyingshi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xueyingshi");
        xueyingshi.displayName(
                Component.text("血影石").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        xueyingshi.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        XUE_YING_SHI.setItemMeta(xueyingshi);

        ItemMeta chengyanshenhuo = CHENG_YAN_SHEN_HUO.getItemMeta();
        chengyanshenhuo.setMaxStackSize(99);
        chengyanshenhuo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"chengyanshenhuo");
        chengyanshenhuo.displayName(
                Component.text("橙焰神火").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        chengyanshenhuo.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        CHENG_YAN_SHEN_HUO.setItemMeta(chengyanshenhuo);

        ItemMeta chiyangshenhuo = CHI_YANG_SHEN_HUO.getItemMeta();
        chiyangshenhuo.setMaxStackSize(99);
        chiyangshenhuo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"chiyangshenhuo");
        chiyangshenhuo.displayName(
                Component.text("赤阳神火").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        chiyangshenhuo.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        CHI_YANG_SHEN_HUO.setItemMeta(chiyangshenhuo);

        ItemMeta liangjieshuangyan = LIANG_JIE_SHUANG_YAN.getItemMeta();
        liangjieshuangyan.setMaxStackSize(99);
        liangjieshuangyan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"liangjieshuangyan");
        liangjieshuangyan.displayName(
                Component.text("两界霜炎").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        liangjieshuangyan.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        LIANG_JIE_SHUANG_YAN.setItemMeta(liangjieshuangyan);

        ItemMeta yaochilingzhu = YAO_CHI_LING_ZHU.getItemMeta();
        yaochilingzhu.setMaxStackSize(99);
        yaochilingzhu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yaochilingzhu");
        yaochilingzhu.displayName(
                Component.text("瑶池灵珠").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        yaochilingzhu.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        YAO_CHI_LING_ZHU.setItemMeta(yaochilingzhu);

        ItemMeta yaochixianlu = YAO_CHI_XIAN_LU.getItemMeta();
        yaochixianlu.setMaxStackSize(99);
        yaochixianlu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yaochixianlu");
        yaochixianlu.displayName(
                Component.text("瑶池仙露").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        yaochixianlu.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        YAO_CHI_XIAN_LU.setItemMeta(yaochixianlu);

        ItemMeta qianchenjing = QIAN_CHEN_JING.getItemMeta();
        qianchenjing.setMaxStackSize(99);
        qianchenjing.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"qianchenjing");
        qianchenjing.displayName(
                Component.text("前尘镜").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        qianchenjing.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        QIAN_CHEN_JING.setItemMeta(qianchenjing);

        ItemMeta tianshanxuelian = TIAN_SHAN_XUE_LIAN.getItemMeta();
        tianshanxuelian.setMaxStackSize(99);
        tianshanxuelian.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tianshanxuelian");
        tianshanxuelian.displayName(
                Component.text("天山雪莲").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        tianshanxuelian.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        TIAN_SHAN_XUE_LIAN.setItemMeta(tianshanxuelian);

        ItemMeta qiannianbinpo = QIAN_NIAN_BIN_PO.getItemMeta();
        qiannianbinpo.setMaxStackSize(99);
        qiannianbinpo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"qiannianbinpo");
        qiannianbinpo.displayName(
                Component.text("千年冰魄").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        qiannianbinpo.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        QIAN_NIAN_BIN_PO.setItemMeta(qiannianbinpo);

        ItemMeta binlonglinjia = BIN_LONG_LIN_JIA.getItemMeta();
        binlonglinjia.setMaxStackSize(99);
        binlonglinjia.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"binlonglinjia");
        binlonglinjia.displayName(
                Component.text("冰龙鳞甲").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        binlonglinjia.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        BIN_LONG_LIN_JIA.setItemMeta(binlonglinjia);

        ItemMeta wannianbinhun = WAN_NIAN_BIN_HUN.getItemMeta();
        wannianbinhun.setMaxStackSize(99);
        wannianbinhun.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"wannianbinhun");
        wannianbinhun.displayName(
                Component.text("万年冰魂").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false)
        );
        wannianbinhun.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        WAN_NIAN_BIN_HUN.setItemMeta(wannianbinhun);

        ItemMeta zhuwangyan  =  ZHU_WANG_YAN.getItemMeta();
        zhuwangyan.setMaxStackSize(99);
        zhuwangyan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zhuwangyan");
        zhuwangyan.displayName(
                Component.text("蛛王眼").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        zhuwangyan.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        ZHU_WANG_YAN.setItemMeta(zhuwangyan);

        ItemMeta heshuiling  = HE_SHUI_LING.getItemMeta();
        heshuiling.setMaxStackSize(99);
        heshuiling.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"heshuiling");
        heshuiling.displayName(
                Component.text("河水灵").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        heshuiling.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        HE_SHUI_LING.setItemMeta(heshuiling);

        ItemMeta mengdusu = MENG_DU_SU.getItemMeta();
        mengdusu.setMaxStackSize(99);
        mengdusu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"mengdusu");
        mengdusu.displayName(
                Component.text("猛毒素").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        mengdusu.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        MENG_DU_SU.setItemMeta(mengdusu);

        ItemMeta taisui = TAI_SUI.getItemMeta();
        taisui.setMaxStackSize(99);
        taisui.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"taisui");
        taisui.displayName(
                Component.text("太岁").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        taisui.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        TAI_SUI.setItemMeta(taisui);

        ItemMeta tuanzhangling  = TUAN_ZHANG_LING.getItemMeta();
        tuanzhangling.setMaxStackSize(99);
        tuanzhangling.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tuanzhangling");
        tuanzhangling.displayName(
                Component.text("团长令").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        tuanzhangling.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        TUAN_ZHANG_LING.setItemMeta(tuanzhangling);

        ItemMeta ziyan  = ZI_YAN.getItemMeta();
        ziyan.setMaxStackSize(99);
        ziyan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"ziyan");
        ziyan.displayName(
                Component.text("紫焰").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );
        ziyan.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        ZI_YAN.setItemMeta(ziyan);

        ItemMeta jiaogu = JIAO_GU.getItemMeta();
        jiaogu.setMaxStackSize(99);
        jiaogu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jiaogu");
        jiaogu.displayName(
                Component.text("焦骨").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        jiaogu.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        JIAO_GU.setItemMeta(jiaogu);

        ItemMeta jinGang = JIN_GANG.getItemMeta();
        jinGang.setMaxStackSize(99);
        jinGang.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"jingang");
        jinGang.displayName(
                Component.text("金钢").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        jinGang.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        JIN_GANG.setItemMeta(jinGang);

        ItemMeta yaoShinNeiDan = YAO_SHI_NEI_DAN.getItemMeta();
        yaoShinNeiDan.setMaxStackSize(99);
        yaoShinNeiDan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yaoshineidan");
        yaoShinNeiDan.displayName(
                Component.text("妖尸内丹").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        yaoShinNeiDan.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        YAO_SHI_NEI_DAN.setItemMeta(yaoShinNeiDan);

        ItemMeta baiGu = BAI_GU.getItemMeta();
        baiGu.setMaxStackSize(99);
        baiGu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"baigu");
        baiGu.displayName(
                Component.text("白骨").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        baiGu.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        BAI_GU.setItemMeta(baiGu);

        ItemMeta miaoling = MIAO_LING.getItemMeta();
        miaoling.setMaxStackSize(99);
        miaoling.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"miaoling");
        miaoling.displayName(
                Component.text("魦鳞").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        miaoling.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        MIAO_LING.setItemMeta(miaoling);

        ItemMeta yuanxuanfang  = YUAN_XUAN_FANG.getItemMeta();
        yuanxuanfang.setMaxStackSize(99);
        yuanxuanfang.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yuanxuanfang");
        yuanxuanfang.displayName(
                Component.text("渊玄芳").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false)
        );
        yuanxuanfang.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("锻造材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true)
                )
        );
        YUAN_XUAN_FANG.setItemMeta(yuanxuanfang);



    }


}
