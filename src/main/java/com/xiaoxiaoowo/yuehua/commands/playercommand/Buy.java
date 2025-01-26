package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.task.other.SaleTask;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

public final class Buy implements CommandExecutor {
    public static Player buyerNow = null;
    public static int priceNow = 0;


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Scheduler.async(() -> {
                    Player player = (Player) sender;
                    if (Sale.saler == null) {
                        player.sendMessage(Component.text("§6[命令系统]§4没有人正在拍卖！"));
                        return;
                    }

                    if (Sale.saler.getName().equals(player.getName())) {
                        player.sendMessage(Component.text("§6[命令系统]§4不能购买自己拍卖的物品！"));
                        return;
                    }

                    if (args.length != 1) {
                        player.sendMessage(Component.text("§6[命令系统]§4参数错误"));
                        return;
                    }

                    if (player.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                        player.sendMessage(Component.text("§6[命令系统]§4禁止在副本/试炼中使用此功能"));
                        return;
                    }
                    int price;
                    try {
                        price = Integer.parseInt(args[0]);
                    } catch (NumberFormatException e) {
                        player.sendMessage(Component.text("§6[命令系统]§4参数错误"));
                        return;
                    }

                    if (price <= 0) {
                        player.sendMessage(
                                Component.text("§6[命令系统]§4价格不能小于等于0")
                        );
                        return;
                    }

                    if (price < priceNow * 1.2) {
                        player.sendMessage(
                                Component.text("§6[命令系统]§4你的出价至少比上一位拍卖者高20%")
                        );
                        return;
                    }

                    if (price < Sale.price) {
                        player.sendMessage(
                                Component.text("§6[命令系统]§4你的出价没有最低拍卖价高")
                        );
                        return;
                    }

                    Data data = Yuehua.playerData.get(player.getUniqueId());

                    if (data.money < price) {
                        player.sendMessage(
                                Component.text("§6[命令系统]§4你的余额不足")
                        );
                        return;
                    }

                    buyerNow = player;
                    priceNow = price;
                    if(SaleTask.num == 0){
                        SaleTask.num = 1;
                    }

                    Bukkit.broadcast(Component.text("§6[拍卖系统]§a玩家：§b" + player.getName() + "§a参与了拍卖").appendNewline()
                            .append(Component.text("§6[拍卖系统]§a出价：§b" + price))
                    );
                }
        );

        return true;
    }
}
