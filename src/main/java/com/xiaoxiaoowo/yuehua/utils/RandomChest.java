package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.guis.bank.MoneyBank;
import com.xiaoxiaoowo.yuehua.items.dz.YuShi;
import com.xiaoxiaoowo.yuehua.items.other.FuBen;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.Random;

public final class RandomChest {
    public static final Random random = new Random();

    public static final ItemStack[] yushi1 = new ItemStack[]{
            YuShi.XUE_SE_SHI1.clone(),
            YuShi.CUI_LV_SHI1.clone(),
            YuShi.DIAN_LAN_SHI1.clone(),
            YuShi.JIN_HUANG_SHI1.clone(),
            YuShi.HOU_TU_SHI1.clone(),
            YuShi.ZI_JING_SHI1.clone(),
            YuShi.TU_LU_SHI1.clone(),
            YuShi.HONG_YUE_SHI1.clone(),
            YuShi.MI_YIN_SHI1.clone(),
            YuShi.YU_LU_SHI1.clone(),
            YuShi.BING_SHUANG_SHI1.clone(),
            YuShi.YAN_YANG_SHI1.clone(),
            YuShi.SUI_YAN_SHI1.clone()
    };

    public static final ItemStack[] yushi2 = new ItemStack[]{
            YuShi.XUE_SE_SHI2.clone(),
            YuShi.CUI_LV_SHI2.clone(),
            YuShi.DIAN_LAN_SHI2.clone(),
            YuShi.JIN_HUANG_SHI2.clone(),
            YuShi.HOU_TU_SHI2.clone(),
            YuShi.ZI_JING_SHI2.clone(),
            YuShi.TU_LU_SHI2.clone(),
            YuShi.HONG_YUE_SHI2.clone(),
            YuShi.MI_YIN_SHI2.clone(),
            YuShi.YU_LU_SHI2.clone(),
            YuShi.BING_SHUANG_SHI2.clone(),
            YuShi.YAN_YANG_SHI2.clone(),
            YuShi.SUI_YAN_SHI2.clone()
    };

    public static final ItemStack[] yushi3 = new ItemStack[]{
            YuShi.XUE_SE_SHI3.clone(),
            YuShi.CUI_LV_SHI3.clone(),
            YuShi.DIAN_LAN_SHI3.clone(),
            YuShi.JIN_HUANG_SHI3.clone(),
            YuShi.HOU_TU_SHI3.clone(),
            YuShi.ZI_JING_SHI3.clone(),
            YuShi.TU_LU_SHI3.clone(),
            YuShi.HONG_YUE_SHI3.clone(),
            YuShi.MI_YIN_SHI3.clone(),
            YuShi.YU_LU_SHI3.clone(),
            YuShi.BING_SHUANG_SHI3.clone(),
            YuShi.YAN_YANG_SHI3.clone(),
            YuShi.SUI_YAN_SHI3.clone()
    };

    public static final ItemStack[] yushi4 = new ItemStack[]{
            YuShi.XUE_SE_SHI4.clone(),
            YuShi.CUI_LV_SHI4.clone(),
            YuShi.DIAN_LAN_SHI4.clone(),
            YuShi.JIN_HUANG_SHI4.clone(),
            YuShi.HOU_TU_SHI4.clone(),
            YuShi.ZI_JING_SHI4.clone(),
            YuShi.TU_LU_SHI4.clone(),
            YuShi.HONG_YUE_SHI4.clone(),
            YuShi.MI_YIN_SHI4.clone(),
            YuShi.YU_LU_SHI4.clone(),
            YuShi.BING_SHUANG_SHI4.clone(),
            YuShi.YAN_YANG_SHI4.clone(),
            YuShi.SUI_YAN_SHI4.clone()
    };

    public static final ItemStack[] yushi5 = new ItemStack[]{
            YuShi.XUE_SE_SHI5.clone(),
            YuShi.CUI_LV_SHI5.clone(),
            YuShi.DIAN_LAN_SHI5.clone(),
            YuShi.JIN_HUANG_SHI5.clone(),
            YuShi.HOU_TU_SHI5.clone(),
            YuShi.ZI_JING_SHI5.clone(),
            YuShi.TU_LU_SHI5.clone(),
            YuShi.HONG_YUE_SHI5.clone(),
            YuShi.MI_YIN_SHI5.clone(),
            YuShi.YU_LU_SHI5.clone(),
            YuShi.BING_SHUANG_SHI5.clone(),
            YuShi.YAN_YANG_SHI5.clone(),
            YuShi.SUI_YAN_SHI5.clone()
    };

    public static final ItemStack[] yushi6 = new ItemStack[]{
            YuShi.XUE_SE_SHI6.clone(),
            YuShi.CUI_LV_SHI6.clone(),
            YuShi.DIAN_LAN_SHI6.clone(),
            YuShi.JIN_HUANG_SHI6.clone(),
            YuShi.HOU_TU_SHI6.clone(),
            YuShi.ZI_JING_SHI6.clone(),
            YuShi.TU_LU_SHI6.clone(),
            YuShi.HONG_YUE_SHI6.clone(),
            YuShi.MI_YIN_SHI6.clone(),
            YuShi.YU_LU_SHI6.clone(),
            YuShi.BING_SHUANG_SHI6.clone(),
            YuShi.YAN_YANG_SHI6.clone(),
            YuShi.SUI_YAN_SHI6.clone()
    };

    public static final ItemStack[] yushi7 = new ItemStack[]{
            YuShi.XUE_SE_SHI7.clone(),
            YuShi.CUI_LV_SHI7.clone(),
            YuShi.DIAN_LAN_SHI7.clone(),
            YuShi.JIN_HUANG_SHI7.clone(),
            YuShi.HOU_TU_SHI7.clone(),
            YuShi.ZI_JING_SHI7.clone(),
            YuShi.TU_LU_SHI7.clone(),
            YuShi.HONG_YUE_SHI7.clone(),
            YuShi.MI_YIN_SHI7.clone(),
            YuShi.YU_LU_SHI7.clone(),
            YuShi.BING_SHUANG_SHI7.clone(),
            YuShi.YAN_YANG_SHI7.clone(),
            YuShi.SUI_YAN_SHI7.clone()
    };

    public static final ItemStack[] yushi8 = new ItemStack[]{
            YuShi.XUE_SE_SHI8.clone(),
            YuShi.CUI_LV_SHI8.clone(),
            YuShi.DIAN_LAN_SHI8.clone(),
            YuShi.JIN_HUANG_SHI8.clone(),
            YuShi.HOU_TU_SHI8.clone(),
            YuShi.ZI_JING_SHI8.clone(),
            YuShi.TU_LU_SHI8.clone(),
            YuShi.HONG_YUE_SHI8.clone(),
            YuShi.MI_YIN_SHI8.clone(),
            YuShi.YU_LU_SHI8.clone(),
            YuShi.BING_SHUANG_SHI8.clone(),
            YuShi.YAN_YANG_SHI8.clone(),
            YuShi.SUI_YAN_SHI8.clone()
    };

    public static final ItemStack keyXinyun5 = FuBen.keyXinYun5.clone();
    public static final ItemStack keyXinyun10 = FuBen.keyXinYun10.clone();
    public static final ItemStack keyXinyun20 = FuBen.keyXinYun20.clone();
    public static final ItemStack keyXinyun100 = FuBen.keyXinYun100.clone();


    public static boolean randomLuckyKey(Player player, int count) {
        PlayerInventory playerInventory = player.getInventory();
        if (MoneyBank.countEmptySlots(playerInventory) < count) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的背包中空余空间不足！"));
            return false;
        }

        for (int i = 0; i < count; i++) {
            double randomValue = random.nextDouble();
            if (randomValue > 0.99) {
                keyXinyun100.setAmount(1);
                playerInventory.addItem(keyXinyun100);
            } else if (randomValue > 0.9) {
                keyXinyun20.setAmount(1);
                playerInventory.addItem(keyXinyun20);
            } else if (randomValue > 0.7) {
                keyXinyun10.setAmount(1);
                playerInventory.addItem(keyXinyun10);
            } else {
                keyXinyun5.setAmount(1);
                playerInventory.addItem(keyXinyun5);
            }
        }
        PlaySound.pickupOrb(player);
        return true;
    }

    public static boolean randomYushi(Player player, int count, int level) {
        PlayerInventory playerInventory = player.getInventory();
        if (MoneyBank.countEmptySlots(playerInventory) < count) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4你的背包中空余空间不足！"));
            return false;
        }

        ItemStack[] yushis = switch (level) {
            case 1 -> yushi1;
            case 2 -> yushi2;
            case 3 -> yushi3;
            case 4 -> yushi4;
            case 5 -> yushi5;
            case 6 -> yushi6;
            case 7 -> yushi7;
            case 8 -> yushi8;
            default -> null;
        };

        for (int i = 0; i < count; i++) {
            int randomNum = random.nextInt(0, 13);
            ItemStack itemStack = yushis[randomNum];
            itemStack.setAmount(1);
            playerInventory.addItem(itemStack);
        }

        PlaySound.pickupOrb(player);
        return true;
    }

}
