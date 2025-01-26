package com.xiaoxiaoowo.yuehua.jineng;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.jineng.dan.zhenfa.*;
import com.xiaoxiaoowo.yuehua.jineng.gong.biweapon.HeiTieChong;
import com.xiaoxiaoowo.yuehua.jineng.gong.biweapon.HuangTongChong;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji.*;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.lingjian.FuRongGong;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.lingjian.HongLuanGong;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.lingjian.SheTianZhuiYueGong;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.lingjian.TianQiongGong;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.youxia.HeiTieNu;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.youxia.HongLinNu;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.youxia.JiaoLongNu;
import com.xiaoxiaoowo.yuehua.jineng.gong.weapon.youxia.RiYueLiuXinNu;
import com.xiaoxiaoowo.yuehua.jineng.zhan.biweapon.FeiRen;
import com.xiaoxiaoowo.yuehua.jineng.zhan.biweapon.JinRuiFeiRen;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong.ChiTongJian;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong.KunLunFeiXianJian;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong.QinTongJian;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong.TaiJiJian;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.pojun.*;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun.HongYinQiang;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun.HuTouZhanJinQiang;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun.YinYueQiang;
import com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun.YouLongQiang;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoJiNengObservers;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoZhenfaObserver;
import org.bukkit.entity.Arrow;

public final class DoJiNeng {
    public static void doJiNeng(String id, Data data) {
        double multiplier = 1.0;
        for (String observer : data.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, data);
        }

        switch (id) {

        }
    }

    public static void doJiNengZhan(String id, ZhanData zhanData) {
        double multiplier = 1.0;
        for (String observer : zhanData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, zhanData);
        }
        switch (id) {
            case "taoMuJian" -> TaoMuJian.skill1(zhanData, multiplier);
            case "kaiShanDao" -> KaiShanDao.skill1(zhanData, multiplier);
            case "juTongZhanChui" -> JinGuaChui.skill1(zhanData, multiplier);
            case "poKongFu" -> PoKongFu.skill1(zhanData, multiplier);
            case "sanBaoYuRuYi" -> SanBaoYuRuYi.skill1(zhanData, multiplier);
            case "qinTongJian" -> QinTongJian.skill1(zhanData, multiplier);
            case "chiTongJian" -> ChiTongJian.skill1(zhanData, multiplier);
            case "taiJiJian" -> TaiJiJian.skill1(zhanData, multiplier);
            case "kunLunFeiXianJian" -> KunLunFeiXianJian.skill1(zhanData, multiplier);
            case "yinYueQiang" -> YinYueQiang.skill1(zhanData, multiplier);
            case "hongYinQiang" -> HongYinQiang.skill1(zhanData, multiplier);
            case "youLongQiang" -> YouLongQiang.skill1(zhanData, multiplier);
            case "huTouZhanJinQiang" -> HuTouZhanJinQiang.skill1(zhanData, multiplier);

            case "feiRen" -> FeiRen.skill1(zhanData, multiplier);
            case "jinRuiFeiRen" -> JinRuiFeiRen.skill1(zhanData, multiplier);

        }
    }

    public static void doJiNengGong(String id, GongData gongData) {
        double multiplier = 1.0;
        for (String observer : gongData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id) {
            case "heiTieChong" -> HeiTieChong.skill1(gongData, multiplier);
            case "huangTongChong" -> HuangTongChong.skill1(gongData, multiplier);
        }
    }

    public static void doJiNengProjectile(String id, GongData gongData, Arrow arrow) {
        double multiplier = 1.0;
        for (String observer : gongData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }

        switch (id) {
            case "tengMuGong" -> TengMuGong.skill1(gongData, multiplier, arrow);
            case "qinTongGong" -> QinTongGong.skill1(gongData, multiplier, arrow);
            case "yanTieGong" -> YanTieGong.skill1(gongData, multiplier, arrow);
            case "zhongChuiGong" -> ZhongChuiGong.skill1(gongData, multiplier, arrow);
            case "beiDouMieShenGong" -> BeiDouMieShenGong.skill1(gongData, multiplier, arrow);
            case "heiTieNu" -> HeiTieNu.skill1(gongData, multiplier, arrow);
            case "hongLinNu" -> HongLinNu.skill1(gongData, multiplier, arrow);
            case "jiaoLongNu" -> JiaoLongNu.skill1(gongData, multiplier, arrow);
            case "riYueLiuXingNu" -> RiYueLiuXinNu.skill1(gongData, multiplier);
            case "fuRongGong" -> FuRongGong.skill1(gongData, multiplier, arrow);
            case "hongLuanGong" -> HongLuanGong.skill1(gongData, multiplier, arrow);
            case "tianQiongGong" -> TianQiongGong.skill1(gongData, multiplier, arrow);
            case "sheTianZhuiYueGong" -> SheTianZhuiYueGong.skill1(gongData, multiplier, arrow);
        }
    }

    public static void doJiNengDan(String id, DanData danData) {
        double multiplier = 1.0;
        for (String observer : danData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, danData);
        }
        switch (id) {

        }
    }

    public static void doJiNeng2(String id, Data data) {
        double multiplier = 1.0;
        for (String observer : data.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, data);
        }
        switch (id) {

        }
    }

    public static void doJiNengZhan2(String id, ZhanData zhanData) {
        double multiplier = 1.0;
        for (String observer : zhanData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, zhanData);
        }
        switch (id) {

        }
    }

    public static void doJiNengGong2(String id, GongData gongData) {
        double multiplier = 1.0;
        for (String observer : gongData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id) {
            case "heiTieChong" -> HeiTieChong.skill2(gongData, multiplier);
            case "huangTongChong" -> HuangTongChong.skill2(gongData, multiplier);
        }
    }

    public static void doJiNengDan2(String id, DanData danData) {
        double multiplier = 1.0;
        for (String observer : danData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, danData);
        }
        switch (id) {

        }
    }

    public static void doUpHeadShoot(String id, GongData gongData) {
        double multiplier = 1.0;
        for (String observer : gongData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id) {
        }
    }

    public static void doDownHeadShoot(String id, GongData gongData) {
        double multiplier = 1.0;
        for (String observer : gongData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id) {
        }
    }

    public static void doRorateShoot(String id, GongData gongData) {
        double multiplier = 1.0;
        for (String observer : gongData.jiNengObservers) {
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id) {
        }
    }

    public static void doZhenfa(String id, DanData danData) {
        double multiplier = 1.0;
        for (String observer : danData.zhenfaObservers) {
            multiplier = multiplier * DoZhenfaObserver.doZhenfa(observer, danData);
        }
        switch (id) {
            case "jin0" -> Jin.putong(danData, multiplier);
            case "mu0" -> Mu.putong(danData, multiplier);
            case "shui0" -> Shui.putong(danData, multiplier);
            case "huo0" -> Huo.putong(danData, multiplier);
            case "tu0" -> Tu.putong(danData, multiplier);
            case "jin1" -> Jin.jinlian(danData, multiplier);
            case "mu1" -> Mu.jinlian(danData, multiplier);
            case "shui1" -> Shui.jinlian(danData, multiplier);
            case "huo1" -> Huo.jinlian(danData, multiplier);
            case "tu1" -> Tu.jinlian(danData, multiplier);
            case "jin2" -> Jin.nongsuo(danData, multiplier);
            case "mu2" -> Mu.nongsuo(danData, multiplier);
            case "shui2" -> Shui.nongsuo(danData, multiplier);
            case "huo2" -> Huo.nongsuo(danData, multiplier);
            case "tu2" -> Tu.nongsuo(danData, multiplier);
        }
    }
}
