package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public final class LevelChange implements Listener {
    @EventHandler
    public void onLevelChange(PlayerLevelChangeEvent e) {
        int newLevel = e.getNewLevel();
        if (newLevel > 9) {
            Player player = e.getPlayer();
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            int levelAward = pdc.get(DataContainer.levelAward, PersistentDataType.INTEGER);
            int levelAwardShouleBe = newLevel / 10;

            while (levelAward < levelAwardShouleBe) {
                levelAward++;
                pdc.set(DataContainer.levelAward, PersistentDataType.INTEGER, levelAward);
                doLevelChange(levelAward * 10, player);
            }

        }

    }

    public void doLevelChange(int level,Player player){
        List<Component> components = new ArrayList<>();

        components.add(Component.text("§6[等级奖励]§a恭喜你升级到了§b"+level+"§a级！"));

        Data data = Yuehua.playerData.get(player.getUniqueId());
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        //种族增益,神族为最大生命，仙族为破法，人族为格挡，战神族为进攻属性，妖族为生机
        switch (data.race) {
            case 1 -> {
                components.add(
                        Component.text("§6[等级奖励]§e[神族祝福]§a最大生命增加了§b4§a点！")
                );
                AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 4);
            }
            case 2 -> {
                components.add(
                        Component.text("§6[等级奖励]§e[仙族祝福]§a破法增加了§b1§a点！")
                );
                double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue + 0.01);
                data.setPofaScore(baseValue + 0.01);

            }
            case 3 -> {
                components.add(
                        Component.text("§6[等级奖励]§e[人族祝福]§a格挡增加了§b0.5§a点！")
                );
                double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 0.5);
                data.setGedangScore(baseValue + 0.5);
            }
            case 4 -> {
                components.add(
                        Component.text("§6[等级奖励]§e[战神族祝福]§a进攻属性增加了§b2§a点！")
                );
                switch (data.job) {
                    case 1 -> {
                        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 2);
                        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                        double finalValue = mulValue * (baseValue + 2);
                        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                        data.setAttackScore(finalValue);
                    }
                    case 2 -> {
                        double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
                        pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 2);
                        double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
                        double finalValue = mulValue * (baseValue + 2);
                        pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                        GongData gongData = (GongData) data;
                        gongData.setArrowScore(finalValue);
                    }
                    case 3 -> {
                        double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
                        pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 2);
                        double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
                        double finalValue = mulValue * (baseValue + 2);
                        pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                        DanData danData = (DanData) data;
                        danData.setZhenfaScore(finalValue);
                    }

                }
            }
            case 5 -> {
                components.add(
                        Component.text("§6[等级奖励]§e[妖族祝福]§a生机增加了§b1§a点！")
                );
                double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.01);
                data.setShengjiScore(baseValue + 0.01);
            }
        }

        //职业增益
        switch (data.job) {
            case 1 -> {
                //战士，每次获得1护甲1法抗和3攻击
                components.add(
                        Component.text("§6[等级奖励]§e[战士]§a护甲增加了§b1§a点！")
                );
                double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue + 0.01);
                data.setHujiaScore(baseValue + 0.01);
                components.add(
                        Component.text("§6[等级奖励]§e[战士]§a法抗增加了§b1§a点！")
                );
                double baseValue2 = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue2 + 0.01);
                data.setFakangScore(baseValue2 + 0.01);

                components.add(
                        Component.text("§6[等级奖励]§e[战士]§a攻击增加了§b3§a点！")
                );
                double baseValue3 = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue3 + 3);
                double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue3 + 3);
                pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);
            }

            case 2 -> {
                //弓箭手，每次获得1韧性和1箭矢强度
                components.add(
                        Component.text("§6[等级奖励]§e[弓箭手]§a韧性增加了§b1§a点！")
                );
                double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.01);
                data.setRenxingScore(baseValue + 0.01);
                components.add(
                        Component.text("§6[等级奖励]§e[弓箭手]§a箭矢强度增加了§b1§a点！")
                );
                double baseValue2 = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue2 + 1);
                double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue2 + 1);
                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                GongData gongData = (GongData) data;
                gongData.setArrowScore(finalValue);
            }

            case 3 -> {
                //炼丹师，每次获得1破法和1阵法强度
                components.add(
                        Component.text("§6[等级奖励]§e[炼丹师]§a破法增加了§b1§a点！")
                );
                double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue + 0.01);
                data.setPofaScore(baseValue + 0.01);
                components.add(
                        Component.text("§6[等级奖励]§e[炼丹师]§a阵法强度增加了§b1§a点！")
                );
                double baseValue2 = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue2 + 1);
                double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue2 + 1);
                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                DanData danData = (DanData) data;
                danData.setZhenfaScore(finalValue);
            }
        }

        Yuehua.sendMes(components, player);
    }

}