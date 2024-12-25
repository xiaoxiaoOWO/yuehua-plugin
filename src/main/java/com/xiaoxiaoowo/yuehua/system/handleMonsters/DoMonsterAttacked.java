package com.xiaoxiaoowo.yuehua.system.handleMonsters;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.PetData;
import org.bukkit.entity.Mob;

public final class DoMonsterAttacked {
    public static double doAttacked(String id,MonsterData monsterData, Data data){
        switch (id){
            case "spider" -> {
                return doSpider(monsterData,data);
            }


            default -> {
                return 1.0d;
            }
        }
    }

    public static double doAttacked(String id, MonsterData monsterData,PetData petData){
        switch (id){

            case "spider" -> {
                return doSpider(monsterData,petData);
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static double doSpider(MonsterData monsterData,Data data){
        Mob mob = monsterData.monster;
        if(mob.getTarget() == null){
            mob.setTarget(data.player);
        }
        return 1.0d;
    };

    public static double doSpider(MonsterData monsterData,PetData data){
        Mob mob = monsterData.monster;
        if(mob.getTarget() == null){
            mob.setTarget(data.pet);
        }
        return 1.0d;
    };


}
