package com.xiaoxiaoowo.yuehua.shilian.huancheng;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.items.other.Feather;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public final class HuanCheng implements CommandExecutor {
    public final static Location out = new Location(GetEntity.world, 28.5, 48, -8.5, -90, 0);
    public final static Location in = new Location(GetEntity.world, 21.5, 45, -9.5, 0, 0);

    public static final PotionEffect baohe = new PotionEffect(PotionEffectType.SATURATION, -1, 0);
    public static final PotionEffect zhiliao = new PotionEffect(PotionEffectType.INSTANT_HEALTH, -1, 20);

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
        Player player = GetEntity.getNearestPlayer(location, 2, 2.5, 2);
        if (player == null) {
            return true;
        }
        PersistentDataContainer pdc = player.getPersistentDataContainer();


        switch (args[0]) {
            case "in" -> {
                pdc.set(DataContainer.huanChengTime, PersistentDataType.LONG, GetEntity.world.getGameTime());
                pdc.set(DataContainer.fuben, PersistentDataType.INTEGER, 702);
                Data data = Yuehua.playerData.get(player.getUniqueId());
                data.fuben = 702;
                player.removePotionEffect(PotionEffectType.JUMP_BOOST);

                player.addPotionEffect(baohe);
                player.addPotionEffect(zhiliao);


                SendInformation.sendMes(player, Component.text("§6[环城跑酷]§a开始环城跑酷！"));
                player.teleportAsync(in);
                Scheduler.syncLater(() -> {
                    PlaySound.teleportIn(player);
                }, 4);

            }

            case "finish" -> {
                player.removePotionEffect(PotionEffectType.SATURATION);
                player.removePotionEffect(PotionEffectType.INSTANT_HEALTH);

                pdc.set(DataContainer.fuben, PersistentDataType.INTEGER, 0);
                Data data = Yuehua.playerData.get(player.getUniqueId());
                data.fuben = 0;
                long time = GetEntity.world.getGameTime() - pdc.get(DataContainer.huanChengTime, PersistentDataType.LONG);
                //全服公共XXX玩家完成环城跑酷，用时XXX秒
                SendInformation.broadcastMes(
                        Component.text("§6[环城跑酷]§b" + player.getName() + "§a完成环城跑酷，用时§b" + time / 20 + "§a秒")
                );
                player.teleportAsync(out);
                Scheduler.syncLater(() -> {
                    PlaySound.bigSuccess(player);
                }, 4);

                if (time < 20 * 300) {
                    SendInformation.sendMes(
                            player, Component.text("§6[环城跑酷]§a用时小于§b5§a分钟，获得奖励：§a彤鹤之羽碎片 × §b4")
                    );
                    ItemStack itemStack1 = Feather.TONG_HE_ZHI_YU_SUI_PIAN.clone();
                    itemStack1.setAmount(4);

                    player.getInventory().addItem(itemStack1);

                    AdvancementSet.giveAdv(player, AdvancementSet.huancheng1, 30);
                    AdvancementSet.giveAdv(player, AdvancementSet.huancheng2, 30);
                    AdvancementSet.giveAdv(player, AdvancementSet.huancheng3, 30);

                } else if (time < 20 * 600) {
                    SendInformation.sendMes(
                            player, Component.text("§6[环城跑酷]§a用时小于§b10§a分钟，获得奖励：§a青鸾之羽碎片 × §b4")
                    );
                    ItemStack itemStack1 = Feather.QING_LUAN_ZHI_YU_SUI_PIAN.clone();
                    itemStack1.setAmount(4);
                    player.getInventory().addItem(itemStack1);

                    AdvancementSet.giveAdv(player, AdvancementSet.huancheng1, 30);
                    AdvancementSet.giveAdv(player, AdvancementSet.huancheng2, 30);

                } else {
                    SendInformation.sendMes(
                            player, Component.text("§6[环城跑酷]§a用时大于§b10§a分钟，获得奖励：§a金鹏之羽碎片 ✖ §b4")
                    );

                    ItemStack itemStack1 = Feather.JIN_PENG_ZHI_YU_SUI_PIAN.clone();
                    itemStack1.setAmount(4);
                    player.getInventory().addItem(itemStack1);

                    AdvancementSet.giveAdv(player, AdvancementSet.huancheng1, 30);
                }


            }
        }

        return true;
    }
}
