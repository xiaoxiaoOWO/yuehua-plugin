package com.xiaoxiaoowo.yuehua.itemstack.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public final class Money {
    public static final ItemStack tongQian = new ItemStack(Material.BRICK, 1);
    public static final ItemStack jinYuanBao = new ItemStack(Material.BRICK, 1);
    public static final ItemStack yinPiao = new ItemStack(Material.BRICK, 1);
    public static final ItemStack zuanShi = new ItemStack(Material.BRICK, 1);
    public static final ItemStack MONEY_SHEN = new ItemStack(Material.BRICK, 1);
    public static final ItemStack MONEY_XIAN = new ItemStack(Material.BRICK, 1);
    public static final ItemStack MONEY_REN = new ItemStack(Material.BRICK, 1);
    public static final ItemStack MONEY_YAO = new ItemStack(Material.BRICK, 1);
    public static final ItemStack MONEY_ZHANSHEN = new ItemStack(Material.BRICK, 1);


    static {
        tongQian.setCustomModelData(1);
        jinYuanBao.setCustomModelData(2);
        yinPiao.setCustomModelData(3);
        zuanShi.setCustomModelData(4);
        MONEY_SHEN.setCustomModelData(5);
        MONEY_XIAN.setCustomModelData(6);
        MONEY_REN.setCustomModelData(7);
        MONEY_YAO.setCustomModelData(8);
        MONEY_ZHANSHEN.setCustomModelData(9);


        ItemMeta itemMetaTongQian = tongQian.getItemMeta();
        ItemMeta itemMetaJinYuanBao = jinYuanBao.getItemMeta();
        ItemMeta itemMetaYinPiao = yinPiao.getItemMeta();
        ItemMeta itemMetaZuanShi = zuanShi.getItemMeta();
        ItemMeta itemMetaMONEY_SHEN = MONEY_SHEN.getItemMeta();
        ItemMeta itemMetaMONEY_XIAN = MONEY_XIAN.getItemMeta();
        ItemMeta itemMetaMONEY_REN = MONEY_REN.getItemMeta();
        ItemMeta itemMetaMONEY_YAO = MONEY_YAO.getItemMeta();
        ItemMeta itemMetaMONEY_ZHANSHEN = MONEY_ZHANSHEN.getItemMeta();


        itemMetaTongQian.setMaxStackSize(99);
        itemMetaJinYuanBao.setMaxStackSize(99);
        itemMetaYinPiao.setMaxStackSize(99);
        itemMetaZuanShi.setMaxStackSize(99);
        itemMetaMONEY_SHEN.setMaxStackSize(99);
        itemMetaMONEY_XIAN.setMaxStackSize(99);
        itemMetaMONEY_REN.setMaxStackSize(99);
        itemMetaMONEY_YAO.setMaxStackSize(99);
        itemMetaMONEY_ZHANSHEN.setMaxStackSize(99);

        itemMetaTongQian.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "tongQian");
        itemMetaJinYuanBao.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jinYuanBao");
        itemMetaYinPiao.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yinPiao");
        itemMetaZuanShi.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "zuanShi");
        itemMetaMONEY_SHEN.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "MONEY_SHEN");
        itemMetaMONEY_XIAN.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "MONEY_XIAN");
        itemMetaMONEY_REN.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "MONEY_REN");
        itemMetaMONEY_YAO.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "MONEY_YAO");
        itemMetaMONEY_ZHANSHEN.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "MONEY_ZHANSHEN");

        itemMetaTongQian.displayName(
                Component.text("铜钱").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaJinYuanBao.displayName(
                Component.text("银元宝").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaYinPiao.displayName(
                Component.text("金元宝").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaZuanShi.displayName(
                Component.text("银票").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaMONEY_SHEN.displayName(
                Component.text("神性").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaMONEY_XIAN.displayName(
                Component.text("飞仙璧").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaMONEY_REN.displayName(
                Component.text("银元").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaMONEY_YAO.displayName(
                Component.text("灵木枝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC,false)
        );

        itemMetaMONEY_ZHANSHEN.displayName(
                Component.text("战神令").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC,false)
        );

        tongQian.setItemMeta(itemMetaTongQian);
        jinYuanBao.setItemMeta(itemMetaJinYuanBao);
        yinPiao.setItemMeta(itemMetaYinPiao);
        zuanShi.setItemMeta( itemMetaZuanShi);
        MONEY_SHEN.setItemMeta(itemMetaMONEY_SHEN);
        MONEY_XIAN.setItemMeta(itemMetaMONEY_XIAN);
        MONEY_REN.setItemMeta(itemMetaMONEY_REN);
        MONEY_YAO.setItemMeta(itemMetaMONEY_YAO);
        MONEY_ZHANSHEN.setItemMeta(itemMetaMONEY_ZHANSHEN);


    }
}
