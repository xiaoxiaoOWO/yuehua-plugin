package com.xiaoxiaoowo.yuehua.system.act;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ActYuShi {
    public static void actXueseshi1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 3);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 3);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 3);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 3);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actXueseshi2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 6);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 6);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 6);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 6);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actXueseshi3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 12);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 12);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 12);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 12);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actXueseshi4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 24);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 24);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 24);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 24);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actXueseshi5(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 48);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 48);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi5(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 48);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 48);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actXueseshi6(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 96);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 96);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi6(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 96);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 96);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actXueseshi7(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 192);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 192);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi7(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 192);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 192);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actXueseshi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 384);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue + 384);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void deActXueseshi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();

        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue - 384);
        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
        double finalValue = mulValue * (baseValue - 384);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
        data.setAttackScore(finalValue);
    }

    public static void actCuiLvShi1(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 1);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 1);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi1(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 1);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 1);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actCuiLvShi2(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 2);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 2);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi2(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 2);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 2);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actCuiLvShi3(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 4);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 4);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi3(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 4);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 4);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actCuiLvShi4(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 8);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 8);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi4(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 8);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 8);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actCuiLvShi5(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 16);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 16);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi5(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 16);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 16);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actCuiLvShi6(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 32);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 32);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi6(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 32);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 32);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actCuiLvShi7(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 64);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 64);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi7(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 64);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 64);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actCuiLvShi8(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 128);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 128);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void deActCuiLvShi8(Data data){
        if(data instanceof GongData gongData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue - 128);
            double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 128);
            pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
            gongData.setArrowScore(finalValue);
        }
    }

    public static void actDianLanShi1(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 1);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 1);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi1(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 1);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 1);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actDianLanShi2(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 2);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 2);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi2(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 2);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 2);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actDianLanShi3(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 4);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 4);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi3(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 4);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 4);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actDianLanShi4(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 8);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 8);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi4(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 8);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 8);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actDianLanShi5(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 16);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 16);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi5(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 16);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 16);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actDianLanShi6(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 32);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 32);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi6(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 32);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 32);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actDianLanShi7(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 64);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 64);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi7(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 64);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 64);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actDianLanShi8(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 128);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue + 128);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void deActDianLanShi8(Data data){
        if(data instanceof DanData danData){
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue - 128);
            double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
            double finalValue = mulValue * (baseValue - 128);
            pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
            danData.setZhenfaScore(finalValue);
        }
    }

    public static void actJinHuangShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue + 0.05);
        data.setHujiaScore(baseValue + 0.05);
    }

    public static void deActJinHuangShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue - 0.05);
        data.setHujiaScore(baseValue - 0.05);
    }

    public static void actJinHuangShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setHujiaScore(baseValue + 0.1);
    }

    public static void deActJinHuangShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setHujiaScore(baseValue - 0.1);
    }

    public static void actJinHuangShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue + 0.15);
        data.setHujiaScore(baseValue + 0.15);
    }

    public static void deActJinHuangShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue - 0.15);
        data.setHujiaScore(baseValue - 0.15);
    }

    public static void actJinHuangShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue +  0.2);
        data.setHujiaScore(baseValue +  0.2);
    }

    public static void deActJinHuangShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue -  0.2);
        data.setHujiaScore(baseValue -  0.2);
    }

    public static void actJinHuangShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue +  0.25);
        data.setHujiaScore(baseValue +  0.25);
    }

    public static void deActJinHuangShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue -  0.25);
        data.setHujiaScore(baseValue -  0.25);
    }

    public static void actJinHuangShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue +  0.3);
        data.setHujiaScore(baseValue +  0.3);
    }

    public static void deActJinHuangShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue -  0.3);
        data.setHujiaScore(baseValue -  0.3);
    }

    public static void actJinHuangShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue +  0.35);
        data.setHujiaScore(baseValue +  0.35);
    }

    public static void deActJinHuangShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue -  0.35);
        data.setHujiaScore(baseValue -  0.35);
    }

    public static void actJinHuangShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue +  0.4);
        data.setHujiaScore(baseValue +  0.4);
    }

    public static void deActJinHuangShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue -  0.4);
        data.setHujiaScore(baseValue -  0.4);
    }

    public static void actHouTuShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 2.5);
        data.setGedangScore(baseValue + 2.5);
    }

    public static void deActHouTuShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 2.5);
        data.setGedangScore(baseValue - 2.5);
    }

    public static void actHouTuShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 5);
        data.setGedangScore(baseValue + 5);
    }

    public static void deActHouTuShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 5);
        data.setGedangScore(baseValue - 5);
    }

    public static void actHouTuShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 7.5);
        data.setGedangScore(baseValue + 7.5);
    }

    public static void deActHouTuShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 7.5);
        data.setGedangScore(baseValue - 7.5);
    }

    public static void actHouTuShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 10);
        data.setGedangScore(baseValue + 10);
    }

    public static void deActHouTuShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 10);
        data.setGedangScore(baseValue - 10);
    }

    public static void actHouTuShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 12.5);
        data.setGedangScore(baseValue + 12.5);
    }

    public static void deActHouTuShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 12.5);
        data.setGedangScore(baseValue - 12.5);
    }

    public static void actHouTuShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 15);
        data.setGedangScore(baseValue + 15);
    }

    public static void deActHouTuShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 15);
        data.setGedangScore(baseValue - 15);
    }

    public static void actHouTuShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 17.5);
        data.setGedangScore(baseValue + 17.5);
    }

    public static void deActHouTuShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 17.5);
        data.setGedangScore(baseValue - 17.5);
    }

    public static void actHouTuShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 20);
        data.setGedangScore(baseValue + 20);
    }

    public static void deActHouTuShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue - 20);
        data.setGedangScore(baseValue - 20);
    }

    public static void actZiJingShi1(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 4);
    }

    public static void deActZiJingShi1(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 4);
    }

    public static void actZiJingShi2(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 8);
    }

    public static void deActZiJingShi2(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 8);
    }

    public static void actZiJingShi3(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 16);
    }

    public static void deActZiJingShi3(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 16);
    }

    public static void actZiJingShi4(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 32);
    }

    public static void deActZiJingShi4(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 32);
    }

    public static void actZiJingShi5(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 64);
    }

    public static void deActZiJingShi5(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 64);
    }

    public static void actZiJingShi6(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 128);
    }

    public static void deActZiJingShi6(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 128);
    }

    public static void actZiJingShi7(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 256);
    }

    public static void deActZiJingShi7(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 256);
    }

    public static void actZiJingShi8(Data data){
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue + 512);
    }

    public static void deActZiJingShi8(Data data) {
        Player player = data.player;
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        double baseValue = attributeInstance.getBaseValue();
        attributeInstance.setBaseValue(baseValue - 512);
    }

    public static void actTuLuShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.05);
        data.setBaojiScore(baseValue + 0.05);
    }

    public static void deActTuLuShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.05);
        data.setBaojiScore(baseValue - 0.05);
    }

    public static void actTuLuShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setBaojiScore(baseValue + 0.1);
    }

    public static void deActTuLuShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setBaojiScore(baseValue - 0.1);
    }

    public static void actTuLuShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.15);
        data.setBaojiScore(baseValue + 0.15);
    }

    public static void deActTuLuShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.15);
        data.setBaojiScore(baseValue - 0.15);
    }

    public static void actTuLuShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setBaojiScore(baseValue + 0.2);
    }

    public static void deActTuLuShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setBaojiScore(baseValue - 0.2);
    }

    public static void actTuLuShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.25);
        data.setBaojiScore(baseValue + 0.25);
    }

    public static void deActTuLuShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.25);
        data.setBaojiScore(baseValue - 0.25);
    }

    public static void actTuLuShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setBaojiScore(baseValue + 0.3);
    }

    public static void deActTuLuShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setBaojiScore(baseValue - 0.3);
    }

    public static void actTuLuShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.35);
        data.setBaojiScore(baseValue + 0.35);
    }

    public static void deActTuLuShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.35);
        data.setBaojiScore(baseValue - 0.35);
    }

    public static void actTuLuShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setBaojiScore(baseValue + 0.4);
    }

    public static void deActTuLuShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setBaojiScore(baseValue - 0.4);
    }

    public static void actHongYueShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue +  0.01);
        data.setBaoJiXiaoGuoScore(baseValue +  0.01);
    }

    public static void deActHongYueShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue -  0.01);
        data.setBaoJiXiaoGuoScore(baseValue -  0.01);
    }

    public static void actHongYueShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue +  0.02);
        data.setBaoJiXiaoGuoScore(baseValue +  0.02);
    }

    public static void deActHongYueShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue -  0.02);
        data.setBaoJiXiaoGuoScore(baseValue -  0.02);
    }

    public static void actHongYueShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue + 0.04);
        data.setBaoJiXiaoGuoScore(baseValue + 0.04);
    }

    public static void deActHongYueShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue - 0.04);
        data.setBaoJiXiaoGuoScore(baseValue - 0.04);
    }

    public static void actHongYueShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue + 0.08);
        data.setBaoJiXiaoGuoScore(baseValue + 0.08);
    }

    public static void deActHongYueShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue - 0.08);
        data.setBaoJiXiaoGuoScore(baseValue - 0.08);
    }

    public static void actHongYueShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue + 0.16);
        data.setBaoJiXiaoGuoScore(baseValue + 0.16);
    }

    public static void deActHongYueShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue - 0.16);
        data.setBaoJiXiaoGuoScore(baseValue - 0.16);
    }

    public static void actHongYueShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue + 0.32);
        data.setBaoJiXiaoGuoScore(baseValue + 0.32);
    }

    public static void deActHongYueShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue - 0.32);
        data.setBaoJiXiaoGuoScore(baseValue - 0.32);
    }

    public static void actHongYueShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue + 0.64);
        data.setBaoJiXiaoGuoScore(baseValue + 0.64);
    }

    public static void deActHongYueShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue - 0.64);
        data.setBaoJiXiaoGuoScore(baseValue - 0.64);
    }

    public static void actHongYueShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue + 1.28);
        data.setBaoJiXiaoGuoScore(baseValue + 1.28);
    }

    public static void deActHongYueShi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, baseValue - 1.28);
        data.setBaoJiXiaoGuoScore(baseValue - 1.28);
    }

    public static void actMiYinShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.05);
        data.setBaoJiXiaoGuoScore(baseValue + 0.05);
    }

    public static void deActMiYinShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.05);
        data.setBaoJiXiaoGuoScore(baseValue - 0.05);
    }

    public static void actMiYinShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setBaoJiXiaoGuoScore(baseValue + 0.1);
    }

    public static void deActMiYinShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setBaoJiXiaoGuoScore(baseValue - 0.1);
    }

    public static void actMiYinShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.15);
        data.setBaoJiXiaoGuoScore(baseValue + 0.15);
    }

    public static void deActMiYinShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.15);
        data.setBaoJiXiaoGuoScore(baseValue - 0.15);
    }

    public static void actMiYinShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setBaoJiXiaoGuoScore(baseValue + 0.2);
    }

    public static void deActMiYinShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setBaoJiXiaoGuoScore(baseValue - 0.2);
    }

    public static void actMiYinShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.25);
        data.setBaoJiXiaoGuoScore(baseValue + 0.25);
    }

    public static void deActMiYinShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.25);
        data.setBaoJiXiaoGuoScore(baseValue - 0.25);
    }

    public static void actMiYinShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setBaoJiXiaoGuoScore(baseValue + 0.3);
    }

    public static void deActMiYinShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setBaoJiXiaoGuoScore(baseValue - 0.3);
    }

    public static void actMiYinShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.35);
        data.setBaoJiXiaoGuoScore(baseValue + 0.35);
    }

    public static void deActMiYinShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.35);
        data.setBaoJiXiaoGuoScore(baseValue - 0.35);
    }

    public static void actMiYinShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setBaoJiXiaoGuoScore(baseValue + 0.4);
    }

    public static void deActMiYinShi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setBaoJiXiaoGuoScore(baseValue - 0.4);
    }

    public static void actYuLuShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.05);
        data.setShengjiScore(baseValue + 0.05);
    }

    public static void deActYuLuShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.05);
        data.setShengjiScore(baseValue - 0.05);
    }

    public static void actYuLuShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setShengjiScore(baseValue + 0.1);
    }

    public static void deActYuLuShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setShengjiScore(baseValue - 0.1);
    }

    public static void actYuLuShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.15);
        data.setShengjiScore(baseValue + 0.15);
    }

    public static void deActYuLuShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.15);
        data.setShengjiScore(baseValue - 0.15);
    }

    public static void actYuLuShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setShengjiScore(baseValue + 0.2);
    }

    public static void deActYuLuShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setShengjiScore(baseValue - 0.2);
    }

    public static void actYuLuShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.25);
        data.setShengjiScore(baseValue + 0.25);
    }

    public static void deActYuLuShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.25);
        data.setShengjiScore(baseValue - 0.25);
    }

    public static void actYuLuShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setShengjiScore(baseValue + 0.3);
    }

    public static void deActYuLuShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setShengjiScore(baseValue - 0.3);
    }

    public static void actYuLuShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.35);
        data.setShengjiScore(baseValue + 0.35);
    }

    public static void deActYuLuShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.35);
        data.setShengjiScore(baseValue - 0.35);
    }

    public static void actYuLuShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setShengjiScore(baseValue + 0.4);
    }

    public static void deActYuLuShi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setShengjiScore(baseValue - 0.4);
    }

    public static void actBingShuangShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue +  0.05);
        data.setShengjiScore(baseValue +  0.05);
    }

    public static void deActBingShuangShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue -  0.05);
        data.setShengjiScore(baseValue -  0.05);
    }

    public static void actBingShuangShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue +  0.1);
        data.setShengjiScore(baseValue +  0.1);
    }

    public static void deActBingShuangShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue -  0.1);
        data.setShengjiScore(baseValue -  0.1);
    }

    public static void actBingShuangShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue + 0.15);
        data.setShengjiScore(baseValue + 0.15);
    }

    public static void deActBingShuangShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue - 0.15);
        data.setShengjiScore(baseValue - 0.15);
    }

    public static void actBingShuangShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue +  0.2);
        data.setShengjiScore(baseValue +  0.2);
    }

    public static void deActBingShuangShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue -  0.2);
        data.setShengjiScore(baseValue -  0.2);
    }

    public static void actBingShuangShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue +  0.25);
        data.setShengjiScore(baseValue +  0.25);
    }

    public static void deActBingShuangShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue -  0.25);
        data.setShengjiScore(baseValue -  0.25);
    }

    public static void actBingShuangShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue +  0.3);
        data.setShengjiScore(baseValue +  0.3);
    }

    public static void deActBingShuangShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue -  0.3);
        data.setShengjiScore(baseValue -  0.3);
    }

    public static void actBingShuangShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue +  0.35);
        data.setShengjiScore(baseValue +  0.35);
    }

    public static void deActBingShuangShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue -  0.35);
        data.setShengjiScore(baseValue -  0.35);
    }

    public static void actBingShuangShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue +  0.4);
        data.setShengjiScore(baseValue +  0.4);
    }

    public static void deActBingShuangShi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, baseValue -  0.4);
        data.setShengjiScore(baseValue -  0.4);
    }

    public static void actYanYangShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue +  0.05);
        data.setPofaScore(baseValue +  0.05);
    }

    public static void deActYanYangShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue -  0.05);
        data.setPofaScore(baseValue -  0.05);
    }

    public static void actYanYangShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue +  0.1);
        data.setPofaScore(baseValue +  0.1);
    }

    public static void deActYanYangShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue -  0.1);
        data.setPofaScore(baseValue -  0.1);
    }

    public static void actYanYangShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue + 0.15);
        data.setPofaScore(baseValue + 0.15);
    }

    public static void deActYanYangShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue - 0.15);
        data.setPofaScore(baseValue - 0.15);
    }

    public static void actYanYangShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue +  0.2);
        data.setPofaScore(baseValue +  0.2);
    }

    public static void deActYanYangShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue -  0.2);
        data.setPofaScore(baseValue -  0.2);
    }

    public static void actYanYangShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue +  0.25);
        data.setPofaScore(baseValue +  0.25);
    }

    public static void deActYanYangShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue -  0.25);
        data.setPofaScore(baseValue -  0.25);
    }

    public static void actYanYangShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue +  0.3);
        data.setPofaScore(baseValue +  0.3);
    }

    public static void deActYanYangShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue -  0.3);
        data.setPofaScore(baseValue -  0.3);
    }

    public static void actYanYangShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue +  0.35);
        data.setPofaScore(baseValue +  0.35);
    }

    public static void deActYanYangShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue -  0.35);
        data.setPofaScore(baseValue -  0.35);
    }

    public static void actYanYangShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue +  0.4);
        data.setPofaScore(baseValue +  0.4);
    }

    public static void deActYanYangShi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue -  0.4);
        data.setPofaScore(baseValue -  0.4);
    }

    public static void actSuiYanShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue +  0.05);
        data.setPojiaScore(baseValue +  0.05);
    }

    public static void deActSuiYanShi1(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue -  0.05);
        data.setPojiaScore(baseValue -  0.05);
    }

    public static void actSuiYanShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue +  0.1);
        data.setPojiaScore(baseValue +  0.1);
    }

    public static void deActSuiYanShi2(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue -  0.1);
        data.setPojiaScore(baseValue -  0.1);
    }

    public static void actSuiYanShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue + 0.15);
        data.setPojiaScore(baseValue + 0.15);
    }

    public static void deActSuiYanShi3(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue - 0.15);
        data.setPojiaScore(baseValue - 0.15);
    }

    public static void actSuiYanShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue +  0.2);
        data.setPojiaScore(baseValue +  0.2);
    }

    public static void deActSuiYanShi4(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue -  0.2);
        data.setPojiaScore(baseValue -  0.2);
    }

    public static void actSuiYanShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue +  0.25);
        data.setPojiaScore(baseValue +  0.25);
    }

    public static void deActSuiYanShi5(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue -  0.25);
        data.setPojiaScore(baseValue -  0.25);
    }

    public static void actSuiYanShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue +  0.3);
        data.setPojiaScore(baseValue +  0.3);
    }

    public static void deActSuiYanShi6(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue -  0.3);
        data.setPojiaScore(baseValue -  0.3);
    }

    public static void actSuiYanShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue +  0.35);
        data.setPojiaScore(baseValue +  0.35);
    }

    public static void deActSuiYanShi7(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue -  0.35);
        data.setPojiaScore(baseValue -  0.35);
    }

    public static void actSuiYanShi8(Data data){
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue +  0.4);
        data.setPojiaScore(baseValue +  0.4);
    }

    public static void deActSuiYanShi8(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, baseValue -  0.4);
        data.setPojiaScore(baseValue -  0.4);
    }










}
