package com.xiaoxiaoowo.yuehua.guis.bank;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public final class MoneyBank {
    public final static Inventory moneybank = Bukkit.createInventory(null, 36, Component.text("金钱银行").color(NamedTextColor.AQUA));
    public final static ItemStack tongqian = Money.tongQian.clone();
    public final static ItemStack yinyuanbao = Money.jinYuanBao.clone();
    public final static ItemStack jinyuanbao = Money.yinPiao.clone();
    public final static ItemStack yinpiao = Money.zuanShi.clone();

    static {
// 金钱部分
        ItemStack tongqian1 = Money.tongQian.clone();
        tongqian1.setAmount(1);
        ItemStack yinyuanbao1 = Money.jinYuanBao.clone();
        yinyuanbao1.setAmount(1);
        ItemStack jinyuanbao1 = Money.yinPiao.clone();
        jinyuanbao1.setAmount(1);
        ItemStack yinpiao1 = Money.zuanShi.clone();
        yinpiao1.setAmount(1);

        ItemStack tongqian10 = Money.tongQian.clone();
        tongqian10.setAmount(10);
        ItemStack yinyuanbao10 = Money.jinYuanBao.clone();
        yinyuanbao10.setAmount(10);
        ItemStack jinyuanbao10 = Money.yinPiao.clone();
        jinyuanbao10.setAmount(10);
        ItemStack yinpiao10 = Money.zuanShi.clone();
        yinpiao10.setAmount(10);

        ItemStack tongqian99 = Money.tongQian.clone();
        tongqian99.setAmount(99);
        ItemStack yinyuanbao99 = Money.jinYuanBao.clone();
        yinyuanbao99.setAmount(99);
        ItemStack jinyuanbao99 = Money.yinPiao.clone();
        jinyuanbao99.setAmount(99);
        ItemStack yinpiao99 = Money.zuanShi.clone();
        yinpiao99.setAmount(99);

        ItemStack check = Money.zuanShi.clone();


        ItemMeta tongqian1Meta = tongqian1.getItemMeta();
        tongqian1Meta.displayName(
                Component
                        .text("取出1铜钱").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        tongqian1.setItemMeta(tongqian1Meta);

        ItemMeta tongqian10Meta = tongqian10.getItemMeta();
        tongqian10Meta.displayName(
                Component
                        .text("取出10铜钱").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        tongqian10.setItemMeta(tongqian10Meta);

        ItemMeta tongqian99Meta = tongqian99.getItemMeta();
        tongqian99Meta.displayName(
                Component
                        .text("取出99铜钱").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        tongqian99.setItemMeta(tongqian99Meta);

        ItemMeta yinyuanbao1Meta = yinyuanbao1.getItemMeta();
        yinyuanbao1Meta.displayName(
                Component
                        .text("取出1银元宝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        yinyuanbao1.setItemMeta(yinyuanbao1Meta);

        ItemMeta yinyuanbao10Meta = yinyuanbao10.getItemMeta();
        yinyuanbao10Meta.displayName(
                Component
                        .text("取出10银元宝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        yinyuanbao10.setItemMeta(yinyuanbao10Meta);

        ItemMeta yinyuanbao99Meta = yinyuanbao99.getItemMeta();
        yinyuanbao99Meta.displayName(
                Component
                        .text("取出99银元宝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        yinyuanbao99.setItemMeta(yinyuanbao99Meta);

        ItemMeta jinyuanbao1Meta = jinyuanbao1.getItemMeta();
        jinyuanbao1Meta.displayName(
                Component
                        .text("取出1金元宝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        jinyuanbao1.setItemMeta(jinyuanbao1Meta);

        ItemMeta jinyuanbao10Meta = jinyuanbao10.getItemMeta();
        jinyuanbao10Meta.displayName(
                Component
                        .text("取出10金元宝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        jinyuanbao10.setItemMeta(jinyuanbao10Meta);

        ItemMeta jinyuanbao99Meta = jinyuanbao99.getItemMeta();
        jinyuanbao99Meta.displayName(
                Component
                        .text("取出99金元宝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        jinyuanbao99.setItemMeta(jinyuanbao99Meta);

        ItemMeta yinpiao1Meta = yinpiao1.getItemMeta();
        yinpiao1Meta.displayName(
                Component
                        .text("取出1银票").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        yinpiao1.setItemMeta(yinpiao1Meta);

        ItemMeta yinpiao10Meta = yinpiao10.getItemMeta();
        yinpiao10Meta.displayName(
                Component
                        .text("取出10银票").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        yinpiao10.setItemMeta(yinpiao10Meta);

        ItemMeta yinpiao99Meta = yinpiao99.getItemMeta();
        yinpiao99Meta.displayName(
                Component
                        .text("取出99银票").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        yinpiao99.setItemMeta(yinpiao99Meta);

        ItemMeta checkMeta = check.getItemMeta();
        checkMeta.displayName(
                Component
                        .text("查询余额").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        check.setItemMeta(checkMeta);

        moneybank.setItem(0, tongqian1);
        moneybank.setItem(9, tongqian10);
        moneybank.setItem(18, tongqian99);

        moneybank.setItem(2, yinyuanbao1);
        moneybank.setItem(11, yinyuanbao10);
        moneybank.setItem(20, yinyuanbao99);

        moneybank.setItem(4, jinyuanbao1);
        moneybank.setItem(13, jinyuanbao10);
        moneybank.setItem(22, jinyuanbao99);

        moneybank.setItem(6, yinpiao1);
        moneybank.setItem(15, yinpiao10);
        moneybank.setItem(24, yinpiao99);

        moneybank.setItem(8, check);
        moneybank.setItem(17, check);
        moneybank.setItem(26, check);


        moneybank.setItem(35, Yh.BACK_BEFORE);

    }

    public static void check(Data data) {
        Player player = data.player;
        Scheduler.sync(player::closeInventory);
        SendInformation.sendMes(player, Component.text("§6[金钱银行]§a当前余额: §b" + data.money));
    }

    //amout:物品数量
    //value：金额
    public static void get(String id, Data data, int amount, int value) {
        if (value <= data.money) {
            Player player = data.player;
            PlayerInventory playerInventory = player.getInventory();
            if (!hasEmptySlot(playerInventory)) {
                return;
            }
            data.money -= value;
            ItemStack huobi = switch (id) {
                case "铜钱" -> tongqian;
                case "银元宝" -> yinyuanbao;
                case "金元宝" -> jinyuanbao;
                case "银票" -> yinpiao;
                default -> null;
            };
            huobi.setAmount(amount);
            playerInventory.addItem(huobi);
        }
    }

    public static boolean hasEmptySlot(PlayerInventory playerInventory) {
        for (ItemStack item : playerInventory.getStorageContents()) {
            if (item == null) {
                return true; // 找到一个空槽
            }
        }
        return false; // 没有空槽
    }

    public static int countEmptySlots(PlayerInventory playerInventory) {
        int emptySlots = 0;
        for (ItemStack item : playerInventory.getStorageContents()) {
            if (item == null) {
                emptySlots++; // 统计空槽
            }
        }
        return emptySlots; // 返回空槽总数
    }

}
