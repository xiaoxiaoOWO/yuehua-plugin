package com.xiaoxiaoowo.yuehua.items.liandan;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Herb {

    //3阶
    public static final ItemStack RenShen = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack LingZhi = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack HeShouWu = new ItemStack(Material.FEATHER, 1);

    //4阶,其中河豚不是怪物掉落
    public static final ItemStack GouQi = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack HeTun = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack WangYouCao = new ItemStack(Material.FEATHER, 1);

    //5阶，其中阿胶不少怪物掉落
    public static final ItemStack ZhenZhu = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack LuRong = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack PuTiZi = new ItemStack(Material.FEATHER, 1);

    //6阶，全都不是怪物掉落
    public static final ItemStack BaJiaoXuanBinCao = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack LieHuoXinJiaoShu = new ItemStack(Material.FEATHER, 1);
    public static final ItemStack QiCaiFuRongHua = new ItemStack(Material.FEATHER, 1);

    static {


        ItemMeta itemMeta1 = RenShen.getItemMeta();
        ItemMeta itemMeta2 = LingZhi.getItemMeta();
        ItemMeta itemMeta3 = HeShouWu.getItemMeta();
        ItemMeta itemMeta4 = GouQi.getItemMeta();
        ItemMeta itemMeta5 = HeTun.getItemMeta();
        ItemMeta itemMeta6 = WangYouCao.getItemMeta();
        ItemMeta itemMeta7 = ZhenZhu.getItemMeta();
        ItemMeta itemMeta8 = LuRong.getItemMeta();
        ItemMeta itemMeta9 = PuTiZi.getItemMeta();
        ItemMeta itemMeta10 = BaJiaoXuanBinCao.getItemMeta();
        ItemMeta itemMeta11 = LieHuoXinJiaoShu.getItemMeta();
        ItemMeta itemMeta12 = QiCaiFuRongHua.getItemMeta();

        itemMeta1.setMaxStackSize(99);
        itemMeta2.setMaxStackSize(99);
        itemMeta3.setMaxStackSize(99);
        itemMeta4.setMaxStackSize(99);
        itemMeta5.setMaxStackSize(99);
        itemMeta6.setMaxStackSize(99);
        itemMeta7.setMaxStackSize(99);
        itemMeta8.setMaxStackSize(99);
        itemMeta9.setMaxStackSize(99);
        itemMeta10.setMaxStackSize(99);
        itemMeta11.setMaxStackSize(99);
        itemMeta12.setMaxStackSize(99);

        itemMeta1.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "renshen");
        itemMeta2.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "lingzhi");
        itemMeta3.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "heshouwu");
        itemMeta4.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "gouqi");
        itemMeta5.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "hetun");
        itemMeta6.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wangyoucao");
        itemMeta7.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zhenzhu");
        itemMeta8.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "lurong");
        itemMeta9.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "putizi");
        itemMeta10.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "bajiaoxuanbincao");
        itemMeta11.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "liehuoxinjiaoshu");
        itemMeta12.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qicaifuronghua");

        itemMeta1.displayName(
                Component
                        .text("人参").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)

        );

        itemMeta2.displayName(
                Component
                        .text("灵芝").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta3.displayName(
                Component
                        .text("千年何首乌").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta4.displayName(
                Component
                        .text("枸杞").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta5.displayName(
                Component
                        .text("河豚").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta6.displayName(
                Component
                        .text("忘忧草").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta7.displayName(
                Component
                        .text("珍珠").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta8.displayName(
                Component
                        .text("鹿茸").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta9.displayName(
                Component
                        .text("菩提子").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta10.displayName(
                Component
                        .text("八角玄冰草").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta11.displayName(
                Component
                        .text("烈火杏娇疏").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        itemMeta12.displayName(
                Component
                        .text("七彩芙蓉花").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );

        itemMeta1.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );

        itemMeta2.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta3.lore(
                List.of(ComponentSet.RARE3,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta4.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta5.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta6.lore(
                List.of(ComponentSet.RARE4,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta7.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta8.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta9.lore(
                List.of(ComponentSet.RARE5,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta10.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta11.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );
        itemMeta12.lore(
                List.of(ComponentSet.RARE6,
                        Component.text("炼制丹药的材料").color(NamedTextColor.GRAY).decoration(TextDecoration.ITALIC, true)
                )
        );

        RenShen.setItemMeta(itemMeta1);
        LingZhi.setItemMeta(itemMeta2);
        HeShouWu.setItemMeta(itemMeta3);
        GouQi.setItemMeta(itemMeta4);
        HeTun.setItemMeta(itemMeta5);
        WangYouCao.setItemMeta(itemMeta6);
        ZhenZhu.setItemMeta(itemMeta7);
        LuRong.setItemMeta(itemMeta8);
        PuTiZi.setItemMeta(itemMeta9);
        BaJiaoXuanBinCao.setItemMeta(itemMeta10);
        LieHuoXinJiaoShu.setItemMeta(itemMeta11);
        QiCaiFuRongHua.setItemMeta(itemMeta12);
        QiCaiFuRongHua.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/12"));
        LieHuoXinJiaoShu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/11"));
        BaJiaoXuanBinCao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/10"));
        PuTiZi.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/9"));
        LuRong.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/8"));
        ZhenZhu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/7"));
        WangYouCao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/6"));
        HeTun.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/5"));
        GouQi.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/4"));
        HeShouWu.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/3"));
        LingZhi.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/2"));
        RenShen.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "feather/1"));
    }
}
