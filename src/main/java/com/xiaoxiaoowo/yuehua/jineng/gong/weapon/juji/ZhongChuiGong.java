package com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.display.utils.ParticleUtils;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Particle;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class ZhongChuiGong {
    public static final String id = "zhongChuiGong";

    public static void skill1(GongData gongData, double multiplier, Arrow arrow) {
        gongData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * gongData.real_cool);
        Player player = gongData.player;
        arrow.addScoreboardTag(id);
        arrow.setPierceLevel(0);
        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[重锤]§a发动"));

        new BukkitRunnable() {
            @Override
            public void run() {
                if(arrow.isDead()){
                    this.cancel();
                    return;
                }
                ParticleUtils.onePoint(arrow.getLocation(), Particle.END_ROD,0,0,0,100,0);
            }
        }.runTaskTimerAsynchronously(Yuehua.instance,0,2);
    }
}
