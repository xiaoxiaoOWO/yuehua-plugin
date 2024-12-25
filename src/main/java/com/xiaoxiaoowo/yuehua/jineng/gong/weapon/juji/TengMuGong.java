package com.xiaoxiaoowo.yuehua.jineng.gong.weapon.juji;

import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;

public final class TengMuGong {
    public static final String id = "tengMuGong";

    public static void skill1(GongData gongData, double multiplier, Arrow arrow) {
        gongData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * gongData.real_cool);
        arrow.addScoreboardTag(id);
        arrow.setPierceLevel(0);
        Player player = gongData.player;
        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[精准]§a发动"));
    }
}
