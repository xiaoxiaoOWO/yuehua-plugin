package com.xiaoxiaoowo.yuehua.commands.blockcommand;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.items.Book;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.items.liandan.Dan;
import com.xiaoxiaoowo.yuehua.items.other.*;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.*;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import com.xiaoxiaoowo.yuehua.utils.Transfer;
import net.kyori.adventure.text.Component;
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
import org.java_websocket.WebSocket;
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


        Data dataOld = Yuehua.playerData.get(player.getUniqueId());
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
            String name = player.getName();
            if (dataOld.inventory1 != null) {
                SQL.storePlayerInventory1(name, dataOld.inventory1);
            }
            if (dataOld.inventory2 != null) {
                SQL.storePlayerInventory2(name, dataOld.inventory2);
            }
            if (dataOld.inventory3 != null) {
                SQL.storePlayerInventory3(name, dataOld.inventory3);
            }
            if (dataOld.inventory4 != null) {
                SQL.storePlayerInventory4(name, dataOld.inventory4);
            }
            if (dataOld.inventory5 != null) {
                SQL.storePlayerInventory5(name, dataOld.inventory5);
            }
            if (dataOld.inventory6 != null) {
                SQL.storePlayerInventory6(name, dataOld.inventory6);
            }
            if (dataOld.inventory7 != null) {
                SQL.storePlayerInventory7(name, dataOld.inventory7);
            }
            if (dataOld.inventory8 != null) {
                SQL.storePlayerInventory8(name, dataOld.inventory8);
            }
            if (dataOld.inventory9 != null) {
                SQL.storePlayerInventory9(name, dataOld.inventory9);
            }
            if (dataOld.inventory10 != null) {
                SQL.storePlayerInventory10(name, dataOld.inventory10);
            }
            if (dataOld.inventory11 != null) {
                SQL.storePlayerInventory11(name, dataOld.inventory11);
            }
            if (dataOld.inventory12 != null) {
                SQL.storePlayerInventory12(name, dataOld.inventory12);
            }
            if (dataOld.inventory13 != null) {
                SQL.storePlayerInventory13(name, dataOld.inventory13);
            }
            if (dataOld.inventory14 != null) {
                SQL.storePlayerInventory14(name, dataOld.inventory14);
            }
            if (dataOld.inventory15 != null) {
                SQL.storePlayerInventory15(name, dataOld.inventory15);
            }
            if (dataOld.inventory16 != null) {
                SQL.storePlayerInventory16(name, dataOld.inventory16);
            }
            if (dataOld.inventory17 != null) {
                SQL.storePlayerInventory17(name, dataOld.inventory17);
            }
            if (dataOld.inventory18 != null) {
                SQL.storePlayerInventory18(name, dataOld.inventory18);
            }
            if (dataOld.shipinBar != null) {
                SQL.storeShiPin(player.getUniqueId().toString(), dataOld.shipinBar);
            }
        });


        PersistentDataContainer pdc = player.getPersistentDataContainer();
        pdc.set(DataContainer.money, PersistentDataType.INTEGER, dataOld.money);
        pdc.set(DataContainer.JinCount, PersistentDataType.INTEGER, dataOld.jinCount);
        pdc.set(DataContainer.MuCount, PersistentDataType.INTEGER, dataOld.muCount);
        pdc.set(DataContainer.ShuiCount, PersistentDataType.INTEGER, dataOld.shuiCount);
        pdc.set(DataContainer.HuoCount, PersistentDataType.INTEGER, dataOld.huoCount);
        pdc.set(DataContainer.TuCount, PersistentDataType.INTEGER, dataOld.tuCount);
        pdc.set(DataContainer.RefinedJinCount, PersistentDataType.INTEGER, dataOld.refinedJinCount);
        pdc.set(DataContainer.RefinedMuCount, PersistentDataType.INTEGER, dataOld.refinedMuCount);
        pdc.set(DataContainer.RefinedShuiCount, PersistentDataType.INTEGER, dataOld.refinedShuiCount);
        pdc.set(DataContainer.RefinedHuoCount, PersistentDataType.INTEGER, dataOld.refinedHuoCount);
        pdc.set(DataContainer.RefinedTuCount, PersistentDataType.INTEGER, dataOld.refinedTuCount);
        pdc.set(DataContainer.ConcentratedJinCount, PersistentDataType.INTEGER, dataOld.concentratedJinCount);
        pdc.set(DataContainer.ConcentratedMuCount, PersistentDataType.INTEGER, dataOld.concentratedMuCount);
        pdc.set(DataContainer.ConcentratedShuiCount, PersistentDataType.INTEGER, dataOld.concentratedShuiCount);
        pdc.set(DataContainer.ConcentratedHuoCount, PersistentDataType.INTEGER, dataOld.concentratedHuoCount);
        pdc.set(DataContainer.ConcentratedTuCount, PersistentDataType.INTEGER, dataOld.concentratedTuCount);

        pdc.set(DataContainer.killEastSkeletonConut, PersistentDataType.INTEGER, dataOld.killEastSkeletonConut);
        pdc.set(DataContainer.killEastZombieCount, PersistentDataType.INTEGER, dataOld.killEastZombieCount);
        pdc.set(DataContainer.killEastSpiderCount, PersistentDataType.INTEGER, dataOld.killEastSpiderCount);

        pdc.set(DataContainer.killEastArrowSkeletonCount, PersistentDataType.INTEGER, dataOld.killEastArrowSkeletonCount);
        pdc.set(DataContainer.killEastPoisonFlyCount, PersistentDataType.INTEGER, dataOld.killEastPoisonFlyCount);
        pdc.set(DataContainer.killEastZombieEliteCount, PersistentDataType.INTEGER, dataOld.killEastZombieEliteCount);
        pdc.set(DataContainer.killEastSpiderEliteCount, PersistentDataType.INTEGER, dataOld.killEastSpiderEliteCount);

        pdc.set(DataContainer.killEastZombieMountainCount, PersistentDataType.INTEGER, dataOld.killEastZombieMountainCount);
        pdc.set(DataContainer.killEastSpiderMountainCount, PersistentDataType.INTEGER, dataOld.killEastSpiderMountainCount);
        pdc.set(DataContainer.killEastArrowSkeletonMountainCount, PersistentDataType.INTEGER, dataOld.killEastArrowSkeletonMountainCount);

        pdc.set(DataContainer.killEastPoisonFlyMountainCount, PersistentDataType.INTEGER, dataOld.killEastPoisonFlyMountainCount);
        pdc.set(DataContainer.killEastPandaMountainCount, PersistentDataType.INTEGER, dataOld.killEastPandaMountainCount);
        pdc.set(DataContainer.killEastArrowSkeletonSHENMUCount, PersistentDataType.INTEGER, dataOld.killEastArrowSkeletonSHENMUCount);

        pdc.set(DataContainer.killEastSpiderQueenMountainCount, PersistentDataType.INTEGER, dataOld.killEastSpiderQueenMountainCount);
        pdc.set(DataContainer.killEastWaterGhostMountainCount, PersistentDataType.INTEGER, dataOld.killEastWaterGhostMountainCount);
        pdc.set(DataContainer.killEastPoisonSpiderMountainCount, PersistentDataType.INTEGER, dataOld.killEastPoisonSpiderMountainCount);


        if (dataOld.job == 2) {
            GongData gongData = (GongData) dataOld;
            pdc.set(DataContainer.arrow_count, PersistentDataType.INTEGER, gongData.arrow_count);
            pdc.set(DataContainer.time_charging, PersistentDataType.LONG, gongData.time_charging);
        }

        if (dataOld.job == 3) {
            DanData danData = (DanData) dataOld;
            //金木水火土
            pdc.set(DataContainer.jinCd, PersistentDataType.LONG, danData.cd_jin);
            pdc.set(DataContainer.muCd, PersistentDataType.LONG, danData.cd_mu);
            pdc.set(DataContainer.shuiCd, PersistentDataType.LONG, danData.cd_shui);
            pdc.set(DataContainer.huoCd, PersistentDataType.LONG, danData.cd_huo);
            pdc.set(DataContainer.tuCd, PersistentDataType.LONG, danData.cd_tu);
        }

        UUID uuid = player.getUniqueId();

        //设置tpsBar与ramBar


        String name = player.getName();
        Bukkit.dispatchCommand(Yuehua.console, "tpsbar " + name);
        Bukkit.dispatchCommand(Yuehua.console, "rambar " + name);


        int race = pdc.get(DataContainer.race, PersistentDataType.INTEGER);
        int job = pdc.get(DataContainer.job, PersistentDataType.INTEGER);

        //给予物品
        //包子99个
        ItemStack baozi = Food.baoZi.clone();
        baozi.setAmount(99);
        //铜钱99枚
        ItemStack tongqian = Money.tongQian.clone();
        tongqian.setAmount(99);
        //NPC对话泡泡
        ItemStack npc_paopao = Other.NPC_PAOPAO.clone();
        //弓箭手特供道具 一组箭
        ItemStack arrow = Other.ARROW.clone();
        arrow.setAmount(99);
        //炼丹师特供道具 初级药引1枚、木元素5枚、15
        ItemStack yaoyin1 = Dan.YAOYIN1.clone();
        yaoyin1.setAmount(5);
        ItemStack muyuansu = YuanSu.mu.clone();
        muyuansu.setAmount(10);
        ItemStack jinyuansu = YuanSu.jin.clone();
        jinyuansu.setAmount(30);

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
        inventory.clear();
        inventory.addItem(Book.START);
        inventory.addItem(Book.SHUXIN);
        inventory.addItem(Book.NEIRONG);
        inventory.addItem(Book.WANFA);
        inventory.addItem(Book.JINJI);
        inventory.addItem(Feather.XIN_YA_ZHI_YU);
        inventory.addItem(ArmorHead.tou1.clone(), ArmorChest.xiong1.clone(), ArmorLeg.tui1.clone(), ArmorFeet.xie1.clone());
        switch (job) {
            case 1 -> {
                baozi.setAmount(99 * 3);
                inventory.addItem(baozi, tongqian, npc_paopao, race_province, Weapon.TAO_MU_JIAN.clone());
            }

            case 2 -> inventory.addItem(baozi, tongqian, npc_paopao, race_province, arrow, Weapon.TENG_MU_GONG.clone());


            case 3 ->
                    inventory.addItem(baozi, tongqian, npc_paopao, race_province, yaoyin1, muyuansu, jinyuansu, Weapon.HEI_TIE_GUO.clone(), YiQi.FANGSHENDUANBI.clone());

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

        WebSocket webSocket = Yuehua.playerData.get(uuid).webSocket;
        Yuehua.playerData.remove(uuid);
        switch (job) {
            case 1 -> Yuehua.playerData.put(uuid, new ZhanData(player));
            case 2 -> Yuehua.playerData.put(uuid, new GongData(player));
            case 3 -> Yuehua.playerData.put(uuid, new DanData(player));
        }
        Data data = Yuehua.playerData.get(uuid);
        data.webSocket = webSocket;
        Transfer.transferAttribute(data);

        return true;
    }
}
