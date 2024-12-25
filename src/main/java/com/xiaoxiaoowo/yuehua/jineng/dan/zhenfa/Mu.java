package com.xiaoxiaoowo.yuehua.jineng.dan.zhenfa;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;

public final class Mu {
    public static void putong(DanData danData, double multiplier) {
        Player player = danData.player;
        PlaySound.mu(player);

        int extra = Math.min(5, ((int) danData.zhenfa / 20));
        double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * (0.05 + 0.01 * extra) + (20 + 4 * extra);
        Cure.curePlayer(amount, danData);

        if (!danData.noinforDan) {
            SendInformation.sendActionBar(player, Component.text("§e[阵法]§6[若木露]§a发动"));
        }

    }

    public static void jinlian(DanData danData, double multiplier) {

    }

    public static void nongsuo(DanData danData, double multiplier) {

    }
}
