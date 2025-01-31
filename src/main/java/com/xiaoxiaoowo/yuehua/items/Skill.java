package com.xiaoxiaoowo.yuehua.items;

import io.papermc.paper.datacomponent.DataComponentTypes;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public final class Skill {
    public static final ItemStack MING_YUE = new ItemStack(Material.BOWL);
    public static final ItemStack CHUI_ZI = new ItemStack(Material.BOWL);
    public static final ItemStack STAR = new ItemStack(Material.BOWL);

    static {


        STAR.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bowl/3"));
        CHUI_ZI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bowl/2"));
        MING_YUE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "bowl/1"));
    }
}
