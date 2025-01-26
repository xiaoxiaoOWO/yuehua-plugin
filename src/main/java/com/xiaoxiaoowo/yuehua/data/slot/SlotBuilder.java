package com.xiaoxiaoowo.yuehua.data.slot;


import com.xiaoxiaoowo.yuehua.data.slot.special.BeiDouMieShen;
import com.xiaoxiaoowo.yuehua.data.slot.special.Chong;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;

public final class SlotBuilder {
    public static SlotWithOneActiveSkill slot0Builder(String id, double real_cool) {
        switch (id) {
            case "taoMuJian", "kaiShanDao", "juTongZhanChui", "poKongFu", "sanBaoYuRuYi", "qinTongJian", "chiTongJian",
                 "taiJiJian", "yinYueQiang", "hongYinQiang", "youLongQiang", "huTouZhanJinQiang", "tengMuGong",
                 "qinTongGong", "yanTieGong", "zhongChuiGong", "heiTieNu", "hongLinNu", "jiaoLongNu",
                 "riYueLiuXingNu", "fuRongGong", "hongLuanGong", "tianQiongGong", "sheTianZhuiYueGong" -> {
                return new SlotWithOneActiveSkill(id, 0, GetEntity.world.getGameTime() + (long) (20 * 20 * real_cool));
            }

            case "beiDouMieShenGong" -> {
                return new BeiDouMieShen(id, 0, GetEntity.world.getGameTime() + (long) (20 * 20 * real_cool));
            }

            case "kunLunFeiXianJian" -> {
                return new SlotWithOneActiveSkill(id, 0, GetEntity.world.getGameTime() + (long) (60 * 20 * real_cool));
            }

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot1Builder(String id, double real_cool) {
        switch (id) {

            case "feiRen", "jinRuiFeiRen" -> {
                return new SlotWithOneActiveSkill(id, 0, GetEntity.world.getGameTime() + (long) (20 * 2));
            }

            case "heiTieChong", "huangTongChong" -> {
                return new Chong(id, 0, 0, GetEntity.world.getGameTime() + (long) (20 * 30), 3);
            }

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot2Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot3Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot4Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot5Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot8Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static Slot slot36Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot37Builder(String id, double real_cool) {
        switch (id) {
            case "tui1" -> {
                return new Slot(id, GetEntity.world.getGameTime() + (long) (10 * 20 * real_cool));
            }

            case "zhanTui2", "gongTui2", "danTui2", "zhanTui3", "gongTui3", "danTui3", "zhanTui4", "gongTui4",
                 "danTui4", "zhanTui5", "gongTui5", "danTui5" -> {
                return new Slot(id, GetEntity.world.getGameTime() + (long) (20 * 20 * real_cool));
            }

            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot38Builder(String id, double real_cool) {
        switch (id) {
            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot39Builder(String id, double real_cool) {
        switch (id) {
            case "tou1" -> {
                return new Slot(id, GetEntity.world.getGameTime() + (long) (10 * 20 * real_cool));
            }

            case "zhanTou2", "gongTou2", "danTou2", "zhanTou3", "gongTou3", "danTou3", "zhanTou4", "gongTou4",
                 "danTou4", "zhanTou5", "gongTou5", "danTou5" -> {
                return new Slot(id, GetEntity.world.getGameTime() + (long) (20 * 20 * real_cool));
            }

            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot40Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new Slot(id);
            }
        }
    }

    public static EnderChestSlot enderChestSlotBuilder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new EnderChestSlot(id);
            }
        }
    }


}
