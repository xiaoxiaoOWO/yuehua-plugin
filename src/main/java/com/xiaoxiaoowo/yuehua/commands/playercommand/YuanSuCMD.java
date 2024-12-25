package com.xiaoxiaoowo.yuehua.commands.playercommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class YuanSuCMD implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        Data data = Yuehua.playerData.get(player.getUniqueId());
        new BukkitRunnable() {
            @Override
            public void run() {
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
                        int amount;
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
                        if (amount > 2560) {
                            player.sendMessage(
                                    Component.text("§6[命令系统]§4参数错误")
                            );
                            return;
                        }
                        switch (args[1]) {
                            case "金" -> {
                                if (amount > data.jinCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前金存储量: §b" + data.jinCount))
                                    );
                                    return;
                                }
                                data.jinCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前金存储量: §b" + data.jinCount)
                                );


                                ItemStack jin = YuanSu.jin.clone();
                                jin.setAmount(amount);
                                player.getInventory().addItem(jin);
                            }
                            case "木" -> {
                                if (amount > data.muCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前木存储量: §b" + data.muCount))
                                    );
                                    return;
                                }
                                data.muCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前木存储量: §b" + data.muCount)
                                );
                                ItemStack mu = YuanSu.mu.clone();
                                mu.setAmount(amount);
                                player.getInventory().addItem(mu);
                            }
                            case "水" -> {
                                if (amount > data.shuiCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前水存储量: §b" + data.shuiCount))
                                    );
                                    return;
                                }
                                data.shuiCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前水存储量: §b" + data.shuiCount)
                                );
                                ItemStack shui = YuanSu.shui.clone();
                                shui.setAmount(amount);
                                player.getInventory().addItem(shui);
                            }
                            case "火" -> {
                                if (amount > data.huoCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前火存储量: §b" + data.huoCount))
                                    );
                                    return;
                                }
                                data.huoCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前火存储量: §b" + data.huoCount)
                                );
                                ItemStack huo = YuanSu.huo.clone();
                                huo.setAmount(amount);
                                player.getInventory().addItem(huo);
                            }
                            case "土" -> {
                                if (amount > data.tuCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前土存储量: §b" + data.tuCount))
                                    );
                                    return;
                                }
                                data.tuCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前土存储量: §b" + data.tuCount)
                                );
                                ItemStack tu = YuanSu.tu.clone();
                                tu.setAmount(amount);
                                player.getInventory().addItem(tu);
                            }
                            case "精炼金" -> {
                                if (amount > data.refinedJinCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前精炼金存储量: §b" + data.refinedJinCount))
                                    );
                                    return;
                                }
                                data.refinedJinCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼金存储量: §b" + data.refinedJinCount)
                                );
                                ItemStack refinedJin = YuanSu.refined_jin.clone();
                                refinedJin.setAmount(amount);
                                player.getInventory().addItem(refinedJin);

                            }
                            case "精炼木" -> {
                                if (amount > data.refinedMuCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前精炼木存储量: §b" + data.refinedMuCount))
                                    );
                                    return;
                                }
                                data.refinedMuCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼木存储量: §b" + data.refinedMuCount)
                                );
                                ItemStack refinedMu = YuanSu.refined_mu.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "精炼水" -> {
                                if (amount > data.refinedShuiCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前精炼水存储量: §b" + data.refinedShuiCount))
                                    );
                                    return;
                                }
                                data.refinedShuiCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼水存储量: §b" + data.refinedShuiCount)
                                );
                                ItemStack refinedMu = YuanSu.refined_shui.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "精炼火" -> {
                                if (amount > data.refinedHuoCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前精炼火存储量: §b" + data.refinedHuoCount))
                                    );
                                    return;
                                }
                                data.refinedHuoCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼火存储量: §b" + data.refinedHuoCount)
                                );
                                ItemStack refinedMu = YuanSu.refined_huo.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "精炼土" -> {
                                if (amount > data.refinedTuCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前精炼土存储量: §b" + data.refinedTuCount))
                                    );
                                    return;
                                }
                                data.refinedTuCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼土存储量: §b" + data.refinedTuCount)
                                );
                                ItemStack refinedMu = YuanSu.refined_tu.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "浓缩金" -> {
                                if (amount > data.concentratedJinCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前浓缩金存储量: §b" + data.concentratedJinCount))
                                    );
                                    return;
                                }
                                data.concentratedJinCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩金存储量: §b" + data.concentratedJinCount)
                                );
                                ItemStack refinedMu = YuanSu.concentrated_jin.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "浓缩木" -> {
                                if (amount > data.concentratedMuCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前浓缩木存储量: §b" + data.concentratedMuCount))
                                    );
                                    return;
                                }
                                data.concentratedMuCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩木存储量: §b" + data.concentratedMuCount)
                                );
                                ItemStack refinedMu = YuanSu.concentrated_mu.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "浓缩水" -> {
                                if (amount > data.concentratedShuiCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前浓缩水存储量: §b" + data.concentratedShuiCount))
                                    );
                                    return;
                                }
                                data.concentratedShuiCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩水存储量: §b" + data.concentratedShuiCount)
                                );
                                ItemStack refinedMu = YuanSu.concentrated_shui.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "浓缩火" -> {
                                if (amount > data.concentratedHuoCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前浓缩火存储量: §b" + data.concentratedHuoCount))
                                    );
                                    return;
                                }
                                data.concentratedHuoCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩火存储量: §b" + data.concentratedHuoCount)
                                );
                                ItemStack refinedMu = YuanSu.concentrated_huo.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
                            }
                            case "浓缩土" -> {
                                if (amount > data.concentratedTuCount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4存储量不足")
                                                    .appendNewline()
                                                    .append(Component.text("§6[命令系统]§a当前浓缩土存储量: §b" + data.concentratedTuCount))
                                    );
                                    return;
                                }
                                data.concentratedTuCount -= amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩土存储量: §b" + data.concentratedTuCount)
                                );
                                ItemStack refinedMu = YuanSu.concentrated_tu.clone();
                                refinedMu.setAmount(amount);
                                player.getInventory().addItem(refinedMu);
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
                        int amount;
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
                        if (amount > 2560) {
                            player.sendMessage(
                                    Component.text("§6[命令系统]§4参数错误")
                            );
                            return;
                        }
                        switch (args[1]) {
                            case "金" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "jin")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }

                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中金元素不足")
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

                                data.jinCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前金存储量: §b" + data.jinCount)

                                );
                            }
                            case "木" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "mu")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }

                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中木元素不足")
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
                                data.muCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前木存储量: §b" + data.muCount)
                                );
                            }
                            case "水" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "shui")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }

                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中水元素不足")
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
                                data.shuiCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前水存储量: §b" + data.shuiCount)
                                );
                            }
                            case "火" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "huo")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }

                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中火元素不足")
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
                                data.huoCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前火存储量: §b" + data.huoCount)
                                );
                            }
                            case "土" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "tu")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中土元素不足")
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
                                data.tuCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前土存储量: §b" + data.tuCount)
                                );
                            }
                            case "精炼金" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "refined_jin")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中精炼金元素不足")
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
                                data.refinedJinCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼金存储量: §b" + data.refinedJinCount)
                                );
                            }
                            case "精炼木" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "refined_mu")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中精炼木元素不足")
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
                                data.refinedMuCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼木存储量: §b" + data.refinedMuCount)
                                );
                            }
                            case "精炼水" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "refined_shui")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中精炼水元素不足")
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
                                data.refinedShuiCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼水存储量: §b" + data.refinedShuiCount)
                                );
                            }
                            case "精炼火" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "refined_huo")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中精炼火元素不足")
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
                                data.refinedHuoCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼火存储量: §b" + data.refinedHuoCount)
                                );
                            }
                            case "精炼土" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "refined_tu")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中精炼土元素不足")
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
                                data.refinedTuCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前精炼土存储量: §b" + data.refinedTuCount)
                                );
                            }
                            case "浓缩金" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "concentrated_jin")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中浓缩金元素不足")
                                    );
                                    return;
                                }
                                int inamount = amount;
                                for (int slot : slots) {
                                    ItemStack itemStack = itemStacks[slot];
                                    int amountNow = itemStack.getAmount();
                                    if (inamount > amountNow) {
                                        inamount -= amountNow;
                                        itemStack.setAmount(0);
                                    } else {
                                        itemStack.setAmount(amountNow - inamount);
                                        break;
                                    }
                                }
                                data.concentratedJinCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩金存储量: §b" + data.concentratedJinCount)
                                );
                            }
                            case "浓缩木" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "concentrated_mu")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中浓缩木元素不足")
                                    );
                                    return;
                                }
                                int inamount = amount;
                                for (int slot : slots) {
                                    ItemStack itemStack = itemStacks[slot];
                                    int amountNow = itemStack.getAmount();
                                    if (inamount > amountNow) {
                                        inamount -= amountNow;
                                        itemStack.setAmount(0);
                                    } else {
                                        itemStack.setAmount(amountNow - inamount);
                                        break;
                                    }
                                }
                                data.concentratedMuCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩木存储量: §b" + data.concentratedMuCount)
                                );
                            }
                            case "浓缩水" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "concentrated_shui")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中浓缩水元素不足")
                                    );
                                    return;
                                }
                                int inamount = amount;
                                for (int slot : slots) {
                                    ItemStack itemStack = itemStacks[slot];
                                    int amountNow = itemStack.getAmount();
                                    if (inamount > amountNow) {
                                        inamount -= amountNow;
                                        itemStack.setAmount(0);
                                    } else {
                                        itemStack.setAmount(amountNow - inamount);
                                        break;
                                    }
                                }
                                data.concentratedShuiCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩水存储量: §b" + data.concentratedShuiCount)
                                );
                            }
                            case "浓缩火" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "concentrated_huo")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中浓缩火元素不足")
                                    );
                                    return;
                                }
                                int inamount = amount;
                                for (int slot : slots) {
                                    ItemStack itemStack = itemStacks[slot];
                                    int amountNow = itemStack.getAmount();
                                    if (inamount > amountNow) {
                                        inamount -= amountNow;
                                        itemStack.setAmount(0);
                                    } else {
                                        itemStack.setAmount(amountNow - inamount);
                                        break;
                                    }
                                }
                                data.concentratedHuoCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩火存储量: §b" + data.concentratedHuoCount)
                                );
                            }
                            case "浓缩土" -> {
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
                                    if (itemStack.getType() != Material.KELP) {
                                        continue;
                                    }
                                    if (!Objects.equals(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), "concentrated_tu")) {
                                        continue;
                                    }
                                    slots.add(i);
                                    count += itemStack.getAmount();
                                }
                                if (count < amount) {
                                    player.sendMessage(
                                            Component.text("§6[命令系统]§4背包中浓缩土元素不足")
                                    );
                                    return;
                                }
                                int inamount = amount;
                                for (int slot : slots) {
                                    ItemStack itemStack = itemStacks[slot];
                                    int amountNow = itemStack.getAmount();
                                    if (inamount > amountNow) {
                                        inamount -= amountNow;
                                        itemStack.setAmount(0);
                                    } else {
                                        itemStack.setAmount(amountNow - inamount);
                                        break;
                                    }
                                }
                                data.concentratedTuCount += amount;
                                player.sendMessage(
                                        Component.text("§6[命令系统]§a当前浓缩土存储量: §b" + data.concentratedTuCount)
                                );
                            }
                            default -> player.sendMessage(
                                    Component.text("§6[命令系统]§4参数错误").color(NamedTextColor.DARK_RED)
                            );
                        }
                    }
                    case "check" -> {
                        if (args.length != 1) {
                            player.sendMessage(
                                    Component.text("§6[命令系统]§4参数错误").color(NamedTextColor.DARK_RED)
                            );
                            return;
                        }

                        List.of(
                                Component.text("§6[命令系统]§a金存储量: §b" + data.jinCount + " §a精炼金存储量: §b" + data.refinedJinCount + " §a浓缩金存储量: §b" + data.concentratedJinCount),
                                Component.text("§6[命令系统]§a木存储量: §b" + data.muCount + " §a精炼木存储量: §b" + data.refinedMuCount + " §a浓缩木存储量: §b" + data.concentratedMuCount),
                                Component.text("§6[命令系统]§a水存储量: §b" + data.shuiCount + " §a精炼水存储量: §b" + data.refinedShuiCount + " §a浓缩水存储量: §b" + data.concentratedShuiCount),
                                Component.text("§6[命令系统]§a火存储量: §b" + data.huoCount + " §a精炼火存储量: §b" + data.refinedHuoCount + " §a浓缩火存储量: §b" + data.concentratedHuoCount),
                                Component.text("§6[命令系统]§a土存储量: §b" + data.tuCount + " §a精炼土存储量: §b" + data.refinedTuCount + " §a浓缩土存储量: §b" + data.concentratedTuCount)
                        ).forEach(player::sendMessage);

                    }
                    default -> player.sendMessage(
                            Component.text("§6[命令系统]§4参数错误")
                    );
                }
            }
        }.runTaskAsynchronously(Yuehua.instance);


        return true;
    }
}
