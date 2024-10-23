package com.xiaoxiaoowo.yuehua.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.List;

public final class MyLootTable {
    public int exp;
    public List<ItemStack> items;

    public MyLootTable(int exp, List<ItemStack> items) {
        this.exp = exp;
        this.items = items;
    }

    public void give(Player player){
        player.giveExp(exp, false);
        PlayerInventory playerInventory = player.getInventory();
        for (ItemStack item : items) {
            playerInventory.addItem(item);
        }
    }
}
