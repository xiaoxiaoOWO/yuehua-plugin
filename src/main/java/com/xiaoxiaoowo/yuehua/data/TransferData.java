package com.xiaoxiaoowo.yuehua.data;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;

public final class TransferData {
    public int job;
    public double attack;
    public double arrow;
    public double zhenfa;
    public double baoji;
    public double baojixiaoguo;
    public double cool_reduce;


    public double hujia;
    public double pojia;
    public double fakang;
    public double pofa;

    public double gedang;
    public double shouhu;
    public double renxing;
    public double shengji;


    //特殊免伤系列
    public double dumian;
    public double huomian;
    public double bingmian;
    public double jianmian;
    public double shuailuomian;
    public double sanchajimian;

    public double hp;
    public double max_hp;
    public int blind;

    public String toString() {
        return String.format("%d;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%d",
                job, attack, arrow, zhenfa, baoji*100, baojixiaoguo*100, cool_reduce*100, hujia*100, pojia*100, fakang*100, pofa*100, gedang, shouhu,
                renxing*100, shengji*100, dumian*100, huomian*100, bingmian*100, jianmian*100, shuailuomian*100, sanchajimian*100,hp,max_hp,blind);
    }

    public TransferData(Data data) {
        job = data.job;
        attack = data.attack;
        baoji = data.baoji;
        baojixiaoguo = data.baojixiaoguo;
        cool_reduce = data.cool_reduce;
        hujia = data.hujia;
        pojia = data.pojia;
        fakang = data.fakang;
        pofa = data.pofa;
        gedang = data.gedang;
        shouhu = data.shouhu;
        renxing = data.renxing;
        shengji = data.shengji;
        dumian = data.dumian;
        huomian = data.huomian;
        bingmian = data.bingmian;
        jianmian = data.jianmian;
        shuailuomian = data.shuailuomian;
        sanchajimian = data.sanchajimian;
        switch (data.job) {
            case 2 -> arrow = ((GongData) data).arrow;
            case 3 -> zhenfa = ((DanData) data).zhenfa;
        }
        Player player = data.player;
        hp = player.getHealth();
        max_hp = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();

    }
}
