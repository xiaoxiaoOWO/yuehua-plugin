package com.xiaoxiaoowo.yuehua.guis.other;

import com.xiaoxiaoowo.yuehua.items.PINZHENG;
import com.xiaoxiaoowo.yuehua.items.other.FuBen;
import com.xiaoxiaoowo.yuehua.items.other.XP;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Set;

public final class Advancenment {
    public static final Inventory ADV1 = Bukkit.createInventory(null, 54, Component.text("忠烈祠藏品").color(NamedTextColor.AQUA));
    public static final Inventory ADV2 = Bukkit.createInventory(null, 54, Component.text("忠烈祠奇品").color(NamedTextColor.AQUA));
    public static final Inventory ADV3 = Bukkit.createInventory(null, 9, Component.text("忠烈祠珍品").color(NamedTextColor.AQUA));

    public static final List<Integer> points1 = List.of(
            // 第一行
            50, 100, 150, 200, 250, 300, 350, 400, 450,
            // 第二行
            500, 550, 600, 650, 700, 750, 800, 850, 900,
            // 第三行
            950, 1000, 1050, 1100, 1150, 1200, 1250, 1300, 1350,
            // 第四行
            1400, 1450, 1500, 1550, 1600, 1650, 1700, 1750, 1800,
            // 第五行
            1850, 1900, 1950, 2000, 2050, 2100, 2150, 2200, 2250,
            // 第六行
            2300, 2350, 2400, 2450, 2500, 2550, 2600, 2650, 2700
    );

    public static final List<Integer> points2 = List.of(
            1000, 1400, 1800, 2200, 2600, 3000, 3400, 3800, 4200,
            4600, 5000, 5400, 5800, 6200, 6600, 7000, 7400, 7800,
            8200, 8600, 9000, 9400, 9800, 10200, 10600, 11000, 11400,
            11800, 12200, 12600, 13000, 13400, 13800, 14200, 14600, 15000,
            15400, 15800, 16200, 16600, 17000, 17400, 17800, 18200, 18600,
            19000, 19400, 19800, 20200, 20600, 21000, 21400, 21800, 22200
    );


    public static final List<Integer> points3 = List.of(
            10000, 14000, 18000, 22000, 26000, 30000, 34000, 38000, 42000
    );

    public static final Set<String> keyIds = Set.of("yaoshihe", "yaoshihe2", "yaoshihe3");


    static {
        ADV1.setContents(new ItemStack[]{
                //第一排 - XP物品
                changeAmount(XP.XP_100, 1), changeAmount(XP.XP_100, 2), changeAmount(XP.XP_100, 3),
                changeAmount(XP.XP_100, 4), changeAmount(XP.XP_100, 5), changeAmount(XP.XP_100, 6),
                changeAmount(XP.XP_100, 7), changeAmount(XP.XP_100, 8), changeAmount(XP.XP_100, 9),

                //第二排 - XP物品
                changeAmount(XP.XP_200, 1), changeAmount(XP.XP_200, 2), changeAmount(XP.XP_200, 3),
                changeAmount(XP.XP_200, 4), changeAmount(XP.XP_200, 5), changeAmount(XP.XP_200, 6),
                changeAmount(XP.XP_200, 7), changeAmount(XP.XP_200, 8), changeAmount(XP.XP_200, 9),

                //第三排 - XP物品
                changeAmount(XP.XP_500, 1), changeAmount(XP.XP_500, 2), changeAmount(XP.XP_500, 3),
                changeAmount(XP.XP_500, 4), changeAmount(XP.XP_500, 5), changeAmount(XP.XP_500, 6),
                changeAmount(XP.XP_500, 7), changeAmount(XP.XP_500, 8), changeAmount(XP.XP_500, 9),

                //第四排 - yushi1
                changeAmount(PINZHENG.yushi1, 1), changeAmount(PINZHENG.yushi1, 1), changeAmount(PINZHENG.yushi1, 1),
                changeAmount(PINZHENG.yushi1, 1), changeAmount(PINZHENG.yushi1, 1), changeAmount(PINZHENG.yushi1, 1),
                changeAmount(PINZHENG.yushi1, 1), changeAmount(PINZHENG.yushi1, 1), changeAmount(PINZHENG.yushi1, 1),

                //第五排 - yushi2
                changeAmount(PINZHENG.yushi2, 1), changeAmount(PINZHENG.yushi2, 1), changeAmount(PINZHENG.yushi2, 1),
                changeAmount(PINZHENG.yushi2, 1), changeAmount(PINZHENG.yushi2, 1), changeAmount(PINZHENG.yushi2, 1),
                changeAmount(PINZHENG.yushi2, 1), changeAmount(PINZHENG.yushi2, 1), changeAmount(PINZHENG.yushi2, 1),

                //第六排 - yushi3
                changeAmount(PINZHENG.yushi3, 1), changeAmount(PINZHENG.yushi3, 1), changeAmount(PINZHENG.yushi3, 1),
                changeAmount(PINZHENG.yushi3, 1), changeAmount(PINZHENG.yushi3, 1), changeAmount(PINZHENG.yushi3, 1),
                changeAmount(PINZHENG.yushi3, 1), changeAmount(PINZHENG.yushi3, 1), changeAmount(PINZHENG.yushi3, 1)
        });


        ADV2.setContents(new ItemStack[]{
                //第一排
                changeAmount(PINZHENG.yushi4, 1), changeAmount(PINZHENG.yushi4, 1), changeAmount(PINZHENG.yushi4, 1),
                changeAmount(PINZHENG.yaoshihe, 1), changeAmount(PINZHENG.yaoshihe, 1), changeAmount(PINZHENG.yaoshihe, 1),
                changeAmount(PINZHENG.yushi4, 1), changeAmount(PINZHENG.yushi4, 1), changeAmount(PINZHENG.yushi4, 1),
                //第二排
                changeAmount(PINZHENG.yushi4, 1), changeAmount(PINZHENG.yushi4, 1), changeAmount(PINZHENG.yushi4, 1),
                changeAmount(PINZHENG.yaoshihe, 1), changeAmount(PINZHENG.yaoshihe, 1), changeAmount(PINZHENG.yaoshihe, 1),
                changeAmount(PINZHENG.yaoshihe, 1), changeAmount(PINZHENG.yaoshihe, 1), changeAmount(PINZHENG.yaoshihe, 1),
                //第三排
                changeAmount(PINZHENG.yushi5, 1), changeAmount(PINZHENG.yushi5, 1), changeAmount(PINZHENG.yushi5, 1),
                changeAmount(PINZHENG.yaoshihe2, 1), changeAmount(PINZHENG.yaoshihe2, 1), changeAmount(PINZHENG.yaoshihe2, 1),
                changeAmount(PINZHENG.yushi5, 1), changeAmount(PINZHENG.yushi5, 1), changeAmount(PINZHENG.yushi5, 1),
                //第四排
                changeAmount(PINZHENG.yushi5, 1), changeAmount(PINZHENG.yushi5, 1), changeAmount(PINZHENG.yushi5, 1),
                changeAmount(PINZHENG.yaoshihe2, 1), changeAmount(PINZHENG.yaoshihe2, 1), changeAmount(PINZHENG.yaoshihe2, 1),
                changeAmount(PINZHENG.yaoshihe2, 1), changeAmount(PINZHENG.yaoshihe2, 1), changeAmount(PINZHENG.yaoshihe2, 1),
                //第五排
                changeAmount(PINZHENG.yushi6, 1), changeAmount(PINZHENG.yushi6, 1), changeAmount(PINZHENG.yushi6, 1),
                changeAmount(PINZHENG.yaoshihe3, 1), changeAmount(PINZHENG.yaoshihe3, 1), changeAmount(PINZHENG.yaoshihe3, 1),
                changeAmount(PINZHENG.yushi6, 1), changeAmount(PINZHENG.yushi6, 1), changeAmount(PINZHENG.yushi6, 1),
                //第六排
                changeAmount(PINZHENG.yushi6, 1), changeAmount(PINZHENG.yushi6, 1), changeAmount(PINZHENG.yushi6, 1),
                changeAmount(PINZHENG.yaoshihe3, 1), changeAmount(PINZHENG.yaoshihe3, 1), changeAmount(PINZHENG.yaoshihe3, 1),
                changeAmount(PINZHENG.yaoshihe3, 1), changeAmount(PINZHENG.yaoshihe3, 1), changeAmount(PINZHENG.yaoshihe3, 1),
        });


        ADV3.setContents(new ItemStack[]{
                changeAmount(FuBen.keyXinYun100, 1), changeAmount(PINZHENG.yushi7, 1), changeAmount(FuBen.keyXinYun100, 2),
                changeAmount(PINZHENG.yushi7, 1), changeAmount(FuBen.keyXinYun100, 3), changeAmount(PINZHENG.yushi8, 1),
                changeAmount(FuBen.keyXinYun100, 4), changeAmount(PINZHENG.yushi8, 1), changeAmount(FuBen.keyXinYun100, 5),

        });


        int count = 0;
        for (ItemStack itemStack : ADV1.getContents()) {
            if (itemStack != null) {
                ItemMeta itemMeta = itemStack.getItemMeta();
                List<Component> lores = itemMeta.lore();
                lores.add(
                        Component.text("§a所需成就点：§b " + points1.get(count))
                );
                itemMeta.lore(lores);
                itemStack.setItemMeta(itemMeta);
                count++;
            }
        }

        count = 0;
        for (ItemStack itemStack : ADV2.getContents()) {
            if (itemStack != null) {
                ItemMeta itemMeta = itemStack.getItemMeta();
                List<Component> lores = itemMeta.lore();
                lores.add(
                        Component.text("§a所需成就点：§b " + points2.get(count))
                );
                itemMeta.lore(lores);
                itemStack.setItemMeta(itemMeta);
                count++;
            }
        }

        count = 0;
        for (ItemStack itemStack : ADV3.getContents()) {
            if (itemStack != null) {
                ItemMeta itemMeta = itemStack.getItemMeta();
                List<Component> lores = itemMeta.lore();
                lores.add(
                        Component.text("§a所需成就点：§b " + points3.get(count))
                );
                itemMeta.lore(lores);
                itemStack.setItemMeta(itemMeta);
                count++;
            }
        }

    }

    public static ItemStack changeAmount(ItemStack itemStack, int amount) {
        ItemStack clone = itemStack.clone();
        clone.setAmount(amount);
        return clone;
    }
}
