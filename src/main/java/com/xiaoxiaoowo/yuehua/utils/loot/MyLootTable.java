package com.xiaoxiaoowo.yuehua.utils.loot;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.List;
import java.util.Random;

public final class MyLootTable {
    public int exp;
    public List<NumItem> numItems;
    public List<ProItem> proItems;

    public static final Random random = new Random();


    public MyLootTable(int exp, List<NumItem> numItems, List<ProItem> proItems) {
        this.exp = exp;
        this.numItems = numItems;
        this.proItems = proItems;
    }

    public void give(Player player) {
        player.giveExp(exp, false);
        PlayerInventory playerInventory = player.getInventory();

        if (numItems != null) {
            for (NumItem numItem : numItems) {
                ItemStack itemStack = numItem.itemStack;
                itemStack.setAmount(numItem.count);
                playerInventory.addItem(itemStack);
            }
        }


        if (proItems != null) {
            for (ProItem proItem : proItems) {
                double probability = proItem.pro;
                if (random.nextDouble() <= probability) {
                    ItemStack itemStack = proItem.itemStack;
                    itemStack.setAmount(1);
                    playerInventory.addItem(itemStack);
                }
            }
        }


    }
}
