package com.xiaoxiaoowo.yuehua.itemstack.other;

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

public final class MoneyLoot {
    //稀有度1
    public static final ItemStack ZHI_ZHU_YAN = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack PI_GE = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack TU_ZI_PI = new ItemStack(Material.DIAMOND, 1);


    //稀有度2
    public static final ItemStack MEI_TAN = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack XIAO_MAI = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack FU_ZHU = new ItemStack(Material.DIAMOND, 1);

    //稀有度3
    public static final ItemStack XI_RANG = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack TAO_CI_SUI = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack CU_TIE = new ItemStack(Material.DIAMOND, 1);

    //稀有度4
    public static final ItemStack YAO_NIAO_YU = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack YAO_NIAO_LEI = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack SHAN_HU_SHI = new ItemStack(Material.DIAMOND, 1);

    //稀有度5
    public static final ItemStack ZHANG_QI_TOU_LU = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack GOU_YU_BAI = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack GOU_YU_HEI = new ItemStack(Material.DIAMOND, 1);

    //稀有度6
    public static final ItemStack HU_PO = new ItemStack(Material.DIAMOND, 1);
    public static final ItemStack BIN_TIE = new ItemStack(Material.DIAMOND, 1);


    static {
        ZHI_ZHU_YAN.setCustomModelData(1);
        PI_GE.setCustomModelData(2);
        TU_ZI_PI.setCustomModelData(3);
        MEI_TAN.setCustomModelData(4);
        XIAO_MAI.setCustomModelData(5);
        FU_ZHU.setCustomModelData(6);
        XI_RANG.setCustomModelData(7);
        TAO_CI_SUI.setCustomModelData(8);
        CU_TIE.setCustomModelData(9);
        YAO_NIAO_YU.setCustomModelData(10);
        YAO_NIAO_LEI.setCustomModelData(11);
        SHAN_HU_SHI.setCustomModelData(12);
        ZHANG_QI_TOU_LU.setCustomModelData(13);
        GOU_YU_BAI.setCustomModelData(14);
        GOU_YU_HEI.setCustomModelData(15);
        HU_PO.setCustomModelData(16);
        BIN_TIE.setCustomModelData(17);

        ItemMeta zhizhuyan = ZHI_ZHU_YAN.getItemMeta();
        zhizhuyan.setMaxStackSize(99);
        zhizhuyan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zhizhuyan");
        zhizhuyan.displayName( Component.text("蜘蛛眼").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false));
        zhizhuyan.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        ZHI_ZHU_YAN.setItemMeta(zhizhuyan);

        ItemMeta pige = PI_GE.getItemMeta();
        pige.setMaxStackSize(99);
        pige.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"pige");
        pige.displayName( Component.text("皮革").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false));
        pige.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        PI_GE.setItemMeta(pige);

        ItemMeta tuzipi = TU_ZI_PI.getItemMeta();
        tuzipi.setMaxStackSize(99);
        tuzipi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"tuzipi");
        tuzipi.displayName( Component.text("兔子皮").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false));
        tuzipi.lore(
                List.of(ComponentSet.RARE1,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        TU_ZI_PI.setItemMeta(tuzipi);



        ItemMeta meitan = MEI_TAN.getItemMeta();
        meitan.setMaxStackSize(99);
        meitan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"meitan");
        meitan.displayName( Component.text("煤炭").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false));
        meitan.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        MEI_TAN.setItemMeta(meitan);

        ItemMeta xiaomai = XIAO_MAI.getItemMeta();
        xiaomai.setMaxStackSize(99);
        xiaomai.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xiaomai");
        xiaomai.displayName( Component.text("小麦").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false));
        xiaomai.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        XIAO_MAI.setItemMeta(xiaomai);

        ItemMeta fuzhu = FU_ZHU.getItemMeta();
        fuzhu.setMaxStackSize(99);
        fuzhu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"fuzhu");
        fuzhu.displayName( Component.text("腐竹").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false));
        fuzhu.lore(
                List.of(ComponentSet.RARE2,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        FU_ZHU.setItemMeta(fuzhu);

        ItemMeta xirang = XI_RANG.getItemMeta();
        xirang.setMaxStackSize(99);
        xirang.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"xirang");
        xirang.displayName(Component.text("息壤").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false));
        xirang.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        XI_RANG.setItemMeta(xirang);

        ItemMeta taocisui = TAO_CI_SUI.getItemMeta();
        taocisui.setMaxStackSize(99);
        taocisui.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"taocisui");
        taocisui.displayName(Component.text("陶瓷碎").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false));
        taocisui.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        TAO_CI_SUI.setItemMeta(taocisui);

        ItemMeta cutie = CU_TIE.getItemMeta();
        cutie.setMaxStackSize(99);
        cutie.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"cutie");
        cutie.displayName(Component.text("粗铁").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false));
        cutie.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        CU_TIE.setItemMeta(cutie);


        ItemMeta yaoniaolei = YAO_NIAO_LEI.getItemMeta();
        yaoniaolei.setMaxStackSize(99);
        yaoniaolei.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yaoniaolei");
        yaoniaolei.displayName(Component.text("妖鸟泪").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false));
        yaoniaolei.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        YAO_NIAO_LEI.setItemMeta(yaoniaolei);

        ItemMeta shanhushi = SHAN_HU_SHI.getItemMeta();
        shanhushi.setMaxStackSize(99);
        shanhushi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"shanhushi");
        shanhushi.displayName(Component.text("珊瑚石").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false));
        shanhushi.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        SHAN_HU_SHI.setItemMeta(shanhushi);

        ItemMeta yaoniaoyu = YAO_NIAO_YU.getItemMeta();
        yaoniaoyu.setMaxStackSize(99);
        yaoniaoyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"yaoniaoyu");
        yaoniaoyu.displayName(Component.text("妖鸟羽").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false));
        yaoniaoyu.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        YAO_NIAO_YU.setItemMeta(yaoniaoyu);

        ItemMeta gouyubai = GOU_YU_BAI.getItemMeta();
        gouyubai.setMaxStackSize(99);
        gouyubai.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"gouyubai");
        gouyubai.displayName(Component.text("白色勾玉").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false));
        gouyubai.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        GOU_YU_BAI.setItemMeta(gouyubai);

        ItemMeta gouyuhei = GOU_YU_HEI.getItemMeta();
        gouyuhei.setMaxStackSize(99);
        gouyuhei.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"gouyuhei");
        gouyuhei.displayName(Component.text("黑色勾玉").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false));
        gouyuhei.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        GOU_YU_HEI.setItemMeta(gouyuhei);

        ItemMeta zhangqitoulu = ZHANG_QI_TOU_LU.getItemMeta();
        zhangqitoulu.setMaxStackSize(99);
        zhangqitoulu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"zhangqitoulu");
        zhangqitoulu.displayName(Component.text("附着瘴气的头颅").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC,false));
        zhangqitoulu.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        ZHANG_QI_TOU_LU.setItemMeta(zhangqitoulu);

        ItemMeta hupo = HU_PO.getItemMeta();
        hupo.setMaxStackSize(99);
        hupo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"hupo");
        hupo.displayName(Component.text("琥珀").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false));
        hupo.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        HU_PO.setItemMeta(hupo);

        ItemMeta bintie = BIN_TIE.getItemMeta();
        bintie.setMaxStackSize(99);
        bintie.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING,"bintie");
        bintie.displayName(Component.text("镔铁").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC,false));
        bintie.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("似乎有人在收购").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC,true))
        );
        BIN_TIE.setItemMeta(bintie);























    }
}
