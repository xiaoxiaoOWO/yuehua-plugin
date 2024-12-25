package com.xiaoxiaoowo.yuehua.system.dz;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Objects;

public final class Help {
    public static boolean itemCompare(ItemStack itemStack1, ItemStack itemStack2) {
        //加入空引用判断
        if (itemStack1 == null || itemStack2 == null) {
            return itemStack1 == itemStack2;
        }

        Material type1 = itemStack1.getType();
        if (type1 != itemStack2.getType()) {
            return false;
        }
        if (itemStack1.getAmount() != itemStack2.getAmount()) {
            return false;
        }
        ItemMeta itemMeta1 = itemStack1.getItemMeta();
        ItemMeta itemMeta2 = itemStack2.getItemMeta();
        return Objects.equals(itemMeta1.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null"), itemMeta2.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null"));
    }

    public static boolean invCompare(Inventory recipe, Inventory duanzao) {
        for (int i = 0; i < 17; i++) {
            if (!itemCompare(recipe.getItem(i), duanzao.getItem(i))) {
                return false;
            }
        }
        for (int i = 0; i < 17; i++) {
            duanzao.setItem(i, null);
        }

        return true;
    }

    public static String removeCore(String str){
        //去除字符串的最前面的4个字符core
        return str.substring(4);
    }
}
