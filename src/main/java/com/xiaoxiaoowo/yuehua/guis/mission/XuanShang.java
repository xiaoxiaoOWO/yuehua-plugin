package com.xiaoxiaoowo.yuehua.guis.mission;

import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class XuanShang {

    public static final Inventory XUAN_SHANG = Bukkit.createInventory(null, 9, Component.text("悬赏任务").color(NamedTextColor.AQUA));
    public static final Inventory XUAN_SHANG_JIEQU = Bukkit.createInventory(null, 9, Component.text("悬赏任务提取").color(NamedTextColor.AQUA));

    static {
        ItemStack xuanshangcheck = new ItemStack(Material.YELLOW_DYE);
        ItemMeta xuanshangcheckItemMeta = xuanshangcheck.getItemMeta();
        xuanshangcheckItemMeta.displayName(Component.text("查询悬赏任务与完成度").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshangcheck.setItemMeta(xuanshangcheckItemMeta);
        xuanshangcheck.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "yellow_dye/12"));
        XUAN_SHANG.setItem(0, xuanshangcheck);

        ItemStack xuanshangTijiao = new ItemStack(Material.YELLOW_DYE);
        ItemMeta xuanshangTijiaoItemMeta = xuanshangTijiao.getItemMeta();
        xuanshangTijiaoItemMeta.displayName(Component.text("提交悬赏任务").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshangTijiao.setItemMeta(xuanshangTijiaoItemMeta);
        xuanshangTijiao.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "yellow_dye/12"));
        XUAN_SHANG.setItem(1, xuanshangTijiao);

        ItemStack xuanshanglevelCheck = new ItemStack(Material.YELLOW_DYE);
        ItemMeta xuanshanglevelCheckItemMeta = xuanshanglevelCheck.getItemMeta();
        xuanshanglevelCheckItemMeta.displayName(Component.text("查询悬赏任务冷却").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshanglevelCheck.setItemMeta(xuanshanglevelCheckItemMeta);
        xuanshanglevelCheck.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "yellow_dye/12"));
        XUAN_SHANG.setItem(2, xuanshanglevelCheck);

        ItemStack xuanshanglevelRealCheck = new ItemStack(Material.YELLOW_DYE);
        ItemMeta xuanshanglevelRealCheckItemMeta = xuanshanglevelRealCheck.getItemMeta();
        xuanshanglevelRealCheckItemMeta.displayName(Component.text("查看悬赏等级").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshanglevelRealCheck.setItemMeta(xuanshanglevelRealCheckItemMeta);
        xuanshanglevelRealCheck.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "yellow_dye/12"));
        XUAN_SHANG.setItem(3, xuanshanglevelRealCheck);
        XUAN_SHANG.setItem(8, Yh.BACK_BEFORE);
    }


    public static void chechXuanshang(Player player) {

    }

    public static void tijiaoXuanshang(Player player) {

    }

    public static void checkXuanshangCd(Player player) {
        Scheduler.sync(player::closeInventory);
        long xuanshangCd = player.getPersistentDataContainer().get(DataContainer.xuanshangCd, PersistentDataType.LONG);
        long xuanshangCd_s = xuanshangCd / 20;
        SendInformation.sendMes(player, Component.text(String.format("§6[悬赏任务]§a距离下一次可接取悬赏任务的时间为: §b%ds", xuanshangCd_s)));
    }

    public static void checkXuanshangLevel(Player player) {
        Scheduler.sync(player::closeInventory);
        String level = switch (player.getPersistentDataContainer().get(DataContainer.xuanshanglevel, PersistentDataType.INTEGER)) {
            case 0 -> "子";
            case 1 -> "丑";
            case 2 -> "寅";
            case 3 -> "卯";
            case 4 -> "辰";
            case 5 -> "巳";
            case 6 -> "午";
            case 7 -> "未";
            case 8 -> "申";
            case 9 -> "酉";
            case 10 -> "戌";
            case 11 -> "亥";
            default -> "未知";
        };

        SendInformation.sendMes(player, Component.text("§6[悬赏任务]§a你的悬赏等级为: §b" + level));
    }
}
