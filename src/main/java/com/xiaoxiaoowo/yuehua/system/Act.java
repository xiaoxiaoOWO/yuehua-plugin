package com.xiaoxiaoowo.yuehua.system;


import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.act.ActFuling;
import com.xiaoxiaoowo.yuehua.system.act.ActYuShi;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.List;

import static com.xiaoxiaoowo.yuehua.system.Init.*;

//不要忘了神器绑身体
public final class Act {

    public static void actHelp(Data data, String id, PersistentDataContainer pdc) {
        List<MyAttribute> attributeList = AttributeSet.attributes.get(id);
        if (attributeList == null) {
            return;
        }
        for (MyAttribute attribute : attributeList) {
            attribute.act(data, pdc);
        }
    }


    public static void deActHelp(Data data, String id, PersistentDataContainer pdc) {
        List<MyAttribute> attributeList = AttributeSet.attributes.get(id);
        if (attributeList == null) {
            return;
        }
        for (MyAttribute attribute : attributeList) {
            attribute.deAct(data, pdc);
        }
    }


    public static void actZhan(ZhanData data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        actHelp(data, id, persistentDataContainer);
        initZhan(data, id);

    }

    public static void deActZhan(ZhanData data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        deActHelp(data, id, persistentDataContainer);
        deInitZhan(data, id);
    }

    public static void actGong(GongData data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        actHelp(data, id, persistentDataContainer);
        initGong(data, id);
    }

    public static void deActGong(GongData data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        deActHelp(data, id, persistentDataContainer);
        deInitGong(data, id);
    }

    public static void actDan(DanData data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        actHelp(data, id, persistentDataContainer);
        initDan(data, id);
    }

    public static void deActDan(DanData data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        deActHelp(data, id, persistentDataContainer);
        deInitDan(data, id);
    }


    public static void actAll(Data data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        actHelp(data, id, persistentDataContainer);
        initAll(data, id);
    }

    public static void deActAll(Data data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        deActHelp(data, id, persistentDataContainer);
        deInitAll(data, id);
    }

    public static void actAllEnderChest(Data data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        actHelp(data, id, persistentDataContainer);
        initAllEnderChest(data, id);
    }


    public static void deActAllEnderChest(Data data, String id) {
        Player player = data.player;
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        deActHelp(data, id, persistentDataContainer);
        deInitAllEnderChest(data, id);
    }


    public static void actInsert(Data data, String id) {
        switch (id) {


            case "xueseshi1" -> ActYuShi.actXueseshi1(data);
            case "xueseshi2" -> ActYuShi.actXueseshi2(data);
            case "xueseshi3" -> ActYuShi.actXueseshi3(data);
            case "xueseshi4" -> ActYuShi.actXueseshi4(data);
            case "xueseshi5" -> ActYuShi.actXueseshi5(data);
            case "xueseshi6" -> ActYuShi.actXueseshi6(data);
            case "xueseshi7" -> ActYuShi.actXueseshi7(data);
            case "xueseshi8" -> ActYuShi.actXueseshi8(data);

            case "cuilvshi1" -> ActYuShi.actCuiLvShi1(data);
            case "cuilvshi2" -> ActYuShi.actCuiLvShi2(data);
            case "cuilvshi3" -> ActYuShi.actCuiLvShi3(data);
            case "cuilvshi4" -> ActYuShi.actCuiLvShi4(data);
            case "cuilvshi5" -> ActYuShi.actCuiLvShi5(data);
            case "cuilvshi6" -> ActYuShi.actCuiLvShi6(data);
            case "cuilvshi7" -> ActYuShi.actCuiLvShi7(data);
            case "cuilvshi8" -> ActYuShi.actCuiLvShi8(data);

            case "dianlanshi1" -> ActYuShi.actDianLanShi1(data);
            case "dianlanshi2" -> ActYuShi.actDianLanShi2(data);
            case "dianlanshi3" -> ActYuShi.actDianLanShi3(data);
            case "dianlanshi4" -> ActYuShi.actDianLanShi4(data);
            case "dianlanshi5" -> ActYuShi.actDianLanShi5(data);
            case "dianlanshi6" -> ActYuShi.actDianLanShi6(data);
            case "dianlanshi7" -> ActYuShi.actDianLanShi7(data);
            case "dianlanshi8" -> ActYuShi.actDianLanShi8(data);

            case "jinhuangshi1" -> ActYuShi.actJinHuangShi1(data);
            case "jinhuangshi2" -> ActYuShi.actJinHuangShi2(data);
            case "jinhuangshi3" -> ActYuShi.actJinHuangShi3(data);
            case "jinhuangshi4" -> ActYuShi.actJinHuangShi4(data);
            case "jinhuangshi5" -> ActYuShi.actJinHuangShi5(data);
            case "jinhuangshi6" -> ActYuShi.actJinHuangShi6(data);
            case "jinhuangshi7" -> ActYuShi.actJinHuangShi7(data);
            case "jinhuangshi8" -> ActYuShi.actJinHuangShi8(data);

            case "houtushi1" -> ActYuShi.actHouTuShi1(data);
            case "houtushi2" -> ActYuShi.actHouTuShi2(data);
            case "houtushi3" -> ActYuShi.actHouTuShi3(data);
            case "houtushi4" -> ActYuShi.actHouTuShi4(data);
            case "houtushi5" -> ActYuShi.actHouTuShi5(data);
            case "houtushi6" -> ActYuShi.actHouTuShi6(data);
            case "houtushi7" -> ActYuShi.actHouTuShi7(data);
            case "houtushi8" -> ActYuShi.actHouTuShi8(data);

            case "zijingshi1" -> ActYuShi.actZiJingShi1(data);
            case "zijingshi2" -> ActYuShi.actZiJingShi2(data);
            case "zijingshi3" -> ActYuShi.actZiJingShi3(data);
            case "zijingshi4" -> ActYuShi.actZiJingShi4(data);
            case "zijingshi5" -> ActYuShi.actZiJingShi5(data);
            case "zijingshi6" -> ActYuShi.actZiJingShi6(data);
            case "zijingshi7" -> ActYuShi.actZiJingShi7(data);
            case "zijingshi8" -> ActYuShi.actZiJingShi8(data);

            case "tulushi1" -> ActYuShi.actTuLuShi1(data);
            case "tulushi2" -> ActYuShi.actTuLuShi2(data);
            case "tulushi3" -> ActYuShi.actTuLuShi3(data);
            case "tulushi4" -> ActYuShi.actTuLuShi4(data);
            case "tulushi5" -> ActYuShi.actTuLuShi5(data);
            case "tulushi6" -> ActYuShi.actTuLuShi6(data);
            case "tulushi7" -> ActYuShi.actTuLuShi7(data);
            case "tulushi8" -> ActYuShi.actTuLuShi8(data);

            case "hongyueshi1" -> ActYuShi.actHongYueShi1(data);
            case "hongyueshi2" -> ActYuShi.actHongYueShi2(data);
            case "hongyueshi3" -> ActYuShi.actHongYueShi3(data);
            case "hongyueshi4" -> ActYuShi.actHongYueShi4(data);
            case "hongyueshi5" -> ActYuShi.actHongYueShi5(data);
            case "hongyueshi6" -> ActYuShi.actHongYueShi6(data);
            case "hongyueshi7" -> ActYuShi.actHongYueShi7(data);
            case "hongyueshi8" -> ActYuShi.actHongYueShi8(data);

            case "miyinshi1" -> ActYuShi.actMiYinShi1(data);
            case "miyinshi2" -> ActYuShi.actMiYinShi2(data);
            case "miyinshi3" -> ActYuShi.actMiYinShi3(data);
            case "miyinshi4" -> ActYuShi.actMiYinShi4(data);
            case "miyinshi5" -> ActYuShi.actMiYinShi5(data);
            case "miyinshi6" -> ActYuShi.actMiYinShi6(data);
            case "miyinshi7" -> ActYuShi.actMiYinShi7(data);
            case "miyinshi8" -> ActYuShi.actMiYinShi8(data);

            case "yulushi1" -> ActYuShi.actYuLuShi1(data);
            case "yulushi2" -> ActYuShi.actYuLuShi2(data);
            case "yulushi3" -> ActYuShi.actYuLuShi3(data);
            case "yulushi4" -> ActYuShi.actYuLuShi4(data);
            case "yulushi5" -> ActYuShi.actYuLuShi5(data);
            case "yulushi6" -> ActYuShi.actYuLuShi6(data);
            case "yulushi7" -> ActYuShi.actYuLuShi7(data);
            case "yulushi8" -> ActYuShi.actYuLuShi8(data);

            case "bingshuangshi1" -> ActYuShi.actBingShuangShi1(data);
            case "bingshuangshi2" -> ActYuShi.actBingShuangShi2(data);
            case "bingshuangshi3" -> ActYuShi.actBingShuangShi3(data);
            case "bingshuangshi4" -> ActYuShi.actBingShuangShi4(data);
            case "bingshuangshi5" -> ActYuShi.actBingShuangShi5(data);
            case "bingshuangshi6" -> ActYuShi.actBingShuangShi6(data);
            case "bingshuangshi7" -> ActYuShi.actBingShuangShi7(data);
            case "bingshuangshi8" -> ActYuShi.actBingShuangShi8(data);

            case "yanyangshi1" -> ActYuShi.actYanYangShi1(data);
            case "yanyangshi2" -> ActYuShi.actYanYangShi2(data);
            case "yanyangshi3" -> ActYuShi.actYanYangShi3(data);
            case "yanyangshi4" -> ActYuShi.actYanYangShi4(data);
            case "yanyangshi5" -> ActYuShi.actYanYangShi5(data);
            case "yanyangshi6" -> ActYuShi.actYanYangShi6(data);
            case "yanyangshi7" -> ActYuShi.actYanYangShi7(data);
            case "yanyangshi8" -> ActYuShi.actYanYangShi8(data);

            case "suiyanshi1" -> ActYuShi.actSuiYanShi1(data);
            case "suiyanshi2" -> ActYuShi.actSuiYanShi2(data);
            case "suiyanshi3" -> ActYuShi.actSuiYanShi3(data);
            case "suiyanshi4" -> ActYuShi.actSuiYanShi4(data);
            case "suiyanshi5" -> ActYuShi.actSuiYanShi5(data);
            case "suiyanshi6" -> ActYuShi.actSuiYanShi6(data);
            case "suiyanshi7" -> ActYuShi.actSuiYanShi7(data);
            case "suiyanshi8" -> ActYuShi.actSuiYanShi8(data);

            case null, default -> {
            }

        }

    }

    public static void deActInsert(Data data, String id) {
        switch (id) {
            case "xueseshi1" -> ActYuShi.deActXueseshi1(data);
            case "xueseshi2" -> ActYuShi.deActXueseshi2(data);
            case "xueseshi3" -> ActYuShi.deActXueseshi3(data);
            case "xueseshi4" -> ActYuShi.deActXueseshi4(data);
            case "xueseshi5" -> ActYuShi.deActXueseshi5(data);
            case "xueseshi6" -> ActYuShi.deActXueseshi6(data);
            case "xueseshi7" -> ActYuShi.deActXueseshi7(data);
            case "xueseshi8" -> ActYuShi.deActXueseshi8(data);

            case "cuilvshi1" -> ActYuShi.deActCuiLvShi1(data);
            case "cuilvshi2" -> ActYuShi.deActCuiLvShi2(data);
            case "cuilvshi3" -> ActYuShi.deActCuiLvShi3(data);
            case "cuilvshi4" -> ActYuShi.deActCuiLvShi4(data);
            case "cuilvshi5" -> ActYuShi.deActCuiLvShi5(data);
            case "cuilvshi6" -> ActYuShi.deActCuiLvShi6(data);
            case "cuilvshi7" -> ActYuShi.deActCuiLvShi7(data);
            case "cuilvshi8" -> ActYuShi.deActCuiLvShi8(data);

            case "dianlanshi1" -> ActYuShi.deActDianLanShi1(data);
            case "dianlanshi2" -> ActYuShi.deActDianLanShi2(data);
            case "dianlanshi3" -> ActYuShi.deActDianLanShi3(data);
            case "dianlanshi4" -> ActYuShi.deActDianLanShi4(data);
            case "dianlanshi5" -> ActYuShi.deActDianLanShi5(data);
            case "dianlanshi6" -> ActYuShi.deActDianLanShi6(data);
            case "dianlanshi7" -> ActYuShi.deActDianLanShi7(data);
            case "dianlanshi8" -> ActYuShi.deActDianLanShi8(data);

            case "jinhuangshi1" -> ActYuShi.deActJinHuangShi1(data);
            case "jinhuangshi2" -> ActYuShi.deActJinHuangShi2(data);
            case "jinhuangshi3" -> ActYuShi.deActJinHuangShi3(data);
            case "jinhuangshi4" -> ActYuShi.deActJinHuangShi4(data);
            case "jinhuangshi5" -> ActYuShi.deActJinHuangShi5(data);
            case "jinhuangshi6" -> ActYuShi.deActJinHuangShi6(data);
            case "jinhuangshi7" -> ActYuShi.deActJinHuangShi7(data);
            case "jinhuangshi8" -> ActYuShi.deActJinHuangShi8(data);

            case "houtushi1" -> ActYuShi.deActHouTuShi1(data);
            case "houtushi2" -> ActYuShi.deActHouTuShi2(data);
            case "houtushi3" -> ActYuShi.deActHouTuShi3(data);
            case "houtushi4" -> ActYuShi.deActHouTuShi4(data);
            case "houtushi5" -> ActYuShi.deActHouTuShi5(data);
            case "houtushi6" -> ActYuShi.deActHouTuShi6(data);
            case "houtushi7" -> ActYuShi.deActHouTuShi7(data);
            case "houtushi8" -> ActYuShi.deActHouTuShi8(data);

            case "zijingshi1" -> ActYuShi.deActZiJingShi1(data);
            case "zijingshi2" -> ActYuShi.deActZiJingShi2(data);
            case "zijingshi3" -> ActYuShi.deActZiJingShi3(data);
            case "zijingshi4" -> ActYuShi.deActZiJingShi4(data);
            case "zijingshi5" -> ActYuShi.deActZiJingShi5(data);
            case "zijingshi6" -> ActYuShi.deActZiJingShi6(data);
            case "zijingshi7" -> ActYuShi.deActZiJingShi7(data);
            case "zijingshi8" -> ActYuShi.deActZiJingShi8(data);

            case "tulushi1" -> ActYuShi.deActTuLuShi1(data);
            case "tulushi2" -> ActYuShi.deActTuLuShi2(data);
            case "tulushi3" -> ActYuShi.deActTuLuShi3(data);
            case "tulushi4" -> ActYuShi.deActTuLuShi4(data);
            case "tulushi5" -> ActYuShi.deActTuLuShi5(data);
            case "tulushi6" -> ActYuShi.deActTuLuShi6(data);
            case "tulushi7" -> ActYuShi.deActTuLuShi7(data);
            case "tulushi8" -> ActYuShi.deActTuLuShi8(data);

            case "hongyueshi1" -> ActYuShi.deActHongYueShi1(data);
            case "hongyueshi2" -> ActYuShi.deActHongYueShi2(data);
            case "hongyueshi3" -> ActYuShi.deActHongYueShi3(data);
            case "hongyueshi4" -> ActYuShi.deActHongYueShi4(data);
            case "hongyueshi5" -> ActYuShi.deActHongYueShi5(data);
            case "hongyueshi6" -> ActYuShi.deActHongYueShi6(data);
            case "hongyueshi7" -> ActYuShi.deActHongYueShi7(data);
            case "hongyueshi8" -> ActYuShi.deActHongYueShi8(data);

            case "miyinshi1" -> ActYuShi.deActMiYinShi1(data);
            case "miyinshi2" -> ActYuShi.deActMiYinShi2(data);
            case "miyinshi3" -> ActYuShi.deActMiYinShi3(data);
            case "miyinshi4" -> ActYuShi.deActMiYinShi4(data);
            case "miyinshi5" -> ActYuShi.deActMiYinShi5(data);
            case "miyinshi6" -> ActYuShi.deActMiYinShi6(data);
            case "miyinshi7" -> ActYuShi.deActMiYinShi7(data);
            case "miyinshi8" -> ActYuShi.deActMiYinShi8(data);

            case "yulushi1" -> ActYuShi.deActYuLuShi1(data);
            case "yulushi2" -> ActYuShi.deActYuLuShi2(data);
            case "yulushi3" -> ActYuShi.deActYuLuShi3(data);
            case "yulushi4" -> ActYuShi.deActYuLuShi4(data);
            case "yulushi5" -> ActYuShi.deActYuLuShi5(data);
            case "yulushi6" -> ActYuShi.deActYuLuShi6(data);
            case "yulushi7" -> ActYuShi.deActYuLuShi7(data);
            case "yulushi8" -> ActYuShi.deActYuLuShi8(data);

            case "bingshuangshi1" -> ActYuShi.deActBingShuangShi1(data);
            case "bingshuangshi2" -> ActYuShi.deActBingShuangShi2(data);
            case "bingshuangshi3" -> ActYuShi.deActBingShuangShi3(data);
            case "bingshuangshi4" -> ActYuShi.deActBingShuangShi4(data);
            case "bingshuangshi5" -> ActYuShi.deActBingShuangShi5(data);
            case "bingshuangshi6" -> ActYuShi.deActBingShuangShi6(data);
            case "bingshuangshi7" -> ActYuShi.deActBingShuangShi7(data);
            case "bingshuangshi8" -> ActYuShi.deActBingShuangShi8(data);

            case "yanyangshi1" -> ActYuShi.deActYanYangShi1(data);
            case "yanyangshi2" -> ActYuShi.deActYanYangShi2(data);
            case "yanyangshi3" -> ActYuShi.deActYanYangShi3(data);
            case "yanyangshi4" -> ActYuShi.deActYanYangShi4(data);
            case "yanyangshi5" -> ActYuShi.deActYanYangShi5(data);
            case "yanyangshi6" -> ActYuShi.deActYanYangShi6(data);
            case "yanyangshi7" -> ActYuShi.deActYanYangShi7(data);
            case "yanyangshi8" -> ActYuShi.deActYanYangShi8(data);

            case "suiyanshi1" -> ActYuShi.deActSuiYanShi1(data);
            case "suiyanshi2" -> ActYuShi.deActSuiYanShi2(data);
            case "suiyanshi3" -> ActYuShi.deActSuiYanShi3(data);
            case "suiyanshi4" -> ActYuShi.deActSuiYanShi4(data);
            case "suiyanshi5" -> ActYuShi.deActSuiYanShi5(data);
            case "suiyanshi6" -> ActYuShi.deActSuiYanShi6(data);
            case "suiyanshi7" -> ActYuShi.deActSuiYanShi7(data);
            case "suiyanshi8" -> ActYuShi.deActSuiYanShi8(data);
            case null, default -> {
            }
        }

    }

    public static void actFuling(Data data, String id) {
        switch (id) {
            case "bujin1" -> ActFuling.actbujin1(data);
            case "bujin2" -> ActFuling.actbujin2(data);
            case "bujin3" -> ActFuling.actbujin3(data);
            case "bujin4" -> ActFuling.actbujin4(data);

            case "shouhu1" -> ActFuling.actshouhu1(data);
            case "shouhu2" -> ActFuling.actshouhu2(data);
            case "shouhu3" -> ActFuling.actshouhu3(data);
            case "shouhu4" -> ActFuling.actshouhu4(data);

            case "yankai1" -> ActFuling.actyankai1(data);
            case "yankai2" -> ActFuling.actyankai2(data);
            case "yankai3" -> ActFuling.actyankai3(data);
            case "yankai4" -> ActFuling.actyankai4(data);

            case "luoshi1" -> ActFuling.actluoshi1(data);
            case "luoshi2" -> ActFuling.actluoshi2(data);
            case "luoshi3" -> ActFuling.actluoshi3(data);
            case "luoshi4" -> ActFuling.actluoshi4(data);

            case "wanfa1" -> ActFuling.actwanfa1(data);
            case "wanfa2" -> ActFuling.actwanfa2(data);
            case "wanfa3" -> ActFuling.actwanfa3(data);
            case "wanfa4" -> ActFuling.actwanfa4(data);

            case "yuti1" -> ActFuling.actyuti1(data);
            case "yuti2" -> ActFuling.actyuti2(data);
            case "yuti3" -> ActFuling.actyuti3(data);
            case "yuti4" -> ActFuling.actyuti4(data);

            case "liren1" -> ActFuling.actliren1(data);
            case "liren2" -> ActFuling.actliren2(data);
            case "liren3" -> ActFuling.actliren3(data);
            case "liren4" -> ActFuling.actliren4(data);

            case "qiangong1" -> ActFuling.actqiangong1(data);
            case "qiangong2" -> ActFuling.actqiangong2(data);
            case "qiangong3" -> ActFuling.actqiangong3(data);
            case "qiangong4" -> ActFuling.actqiangong4(data);

            case "qiangren1" -> ActFuling.actqiangren1(data);
            case "qiangren2" -> ActFuling.actqiangren2(data);
            case "qiangren3" -> ActFuling.actqiangren3(data);
            case "qiangren4" -> ActFuling.actqiangren4(data);

            case "shuangjia1" -> ActFuling.actshuangjia1(data);
            case "shuangjia2" -> ActFuling.actshuangjia2(data);
            case "shuangjia3" -> ActFuling.actshuangjia3(data);
            case "shuangjia4" -> ActFuling.actshuangjia4(data);

            case "huixin1" -> ActFuling.acthuixin1(data);
            case "huixin2" -> ActFuling.acthuixin2(data);
            case "huixin3" -> ActFuling.acthuixin3(data);
            case "huixin4" -> ActFuling.acthuixin4(data);

            case "guantong1" -> ActFuling.actguantong1(data);
            case "guantong2" -> ActFuling.actguantong2(data);
            case "guantong3" -> ActFuling.actguantong3(data);
            case "guantong4" -> ActFuling.actguantong4(data);

            case "juli1" -> ActFuling.actjuli1(data);
            case "juli2" -> ActFuling.actjuli2(data);
            case "juli3" -> ActFuling.actjuli3(data);
            case "juli4" -> ActFuling.actjuli4(data);
            case null, default -> {
            }
        }

    }

    public static void deActFuling(Data data, String id) {
        switch (id) {
            case "bujin1" -> ActFuling.deActbujin1(data);
            case "bujin2" -> ActFuling.deActbujin2(data);
            case "bujin3" -> ActFuling.deActbujin3(data);
            case "bujin4" -> ActFuling.deActbujin4(data);

            case "shouhu1" -> ActFuling.deActshouhu1(data);
            case "shouhu2" -> ActFuling.deActshouhu2(data);
            case "shouhu3" -> ActFuling.deActshouhu3(data);
            case "shouhu4" -> ActFuling.deActshouhu4(data);

            case "yankai1" -> ActFuling.deActyankai1(data);
            case "yankai2" -> ActFuling.deActyankai2(data);
            case "yankai3" -> ActFuling.deActyankai3(data);
            case "yankai4" -> ActFuling.deActyankai4(data);

            case "luoshi1" -> ActFuling.deActluoshi1(data);
            case "luoshi2" -> ActFuling.deActluoshi2(data);
            case "luoshi3" -> ActFuling.deActluoshi3(data);
            case "luoshi4" -> ActFuling.deActluoshi4(data);

            case "wanfa1" -> ActFuling.deActwanfa1(data);
            case "wanfa2" -> ActFuling.deActwanfa2(data);
            case "wanfa3" -> ActFuling.deActwanfa3(data);
            case "wanfa4" -> ActFuling.deActwanfa4(data);

            case "yuti1" -> ActFuling.deActyuti1(data);
            case "yuti2" -> ActFuling.deActyuti2(data);
            case "yuti3" -> ActFuling.deActyuti3(data);
            case "yuti4" -> ActFuling.deActyuti4(data);

            case "liren1" -> ActFuling.deActliren1(data);
            case "liren2" -> ActFuling.deActliren2(data);
            case "liren3" -> ActFuling.deActliren3(data);
            case "liren4" -> ActFuling.deActliren4(data);

            case "qiangong1" -> ActFuling.deActqiangong1(data);
            case "qiangong2" -> ActFuling.deActqiangong2(data);
            case "qiangong3" -> ActFuling.deActqiangong3(data);
            case "qiangong4" -> ActFuling.deActqiangong4(data);

            case "qiangren1" -> ActFuling.deActqiangren1(data);
            case "qiangren2" -> ActFuling.deActqiangren2(data);
            case "qiangren3" -> ActFuling.deActqiangren3(data);
            case "qiangren4" -> ActFuling.deActqiangren4(data);

            case "shuangjia1" -> ActFuling.deActshuangjia1(data);
            case "shuangjia2" -> ActFuling.deActshuangjia2(data);
            case "shuangjia3" -> ActFuling.deActshuangjia3(data);
            case "shuangjia4" -> ActFuling.deActshuangjia4(data);

            case "huixin1" -> ActFuling.deActhuixin1(data);
            case "huixin2" -> ActFuling.deActhuixin2(data);
            case "huixin3" -> ActFuling.deActhuixin3(data);
            case "huixin4" -> ActFuling.deActhuixin4(data);

            case "guantong1" -> ActFuling.deActguantong1(data);
            case "guantong2" -> ActFuling.deActguantong2(data);
            case "guantong3" -> ActFuling.deActguantong3(data);
            case "guantong4" -> ActFuling.deActguantong4(data);

            case "juli1" -> ActFuling.deActjuli1(data);
            case "juli2" -> ActFuling.deActjuli2(data);
            case "juli3" -> ActFuling.deActjuli3(data);
            case "juli4" -> ActFuling.deActjuli4(data);
            case null, default -> {
            }
        }

    }


}
