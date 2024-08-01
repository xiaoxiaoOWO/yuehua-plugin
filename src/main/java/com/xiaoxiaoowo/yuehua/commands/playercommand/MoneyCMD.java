package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.itemstack.other.Money;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class MoneyCMD implements CommandExecutor {
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
                    switch (args[0].toLowerCase()) {
                        case "get" -> {
                            if (args.length != 3) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            int amount = 0;
                            try {
                                amount = Integer.parseInt(args[2]);
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
                            if (amount > 2000) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            switch (args[1]) {
                                case "铜钱" -> {
                                    if (amount > data.money) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4余额不足")
                                                        .appendNewline()
                                                        .append(Component.text("§6[命令系统]§a当前余额: §b" + data.money))
                                        );


                                        return;
                                    }
                                    data.money -= amount;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );


                                    ItemStack tongQian = Money.tongQian.clone();
                                    tongQian.setAmount(amount);
                                    player.getInventory().addItem(tongQian);
                                }

                                case "银元宝" -> {
                                    int newAmount = amount * 10;
                                    if (newAmount > data.money) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4余额不足")
                                                        .appendNewline()
                                                        .append(Component.text("§6[命令系统]§a当前余额: §b" + data.money))
                                        );
                                        return;
                                    }
                                    data.money -= newAmount;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );

                                    ItemStack jinYuanBao = Money.jinYuanBao.clone();
                                    jinYuanBao.setAmount(amount);
                                    player.getInventory().addItem(jinYuanBao);

                                }

                                case "金元宝" -> {
                                    int newAmount = amount * 100;
                                    if (newAmount > data.money) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4余额不足")
                                                        .appendNewline()
                                                        .append(Component.text("§6[命令系统]§a当前余额: §b" + data.money))
                                        );
                                        return;
                                    }
                                    data.money -= newAmount;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );

                                    ItemStack yinPiao = Money.yinPiao.clone();
                                    yinPiao.setAmount(amount);
                                    player.getInventory().addItem(yinPiao);

                                }

                                case "银票" -> {

                                    int newAmount = amount * 1000;
                                    if (newAmount > data.money) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4余额不足")
                                                        .appendNewline()
                                                        .append(Component.text("§6[命令系统]§a当前余额: §b" + data.money))
                                        );
                                        return;
                                    }
                                    data.money -= newAmount;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );

                                    ItemStack zuanshi = Money.zuanShi.clone();
                                    zuanshi.setAmount(amount);
                                    player.getInventory().addItem(zuanshi);
                                }

                                default -> player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                            }


                        }
                        case "store" -> {

                            if (args.length != 3) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            int amount = 0;
                            try {
                                amount = Integer.parseInt(args[2]);
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
                            if (amount > 2000) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            switch (args[1]) {
                                case "铜钱" -> {
                                    PlayerInventory playerInventory = player.getInventory();
                                    ItemStack[] itemStacks = playerInventory.getContents();
                                    int count = 0;
                                    int length = itemStacks.length;
                                    List<Integer> slots = new ArrayList<>(length);
                                    for (int i = 0; i < length; i++) {
                                        ItemStack itemStack = itemStacks[i];
                                        if (itemStack == null) {
                                            continue;
                                        }
                                        if (itemStack.getType() != Material.BRICK) {
                                            continue;
                                        }
                                        if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "tongQian")) {
                                            continue;
                                        }
                                        slots.add(i);
                                        count += itemStack.getAmount();
                                    }

                                    if (count < amount) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4背包中的铜钱不足")
                                        );
                                        return;
                                    }
                                    int inamout = amount;


                                    for (int slot : slots) {
                                        ItemStack itemStack = itemStacks[slot];
                                        int amoutNow = itemStack.getAmount();
                                        if (inamout > amoutNow) {
                                            inamout -= amoutNow;
                                            itemStack.setAmount(0);
                                        } else {
                                            itemStack.setAmount(amoutNow - inamout);
                                            break;
                                        }
                                    }

                                    data.money += amount;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );
                                }

                                case "银元宝" -> {
                                    PlayerInventory playerInventory = player.getInventory();
                                    ItemStack[] itemStacks = playerInventory.getContents();
                                    int count = 0;
                                    int length = itemStacks.length;
                                    List<Integer> slots = new ArrayList<>(length);
                                    for (int i = 0; i < length; i++) {
                                        ItemStack itemStack = itemStacks[i];
                                        if (itemStack == null) {
                                            continue;
                                        }
                                        if (itemStack.getType() != Material.BRICK) {
                                            continue;
                                        }
                                        if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "jinYuanBao")) {
                                            continue;
                                        }
                                        slots.add(i);
                                        count += itemStack.getAmount();
                                    }

                                    if (count < amount) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4背包中的银元宝不足")
                                        );
                                        return;
                                    }
                                    int inamout = amount;


                                    for (int slot : slots) {
                                        ItemStack itemStack = itemStacks[slot];
                                        int amoutNow = itemStack.getAmount();
                                        if (inamout > amoutNow) {
                                            inamout -= amoutNow;
                                            itemStack.setAmount(0);
                                        } else {
                                            itemStack.setAmount(amoutNow - inamout);
                                            break;
                                        }
                                    }

                                    data.money += amount * 10;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );
                                }

                                case "金元宝" -> {
                                    PlayerInventory playerInventory = player.getInventory();
                                    ItemStack[] itemStacks = playerInventory.getContents();
                                    int count = 0;
                                    int length = itemStacks.length;
                                    List<Integer> slots = new ArrayList<>(length);
                                    for (int i = 0; i < length; i++) {
                                        ItemStack itemStack = itemStacks[i];
                                        if (itemStack == null) {
                                            continue;
                                        }
                                        if (itemStack.getType() != Material.BRICK) {
                                            continue;
                                        }
                                        if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "yinPiao")) {
                                            continue;
                                        }
                                        slots.add(i);
                                        count += itemStack.getAmount();
                                    }

                                    if (count < amount) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4背包中的金元宝不足")
                                        );
                                        return;
                                    }
                                    int inamout = amount;


                                    for (int slot : slots) {
                                        ItemStack itemStack = itemStacks[slot];
                                        int amoutNow = itemStack.getAmount();
                                        if (inamout > amoutNow) {
                                            inamout -= amoutNow;
                                            itemStack.setAmount(0);
                                        } else {
                                            itemStack.setAmount(amoutNow - inamout);
                                            break;
                                        }
                                    }

                                    data.money += amount * 100;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );


                                }

                                case "银票" -> {
                                    PlayerInventory playerInventory = player.getInventory();
                                    ItemStack[] itemStacks = playerInventory.getContents();
                                    int count = 0;
                                    int length = itemStacks.length;
                                    List<Integer> slots = new ArrayList<>(length);
                                    for (int i = 0; i < length; i++) {
                                        ItemStack itemStack = itemStacks[i];
                                        if (itemStack == null) {
                                            continue;
                                        }
                                        if (itemStack.getType() != Material.BRICK) {
                                            continue;
                                        }
                                        if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "zuanShi")) {
                                            continue;
                                        }
                                        slots.add(i);
                                        count += itemStack.getAmount();
                                    }

                                    if (count < amount) {
                                        player.sendMessage(
                                                Component.text("§6[命令系统]§4背包中的银票不足")
                                        );
                                        return;
                                    }
                                    int inamout = amount;


                                    for (int slot : slots) {
                                        ItemStack itemStack = itemStacks[slot];
                                        int amoutNow = itemStack.getAmount();
                                        if (inamout > amoutNow) {
                                            inamout -= amoutNow;
                                            itemStack.setAmount(0);
                                        } else {
                                            itemStack.setAmount(amoutNow - inamout);
                                            break;
                                        }
                                    }

                                    data.money += amount * 1000;
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                                    );

                                }

                                default -> player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                            }


                        }
                        case "check" -> {
                            if (args.length != 1) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }
                            player.sendMessage(
                                    Component.text("§6[命令系统]§a当前余额: §b" + data.money)
                            );
                        }

                        case "pay" -> {
                            if (args.length != 3) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4参数错误")
                                );
                                return;
                            }

                            int amount = 0;
                            try {
                                amount = Integer.parseInt(args[2]);
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

                            String targetName = args[1];
                            if (targetName.equals(player.getName())) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4不能给自己转账")
                                );
                                return;
                            }

                            Player target = Bukkit.getPlayer(targetName);
                            if (target == null || (!target.isOnline())) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4玩家不在线")
                                );
                                return;
                            }

                            if (data.money < amount) {
                                player.sendMessage(
                                        Component.text("§6[命令系统]§4余额不足")
                                );
                                return;
                            }

                            Data targetData = Yuehua.playerData.get(target.getUniqueId());
                            targetData.money += amount;
                            data.money -= amount;

                            //成功给玩家（名字）转账XX元
                            player.sendMessage(
                                    Component.text("§6[命令系统]§a成功给玩家§b" + targetName + "§a转账§b" + amount + "§a元")
                            );

                            //收到玩家（名字）转账XX元
                            target.sendMessage(
                                    Component.text("§6[命令系统]§a收到玩家§b" + player.getName() + "§a转账§b" + amount + "§a元")
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
