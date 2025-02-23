package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.AdvancementSet;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
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
                if (levelAward == 10) {
                    player.addScoreboardTag("qkd5");
                    AdvancementSet.giveAdv(player, AdvancementSet.qkd5unlock, 30);
                    SendInformation.sendMes(player, Component.text("§6[等级奖励]§a达到100级，解锁乾坤盒☯五！"));
                }
            }
        }

    }


    public void doLevelChange(int level, Player player) {
        List<Component> components = new ArrayList<>();

        components.add(Component.text("§6[等级奖励]§a恭喜你升级到了§b" + level + "§a级！"));

        switch (level) {
            case 10 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_10, 5);
            case 20 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_20, 10);
            case 30 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_30, 15);
            case 40 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_40, 20);
            case 50 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_50, 25);
            case 60 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_60, 30);
            case 70 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_70, 35);
            case 80 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_80, 40);
            case 90 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_90, 45);
            case 100 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_100, 50);
            case 110 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_110, 55);
            case 120 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_120, 60);
            case 130 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_130, 65);
            case 140 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_140, 70);
            case 150 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_150, 75);
            case 160 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_160, 80);
            case 170 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_170, 85);
            case 180 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_180, 90);
            case 190 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_190, 95);
            case 200 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_200, 100);
            case 210 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_210, 105);
            case 220 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_220, 110);
            case 230 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_230, 115);
            case 240 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_240, 120);
            case 250 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_250, 125);
            case 260 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_260, 130);
            case 270 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_270, 135);
            case 280 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_280, 140);
            case 290 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_290, 145);
            case 300 -> AdvancementSet.giveAdv(player, AdvancementSet.xp_300, 150);
        }


        Data data = Yuehua.playerData.get(player.getUniqueId());
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        //种族增益,神族为最大生命，仙族为破法，人族为格挡，战神族为进攻属性，妖族为生机
        switch (data.race) {
            case 1 -> {
                components.add(
                        Component.text("§6[等级奖励]§e[神族祝福]§a最大生命增加了§b16§a点！")
                );
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 16);
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
                        Component.text("§6[等级奖励]§e[人族祝福]§a格挡增加了§b2§a点！")
                );
                double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 2);
                data.setGedangScore(baseValue + 2);
            }
            case 5 -> {
                components.add(
                        Component.text("§6[等级奖励]§e[战神族祝福]§a进攻属性增加了§b2§a点！")
                );
                switch (data.job) {
                    case 1 -> {
                        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 6);
                        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                        double finalValue = mulValue * (baseValue + 6);
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
            case 4 -> {
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
                //战士，每次获得4护甲4法抗12攻击
                components.add(
                        Component.text("§6[等级奖励]§e[战士]§a护甲增加了§b2§a点！")
                );
                double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue + 0.02);
                data.setHujiaScore(baseValue + 0.02);


                components.add(
                        Component.text("§6[等级奖励]§e[战士]§a攻击增加了§b12§a点！")
                );
                double baseValue3 = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue3 + 12);
                double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue3 + 12);
                pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                data.setAttackScore(finalValue);

                components.add(
                        Component.text("§6[等级奖励]§e[战士]§a最大生命增加了§b32§a点！")
                );
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue4 = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue4 + 32);

                components.add(
                        Component.text("§6[等级奖励]§e[战士]§a守护增加了§b16§a点！")
                );
                double baseValue5 = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shouhu, PersistentDataType.DOUBLE, baseValue5 + 16);
                data.setShouhuScore(baseValue5 + 16);


            }

            case 2 -> {
                //弓箭手，每次获得1韧性和4箭矢强度
                components.add(
                        Component.text("§6[等级奖励]§e[弓箭手]§a韧性增加了§b1§a点！")
                );
                double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.01);
                data.setRenxingScore(baseValue + 0.01);
                components.add(
                        Component.text("§6[等级奖励]§e[弓箭手]§a箭矢强度增加了§b4§a点！")
                );
                double baseValue2 = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue2 + 4);
                double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue2 + 4);
                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                GongData gongData = (GongData) data;
                gongData.setArrowScore(finalValue);

                components.add(
                        Component.text("§6[等级奖励]§e[弓箭手]§a最大生命增加了§b32§a点！")
                );
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue4 = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue4 + 32);

                components.add(
                        Component.text("§6[等级奖励]§e[弓箭手]§a守护增加了§b16§a点！")
                );
                double baseValue5 = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shouhu, PersistentDataType.DOUBLE, baseValue5 + 16);
                data.setShouhuScore(baseValue5 + 16);
            }

            case 3 -> {
                //炼丹师，每次获得1破法和4阵法强度
                components.add(
                        Component.text("§6[等级奖励]§e[炼丹师]§a破法增加了§b1§a点！")
                );
                double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue + 0.01);
                data.setPofaScore(baseValue + 0.01);
                components.add(
                        Component.text("§6[等级奖励]§e[炼丹师]§a阵法强度增加了§b4§a点！")
                );
                double baseValue2 = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue2 + 4);
                double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue2 + 4);
                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                DanData danData = (DanData) data;
                danData.setZhenfaScore(finalValue);

                components.add(
                        Component.text("§6[等级奖励]§e[炼丹师]§a最大生命增加了§b32§a点！")
                );
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue4 = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue4 + 32);

                components.add(
                        Component.text("§6[等级奖励]§e[炼丹师]§a守护增加了§b16§a点！")
                );
                double baseValue5 = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shouhu, PersistentDataType.DOUBLE, baseValue5 + 16);
                data.setShouhuScore(baseValue5 + 16);
            }
        }

        SendInformation.sendMes(player, components);
        PlaySound.bigSuccess(player);
    }

}
