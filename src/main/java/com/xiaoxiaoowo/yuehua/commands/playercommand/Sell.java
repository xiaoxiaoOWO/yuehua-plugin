package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class Sell implements CommandExecutor {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

    private static final HashSet<String> middlelengthId = new HashSet<>() {
        {

        }
    };

    private static final HashSet<String> longlengthId = new HashSet<>() {
        {

        }
    };

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Yuehua.async(() -> {
            Player player = (Player) sender;
            if (args.length != 2) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4参数错误")
                );
                return;
            }

            if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                player.sendMessage(Component.text("§6[命令系统]§4禁止在副本/试炼中使用此功能"));
                return;
            }

            int amount = 0;
            try {
                amount = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4参数错误")
                );
                return;
            }

            if (amount <= 0) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4价格不能小于等于0")
                );
                return;
            }
            Data data = Yuehua.playerData.get(player.getUniqueId());
            int cost = (int) (amount * 0.05);
            int finalCost = Math.max(2, cost);
            if (data.money < finalCost) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4余额不足扣除税费")
                );
                return;
            }

            int count = 0;

            try {
                count = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4参数错误")
                );
                return;
            }

            if (count <= 0) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4数量不能小于等于0")
                );
                return;
            }

            PlayerInventory inventory = player.getInventory();
            ItemStack handItem = inventory.getItemInMainHand();
            int itemCount = handItem.getAmount();
            if (handItem.getType() == Material.AIR) {
                player.sendMessage(Component.text("§6[命令系统]§4手持物品为空"));
                return;
            }

            if (itemCount < count) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4手持物品数量不足")
                );
                return;
            }

            int page = 100;

            for (Inventory shichang : Yuehua.shichang) {
                if (shichang.firstEmpty() != -1) {
                    page = Yuehua.shichang.indexOf(shichang);
                    break;
                }
            }

            if (page == 100) {
                player.sendMessage(Component.text("§6[命令系统]§4市场已满！"));
                return;
            }


            if (itemCount > count) {
                handItem.setAmount(itemCount - count);
                inventory.setItemInMainHand(handItem);
            } else {
                inventory.setItemInMainHand(null);
            }
            ItemMeta meta = handItem.getItemMeta();
            PersistentDataContainer itemPdc = meta.getPersistentDataContainer();
            itemPdc.set(DataContainer.seller, PersistentDataType.STRING, player.getName());
            itemPdc.set(DataContainer.price, PersistentDataType.INTEGER, amount);
            List<Component> lores = meta.lore();
            if (lores == null) {
                lores = new ArrayList<>(3);
            }

            String id = itemPdc.get(DataContainer.id, PersistentDataType.STRING);

            if (longlengthId.contains(id)) {
                lores.add(Component.text("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
            } else if (middlelengthId.contains(id)) {
                lores.add(Component.text("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
            } else {
                lores.add(Component.text("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
            }


            lores.add(Component.text("售卖者: ").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
                    .append(Component.text(player.getName()).color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)));
            lores.add(Component.text("售卖价格: ").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
                    .append(Component.text(amount).color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)));
            //上架时间,YYYY--MM--DD HH:MM:SS
            lores.add(Component.text("上架时间: ").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
                    .append(Component.text(LocalDateTime.now().format(formatter)).color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)));
            meta.lore(lores);
            handItem.setItemMeta(meta);

            data.money -= finalCost;

            player.sendMessage(Component.text("§6[命令系统]§a上架成功！扣除税费: §b" + finalCost));

            handItem.setAmount(count);
            Yuehua.shichang.get(page).addItem(handItem);


        });
        return true;
    }
}
