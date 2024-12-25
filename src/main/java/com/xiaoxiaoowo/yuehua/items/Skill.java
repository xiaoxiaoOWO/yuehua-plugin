package com.xiaoxiaoowo.yuehua.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Skill {
    public static final ItemStack MING_YUE = new ItemStack(Material.BOWL);
    public static final ItemStack CHUI_ZI = new ItemStack(Material.BOWL);
    public static final ItemStack STAR = new ItemStack(Material.BOWL);

    static {
        MING_YUE.setCustomModelData(1);
        CHUI_ZI.setCustomModelData(2);
        STAR.setCustomModelData(3);
    }
}
