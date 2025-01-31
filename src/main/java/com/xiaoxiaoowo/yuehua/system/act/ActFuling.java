package com.xiaoxiaoowo.yuehua.system.act;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ActFuling {
    public static void actshouhu1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setDumianScore(baseValue + 0.1);
    }

    public static void deActshouhu1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setDumianScore(baseValue - 0.1);
    }

    public static void actshouhu2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setDumianScore(baseValue + 0.2);
    }

    public static void deActshouhu2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setDumianScore(baseValue - 0.2);
    }

    public static void actshouhu3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setDumianScore(baseValue + 0.3);
    }

    public static void deActshouhu3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setDumianScore(baseValue - 0.3);
    }

    public static void actshouhu4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setDumianScore(baseValue + 0.4);
    }

    public static void deActshouhu4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setDumianScore(baseValue - 0.4);
    }

    public static void actyankai1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setHuomianScore(baseValue + 0.1);
    }

    public static void deActyankai1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setHuomianScore(baseValue - 0.1);
    }

    public static void actyankai2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setHuomianScore(baseValue + 0.2);
    }

    public static void deActyankai2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setHuomianScore(baseValue - 0.2);
    }

    public static void actyankai3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setHuomianScore(baseValue + 0.3);
    }

    public static void deActyankai3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setHuomianScore(baseValue - 0.3);
    }

    public static void actyankai4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setHuomianScore(baseValue + 0.4);
    }

    public static void deActyankai4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setHuomianScore(baseValue - 0.4);
    }

    public static void actluoshi1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setJianmianScore(baseValue + 0.1);
    }

    public static void deActluoshi1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setJianmianScore(baseValue - 0.1);
    }

    public static void actluoshi2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setJianmianScore(baseValue + 0.2);
    }

    public static void deActluoshi2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setJianmianScore(baseValue - 0.2);
    }

    public static void actluoshi3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setJianmianScore(baseValue + 0.3);
    }

    public static void deActluoshi3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setJianmianScore(baseValue - 0.3);
    }

    public static void actluoshi4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setJianmianScore(baseValue + 0.4);
    }

    public static void deActluoshi4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setJianmianScore(baseValue - 0.4);
    }

    public static void actyuti1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setShuailuomianScore(baseValue + 0.1);
    }

    public static void deActyuti1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setShuailuomianScore(baseValue - 0.1);
    }

    public static void actyuti2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setShuailuomianScore(baseValue + 0.2);
    }

    public static void deActyuti2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setShuailuomianScore(baseValue - 0.2);
    }

    public static void actyuti3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setShuailuomianScore(baseValue + 0.3);
    }

    public static void deActyuti3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setShuailuomianScore(baseValue - 0.3);
    }

    public static void actyuti4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setShuailuomianScore(baseValue + 0.4);
    }

    public static void deActyuti4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setShuailuomianScore(baseValue - 0.4);
    }

    public static void actwanfa1(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue + 0.15);
            danData.setNoCost3(baseValue + 0.15);
        }
    }

    public static void deActwanfa1(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue - 0.15);
            danData.setNoCost3(baseValue - 0.15);
        }
    }

    public static void actwanfa2(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue + 0.3);
            danData.setNoCost3(baseValue + 0.3);
        }
    }

    public static void deActwanfa2(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue - 0.3);
            danData.setNoCost3(baseValue - 0.3);
        }
    }

    public static void actwanfa3(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue + 0.45);
            danData.setNoCost3(baseValue + 0.45);
        }
    }

    public static void deActwanfa3(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue - 0.45);
            danData.setNoCost3(baseValue - 0.45);
        }
    }

    public static void actwanfa4(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue + 0.6);
            danData.setNoCost3(baseValue + 0.6);
        }
    }

    public static void deActwanfa4(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_3, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, baseValue - 0.6);
            danData.setNoCost3(baseValue - 0.6);
        }
    }

    public static void actliren1(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 0.25);
        }
    }

    public static void deActliren1(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 0.25);
        }
    }

    public static void actliren2(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 0.5);
        }
    }

    public static void deActliren2(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 0.5);
        }
    }

    public static void actliren3(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 0.75);
        }
    }

    public static void deActliren3(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 0.75);
        }
    }

    public static void actliren4(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 1.0);
        }
    }

    public static void deActliren4(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ATTACK_SPEED);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 1.0);
        }
    }

    public static void actqiangong1(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue + 0.1);
            gongData.arrow_pierce = baseValue + 0.1;
        }
    }

    public static void deActqiangong1(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue - 0.1);
            gongData.arrow_pierce = baseValue - 0.1;
        }
    }

    public static void actqiangong2(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue + 0.2);
            gongData.arrow_pierce = baseValue + 0.2;
        }
    }

    public static void deActqiangong2(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue - 0.2);
            gongData.arrow_pierce = baseValue - 0.2;
        }
    }

    public static void actqiangong3(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue + 0.3);
            gongData.arrow_pierce = baseValue + 0.3;
        }
    }

    public static void deActqiangong3(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue - 0.3);
            gongData.arrow_pierce = baseValue - 0.3;
        }
    }

    public static void actqiangong4(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue + 0.4);
            gongData.arrow_pierce = baseValue + 0.4;
        }
    }

    public static void deActqiangong4(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_pierce, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, baseValue - 0.4);
            gongData.arrow_pierce = baseValue - 0.4;
        }
    }

    public static void actqiangren1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setSanchajimianScore(baseValue + 0.1);
    }

    public static void deActqiangren1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setSanchajimianScore(baseValue - 0.1);
    }

    public static void actqiangren2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setSanchajimianScore(baseValue + 0.2);
    }

    public static void deActqiangren2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setSanchajimianScore(baseValue - 0.2);
    }

    public static void actqiangren3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setSanchajimianScore(baseValue + 0.3);
    }

    public static void deActqiangren3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setSanchajimianScore(baseValue - 0.3);
    }

    public static void actqiangren4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setSanchajimianScore(baseValue + 0.4);
    }

    public static void deActqiangren4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setSanchajimianScore(baseValue - 0.4);
    }

    public static void actshuangjia1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue + 0.1);
        data.setBingmianScore(baseValue + 0.1);
    }

    public static void deActshuangjia1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue - 0.1);
        data.setBingmianScore(baseValue - 0.1);
    }

    public static void actshuangjia2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue + 0.2);
        data.setBingmianScore(baseValue + 0.2);
    }

    public static void deActshuangjia2(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue - 0.2);
        data.setBingmianScore(baseValue - 0.2);
    }

    public static void actshuangjia3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue + 0.3);
        data.setBingmianScore(baseValue + 0.3);
    }

    public static void deActshuangjia3(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue - 0.3);
        data.setBingmianScore(baseValue - 0.3);
    }

    public static void actshuangjia4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue + 0.4);
        data.setBingmianScore(baseValue + 0.4);
    }

    public static void deActshuangjia4(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        double baseValue = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, baseValue - 0.4);
        data.setBingmianScore(baseValue - 0.4);
    }

    public static void acthuixin1(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue + 0.15);
            danData.setNoCost1(baseValue + 0.15);
        }
    }

    public static void deActhuixin1(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue - 0.15);
            danData.setNoCost1(baseValue - 0.15);
        }
    }

    public static void acthuixin2(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue + 0.3);
            danData.setNoCost1(baseValue + 0.3);
        }
    }

    public static void deActhuixin2(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue - 0.3);
            danData.setNoCost1(baseValue - 0.3);
        }
    }

    public static void acthuixin3(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue + 0.45);
            danData.setNoCost1(baseValue + 0.45);
        }
    }

    public static void deActhuixin3(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue - 0.45);
            danData.setNoCost1(baseValue - 0.45);
        }
    }

    public static void acthuixin4(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue + 0.6);
            danData.setNoCost1(baseValue + 0.6);
        }
    }

    public static void deActhuixin4(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_1, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, baseValue - 0.6);
            danData.setNoCost1(baseValue - 0.6);
        }
    }

    public static void actguantong1(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue + 0.15);
            danData.setNoCost2(baseValue + 0.15);
        }
    }

    public static void deActguantong1(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue - 0.15);
            danData.setNoCost2(baseValue - 0.15);
        }
    }

    public static void actguantong2(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue + 0.3);
            danData.setNoCost2(baseValue + 0.3);
        }
    }

    public static void deActguantong2(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue - 0.3);
            danData.setNoCost2(baseValue - 0.3);
        }
    }

    public static void actguantong3(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue + 0.45);
            danData.setNoCost2(baseValue + 0.45);
        }
    }

    public static void deActguantong3(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue - 0.45);
            danData.setNoCost2(baseValue - 0.45);
        }
    }

    public static void actguantong4(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue + 0.6);
            danData.setNoCost2(baseValue + 0.6);
        }
    }

    public static void deActguantong4(Data data) {
        if (data instanceof DanData danData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.no_cost_2, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, baseValue - 0.6);
            danData.setNoCost2(baseValue - 0.6);
        }
    }

    public static void actjuli1(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 0.5);
        }
    }

    public static void deActjuli1(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 0.5);
        }
    }

    public static void actjuli2(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 1.0);
        }
    }

    public static void deActjuli2(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 1.0);
        }
    }

    public static void actjuli3(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 1.5);
        }
    }

    public static void deActjuli3(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 1.5);
        }
    }

    public static void actjuli4(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 2.0);
        }
    }

    public static void deActjuli4(Data data) {
        if (data instanceof ZhanData zhanData) {
            Player player = data.player;
            AttributeInstance attributeInstance = player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue - 2.0);
        }
    }

    public static void actbujin1(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue + 0.1);
            gongData.arrow_no_cost = baseValue + 0.1;
        }
    }

    public static void deActbujin1(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue - 0.1);
            gongData.arrow_no_cost = baseValue - 0.1;
        }
    }

    public static void actbujin2(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue + 0.15);
            gongData.arrow_no_cost = baseValue + 0.15;
        }
    }

    public static void deActbujin2(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue - 0.15);
            gongData.arrow_no_cost = baseValue - 0.15;
        }
    }

    public static void actbujin3(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue + 0.2);
            gongData.arrow_no_cost = baseValue + 0.2;
        }
    }

    public static void deActbujin3(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue - 0.2);
            gongData.arrow_no_cost = baseValue - 0.2;
        }
    }

    public static void actbujin4(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue + 0.25);
            gongData.arrow_no_cost = baseValue + 0.25;
        }
    }

    public static void deActbujin4(Data data) {
        if (data instanceof GongData gongData) {
            Player player = data.player;
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            double baseValue = pdc.get(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE);
            pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, baseValue - 0.25);
            gongData.arrow_no_cost = baseValue - 0.25;
        }
    }
}
