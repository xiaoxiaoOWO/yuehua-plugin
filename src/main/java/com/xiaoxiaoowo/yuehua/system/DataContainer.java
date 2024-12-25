package com.xiaoxiaoowo.yuehua.system;

import org.bukkit.NamespacedKey;

public final class DataContainer {
    //物品数据
    public static final NamespacedKey slot;
    public static final NamespacedKey id;
    public static final NamespacedKey enchantid;
    public static final NamespacedKey insertid;
    public static final NamespacedKey seller;
    public static final NamespacedKey price;
    public static final NamespacedKey shooter;
    //实体数据

    //等级奖励
    public static final NamespacedKey levelAward;

    //附灵DLC数据
    public static final NamespacedKey dumian;
    public static final NamespacedKey huomian;
    public static final NamespacedKey bingmian;
    public static final NamespacedKey jianmian;
    public static final NamespacedKey shuailuomian;
    public static final NamespacedKey sanchajimian;


    //重华晶
    public static final NamespacedKey chonghualevel;
    public static final NamespacedKey chonghuacd;

    //复活点标记,副本标记,
    public static final NamespacedKey relife;
    public static final NamespacedKey relifeStoneCount;
    public static final NamespacedKey fuben;

    //基础数据
    //1->神族,2->仙族,3->人族,4->妖族,5->战神族
    public static final NamespacedKey race;

    //1->战士,2->弓箭手,3->炼丹师
    public static final NamespacedKey job;

    //冷却缩减百分比
    public static final NamespacedKey cool_reduce;
    public static final NamespacedKey cool_reduce_unlimited;


    //DLC数据
    public static final NamespacedKey hujia;
    public static final NamespacedKey pojia;
    public static final NamespacedKey fakang;
    public static final NamespacedKey pofa;
    public static final NamespacedKey gedang;
    public static final NamespacedKey shouhu;

    public static final NamespacedKey baoji;
    public static final NamespacedKey baojixiaoguo;

    public static final NamespacedKey renxing;
    public static final NamespacedKey shengji;

    public static final NamespacedKey branch;

    //战士数据
    public static final NamespacedKey attack;
    public static final NamespacedKey attack_add;
    public static final NamespacedKey attack_mul;


    //弓箭手数据
    public static final NamespacedKey arrow;
    public static final NamespacedKey arrow_add;
    public static final NamespacedKey arrow_mul;
    public static final NamespacedKey arrow_count;
    public static final NamespacedKey arrow_count_max;
    public static final NamespacedKey arrow_no_cost;
    public static final NamespacedKey arrow_pierce;
    public static final NamespacedKey is_bow;
    public static final NamespacedKey time_charging;


    //丹师数据
    public static final NamespacedKey zhenfa;
    public static final NamespacedKey zhenfa_add;
    public static final NamespacedKey zhenfa_mul;
    public static final NamespacedKey no_cost_1;
    public static final NamespacedKey no_cost_2;
    public static final NamespacedKey no_cost_3;

    //元素,钱存储
    public static final NamespacedKey money;
    public static final NamespacedKey JinCount;
    public static final NamespacedKey MuCount;
    public static final NamespacedKey ShuiCount;
    public static final NamespacedKey HuoCount;
    public static final NamespacedKey TuCount;

    public static final NamespacedKey RefinedJinCount;
    public static final NamespacedKey RefinedMuCount;
    public static final NamespacedKey RefinedShuiCount;
    public static final NamespacedKey RefinedHuoCount;
    public static final NamespacedKey RefinedTuCount;

    public static final NamespacedKey ConcentratedJinCount;
    public static final NamespacedKey ConcentratedMuCount;
    public static final NamespacedKey ConcentratedShuiCount;
    public static final NamespacedKey ConcentratedHuoCount;
    public static final NamespacedKey ConcentratedTuCount;


    //激活位数据
    public static final NamespacedKey slot0;
    public static final NamespacedKey slot1;
    public static final NamespacedKey slot2;
    public static final NamespacedKey slot3;
    public static final NamespacedKey slot4;
    public static final NamespacedKey slot5;
    public static final NamespacedKey slot8;

    //头是39，脚是36
    public static final NamespacedKey slot36;
    public static final NamespacedKey slot37;
    public static final NamespacedKey slot38;
    public static final NamespacedKey slot39;
    public static final NamespacedKey slot40;

    public static final NamespacedKey eslot0;
    public static final NamespacedKey eslot1;
    public static final NamespacedKey eslot2;
    public static final NamespacedKey eslot3;
    public static final NamespacedKey eslot4;
    public static final NamespacedKey eslot5;
    public static final NamespacedKey eslot6;
    public static final NamespacedKey eslot7;

    //特殊标记
    public static final NamespacedKey XianTaoCount;

    //环城
    public static final NamespacedKey huanChengTime;

    public static final NamespacedKey noInfor;
    public static final NamespacedKey noSound;
    public static final NamespacedKey jiuji;
    public static final NamespacedKey noInforDan;

    public static final NamespacedKey guajiCount;

    public static final NamespacedKey jinCd;
    public static final NamespacedKey muCd;
    public static final NamespacedKey shuiCd;
    public static final NamespacedKey huoCd;
    public static final NamespacedKey tuCd;

    public static final NamespacedKey checkCount;

    public static final NamespacedKey mainTask;

    public static final NamespacedKey xuanshanglevel;
    public static final NamespacedKey xuanshangCd;
    public static final NamespacedKey xuanshangId;

    public static final NamespacedKey advancementPoint;

    //东方骷髅，僵尸，蜘蛛
    public static final NamespacedKey killEastSkeletonConut;
    public static final NamespacedKey killEastZombieCount;
    public static final NamespacedKey killEastSpiderCount;

    //东方，枯骨弓箭手，毒蜂，僵尸精英，蜘蛛精英
    public static final NamespacedKey killEastArrowSkeletonCount;
    public static final NamespacedKey killEastPoisonFlyCount;
    public static final NamespacedKey killEastZombieEliteCount;
    public static final NamespacedKey killEastSpiderEliteCount;

    //东方山神庙僵尸，蜘蛛，弓箭手
    public static final NamespacedKey killEastZombieMountainCount;
    public static final NamespacedKey killEastSpiderMountainCount;
    public static final NamespacedKey killEastArrowSkeletonMountainCount;

    //东方神木妖精毒蜂，熊猫，弓箭手
    public static final NamespacedKey killEastPoisonFlyMountainCount;
    public static final NamespacedKey killEastPandaMountainCount;
    public static final NamespacedKey killEastArrowSkeletonSHENMUCount;

    //东方蜘蛛女王，水鬼，毒蜘蛛
    public static final NamespacedKey killEastSpiderQueenMountainCount;
    public static final NamespacedKey killEastWaterGhostMountainCount;
    public static final NamespacedKey killEastPoisonSpiderMountainCount;



    static {
        String namespace = "yh";

        advancementPoint = new NamespacedKey(namespace, "advancement_point");

        killEastSkeletonConut = new NamespacedKey(namespace, "kill_east_skeleton_count");
        killEastZombieCount = new NamespacedKey(namespace, "kill_east_zombie_count");
        killEastSpiderCount = new NamespacedKey(namespace, "kill_east_spider_count");

        killEastArrowSkeletonCount = new NamespacedKey(namespace, "kill_east_arrow_skeleton_count");
        killEastPoisonFlyCount = new NamespacedKey(namespace, "kill_east_poison_fly_count");
        killEastZombieEliteCount = new NamespacedKey(namespace, "kill_east_zombie_elite_count");
        killEastSpiderEliteCount = new NamespacedKey(namespace, "kill_east_spider_elite_count");

        killEastZombieMountainCount = new NamespacedKey(namespace, "kill_east_zombie_mountain_count");
        killEastSpiderMountainCount = new NamespacedKey(namespace, "kill_east_spider_mountain_count");
        killEastArrowSkeletonMountainCount = new NamespacedKey(namespace, "kill_east_arrow_skeleton_mountain_count");

        killEastPoisonFlyMountainCount = new NamespacedKey(namespace, "kill_east_poison_fly_mountain_count");
        killEastPandaMountainCount = new NamespacedKey(namespace, "kill_east_panda_mountain_count");
        killEastArrowSkeletonSHENMUCount = new NamespacedKey(namespace, "kill_east_arrow_skeleton_mountain2_count");

        killEastSpiderQueenMountainCount = new NamespacedKey(namespace, "kill_east_spider_queen_mountain_count");
        killEastWaterGhostMountainCount = new NamespacedKey(namespace, "kill_east_water_ghost_mountain_count");
        killEastPoisonSpiderMountainCount = new NamespacedKey(namespace, "kill_east_poison_spider_mountain_count");


        slot = new NamespacedKey(namespace, "slot");
        id = new NamespacedKey(namespace, "id");
        enchantid = new NamespacedKey(namespace, "enchantid");
        insertid = new NamespacedKey(namespace, "insertid");
        seller = new NamespacedKey(namespace, "seller");
        price = new NamespacedKey(namespace, "price");

        levelAward = new NamespacedKey(namespace, "level_award");

        dumian = new NamespacedKey(namespace, "dumian");
        huomian = new NamespacedKey(namespace, "huomian");
        bingmian = new NamespacedKey(namespace, "bingmian");
        jianmian = new NamespacedKey(namespace, "jianmian");
        shuailuomian = new NamespacedKey(namespace, "shuailuomian");
        sanchajimian = new NamespacedKey(namespace, "sanchajimian");

        chonghualevel = new NamespacedKey(namespace, "chonghualevel");
        chonghuacd = new NamespacedKey(namespace, "chonghuacd");


        relife = new NamespacedKey(namespace, "relife");
        fuben = new NamespacedKey(namespace, "fuben");
        relifeStoneCount = new NamespacedKey(namespace, "relifestonecount");

        race = new NamespacedKey(namespace, "race");
        job = new NamespacedKey(namespace, "job");


        cool_reduce = new NamespacedKey(namespace, "cool_reduce");
        cool_reduce_unlimited = new NamespacedKey(namespace, "cool_reduce_unlimited");

        hujia = new NamespacedKey(namespace, "hujia");
        pojia = new NamespacedKey(namespace, "pojia");
        fakang = new NamespacedKey(namespace, "fakang");
        pofa = new NamespacedKey(namespace, "pofa");
        gedang = new NamespacedKey(namespace, "gedang");
        shouhu = new NamespacedKey(namespace, "shouhu");

        baoji = new NamespacedKey(namespace, "baoji");
        baojixiaoguo = new NamespacedKey(namespace, "baojixiaoguo");
        renxing = new NamespacedKey(namespace, "renxing");
        shengji = new NamespacedKey(namespace, "shengji");
        branch = new NamespacedKey(namespace, "branch");


        attack = new NamespacedKey(namespace, "attack");
        attack_add = new NamespacedKey(namespace, "attack_add");
        attack_mul = new NamespacedKey(namespace, "attack_mul");


        arrow = new NamespacedKey(namespace, "arrow");
        arrow_add = new NamespacedKey(namespace, "arrow_add");
        arrow_mul = new NamespacedKey(namespace, "arrow_mul");
        arrow_count = new NamespacedKey(namespace, "arrow_count");
        arrow_count_max = new NamespacedKey(namespace, "arrow_count_max");
        arrow_no_cost = new NamespacedKey(namespace, "arrow_no_cost");
        arrow_pierce = new NamespacedKey(namespace, "arrow_pierce");
        is_bow = new NamespacedKey(namespace, "is_bow");
        time_charging = new NamespacedKey(namespace, "time_charging");


        zhenfa = new NamespacedKey(namespace, "zhenfa");
        zhenfa_add = new NamespacedKey(namespace, "zhenfa_add");
        zhenfa_mul = new NamespacedKey(namespace, "zhenfa_mul");
        no_cost_1 = new NamespacedKey(namespace, "no_cost_1");
        no_cost_2 = new NamespacedKey(namespace, "no_cost_2");
        no_cost_3 = new NamespacedKey(namespace, "no_cost_3");

        money = new NamespacedKey(namespace, "money");
        JinCount = new NamespacedKey(namespace, "jincount");
        MuCount = new NamespacedKey(namespace, "mucount");
        ShuiCount = new NamespacedKey(namespace, "shuicount");
        HuoCount = new NamespacedKey(namespace, "huocount");
        TuCount = new NamespacedKey(namespace, "tucount");

        RefinedJinCount = new NamespacedKey(namespace, "refinedjincount");
        RefinedMuCount = new NamespacedKey(namespace, "refinedmucount");
        RefinedShuiCount = new NamespacedKey(namespace, "refinedshuicount");
        RefinedHuoCount = new NamespacedKey(namespace, "refinedhuocount");
        RefinedTuCount = new NamespacedKey(namespace, "refinedtucount");

        ConcentratedJinCount = new NamespacedKey(namespace, "concentratedjincount");
        ConcentratedMuCount = new NamespacedKey(namespace, "concentratedmucount");
        ConcentratedShuiCount = new NamespacedKey(namespace, "concentratedshuicount");
        ConcentratedHuoCount = new NamespacedKey(namespace, "concentratedhuocount");
        ConcentratedTuCount = new NamespacedKey(namespace, "concentratedtucount");


        slot0 = new NamespacedKey(namespace, "slot0");
        slot1 = new NamespacedKey(namespace, "slot1");
        slot2 = new NamespacedKey(namespace, "slot2");
        slot3 = new NamespacedKey(namespace, "slot3");
        slot4 = new NamespacedKey(namespace, "slot4");
        slot5 = new NamespacedKey(namespace, "slot5");
        slot8 = new NamespacedKey(namespace, "slot8");
        slot36 = new NamespacedKey(namespace, "slot36");
        slot37 = new NamespacedKey(namespace, "slot37");
        slot38 = new NamespacedKey(namespace, "slot38");
        slot39 = new NamespacedKey(namespace, "slot39");
        slot40 = new NamespacedKey(namespace, "slot40");

        eslot0 = new NamespacedKey(namespace, "eslot0");
        eslot1 = new NamespacedKey(namespace, "eslot1");
        eslot2 = new NamespacedKey(namespace, "eslot2");
        eslot3 = new NamespacedKey(namespace, "eslot3");
        eslot4 = new NamespacedKey(namespace, "eslot4");
        eslot5 = new NamespacedKey(namespace, "eslot5");
        eslot6 = new NamespacedKey(namespace, "eslot6");
        eslot7 = new NamespacedKey(namespace, "eslot7");

        XianTaoCount = new NamespacedKey(namespace, "xiantaocount");
        huanChengTime = new NamespacedKey(namespace, "huanchengtime");

        noInfor = new NamespacedKey(namespace, "noinfor");
        noSound = new NamespacedKey(namespace, "nosound");
        jiuji = new NamespacedKey(namespace, "jiuji");
        noInforDan = new NamespacedKey(namespace, "noinfodan");
        guajiCount = new NamespacedKey(namespace, "guajicount");

        jinCd = new NamespacedKey(namespace, "jincd");
        muCd = new NamespacedKey(namespace, "mucd");
        shuiCd = new NamespacedKey(namespace, "shuicd");
        huoCd = new NamespacedKey(namespace, "huocd");
        tuCd = new NamespacedKey(namespace, "tucd");

        checkCount = new NamespacedKey(namespace, "checkcount");
        shooter = new NamespacedKey(namespace, "shooter");

        mainTask = new NamespacedKey(namespace, "maintask");
        xuanshanglevel = new NamespacedKey(namespace, "xuanshanglevel");
        xuanshangCd = new NamespacedKey(namespace, "xuanshangcd");
        xuanshangId = new NamespacedKey(namespace, "xuanshangid");

    }
}
