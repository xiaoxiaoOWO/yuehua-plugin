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


    public static final Advancement eastjiangshi = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi"));
    public static final Advancement eastjiangshi_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshi_final"));
    public static final Advancement eastkulou = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou"));
    public static final Advancement eastkulou_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkulou_final"));
    public static final Advancement eastzhizhu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu"));
    public static final Advancement eastzhizhu_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhu_final"));


    public static final Advancement eastdufeng = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng"));
    public static final Advancement eastdufeng_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastdufeng_final"));
    public static final Advancement eastjiangshijinyin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin"));
    public static final Advancement eastjiangshijinyin_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastjiangshijinyin_final"));
    public static final Advancement eastkugugongjianshou = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou"));
    public static final Advancement eastkugugongjianshou_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastkugugongjianshou_final"));
    public static final Advancement eastzhizhujinyin = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin"));
    public static final Advancement eastzhizhujinyin_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/east/eastzhizhujinyin_final"));

    public static final Advancement shanshenshooter = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter"));
    public static final Advancement shanshenshooter_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenshooter_final"));
    public static final Advancement shanshenspider = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider"));
    public static final Advancement shanshenspider_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenspider_final"));
    public static final Advancement shanshenzombie = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie"));
    public static final Advancement shanshenzombie_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/shanshen/shanshenzombie_final"));

    public static final Advancement yaojindufeng = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng"));
    public static final Advancement yaojindufeng_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojindufeng_final"));
    public static final Advancement yaojingpanda = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda"));
    public static final Advancement yaojingpanda_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojingpanda_final"));
    public static final Advancement yaojinshooter = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter"));
    public static final Advancement yaojinshooter_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/yaojin/yaojinshooter_final"));

    public static final Advancement jianxiguimei = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei"));
    public static final Advancement jianxiguimei_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/jianxi/jianxiguimei_final"));
    public static final Advancement linyouduzhu = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu"));
    public static final Advancement linyouduzhu_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/linyou/linyouduzhu_final"));
    public static final Advancement zhizhunvwang = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang"));
    public static final Advancement zhizhunvwang_final = Bukkit.getAdvancement(new NamespacedKey("yuehua", "kill/zhizhu/zhizhunvwang_final"));

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
