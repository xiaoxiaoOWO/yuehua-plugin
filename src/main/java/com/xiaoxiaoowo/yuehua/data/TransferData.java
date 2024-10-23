package com.xiaoxiaoowo.yuehua.data;

import com.xiaoxiaoowo.yuehua.Yuehua;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.util.RayTraceResult;

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

    public int snowBlind;
    public int yezi;
    public int zhusi;
    public int soul;

    public double monsterHp;
    public double monsterMaxHp;
    public double mattack;
    public double mpojia;
    public double mpofa;
    public double mhujia;
    public double mfakang;
    public double mgedang;
    public double mrenxing;
    public double mshengji;
    public String mname;

    public String toString() {
        return String.format("%d;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%d;%d;%d;%d;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%s;%.1f;%.1f",
                job, attack, arrow, zhenfa, baoji * 100, baojixiaoguo * 100, cool_reduce * 100, hujia * 100, pojia * 100, fakang * 100, pofa * 100, gedang, shouhu,
                renxing * 100,shengji * 100, yezi, snowBlind, zhusi, soul, monsterHp, monsterMaxHp, mattack, mhujia * 100, mfakang * 100, mgedang, mrenxing * 100, mshengji * 100, mname, mpojia * 100, mpofa * 100);
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
        switch (data.job) {
            case 2 -> arrow = ((GongData) data).arrow;
            case 3 -> zhenfa = ((DanData) data).zhenfa;
        }
        Player player = data.player;
        snowBlind = data.snowBlind;
        yezi = data.yezi;
        zhusi = data.zhusi;
        soul = data.soul;

        RayTraceResult rayTraceResult = player.rayTraceEntities(48);

        if (rayTraceResult == null) {
            monsterHp = 0;
            monsterMaxHp = 0;
            mattack = 0;
            mhujia = 0;
            mfakang = 0;
            mgedang = 0;
            mrenxing = 0;
            mshengji = 0;
            mname = "n";
            mpojia = 0;
            mpofa = 0;
            return;
        }

        Entity monster = rayTraceResult.getHitEntity();

        if (monster == null || monster.isInvisible()) {
            monsterHp = 0;
            monsterMaxHp = 0;
            mattack = 0;
            mhujia = 0;
            mfakang = 0;
            mgedang = 0;
            mrenxing = 0;
            mshengji = 0;
            mname = "n";
            mpojia = 0;
            mpofa = 0;
            return;
        }

        if (!monster.getScoreboardTags().contains("m")) {
            if(monster.getType() == EntityType.PLAYER){
                Data playerData = Yuehua.playerData.get(monster.getUniqueId());
                Player player1 = (Player) monster;

                monsterHp = player1.getHealth();
                monsterMaxHp = player1.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
                mattack = playerData.attack;
                mhujia = playerData.hujia;
                mfakang = playerData.fakang;
                mgedang = playerData.gedang;
                mrenxing = playerData.renxing;
                mshengji = playerData.shengji;
                mname = player1.getName();
                mpojia = playerData.pojia;
                mpofa = playerData.pofa;
                return;
            }


            monsterHp = 0;
            monsterMaxHp = 0;
            mattack = 0;
            mhujia = 0;
            mfakang = 0;
            mgedang = 0;
            mrenxing = 0;
            mshengji = 0;
            mname = "n";
            mpojia = 0;
            mpofa = 0;
            return;
        }


        Mob mob = (Mob) monster;

        monsterHp = mob.getHealth();
        monsterMaxHp = mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());
        mattack = monsterData.attack;
        mhujia = monsterData.hujia;
        mfakang = monsterData.fakang;
        mgedang = monsterData.gedang;
        mrenxing = monsterData.renxing;
        mshengji = monsterData.shengji;
        mname = monsterData.monster.getName();
        mpojia = monsterData.pojia;
        mpofa = monsterData.pofa;

    }
}


































