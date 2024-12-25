package com.xiaoxiaoowo.yuehua.task.hujia;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Xie1 implements Runnable {
    Player player;
    Data data;
    long latest;

    public Xie1(Data data,long latest) {
        this.data = data;
        this.player = data.player;
        this.latest = latest;
    }

    @Override
    public void run() {
        if ((!player.isConnected()) || (!data.slot36.id.equals("xie1"))) {
            return;
        }

        if((long)(data.extraData.get("xie1")) != latest){
            return;
        }

        PotionEffect potionEffect = new PotionEffect(PotionEffectType.SPEED,5 * 20,0);
        player.addPotionEffect(potionEffect);
        if(!data.noinfor){
            SendInformation.sendMes(player, Component.text("§e[被动技]§6[急行]§a触发"));
        }
        if(!data.nosound){
            PlaySound.wind(player);
        }

        Scheduler.syncLater(new Xie1(data,latest), (long) (40 * 20 * data.real_cool));
    }
}
