package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.task.other.SaleTask;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public final class Sale implements CommandExecutor {
    public static Player saler = null;
    public static int count = 0;
    public static int price = 0;

    public static int slot = 0;
    public static String id = "null";
    public static int iniCount = 0;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Scheduler.async(() -> {
            Player player = (Player) sender;
            if (saler != null) {
                player.sendMessage(Component.text("§6[命令系统]§4有人正在拍卖！"));
                return;
            }

            if (args.length != 2) {
                player.sendMessage(Component.text("§6[命令系统]§4参数错误"));
                return;
            }

            if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                player.sendMessage(Component.text("§6[命令系统]§4禁止在副本/试炼中使用此功能"));
                return;
            }

            try {
                price = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4参数错误")
                );
                return;
            }

            if (price <= 0) {
                player.sendMessage(
                        Component.text("§6[命令系统]§4价格不能小于等于0")
                );
                return;
            }


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

            slot = inventory.getHeldItemSlot();
            id = handItem.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
            iniCount = itemCount;
            saler = player;

            String playerName = player.getName();
            String itemDisplay = handItem.getDisplayName();

            Bukkit.broadcast(Component.text("§6[拍卖系统]§a玩家§b" + playerName + "§a发起了拍卖").appendNewline()
                    .append(Component.text("§6[拍卖系统]§a拍卖物：§b" + itemDisplay)).appendNewline()
                    .append(Component.text("§6[拍卖系统]§a数量：§b" + count))
                    .append(Component.text("  §a价格：§b" + price))
            );

            new SaleTask(playerName, itemDisplay, count).runTaskTimer(Yuehua.instance, 20 * 10, 20 * 10);

        });
        return true;
    }
}
