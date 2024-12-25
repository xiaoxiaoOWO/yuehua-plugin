package com.xiaoxiaoowo.yuehua.task.hujia;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.task.other.ReflectProjectile;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Xie2345 implements Runnable {
    Data data;
    Player player;
    long latest;
    String id;

    public Xie2345(Data data, long latest, String id) {
        this.data = data;
        this.player = data.player;
        this.latest = latest;
        this.id = id;
    }

    @Override
    public void run() {
        if ((!player.isConnected()) || (!data.slot36.id.equals(id))) {
            return;
        }

        if ((long) (data.extraData.get(id)) != latest) {
            return;
        }

        //id的最后一个字符是2-5的数字，获取并转换
        int level = Integer.parseInt(id.substring(id.length() - 1));

        PotionEffect potionEffect = new PotionEffect(PotionEffectType.SPEED, (level + 3) * 20, 1);
        player.addPotionEffect(potionEffect);
        if(!data.noinfor){
            SendInformation.sendMes(player, Component.text("§e[被动技]§6[踏罡驾风]§a触发"));
        }

        if(!data.nosound){
            PlaySound.breezeLand(player);
        }



        new ReflectProjectile((level + 1) * 20, player, 5).runTaskTimer(Yuehua.instance,0, 1);

        Scheduler.syncLater(new Xie2345(data, latest, id), (long) (60 * 20 * data.real_cool));
    }
}
