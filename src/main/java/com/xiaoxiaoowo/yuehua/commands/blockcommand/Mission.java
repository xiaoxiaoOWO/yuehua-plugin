package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.entity.monster.other.zhanzhixian.WuShi;
import com.xiaoxiaoowo.yuehua.entity.monster.other.zhanzhixian.WuShiShooter;
import com.xiaoxiaoowo.yuehua.guis.mission.PanLing;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.persistence.PersistentDataContainerView;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public final class Mission implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player player) {
            Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                player.sendMessage(
                        Component.text("§6[命令系统]§4你没有权限使用这个命令")
                );
            });
            return true;
        }

        BlockCommandSender blockCommandSender = (BlockCommandSender) sender;
        Location location = blockCommandSender.getBlock().getLocation();

        Player player = GetEntity.getNearestPlayer(location, 5, 5, 5);
        if (player == null) {
            return true;
        }
        switch (args[0]) {
            case "maikefeng" ->
                    player.getInventory().addItem(com.xiaoxiaoowo.yuehua.items.other.Mission.maikefeng.clone());
            case "gongmi" -> {
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("gongmixinqitian")) {
                    player.teleport(new Location(GetEntity.world, 168.5, 12, 137.5, 90, 0));
                    player.getPersistentDataContainer().set(DataContainer.xinqitian, PersistentDataType.INTEGER, 2);
                    player.getInventory().setItemInMainHand(null);
                }
            }

            case "yaocaobao" -> {
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("caoyaobao")) {
                    player.teleport(new Location(GetEntity.world, 167.5, 47, 162.5, 90, 0));
                    player.getPersistentDataContainer().set(DataContainer.xinqitian, PersistentDataType.INTEGER, 3);
                    player.getInventory().setItemInMainHand(null);
                }
            }

            case "tuzi" -> {
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("yuzhuzijue")) {
                    player.teleport(new Location(GetEntity.world, 167.5, 47, 162.5, 90, 0));
                    player.getInventory().setItemInMainHand(null);
                }
            }

            case "zhinv" -> {
                Set<String> tags = player.getScoreboardTags();
                if (tags.contains("racezhixian")) {
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("zhinvxin")) {
                    player.getInventory().setItemInMainHand(null);

                    player.addScoreboardTag("racezhixian");
                    AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                    double baseValue = attributeInstance.getBaseValue();
                    attributeInstance.setBaseValue(baseValue + 32);
                    PlaySound.success(player);
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§a织女:§f总之,感谢你让我找回真爱,这是给你的报酬,谢谢你啊。你的最大生命值增加了§b32§a！"));
                }
            }

            case "shenzhixian" -> {
                Set<String> tags = player.getScoreboardTags();
                if (tags.contains("racezhixian")) {
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("banmeiyupei")) {
                    player.getInventory().setItemInMainHand(null);
                    player.teleport(new Location(GetEntity.world, -697, 142, 353));
                }
            }

            case "zhanzhixian" -> {
                Set<String> tags = player.getScoreboardTags();
                if (tags.contains("racezhixian")) {
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("gongsunshaoye")) {
                    player.getInventory().setItemInMainHand(null);
                    player.teleport(new Location(GetEntity.world, 276, 24, -180));
                }
            }

            case "yaozhixian" -> {
                Set<String> tags = player.getScoreboardTags();
                if (tags.contains("racezhixian")) {
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("shenmuyaojingchouduan")) {
                    player.getInventory().setItemInMainHand(null);
                    player.teleport(new Location(GetEntity.world, 5, 34, 823));
                }
            }

            case "renzhixian" -> {
                Set<String> tags = player.getScoreboardTags();
                if (tags.contains("racezhixian")) {
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                    return true;
                }

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("tuzixinwu")) {
                    player.getInventory().setItemInMainHand(null);

                    player.addScoreboardTag("racezhixian");
                    AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                    double baseValue = attributeInstance.getBaseValue();
                    attributeInstance.setBaseValue(baseValue + 32);
                    PlaySound.success(player);
                    SendInformation.sendMes(player, Component.text("§e[支线任务]§a兔子妖王：§f感谢你送这个小家伙回来,我代这小子谢过了.由于心存善念，你的最大生命值增加了§b32§a！"));
                }
            }

            case "zhanbegin" -> {
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                if (itemStack.getType() == Material.WRITTEN_BOOK) {
                    if (!itemStack.getPersistentDataContainer().has(DataContainer.id)) {
                        return true;
                    }

                    if (itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING).equals("zhanshenzhixian")) {
                        if (player.getScoreboardTags().contains("racezhixian")) {
                            SendInformation.sendMes(player, Component.text("§e[支线任务]§4你已经获得了奖励！"));
                            return true;
                        }

                        player.teleport(new Location(GetEntity.world, 283, 44, -11));
                        player.getInventory().setItemInMainHand(null);

                        WuShi.spawn(new Location(GetEntity.world, 284, 45, -16));
                        WuShiShooter.spawn(new Location(GetEntity.world, 282, 45, -16));
                    }
                }
            }

            case "zhanover" -> {
                boolean can = true;
                for (Entity entity : GetEntity.getMonsters(new Location(GetEntity.world, 283, 44, -16), 20, 10, 20)) {
                    if (entity.getScoreboardTags().contains("m")) {
                        can = false;
                        break;
                    }
                }
                if(can){
                    player.teleport(new Location(GetEntity.world, 285, 44, -27));
                }

            }

            case "yuzhu" -> {
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    if (itemStack.getType() == Material.NETHER_WART) {
                        if (itemStack.getDisplayName().equals("pl.item.name.xian_hide_key")) {
                            if (player.getScoreboardTags().contains("finishXianHide")) {
                                SendInformation.sendMes(player, Component.text("§e[隐藏剧情]§4你已经获得了奖励！"));
                                return true;
                            }

                            player.teleport(new Location(GetEntity.world, -331.5, 97, -445.5));
                            player.getInventory().setItemInMainHand(null);
                        }
                    }

                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("yuzhuzijue")) {
                    player.teleport(new Location(GetEntity.world, -320.5, 97, -425.5, 90, 0));
                    player.getInventory().setItemInMainHand(null);
                }
            }

            case "shenhide" -> {
                if (player.getScoreboardTags().contains("finishShenHide")) {
                    SendInformation.sendMes(player, Component.text("§e[隐藏剧情]§4你已经获得了奖励！"));
                    return true;
                }

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("shenhide")) {
                    player.teleport(new Location(GetEntity.world, 123.5, 32, 817.5, 180, 0));
                    player.getInventory().setItemInMainHand(null);
                }
            }

            case "zhanshenhide" -> {
                if (player.getScoreboardTags().contains("finishZhanHide")) {
                    SendInformation.sendMes(player, Component.text("§e[隐藏剧情]§4你已经获得了奖励！"));
                    return true;
                }

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("zhanshenhide")) {
                    player.teleport(new Location(GetEntity.world, -677, 139, 349));
                    player.getInventory().setItemInMainHand(null);
                }
            }


            case "yaohide" -> {
                if (player.getScoreboardTags().contains("finishYaoHide")) {
                    SendInformation.sendMes(player, Component.text("§e[隐藏剧情]§4你已经获得了奖励！"));
                    return true;
                }
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("yaohide")) {
                    player.teleport(new Location(GetEntity.world, 338.5, 16, -715.5, 0, 0));
                    player.getInventory().setItemInMainHand(null);
                }
            }

            case "renhide" -> {
                if (player.getScoreboardTags().contains("finishRenHide")) {
                    SendInformation.sendMes(player, Component.text("§e[隐藏剧情]§4你已经获得了奖励！"));
                    return true;
                }
                ItemStack itemStack = player.getInventory().getItemInMainHand();
                PersistentDataContainerView persistentDataContainerView = itemStack.getPersistentDataContainer();
                if (!persistentDataContainerView.has(DataContainer.id)) {
                    return true;
                }

                if (persistentDataContainerView.get(DataContainer.id, PersistentDataType.STRING).equals("renhide")) {
                    player.teleport(new Location(GetEntity.world, -114.5, 33, 133.5, -90, 0));
                    player.getInventory().setItemInMainHand(null);
                }
            }

            case "jianyiren" -> player.getInventory().addItem(com.xiaoxiaoowo.yuehua.items.other.Mission.jianyiRen);
            case "jianyitian" -> player.getInventory().addItem(com.xiaoxiaoowo.yuehua.items.other.Mission.jianyiTian);
            case "jianyidi" -> player.getInventory().addItem(com.xiaoxiaoowo.yuehua.items.other.Mission.jianyiDi);

            case "jianyi" -> Scheduler.sync(() -> player.openInventory(PanLing.jianyi));

            case "yuanwu" -> Scheduler.sync(() -> player.openInventory(PanLing.xuanwu));

        }

        return true;
    }
}
