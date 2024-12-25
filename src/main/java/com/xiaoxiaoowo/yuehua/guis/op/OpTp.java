package com.xiaoxiaoowo.yuehua.guis.op;

import com.xiaoxiaoowo.yuehua.guis.Yh;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class OpTp {
    public static final Inventory OPTP = Bukkit.createInventory(null, 54,
            Component.text("OP重华晶").color(NamedTextColor.AQUA));

    static {
        OPTP.setItem(53, Yh.BACK_BEFORE);

        for (int i = 0; i < 23; i++) {
            ItemStack itemStack = new ItemStack(Material.YELLOW_DYE);
            itemStack.setCustomModelData(7);
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.displayName(Component
                    .text("物品管理")
                    .color(NamedTextColor.AQUA)
                    .decoration(TextDecoration.ITALIC, false)
                    .decoration(TextDecoration.BOLD, true)
            );
            itemStack.setItemMeta(itemMeta);
            OPTP.setItem(i, itemStack);
        }

        OPTP.getItem(1).setDisplayName("§b皇城中心");
        OPTP.getItem(2).setDisplayName("§b皇城东门");
        OPTP.getItem(3).setDisplayName("§b皇城西门");
        OPTP.getItem(4).setDisplayName("§b皇城南门");
        OPTP.getItem(5).setDisplayName("§b皇城北门");
        OPTP.getItem(6).setDisplayName("§b铁匠铺");
        OPTP.getItem(7).setDisplayName("§b炼丹房");
        OPTP.getItem(8).setDisplayName("§b森林入口");
        OPTP.getItem(9).setDisplayName("§b龙须镇");
        OPTP.getItem(10).setDisplayName("§b山神庙");
        OPTP.getItem(11).setDisplayName("§b神木妖精");
        OPTP.getItem(12).setDisplayName("§b王员外");
        OPTP.getItem(13).setDisplayName("§b温泉客栈");
        OPTP.getItem(14).setDisplayName("§b沙漠客栈");
        OPTP.getItem(15).setDisplayName("§b沙漠村庄");
        OPTP.getItem(16).setDisplayName("§b沙漠石碑");
        OPTP.getItem(17).setDisplayName("§b陈大夫");
        OPTP.getItem(18).setDisplayName("§b山洞村庄");
        OPTP.getItem(19).setDisplayName("§b大世界镇妖塔");
        OPTP.getItem(20).setDisplayName("§b水族村庄");
        OPTP.getItem(21).setDisplayName("§b白骨精");
        OPTP.getItem(22).setDisplayName("§b蓬莱渡口");



    }

}
