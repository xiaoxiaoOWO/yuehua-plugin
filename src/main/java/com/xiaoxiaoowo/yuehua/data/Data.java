package com.xiaoxiaoowo.yuehua.data;


import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.HpMul;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.Speed;
import com.xiaoxiaoowo.yuehua.data.slot.EnderChestSlot;
import com.xiaoxiaoowo.yuehua.data.slot.Slot;
import com.xiaoxiaoowo.yuehua.data.slot.SlotBuilder;
import com.xiaoxiaoowo.yuehua.data.slot.SlotWithOneActiveSkill;
import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.system.Act;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Init;
import com.xiaoxiaoowo.yuehua.task.player.BGM;
import com.xiaoxiaoowo.yuehua.utils.SQL;
import com.xiaoxiaoowo.yuehua.utils.Transfer;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.java_websocket.WebSocket;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.xiaoxiaoowo.yuehua.event.player.InventorySlotChange.BANGDINGID;
import static com.xiaoxiaoowo.yuehua.event.player.InventorySlotChange.checkCanActLevel6;


public class Data {
    public Player player;


    public Set<String> deathObservers;
    public Set<String> jiNengObservers;
    public Set<String> attackObservers;
    public Set<String> baoJiObservers;
    public Set<String> killMonsterObservers;

    public Set<String> wuliAttackedObservers;
    public Set<String> fashuAttackedObservers;
    public Set<String> attackedObservers;

    public Set<String> curedObservers;
    public Set<String> getHuDunObservers;

    public Map<String, Object> extraData;

    public Mob lastAttacker;

    //打开容器时设置为true
    public boolean open = false;

    public boolean canAttack = true;
    public boolean canJiNeng = true;

    public boolean noinfor;
    public boolean nosound;

    public long lastBGM = 0L;
    public int snowBlind = 0;
    public int yezi = 0;
    public int zhusi = 0;
    public int soul = 0;

    public int mustBaoji = 0;

    public int nextCheckCount;
    public Location checkLoc;
    public int checkState = 0;

    //时效性的属性存储于这里，玩家退出后将会消失，为了避免对正常游戏造成影响，尽量少使用长时效的BUFF
    public double attack;
    public double attack_score;
    public double attack_add;
    public double attack_mul;


    public double baoji;
    public double baoji_score;
    public double baoji_add;


    public double baojixiaoguo;
    public double baojixiaoguo_score;
    public double baojixiaoguo_add;

    public double hujia;
    public double hujia_score;
    public double hujia_add;

    public double pojia;
    public double pojia_score;
    public double pojia_add;


    public double fakang;
    public double fakang_score;
    public double fakang_add;


    public double pofa;
    public double pofa_score;
    public double pofa_add;

    public double gedang;
    public double gedang_score;
    public double gedang_add;

    public double shouhu;
    public double shouhu_score;
    public double shouhu_add;

    public double renxing;
    public double renxing_score;
    public double renxing_add;

    public double shengji;
    public double shengji_score;
    public double shengji_add;

    public double cool_reduce;
    public double cool_reduce_score;
    public double cool_reduce_add;
    public double cool_reduce_unlimited;
    public double real_cool;

    public int branch;
    public int job;
    public int race;

    //特殊免伤系列
    public double dumian;
    public double huomian;
    public double bingmian;
    public double jianmian;
    public double shuailuomian;
    public double sanchajimian;

    public double dumian_add;
    public double huomian_add;
    public double bingmian_add;
    public double jianmian_add;
    public double shuailuomian_add;
    public double sanchajimian_add;

    public double dumian_score;
    public double huomian_score;
    public double bingmian_score;
    public double jianmian_score;
    public double shuailuomian_score;
    public double sanchajimian_score;


    public int money;
    public int jinCount;
    public int muCount;
    public int shuiCount;
    public int huoCount;
    public int tuCount;

    public int refinedJinCount;
    public int refinedMuCount;
    public int refinedShuiCount;
    public int refinedHuoCount;
    public int refinedTuCount;

    public int concentratedJinCount;
    public int concentratedMuCount;
    public int concentratedShuiCount;
    public int concentratedHuoCount;
    public int concentratedTuCount;

    public int killEastSkeletonConut;
    public int killEastZombieCount;
    public int killEastSpiderCount;

    public int killEastArrowSkeletonCount;
    public int killEastPoisonFlyCount;
    public int killEastZombieEliteCount;
    public int killEastSpiderEliteCount;

    public int killEastZombieMountainCount;
    public int killEastSpiderMountainCount;
    public int killEastArrowSkeletonMountainCount;

    public int killEastPoisonFlyMountainCount;
    public int killEastPandaMountainCount;
    public int killEastArrowSkeletonSHENMUCount;

    public int killEastSpiderQueenMountainCount;
    public int killEastWaterGhostMountainCount;
    public int killEastPoisonSpiderMountainCount;

    public int fuben;

    public SlotWithOneActiveSkill slot0;
    public SlotWithOneActiveSkill slot1;
    public SlotWithOneActiveSkill slot2;
    public Slot slot36;
    public Slot slot37;
    public Slot slot38;
    public Slot slot39;
    public Slot slot40;

    public SlotWithOneActiveSkill slot8;


    public EnderChestSlot eSlot0;
    public EnderChestSlot eSlot1;
    public EnderChestSlot eSlot2;
    public EnderChestSlot eSlot3;
    public EnderChestSlot eSlot4;
    public EnderChestSlot eSlot5;
    public EnderChestSlot eSlot6;
    public EnderChestSlot eSlot7;


    //乾坤袋
    public Inventory inventory1;
    public Inventory inventory2;
    public Inventory inventory3;
    public Inventory inventory4;
    public Inventory inventory5;
    public Inventory inventory6;
    public Inventory inventory7;
    public Inventory inventory8;
    public Inventory inventory9;
    public Inventory inventory10;
    public Inventory inventory11;
    public Inventory inventory12;
    public Inventory inventory13;
    public Inventory inventory14;
    public Inventory inventory15;
    public Inventory inventory16;
    public Inventory inventory17;
    public Inventory inventory18;

    //饰品槽
    public Inventory shipinBar;

    public WebSocket webSocket;

    public Data() {
    }


    public Data(Player player) {
        this.player = player;

        deathObservers = new HashSet<>(4);
        jiNengObservers = new HashSet<>(10);
        baoJiObservers = new HashSet<>(5);
        attackObservers = new HashSet<>(10);
        killMonsterObservers = new HashSet<>(8);
        killMonsterObservers.add("check");
        killMonsterObservers.add("count");

        wuliAttackedObservers = new HashSet<>(10);
        fashuAttackedObservers = new HashSet<>(10);
        attackedObservers = new HashSet<>(20);
        curedObservers = new HashSet<>(5);
        getHuDunObservers = new HashSet<>(5);
        extraData = new HashMap<>(20);

        PersistentDataContainer pdc = player.getPersistentDataContainer();

        PlayerInventory playerInventory = player.getInventory();
        shipinBar = SQL.retrieveShipin(player);


        //非激活的常驻数据
        job = pdc.get(DataContainer.job, PersistentDataType.INTEGER);
        branch = pdc.get(DataContainer.branch, PersistentDataType.INTEGER);
        race = pdc.get(DataContainer.race, PersistentDataType.INTEGER);
        noinfor = pdc.get(DataContainer.noInfor, PersistentDataType.BOOLEAN);
        nosound = pdc.get(DataContainer.noSound, PersistentDataType.BOOLEAN);
        fuben = pdc.get(DataContainer.fuben, PersistentDataType.INTEGER);

        money = pdc.get(DataContainer.money, PersistentDataType.INTEGER);
        jinCount = pdc.get(DataContainer.JinCount, PersistentDataType.INTEGER);
        muCount = pdc.get(DataContainer.MuCount, PersistentDataType.INTEGER);
        shuiCount = pdc.get(DataContainer.ShuiCount, PersistentDataType.INTEGER);
        huoCount = pdc.get(DataContainer.HuoCount, PersistentDataType.INTEGER);
        tuCount = pdc.get(DataContainer.TuCount, PersistentDataType.INTEGER);
        refinedJinCount = pdc.get(DataContainer.RefinedJinCount, PersistentDataType.INTEGER);
        refinedMuCount = pdc.get(DataContainer.RefinedMuCount, PersistentDataType.INTEGER);
        refinedShuiCount = pdc.get(DataContainer.RefinedShuiCount, PersistentDataType.INTEGER);
        refinedHuoCount = pdc.get(DataContainer.RefinedHuoCount, PersistentDataType.INTEGER);
        refinedTuCount = pdc.get(DataContainer.RefinedTuCount, PersistentDataType.INTEGER);
        concentratedJinCount = pdc.get(DataContainer.ConcentratedJinCount, PersistentDataType.INTEGER);
        concentratedMuCount = pdc.get(DataContainer.ConcentratedMuCount, PersistentDataType.INTEGER);
        concentratedShuiCount = pdc.get(DataContainer.ConcentratedShuiCount, PersistentDataType.INTEGER);
        concentratedHuoCount = pdc.get(DataContainer.ConcentratedHuoCount, PersistentDataType.INTEGER);
        concentratedTuCount = pdc.get(DataContainer.ConcentratedTuCount, PersistentDataType.INTEGER);

        killEastSkeletonConut = pdc.get(DataContainer.killEastSkeletonConut, PersistentDataType.INTEGER);
        killEastZombieCount = pdc.get(DataContainer.killEastZombieCount, PersistentDataType.INTEGER);
        killEastSpiderCount = pdc.get(DataContainer.killEastSpiderCount, PersistentDataType.INTEGER);

        killEastArrowSkeletonCount = pdc.get(DataContainer.killEastArrowSkeletonCount, PersistentDataType.INTEGER);
        killEastPoisonFlyCount = pdc.get(DataContainer.killEastPoisonFlyCount, PersistentDataType.INTEGER);
        killEastZombieEliteCount = pdc.get(DataContainer.killEastZombieEliteCount, PersistentDataType.INTEGER);
        killEastSpiderEliteCount = pdc.get(DataContainer.killEastSpiderEliteCount, PersistentDataType.INTEGER);

        killEastZombieMountainCount = pdc.get(DataContainer.killEastZombieMountainCount, PersistentDataType.INTEGER);
        killEastSpiderMountainCount = pdc.get(DataContainer.killEastSpiderMountainCount, PersistentDataType.INTEGER);
        killEastArrowSkeletonMountainCount = pdc.get(DataContainer.killEastArrowSkeletonMountainCount, PersistentDataType.INTEGER);

        killEastPoisonFlyMountainCount = pdc.get(DataContainer.killEastPoisonFlyMountainCount, PersistentDataType.INTEGER);
        killEastPandaMountainCount = pdc.get(DataContainer.killEastPandaMountainCount, PersistentDataType.INTEGER);
        killEastArrowSkeletonSHENMUCount = pdc.get(DataContainer.killEastArrowSkeletonSHENMUCount, PersistentDataType.INTEGER);

        killEastSpiderQueenMountainCount = pdc.get(DataContainer.killEastSpiderQueenMountainCount, PersistentDataType.INTEGER);
        killEastWaterGhostMountainCount = pdc.get(DataContainer.killEastWaterGhostMountainCount, PersistentDataType.INTEGER);
        killEastPoisonSpiderMountainCount = pdc.get(DataContainer.killEastPoisonSpiderMountainCount, PersistentDataType.INTEGER);

        nextCheckCount = pdc.get(DataContainer.checkCount, PersistentDataType.INTEGER);

        //获取装备ID

        //还原基础属性
        //攻击速度
        player.getAttribute(Attribute.ATTACK_SPEED).setBaseValue(1);
        //攻击距离
        player.getAttribute(Attribute.ENTITY_INTERACTION_RANGE).setBaseValue(3);
        //移速
        player.getAttribute(Attribute.MOVEMENT_SPEED).setBaseValue(0.1);
        //跳跃力
        player.getAttribute(Attribute.JUMP_STRENGTH).setBaseValue(0.42);
        //生命
        player.getAttribute(Attribute.MAX_HEALTH).setBaseValue(20);
        //定力
        player.getAttribute(Attribute.ARMOR).setBaseValue(0);

        //清理修饰符
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.touSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.xiongSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.tuiSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.xieSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.weaponSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.biweaponSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.yiqiSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.shipinSpeed);
        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.xiantianSpeed);


        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.touHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.xiongHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.tuiHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.xieHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.weaponHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.biweaponHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.yiqiHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.shipinHp);
        player.getAttribute(Attribute.MAX_HEALTH).removeModifier(HpMul.xiantainHp);

        //特殊减伤
        pdc.set(DataContainer.dumian, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.huomian, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.bingmian, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.jianmian, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, 0.0);

        //公用特殊属性
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.pojia, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.fakang, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.shouhu, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.baoji, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, 1.5);
        pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, 1.0);
        pdc.set(DataContainer.cool_reduce, PersistentDataType.DOUBLE, 0.0);
        pdc.set(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE, 0.0);

        //近战属性
        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, 1.0);
        pdc.set(DataContainer.attack_mul, PersistentDataType.DOUBLE, 1.0);
        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, 1.0);

        pdc.set(DataContainer.slot8, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot0, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot1, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot2, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot3, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot4, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot5, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot6, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.eslot7, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot0, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot1, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot2, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot36, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot37, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot38, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot39, PersistentDataType.STRING, "null");
        pdc.set(DataContainer.slot40, PersistentDataType.STRING, "null");


        //弓丹额外祛激活
        switch (job) {
            case 2 -> {
                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.arrow_mul, PersistentDataType.DOUBLE, 1.0);
                pdc.set(DataContainer.arrow_count_max, PersistentDataType.INTEGER, 0);
                pdc.set(DataContainer.arrow_no_cost, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.arrow_pierce, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.is_bow, PersistentDataType.BOOLEAN, false);
            }

            case 3 -> {
                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE, 1.0);
                pdc.set(DataContainer.no_cost_1, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.no_cost_2, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.no_cost_3, PersistentDataType.DOUBLE, 0.0);
                pdc.set(DataContainer.slot3, PersistentDataType.STRING, "null");
                pdc.set(DataContainer.slot4, PersistentDataType.STRING, "null");
                pdc.set(DataContainer.slot5, PersistentDataType.STRING, "null");
            }
        }


        //开始激活


        ItemStack item0 = playerInventory.getItem(0);
        if (item0 != null) {
            Material type = item0.getType();
            if (type == Material.PRISMARINE_SHARD || type == Material.BOW || type == Material.CROSSBOW || type == Material.ANGLER_POTTERY_SHERD) {
                PersistentDataContainer pdcItem0 = item0.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcItem0.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (0 == pdcItem0.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        if (job == pdcItem0.get(DataContainer.job, PersistentDataType.INTEGER)) {
                            Act.actHelp(this, idPdc, pdc);
                            if (job != 3) {
                                //取出镶嵌ID和附灵ID
                                String insertId = pdcItem0.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdcItem0.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(this, enchantId);
                                Act.actInsert(this, insertId);
                            }
                        }
                    }
                }
            }
        }


        ItemStack item1 = playerInventory.getItem(1);
        if (item1 != null) {
            Material type1 = item1.getType();
            if (type1 == Material.PRISMARINE_SHARD) {
                PersistentDataContainer pdcItem1 = item1.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcItem1.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (1 == pdcItem1.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        if (job == pdcItem1.get(DataContainer.job, PersistentDataType.INTEGER)) {
                            Act.actHelp(this, idPdc, pdc);
                            //取出镶嵌ID
                            String insertId = pdcItem1.get(DataContainer.insertid, PersistentDataType.STRING);
                            //激活镶嵌
                            Act.actInsert(this, insertId);

                        }
                    }
                }
            }
        }


        ItemStack item2 = playerInventory.getItem(2);
        if (item2 != null) {
            Material type2 = item2.getType();
            if (type2 == Material.PRISMARINE_SHARD) {
                PersistentDataContainer pdcItem2 = item2.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcItem2.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (2 == pdcItem2.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        if (job == pdcItem2.get(DataContainer.job, PersistentDataType.INTEGER)) {
                            Act.actHelp(this, idPdc, pdc);
                        }
                    }
                }
            }
        }


        ItemStack item8 = playerInventory.getItem(8);
        if (item8 != null) {
            Material type8 = item8.getType();
            if (type8 == Material.PRISMARINE_CRYSTALS) {
                PersistentDataContainer pdcItem8 = item8.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcItem8.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (8 == pdcItem8.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }

        }


        ItemStack item36 = playerInventory.getItem(36);
        if (item36 != null) {
            PersistentDataContainer pdcItem36 = item36.getItemMeta().getPersistentDataContainer();
            String idPdc = pdcItem36.get(DataContainer.id, PersistentDataType.STRING);
            if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                if (36 == pdcItem36.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                    int pdcJob = pdcItem36.get(DataContainer.job, PersistentDataType.INTEGER);
                    if (job == pdcJob || pdcJob == 0) {
                        Act.actHelp(this, idPdc, pdc);
                        //取出镶嵌ID和附灵ID
                        String insertId = pdcItem36.get(DataContainer.insertid, PersistentDataType.STRING);
                        String enchantId = pdcItem36.get(DataContainer.enchantid, PersistentDataType.STRING);
                        //激活附灵和镶嵌
                        Act.actFuling(this, enchantId);
                        Act.actInsert(this, insertId);
                    }
                }
            }
        }


        ItemStack item37 = playerInventory.getItem(37);
        if (item37 != null) {
            PersistentDataContainer pdcItem37 = item37.getItemMeta().getPersistentDataContainer();
            String idPdc = pdcItem37.get(DataContainer.id, PersistentDataType.STRING);
            if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                if (37 == pdcItem37.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                    int pdcJob = pdcItem37.get(DataContainer.job, PersistentDataType.INTEGER);
                    if (job == pdcJob || pdcJob == 0) {
                        Act.actHelp(this, idPdc, pdc);
                        //取出镶嵌ID和附灵ID
                        String insertId = pdcItem37.get(DataContainer.insertid, PersistentDataType.STRING);
                        String enchantId = pdcItem37.get(DataContainer.enchantid, PersistentDataType.STRING);
                        //激活附灵和镶嵌
                        Act.actFuling(this, enchantId);
                        Act.actInsert(this, insertId);
                    }
                }
            }
        }


        ItemStack item38 = playerInventory.getItem(38);
        if (item38 != null) {
            PersistentDataContainer pdcItem38 = item38.getItemMeta().getPersistentDataContainer();
            String idPdc = pdcItem38.get(DataContainer.id, PersistentDataType.STRING);
            if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                if (38 == pdcItem38.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                    int pdcJob = pdcItem38.get(DataContainer.job, PersistentDataType.INTEGER);
                    if (job == pdcJob || pdcJob == 0) {
                        Act.actHelp(this, idPdc, pdc);

                        //取出镶嵌ID和附灵ID
                        String insertId = pdcItem38.get(DataContainer.insertid, PersistentDataType.STRING);
                        String enchantId = pdcItem38.get(DataContainer.enchantid, PersistentDataType.STRING);
                        //激活附灵和镶嵌
                        Act.actFuling(this, enchantId);
                        Act.actInsert(this, insertId);
                    }
                }
            }
        }


        ItemStack item39 = playerInventory.getItem(39);
        if (item39 != null) {
            PersistentDataContainer pdcItem39 = item39.getItemMeta().getPersistentDataContainer();
            String idPdc = pdcItem39.get(DataContainer.id, PersistentDataType.STRING);
            if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                if (39 == pdcItem39.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                    int pdcJob = pdcItem39.get(DataContainer.job, PersistentDataType.INTEGER);
                    if (job == pdcJob || pdcJob == 0) {
                        Act.actHelp(this, idPdc, pdc);

                        //取出镶嵌ID和附灵ID
                        String insertId = pdcItem39.get(DataContainer.insertid, PersistentDataType.STRING);
                        String enchantId = pdcItem39.get(DataContainer.enchantid, PersistentDataType.STRING);
                        //激活附灵和镶嵌
                        Act.actFuling(this, enchantId);
                        Act.actInsert(this, insertId);
                    }
                }
            }
        }


        ItemStack item40 = playerInventory.getItem(40);
        if (item40 != null) {
            Material type40 = item40.getType();
            if (type40 == Material.SHIELD || type40 == Material.RABBIT_HIDE) {
                PersistentDataContainer pdcItem40 = item40.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcItem40.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (40 == pdcItem40.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        if (job == pdcItem40.get(DataContainer.job, PersistentDataType.INTEGER)) {
                            Act.actHelp(this, idPdc, pdc);
                            if (job == 3) {
                                //取出镶嵌ID和附灵ID
                                String insertId = pdcItem40.get(DataContainer.insertid, PersistentDataType.STRING);
                                String enchantId = pdcItem40.get(DataContainer.enchantid, PersistentDataType.STRING);
                                //激活附灵和镶嵌
                                Act.actFuling(this, enchantId);
                                Act.actInsert(this, insertId);
                            }
                        }
                    }
                }
            }
        }


        //饰品激活


        ItemStack eItem0 = shipinBar.getItem(0);
        if (eItem0 != null) {
            if (eItem0.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem0 = eItem0.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem0.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (0 == pdcEItem0.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        ItemStack eItem1 = shipinBar.getItem(1);
        if (eItem1 != null) {
            if (eItem1.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem1 = eItem1.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem1.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (1 == pdcEItem1.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        ItemStack eItem2 = shipinBar.getItem(2);
        if (eItem2 != null) {
            if (eItem2.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem2 = eItem2.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem2.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (2 == pdcEItem2.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        ItemStack eItem3 = shipinBar.getItem(3);
        if (eItem3 != null) {
            if (eItem3.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem3 = eItem3.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem3.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (3 == pdcEItem3.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        ItemStack eItem4 = shipinBar.getItem(4);
        if (eItem4 != null) {
            if (eItem4.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem4 = eItem4.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem4.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (4 == pdcEItem4.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        ItemStack eItem5 = shipinBar.getItem(5);
        if (eItem5 != null) {
            if (eItem5.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem5 = eItem5.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem5.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (5 == pdcEItem5.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        ItemStack eItem6 = shipinBar.getItem(6);
        if (eItem6 != null) {
            if (eItem6.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem6 = eItem6.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem6.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (6 == pdcEItem6.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        ItemStack eItem7 = shipinBar.getItem(7);
        if (eItem7 != null) {
            if (eItem7.getType() == Material.ARMS_UP_POTTERY_SHERD) {
                PersistentDataContainer pdcEItem7 = eItem7.getItemMeta().getPersistentDataContainer();
                String idPdc = pdcEItem7.get(DataContainer.id, PersistentDataType.STRING);
                if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                    if (7 == pdcEItem7.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                        Act.actHelp(this, idPdc, pdc);
                    }
                }
            }
        }


        //炼丹额外激活
        if (job == 3) {


            ItemStack item3 = playerInventory.getItem(3);
            if (item3 != null) {
                Material type3 = item3.getType();
                if (type3 == Material.PRISMARINE_SHARD) {
                    PersistentDataContainer pdcItem3 = item3.getItemMeta().getPersistentDataContainer();
                    String idPdc = pdcItem3.get(DataContainer.id, PersistentDataType.STRING);
                    if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                        if (3 == pdcItem3.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                            if (job == pdcItem3.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                Act.actHelp(this, idPdc, pdc);
                            }
                        }
                    }
                }
            }


            ItemStack item4 = playerInventory.getItem(4);
            if (item4 != null) {
                Material type4 = item4.getType();
                if (type4 == Material.PRISMARINE_SHARD) {
                    PersistentDataContainer pdcItem4 = item4.getItemMeta().getPersistentDataContainer();
                    String idPdc = pdcItem4.get(DataContainer.id, PersistentDataType.STRING);
                    if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                        if (4 == pdcItem4.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                            if (job == pdcItem4.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                Act.actHelp(this, idPdc, pdc);
                            }
                        }
                    }
                }
            }


            ItemStack item5 = playerInventory.getItem(5);
            if (item5 != null) {
                Material type5 = item5.getType();

                if (type5 == Material.PRISMARINE_SHARD) {
                    PersistentDataContainer pdcItem5 = item5.getItemMeta().getPersistentDataContainer();
                    String idPdc = pdcItem5.get(DataContainer.id, PersistentDataType.STRING);
                    if (!BANGDINGID.contains(idPdc) || checkCanActLevel6(player, idPdc)) {
                        if (5 == pdcItem5.get(DataContainer.slot, PersistentDataType.INTEGER)) {
                            if (job == pdcItem5.get(DataContainer.job, PersistentDataType.INTEGER)) {
                                Act.actHelp(this, idPdc, pdc);
                            }
                        }
                    }
                }
            }


        }

        //等级奖励
        int levelAward = player.getLevel() / 10;
        pdc.set(DataContainer.levelAward, PersistentDataType.INTEGER, levelAward);
        //种族增益,神族为最大生命，仙族为破法，人族为格挡，战神族为进攻属性，妖族为生机
        switch (race) {
            case 1 -> {
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue + 16 * levelAward);
            }
            case 2 -> {
                double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue + 0.01 * levelAward);
            }
            case 3 -> {
                double baseValue = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.gedang, PersistentDataType.DOUBLE, baseValue + 2 * levelAward);
            }
            case 5 -> {
                switch (job) {
                    case 1 -> {
                        double baseValue = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                        pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue + 6 * levelAward);
                        double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                        double finalValue = mulValue * (baseValue + 6 * levelAward);
                        pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                    }
                    case 2 -> {
                        double baseValue = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
                        pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue + 2 * levelAward);
                        double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
                        double finalValue = mulValue * (baseValue + 2 * levelAward);
                        pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                    }
                    case 3 -> {
                        double baseValue = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
                        pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue + 2 * levelAward);
                        double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
                        double finalValue = mulValue * (baseValue + 2 * levelAward);
                        pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                    }

                }
            }
            case 4 -> {
                double baseValue = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shengji, PersistentDataType.DOUBLE, baseValue + 0.01 * levelAward);
            }
        }

        //职业增益
        switch (job) {
            case 1 -> {
                //战士，每次获得4护甲4法抗12攻击
                double baseValue = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, baseValue + 0.02 * levelAward);
                double baseValue3 = pdc.get(DataContainer.attack_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.attack_add, PersistentDataType.DOUBLE, baseValue3 + 12 * levelAward);
                double mulValue = pdc.get(DataContainer.attack_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue3 + 12 * levelAward);
                pdc.set(DataContainer.attack, PersistentDataType.DOUBLE, finalValue);
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue4 = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue4 + 32 * levelAward);
                double baseValue5 = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shouhu, PersistentDataType.DOUBLE, baseValue5 + 16 * levelAward);
            }
            case 2 -> {
                //弓箭手，每次获得1韧性和4箭矢强度
                double baseValue = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.renxing, PersistentDataType.DOUBLE, baseValue + 0.01 * levelAward);
                double baseValue2 = pdc.get(DataContainer.arrow_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.arrow_add, PersistentDataType.DOUBLE, baseValue2 + 4 * levelAward);
                double mulValue = pdc.get(DataContainer.arrow_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue2 + 4 * levelAward);
                pdc.set(DataContainer.arrow, PersistentDataType.DOUBLE, finalValue);
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue4 = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue4 + 32 * levelAward);
                double baseValue5 = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shouhu, PersistentDataType.DOUBLE, baseValue5 + 16 * levelAward);
            }
            case 3 -> {
                //炼丹师，每次获得1破法和4阵法强度
                double baseValue = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.pofa, PersistentDataType.DOUBLE, baseValue + 0.01 * levelAward);
                double baseValue2 = pdc.get(DataContainer.zhenfa_add, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.zhenfa_add, PersistentDataType.DOUBLE, baseValue2 + 4 * levelAward);
                double mulValue = pdc.get(DataContainer.zhenfa_mul, PersistentDataType.DOUBLE);
                double finalValue = mulValue * (baseValue2 + 4 * levelAward);
                pdc.set(DataContainer.zhenfa, PersistentDataType.DOUBLE, finalValue);
                AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
                double baseValue4 = attributeInstance.getBaseValue();
                attributeInstance.setBaseValue(baseValue4 + 32 * levelAward);
                double baseValue5 = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
                pdc.set(DataContainer.shouhu, PersistentDataType.DOUBLE, baseValue5 + 16 * levelAward);
            }
        }

        //支线任务激活
        Set<String> tags = player.getScoreboardTags();
        if (tags.contains("jianyi")) {
            AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 32);
        }

        if (tags.contains("yuzhuzijue")) {
            AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 32);
        }


        if (tags.contains("racezhixian")) {
            AttributeInstance attributeInstance = player.getAttribute(Attribute.MAX_HEALTH);
            double baseValue = attributeInstance.getBaseValue();
            attributeInstance.setBaseValue(baseValue + 32);
        }

        PotionEffect strength = player.getPotionEffect(PotionEffectType.STRENGTH);
        if (strength != null) {
            int level = strength.getAmplifier();
            switch (level) {
                case 0 -> this.deathObservers.add("strength1");
                case 1 -> this.deathObservers.add("strength2");
                case 2 -> this.deathObservers.add("strength3");
                case 3 -> this.deathObservers.add("strength4");
                case 4 -> this.deathObservers.add("strength5");
            }
        }


        //防止未激活任何装备导致没有属性设置

        dumian_score = pdc.get(DataContainer.dumian, PersistentDataType.DOUBLE);
        huomian_score = pdc.get(DataContainer.huomian, PersistentDataType.DOUBLE);
        bingmian_score = pdc.get(DataContainer.bingmian, PersistentDataType.DOUBLE);
        jianmian_score = pdc.get(DataContainer.jianmian, PersistentDataType.DOUBLE);
        shuailuomian_score = pdc.get(DataContainer.shuailuomian, PersistentDataType.DOUBLE);
        sanchajimian_score = pdc.get(DataContainer.sanchajimian, PersistentDataType.DOUBLE);

        attack_score = pdc.get(DataContainer.attack, PersistentDataType.DOUBLE);
        baoji_score = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        baojixiaoguo_score = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        hujia_score = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        pojia_score = pdc.get(DataContainer.pojia, PersistentDataType.DOUBLE);
        gedang_score = pdc.get(DataContainer.gedang, PersistentDataType.DOUBLE);
        shouhu_score = pdc.get(DataContainer.shouhu, PersistentDataType.DOUBLE);
        fakang_score = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        pofa_score = pdc.get(DataContainer.pofa, PersistentDataType.DOUBLE);
        renxing_score = pdc.get(DataContainer.renxing, PersistentDataType.DOUBLE);
        shengji_score = pdc.get(DataContainer.shengji, PersistentDataType.DOUBLE);
        cool_reduce_score = pdc.get(DataContainer.cool_reduce, PersistentDataType.DOUBLE);
        cool_reduce_unlimited = pdc.get(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE);


        //时效数据
        attack_add = 0.0;
        attack_mul = 1.0;
        baoji_add = 0.0;
        baojixiaoguo_add = 0.0;
        hujia_add = 0.0;
        pojia_add = 0.0;
        gedang_add = 0.0;
        shouhu_add = 0.0;
        fakang_add = 0.0;
        pofa_add = 0.0;
        renxing_add = 0.0;
        shengji_add = 0.0;
        cool_reduce_add = 0.0;
        real_cool = 1.0;
        dumian_add = 0.0;
        huomian_add = 0.0;
        bingmian_add = 0.0;
        jianmian_add = 0.0;
        shuailuomian_add = 0.0;
        sanchajimian_add = 0.0;

        //更新属性
        updateAttack();

        updateBaoji();

        updateBaojixiaoguo();

        updateHujia();

        updatePojia();

        updateGedang();

        updateFakang();

        updatePofa();

        updateCoolReduce();

        updateRenxing();

        updateShengji();

        updateShouhu();

        updateDumian();

        updateHuomian();

        updateBingmian();

        updateJianmian();

        updateShuailuomian();

        updateSanchajimian();

        //防止未激活时为null


        String slot8Id = pdc.get(DataContainer.slot8, PersistentDataType.STRING);
        String eSlot0Id = pdc.get(DataContainer.eslot0, PersistentDataType.STRING);
        String eSlot1Id = pdc.get(DataContainer.eslot1, PersistentDataType.STRING);
        String eSlot2Id = pdc.get(DataContainer.eslot2, PersistentDataType.STRING);
        String eSlot3Id = pdc.get(DataContainer.eslot3, PersistentDataType.STRING);
        String eSlot4Id = pdc.get(DataContainer.eslot4, PersistentDataType.STRING);
        String eSlot5Id = pdc.get(DataContainer.eslot5, PersistentDataType.STRING);
        String eSlot6Id = pdc.get(DataContainer.eslot6, PersistentDataType.STRING);
        String eSlot7Id = pdc.get(DataContainer.eslot7, PersistentDataType.STRING);

        String slot0ID = pdc.get(DataContainer.slot0, PersistentDataType.STRING);
        String slot1ID = pdc.get(DataContainer.slot1, PersistentDataType.STRING);
        String slot2ID = pdc.get(DataContainer.slot2, PersistentDataType.STRING);
        String slot36ID = pdc.get(DataContainer.slot36, PersistentDataType.STRING);
        String slot37ID = pdc.get(DataContainer.slot37, PersistentDataType.STRING);
        String slot38ID = pdc.get(DataContainer.slot38, PersistentDataType.STRING);
        String slot39ID = pdc.get(DataContainer.slot39, PersistentDataType.STRING);
        String slot40ID = pdc.get(DataContainer.slot40, PersistentDataType.STRING);

        slot8 = SlotBuilder.slot8Builder(slot8Id, real_cool);
        eSlot0 = SlotBuilder.enderChestSlotBuilder(eSlot0Id, real_cool);
        eSlot1 = SlotBuilder.enderChestSlotBuilder(eSlot1Id, real_cool);
        eSlot2 = SlotBuilder.enderChestSlotBuilder(eSlot2Id, real_cool);
        eSlot3 = SlotBuilder.enderChestSlotBuilder(eSlot3Id, real_cool);
        eSlot4 = SlotBuilder.enderChestSlotBuilder(eSlot4Id, real_cool);
        eSlot5 = SlotBuilder.enderChestSlotBuilder(eSlot5Id, real_cool);
        eSlot6 = SlotBuilder.enderChestSlotBuilder(eSlot6Id, real_cool);
        eSlot7 = SlotBuilder.enderChestSlotBuilder(eSlot7Id, real_cool);

        slot0 = SlotBuilder.slot0Builder(slot0ID, real_cool);
        slot1 = SlotBuilder.slot1Builder(slot1ID, real_cool);
        slot2 = SlotBuilder.slot2Builder(slot2ID, real_cool);
        slot36 = SlotBuilder.slot36Builder(slot36ID, real_cool);
        slot37 = SlotBuilder.slot37Builder(slot37ID, real_cool);
        slot38 = SlotBuilder.slot38Builder(slot38ID, real_cool);
        slot39 = SlotBuilder.slot39Builder(slot39ID, real_cool);
        slot40 = SlotBuilder.slot40Builder(slot40ID, real_cool);


        Init.initAll(this, slot8Id);
        Init.initAllEnderChest(this, eSlot0Id);
        Init.initAllEnderChest(this, eSlot1Id);
        Init.initAllEnderChest(this, eSlot2Id);
        Init.initAllEnderChest(this, eSlot3Id);
        Init.initAllEnderChest(this, eSlot4Id);
        Init.initAllEnderChest(this, eSlot5Id);
        Init.initAllEnderChest(this, eSlot6Id);
        Init.initAllEnderChest(this, eSlot7Id);

        webSocket = null;

        Transfer.transferMonsterData(player);

        Recipe.newItemLorePlayer(playerInventory);

        new BGM(this).runTaskTimerAsynchronously(Yuehua.instance, 0, 4 * 20 * 60);


    }

    public String toString() {
        return "§6[命令系统]§aattack: §b" + attack + "  §abaoji: §b" + baoji + "  §abaojixiaoguo: §b" + baojixiaoguo + "\n"
                + "§6[命令系统]§ahujia: §b" + hujia + "  §apojia: §b" + pojia + "  §afakang: §b" + fakang
                + "\n" + "§6[命令系统]§apofa: §b" + pofa + "  §agedang: §b" + gedang + "  §ashouhu: §b" + shouhu
                + "\n" + "§6[命令系统]§arenxing: §b" + renxing + "  §ashengji: §b" + shengji + "  §acool_reduce: §b" + cool_reduce
                + "\n" + "§6[命令系统]§adumian: §b" + dumian + "  §ahuomian: §b" + huomian + "  §abingmian: §b" + bingmian
                + "\n" + "§6[命令系统]§ajianmian: §b" + jianmian + "  §ashuailuomian: §b" + shuailuomian + "  §asanchajimian: §b"
                + sanchajimian + "\n" + "§6[命令系统]§amoney: §b" + money + "  §ajinCount: §b" + jinCount + "  §amuCount: §b" + muCount
                + "\n" + "§6[命令系统]§ashuiCount: §b" + shuiCount + "  §ahuoCount: §b" + huoCount + "  §atuCount: §b" + tuCount + "\n"
                + "§6[命令系统]§arefinedJinCount: §b" + refinedJinCount + "  §arefinedMuCount: §b" + refinedMuCount
                + "  §arefinedShuiCount: §b" + refinedShuiCount + "\n" + "§6[命令系统]§arefinedHuoCount: §b" + refinedHuoCount
                + "  §arefinedTuCount: §b" + refinedTuCount + "  §aconcentratedJinCount: §b" + concentratedJinCount + "\n"
                + "§6[命令系统]§aconcentratedMuCount: §b" + concentratedMuCount + "  §aconcentratedShuiCount: §b" + concentratedShuiCount
                + "  §aconcentratedHuoCount: §b" + concentratedHuoCount + "\n" + "§6[命令系统]§aconcentratedTuCount: §b" + concentratedTuCount
                + "  §aslot0: §b" + slot0.id + "  §aslot1: §b" + slot1.id + "\n" + "§6[命令系统]§aslot2: §b" + slot2.id
                + "  §aslot36: §b" + slot36.id + "  §aslot37: §b" + slot37.id + "\n" + "§6[命令系统]§aslot38: §b" + slot38.id
                + "  §aslot39: §b" + slot39.id + "  §aslot40: §b" + slot40.id + "\n" + "§6[命令系统]§aslot8: §b" + slot8.id
                + "  §aeSlot0: §b" + eSlot0.id + "  §aeSlot1: §b" + eSlot1.id + "\n" + "§6[命令系统]§aeSlot2: §b" + eSlot2.id
                + "  §aeSlot3: §b" + eSlot3.id + "  §aeSlot4: §b" + eSlot4.id + "\n" + "§6[命令系统]§aeSlot5: §b" + eSlot5.id
                + "  §aeSlot6: §b" + eSlot6.id + "  §aeSlot7: §b" + eSlot7.id + "\n";


    }

    public void updateYezi(int value) {
        if (yezi != value) {
            yezi = value;
            Transfer.transferData(this);
        }
    }

    public void updateSoul(int value) {
        if (soul != value) {
            soul = value;
            Transfer.transferData(this);
        }
    }

    public void updatezhusi(int value) {
        if (zhusi != value) {
            zhusi = value;
            Transfer.transferData(this);
        }
    }

    public void updateSnowblind(int value) {
        if (snowBlind != value) {
            snowBlind = value;
            Transfer.transferData(this);
        }
    }

    public void updateAttack() {
        attack = Math.max(0.0, (attack_score + attack_add) * attack_mul);
        Transfer.transferAttribute(this);
    }

    public void updateBaoji() {
        baoji = Math.max(0.0, baoji_score + baoji_add);
        Transfer.transferAttribute(this);
    }

    public void updateBaojixiaoguo() {
        baojixiaoguo = Math.max(0.0, baojixiaoguo_score + baojixiaoguo_add);
        Transfer.transferAttribute(this);
    }

    public void updateHujia() {
        hujia = Math.max(0.0, hujia_score + hujia_add);
        Transfer.transferAttribute(this);
    }

    public void updateFakang() {
        fakang = Math.max(0.0, fakang_score + fakang_add);
        Transfer.transferAttribute(this);
    }

    public void updateShouhu() {
        shouhu = Math.max(0.0, shouhu_score + shouhu_add);
        Transfer.transferAttribute(this);
    }

    public void updatePofa() {
        pofa = Math.max(0.0, pofa_score + pofa_add);
        Transfer.transferAttribute(this);
    }

    public void updatePojia() {
        pojia = Math.max(0.0, pojia_score + pojia_add);
        Transfer.transferAttribute(this);
    }

    public void updateGedang() {
        gedang = Math.max(0.0, gedang_score + gedang_add);
        Transfer.transferAttribute(this);
    }


    public void updateCoolReduce() {
        cool_reduce = Math.max(0.0, cool_reduce_score + cool_reduce_add);
        cool_reduce = Math.min(0.5, cool_reduce);
        cool_reduce += cool_reduce_unlimited;
        real_cool = 1 - cool_reduce;
        Transfer.transferAttribute(this);
    }

    public void updateShengji() {
        shengji = Math.max(0.0, shengji_score + shengji_add);
        Transfer.transferAttribute(this);
    }

    public void updateRenxing() {
        renxing = Math.max(0.0, renxing_score + renxing_add);
        renxing = Math.min(0.8, renxing);
        Transfer.transferAttribute(this);
    }

    public void updateDumian() {
        dumian = Math.min(0.8, dumian_score + dumian_add);
    }

    public void updateHuomian() {
        huomian = Math.min(0.8, huomian_score + huomian_add);
    }

    public void updateBingmian() {
        bingmian = Math.min(0.8, bingmian_score + bingmian_add);
    }

    public void updateJianmian() {
        jianmian = Math.min(0.8, jianmian_score + jianmian_add);
    }

    public void updateShuailuomian() {
        shuailuomian = Math.min(0.8, shuailuomian_score + shuailuomian_add);
    }

    public void updateSanchajimian() {
        sanchajimian = Math.min(0.8, sanchajimian_score + sanchajimian_add);
    }

    public void setDumianScore(double value) {
        dumian_score = value;
        updateDumian();
    }

    public void setHuomianScore(double value) {
        huomian_score = value;
        updateHuomian();
    }

    public void setBingmianScore(double value) {
        bingmian_score = value;
        updateBingmian();
    }

    public void setJianmianScore(double value) {
        jianmian_score = value;
        updateJianmian();
    }

    public void setShuailuomianScore(double value) {
        shuailuomian_score = value;
        updateShuailuomian();
    }

    public void setSanchajimianScore(double value) {
        sanchajimian_score = value;
        updateSanchajimian();
    }


    public void setAttackScore(double value) {
        attack_score = value;
        updateAttack();
    }

    public void setBaojiScore(double value) {
        baoji_score = value;
        updateBaoji();
    }

    public void setBaoJiXiaoGuoScore(double value) {
        baojixiaoguo_score = value;
        updateBaojixiaoguo();
    }

    public void setHujiaScore(double value) {
        hujia_score = value;
        updateHujia();
    }

    public void setPojiaScore(double value) {
        pojia_score = value;
        updatePojia();
    }

    public void setGedangScore(double value) {
        gedang_score = value;
        updateGedang();
    }

    public void setShouhuScore(double value) {
        shouhu_score = value;
        updateShouhu();
    }

    public void setFakangScore(double value) {
        fakang_score = value;
        updateFakang();
    }

    public void setPofaScore(double value) {
        pofa_score = value;
        updatePofa();
    }

    public void setCoolReduceScore(double value) {
        cool_reduce_score = value;
        updateCoolReduce();
    }

    public void setShengjiScore(double value) {
        shengji_score = value;
        updateShengji();
    }

    public void setRenxingScore(double value) {
        renxing_score = value;
        updateRenxing();
    }

    public void updateAttackAdd(double value) {
        attack_add += value;
        updateAttack();
    }

    public void updateAttackMul(double value) {
        attack_mul += value;
        updateAttack();
    }

    public void updateBaojiAdd(double value) {
        baoji_add += value;
        updateBaoji();
    }

    public void updateBaojixiaoguoAdd(double value) {
        baojixiaoguo_add += value;
        updateBaojixiaoguo();
    }

    public void updateHujiaAdd(double value) {
        hujia_add += value;
        updateHujia();
    }

    public void updatePojiaAdd(double value) {
        pojia_add += value;
        updatePojia();
    }

    public void updateGedangAdd(double value) {
        gedang_add += value;
        updateGedang();
    }

    public void updateShouhuAdd(double value) {
        shouhu_add += value;
        updateShouhu();
    }

    public void updateFakangAdd(double value) {
        fakang_add += value;
        updateFakang();
    }

    public void updatePofaAdd(double value) {
        pofa_add += value;
        updatePofa();
    }

    public void updateCoolReduceAdd(double value) {
        cool_reduce_add += value;
        updateCoolReduce();
    }


    public void updateShengjiAdd(double value) {
        shengji_add += value;
        updateShengji();
    }

    public void updateRenxingAdd(double value) {
        renxing_add += value;
        updateRenxing();
    }

    public void updatedumianAdd(double value) {
        dumian_add += value;
        updateDumian();
    }

    public void updatehuomianAdd(double value) {
        huomian_add += value;
        updateHuomian();
    }

    public void updatebingmianAdd(double value) {
        bingmian_add += value;
        updateBingmian();
    }

    public void updatejianmianAdd(double value) {
        jianmian_add += value;
        updateJianmian();
    }

    public void updateshuailuomianAdd(double value) {
        shuailuomian_add += value;
        updateShuailuomian();
    }

    public void updatesanchajimianAdd(double value) {
        sanchajimian_add += value;
        updateSanchajimian();
    }

    public void setCoolReduceUnlimited(double value) {
        cool_reduce_unlimited = value;
        updateCoolReduce();
    }


}