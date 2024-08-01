package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.itemstack.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.itemstack.liandan.Dan;
import com.xiaoxiaoowo.yuehua.itemstack.other.Food;
import com.xiaoxiaoowo.yuehua.itemstack.other.Money;
import com.xiaoxiaoowo.yuehua.itemstack.other.Other;
import com.xiaoxiaoowo.yuehua.itemstack.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.itemstack.zhuangbei.*;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

import static com.xiaoxiaoowo.yuehua.utils.LocationSet.*;

@SuppressWarnings("deprecation")
public final class IntoGame implements CommandExecutor {


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

        UUID uuid = player.getUniqueId();
        Yuehua.playerData.remove(uuid);

        //设置tpsBar与ramBar


        String name = player.getName();
        Bukkit.dispatchCommand(Yuehua.console, "tpsbar " + name);
        Bukkit.dispatchCommand(Yuehua.console, "rambar " + name);

        PersistentDataContainer pdc = player.getPersistentDataContainer();
        int race = pdc.get(DataContainer.race, PersistentDataType.INTEGER);
        int job = pdc.get(DataContainer.job, PersistentDataType.INTEGER);

        //给予物品
        //包子10个
        ItemStack baozi = Food.baoZi.clone();
        baozi.setAmount(10);
        //铜钱15枚
        ItemStack tongqian = Money.tongQian.clone();
        tongqian.setAmount(15);
        //NPC对话泡泡
        ItemStack npc_paopao = Other.NPC_PAOPAO.clone();
        //弓箭手特供道具 一组箭
        ItemStack arrow = Other.ARROW.clone();
        arrow.setAmount(99);
        //炼丹师特供道具 初级药引1枚、木元素5枚、金元素5枚
        ItemStack yaoyin1 = Dan.YAOYIN1.clone();
        yaoyin1.setAmount(1);
        ItemStack muyuansu = YuanSu.mu.clone();
        muyuansu.setAmount(5);
        ItemStack jinyuansu = YuanSu.jin.clone();
        jinyuansu.setAmount(5);
        //种族证明
        ItemStack race_province = switch (race) {
            case 1 -> RaceProvince.shen.clone();
            case 2 -> RaceProvince.xian.clone();
            case 3 -> RaceProvince.ren.clone();
            case 4 -> RaceProvince.yao.clone();
            case 5 -> RaceProvince.zhanShen.clone();
            default -> null;
        };
        //给予物品
        PlayerInventory inventory = player.getInventory();
        inventory.addItem(ArmorHead.tou1.clone(), ArmorChest.xiong1.clone(), ArmorLeg.tui1.clone(), ArmorFeet.xie1.clone());
        switch (job) {
            case 1 -> {
                baozi.setAmount(10*3);
                inventory.addItem(baozi, tongqian, npc_paopao, race_province, Weapon.TAO_MU_JIAN.clone());
            }

            case 2 -> inventory.addItem(baozi, tongqian, npc_paopao, race_province, arrow,Weapon.TENG_MU_GONG.clone());


            case 3 -> inventory.addItem(baozi, tongqian, npc_paopao, race_province, yaoyin1, muyuansu, jinyuansu,Weapon.HEI_TIE_GUO.clone());

        }

        //设置重生点
        player.setBedSpawnLocation(SPAWN, true);

        //回满血回满饱和度
        player.setHealth(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());
        player.setFoodLevel(20);
        player.setSaturation(20);
        player.setTitleTimes(15, 80, 20);

        //种族BUFF与TP到种族点
        player.getActivePotionEffects().forEach(it -> player.removePotionEffect(it.getType()));
        switch (race) {
            case 1 -> {
                player.teleportAsync(TP_SHEN);
            }
            case 2 -> {
                player.teleportAsync(TP_XIAN);
            }
            case 3 -> {
                player.teleportAsync(TP_REN);
            }
            case 4 -> {
                player.teleportAsync(TP_YAO);
            }
            case 5 -> {
                player.teleportAsync(TP_ZHAN);
            }
        }

        switch (job) {
            case 1 -> Yuehua.playerData.put(uuid, new ZhanData(player));
            case 2 -> Yuehua.playerData.put(uuid, new GongData(player));
            case 3 -> Yuehua.playerData.put(uuid, new DanData(player));
        }

        return true;
    }
}
