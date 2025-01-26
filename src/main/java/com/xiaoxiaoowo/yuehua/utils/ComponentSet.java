package com.xiaoxiaoowo.yuehua.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;

public final class ComponentSet {
    public static final Component template = Component.text("§e[游戏机制]§b");

    public static final Component RARE1 = Component.text("§f稀有度:★ [普通]");
    public static final Component RARE2 = Component.text("§a稀有度:★★ [优秀]");
    public static final Component RARE3 = Component.text("§9稀有度:★★★ [精良]");
    public static final Component RARE4 = Component.text("§d稀有度:★★★★ [珍奇]");
    public static final Component RARE5 = Component.text("§e稀有度:★★★★★ [史诗]");
    public static final Component RARE6 = Component.text("§c稀有度:★★★★★★ [传说]");
    public static final Component RARE7 = Component.text("§4稀有度:★★★★★★★ [神器]");
    public static final Component RARE8 = Component.text("§6稀有度:★★★★★★★★ [上古]");

    public static final Component JOBZHAN = Component.text("§6适用职业:[战]");
    public static final Component JOBGONG = Component.text("§6适用职业:[弓]");
    public static final Component JOBDAN = Component.text("§6适用职业:[丹]");
    public static final Component JOBALL = Component.text("§6适用职业:[战] [弓] [丹]");

    public static final Component Act1 = Component.text("§6激活位: §b1");
    public static final Component Act2 = Component.text("§6激活位: §b2");
    public static final Component Act3 = Component.text("§6激活位: §b3");
    public static final Component Act4 = Component.text("§6激活位: §b4");
    public static final Component Act5 = Component.text("§6激活位: §b5");
    public static final Component Act6 = Component.text("§6激活位: §b6");
    public static final Component Act9 = Component.text("§6激活位: §b9");
    public static final Component ActFUSHOU = Component.text("§6激活位: §b副手");
    public static final Component ActSHIPIN1 = Component.text("§6激活位: §b饰品槽1");
    public static final Component ActSHIPIN2 = Component.text("§6激活位: §b饰品槽2");
    public static final Component ActSHIPIN3 = Component.text("§6激活位: §b饰品槽3");
    public static final Component ActSHIPIN4 = Component.text("§6激活位: §b饰品槽4");
    public static final Component ActSHIPIN5 = Component.text("§6激活位: §b饰品槽5");
    public static final Component ActSHIPIN6 = Component.text("§6激活位: §b饰品槽6");
    public static final Component ActSHIPIN7 = Component.text("§6激活位: §b饰品槽7");
    public static final Component ActSHIPIN8 = Component.text("§6激活位: §b饰品槽8");

    public static final Component CHARGE_1 = Component.text("§a快速装填§bI");
    public static final Component CHARGE_2 = Component.text("§a快速装填§bII");
    public static final Component CHARGE_3 = Component.text("§a快速装填§bIII");

    public static final Component SPEED_BI = Component.text("§a十分沉重，手持时无法移动");

    public static final Component SHORTSHUXIN = Component.text("§7〓〓〓〓〓〓〓〓§a装备属性§7〓〓〓〓〓〓〓〓");
    public static final Component SHORTJINENG = Component.text("§7〓〓〓〓〓〓〓〓§a装备技能§7〓〓〓〓〓〓〓〓");
    public static final Component SHORTFULINGXIANGQIAN = Component.text("§7〓〓〓〓〓〓〓〓§a附灵镶嵌§7〓〓〓〓〓〓〓〓");
    public static final Component SHORTXIANGQIAN = Component.text("§7〓〓〓〓〓〓〓〓§a镶嵌镶嵌§7〓〓〓〓〓〓〓〓");
    public static final Component MIDDLESHUXIN = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a装备属性§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    public static final Component MIDDLEJINENG = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a装备技能§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    public static final Component MIDDLEFULINGXIANGQIAN = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a附灵镶嵌§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    public static final Component MIDDLEXIANGQIAN = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a镶嵌镶嵌§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    public static final Component LONGSHUXIN = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a装备属性§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    public static final Component LONGJINENG = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a装备技能§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    public static final Component LONGFULINGXIANGQIAN = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a附灵镶嵌§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
    public static final Component LONGXIANGQIAN = Component.text("§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓§a镶嵌镶嵌§7〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");


    public static final Component FULING = Component.text("§a[附灵]: §f[无]");
    public static final Component XIANGQIAN = Component.text("§a[镶嵌]: §f[无]");

    public static String getPlainText(Component component) {
        return PlainTextComponentSerializer.plainText().serialize(component);
    }

}
