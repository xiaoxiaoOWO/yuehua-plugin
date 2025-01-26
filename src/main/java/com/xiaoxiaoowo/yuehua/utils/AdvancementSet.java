package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.apache.commons.lang3.tuple.Pair;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashMap;
import java.util.Map;

public final class AdvancementSet {
    public static final HashMap<String, Advancement> idToAdvancements = new HashMap<>();
    public static final HashMap<String, Integer> idToPoints = new HashMap<>();

    public static final Map<String, Advancement> qkdAdv = new HashMap<>();
    public static final Map<Integer, Advancement> chonghuaAchievements = new HashMap<>();
    public static final Map<Integer,Advancement> maintaskAchievements = new HashMap<>();

    public static final Advancement huancheng1 = Bukkit.getAdvancement(new NamespacedKey("yuehua","all/huancheng/huancheng1"));
    public static final Advancement huancheng2 = Bukkit.getAdvancement(new NamespacedKey("yuehua","all/huancheng/huancheng2"));
    public static final Advancement huancheng3 = Bukkit.getAdvancement(new NamespacedKey("yuehua","all/huancheng/huancheng3"));

    public static final Advancement killRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/root"));
    public static final Advancement killRoot2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/root2"));
    public static final Advancement killRoot3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/root3"));
    public static final Advancement killRoot4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/root4"));
    public static final Advancement killRoot5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/root5"));

    public static final Advancement allRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/root"));
    public static final Advancement zhanRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/root"));
    public static final Advancement gongRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/root"));
    public static final Advancement danRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/root"));
    public static final Advancement fubenRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/root"));

    public static final Advancement gumu1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/gumu1"));
    public static final Advancement gumu2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/gumu2"));
    public static final Advancement gumu3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/gumu3"));
    public static final Advancement gumu4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/gumu4"));

    public static final Advancement huomo1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/huomo1"));
    public static final Advancement huomo2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/huomo2"));
    public static final Advancement huomo3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/huomo3"));
    public static final Advancement huomo4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/huomo4"));

    public static final Advancement zhengta1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/zhengta1"));
    public static final Advancement zhengta2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/zhengta2"));
    public static final Advancement zhengta3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/zhengta3"));
    public static final Advancement zhengta4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/zhengta4"));

    public static final Advancement guiou1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/guiou1"));
    public static final Advancement guiou2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/guiou2"));
    public static final Advancement guiou3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/guiou3"));
    public static final Advancement guiou4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/guiou4"));

    public static final Advancement kugu1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/kugu1"));
    public static final Advancement kugu2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/kugu2"));
    public static final Advancement kugu3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/kugu3"));
    public static final Advancement kugu4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/kugu4"));

    public static final Advancement shengshan1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/shengshan1"));
    public static final Advancement shengshan2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/shengshan2"));
    public static final Advancement shengshan3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/shengshan3"));
    public static final Advancement shengshan4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/level6/shengshan4"));

    // Chonghua advancements
    public static final Advancement chonghua2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua2"));
    public static final Advancement chonghua3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua3"));
    public static final Advancement chonghua4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua4"));
    public static final Advancement chonghua5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua5"));
    public static final Advancement chonghua6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua6"));
    public static final Advancement chonghua7 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua7"));
    public static final Advancement chonghua8 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua8"));
    public static final Advancement chonghua9 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua9"));
    public static final Advancement chonghua10 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua10"));
    public static final Advancement chonghua11 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/chonghua/chonghua11"));

    public static final Advancement shipinbar1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao1"));
    public static final Advancement shipinbar2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao2"));
    public static final Advancement shipinbar3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao3"));
    public static final Advancement shipinbar4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao4"));
    public static final Advancement shipinbar5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao5"));
    public static final Advancement shipinbar6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao6"));
    public static final Advancement shipinbar7 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao7"));
    public static final Advancement shipinbar8 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipinbar/shipincao8"));

    public static final Advancement maintask1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/maintask/task1"));
    public static final Advancement maintask2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/maintask/task2"));
    public static final Advancement maintask3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/maintask/task3"));
    public static final Advancement maintask4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/maintask/task4"));
    public static final Advancement maintask5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/maintask/task5"));


    public static final Advancement xp_10 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_10"));
    public static final Advancement xp_20 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_20"));
    public static final Advancement xp_30 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_30"));
    public static final Advancement xp_40 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_40"));
    public static final Advancement xp_50 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_50"));
    public static final Advancement xp_60 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_60"));
    public static final Advancement xp_70 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_70"));
    public static final Advancement xp_80 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_80"));
    public static final Advancement xp_90 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_90"));
    public static final Advancement xp_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_100"));
    public static final Advancement xp_110 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_110"));
    public static final Advancement xp_120 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_120"));
    public static final Advancement xp_130 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_130"));
    public static final Advancement xp_140 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_140"));
    public static final Advancement xp_150 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_150"));
    public static final Advancement xp_160 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_160"));
    public static final Advancement xp_170 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_170"));
    public static final Advancement xp_180 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_180"));
    public static final Advancement xp_190 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_190"));
    public static final Advancement xp_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_200"));
    public static final Advancement xp_210 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_210"));
    public static final Advancement xp_220 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_220"));
    public static final Advancement xp_230 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_230"));
    public static final Advancement xp_240 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_240"));
    public static final Advancement xp_250 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_250"));
    public static final Advancement xp_260 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_260"));
    public static final Advancement xp_270 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_270"));
    public static final Advancement xp_280 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_280"));
    public static final Advancement xp_290 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_290"));
    public static final Advancement xp_300 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_300"));
//    public static final Advancement xp_310 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_310"));
//    public static final Advancement xp_320 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_320"));
//    public static final Advancement xp_330 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_330"));
//    public static final Advancement xp_340 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_340"));
//    public static final Advancement xp_350 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_350"));
//    public static final Advancement xp_360 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_360"));
//    public static final Advancement xp_370 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_370"));
//    public static final Advancement xp_380 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_380"));
//    public static final Advancement xp_390 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_390"));
//    public static final Advancement xp_400 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_400"));
//    public static final Advancement xp_410 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_410"));
//    public static final Advancement xp_420 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_420"));
//    public static final Advancement xp_430 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_430"));
//    public static final Advancement xp_440 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_440"));
//    public static final Advancement xp_450 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_450"));
//    public static final Advancement xp_460 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_460"));
//    public static final Advancement xp_470 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_470"));
//    public static final Advancement xp_480 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_480"));
//    public static final Advancement xp_490 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_490"));
//    public static final Advancement xp_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/level/xp_500"));


    public static final Advancement eastjiangshi_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi_100"));
    public static final Advancement eastjiangshi_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi_200"));
    public static final Advancement eastjiangshi_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi_500"));
    public static final Advancement eastjiangshi_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi_1000"));
    public static final Advancement eastjiangshi_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi_2000"));
    public static final Advancement eastjiangshi_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi_5000"));

    public static final Advancement eastkulou_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou_100"));
    public static final Advancement eastkulou_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou_200"));
    public static final Advancement eastkulou_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou_500"));
    public static final Advancement eastkulou_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou_1000"));
    public static final Advancement eastkulou_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou_2000"));
    public static final Advancement eastkulou_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou_5000"));

    public static final Advancement eastzhizhu_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu_100"));
    public static final Advancement eastzhizhu_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu_200"));
    public static final Advancement eastzhizhu_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu_500"));
    public static final Advancement eastzhizhu_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu_1000"));
    public static final Advancement eastzhizhu_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu_2000"));
    public static final Advancement eastzhizhu_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu_5000"));

    public static final Advancement eastdufeng_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng_100"));
    public static final Advancement eastdufeng_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng_200"));
    public static final Advancement eastdufeng_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng_500"));
    public static final Advancement eastdufeng_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng_1000"));
    public static final Advancement eastdufeng_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng_2000"));
    public static final Advancement eastdufeng_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng_5000"));

    public static final Advancement eastjiangshijinyin_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin_100"));
    public static final Advancement eastjiangshijinyin_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin_200"));
    public static final Advancement eastjiangshijinyin_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin_500"));
    public static final Advancement eastjiangshijinyin_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin_1000"));
    public static final Advancement eastjiangshijinyin_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin_2000"));
    public static final Advancement eastjiangshijinyin_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin_5000"));

    public static final Advancement eastkugugongjianshou_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou_100"));
    public static final Advancement eastkugugongjianshou_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou_200"));
    public static final Advancement eastkugugongjianshou_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou_500"));
    public static final Advancement eastkugugongjianshou_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou_1000"));
    public static final Advancement eastkugugongjianshou_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou_2000"));
    public static final Advancement eastkugugongjianshou_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou_5000"));

    public static final Advancement eastzhizhujinyin_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin_100"));
    public static final Advancement eastzhizhujinyin_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin_200"));
    public static final Advancement eastzhizhujinyin_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin_500"));
    public static final Advancement eastzhizhujinyin_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin_1000"));
    public static final Advancement eastzhizhujinyin_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin_2000"));
    public static final Advancement eastzhizhujinyin_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin_5000"));

    public static final Advancement shanshenshooter_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenshooter_100"));
    public static final Advancement shanshenshooter_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenshooter_200"));
    public static final Advancement shanshenshooter_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenshooter_500"));
    public static final Advancement shanshenshooter_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenshooter_1000"));
    public static final Advancement shanshenshooter_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenshooter_2000"));
    public static final Advancement shanshenshooter_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenshooter_5000"));

    public static final Advancement shanshenspider_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenspider_100"));
    public static final Advancement shanshenspider_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenspider_200"));
    public static final Advancement shanshenspider_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenspider_500"));
    public static final Advancement shanshenspider_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenspider_1000"));
    public static final Advancement shanshenspider_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenspider_2000"));
    public static final Advancement shanshenspider_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenspider_5000"));

    public static final Advancement shanshenzombie_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenzombie_100"));
    public static final Advancement shanshenzombie_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenzombie_200"));
    public static final Advancement shanshenzombie_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenzombie_500"));
    public static final Advancement shanshenzombie_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenzombie_1000"));
    public static final Advancement shanshenzombie_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenzombie_2000"));
    public static final Advancement shanshenzombie_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/shanshenzombie_5000"));

    public static final Advancement yaojindufeng_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojindufeng_100"));
    public static final Advancement yaojindufeng_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojindufeng_200"));
    public static final Advancement yaojindufeng_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojindufeng_500"));
    public static final Advancement yaojindufeng_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojindufeng_1000"));
    public static final Advancement yaojindufeng_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojindufeng_2000"));
    public static final Advancement yaojindufeng_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojindufeng_5000"));

    public static final Advancement yaojingpanda_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojingpanda_100"));
    public static final Advancement yaojingpanda_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojingpanda_200"));
    public static final Advancement yaojingpanda_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojingpanda_500"));
    public static final Advancement yaojingpanda_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojingpanda_1000"));
    public static final Advancement yaojingpanda_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojingpanda_2000"));
    public static final Advancement yaojingpanda_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojingpanda_5000"));

    public static final Advancement yaojinshooter_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojinshooter_100"));
    public static final Advancement yaojinshooter_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojinshooter_200"));
    public static final Advancement yaojinshooter_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojinshooter_500"));
    public static final Advancement yaojinshooter_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojinshooter_1000"));
    public static final Advancement yaojinshooter_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojinshooter_2000"));
    public static final Advancement yaojinshooter_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/yaojinshooter_5000"));

    public static final Advancement jianxiguimei_10 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/jianxiguimei_10"));
    public static final Advancement jianxiguimei_20 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/jianxiguimei_20"));
    public static final Advancement jianxiguimei_50 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/jianxiguimei_50"));
    public static final Advancement jianxiguimei_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/jianxiguimei_100"));
    public static final Advancement jianxiguimei_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/jianxiguimei_200"));
    public static final Advancement jianxiguimei_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/jianxiguimei_500"));

    public static final Advancement linyouduzhu_10 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/linyouduzhu_10"));
    public static final Advancement linyouduzhu_20 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/linyouduzhu_20"));
    public static final Advancement linyouduzhu_50 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/linyouduzhu_50"));
    public static final Advancement linyouduzhu_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/linyouduzhu_100"));
    public static final Advancement linyouduzhu_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/linyouduzhu_200"));
    public static final Advancement linyouduzhu_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/linyouduzhu_500"));

    public static final Advancement zhizhunvwang_10 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/zhizhunvwang_10"));
    public static final Advancement zhizhunvwang_20 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/zhizhunvwang_20"));
    public static final Advancement zhizhunvwang_50 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/zhizhunvwang_50"));
    public static final Advancement zhizhunvwang_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/zhizhunvwang_100"));
    public static final Advancement zhizhunvwang_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/zhizhunvwang_200"));
    public static final Advancement zhizhunvwang_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/zhizhunvwang_500"));

    public static final Advancement kaishandao = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/kaishandao"));
    public static final Advancement jutongzhanchui = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/jutongzhanchui"));
    public static final Advancement pokongfu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/pokongfu"));
    public static final Advancement sanbaoyuruyi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/sanbaoyuruyi"));
    public static final Advancement xuanyuan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/xuanyuan"));

    public static final Advancement qintongjian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/qintongjian"));
    public static final Advancement chitongjian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/chitongjian"));
    public static final Advancement taijijian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/taijijian"));
    public static final Advancement kunlunfeixianjian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/kunlunfeixianjian"));
    public static final Advancement taie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/taie"));

    public static final Advancement yinyueqiang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/yinyueqiang"));
    public static final Advancement hongyingqiang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/hongyingqiang"));
    public static final Advancement youlongqiang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/youlongqiang"));
    public static final Advancement hutouzhanjinqiang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/hutouzhanjinqiang"));
    public static final Advancement ruyijingubang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/weapon/ruyijingubang"));

    public static final Advancement qintonggong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/qintonggong"));
    public static final Advancement yantiegong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/yantiegong"));
    public static final Advancement zhongchuigong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/zhongchuigong"));
    public static final Advancement beidoumiechengong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/beidoumiechengong"));
    public static final Advancement zhuri = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/zhuri"));

    public static final Advancement heitienu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/heitienu"));
    public static final Advancement honglinnu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/honglinnu"));
    public static final Advancement jiaolongnu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/jiaolongnu"));
    public static final Advancement riyueliuxingnu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/riyueliuxingnu"));
    public static final Advancement liangyi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/liangyi"));

    public static final Advancement furonggong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/furonggong"));
    public static final Advancement hongluangong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/hongluangong"));
    public static final Advancement tianqionggong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/tianqionggong"));
    public static final Advancement shetianzhuiyuegong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/shetianzhuiyuegong"));
    public static final Advancement liuguang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/weapon/liuguang"));

    public static final Advancement qintongguo = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/weapon/qintongguo"));
    public static final Advancement liandanlu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/weapon/liandanlu"));
    public static final Advancement suohunlu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/weapon/suohunlu"));
    public static final Advancement qishading = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/weapon/qishading"));
    public static final Advancement hunyuanshending = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/weapon/hunyuanshending"));

    public static final Advancement xinbindunpai = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/yiqi/xinbindunpai"));
    public static final Advancement jinruidunpai = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/yiqi/jinruidunpai"));
    public static final Advancement chiseyuehuo = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/yiqi/chiseyuehuo"));
    public static final Advancement jingangbuhuai = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/yiqi/jingangbuhuai"));
    public static final Advancement chenbinluoxue = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/yiqi/chenbinluoxue"));

    public static final Advancement xinbinjiandai = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/yiqi/xinbinjiandai"));
    public static final Advancement jinruijiandai = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/yiqi/jinruijiandai"));
    public static final Advancement yingyanjiandai = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/yiqi/yingyanjiandai"));
    public static final Advancement cangguningwang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/yiqi/cangguningwang"));
    public static final Advancement niepanyunang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/yiqi/niepanyunang"));

    public static final Advancement tiezhiduanbi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/yiqi/tiezhiduanbi"));
    public static final Advancement huiyidao = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/yiqi/huiyidao"));
    public static final Advancement longyadao = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/yiqi/longyadao"));
    public static final Advancement zhangqicuizhu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/yiqi/zhangqicuizhu"));
    public static final Advancement minghong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/yiqi/minghong"));

    public static final Advancement tousp2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tousp2"));
    public static final Advancement tousp3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tousp3"));
    public static final Advancement tousp4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tousp4"));
    public static final Advancement tousp5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tousp5"));
    public static final Advancement tousp6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tousp6"));

    public static final Advancement zhantou2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantou2"));
    public static final Advancement zhantou3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantou3"));
    public static final Advancement zhantou4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantou4"));
    public static final Advancement zhantou5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantou5"));
    public static final Advancement zhantou6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantou6"));

    public static final Advancement gongtou2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtou2"));
    public static final Advancement gongtou3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtou3"));
    public static final Advancement gongtou4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtou4"));
    public static final Advancement gongtou5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtou5"));
    public static final Advancement gongtou6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtou6"));

    public static final Advancement dantou2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantou2"));
    public static final Advancement dantou3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantou3"));
    public static final Advancement dantou4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantou4"));
    public static final Advancement dantou5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantou5"));
    public static final Advancement dantou6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantou6"));

    // 通用胸甲
    public static final Advancement xiongsp2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiongsp2"));
    public static final Advancement xiongsp3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiongsp3"));
    public static final Advancement xiongsp4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiongsp4"));
    public static final Advancement xiongsp5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiongsp5"));
    public static final Advancement xiongsp6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiongsp6"));

    // 战士胸甲
    public static final Advancement zhanxiong2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxiong2"));
    public static final Advancement zhanxiong3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxiong3"));
    public static final Advancement zhanxiong4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxiong4"));
    public static final Advancement zhanxiong5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxiong5"));
    public static final Advancement zhanxiong6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxiong6"));

    // 弓箭手胸甲
    public static final Advancement gongxiong2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxiong2"));
    public static final Advancement gongxiong3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxiong3"));
    public static final Advancement gongxiong4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxiong4"));
    public static final Advancement gongxiong5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxiong5"));
    public static final Advancement gongxiong6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxiong6"));

    // 炼丹师胸甲
    public static final Advancement danxiong2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxiong2"));
    public static final Advancement danxiong3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxiong3"));
    public static final Advancement danxiong4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxiong4"));
    public static final Advancement danxiong5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxiong5"));
    public static final Advancement danxiong6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxiong6"));

    // 通用裤子
    public static final Advancement tuiSp2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tuisp2"));
    public static final Advancement tuiSp3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tuisp3"));
    public static final Advancement tuiSp4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tuisp4"));
    public static final Advancement tuiSp5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tuisp5"));
    public static final Advancement tuiSp6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/tuisp6"));

    // 战士裤子
    public static final Advancement zhanTui2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantui2"));
    public static final Advancement zhanTui3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantui3"));
    public static final Advancement zhanTui4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantui4"));
    public static final Advancement zhanTui5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantui5"));
    public static final Advancement zhanTui6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhantui6"));

    // 弓箭手裤子
    public static final Advancement gongTui2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtui2"));
    public static final Advancement gongTui3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtui3"));
    public static final Advancement gongTui4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtui4"));
    public static final Advancement gongTui5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtui5"));
    public static final Advancement gongTui6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongtui6"));

    // 炼丹师裤子
    public static final Advancement danTui2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantui2"));
    public static final Advancement danTui3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantui3"));
    public static final Advancement danTui4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantui4"));
    public static final Advancement danTui5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantui5"));
    public static final Advancement danTui6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/dantui6"));

    // 通用靴子
    public static final Advancement xieSp2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiesp2"));
    public static final Advancement xieSp3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiesp3"));
    public static final Advancement xieSp4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiesp4"));
    public static final Advancement xieSp5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiesp5"));
    public static final Advancement xieSp6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/hujia/xiesp6"));

    // 战士靴子
    public static final Advancement zhanXie2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxie2"));
    public static final Advancement zhanXie3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxie3"));
    public static final Advancement zhanXie4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxie4"));
    public static final Advancement zhanXie5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxie5"));
    public static final Advancement zhanXie6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/hujia/zhanxie6"));

    // 弓箭手靴子
    public static final Advancement gongXie2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxie2"));
    public static final Advancement gongXie3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxie3"));
    public static final Advancement gongXie4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxie4"));
    public static final Advancement gongXie5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxie5"));
    public static final Advancement gongXie6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/hujia/gongxie6"));

    // 炼丹师靴子
    public static final Advancement danXie2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxie2"));
    public static final Advancement danXie3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxie3"));
    public static final Advancement danXie4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxie4"));
    public static final Advancement danXie5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxie5"));
    public static final Advancement danXie6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/hujia/danxie6"));

    // Map2
    public static final Advancement jinRuiFeiRen = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/biweapon/jinruifeiren"));
    public static final Advancement wuShengXiuJian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/biweapon/wushengxiujian"));
    public static final Advancement huiXuanTaiJi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/biweapon/huixuantaji"));
    public static final Advancement wuYinWuZong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/biweapon/wuyinwuzong"));
    public static final Advancement yanWangTie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/biweapon/yanwangtie"));

    // Map3
    public static final Advancement huangTongChong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/biweapon/huangtongchong"));
    public static final Advancement mingYue = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/biweapon/mingyue"));
    public static final Advancement canLan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/biweapon/canlan"));
    public static final Advancement jinJing = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/biweapon/jinjing"));
    public static final Advancement xiaoTian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/biweapon/xiaotian"));

    // Map4
    public static final Advancement qinFengYinYin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/biweapon/qinfengyinyin"));
    public static final Advancement liuShuiChanChan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/biweapon/liushuichanchan"));
    public static final Advancement buQiChunYu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/biweapon/buqichunyu"));
    public static final Advancement sanShengZhenHun = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/biweapon/sanshengzhenhun"));
    public static final Advancement jiuFengLaiYi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/biweapon/jiufenglaiyi"));

    public static final Advancement qinglongshengqi2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/qinglongshengqi2"));
    public static final Advancement qinglongshengqi3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/qinglongshengqi3"));
    public static final Advancement qinglongshengqi4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/qinglongshengqi4"));
    public static final Advancement qinglongshengqi5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/qinglongshengqi5"));
    public static final Advancement qinglongshengqi6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/qinglongshengqi6"));

    public static final Advancement zhuqueshengqi2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhuqueshengqi2"));
    public static final Advancement zhuqueshengqi3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhuqueshengqi3"));
    public static final Advancement zhuqueshengqi4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhuqueshengqi4"));
    public static final Advancement zhuqueshengqi5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhuqueshengqi5"));
    public static final Advancement zhuqueshengqi6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhuqueshengqi6"));

    public static final Advancement baihushengqi2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/baihushengqi2"));
    public static final Advancement baihushengqi3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/baihushengqi3"));
    public static final Advancement baihushengqi4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/baihushengqi4"));
    public static final Advancement baihushengqi5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/baihushengqi5"));
    public static final Advancement baihushengqi6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/baihushengqi6"));

    public static final Advancement xuanwushengqi2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/xuanwushengqi2"));
    public static final Advancement xuanwushengqi3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/xuanwushengqi3"));
    public static final Advancement xuanwushengqi4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/xuanwushengqi4"));
    public static final Advancement xuanwushengqi5 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/xuanwushengqi5"));
    public static final Advancement xuanwushengqi6 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/xuanwushengqi6"));

    public static final Advancement tanyuzhijie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/tanyuzhijie"));
    public static final Advancement tanlandujie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/tanlandujie"));
    public static final Advancement tanlanxiejie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/tanlanxiejie"));
    public static final Advancement tanlanguijie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/tanlanguijie"));
    public static final Advancement tanlanmojie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/tanlanmojie"));
    public static final Advancement tanlanmingjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/tanlanmingjie"));

    public static final Advancement chimizhijie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chimizhijie"));
    public static final Advancement chiyudujie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chiyudujie"));
    public static final Advancement chiyuxiejie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chiyuxiejie"));
    public static final Advancement chiyuguijie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chiyuguijie"));
    public static final Advancement chiyumojie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chiyumojie"));
    public static final Advancement chiyumingjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chiyumingjie"));

    public static final Advancement chennuzhijie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chennuzhijie"));
    public static final Advancement chenhenduji = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chenhenduji"));
    public static final Advancement chenhenxiejie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chenhenxiejie"));
    public static final Advancement chenhenguijie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chenhenguijie"));
    public static final Advancement chenhenmojie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chenhenmojie"));
    public static final Advancement chenhenmingjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chenhenmingjie"));

    public static final Advancement chandingfajie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chandingfajie"));
    public static final Advancement chandingshengjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chandingshengjie"));
    public static final Advancement chandingfojie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chandingfojie"));
    public static final Advancement chandingxianjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chandingxianjie"));
    public static final Advancement chandingshenjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chandingshenjie"));

    public static final Advancement zhihuifajie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhihuifajie"));
    public static final Advancement zhihuishengjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhihuishengjie"));
    public static final Advancement zhihuifojie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhihuifojie"));
    public static final Advancement zhihuixianjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhihuixianjie"));
    public static final Advancement zhihuishenjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/zhihuishenjie"));

    public static final Advancement chijiefajie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chijiefajie"));
    public static final Advancement chijieshengjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chijieshengjie"));
    public static final Advancement chijiefojie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chijiefojie"));
    public static final Advancement chijiexianjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chijiexianjie"));
    public static final Advancement chijieshenjie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shipin/chijieshenjie"));

    public static final Advancement zhaoYaoJin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/zhaoyaojin"));
    public static final Advancement yuFuChen = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/yufuchen"));
    public static final Advancement wuSeBuTianShi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/wusebutianshi"));

    public static final Advancement yaoWangHuLu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/yaowanghulu"));
    public static final Advancement ciXinMiaoLian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/cixinmiaolian"));
    public static final Advancement shenXinYuGu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/shenxinyugu"));
    public static final Advancement yinYangZhanLongJian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/yinyangzhanlongjian"));
    public static final Advancement yunLangBan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/yunlangban"));
    public static final Advancement zhenHunYuXiao = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/zhenhunyuxiao"));
    public static final Advancement diKuiHuaLan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/dikuihualan"));
    public static final Advancement xuanFengZongShan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/fabao/xuanfengzongshan"));

    public static final Advancement jueDouLing = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/juedouling"));
    public static final Advancement leiMingGu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/leiminggu"));
    public static final Advancement huanSiLin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/huansilin"));
    public static final Advancement niuMoNuHou = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/niumonuhou"));
    public static final Advancement douQiShi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/douqishi"));
    public static final Advancement panGuanBi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/panguanbi"));
    public static final Advancement minShengJian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/minshengjian"));
    public static final Advancement zhenLeiTianChui = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/fabao/zhenleitianchui"));

    public static final Advancement diaoHunGan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/diaohungan"));
    public static final Advancement sheLingZhu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/shelingzhu"));
    public static final Advancement yuJinPin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/yujinpin"));
    public static final Advancement tianJiShenJin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/tianjishenjin"));
    public static final Advancement ruiYingYan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/ruiyingyan"));
    public static final Advancement duoHunTang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/duohuntang"));
    public static final Advancement moYuanFoZhu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/moyuanfozhu"));
    public static final Advancement fuXinRuYi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/fabao/fuxinruyi"));

    public static final Advancement lvYeXianZong = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/lvyexianzong"));
    public static final Advancement qingNvHuanShuang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/qingnvhuanshuang"));
    public static final Advancement zhuRongKuYan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/zhurongkuyan"));
    public static final Advancement zhuDianXuanJing = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/zhudianxuanjing"));

    public static final Advancement buHunWang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/buhunwang"));
    public static final Advancement yangShouJian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/yangshoujian"));
    public static final Advancement wuMingMoYinLuo = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/wumingmoyinluo"));
    public static final Advancement sheTianHuaXueLing = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/shetianhuaxueling"));

    public static final Advancement kuYeLing = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/kuyeling"));
    public static final Advancement luoBeiJinPin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/luobeijinpin"));
    public static final Advancement pinYuShuiYu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/pinyushuiyu"));
    public static final Advancement diKongYmoQuan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/dikongymoquan"));

    public static final Advancement luanShenGu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/luanshengu"));
    public static final Advancement jinGuLian = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/jingulian"));
    public static final Advancement jianChangGuLin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/jianchangulin"));
    public static final Advancement moDuoHunFan = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/fabao/moduohunfan"));

    // 成就常量声明
    public static final Advancement shouhu1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shouhu1"));
    public static final Advancement shouhu2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shouhu2"));
    public static final Advancement shouhu3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shouhu3"));
    public static final Advancement shouhu4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shouhu4"));

    public static final Advancement yankai1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yankai1"));
    public static final Advancement yankai2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yankai2"));
    public static final Advancement yankai3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yankai3"));
    public static final Advancement yankai4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yankai4"));

    public static final Advancement luoshi1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/luoshi1"));
    public static final Advancement luoshi2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/luoshi2"));
    public static final Advancement luoshi3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/luoshi3"));
    public static final Advancement luoshi4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/luoshi4"));

    public static final Advancement wanfa1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/wanfa1"));
    public static final Advancement wanfa2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/wanfa2"));
    public static final Advancement wanfa3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/wanfa3"));
    public static final Advancement wanfa4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/wanfa4"));

    public static final Advancement yuti1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yuti1"));
    public static final Advancement yuti2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yuti2"));
    public static final Advancement yuti3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yuti3"));
    public static final Advancement yuti4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/yuti4"));

    public static final Advancement liren1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/liren1"));
    public static final Advancement liren2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/liren2"));
    public static final Advancement liren3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/liren3"));
    public static final Advancement liren4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/liren4"));

    public static final Advancement qiangong1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangong1"));
    public static final Advancement qiangong2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangong2"));
    public static final Advancement qiangong3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangong3"));
    public static final Advancement qiangong4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangong4"));

    public static final Advancement qiangren1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangren1"));
    public static final Advancement qiangren2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangren2"));
    public static final Advancement qiangren3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangren3"));
    public static final Advancement qiangren4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/qiangren4"));

    // 成就常量声明
    public static final Advancement shuangjia1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shuangjia1"));
    public static final Advancement shuangjia2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shuangjia2"));
    public static final Advancement shuangjia3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shuangjia3"));
    public static final Advancement shuangjia4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/shuangjia4"));

    public static final Advancement huixin1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/huixin1"));
    public static final Advancement huixin2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/huixin2"));
    public static final Advancement huixin3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/huixin3"));
    public static final Advancement huixin4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/huixin4"));

    public static final Advancement guantong1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/guantong1"));
    public static final Advancement guantong2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/guantong2"));
    public static final Advancement guantong3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/guantong3"));
    public static final Advancement guantong4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/guantong4"));

    public static final Advancement juli1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/juli1"));
    public static final Advancement juli2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/juli2"));
    public static final Advancement juli3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/juli3"));
    public static final Advancement juli4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/juli4"));

    public static final Advancement bujin1 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/bujin1"));
    public static final Advancement bujin2 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/bujin2"));
    public static final Advancement bujin3 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/bujin3"));
    public static final Advancement bujin4 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/enchant/bujin4"));

    // 成就常量定义
    public static final Advancement qkd1unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd1unlock"));
    public static final Advancement qkd2unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd2unlock"));
    public static final Advancement qkd3unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd3unlock"));
    public static final Advancement qkd4unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd4unlock"));
    public static final Advancement qkd5unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd5unlock"));
    public static final Advancement qkd6unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd6unlock"));
    public static final Advancement qkd7unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd7unlock"));
    public static final Advancement qkd8unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd8unlock"));
    public static final Advancement qkd9unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd9unlock"));
    public static final Advancement qkd10unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd10unlock"));
    public static final Advancement qkd11unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd11unlock"));
    public static final Advancement qkd12unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd12unlock"));
    public static final Advancement qkd13unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd13unlock"));
    public static final Advancement qkd14unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd14unlock"));
    public static final Advancement qkd15unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd15unlock"));
    public static final Advancement qkd16unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd16unlock"));
    public static final Advancement qkd17unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd17unlock"));
    public static final Advancement qkd18unlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/qkd18unlock"));
    public static final Advancement hunyuanunlock = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/qkd/hunyuan"));

    public static final Advancement sell = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shichang/sell"));
    public static final Advancement sale = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/shichang/sale"));


    static {

        idToAdvancements.put("shuangjia1", shuangjia1);
        idToAdvancements.put("shuangjia2", shuangjia2);
        idToAdvancements.put("shuangjia3", shuangjia3);
        idToAdvancements.put("shuangjia4", shuangjia4);

        idToAdvancements.put("huixin1", huixin1);
        idToAdvancements.put("huixin2", huixin2);
        idToAdvancements.put("huixin3", huixin3);
        idToAdvancements.put("huixin4", huixin4);

        idToAdvancements.put("guantong1", guantong1);
        idToAdvancements.put("guantong2", guantong2);
        idToAdvancements.put("guantong3", guantong3);
        idToAdvancements.put("guantong4", guantong4);

        idToAdvancements.put("juli1", juli1);
        idToAdvancements.put("juli2", juli2);
        idToAdvancements.put("juli3", juli3);
        idToAdvancements.put("juli4", juli4);

        idToAdvancements.put("bujin1", bujin1);
        idToAdvancements.put("bujin2", bujin2);
        idToAdvancements.put("bujin3", bujin3);
        idToAdvancements.put("bujin4", bujin4);

        idToPoints.put("shuangjia1", 30);
        idToPoints.put("shuangjia2", 40);
        idToPoints.put("shuangjia3", 60);
        idToPoints.put("shuangjia4", 100);

        idToPoints.put("huixin1", 30);
        idToPoints.put("huixin2", 40);
        idToPoints.put("huixin3", 60);
        idToPoints.put("huixin4", 100);

        idToPoints.put("guantong1", 30);
        idToPoints.put("guantong2", 40);
        idToPoints.put("guantong3", 60);
        idToPoints.put("guantong4", 100);

        idToPoints.put("juli1", 30);
        idToPoints.put("juli2", 40);
        idToPoints.put("juli3", 60);
        idToPoints.put("juli4", 100);

        idToPoints.put("bujin1", 30);
        idToPoints.put("bujin2", 40);
        idToPoints.put("bujin3", 60);
        idToPoints.put("bujin4", 100);

        idToAdvancements.put("yuti1", yuti1);
        idToAdvancements.put("yuti2", yuti2);
        idToAdvancements.put("yuti3", yuti3);
        idToAdvancements.put("yuti4", yuti4);

        idToAdvancements.put("liren1", liren1);
        idToAdvancements.put("liren2", liren2);
        idToAdvancements.put("liren3", liren3);
        idToAdvancements.put("liren4", liren4);

        idToAdvancements.put("qiangong1", qiangong1);
        idToAdvancements.put("qiangong2", qiangong2);
        idToAdvancements.put("qiangong3", qiangong3);
        idToAdvancements.put("qiangong4", qiangong4);

        idToAdvancements.put("qiangren1", qiangren1);
        idToAdvancements.put("qiangren2", qiangren2);
        idToAdvancements.put("qiangren3", qiangren3);
        idToAdvancements.put("qiangren4", qiangren4);

// 填充 Points
        idToPoints.put("yuti1", 30);
        idToPoints.put("yuti2", 40);
        idToPoints.put("yuti3", 60);
        idToPoints.put("yuti4", 100);

        idToPoints.put("liren1", 30);
        idToPoints.put("liren2", 40);
        idToPoints.put("liren3", 60);
        idToPoints.put("liren4", 100);

        idToPoints.put("qiangong1", 30);
        idToPoints.put("qiangong2", 40);
        idToPoints.put("qiangong3", 60);
        idToPoints.put("qiangong4", 100);

        idToPoints.put("qiangren1", 30);
        idToPoints.put("qiangren2", 40);
        idToPoints.put("qiangren3", 60);
        idToPoints.put("qiangren4", 100);

        idToAdvancements.put("shouhu1", shouhu1);
        idToAdvancements.put("shouhu2", shouhu2);
        idToAdvancements.put("shouhu3", shouhu3);
        idToAdvancements.put("shouhu4", shouhu4);

        idToAdvancements.put("yankai1", yankai1);
        idToAdvancements.put("yankai2", yankai2);
        idToAdvancements.put("yankai3", yankai3);
        idToAdvancements.put("yankai4", yankai4);

        idToAdvancements.put("luoshi1", luoshi1);
        idToAdvancements.put("luoshi2", luoshi2);
        idToAdvancements.put("luoshi3", luoshi3);
        idToAdvancements.put("luoshi4", luoshi4);

        idToAdvancements.put("wanfa1", wanfa1);
        idToAdvancements.put("wanfa2", wanfa2);
        idToAdvancements.put("wanfa3", wanfa3);
        idToAdvancements.put("wanfa4", wanfa4);

        idToPoints.put("shouhu1", 30);
        idToPoints.put("shouhu2", 40);
        idToPoints.put("shouhu3", 60);
        idToPoints.put("shouhu4", 100);

        idToPoints.put("yankai1", 30);
        idToPoints.put("yankai2", 40);
        idToPoints.put("yankai3", 60);
        idToPoints.put("yankai4", 100);

        idToPoints.put("luoshi1", 30);
        idToPoints.put("luoshi2", 40);
        idToPoints.put("luoshi3", 60);
        idToPoints.put("luoshi4", 100);

        idToPoints.put("wanfa1", 30);
        idToPoints.put("wanfa2", 40);
        idToPoints.put("wanfa3", 60);
        idToPoints.put("wanfa4", 100);


        idToAdvancements.put("lvyexianzong", lvYeXianZong);
        idToAdvancements.put("qingnvhuanshuang", qingNvHuanShuang);
        idToAdvancements.put("zhurongkuyan", zhuRongKuYan);
        idToAdvancements.put("zhudianxuanjing", zhuDianXuanJing);

        idToAdvancements.put("buhunwang", buHunWang);
        idToAdvancements.put("yangshoujian", yangShouJian);
        idToAdvancements.put("wumingmoyinluo", wuMingMoYinLuo);
        idToAdvancements.put("shetianhuaxueling", sheTianHuaXueLing);

        idToAdvancements.put("kuyeling", kuYeLing);
        idToAdvancements.put("luobeijinpin", luoBeiJinPin);
        idToAdvancements.put("pinyushuiyu", pinYuShuiYu);
        idToAdvancements.put("dikongymoquan", diKongYmoQuan);

        idToAdvancements.put("luanshengu", luanShenGu);
        idToAdvancements.put("jingulian", jinGuLian);
        idToAdvancements.put("jianchangulin", jianChangGuLin);
        idToAdvancements.put("moduohunfan", moDuoHunFan);

        idToPoints.put("lvyexianzong", 30);
        idToPoints.put("qingnvhuanshuang", 40);
        idToPoints.put("zhurongkuyan", 60);
        idToPoints.put("zhudianxuanjing", 100);
        idToPoints.put("buhunwang", 30);
        idToPoints.put("yangshoujian", 40);
        idToPoints.put("wumingmoyinluo", 60);
        idToPoints.put("shetianhuaxueling", 100);
        idToPoints.put("kuyeling", 30);
        idToPoints.put("luobeijinpin", 40);
        idToPoints.put("pinyushuiyu", 60);
        idToPoints.put("dikongymoquan", 100);
        idToPoints.put("luanshengu", 30);
        idToPoints.put("jingulian", 40);
        idToPoints.put("jianchangulin", 60);
        idToPoints.put("moduohunfan", 100);


        idToAdvancements.put("diaohungan", diaoHunGan);
        idToAdvancements.put("shelingzhu", sheLingZhu);
        idToAdvancements.put("yujinpin", yuJinPin);
        idToAdvancements.put("tianjishenjin", tianJiShenJin);
        idToAdvancements.put("ruiyingyan", ruiYingYan);
        idToAdvancements.put("duohuntang", duoHunTang);
        idToAdvancements.put("moyuanfozhu", moYuanFoZhu);
        idToAdvancements.put("fuxinruyi", fuXinRuYi);
        idToPoints.put("diaohungan", 30);
        idToPoints.put("shelingzhu", 40);
        idToPoints.put("yujinpin", 60);
        idToPoints.put("tianjishenjin", 100);
        idToPoints.put("ruiyingyan", 30);
        idToPoints.put("duohuntang", 40);
        idToPoints.put("moyuanfozhu", 60);
        idToPoints.put("fuxinruyi", 100);


        idToAdvancements.put("juedouling", jueDouLing);
        idToAdvancements.put("leiminggu", leiMingGu);
        idToAdvancements.put("huansilin", huanSiLin);
        idToAdvancements.put("niumonuhou", niuMoNuHou);
        idToAdvancements.put("douqishi", douQiShi);
        idToAdvancements.put("panguanbi", panGuanBi);
        idToAdvancements.put("minshengjian", minShengJian);
        idToAdvancements.put("zhenleitianchui", zhenLeiTianChui);
        idToPoints.put("juedouling", 30);
        idToPoints.put("leiminggu", 40);
        idToPoints.put("huansilin", 60);
        idToPoints.put("niumonuhou", 100);
        idToPoints.put("douqishi", 30);
        idToPoints.put("panguanbi", 40);
        idToPoints.put("minshengjian", 60);
        idToPoints.put("zhenleitianchui", 100);


        idToAdvancements.put("yaowanghulu", yaoWangHuLu);
        idToAdvancements.put("cixinmiaolian", ciXinMiaoLian);
        idToAdvancements.put("shenxinyugu", shenXinYuGu);
        idToAdvancements.put("yinyangzhanlongjian", yinYangZhanLongJian);
        idToAdvancements.put("yunlangban", yunLangBan);
        idToAdvancements.put("zhenhunyuxiao", zhenHunYuXiao);
        idToAdvancements.put("dikuihualan", diKuiHuaLan);
        idToAdvancements.put("xuanfengzongshan", xuanFengZongShan);
        idToPoints.put("yaowanghulu", 100);
        idToPoints.put("cixinmiaolian", 100);
        idToPoints.put("shenxinyugu", 100);
        idToPoints.put("yinyangzhanlongjian", 100);
        idToPoints.put("yunlangban", 100);
        idToPoints.put("zhenhunyuxiao", 100);
        idToPoints.put("dikuihualan", 100);
        idToPoints.put("xuanfengzongshan", 100);


        idToAdvancements.put("zhaoyaojin", zhaoYaoJin);
        idToAdvancements.put("yufuchen", yuFuChen);
        idToAdvancements.put("wusebutianshi", wuSeBuTianShi);
        idToPoints.put("zhaoyaojin", 30);
        idToPoints.put("yufuchen", 40);
        idToPoints.put("wusebutianshi", 60);


        idToAdvancements.put("chandingfajie", chandingfajie);
        idToAdvancements.put("chandingshengjie", chandingshengjie);
        idToAdvancements.put("chandingfojie", chandingfojie);
        idToAdvancements.put("chandingxianjie", chandingxianjie);
        idToAdvancements.put("chandingshenjie", chandingshenjie);
        idToPoints.put("chandingfajie", 30);
        idToPoints.put("chandingshengjie", 40);
        idToPoints.put("chandingfojie", 60);
        idToPoints.put("chandingxianjie", 100);
        idToPoints.put("chandingshenjie", 200);


        idToAdvancements.put("zhihuifajie", zhihuifajie);
        idToAdvancements.put("zhihuishengjie", zhihuishengjie);
        idToAdvancements.put("zhihuifojie", zhihuifojie);
        idToAdvancements.put("zhihuixianjie", zhihuixianjie);
        idToAdvancements.put("zhihuishenjie", zhihuishenjie);
        idToPoints.put("zhihuifajie", 30);
        idToPoints.put("zhihuishengjie", 40);
        idToPoints.put("zhihuifojie", 60);
        idToPoints.put("zhihuixianjie", 100);
        idToPoints.put("zhihuishenjie", 200);


        idToAdvancements.put("chijiefajie", chijiefajie);
        idToAdvancements.put("chijieshengjie", chijieshengjie);
        idToAdvancements.put("chijiefojie", chijiefojie);
        idToAdvancements.put("chijiexianjie", chijiexianjie);
        idToAdvancements.put("chijieshenjie", chijieshenjie);

        idToPoints.put("chijiefajie", 30);
        idToPoints.put("chijieshengjie", 40);
        idToPoints.put("chijiefojie", 60);
        idToPoints.put("chijiexianjie", 100);
        idToPoints.put("chijieshenjie", 200);


        idToAdvancements.put("chimizhijie", chimizhijie);
        idToAdvancements.put("chiyudujie", chiyudujie);
        idToAdvancements.put("chiyuxiejie", chiyuxiejie);
        idToAdvancements.put("chiyuguijie", chiyuguijie);
        idToAdvancements.put("chiyumojie", chiyumojie);
        idToAdvancements.put("chiyumingjie", chiyumingjie);
        idToPoints.put("chimizhijie", 20);
        idToPoints.put("chiyudujie", 30);
        idToPoints.put("chiyuxiejie", 40);
        idToPoints.put("chiyuguijie", 60);
        idToPoints.put("chiyumojie", 100);
        idToPoints.put("chiyumingjie", 200);


        idToAdvancements.put("chennuzhijie", chennuzhijie);
        idToAdvancements.put("chenhenduji", chenhenduji);
        idToAdvancements.put("chenhenxiejie", chenhenxiejie);
        idToAdvancements.put("chenhenguijie", chenhenguijie);
        idToAdvancements.put("chenhenmojie", chenhenmojie);
        idToAdvancements.put("chenhenmingjie", chenhenmingjie);
        idToPoints.put("chennuzhijie", 20);
        idToPoints.put("chenhenduji", 30);
        idToPoints.put("chenhenxiejie", 40);
        idToPoints.put("chenhenguijie", 60);
        idToPoints.put("chenhenmojie", 100);
        idToPoints.put("chenhenmingjie", 200);


        idToAdvancements.put("tanyuzhijie", tanyuzhijie);
        idToAdvancements.put("tanlandujie", tanlandujie);
        idToAdvancements.put("tanlanxiejie", tanlanxiejie);
        idToAdvancements.put("tanlanguijie", tanlanguijie);
        idToAdvancements.put("tanlanmojie", tanlanmojie);
        idToAdvancements.put("tanlanmingjie", tanlanmingjie);
        idToPoints.put("tanyuzhijie", 20);
        idToPoints.put("tanlandujie", 30);
        idToPoints.put("tanlanxiejie", 40);
        idToPoints.put("tanlanguijie", 60);
        idToPoints.put("tanlanmojie", 100);
        idToPoints.put("tanlanmingjie", 200);


        idToAdvancements.put("zhuqueshengqi2", zhuqueshengqi2);
        idToAdvancements.put("zhuqueshengqi3", zhuqueshengqi3);
        idToAdvancements.put("zhuqueshengqi4", zhuqueshengqi4);
        idToAdvancements.put("zhuqueshengqi5", zhuqueshengqi5);
        idToAdvancements.put("zhuqueshengqi6", zhuqueshengqi6);

        idToPoints.put("zhuqueshengqi2", 20);
        idToPoints.put("zhuqueshengqi3", 30);
        idToPoints.put("zhuqueshengqi4", 40);
        idToPoints.put("zhuqueshengqi5", 60);
        idToPoints.put("zhuqueshengqi6", 100);


        idToAdvancements.put("baihushengqi2", baihushengqi2);
        idToAdvancements.put("baihushengqi3", baihushengqi3);
        idToAdvancements.put("baihushengqi4", baihushengqi4);
        idToAdvancements.put("baihushengqi5", baihushengqi5);
        idToAdvancements.put("baihushengqi6", baihushengqi6);

        idToPoints.put("baihushengqi2", 20);
        idToPoints.put("baihushengqi3", 30);
        idToPoints.put("baihushengqi4", 40);
        idToPoints.put("baihushengqi5", 60);
        idToPoints.put("baihushengqi6", 100);


        idToAdvancements.put("xuanwushengqi2", xuanwushengqi2);
        idToAdvancements.put("xuanwushengqi3", xuanwushengqi3);
        idToAdvancements.put("xuanwushengqi4", xuanwushengqi4);
        idToAdvancements.put("xuanwushengqi5", xuanwushengqi5);
        idToAdvancements.put("xuanwushengqi6", xuanwushengqi6);
        idToPoints.put("xuanwushengqi2", 20);
        idToPoints.put("xuanwushengqi3", 30);
        idToPoints.put("xuanwushengqi4", 40);
        idToPoints.put("xuanwushengqi5", 60);
        idToPoints.put("xuanwushengqi6", 100);


        idToAdvancements.put("qinglongshengqi2", qinglongshengqi2);
        idToAdvancements.put("qinglongshengqi3", qinglongshengqi3);
        idToAdvancements.put("qinglongshengqi4", qinglongshengqi4);
        idToAdvancements.put("qinglongshengqi5", qinglongshengqi5);
        idToAdvancements.put("qinglongshengqi6", qinglongshengqi6);
        idToPoints.put("qinglongshengqi2", 20);
        idToPoints.put("qinglongshengqi3", 30);
        idToPoints.put("qinglongshengqi4", 40);
        idToPoints.put("qinglongshengqi5", 60);
        idToPoints.put("qinglongshengqi6", 100);


        // Map2
        idToAdvancements.put("jinruifeiren", jinRuiFeiRen);
        idToAdvancements.put("wushengxiujian", wuShengXiuJian);
        idToAdvancements.put("huixuantaji", huiXuanTaiJi);
        idToAdvancements.put("wuyinwuzong", wuYinWuZong);
        idToAdvancements.put("yanwangtie", yanWangTie);

        idToAdvancements.put("huangtongchong", huangTongChong);
        idToAdvancements.put("mingyue", mingYue);
        idToAdvancements.put("canlan", canLan);
        idToAdvancements.put("jinjing", jinJing);
        idToAdvancements.put("xiaotian", xiaoTian);

        idToAdvancements.put("qinfengyinyin", qinFengYinYin);
        idToAdvancements.put("liushuichanchan", liuShuiChanChan);
        idToAdvancements.put("buqichunyu", buQiChunYu);
        idToAdvancements.put("sanshengzhenhun", sanShengZhenHun);
        idToAdvancements.put("jiufenglaiyi", jiuFengLaiYi);

        // Map2
        idToPoints.put("jinruifeiren", 20);
        idToPoints.put("wushengxiujian", 30);
        idToPoints.put("huixuantaji", 40);
        idToPoints.put("wuyinwuzong", 60);
        idToPoints.put("yanwangtie", 100);

        idToPoints.put("huangtongchong", 20);
        idToPoints.put("mingyue", 30);
        idToPoints.put("canlan", 40);
        idToPoints.put("jinjing", 60);
        idToPoints.put("xiaotian", 100);

        idToPoints.put("qinfengyinyin", 20);
        idToPoints.put("liushuichanchan", 30);
        idToPoints.put("buqichunyu", 40);
        idToPoints.put("sanshengzhenhun", 60);
        idToPoints.put("jiufenglaiyi", 100);


        // 通用胸甲
        idToAdvancements.put("xiongsp2", xiongsp2);
        idToAdvancements.put("xiongsp3", xiongsp3);
        idToAdvancements.put("xiongsp4", xiongsp4);
        idToAdvancements.put("xiongsp5", xiongsp5);
        idToAdvancements.put("xiongsp6", xiongsp6);
        idToPoints.put("xiongsp2", 20);
        idToPoints.put("xiongsp3", 30);
        idToPoints.put("xiongsp4", 40);
        idToPoints.put("xiongsp5", 60);
        idToPoints.put("xiongsp6", 100);

        // 战士胸甲
        idToAdvancements.put("zhanxiong2", zhanxiong2);
        idToAdvancements.put("zhanxiong3", zhanxiong3);
        idToAdvancements.put("zhanxiong4", zhanxiong4);
        idToAdvancements.put("zhanxiong5", zhanxiong5);
        idToAdvancements.put("zhanxiong6", zhanxiong6);
        idToPoints.put("zhanxiong2", 20);
        idToPoints.put("zhanxiong3", 30);
        idToPoints.put("zhanxiong4", 40);
        idToPoints.put("zhanxiong5", 60);
        idToPoints.put("zhanxiong6", 100);

        // 弓箭手胸甲
        idToAdvancements.put("gongxiong2", gongxiong2);
        idToAdvancements.put("gongxiong3", gongxiong3);
        idToAdvancements.put("gongxiong4", gongxiong4);
        idToAdvancements.put("gongxiong5", gongxiong5);
        idToAdvancements.put("gongxiong6", gongxiong6);
        idToPoints.put("gongxiong2", 20);
        idToPoints.put("gongxiong3", 30);
        idToPoints.put("gongxiong4", 40);
        idToPoints.put("gongxiong5", 60);
        idToPoints.put("gongxiong6", 100);

        // 炼丹师胸甲
        idToAdvancements.put("danxiong2", danxiong2);
        idToAdvancements.put("danxiong3", danxiong3);
        idToAdvancements.put("danxiong4", danxiong4);
        idToAdvancements.put("danxiong5", danxiong5);
        idToAdvancements.put("danxiong6", danxiong6);
        idToPoints.put("danxiong2", 20);
        idToPoints.put("danxiong3", 30);
        idToPoints.put("danxiong4", 40);
        idToPoints.put("danxiong5", 60);
        idToPoints.put("danxiong6", 100);

        // 通用裤子
        idToAdvancements.put("tuisp2", tuiSp2);
        idToAdvancements.put("tuisp3", tuiSp3);
        idToAdvancements.put("tuisp4", tuiSp4);
        idToAdvancements.put("tuisp5", tuiSp5);
        idToAdvancements.put("tuisp6", tuiSp6);
        idToPoints.put("tuisp2", 20);
        idToPoints.put("tuisp3", 30);
        idToPoints.put("tuisp4", 40);
        idToPoints.put("tuisp5", 60);
        idToPoints.put("tuisp6", 100);

        // 战士裤子
        idToAdvancements.put("zhantui2", zhanTui2);
        idToAdvancements.put("zhantui3", zhanTui3);
        idToAdvancements.put("zhantui4", zhanTui4);
        idToAdvancements.put("zhantui5", zhanTui5);
        idToAdvancements.put("zhantui6", zhanTui6);
        idToPoints.put("zhantui2", 20);
        idToPoints.put("zhantui3", 30);
        idToPoints.put("zhantui4", 40);
        idToPoints.put("zhantui5", 60);
        idToPoints.put("zhantui6", 100);

        // 弓箭手裤子
        idToAdvancements.put("gongtui2", gongTui2);
        idToAdvancements.put("gongtui3", gongTui3);
        idToAdvancements.put("gongtui4", gongTui4);
        idToAdvancements.put("gongtui5", gongTui5);
        idToAdvancements.put("gongtui6", gongTui6);
        idToPoints.put("gongtui2", 20);
        idToPoints.put("gongtui3", 30);
        idToPoints.put("gongtui4", 40);
        idToPoints.put("gongtui5", 60);
        idToPoints.put("gongtui6", 100);

        // 炼丹师裤子
        idToAdvancements.put("dantui2", danTui2);
        idToAdvancements.put("dantui3", danTui3);
        idToAdvancements.put("dantui4", danTui4);
        idToAdvancements.put("dantui5", danTui5);
        idToAdvancements.put("dantui6", danTui6);
        idToPoints.put("dantui2", 20);
        idToPoints.put("dantui3", 30);
        idToPoints.put("dantui4", 40);
        idToPoints.put("dantui5", 60);
        idToPoints.put("dantui6", 100);

        // 通用靴子
        idToAdvancements.put("xiesp2", xieSp2);
        idToAdvancements.put("xiesp3", xieSp3);
        idToAdvancements.put("xiesp4", xieSp4);
        idToAdvancements.put("xiesp5", xieSp5);
        idToAdvancements.put("xiesp6", xieSp6);
        idToPoints.put("xiesp2", 20);
        idToPoints.put("xiesp3", 30);
        idToPoints.put("xiesp4", 40);
        idToPoints.put("xiesp5", 60);
        idToPoints.put("xiesp6", 100);

        // 战士靴子
        idToAdvancements.put("zhanxie2", zhanXie2);
        idToAdvancements.put("zhanxie3", zhanXie3);
        idToAdvancements.put("zhanxie4", zhanXie4);
        idToAdvancements.put("zhanxie5", zhanXie5);
        idToAdvancements.put("zhanxie6", zhanXie6);
        idToPoints.put("zhanxie2", 20);
        idToPoints.put("zhanxie3", 30);
        idToPoints.put("zhanxie4", 40);
        idToPoints.put("zhanxie5", 60);
        idToPoints.put("zhanxie6", 100);

        // 弓箭手靴子
        idToAdvancements.put("gongxie2", gongXie2);
        idToAdvancements.put("gongxie3", gongXie3);
        idToAdvancements.put("gongxie4", gongXie4);
        idToAdvancements.put("gongxie5", gongXie5);
        idToAdvancements.put("gongxie6", gongXie6);
        idToPoints.put("gongxie2", 20);
        idToPoints.put("gongxie3", 30);
        idToPoints.put("gongxie4", 40);
        idToPoints.put("gongxie5", 60);
        idToPoints.put("gongxie6", 100);

        // 炼丹师靴子
        idToAdvancements.put("danxie2", danXie2);
        idToAdvancements.put("danxie3", danXie3);
        idToAdvancements.put("danxie4", danXie4);
        idToAdvancements.put("danxie5", danXie5);
        idToAdvancements.put("danxie6", danXie6);
        idToPoints.put("danxie2", 20);
        idToPoints.put("danxie3", 30);
        idToPoints.put("danxie4", 40);
        idToPoints.put("danxie5", 60);
        idToPoints.put("danxie6", 100);


        idToAdvancements.put("gongtou2", gongtou2);
        idToAdvancements.put("gongtou3", gongtou3);
        idToAdvancements.put("gongtou4", gongtou4);
        idToAdvancements.put("gongtou5", gongtou5);
        idToAdvancements.put("gongtou6", gongtou6);
        idToPoints.put("gongtou2", 20);
        idToPoints.put("gongtou3", 30);
        idToPoints.put("gongtou4", 40);
        idToPoints.put("gongtou5", 60);
        idToPoints.put("gongtou6", 100);

        idToAdvancements.put("dantou2", dantou2);
        idToAdvancements.put("dantou3", dantou3);
        idToAdvancements.put("dantou4", dantou4);
        idToAdvancements.put("dantou5", dantou5);
        idToAdvancements.put("dantou6", dantou6);
        idToPoints.put("dantou2", 20);
        idToPoints.put("dantou3", 30);
        idToPoints.put("dantou4", 40);
        idToPoints.put("dantou5", 60);
        idToPoints.put("dantou6", 100);


        idToAdvancements.put("zhantou2", zhantou2);
        idToAdvancements.put("zhantou3", zhantou3);
        idToAdvancements.put("zhantou4", zhantou4);
        idToAdvancements.put("zhantou5", zhantou5);
        idToAdvancements.put("zhantou6", zhantou6);
        idToPoints.put("zhantou2", 20);
        idToPoints.put("zhantou3", 30);
        idToPoints.put("zhantou4", 40);
        idToPoints.put("zhantou5", 60);
        idToPoints.put("zhantou6", 100);


        idToAdvancements.put("tousp2", tousp2);
        idToAdvancements.put("tousp3", tousp3);
        idToAdvancements.put("tousp4", tousp4);
        idToAdvancements.put("tousp5", tousp5);
        idToAdvancements.put("tousp6", tousp6);
        idToPoints.put("tousp2", 20);
        idToPoints.put("tousp3", 30);
        idToPoints.put("tousp4", 40);
        idToPoints.put("tousp5", 60);
        idToPoints.put("tousp6", 100);


        idToAdvancements.put("tiezhiduanbi", tiezhiduanbi);
        idToAdvancements.put("huiyidao", huiyidao);
        idToAdvancements.put("longyadao", longyadao);
        idToAdvancements.put("zhangqicuizhu", zhangqicuizhu);
        idToAdvancements.put("minghong", minghong);
        idToPoints.put("tiezhiduanbi", 20);
        idToPoints.put("huiyidao", 30);
        idToPoints.put("longyadao", 40);
        idToPoints.put("zhangqicuizhu", 60);
        idToPoints.put("minghong", 100);


        idToAdvancements.put("xinbinjiandai", xinbinjiandai);
        idToAdvancements.put("jinruijiandai", jinruijiandai);
        idToAdvancements.put("yingyanjiandai", yingyanjiandai);
        idToAdvancements.put("cangguningwang", cangguningwang);
        idToAdvancements.put("niepanyunang", niepanyunang);
        idToPoints.put("xinbinjiandai", 20);
        idToPoints.put("jinruijiandai", 30);
        idToPoints.put("yingyanjiandai", 40);
        idToPoints.put("cangguningwang", 60);
        idToPoints.put("niepanyunang", 100);

        idToAdvancements.put("xinbindunpai", xinbindunpai);
        idToAdvancements.put("jinruidunpai", jinruidunpai);
        idToAdvancements.put("chiseyuehuo", chiseyuehuo);
        idToAdvancements.put("jingangbuhuai", jingangbuhuai);
        idToAdvancements.put("chenbinluoxue", chenbinluoxue);
        idToPoints.put("xinbindunpai", 20);
        idToPoints.put("jinruidunpai", 30);
        idToPoints.put("chiseyuehuo", 40);
        idToPoints.put("jingangbuhuai", 60);
        idToPoints.put("chenbinluoxue", 100);


        idToAdvancements.put("kaishandao", kaishandao);
        idToAdvancements.put("jutongzhanchui", jutongzhanchui);
        idToAdvancements.put("pokongfu", pokongfu);
        idToAdvancements.put("sanbaoyuruyi", sanbaoyuruyi);
        idToAdvancements.put("xuanyuan", xuanyuan);
        idToPoints.put("kaishandao", 20);
        idToPoints.put("jutongzhanchui", 30);
        idToPoints.put("pokongfu", 40);
        idToPoints.put("sanbaoyuruyi", 60);
        idToPoints.put("xuanyuan", 100);

        idToAdvancements.put("qintongjian", qintongjian);
        idToAdvancements.put("chitongjian", chitongjian);
        idToAdvancements.put("taijijian", taijijian);
        idToAdvancements.put("kunlunfeixianjian", kunlunfeixianjian);
        idToAdvancements.put("taie", taie);
        idToPoints.put("qintongjian", 20);
        idToPoints.put("chitongjian", 30);
        idToPoints.put("taijijian", 40);
        idToPoints.put("kunlunfeixianjian", 60);
        idToPoints.put("taie", 100);

        idToAdvancements.put("yinyueqiang", yinyueqiang);
        idToAdvancements.put("hongyingqiang", hongyingqiang);
        idToAdvancements.put("youlongqiang", youlongqiang);
        idToAdvancements.put("hutouzhanjinqiang", hutouzhanjinqiang);
        idToAdvancements.put("ruyijingubang", ruyijingubang);
        idToPoints.put("yinyueqiang", 20);
        idToPoints.put("hongyingqiang", 30);
        idToPoints.put("youlongqiang", 40);
        idToPoints.put("hutouzhanjinqiang", 60);
        idToPoints.put("ruyijingubang", 100);

        idToAdvancements.put("qintonggong", qintonggong);
        idToAdvancements.put("yantiegong", yantiegong);
        idToAdvancements.put("zhongchuigong", zhongchuigong);
        idToAdvancements.put("beidoumiechengong", beidoumiechengong);
        idToAdvancements.put("zhuri", zhuri);
        idToPoints.put("qintonggong", 20);
        idToPoints.put("yantiegong", 30);
        idToPoints.put("zhongchuigong", 40);
        idToPoints.put("beidoumiechengong", 60);
        idToPoints.put("zhuri", 100);

        idToAdvancements.put("heitienu", heitienu);
        idToAdvancements.put("honglinnu", honglinnu);
        idToAdvancements.put("jiaolongnu", jiaolongnu);
        idToAdvancements.put("riyueliuxingnu", riyueliuxingnu);
        idToAdvancements.put("liangyi", liangyi);
        idToPoints.put("heitienu", 20);
        idToPoints.put("honglinnu", 30);
        idToPoints.put("jiaolongnu", 40);
        idToPoints.put("riyueliuxingnu", 60);
        idToPoints.put("liangyi", 100);

        idToAdvancements.put("furonggong", furonggong);
        idToAdvancements.put("hongluangong", hongluangong);
        idToAdvancements.put("tianqionggong", tianqionggong);
        idToAdvancements.put("shetianzhuiyuegong", shetianzhuiyuegong);
        idToAdvancements.put("liuguang", liuguang);
        idToPoints.put("furonggong", 20);
        idToPoints.put("hongluangong", 30);
        idToPoints.put("tianqionggong", 40);
        idToPoints.put("shetianzhuiyuegong", 60);
        idToPoints.put("liuguang", 100);

        idToAdvancements.put("qintongguo", qintongguo);
        idToAdvancements.put("liandanlu", liandanlu);
        idToAdvancements.put("suohunlu", suohunlu);
        idToAdvancements.put("qishading", qishading);
        idToAdvancements.put("hunyuanshending", hunyuanshending);
        idToPoints.put("qintongguo", 20);
        idToPoints.put("liandanlu", 30);
        idToPoints.put("suohunlu", 40);
        idToPoints.put("qishading", 60);
        idToPoints.put("hunyuanshending", 100);

        chonghuaAchievements.put(2, AdvancementSet.chonghua2);
        chonghuaAchievements.put(3, AdvancementSet.chonghua3);
        chonghuaAchievements.put(4, AdvancementSet.chonghua4);
        chonghuaAchievements.put(5, AdvancementSet.chonghua5);
        chonghuaAchievements.put(6, AdvancementSet.chonghua6);
        chonghuaAchievements.put(7, AdvancementSet.chonghua7);
        chonghuaAchievements.put(8, AdvancementSet.chonghua8);
        chonghuaAchievements.put(9, AdvancementSet.chonghua9);
        chonghuaAchievements.put(10, AdvancementSet.chonghua10);
        chonghuaAchievements.put(11, AdvancementSet.chonghua11);

        maintaskAchievements.put(1,AdvancementSet.maintask1);
        maintaskAchievements.put(2,AdvancementSet.maintask2);
        maintaskAchievements.put(3,AdvancementSet.maintask3);
        maintaskAchievements.put(4,AdvancementSet.maintask4);
        maintaskAchievements.put(5,AdvancementSet.maintask5);

        qkdAdv.put("qkd1", AdvancementSet.qkd1unlock);
        qkdAdv.put("qkd2", AdvancementSet.qkd2unlock);
        qkdAdv.put("qkd3", AdvancementSet.qkd3unlock);
        qkdAdv.put("qkd4", AdvancementSet.qkd4unlock);
        qkdAdv.put("qkd5", AdvancementSet.qkd5unlock);
        qkdAdv.put("qkd6", AdvancementSet.qkd6unlock);
        qkdAdv.put("qkd7", AdvancementSet.qkd7unlock);
        qkdAdv.put("qkd8", AdvancementSet.qkd8unlock);
        qkdAdv.put("qkd9", AdvancementSet.qkd9unlock);
        qkdAdv.put("qkd10", AdvancementSet.qkd10unlock);
        qkdAdv.put("qkd11", AdvancementSet.qkd11unlock);
        qkdAdv.put("qkd12", AdvancementSet.qkd12unlock);
        qkdAdv.put("qkd13", AdvancementSet.qkd13unlock);
        qkdAdv.put("qkd14", AdvancementSet.qkd14unlock);
        qkdAdv.put("qkd15", AdvancementSet.qkd15unlock);
        qkdAdv.put("qkd16", AdvancementSet.qkd16unlock);
        qkdAdv.put("qkd17", AdvancementSet.qkd17unlock);
        qkdAdv.put("qkd18", AdvancementSet.qkd18unlock);
        qkdAdv.put("shared",AdvancementSet.hunyuanunlock);



    }

    public static void giveAdv(Player player, Advancement advancement, int point) {
        AdvancementProgress advancementProgress = player.getAdvancementProgress(advancement);
        if (!advancementProgress.isDone()) {
            advancementProgress.awardCriteria("impossible");
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            int pointBefore = pdc.get(DataContainer.advancementPoint, PersistentDataType.INTEGER);
            pdc.set(DataContainer.advancementPoint, PersistentDataType.INTEGER, pointBefore + point);
            SendInformation.sendMes(player, Component.text("§6[成就系统]§a获得成就点： §b" + point));


        }
    }

    public static void giveAdv(Player player, Advancement advancement) {
        AdvancementProgress advancementProgress = player.getAdvancementProgress(advancement);
        if (!advancementProgress.isDone()) {
            advancementProgress.awardCriteria("impossible");
        }
    }
}
