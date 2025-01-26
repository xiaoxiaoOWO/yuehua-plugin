package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.jinzhong;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.PetData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.entity.pet.other.FeiXianJian;
import com.xiaoxiaoowo.yuehua.items.zhuangbei.Weapon;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.*;
import org.joml.Vector3f;

public final class KunLunFeiXianJian {
    public static final String id = "kunLunFeiXianJian";
    public static final Particle.DustOptions whiteDust = new Particle.DustOptions(Color.WHITE, 2);

    public static void skill1(ZhanData zhanData, double multiplier){
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (60 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        double damage = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 6 * multiplier;
        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 8, 8, 8)) {
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(zhanData, damage, monsterData);
            ParticleUtils.atMonsterDust(monsterData.monster,whiteDust);
        }
        Wolf wolf = FeiXianJian.spawn(zhanData,player);

        Location location = player.getLocation();
        location.setPitch(90);
        location.setYaw(0);
        ItemDisplay itemDisplay = DisPlayUtils.displayJian(location, Weapon.KUN_LUN_FEI_XIAN_JIAN,new Vector3f(1.5f));
        wolf.addPassenger(itemDisplay);

        PetData petData = new PetData(zhanData.attack * 1.5, zhanData.hujia,zhanData.pojia,zhanData.pofa,zhanData.gedang, "feixianjian", wolf, player);
        Yuehua.petData.put(wolf.getUniqueId(), petData);


        int cureTaskId = Scheduler.syncTimerWithId(() -> {
            for (Entity entity : GetEntity.getPlayers(wolf.getLocation(), 8, 8, 8)) {
                Player player1 = (Player) entity;
                double amount = player1.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.0125 + 15;
                Cure.curePlayer(amount, player1);
            }

            for (Entity entity : GetEntity.getMonsters(wolf.getLocation(), 16, 16, 16)) {
                Mob mob = (Mob) entity;
                mob.setTarget(wolf);
            }

        }, 10 * 20, 10 * 20);
        int removeTaskId = Scheduler.syncLaterWithId(()->{
            wolf.remove();
            itemDisplay.remove();

        }, 90 * 20 + 1);

        petData.killedObservers.add("feixian");
        petData.taskIds.add(removeTaskId);
        petData.taskIds.add(cureTaskId);

        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[仙剑]§a发动"));
    }
}
