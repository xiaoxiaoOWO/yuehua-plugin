package com.xiaoxiaoowo.yuehua.task.other;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.commands.playercommand.Buy;
import com.xiaoxiaoowo.yuehua.commands.playercommand.Sale;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.scheduler.BukkitRunnable;

public final class SaleTask extends BukkitRunnable {
    //10s一次
    public int num;
    public String name;
    public String itemName;
    public int count;

    public SaleTask(String name, String itemName, int count) {
        num = 17;
        this.name = name;
        this.itemName = itemName;
        this.count = count;

    }

    @Override
    public void run() {
        if (num == 0) {
            Player saler = Sale.saler;
            Player buyer = Buy.buyerNow;
            if (buyer == null) {
                SendInformation.broadcastMes(
                        Component.text("§6[拍卖系统]§4本次拍卖没有人出价，拍卖失败")
                );
            } else {
                if (saler.isConnected() && buyer.isConnected()) {
                    Data salerData = Yuehua.playerData.get(saler.getUniqueId());
                    Data buyerData = Yuehua.playerData.get(buyer.getUniqueId());

                    if (buyerData.money < Buy.priceNow) {
                        SendInformation.broadcastMes(
                                Component.text("§6[拍卖系统]§4购买者余额不足，拍卖失败")
                        );
                    } else {
                        PlayerInventory playerInventory = saler.getInventory();
                        PlayerInventory buyerInventory = buyer.getInventory();
                        int slot = Sale.slot;
                        int iniCount = Sale.iniCount;
                        ItemStack itemStack = playerInventory.getItem(slot);
                        if (itemStack == null) {
                            SendInformation.broadcastMes(
                                    Component.text("§6[拍卖系统]§4拍卖者破坏规则，拍卖失败")
                            );
                        } else {
                            if (itemStack.getAmount() == iniCount &&
                                itemStack.getPersistentDataContainer().getOrDefault(DataContainer.id, PersistentDataType.STRING, "null").equals(Sale.id)) {

                                if (iniCount > count) {
                                    itemStack.setAmount(iniCount - count);
                                    playerInventory.setItem(slot, itemStack);
                                } else {
                                    playerInventory.setItem(slot, null);
                                }

                                itemStack.setAmount(count);
                                buyerInventory.addItem(itemStack);

                                salerData.money += Buy.priceNow;
                                buyerData.money -= Buy.priceNow;


                                SendInformation.broadcastMes(
                                        Component.text("§6[拍卖系统]§a玩家§b" + name + "的物品：§b" + itemName).append(Component.text("§b*" + count)).appendNewline()
                                                .append(Component.text("§6[拍卖系统]§a最终购买者为：§b" + Buy.buyerNow.getName())).appendNewline()
                                                .append(Component.text("§6[拍卖系统]§a最终出价为：§b" + Buy.priceNow))
                                );
                            } else {
                                SendInformation.broadcastMes(
                                        Component.text("§6[拍卖系统]§4拍卖者破坏规则，拍卖失败")
                                );

                            }
                        }
                    }

                } else {
                    SendInformation.broadcastMes(
                            Component.text("§6[拍卖系统]§4拍卖双方有人不在线，拍卖失败")
                    );
                }
            }

            Buy.buyerNow = null;
            Buy.priceNow = 0;

            Sale.saler = null;
            this.cancel();
        } else {
            if (Buy.buyerNow == null) {
                SendInformation.broadcastMes(
                        Component.text("§6[拍卖系统]§a玩家§b" + name + "§a的物品：§b" + itemName).append(Component.text("§b*" + count)).appendNewline()
                                .append(Component.text("§6[拍卖系统]§a当前购买者为：§b无")).appendNewline()
                                .append(Component.text("§6[拍卖系统]§a当前出价为：§b无§a(起拍价:§b" + Sale.price + "§a)")).appendNewline()
                                .append(Component.text("§6[拍卖系统]§a剩余时间为：§b" + (num * 10) + "s"))
                );
            } else {
                SendInformation.broadcastMes(
                        Component.text("§6[拍卖系统]§a玩家§b" + name + "§a的物品：§b" + itemName).append(Component.text("§b*" + count)).appendNewline()
                                .append(Component.text("§6[拍卖系统]§a当前购买者为：§b" + Buy.buyerNow.getName())).appendNewline()
                                .append(Component.text("§6[拍卖系统]§a当前出价为：§b" + Buy.priceNow)).appendNewline()
                                .append(Component.text("§6[拍卖系统]§a剩余时间为：§b" + (num * 10) + "s"))
                );
            }
            num--;
        }
    }
}
