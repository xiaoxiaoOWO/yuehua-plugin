package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class AdvancementSet {
    public static final Advancement killRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/root"));
    public static final Advancement allRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "all/root"));
    public static final Advancement zhanRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "zhan/root"));
    public static final Advancement gongRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "gong/root"));
    public static final Advancement danRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "dan/root"));
    public static final Advancement fubenRoot = Bukkit.getAdvancement(new NamespacedKey("yuehua", "fuben/root"));


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

    public static final Advancement shanshenshooter_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter_100"));
    public static final Advancement shanshenshooter_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter_200"));
    public static final Advancement shanshenshooter_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter_500"));
    public static final Advancement shanshenshooter_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter_1000"));
    public static final Advancement shanshenshooter_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter_2000"));
    public static final Advancement shanshenshooter_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter_5000"));

    public static final Advancement shanshenspider_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider_100"));
    public static final Advancement shanshenspider_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider_200"));
    public static final Advancement shanshenspider_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider_500"));
    public static final Advancement shanshenspider_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider_1000"));
    public static final Advancement shanshenspider_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider_2000"));
    public static final Advancement shanshenspider_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider_5000"));

    public static final Advancement shanshenzombie_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie_100"));
    public static final Advancement shanshenzombie_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie_200"));
    public static final Advancement shanshenzombie_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie_500"));
    public static final Advancement shanshenzombie_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie_1000"));
    public static final Advancement shanshenzombie_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie_2000"));
    public static final Advancement shanshenzombie_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie_5000"));

    public static final Advancement yaojindufeng_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng_100"));
    public static final Advancement yaojindufeng_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng_200"));
    public static final Advancement yaojindufeng_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng_500"));
    public static final Advancement yaojindufeng_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng_1000"));
    public static final Advancement yaojindufeng_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng_2000"));
    public static final Advancement yaojindufeng_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng_5000"));

    public static final Advancement yaojingpanda_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda_100"));
    public static final Advancement yaojingpanda_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda_200"));
    public static final Advancement yaojingpanda_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda_500"));
    public static final Advancement yaojingpanda_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda_1000"));
    public static final Advancement yaojingpanda_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda_2000"));
    public static final Advancement yaojingpanda_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda_5000"));

    public static final Advancement yaojinshooter_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter_100"));
    public static final Advancement yaojinshooter_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter_200"));
    public static final Advancement yaojinshooter_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter_500"));
    public static final Advancement yaojinshooter_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter_1000"));
    public static final Advancement yaojinshooter_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter_2000"));
    public static final Advancement yaojinshooter_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter_5000"));

    public static final Advancement jianxiguimei_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei_100"));
    public static final Advancement jianxiguimei_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei_200"));
    public static final Advancement jianxiguimei_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei_500"));
    public static final Advancement jianxiguimei_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei_1000"));
    public static final Advancement jianxiguimei_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei_2000"));
    public static final Advancement jianxiguimei_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei_5000"));

    public static final Advancement linyouduzhu_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu_100"));
    public static final Advancement linyouduzhu_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu_200"));
    public static final Advancement linyouduzhu_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu_500"));
    public static final Advancement linyouduzhu_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu_1000"));
    public static final Advancement linyouduzhu_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu_2000"));
    public static final Advancement linyouduzhu_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu_5000"));

    public static final Advancement zhizhunvwang_100 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang_100"));
    public static final Advancement zhizhunvwang_200 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang_200"));
    public static final Advancement zhizhunvwang_500 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang_500"));
    public static final Advancement zhizhunvwang_1000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang_1000"));
    public static final Advancement zhizhunvwang_2000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang_2000"));
    public static final Advancement zhizhunvwang_5000 = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang_5000"));


    public static void giveAdv(Player player, Advancement advancement, int point) {
        AdvancementProgress advancementProgress = player.getAdvancementProgress(advancement);
        if (!advancementProgress.isDone()) {
            advancementProgress.awardCriteria("impossibe");
            PersistentDataContainer pdc = player.getPersistentDataContainer();
            int pointBefore = pdc.get(DataContainer.advancementPoint, PersistentDataType.INTEGER);
            pdc.set(DataContainer.advancementPoint, PersistentDataType.INTEGER, pointBefore + point);
            SendInformation.sendMes(player, Component.text("§6[成就系统]§a获得成就点： §b" + point));
        }
    }
}
