package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.itemstack.other.Other;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public final class ArrowCMD implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        Data data = Yuehua.playerData.get(player.getUniqueId());
        Yuehua.scheduler.runTaskAsynchronously(
                Yuehua.instance, () -> {
                    if (args.length == 0) {
                        player.sendMessage(
                                Component.text("§6[命令系统]§4参数错误")
                        );
                        return;
                    }
                    if (data.job != 2) {
                        player.sendMessage(
                                Component.text("§6[命令系统]§4你不是弓箭手")
                        );
                        return;
                    }
                    GongData gongData = (GongData) data;
                    switch (args[0].toLowerCase()) {
                        case "get" -> {
                            if (args.length != 2) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }
                            int amount = 0;
                            try {
                                amount = Integer.parseInt(args[1]);
                            } catch (NumberFormatException e) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }
                            if (amount <= 0) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            if (amount > 1280) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }


                            if (amount > gongData.arrow_count) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4弓箭不足")
                                                .appendNewline()
                                                .append(Component.text("§6[命令系统]§a箭袋剩余弓箭数量: §b" + gongData.arrow_count))
                                );
                                return;
                            }
                            gongData.arrow_count -= amount;
                            player.sendMessage(
                                    Component.text("§6[命令系统]§a箭袋剩余弓箭数量: §b" + gongData.arrow_count)
                            );

                            int inneramount = amount;


                            ItemStack arrow = Other.ARROW.clone();
                            arrow.setAmount(inneramount);
                            player.getInventory().addItem(arrow);


                        }

                        case "store" -> {
                            if (args.length != 2) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }
                            int amount = 0;
                            try {
                                amount = Integer.parseInt(args[1]);
                            } catch (NumberFormatException e) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }
                            if (amount <= 0) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }
                            if (amount > 1280) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            int arrow_count = gongData.arrow_count;
                            int total = amount + arrow_count;
                            if (total > gongData.arrow_count_max) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4容量不足")
                                                .appendNewline()
                                                .append(Component.text("§6[命令系统]§a最大容量: §b" + gongData.arrow_count_max))
                                                .appendNewline()
                                                .append(Component.text("§6[命令系统]§a剩余容量: §b" + (gongData.arrow_count_max - gongData.arrow_count)))
                                );

                                return;
                            }

                            PlayerInventory playerInventory = player.getInventory();
                            int count = 0;
                            Collection<ItemStack> itemStacks = (Collection<ItemStack>) playerInventory.all(Material.ARROW).values();

                            for (ItemStack itemStack : itemStacks) {
                                count += itemStack.getAmount();
                            }

                            if (count < amount) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4背包中的弓箭不足")
                                );
                                return;
                            }
                            int inamout = amount;


                            for (ItemStack itemStack : itemStacks) {
                                int amoutNow = itemStack.getAmount();
                                if (inamout > amoutNow) {
                                    inamout -= amoutNow;
                                    itemStack.setAmount(0);
                                } else {
                                    itemStack.setAmount(amoutNow - inamout);
                                    break;
                                }
                            }

                            gongData.arrow_count = total;
                            player.sendMessage(
                                    Component.text("§6[命令系统]§a箭袋箭量: §b" + gongData.arrow_count)
                            );


                        }

                        case "check" -> {
                            if (args.length != 1) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }
                            player.sendMessage(
                                    Component.text("§6[命令系统]§a剩余弓箭数量: §b" + gongData.arrow_count)
                                            .appendNewline()
                                            .append(Component.text("§6[命令系统]§a最大容量: §b" + gongData.arrow_count_max))
                            );


                        }

                        default -> player.sendMessage(
                                Component.text("§6[命令系统]§4参数错误")
                        );
                    }
                }
        );

        return true;
    }
}
