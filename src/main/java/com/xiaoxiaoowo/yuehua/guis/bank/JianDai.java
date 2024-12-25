package com.xiaoxiaoowo.yuehua.guis.bank;

import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import static com.xiaoxiaoowo.yuehua.guis.bank.MoneyBank.hasEmptySlot;

public final class JianDai {
    public final static Inventory JIANDAI = Bukkit.createInventory(null, 18, Component.text("箭袋").color(NamedTextColor.AQUA));
    public final static ItemStack Arrow = Other.ARROW.clone();

    static {
        ItemStack ArrowGet1 = Other.ARROW.clone();
        ItemStack ArrowGet10 = Other.ARROW.clone();
        ItemStack ArrowGet99 = Other.ARROW.clone();
        ItemStack ArrowStoreAll = Other.ARROW.clone();
        ItemStack check = Other.ARROW.clone();

        ArrowGet1.setAmount(1);
        ArrowGet10.setAmount(10);
        ArrowGet99.setAmount(99);

        ItemMeta arrowget1 = ArrowGet1.getItemMeta();
        ItemMeta arrowget10 = ArrowGet10.getItemMeta();
        ItemMeta arrowget99 = ArrowGet99.getItemMeta();
        ItemMeta arrowstoreall = ArrowStoreAll.getItemMeta();
        ItemMeta check1 = check.getItemMeta();


        arrowget1.displayName(
                Component
                        .text("取出1支箭").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        arrowget10.displayName(
                Component
                        .text("取出10支箭").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        arrowget99.displayName(
                Component
                        .text("取出99支箭").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        arrowstoreall.displayName(
                Component
                        .text("存入背包所有箭").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );
        check1.displayName(
                Component
                        .text("查询箭袋内箭数").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true)
        );


        ArrowGet1.setItemMeta(arrowget1);
        ArrowGet10.setItemMeta(arrowget10);
        ArrowGet99.setItemMeta(arrowget99);
        ArrowStoreAll.setItemMeta(arrowstoreall);
        check.setItemMeta(check1);

        JIANDAI.setItem(0, ArrowGet1);
        JIANDAI.setItem(2, ArrowGet10);
        JIANDAI.setItem(4, ArrowGet99);
        JIANDAI.setItem(6, ArrowStoreAll);
        JIANDAI.setItem(8, check);
        JIANDAI.setItem(17, Yh.BACK_BEFORE);
    }

    public static void check(GongData gongData) {
        Player player = gongData.player;
        Scheduler.sync(player::closeInventory);
        SendInformation.sendMes(player,
                Component.text("§6[箭袋]§a剩余弓箭数量: §b" + gongData.arrow_count)
                        .appendNewline()
                        .append(Component.text("§6[箭袋]§a最大容量: §b" + gongData.arrow_count_max)));
    }

    public static void get(GongData gongData, int amount) {
        if (amount <= gongData.arrow_count) {
            Player player = gongData.player;
            PlayerInventory playerInventory = player.getInventory();
            if (!hasEmptySlot(playerInventory)) {
                return;
            }
            gongData.arrow_count -= amount;
            Arrow.setAmount(amount);
            player.getInventory().addItem(Arrow);
        }

    }

    public static void store(GongData gongData) {
        Player player = gongData.player;
        PlayerInventory playerInventory = player.getInventory();
        for (ItemStack itemStack : playerInventory.getContents()) {
            if (itemStack == null) {
                continue;
            }
            Material type = itemStack.getType();
            if (type != Material.ARROW) {
                continue;
            }
            int amount = itemStack.getAmount();
            int jiandaiAmoutLast = Math.max(0, gongData.arrow_count_max - gongData.arrow_count);
            if(jiandaiAmoutLast == 0){
                return;
            }

            if (jiandaiAmoutLast >= amount) {
                itemStack.setAmount(0);
                gongData.arrow_count += amount;
            } else {
                itemStack.setAmount(amount - jiandaiAmoutLast);
                gongData.arrow_count = gongData.arrow_count_max;
                return;
            }
        }
    }
}
