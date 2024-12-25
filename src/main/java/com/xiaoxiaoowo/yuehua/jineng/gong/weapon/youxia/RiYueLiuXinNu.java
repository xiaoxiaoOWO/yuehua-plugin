package com.xiaoxiaoowo.yuehua.jineng.gong.weapon.youxia;

import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

public final class RiYueLiuXinNu {
    public static final String id = "riYueLiuXingNu";

    public static void skill1(GongData gongData, double multiplier) {
        gongData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * gongData.real_cool);
        Player player = gongData.player;

        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[日月流星]§a发动"));
    }
}
