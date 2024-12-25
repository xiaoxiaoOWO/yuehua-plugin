package com.xiaoxiaoowo.yuehua.jineng.dan.zhenfa;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public final class Shui {
    public static void putong(DanData danData, double multiplier) {
        Player player = danData.player;
        PlaySound.shui(player);

        player.setFireTicks(0);
        player.removePotionEffect(PotionEffectType.SLOWNESS);
        player.removePotionEffect(PotionEffectType.BLINDNESS);
        player.removePotionEffect(PotionEffectType.POISON);
        player.removePotionEffect(PotionEffectType.WITHER);
        player.removePotionEffect(PotionEffectType.HUNGER);
        player.removePotionEffect(PotionEffectType.MINING_FATIGUE);
        player.removePotionEffect(PotionEffectType.DARKNESS);

        if(!danData.noinforDan){
            SendInformation.sendActionBar(player, Component.text("§e[阵法]§6[活水泉]§a发动"));
        }

    }

    public static void jinlian(DanData danData, double multiplier) {

    }

    public static void nongsuo(DanData danData, double multiplier) {

    }
}
