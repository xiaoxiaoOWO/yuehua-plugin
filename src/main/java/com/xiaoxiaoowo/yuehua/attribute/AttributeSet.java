package com.xiaoxiaoowo.yuehua.attribute;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.attribute.attributes.fangyu.*;
import com.xiaoxiaoowo.yuehua.attribute.attributes.jingong.*;
import com.xiaoxiaoowo.yuehua.attribute.attributes.special.ArrowCountMax;
import com.xiaoxiaoowo.yuehua.attribute.attributes.special.Danlu;
import com.xiaoxiaoowo.yuehua.attribute.attributes.special.IsBow;
import com.xiaoxiaoowo.yuehua.attribute.attributes.special.SlotWithId;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.*;
import net.kyori.adventure.text.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AttributeSet {
    public static final Map<String, List<MyAttribute>> attributes;

    static {
        attributes = new HashMap<>(1500);
        weaponAtt();
        hujiaAtt();
        biWeaponAtt();
        fabaoAtt();
        yiqiAtt();
        shipinAtt();
    }

    private static void weaponAtt() {
        zhanWeaponAtt();
        gongWeaponAtt();
        danWeaponAtt();
    }

    private static void hujiaAtt() {
        allHujiaAtt();
        zhanHujiaAtt();
        gongHujiaAtt();
        danHujiaAtt();
    }

    private static void biWeaponAtt() {
        attributes.put("feiRen", List.of(
                new AttackAdd(6),
                new SlotWithId("feiRen", 1)
        ));

        attributes.put("jinRuiFeiRen", List.of(
                new AttackAdd(12),
                new Pojia(0.05),
                new SlotWithId("jinRuiFeiRen", 1)
        ));

        attributes.put("wuShengXiuJian", List.of(
                new AttackAdd(24),
                new Pojia(0.1),
                new SlotWithId("wuShengXiuJian", 1)
        ));

        attributes.put("huiXuanTaiJi", List.of(
                new AttackAdd(48),
                new Pojia(0.15),
                new CoolReduce(0.05),
                new SlotWithId("huiXuanTaiJi", 1)
        ));

        attributes.put("wuYinWuZong", List.of(
                new AttackAdd(96),
                new Pojia(0.2),
                new CoolReduce(0.1),
                new SlotWithId("wuYinWuZong", 1)
        ));

        attributes.put("yanWangTie", List.of(
                new AttackAdd(192),
                new Pojia(0.25),
                new CoolReduce(0.15),
                new BaojiXiaoguo(0.5),
                new SlotWithId("yanWangTie", 1)
        ));

        attributes.put("heiTieChong", List.of(
                new ArrowAdd(2),
                new SlotWithId("heiTieChong", 1)
        ));

        attributes.put("huangTongChong", List.of(
                new ArrowAdd(4),
                new Pojia(0.05),
                new SlotWithId("huangTongChong", 1)
        ));

        attributes.put("mingYue", List.of(
                new ArrowAdd(8),
                new Pojia(0.1),
                new SlotWithId("mingYue", 1)
        ));

        attributes.put("canLan", List.of(
                new ArrowAdd(16),
                new Pojia(0.15),
                new CoolReduce(0.05),
                new SlotWithId("canLan", 1)
        ));

        attributes.put("jinJing", List.of(
                new ArrowAdd(32),
                new Pojia(0.2),
                new CoolReduce(0.1),
                new SlotWithId("jinJing", 1)
        ));

        attributes.put("xiaoTian", List.of(
                new ArrowAdd(64),
                new Pojia(0.25),
                new CoolReduce(0.15),
                new BaojiXiaoguo(0.5),
                new SlotWithId("xiaoTian", 1)
        ));

        attributes.put("xiao", List.of(
                new ZhenfaAdd(2),
                new SlotWithId("xiao", 1)
        ));

        attributes.put("qinFengYinYin", List.of(
                new ZhenfaAdd(4),
                new Speed(0.04, Speed.biweaponSpeed),
                new SlotWithId("qinFengYinYin", 1)
        ));

        attributes.put("liuShuiChanChan", List.of(
                new ZhenfaAdd(8),
                new Speed(0.08, Speed.biweaponSpeed),
                new SlotWithId("liuShuiChanChan", 1)
        ));

        attributes.put("buQiChunYu", List.of(
                new ZhenfaAdd(16),
                new BaoJi(0.05),
                new Speed(0.12, Speed.biweaponSpeed),
                new SlotWithId("buQiChunYu", 1)
        ));

        attributes.put("sanShengZhenHun", List.of(
                new ZhenfaAdd(32),
                new BaoJi(0.1),
                new Speed(0.16, Speed.biweaponSpeed),
                new SlotWithId("sanShengZhenHun", 1)
        ));

        attributes.put("jiuFengLaiYi", List.of(
                new ZhenfaAdd(64),
                new BaoJi(0.15),
                new BaojiXiaoguo(0.5),
                new Speed(0.2, Speed.biweaponSpeed),
                new SlotWithId("jiuFengLaiYi", 1)
        ));


    }

    private static void fabaoAtt() {
        zhanFabaoAtt();
        gongFabaoAtt();
        danFabaoAtt();
        allFabaoAtt();
    }

    private static void yiqiAtt() {
        attributes.put("laoZhanShiDunPai", List.of(
                new ShouHu(16),
                new SlotWithId("laoZhanShiDunPai", 40)
        ));

        attributes.put("xinBinDunPai", List.of(
                new ShouHu(24),
                new Gedang(8),
                new SlotWithId("xinBinDunPai", 40)
        ));

        attributes.put("jinRuiDunPai", List.of(
                new ShouHu(36),
                new Gedang(12),
                new SlotWithId("jinRuiDunPai", 40)
        ));

        attributes.put("chiSeYueHuo", List.of(
                new ShouHu(72),
                new Gedang(18),
                new Renxing(0.05),
                new SlotWithId("chiSeYueHuo", 40)
        ));

        attributes.put("jinGangBuHuai", List.of(
                new ShouHu(144),
                new Gedang(27),
                new Renxing(0.1),
                new SlotWithId("jinGangBuHuai", 40)
        ));

        attributes.put("chenBinLuoXue", List.of(
                new ShouHu(288),
                new Gedang(54),
                new Renxing(0.15),
                new Shengji(0.2),
                new SlotWithId("chenBinLuoXue", 40)
        ));

        attributes.put("laoLieHuJianDai", List.of(
                new ArrowAdd(2),
                new ArrowCountMax(1280),
                new SlotWithId("laoLieHuJianDai", 40)
        ));

        attributes.put("xinBinJianDai", List.of(
                new ArrowAdd(4),
                new Pojia(0.05),
                new ArrowCountMax(2560),
                new SlotWithId("xinBinJianDai", 40)
        ));

        attributes.put("jinRuiJianDai", List.of(
                new ArrowAdd(8),
                new Pojia(0.1),
                new ArrowCountMax(5120),
                new SlotWithId("jinRuiJianDai", 40)
        ));

        attributes.put("yingYanJianDai", List.of(
                new ArrowAdd(16),
                new Pojia(0.15),
                new Hp(32),
                new ArrowCountMax(10240),
                new SlotWithId("yingYanJianDai", 40)
        ));

        attributes.put("cangGuNingWang", List.of(
                new ArrowAdd(32),
                new Pojia(0.2),
                new Hp(64),
                new ArrowCountMax(20480),
                new SlotWithId("cangGuNingWang", 40)
        ));

        attributes.put("niePanYunAng", List.of(
                new ArrowAdd(64),
                new Pojia(0.25),
                new Hp(128),
                new HpMul(0.2, HpMul.yiqiHp),
                new ArrowCountMax(40960),
                new SlotWithId("niePanYunAng", 40)
        ));

        attributes.put("fangShenDuanBi", List.of(
                new AttackAdd(6),
                new AttackSpeed(0.5),
                new SlotWithId("fangShenDuanBi", 0)
        ));

        attributes.put("tieZhiDuanBi", List.of(
                new AttackAdd(12),
                new Pojia(0.05),
                new AttackSpeed(0.6),
                new SlotWithId("tieZhiDuanBi", 0)
        ));

        attributes.put("huiYiDao", List.of(
                new AttackAdd(24),
                new Pojia(0.1),
                new AttackSpeed(0.7),
                new SlotWithId("huiYiDao", 0)
        ));

        attributes.put("longYaDao", List.of(
                new AttackAdd(48),
                new Pojia(0.15),
                new AttackSpeed(0.8),
                new Renxing(0.05),
                new SlotWithId("longYaDao", 0)
        ));

        attributes.put("zhangQiCuiZhu", List.of(
                new AttackAdd(96),
                new Pojia(0.2),
                new AttackSpeed(0.9),
                new Renxing(0.1),
                new SlotWithId("zhangQiCuiZhu", 0)
        ));

        attributes.put("mingHong", List.of(
                new AttackAdd(192),
                new AttackMul(0.5),
                new Pojia(0.25),
                new AttackSpeed(1),
                new Renxing(0.15),
                new SlotWithId("mingHong", 0)
        ));
    }

    private static void shipinAtt() {
        shouhunAtt();
        jiezhiAtt();
        xiantianAtt();
    }

    private static void zhanWeaponAtt() {
        attributes.put("taoMuJian", List.of(
                new AttackAdd(6),
                new AttackSpeed(0.5),
                new SlotWithId("taoMuJian", 0)
        ));

        attributes.put("yinYueQiang", List.of(
                new AttackAdd(12),
                new Pojia(0.05),
                new AttackSpeed(0.5),
                new AttackRange(0.5),
                new SlotWithId("yinYueQiang", 0)
        ));

        attributes.put("hongYinQiang", List.of(
                new AttackAdd(24),
                new Pojia(0.1),
                new AttackSpeed(0.5),
                new AttackRange(1),
                new SlotWithId("hongYinQiang", 0)
        ));

        attributes.put("youLongQiang", List.of(
                new AttackAdd(48),
                new BaoJi(0.1),
                new Pojia(0.15),
                new AttackSpeed(0.5),
                new AttackRange(1.5),
                new SlotWithId("youLongQiang", 0)
        ));

        attributes.put("huTouZhanJinQiang", List.of(
                new AttackAdd(96),
                new BaoJi(0.2),
                new Pojia(0.2),
                new AttackSpeed(0.5),
                new AttackRange(2),
                new SlotWithId("huTouZhanJinQiang", 0)
        ));

        attributes.put("ruYiJinGuBang", List.of(
                new AttackAdd(192),
                new AttackMul(0.5),
                new BaoJi(0.3),
                new Pojia(0.25),
                new AttackSpeed(0.5),
                new AttackRange(2.5),
                new SlotWithId("ruYiJinGuBang", 0)
        ));

        attributes.put("kaiShanDao", List.of(
                new AttackAdd(12),
                new Pojia(0.05),
                new AttackSpeed(0.75),
                new SlotWithId("kaiShanDao", 0)
        ));

        attributes.put("juTongZhanChui", List.of(
                new AttackAdd(24),
                new Pojia(0.1),
                new AttackSpeed(1),
                new SlotWithId("juTongZhanChui", 0)
        ));

        attributes.put("poKongFu", List.of(
                new AttackAdd(48),
                new BaoJi(0.1),
                new Pojia(0.15),
                new AttackSpeed(1.25),
                new SlotWithId("poKongFu", 0)
        ));

        attributes.put("sanBaoYuRuYi", List.of(
                new AttackAdd(96),
                new BaoJi(0.2),
                new Pojia(0.2),
                new AttackSpeed(1.5),
                new SlotWithId("sanBaoYuRuYi", 0)
        ));

        attributes.put("xuanYuan", List.of(
                new AttackAdd(192),
                new AttackMul(0.5),
                new BaoJi(0.3),
                new Pojia(0.25),
                new AttackSpeed(1.75),
                new SlotWithId("xuanYuan", 0)
        ));

        attributes.put("qinTongJian", List.of(
                new AttackAdd(12),
                new Pojia(0.05),
                new AttackSpeed(0.6),
                new HpMul(0.2, HpMul.weaponHp),
                new SlotWithId("qinTongJian", 0)
        ));

        attributes.put("chiTongJian", List.of(
                new AttackAdd(24),
                new Pojia(0.1),
                new AttackSpeed(0.7),
                new HpMul(0.4, HpMul.weaponHp),
                new SlotWithId("chiTongJian", 0)
        ));

        attributes.put("taiJiJian", List.of(
                new AttackAdd(48),
                new BaoJi(0.1),
                new Pojia(0.15),
                new AttackSpeed(0.8),
                new HpMul(0.6, HpMul.weaponHp),
                new SlotWithId("taiJiJian", 0)
        ));
        attributes.put("kunLunFeiXianJian", List.of(
                new AttackAdd(96),
                new BaoJi(0.2),
                new Pojia(0.2),
                new AttackSpeed(0.9),
                new HpMul(0.8, HpMul.weaponHp),
                new SlotWithId("kunLunFeiXianJian", 0)
        ));

        attributes.put("taiE", List.of(
                new AttackAdd(192),
                new AttackMul(0.5),
                new BaoJi(0.3),
                new Pojia(0.25),
                new AttackSpeed(1),
                new HpMul(1, HpMul.weaponHp),
                new SlotWithId("taiE", 0)
        ));

    }

    private static void gongWeaponAtt() {
        attributes.put("tengMuGong", List.of(
                new ArrowAdd(2),
                new IsBow(),
                new SlotWithId("tengMuGong", 0)
        ));

        attributes.put("qinTongGong", List.of(
                new ArrowAdd(4),
                new Pojia(0.05),
                new BaoJi(0.1),
                new IsBow(),
                new SlotWithId("qinTongGong", 0)
        ));

        attributes.put("yanTieGong", List.of(
                new ArrowAdd(8),
                new Pojia(0.1),
                new BaoJi(0.2),
                new IsBow(),
                new SlotWithId("yanTieGong", 0)
        ));

        attributes.put("zhongChuiGong", List.of(
                new ArrowAdd(16),
                new Pojia(0.15),
                new BaoJi(0.3),
                new BaojiXiaoguo(0.2),
                new IsBow(),
                new SlotWithId("zhongChuiGong", 0)
        ));

        attributes.put("beiDouMieShenGong", List.of(
                new ArrowAdd(32),
                new Pojia(0.2),
                new BaoJi(0.4),
                new BaojiXiaoguo(0.4),
                new IsBow(),
                new SlotWithId("beiDouMieShenGong", 0)
        ));

        attributes.put("zhuRi", List.of(
                new ArrowAdd(64),
                new ArrowMul(0.5),
                new Pojia(0.25),
                new BaoJi(0.5),
                new BaojiXiaoguo(0.6),
                new IsBow(),
                new SlotWithId("zhuRi", 0)
        ));

        attributes.put("heiTieNu", List.of(
                new ArrowAdd(4),
                new Pojia(0.05),
                new SlotWithId("heiTieNu", 0)
        ));

        attributes.put("hongLinNu", List.of(
                new ArrowAdd(8),
                new Pojia(0.1),
                new SlotWithId("hongLinNu", 0)
        ));

        attributes.put("jiaoLongNu", List.of(
                new ArrowAdd(16),
                new BaoJi(0.1),
                new Pojia(0.15),
                new SlotWithId("jiaoLongNu", 0)
        ));

        attributes.put("riYueLiuXingNu", List.of(
                new ArrowAdd(32),
                new BaoJi(0.2),
                new Pojia(0.2),
                new SlotWithId("riYueLiuXingNu", 0)
        ));

        attributes.put("liangYi", List.of(
                new ArrowAdd(64),
                new ArrowMul(0.5),
                new BaoJi(0.3),
                new Pojia(0.25),
                new SlotWithId("liangYi", 0)
        ));

        attributes.put("fuRongGong", List.of(
                new ArrowAdd(4),
                new Pojia(0.05),
                new Speed(0.2, Speed.weaponSpeed),
                new IsBow(),
                new SlotWithId("fuRongGong", 0)
        ));

        attributes.put("hongLuanGong", List.of(
                new ArrowAdd(8),
                new Pojia(0.1),
                new Speed(0.25, Speed.weaponSpeed),
                new IsBow(),
                new SlotWithId("hongLuanGong", 0)
        ));

        attributes.put("tianQiongGong", List.of(
                new ArrowAdd(16),
                new BaoJi(0.1),
                new Pojia(0.15),
                new Speed(0.3, Speed.weaponSpeed),
                new IsBow(),
                new SlotWithId("tianQiongGong", 0)
        ));

        attributes.put("sheTianZhuiYueGong", List.of(
                new ArrowAdd(32),
                new BaoJi(0.2),
                new Pojia(0.2),
                new Speed(0.35, Speed.weaponSpeed),
                new IsBow(),
                new SlotWithId("sheTianZhuiYueGong", 0)
        ));

        attributes.put("liuGuang", List.of(
                new ArrowAdd(64),
                new ArrowMul(0.5),
                new BaoJi(0.3),
                new Pojia(0.25),
                new Speed(0.4, Speed.weaponSpeed),
                new IsBow(),
                new SlotWithId("liuGuang", 0)
        ));
    }

    private static void danWeaponAtt() {
        attributes.put("heiTieGuo", List.of(
                new ZhenfaAdd(2),
                new CoolReduce(0.02),
                new Speed(-0.2, Speed.weaponSpeed),
                new Danlu("heiTieGuo"),
                new SlotWithId("heiTieGuo", 40)
        ));

        attributes.put("qinTongGuo", List.of(
                new ZhenfaAdd(4),
                new CoolReduce(0.04),
                new Pofa(0.05),
                new Speed(-0.15, Speed.weaponSpeed),
                new Danlu("qinTongGuo"),
                new SlotWithId("qinTongGuo", 40)
        ));

        attributes.put("lianDanLu", List.of(
                new ZhenfaAdd(8),
                new CoolReduce(0.06),
                new Pofa(0.1),
                new Speed(-0.1, Speed.weaponSpeed),
                new Danlu("lianDanLu"),
                new SlotWithId("lianDanLu", 40)
        ));

        attributes.put("suoHunLu", List.of(
                new ZhenfaAdd(16),
                new CoolReduce(0.08),
                new Pofa(0.15),
                new BaoJi(0.1),
                new Speed(-0.05, Speed.weaponSpeed),
                new Danlu("suoHunLu"),
                new SlotWithId("suoHunLu", 40)
        ));

        attributes.put("qiShaDing", List.of(
                new ZhenfaAdd(32),
                new CoolReduce(0.1),
                new Pofa(0.2),
                new BaoJi(0.2),
                new Danlu("qiShaDing"),
                new SlotWithId("qiShaDing", 40)
        ));

        attributes.put("hunYuanShenDing", List.of(
                new ZhenfaAdd(64),
                new CoolReduce(0.1),
                new ZhenfaMul(0.5),
                new Pofa(0.25),
                new BaoJi(0.3),
                new Danlu("hunYuanShenDing"),
                new SlotWithId("hunYuanShenDing", 40)
        ));
    }

    private static void zhanFabaoAtt() {
        attributes.put("jueDouLing", List.of(
                new AttackAdd(24),
                new Pofa(0.1),
                new SlotWithId("jueDouLing", 2)
        ));

        attributes.put("leiMingGu", List.of(
                new AttackAdd(48),
                new Pofa(0.15),
                new SlotWithId("leiMingGu", 2)
        ));


        attributes.put("huanSiLin", List.of(
                new AttackAdd(96),
                new Pofa(0.2),
                new SlotWithId("huanSiLin", 2)
        ));

        attributes.put("niuMoNuHou", List.of(
                new AttackAdd(192),
                new AttackMul(0.3),
                new Pofa(0.25),
                new SlotWithId("niuMoNuHou", 2)
        ));

        attributes.put("douQiShi", List.of(
                new AttackAdd(24),
                new Pofa(0.1),
                new SlotWithId("douQiShi", 2)
        ));

        attributes.put("panGuanBi", List.of(
                new AttackAdd(48),
                new Pofa(0.15),
                new SlotWithId("panGuanBi", 2)
        ));

        attributes.put("minShengJian", List.of(
                new AttackAdd(96),
                new Pofa(0.2),
                new SlotWithId("minShengJian", 2)
        ));

        attributes.put("zhenLeiTianChui", List.of(
                new AttackAdd(192),
                new AttackMul(0.3),
                new Pofa(0.25),
                new SlotWithId("zhenLeiTianChui", 2)
        ));

    }

    private static void gongFabaoAtt() {
        attributes.put("dioHunGan", List.of(
                new ArrowAdd(8),
                new Pofa(0.1),
                new SlotWithId("dioHunGan", 2)
        ));

        attributes.put("sheLingZhu", List.of(
                new ArrowAdd(16),
                new Pofa(0.15),
                new SlotWithId("sheLingZhu", 2)
        ));


        attributes.put("yuJinPin", List.of(
                new ArrowAdd(32),
                new Pofa(0.2),
                new SlotWithId("yuJinPin", 2)
        ));

        attributes.put("tianJiShenJin", List.of(
                new ArrowAdd(64),
                new ArrowMul(0.3),
                new Pofa(0.25),
                new SlotWithId("tianJiShenJin", 2)
        ));

        attributes.put("ruiYingYan", List.of(
                new ArrowAdd(8),
                new Pofa(0.1),
                new SlotWithId("ruiYingYan", 2)
        ));

        attributes.put("duoHunTang", List.of(
                new ArrowAdd(16),
                new Pofa(0.15),
                new SlotWithId("duoHunTang", 2)
        ));

        attributes.put("moYuanFoZhu", List.of(
                new ArrowAdd(32),
                new Pofa(0.2),
                new SlotWithId("moYuanFoZhu", 2)
        ));

        attributes.put("fuXinRuYi", List.of(
                new ArrowAdd(64),
                new ArrowMul(0.3),
                new Pofa(0.25),
                new SlotWithId("fuXinRuYi", 2)
        ));
    }

    private static void danFabaoAtt() {

        attributes.put("lvYeXianZong",List.of(
                new ZhenfaAdd(8),
                new BaojiXiaoguo(0.1),
                new SlotWithId("lvYeXianZong",2)
        ));

        attributes.put("qingNvHuanShuang",List.of(
                new ZhenfaAdd(16),
                new BaojiXiaoguo(0.2),
                new SlotWithId("qingNvHuanShuang",2)
        ));

        attributes.put("zhuRongKuYan",List.of(
                new ZhenfaAdd(32),
                new BaojiXiaoguo(0.3),
                new SlotWithId("zhuRongKuYan",2)
        ));

        attributes.put("zhuDianXuanJing",List.of(
                new ZhenfaAdd(64),
                new ZhenfaMul(0.1),
                new BaojiXiaoguo(0.4),
                new SlotWithId("zhuDianXuanJing",2)
        ));


        attributes.put("buHunWang",List.of(
                new ZhenfaAdd(8),
                new BaojiXiaoguo(0.1),
                new SlotWithId("buHunWang",3)
        ));

        attributes.put("yangShouJian",List.of(
                new ZhenfaAdd(16),
                new BaojiXiaoguo(0.2),
                new SlotWithId("yangShouJian",3)
        ));

        attributes.put("wuMingMoYinLuo",List.of(
                new ZhenfaAdd(32),
                new BaojiXiaoguo(0.3),
                new SlotWithId("wuMingMoYinLuo",3)
        ));

        attributes.put("sheTianHuaXueLing",List.of(
                new ZhenfaAdd(64),
                new ZhenfaMul(0.1),
                new BaojiXiaoguo(0.4),
                new SlotWithId("sheTianHuaXueLing",3)
        ));

        attributes.put("kuYeLing",List.of(
                new ZhenfaAdd(8),
                new Shengji(0.05),
                new SlotWithId("kuYeLing",4)
        ));

        attributes.put("luoBeiJinPin",List.of(
                new ZhenfaAdd(16),
                new Shengji(0.1),
                new SlotWithId("luoBeiJinPin",4)
        ));

        attributes.put("pinYuShuiYu",List.of(
                new ZhenfaAdd(32),
                new Shengji(0.15),
                new SlotWithId("pinYuShuiYu",4)
        ));

        attributes.put("diKongYmoQuan",List.of(
                new ZhenfaAdd(64),
                new ZhenfaMul(0.1),
                new Shengji(0.2),
                new SlotWithId("diKongYmoQuan",4)
        ));


        attributes.put("luanShenGu",List.of(
                new ZhenfaAdd(8),
                new Shengji(0.05),
                new SlotWithId("luanShenGu",5)
        ));

        attributes.put("jinGuLian",List.of(
                new ZhenfaAdd(16),
                new Shengji(0.1),
                new SlotWithId("jinGuLian",5)
        ));

        attributes.put("jianChangGuLin",List.of(
                new ZhenfaAdd(32),
                new Shengji(0.15),
                new SlotWithId("jianChangGuLin",5)
        ));

        attributes.put("moDuoHunFan",List.of(
                new ZhenfaAdd(64),
                new ZhenfaMul(0.1),
                new Shengji(0.2),
                new SlotWithId("moDuoHunFan",5)
        ));


    }

    private static void allFabaoAtt() {
        attributes.put("zhaoYaoJin", List.of(
                new Hp(32),
                new Hujia(0.1),
                new Fakang(0.1),
                new SlotWithId("zhaoYaoJin", 8)
        ));

        attributes.put("yuFuChen", List.of(
                new Hp(64),
                new Hujia(0.15),
                new Fakang(0.15),
                new SlotWithId("yuFuChen", 8)
        ));

        attributes.put("wuSeBuTianShi", List.of(
                new Hp(128),
                new Hujia(0.2),
                new Fakang(0.2),
                new SlotWithId("wuSeBuTianShi", 8)
        ));

        attributes.put("yaoWangHuLu",List.of(
                new Hp(256),
                new Hujia(0.25),
                new Fakang(0.25),
                new SlotWithId("yaoWangHuLu", 8)
        ));

    }

    private static void shouhunAtt() {

        attributes.put("qingLongShengQi1", List.of(
                new Renxing(0.05),
                new SlotWithId("qingLongShengQi1", 100)
        ));

        attributes.put("qingLongShengQi2", List.of(
                new Renxing(0.1),
                new SlotWithId("qingLongShengQi2", 100)

        ));

        attributes.put("qingLongShengQi3", List.of(
                new Renxing(0.15),
                new SlotWithId("qingLongShengQi3", 100)

        ));
        attributes.put("qingLongShengQi4", List.of(
                new Renxing(0.2),
                new DingLi(0.1),
                new SlotWithId("qingLongShengQi4", 100)

        ));
        attributes.put("qingLongShengQi5", List.of(
                new Renxing(0.25),
                new DingLi(0.15),
                new SlotWithId("qingLongShengQi5", 100)

        ));

        attributes.put("qingLongShengQi6", List.of(
                new Renxing(0.3),
                new DingLi(0.2),
                new SlotWithId("qingLongShengQi6", 100)

        ));


        attributes.put("zhuQueShengQi1", List.of(
                new Shengji(0.1),
                new SlotWithId("zhuQueShengQi1", 101)
        ));

        attributes.put("zhuQueShengQi2", List.of(
                new Shengji(0.15),
                new SlotWithId("zhuQueShengQi2", 101)
        ));

        attributes.put("zhuQueShengQi3", List.of(
                new Shengji(0.2),
                new SlotWithId("zhuQueShengQi3", 101)
        ));

        attributes.put("zhuQueShengQi4", List.of(
                new Shengji(0.25),
                new HpMul(0.2, HpMul.shipinHp),
                new SlotWithId("zhuQueShengQi4", 101)
        ));

        attributes.put("zhuQueShengQi5", List.of(
                new Shengji(0.3),
                new HpMul(0.4, HpMul.shipinHp),
                new SlotWithId("zhuQueShengQi5", 101)
        ));

        attributes.put("zhuQueShengQi6", List.of(
                new Shengji(0.35),
                new HpMul(0.6, HpMul.shipinHp),
                new SlotWithId("zhuQueShengQi6", 101)
        ));

        attributes.put("baiHuShengQi1", List.of(
                new Speed(0.05, Speed.shipinSpeed),
                new SlotWithId("baiHuShengQi1", 102)
        ));

        attributes.put("baiHuShengQi2", List.of(
                new Speed(0.1, Speed.shipinSpeed),
                new SlotWithId("baiHuShengQi2", 102)
        ));

        attributes.put("baiHuShengQi3", List.of(
                new Speed(0.15, Speed.shipinSpeed),
                new SlotWithId("baiHuShengQi3", 102)
        ));

        attributes.put("baiHuShengQi4", List.of(
                new Speed(0.2, Speed.shipinSpeed),
                new CoolReduce(0.05),
                new SlotWithId("baiHuShengQi4", 102)
        ));

        attributes.put("baiHuShengQi5", List.of(
                new Speed(0.25, Speed.shipinSpeed),
                new CoolReduce(0.1),
                new SlotWithId("baiHuShengQi5", 102)
        ));

        attributes.put("baiHuShengQi6", List.of(
                new Speed(0.3, Speed.shipinSpeed),
                new CoolReduce(0.15),
                new SlotWithId("baiHuShengQi6", 102)
        ));

        attributes.put("xuanWuShengQi1", List.of(
                new ShouHu(16),
                new SlotWithId("xuanWuShengQi1", 103)
        ));

        attributes.put("xuanWuShengQi2", List.of(
                new ShouHu(24),
                new SlotWithId("xuanWuShengQi2", 103)
        ));

        attributes.put("xuanWuShengQi3", List.of(
                new ShouHu(36),
                new SlotWithId("xuanWuShengQi3", 103)
        ));

        attributes.put("xuanWuShengQi4", List.of(
                new ShouHu(72),
                new Gedang(18),
                new SlotWithId("xuanWuShengQi4", 103)
        ));

        attributes.put("xuanWuShengQi5", List.of(
                new ShouHu(144),
                new Gedang(27),
                new SlotWithId("xuanWuShengQi5", 103)
        ));

        attributes.put("xuanWuShengQi6", List.of(
                new ShouHu(288),
                new Gedang(54),
                new SlotWithId("xuanWuShengQi6", 103)
        ));


    }

    private static void jiezhiAtt() {
        attributes.put("poSunTanZhiJie", List.of(
                new JingongAdd(2),
                new SlotWithId("poSunTanZhiJie", 104)
        ));

        attributes.put("tanYuZhiJie", List.of(
                new JingongAdd(4),
                new SlotWithId("tanYuZhiJie", 104)
        ));

        attributes.put("tanLanDuJie", List.of(
                new JingongAdd(8),
                new SlotWithId("tanLanDuJie", 104)
        ));

        attributes.put("tanLanXieJie", List.of(
                new JingongAdd(16),
                new JinGongMul(0.1),
                new SlotWithId("tanLanXieJie", 104)
        ));

        attributes.put("tanLanGuiJie", List.of(
                new JingongAdd(32),
                new JinGongMul(0.2),
                new SlotWithId("tanLanGuiJie", 104)
        ));

        attributes.put("tanLanMoJie", List.of(
                new JingongAdd(64),
                new JinGongMul(0.3),
                new SlotWithId("tanLanMoJie", 104)
        ));

        attributes.put("tanLanMingJie", List.of(
                new JingongAdd(128),
                new JinGongMul(0.4),
                new SlotWithId("tanLanMingJie", 104)
        ));

        attributes.put("poSunChiZhiJie", List.of(
                new Pofa(0.1),
                new SlotWithId("poSunChiZhiJie", 105)
        ));

        attributes.put("chiMiZhiJie", List.of(
                new Pofa(0.15),
                new SlotWithId("chiMiZhiJie", 105)
        ));

        attributes.put("chiYuDuJie", List.of(
                new Pofa(0.2),
                new SlotWithId("chiYuDuJie", 105)
        ));

        attributes.put("chiYuXieJie", List.of(
                new Pofa(0.25),
                new Pojia(0.15),
                new SlotWithId("chiYuXieJie", 105)
        ));

        attributes.put("chiYuGuiJie", List.of(
                new Pofa(0.3),
                new Pojia(0.2),
                new SlotWithId("chiYuGuiJie", 105)
        ));

        attributes.put("chiYuMoJie", List.of(
                new Pofa(0.35),
                new Pojia(0.25),
                new SlotWithId("chiYuMoJie", 105)
        ));

        attributes.put("chiYuMingJie", List.of(
                new Pofa(0.4),
                new Pojia(0.3),
                new SlotWithId("chiYuMingJie", 105)
        ));

        attributes.put("poSunChenZhiJie", List.of(
                new BaojiXiaoguo(0.2),
                new SlotWithId("poSunChenZhiJie", 106)
        ));

        attributes.put("chenNuZhiJie", List.of(
                new BaojiXiaoguo(0.3),
                new SlotWithId("chenNuZhiJie", 106)
        ));

        attributes.put("chenHenDuJie", List.of(
                new BaojiXiaoguo(0.4),
                new SlotWithId("chenHenDuJie", 106)
        ));

        attributes.put("chenHenXieJie", List.of(
                new BaojiXiaoguo(0.5),
                new BaoJi(0.05),
                new SlotWithId("chenHenXieJie", 106)
        ));

        attributes.put("chenHenGuiJie", List.of(
                new BaojiXiaoguo(0.6),
                new BaoJi(0.1),
                new SlotWithId("chenHenGuiJie", 106)
        ));

        attributes.put("chenHenMoJie", List.of(
                new BaojiXiaoguo(0.7),
                new BaoJi(0.15),
                new SlotWithId("chenHenMoJie", 106)
        ));

        attributes.put("chenHenMingJie", List.of(
                new BaojiXiaoguo(0.8),
                new BaoJi(0.2),
                new SlotWithId("chenHenMingJie", 106)
        ));


        attributes.put("chanDingFaJie", List.of(
                new Fakang(0.2),
                new SlotWithId("chanDingFaJie", 104)
        ));

        attributes.put("chanDingShengJie", List.of(
                new Fakang(0.25),
                new Gedang(18),
                new SlotWithId("chanDingShengJie", 104)
        ));

        attributes.put("chanDingFoJie", List.of(
                new Fakang(0.3),
                new Gedang(27),
                new SlotWithId("chanDingFoJie", 104)
        ));

        attributes.put("chanDingXianJie", List.of(
                new Fakang(0.35),
                new Gedang(54),
                new SlotWithId("chanDingXianJie", 104)
        ));

        attributes.put("chanDingShenJie", List.of(
                new Fakang(0.4),
                new Gedang(108),
                new SlotWithId("chanDingShenJie", 104)
        ));


        attributes.put("zhiHuiFaJie", List.of(
                new Shengji(0.2),
                new SlotWithId("zhiHuiFaJie", 105)
        ));


        attributes.put("zhiHuiShengJie", List.of(
                new Shengji(0.25),
                new Renxing(0.25),
                new SlotWithId("zhiHuiShengJie", 105)
        ));

        attributes.put("zhiHuiFoJie", List.of(
                new Shengji(0.3),
                new Renxing(0.3),
                new SlotWithId("zhiHuiFoJie", 105)
        ));


        attributes.put("zhiHuiXianJie", List.of(
                new Shengji(0.35),
                new Renxing(0.35),
                new SlotWithId("zhiHuiXianJie", 105)
        ));

        attributes.put("zhiHuiShenJie", List.of(
                new Shengji(0.4),
                new Renxing(0.4),
                new SlotWithId("zhiHuiShenJie", 105)
        ));

        attributes.put("chiJieFaJie", List.of(
                new ShouHu(36),
                new SlotWithId("chiJieFaJie", 106)
        ));

        attributes.put("chiJieShengJie", List.of(
                new ShouHu(72),
                new DingLi(0.15),
                new SlotWithId("chiJieShengJie", 106)
        ));

        attributes.put("chiJieFoJie", List.of(
                new ShouHu(144),
                new DingLi(0.2),
                new SlotWithId("chiJieFoJie", 106)
        ));


        attributes.put("chiJieXianJie", List.of(
                new ShouHu(288),
                new DingLi(0.25),
                new SlotWithId("chiJieXianJie", 106)
        ));

        attributes.put("chiJieShenJie", List.of(
                new ShouHu(576),
                new DingLi(0.3),
                new SlotWithId("chiJieShenJie", 106)
        ));


    }

    private static void xiantianAtt() {

        attributes.put("hunTianLin", List.of(
                new Hujia(0.01),
                new Fakang(0.01),
                new Gedang(1),
                new Renxing(0.01),
                new Shengji(0.01),
                new ShouHu(1),
                new JingongAdd(1),
                new JinGongMul(0.01),
                new Pojia(0.01),
                new Pofa(0.01),
                new BaoJi(0.01),
                new BaojiXiaoguo(0.01),
                new CoolReduce(0.01),
                new Hp(1),
                new HpMul(0.01, HpMul.xiantainHp),
                new Jump(0.01),
                new Speed(0.01, Speed.xiantianSpeed),
                new SlotWithId("hunTianLin", 107)
        ));

        attributes.put("taiChuShenJia", List.of(
                new Hujia(0.01),
                new Fakang(0.01),
                new Gedang(1),
                new Renxing(0.01),
                new Shengji(0.01),
                new ShouHu(1),
                new JingongAdd(1),
                new JinGongMul(0.01),
                new Pojia(0.01),
                new Pofa(0.01),
                new BaoJi(0.01),
                new BaojiXiaoguo(0.01),
                new CoolReduce(0.01),
                new Hp(1),
                new HpMul(0.01, HpMul.xiantainHp),
                new Jump(0.01),
                new Speed(0.01, Speed.xiantianSpeed),
                new SlotWithId("taiChuShenJia", 107)
        ));

        attributes.put("ziShaChan", List.of(
                new Hujia(0.01),
                new Fakang(0.01),
                new Gedang(1),
                new Renxing(0.01),
                new Shengji(0.01),
                new ShouHu(1),
                new JingongAdd(1),
                new JinGongMul(0.01),
                new Pojia(0.01),
                new Pofa(0.01),
                new BaoJi(0.01),
                new BaojiXiaoguo(0.01),
                new CoolReduce(0.01),
                new Hp(1),
                new HpMul(0.01, HpMul.xiantainHp),
                new Jump(0.01),
                new Speed(0.01, Speed.xiantianSpeed),
                new SlotWithId("ziShaChan", 107)
        ));

        attributes.put("fengHuoLun", List.of(
                new Hujia(0.01),
                new Fakang(0.01),
                new Gedang(1),
                new Renxing(0.01),
                new Shengji(0.01),
                new ShouHu(1),
                new JingongAdd(1),
                new JinGongMul(0.01),
                new Pojia(0.01),
                new Pofa(0.01),
                new BaoJi(0.01),
                new BaojiXiaoguo(0.01),
                new CoolReduce(0.01),
                new Hp(1),
                new HpMul(0.01, HpMul.xiantainHp),
                new Jump(0.01),
                new Speed(0.01, Speed.xiantianSpeed),
                new SlotWithId("fengHuoLun", 107)
        ));

        attributes.put("jiuTianXuanYu", List.of(
                new Hujia(0.01),
                new Fakang(0.01),
                new Gedang(1),
                new Renxing(0.01),
                new Shengji(0.01),
                new ShouHu(1),
                new JingongAdd(1),
                new JinGongMul(0.01),
                new Pojia(0.01),
                new Pofa(0.01),
                new BaoJi(0.01),
                new BaojiXiaoguo(0.01),
                new CoolReduce(0.01),
                new Hp(1),
                new HpMul(0.01, HpMul.xiantainHp),
                new Jump(0.01),
                new Speed(0.01, Speed.xiantianSpeed),
                new SlotWithId("jiuTianXuanYu", 107)
        ));

        attributes.put("weiTuoTian", List.of(
                new Hujia(0.01),
                new Fakang(0.01),
                new Gedang(1),
                new Renxing(0.01),
                new Shengji(0.01),
                new ShouHu(1),
                new JingongAdd(1),
                new JinGongMul(0.01),
                new Pojia(0.01),
                new Pofa(0.01),
                new BaoJi(0.01),
                new BaojiXiaoguo(0.01),
                new CoolReduce(0.01),
                new Hp(1),
                new HpMul(0.01, HpMul.xiantainHp),
                new Jump(0.01),
                new Speed(0.01, Speed.xiantianSpeed),
                new SlotWithId("weiTuoTian", 107)
        ));
    }

    private static void allHujiaAtt() {
        attributes.put("tou1", List.of(
                new Hp(4),
                new Hujia(0.05),
                new Speed(0.01, Speed.touSpeed),
                new Jump(0.01),
                new SlotWithId("tou1", 39)
        ));

        attributes.put("xiong1", List.of(
                new Hp(4),
                new Hujia(0.05),
                new Speed(0.01, Speed.xiongSpeed),
                new Jump(0.01),
                new SlotWithId("xiong1", 38)
        ));

        attributes.put("tui1", List.of(
                new Hp(4),
                new Hujia(0.05),
                new Speed(0.01, Speed.tuiSpeed),
                new Jump(0.01),
                new SlotWithId("tui1", 37)
        ));

        attributes.put("xie1", List.of(
                new Hp(4),
                new Hujia(0.05),
                new Speed(0.01, Speed.xieSpeed),
                new Jump(0.01),
                new SlotWithId("xie1", 36)
        ));

        attributes.put("xieSp2", List.of(
                new Gedang(16),
                new SlotWithId("xieSp2", 36)
        ));

        attributes.put("xieSp3", List.of(
                new Gedang(24),
                new SlotWithId("xieSp3", 36)
        ));

        attributes.put("xieSp4", List.of(
                new Gedang(36),
                new HpMul(0.25, HpMul.xieHp),
                new SlotWithId("xieSp4", 36)
        ));

        attributes.put("xieSp5", List.of(
                new Gedang(54),
                new HpMul(0.5, HpMul.xieHp),
                new SlotWithId("xieSp5", 36)
        ));

        attributes.put("xieSp6", List.of(
                new Gedang(-54),
                new HpMul(-0.5, HpMul.xieHp),
                new BaojiXiaoguo(1),
                new SlotWithId("xieSp6", 36)
        ));

        attributes.put("tuiSp2", List.of(
                new Fakang(0.4),
                new SlotWithId("tuiSp2", 37)
        ));

        attributes.put("tuiSp3", List.of(
                new Fakang(0.6),
                new SlotWithId("tuiSp3", 37)
        ));

        attributes.put("tuiSp4", List.of(
                new Fakang(0.8),
                new HpMul(0.25, HpMul.tuiHp),
                new SlotWithId("tuiSp4", 37)
        ));

        attributes.put("tuiSp5", List.of(
                new Fakang(1.0),
                new HpMul(0.5, HpMul.tuiHp),
                new SlotWithId("tuiSp5", 37)
        ));

        attributes.put("tuiSp6", List.of(
                new Fakang(-1.0),
                new HpMul(-0.5, HpMul.tuiHp),
                new Pofa(1.5),
                new SlotWithId("tuiSp6", 37)
        ));

        attributes.put("xiongSp2", List.of(
                new Hujia(0.4),
                new SlotWithId("xiongSp2", 38)
        ));

        attributes.put("xiongSp3", List.of(
                new Hujia(0.6),
                new SlotWithId("xiongSp3", 38)
        ));

        attributes.put("xiongSp4", List.of(
                new Hujia(0.8),
                new HpMul(0.25, HpMul.xiongHp),
                new SlotWithId("xiongSp4", 38)
        ));

        attributes.put("xiongSp5", List.of(
                new Hujia(1.0),
                new HpMul(0.5, HpMul.xiongHp),
                new SlotWithId("xiongSp5", 38)
        ));

        attributes.put("xiongSp6", List.of(
                new Hujia(-1.0),
                new HpMul(-0.5, HpMul.xiongHp),
                new Pojia(1.5),
                new SlotWithId("xiongSp6", 38)
        ));

        attributes.put("touSp2", List.of(
                new Hp(32),
                new SlotWithId("touSp2", 39)
        ));

        attributes.put("touSp3", List.of(
                new Hp(64),
                new SlotWithId("touSp3", 39)
        ));

        attributes.put("touSp4", List.of(
                new Hp(128),
                new HpMul(0.25, HpMul.touHp),
                new SlotWithId("touSp4", 39)
        ));

        attributes.put("touSp5", List.of(
                new Hp(256),
                new HpMul(0.5, HpMul.touHp),
                new SlotWithId("touSp5", 39)
        ));

        attributes.put("touSp6", List.of(
                new Hp(-256),
                new HpMul(-0.5, HpMul.touHp),
                new JingongAdd(60),
                new JinGongMul(0.75),
                new SlotWithId("touSp6", 39)
        ));

    }

    private static void gongHujiaAtt() {
        attributes.put("gongTou2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Speed(0.04, Speed.touSpeed),
                new Jump(0.02),
                new SlotWithId("gongTou2", 39)
        ));

        attributes.put("gongXiong2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Speed(0.04, Speed.xiongSpeed),
                new Jump(0.02),
                new SlotWithId("gongXiong2", 38)
        ));

        attributes.put("gongTui2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Speed(0.04, Speed.tuiSpeed),
                new Jump(0.02),
                new SlotWithId("gongTui2", 37)
        ));

        attributes.put("gongXie2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Speed(0.04, Speed.xieSpeed),
                new Jump(0.02),
                new SlotWithId("gongXie2", 36)
        ));

        attributes.put("gongTou3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Speed(0.06, Speed.touSpeed),
                new Jump(0.03),
                new SlotWithId("gongTou3", 39)
        ));

        attributes.put("gongXiong3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Speed(0.06, Speed.xiongSpeed),
                new Jump(0.03),
                new SlotWithId("gongXiong3", 38)
        ));

        attributes.put("gongTui3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Speed(0.06, Speed.tuiSpeed),
                new Jump(0.03),
                new SlotWithId("gongTui3", 37)
        ));

        attributes.put("gongXie3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Speed(0.06, Speed.xieSpeed),
                new Jump(0.03),
                new SlotWithId("gongXie3", 36)
        ));

        attributes.put("gongTou4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.touHp),
                new Hujia(0.2),
                new ArrowAdd(2),
                new Speed(0.08, Speed.touSpeed),
                new Jump(0.04),
                new SlotWithId("gongTou4", 39)
        ));

        attributes.put("gongXiong4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.xiongHp),
                new Hujia(0.2),
                new ArrowAdd(2),
                new Speed(0.08, Speed.xiongSpeed),
                new Jump(0.04),
                new SlotWithId("gongXiong4", 38)
        ));

        attributes.put("gongTui4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.tuiHp),
                new Hujia(0.2),
                new ArrowAdd(2),
                new Speed(0.08, Speed.tuiSpeed),
                new Jump(0.04),
                new SlotWithId("gongTui4", 37)
        ));

        attributes.put("gongXie4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.xieHp),
                new Hujia(0.2),
                new ArrowAdd(2),
                new Speed(0.08, Speed.xieSpeed),
                new Jump(0.04),
                new SlotWithId("gongXie4", 36)
        ));


        attributes.put("gongTou5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.touHp),
                new Hujia(0.25),
                new ArrowAdd(4),
                new Speed(0.1, Speed.touSpeed),
                new Jump(0.05),
                new SlotWithId("gongTou5", 39)
        ));

        attributes.put("gongXiong5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.xiongHp),
                new Hujia(0.25),
                new ArrowAdd(4),
                new Speed(0.1, Speed.xiongSpeed),
                new Jump(0.05),
                new SlotWithId("gongXiong5", 38)
        ));

        attributes.put("gongTui5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.tuiHp),
                new Hujia(0.25),
                new ArrowAdd(4),
                new Speed(0.1, Speed.tuiSpeed),
                new Jump(0.05),
                new SlotWithId("gongTui5", 37)
        ));

        attributes.put("gongXie5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.xieHp),
                new Hujia(0.25),
                new ArrowAdd(4),
                new Speed(0.1, Speed.xieSpeed),
                new Jump(0.05),
                new SlotWithId("gongXie5", 36)
        ));

        attributes.put("gongTou6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.touHp),
                new Hujia(0.3),
                new DingLi(0.05),
                new ArrowAdd(8),
                new ArrowMul(0.1),
                new Speed(0.12, Speed.touSpeed),
                new Jump(0.06),
                new SlotWithId("gongTou6", 39)
        ));

        attributes.put("gongXiong6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.xiongHp),
                new Hujia(0.3),
                new DingLi(0.05),
                new ArrowAdd(8),
                new ArrowMul(0.1),
                new Speed(0.12, Speed.xiongSpeed),
                new Jump(0.06),
                new SlotWithId("gongXiong6", 38)
        ));

        attributes.put("gongTui6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.tuiHp),
                new Hujia(0.3),
                new DingLi(0.05),
                new ArrowAdd(8),
                new ArrowMul(0.1),
                new Speed(0.12, Speed.tuiSpeed),
                new Jump(0.06),
                new SlotWithId("gongTui6", 37)
        ));

        attributes.put("gongXie6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.xieHp),
                new Hujia(0.3),
                new DingLi(0.05),
                new ArrowAdd(8),
                new ArrowMul(0.1),
                new Speed(0.12, Speed.xieSpeed),
                new Jump(0.06),
                new SlotWithId("gongXie6", 36)
        ));
    }

    private static void zhanHujiaAtt() {
        attributes.put("zhanTou2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Fakang(0.1),
                new Gedang(4),
                new Speed(0.02, Speed.touSpeed),
                new Jump(0.02),
                new SlotWithId("zhanTou2", 39)
        ));

        attributes.put("zhanXiong2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Fakang(0.1),
                new Gedang(4),
                new Speed(0.02, Speed.xiongSpeed),
                new Jump(0.02),
                new SlotWithId("zhanXiong2", 38)
        ));

        attributes.put("zhanTui2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Fakang(0.1),
                new Gedang(4),
                new Speed(0.02, Speed.tuiSpeed),
                new Jump(0.02),
                new SlotWithId("zhanTui2", 37)
        ));

        attributes.put("zhanXie2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new Fakang(0.1),
                new Gedang(4),
                new Speed(0.02, Speed.xieSpeed),
                new Jump(0.02),
                new SlotWithId("zhanXie2", 36)
        ));

        attributes.put("zhanTou3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Fakang(0.15),
                new Gedang(6),
                new Speed(0.03, Speed.touSpeed),
                new Jump(0.03),
                new SlotWithId("zhanTou3", 39)
        ));

        attributes.put("zhanXiong3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Fakang(0.15),
                new Gedang(6),
                new Speed(0.03, Speed.xiongSpeed),
                new Jump(0.03),
                new SlotWithId("zhanXiong3", 38)
        ));

        attributes.put("zhanTui3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Fakang(0.15),
                new Gedang(6),
                new Speed(0.03, Speed.tuiSpeed),
                new Jump(0.03),
                new SlotWithId("zhanTui3", 37)
        ));

        attributes.put("zhanXie3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new Fakang(0.15),
                new Gedang(6),
                new Speed(0.03, Speed.xieSpeed),
                new Jump(0.03),
                new SlotWithId("zhanXie3", 36)
        ));

        attributes.put("zhanTou4", List.of(
                new Hp(32),
                new HpMul(0.1, HpMul.touHp),
                new Hujia(0.2),
                new Fakang(0.2),
                new Gedang(9),
                new AttackAdd(6),
                new Speed(0.04, Speed.touSpeed),
                new Jump(0.04),
                new SlotWithId("zhanTou4", 39)
        ));

        attributes.put("zhanXiong4", List.of(
                new Hp(32),
                new HpMul(0.1, HpMul.xiongHp),
                new Hujia(0.2),
                new Fakang(0.2),
                new Gedang(9),
                new AttackAdd(6),
                new Speed(0.04, Speed.xiongSpeed),
                new Jump(0.04),
                new SlotWithId("zhanXiong4", 38)
        ));

        attributes.put("zhanTui4", List.of(
                new Hp(32),
                new HpMul(0.1, HpMul.tuiHp),
                new Hujia(0.2),
                new Fakang(0.2),
                new Gedang(9),
                new AttackAdd(6),
                new Speed(0.04, Speed.tuiSpeed),
                new Jump(0.04),
                new SlotWithId("zhanTui4", 37)
        ));

        attributes.put("zhanXie4", List.of(
                new Hp(32),
                new HpMul(0.1, HpMul.xieHp),
                new Hujia(0.2),
                new Fakang(0.2),
                new Gedang(9),
                new AttackAdd(6),
                new Speed(0.04, Speed.xieSpeed),
                new Jump(0.04),
                new SlotWithId("zhanXie4", 36)
        ));

        attributes.put("zhanTou5", List.of(
                new Hp(64),
                new HpMul(0.2, HpMul.touHp),
                new Hujia(0.25),
                new Fakang(0.25),
                new Gedang(13.5),
                new AttackAdd(12),
                new Speed(0.05, Speed.touSpeed),
                new Jump(0.05),
                new SlotWithId("zhanTou5", 39)
        ));

        attributes.put("zhanXiong5", List.of(
                new Hp(64),
                new HpMul(0.2, HpMul.xiongHp),
                new Hujia(0.25),
                new Fakang(0.25),
                new Gedang(13.5),
                new AttackAdd(12),
                new Speed(0.05, Speed.xiongSpeed),
                new Jump(0.05),
                new SlotWithId("zhanXiong5", 38)
        ));

        attributes.put("zhanTui5", List.of(
                new Hp(64),
                new HpMul(0.2, HpMul.tuiHp),
                new Hujia(0.25),
                new Fakang(0.25),
                new Gedang(13.5),
                new AttackAdd(12),
                new Speed(0.05, Speed.tuiSpeed),
                new Jump(0.05),
                new SlotWithId("zhanTui5", 37)
        ));

        attributes.put("zhanXie5", List.of(
                new Hp(64),
                new HpMul(0.2, HpMul.xieHp),
                new Hujia(0.25),
                new Fakang(0.25),
                new Gedang(13.5),
                new AttackAdd(12),
                new Speed(0.05, Speed.xieSpeed),
                new Jump(0.05),
                new SlotWithId("zhanXie5", 36)
        ));

        attributes.put("zhanTou6", List.of(
                new Hp(128),
                new HpMul(0.3, HpMul.touHp),
                new Hujia(0.3),
                new Fakang(0.3),
                new Gedang(27),
                new DingLi(0.05),
                new AttackAdd(24),
                new AttackMul(0.1),
                new Speed(0.06, Speed.touSpeed),
                new Jump(0.06),
                new SlotWithId("zhanTou6", 39)
        ));

        attributes.put("zhanXiong6", List.of(
                new Hp(128),
                new HpMul(0.3, HpMul.xiongHp),
                new Hujia(0.3),
                new Fakang(0.3),
                new Gedang(27),
                new DingLi(0.05),
                new AttackAdd(24),
                new AttackMul(0.1),
                new Speed(0.06, Speed.xiongSpeed),
                new Jump(0.06),
                new SlotWithId("zhanXiong6", 38)
        ));

        attributes.put("zhanTui6", List.of(
                new Hp(128),
                new HpMul(0.3, HpMul.tuiHp),
                new Hujia(0.3),
                new Fakang(0.3),
                new Gedang(27),
                new DingLi(0.05),
                new AttackAdd(24),
                new AttackMul(0.1),
                new Speed(0.06, Speed.tuiSpeed),
                new Jump(0.06),
                new SlotWithId("zhanTui6", 37)
        ));

        attributes.put("zhanXie6", List.of(
                new Hp(128),
                new HpMul(0.3, HpMul.xieHp),
                new Hujia(0.3),
                new Fakang(0.3),
                new Gedang(27),
                new DingLi(0.05),
                new AttackAdd(24),
                new AttackMul(0.1),
                new Speed(0.06, Speed.xieSpeed),
                new Jump(0.06),
                new SlotWithId("zhanXie6", 36)
        ));
    }

    private static void danHujiaAtt() {
        attributes.put("danTou2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new CoolReduce(0.01),
                new Shengji(0.02),
                new Speed(0.02, Speed.touSpeed),
                new Jump(0.02),
                new SlotWithId("danTou2", 39)
        ));

        attributes.put("danXiong2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new CoolReduce(0.01),
                new Shengji(0.02),
                new Speed(0.02, Speed.xiongSpeed),
                new Jump(0.02),
                new SlotWithId("danXiong2", 38)
        ));

        attributes.put("danTui2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new CoolReduce(0.01),
                new Shengji(0.02),
                new Speed(0.02, Speed.tuiSpeed),
                new Jump(0.02),
                new SlotWithId("danTui2", 37)
        ));

        attributes.put("danXie2", List.of(
                new Hp(8),
                new Hujia(0.1),
                new CoolReduce(0.01),
                new Shengji(0.02),
                new Speed(0.02, Speed.xieSpeed),
                new Jump(0.02),
                new SlotWithId("danXie2", 36)
        ));

        attributes.put("danTou3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new CoolReduce(0.02),
                new Shengji(0.04),
                new Speed(0.03, Speed.touSpeed),
                new Jump(0.03),
                new SlotWithId("danTou3", 39)
        ));

        attributes.put("danXiong3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new CoolReduce(0.02),
                new Shengji(0.04),
                new Speed(0.03, Speed.xiongSpeed),
                new Jump(0.03),
                new SlotWithId("danXiong3", 38)
        ));

        attributes.put("danTui3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new CoolReduce(0.02),
                new Shengji(0.04),
                new Speed(0.03, Speed.tuiSpeed),
                new Jump(0.03),
                new SlotWithId("danTui3", 37)
        ));

        attributes.put("danXie3", List.of(
                new Hp(16),
                new Hujia(0.15),
                new CoolReduce(0.02),
                new Shengji(0.04),
                new Speed(0.03, Speed.xieSpeed),
                new Jump(0.03),
                new SlotWithId("danXie3", 36)
        ));

        attributes.put("danTou4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.touHp),
                new Hujia(0.2),
                new CoolReduce(0.03),
                new Shengji(0.06),
                new ZhenfaAdd(2),
                new Speed(0.04, Speed.touSpeed),
                new Jump(0.04),
                new SlotWithId("danTou4", 39)
        ));

        attributes.put("danXiong4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.xiongHp),
                new Hujia(0.2),
                new CoolReduce(0.03),
                new Shengji(0.06),
                new ZhenfaAdd(2),
                new Speed(0.04, Speed.xiongSpeed),
                new Jump(0.04),
                new SlotWithId("danXiong4", 38)
        ));

        attributes.put("danTui4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.tuiHp),
                new Hujia(0.2),
                new CoolReduce(0.03),
                new Shengji(0.06),
                new ZhenfaAdd(2),
                new Speed(0.04, Speed.tuiSpeed),
                new Jump(0.04),
                new SlotWithId("danTui4", 37)
        ));

        attributes.put("danXie4", List.of(
                new Hp(32),
                new HpMul(0.05, HpMul.xieHp),
                new Hujia(0.2),
                new CoolReduce(0.03),
                new Shengji(0.06),
                new ZhenfaAdd(2),
                new Speed(0.04, Speed.xieSpeed),
                new Jump(0.04),
                new SlotWithId("danXie4", 36)
        ));

        attributes.put("danTou5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.touHp),
                new Hujia(0.25),
                new CoolReduce(0.04),
                new Shengji(0.08),
                new ZhenfaAdd(4),
                new Speed(0.05, Speed.touSpeed),
                new Jump(0.05),
                new SlotWithId("danTou5", 39)
        ));

        attributes.put("danXiong5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.xiongHp),
                new Hujia(0.25),
                new CoolReduce(0.04),
                new Shengji(0.08),
                new ZhenfaAdd(4),
                new Speed(0.05, Speed.xiongSpeed),
                new Jump(0.05),
                new SlotWithId("danXiong5", 38)
        ));

        attributes.put("danTui5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.tuiHp),
                new Hujia(0.25),
                new CoolReduce(0.04),
                new Shengji(0.08),
                new ZhenfaAdd(4),
                new Speed(0.05, Speed.tuiSpeed),
                new Jump(0.05),
                new SlotWithId("danTui5", 37)
        ));

        attributes.put("danXie5", List.of(
                new Hp(64),
                new HpMul(0.1, HpMul.xieHp),
                new Hujia(0.25),
                new CoolReduce(0.04),
                new Shengji(0.08),
                new ZhenfaAdd(4),
                new Speed(0.05, Speed.xieSpeed),
                new Jump(0.05),
                new SlotWithId("danXie5", 36)
        ));

        attributes.put("danTou6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.touHp),
                new Hujia(0.3),
                new CoolReduce(0.05),
                new Shengji(0.1),
                new DingLi(0.05),
                new ZhenfaAdd(8),
                new ZhenfaMul(0.1),
                new Speed(0.06, Speed.touSpeed),
                new Jump(0.06),
                new SlotWithId("danTou6", 39)
        ));

        attributes.put("danXiong6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.xiongHp),
                new Hujia(0.3),
                new CoolReduce(0.05),
                new Shengji(0.1),
                new DingLi(0.05),
                new ZhenfaAdd(8),
                new ZhenfaMul(0.1),
                new Speed(0.06, Speed.xiongSpeed),
                new Jump(0.06),
                new SlotWithId("danXiong6", 38)
        ));

        attributes.put("danTui6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.tuiHp),
                new Hujia(0.3),
                new CoolReduce(0.05),
                new Shengji(0.1),
                new DingLi(0.05),
                new ZhenfaAdd(8),
                new ZhenfaMul(0.1),
                new Speed(0.06, Speed.tuiSpeed),
                new Jump(0.06),
                new SlotWithId("danTui6", 37)
        ));

        attributes.put("danXie6", List.of(
                new Hp(128),
                new HpMul(0.15, HpMul.xieHp),
                new Hujia(0.3),
                new CoolReduce(0.05),
                new Shengji(0.1),
                new DingLi(0.05),
                new ZhenfaAdd(8),
                new ZhenfaMul(0.1),
                new Speed(0.06, Speed.xieSpeed),
                new Jump(0.06),
                new SlotWithId("danXie6", 36)
        ));
    }

    public static List<Component> fromId(String id, int numPerLine) {
        List<MyAttribute> myAttributes = attributes.get(id);
        int stringListSize = myAttributes.size() - 1;

        List<String> transformedList = new ArrayList<>(stringListSize);

        for (int i = 0; i < stringListSize; i++) {
            String s = myAttributes.get(i).fromId();
            if (s == null) {
                continue;
            }
            transformedList.add(s);
        }

        List<Component> componentList = new ArrayList<>();
        int sizeFinal = transformedList.size();

        StringBuilder combinedString = new StringBuilder();
        for (int i = 0; i < sizeFinal; i++) {
            combinedString.append(transformedList.get(i));

            if ((i + 1) % numPerLine == 0 || i == transformedList.size() - 1) {
                componentList.add(Component.text(combinedString.toString()));
                combinedString.setLength(0);
            }
        }

        return componentList;

    }


}
