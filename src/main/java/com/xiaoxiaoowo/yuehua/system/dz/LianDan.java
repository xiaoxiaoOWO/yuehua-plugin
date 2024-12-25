package com.xiaoxiaoowo.yuehua.system.dz;

import com.xiaoxiaoowo.yuehua.guis.Recipe;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public final class LianDan {
    public static void liandan(Inventory inventory, String id, Player player) {
        id = Help.removeCore(id);
        Inventory recipe = Recipe.danContents.get(id);
        //查看核心id有无对应配方
        if (recipe == null) {
            return;
        }

        //查看是否满足配方
        if (!Help.invCompare(recipe, inventory)) {
            return;
        }
        //给与物品
        ItemStack itemStack = Recipe.idToItem.get(id);
    }

    public static void danshiLiandan(Inventory inventory, String id, Player player) {
        id = Help.removeCore(id);
        Inventory recipe = Recipe.dandanContents.get(id);
        //查看核心id有无对应配方
        if (recipe == null) {
            return;
        }

        //查看是否满足配方
        if (!Help.invCompare(recipe, inventory)) {
            return;
        }
        //给与物品
        ItemStack itemStack = Recipe.idToItem.get(id);

    }
}
