package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.UUID;


public final class Quit implements org.bukkit.event.Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        UUID uuid = player.getUniqueId();
        Data data = Yuehua.playerData.get(uuid);
        if (data == null) {
            return;
        }

        data.taskIds.forEach(it -> Yuehua.scheduler.cancelTask(it));
        Yuehua.playerData.remove(uuid);


        PersistentDataContainer pdc = player.getPersistentDataContainer();
        pdc.set(DataContainer.money, PersistentDataType.INTEGER, data.money);
        pdc.set(DataContainer.JinCount, PersistentDataType.INTEGER, data.jinCount);
        pdc.set(DataContainer.MuCount, PersistentDataType.INTEGER, data.muCount);
        pdc.set(DataContainer.ShuiCount, PersistentDataType.INTEGER, data.shuiCount);
        pdc.set(DataContainer.HuoCount, PersistentDataType.INTEGER, data.huoCount);
        pdc.set(DataContainer.TuCount, PersistentDataType.INTEGER, data.tuCount);
        pdc.set(DataContainer.RefinedJinCount, PersistentDataType.INTEGER, data.refinedJinCount);
        pdc.set(DataContainer.RefinedMuCount, PersistentDataType.INTEGER, data.refinedMuCount);
        pdc.set(DataContainer.RefinedShuiCount, PersistentDataType.INTEGER, data.refinedShuiCount);
        pdc.set(DataContainer.RefinedHuoCount, PersistentDataType.INTEGER, data.refinedHuoCount);
        pdc.set(DataContainer.RefinedTuCount, PersistentDataType.INTEGER, data.refinedTuCount);
        pdc.set(DataContainer.ConcentratedJinCount, PersistentDataType.INTEGER, data.concentratedJinCount);
        pdc.set(DataContainer.ConcentratedMuCount, PersistentDataType.INTEGER, data.concentratedMuCount);
        pdc.set(DataContainer.ConcentratedShuiCount, PersistentDataType.INTEGER, data.concentratedShuiCount);
        pdc.set(DataContainer.ConcentratedHuoCount, PersistentDataType.INTEGER, data.concentratedHuoCount);
        pdc.set(DataContainer.ConcentratedTuCount, PersistentDataType.INTEGER, data.concentratedTuCount);


        if (data.job == 2) {
            GongData gongData = (GongData) data;
            pdc.set(DataContainer.arrow_count, PersistentDataType.INTEGER, gongData.arrow_count);
            pdc.set(DataContainer.time_charging, PersistentDataType.LONG, gongData.time_charging);
        }

        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
            String name = player.getName();
            if (data.inventory1 != null) {
                SQL.storePlayerInventory1(name, data.inventory1);
            }
            if (data.inventory2 != null) {
                SQL.storePlayerInventory2(name, data.inventory2);
            }
            if (data.inventory3 != null) {
                SQL.storePlayerInventory3(name, data.inventory3);
            }
            if (data.inventory4 != null) {
                SQL.storePlayerInventory4(name, data.inventory4);
            }
            if (data.inventory5 != null) {
                SQL.storePlayerInventory5(name, data.inventory5);
            }
            if (data.inventory6 != null) {
                SQL.storePlayerInventory6(name, data.inventory6);
            }
            if (data.inventory7 != null) {
                SQL.storePlayerInventory7(name, data.inventory7);
            }
            if (data.inventory8 != null) {
                SQL.storePlayerInventory8(name, data.inventory8);
            }
            if (data.inventory9 != null) {
                SQL.storePlayerInventory9(name, data.inventory9);
            }
            if (data.inventory10 != null) {
                SQL.storePlayerInventory10(name, data.inventory10);
            }
            if (data.inventory11 != null) {
                SQL.storePlayerInventory11(name, data.inventory11);
            }
            if (data.inventory12 != null) {
                SQL.storePlayerInventory12(name, data.inventory12);
            }
            if (data.inventory13 != null) {
                SQL.storePlayerInventory13(name, data.inventory13);
            }
            if (data.inventory14 != null) {
                SQL.storePlayerInventory14(name, data.inventory14);
            }
            if (data.inventory15 != null) {
                SQL.storePlayerInventory15(name, data.inventory15);
            }
            if (data.inventory16 != null) {
                SQL.storePlayerInventory16(name, data.inventory16);
            }
            if (data.inventory17 != null) {
                SQL.storePlayerInventory17(name, data.inventory17);
            }
            if (data.inventory18 != null) {
                SQL.storePlayerInventory18(name, data.inventory18);
            }
            if (data.shipinBar != null){
                SQL.storeShiPin(uuid.toString(), data.shipinBar);
            }
        });
    }
}
