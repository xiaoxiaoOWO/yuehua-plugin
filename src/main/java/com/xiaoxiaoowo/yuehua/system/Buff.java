package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.Jump;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.Speed;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.task.other.DrawProjectile;
import com.xiaoxiaoowo.yuehua.task.other.LandDu;
import com.xiaoxiaoowo.yuehua.task.other.ShuiDu;
import com.xiaoxiaoowo.yuehua.task.regainAttribute.*;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Map;

public final class Buff {
    public static final String NOWARE = "noware";
    public static final String YEZI = "yezi";
    public static final String ZHUSI = "zhuSi";
    public static final String SOUL = "soul";
    public static final String snowBLind = "snowBlind";
    public static final String CANNOTJUMP = "cannotJump";
    public static final String CANNOTATTACK = "cannotAttack";
    public static final String CANNOTMOVE = "cannotMove";
    public static final String CANNOTSHOOT = "cannotShoot";
    public static final String CANNOTJINENG = "cannotJineng";

    public static final String KAI_SHAN_DAO = "kai_shan_dao";

    public static final AttributeModifier cannotJump = new AttributeModifier(Jump.canNotJump, -100000, AttributeModifier.Operation.ADD_NUMBER);
    public static final AttributeModifier cannotMove = new AttributeModifier(Speed.canNotMove, -100000, AttributeModifier.Operation.ADD_NUMBER);

    public static void xuanYun(MonsterData monsterData, long ticks) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(NOWARE, 0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if (thisTimeEnd < timeEnd) {
            return;
        }
        extraData.put(NOWARE, thisTimeEnd);
        monsterData.monster.setAware(false);
        int id = Scheduler.syncLaterWithId(new XuanYun(monsterData), realTicks);
        monsterData.taskIds.add(id);
    }

    public static void yezi(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(YEZI,0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(YEZI, thisTimeEnd);
        Player player = data.player;
        data.updateYezi(1);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNow = GetEntity.world.getGameTime();
            long timeEndInTask = (long) extraData.get(YEZI);
            if (timeEndInTask > timeNow) {
                return;
            }
            data.updateYezi(0);
        }, realTicks);
    }

    public static void zhusi(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(ZHUSI,0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(ZHUSI, thisTimeEnd);
        Player player = data.player;
        data.updatezhusi(1);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNow = GetEntity.world.getGameTime();
            long timeEndInTask = (long) extraData.get(ZHUSI);
            if (timeEndInTask > timeNow) {
                return;
            }
            data.updatezhusi(0);
        }, realTicks);
    }

    public static void snowBlind(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(snowBLind,0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(snowBLind, thisTimeEnd);
        Player player = data.player;
        data.updateSnowblind(1);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNow = GetEntity.world.getGameTime();
            long timeEndInTask = (long) extraData.get(snowBLind);
            if (timeEndInTask > timeNow) {
                return;
            }
            data.updateSnowblind(0);
        }, realTicks);
    }

    public static void soul(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(SOUL,0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(SOUL, thisTimeEnd);
        Player player = data.player;
        data.updateSoul(1);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNow = GetEntity.world.getGameTime();
            long timeEndIn = (long) extraData.get(SOUL);
            if (timeEndIn > timeNow) {
                return;
            }
            data.updateSoul(0);
        }, realTicks);
    }

    public static void canNotAttack(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(CANNOTATTACK,0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(CANNOTATTACK, thisTimeEnd);
        Player player = data.player;
        data.canAttack = false;
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNow = GetEntity.world.getGameTime();
            long timeEndIn = (long) extraData.get(CANNOTATTACK);
            if (timeEndIn > timeNow) {
                return;
            }
            data.canAttack = true;
        }, realTicks);
    }

    public static void canNotJineng(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(CANNOTJINENG,0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(CANNOTJINENG, thisTimeEnd);
        Player player = data.player;
        data.canJiNeng = false;
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNow = GetEntity.world.getGameTime();
            long timeEndIn = (long) extraData.get(CANNOTJINENG);
            if (timeEndIn > timeNow) {
                return;
            }
            data.canJiNeng = true;
        }, realTicks);
    }

    public static void canNotShoot(GongData data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(CANNOTSHOOT,0L);
        long thisTimeEnd = GetEntity.world.getGameTime() - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(CANNOTSHOOT, thisTimeEnd);
        Player player = data.player;
        data.canShoot = false;
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNow = GetEntity.world.getGameTime();
            long timeEndIn = (long) extraData.get(CANNOTSHOOT);
            if (timeEndIn > timeNow) {
                return;
            }
            data.canShoot = true;
        }, realTicks);

    }

    public static void canNotJump(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(CANNOTJUMP, 0L);
        long timeNow = GetEntity.world.getGameTime();
        long thisTimeEnd = timeNow - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(CANNOTJUMP, thisTimeEnd);
        Player player = data.player;
        if (timeEnd <= timeNow) {
            player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH).addModifier(cannotJump);
        }
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNowInTask = GetEntity.world.getGameTime();
            long timeEndInTask = (long) extraData.get(CANNOTJUMP);
            if (timeEndInTask > timeNowInTask) {
                return;
            }
            player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH).removeModifier(Jump.canNotJump);
        }, realTicks);
    }

    public static void canNotMove(Data data, int ticks) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Map<String, Object> extraData = data.extraData;
        long timeEnd = (long) extraData.getOrDefault(CANNOTMOVE, 0L);
        long timeNow = GetEntity.world.getGameTime();
        long thisTimeEnd = timeNow - 1 + realTicks;
        if(thisTimeEnd < timeEnd){
            return;
        }
        extraData.put(CANNOTMOVE, thisTimeEnd);
        Player player = data.player;
        if (timeEnd <= timeNow) {
            player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).addModifier(cannotMove);
        }
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            long timeNowInTask = GetEntity.world.getGameTime();
            long timeEndInTask = (long) extraData.get(CANNOTMOVE);
            if (timeEndInTask > timeNowInTask) {
                return;
            }
            player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).removeModifier(Speed.canNotMove);
        }, realTicks);
    }


    public static void deAttack(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainAttack(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);
        monsterData.updateAttack(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainAttack(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void deFakang(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainFakang(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);

        monsterData.updateFakang(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainFakang(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void deGedang(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainGedang(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);
        monsterData.updateGedang(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainGedang(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void deHujia(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainHujia(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);
        monsterData.updateHujia(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainHujia(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }


    public static void dePofa(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainPofa(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);
        monsterData.updatePofa(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainPofa(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void dePojia(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainPojia(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);
        monsterData.updatePojia(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainPojia(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void deRenxing(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainRenxing(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);
        monsterData.updateRenxing(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainRenxing(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }


    public static void deShengJi(MonsterData monsterData, long ticks, double count, String id) {
        long realTicks = (long) (ticks * (1 - monsterData.renxing));
        Map<String, Object> extraData = monsterData.extraData;
        long timeEnd = (long) extraData.getOrDefault(id, 0L);
        long timeNow = GetEntity.world.getGameTime();
        if (timeEnd > timeNow) {
            extraData.put(id, timeNow - 1 + realTicks);
            int taskId = Scheduler.syncLaterWithId(new RegainShengJi(monsterData, count, id), realTicks);
            monsterData.taskIds.add(taskId);
            return;
        }

        extraData.put(id, timeNow - 1 + realTicks);
        monsterData.updateShengji(-count);
        int taskId = Scheduler.syncLaterWithId(new RegainShengJi(monsterData, count, id), realTicks);
        monsterData.taskIds.add(taskId);
    }


    public static void jianSu(MonsterData monsterData, int ticks, int level) {
        int realTicks = (int) (ticks * (1 - monsterData.renxing));
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.SLOWNESS, realTicks, level);
        Mob mob = monsterData.monster;
        mob.addPotionEffect(potionEffect);
    }

    public static void jianSu(Data data, int ticks, int level) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.SLOWNESS, realTicks, level);
        data.player.addPotionEffect(potionEffect);
    }

    public static void jianAttackSpeed(Data data, int ticks, int level) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.MINING_FATIGUE, realTicks, level);
        data.player.addPotionEffect(potionEffect);
    }

    public static void poison(Data data, int ticks, int level) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.POISON, realTicks, level);
        data.player.addPotionEffect(potionEffect);
    }

    public static void wither(Data data, int ticks, int level) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.WITHER, realTicks, level);
        data.player.addPotionEffect(potionEffect);
    }

    public static void hunger(Data data, int ticks, int level) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.HUNGER, realTicks, level);
        data.player.addPotionEffect(potionEffect);
    }

    public static void blindness(Data data, int ticks, int level) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.BLINDNESS, realTicks, level);
        data.player.addPotionEffect(potionEffect);
    }

    public static void deAttackAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updateAttackAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateAttackAdd(count);
        }, realTicks);
    }

    public static void deAttackMul(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updateAttackMul(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateAttackMul(count);
        }, realTicks);
    }

    public static void deArrowAdd(GongData gongData, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - gongData.renxing));
        Player player = gongData.player;
        gongData.updateArrowAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            gongData.updateArrowAdd(count);
        }, realTicks);
    }

    public static void deArrowMul(GongData gongData, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - gongData.renxing));
        Player player = gongData.player;
        gongData.updateArrowMul(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            gongData.updateArrowMul(count);
        }, realTicks);
    }

    public static void deZhenfaAdd(DanData danData, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - danData.renxing));
        Player player = danData.player;
        danData.updateZhenfaAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            danData.updateZhenfaAdd(count);
        }, realTicks);
    }

    public static void deZhenfaMul(DanData danData, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - danData.renxing));
        Player player = danData.player;
        danData.updateZhenfaMul(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            danData.updateZhenfaMul(count);
        }, realTicks);
    }

    public static void deHujiaAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updateHujiaAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateHujiaAdd(count);
        }, realTicks);
    }


    public static void deHujia(MonsterData monsterData, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - monsterData.renxing));
        monsterData.updateHujia(-count);
        int taskId = Scheduler.syncLaterWithId(() -> monsterData.updateHujia(count), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void deFakang(MonsterData monsterData, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - monsterData.renxing));
        monsterData.updateFakang(-count);
        int taskId = Scheduler.syncLaterWithId(() -> monsterData.updateFakang(count), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void deAttack(MonsterData monsterData, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - monsterData.renxing));
        monsterData.updateAttack(-count);
        int taskId = Scheduler.syncLaterWithId(() -> monsterData.updateAttack(count), realTicks);
        monsterData.taskIds.add(taskId);
    }

    public static void dePojiaAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updatePojiaAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updatePojiaAdd(count);
        }, realTicks);
    }

    public static void deGedangAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updateGedangAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateGedangAdd(count);
        }, realTicks);
    }

    public static void deFakangAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updateFakangAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateFakangAdd(count);
        }, realTicks);
    }

    public static void dePofaAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updatePofaAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updatePofaAdd(count);
        }, realTicks);
    }

    public static void deShengjiAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updateShengjiAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateShengjiAdd(count);
        }, realTicks);
    }

    public static void deRenxingAdd(Data data, int ticks, double count) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        data.updateRenxingAdd(-count);
        Scheduler.syncLater(() -> {
            if ((!player.isConnected())) {
                return;
            }
            data.updateRenxingAdd(count);
        }, realTicks);
    }

    public static void zhongshizhidi(Data data, int ticks, double range) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        Player player = data.player;
        new DrawProjectile(realTicks, player, range).runTaskTimer(Yuehua.instance, 0, 1);
    }

    public static void shuidu(Data data, int ticks, double damage) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        new ShuiDu(realTicks, data.player, damage).runTaskTimer(Yuehua.instance, 0, 1);
    }

    public static void notShuidu(Data data, int ticks, double damage) {
        int realTicks = (int) (ticks * (1 - data.renxing));
        new LandDu(realTicks, data.player, damage).runTaskTimer(Yuehua.instance, 0, 1);
    }

}
