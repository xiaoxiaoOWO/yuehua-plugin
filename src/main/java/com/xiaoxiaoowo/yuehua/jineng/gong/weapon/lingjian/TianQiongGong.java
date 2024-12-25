package com.xiaoxiaoowo.yuehua.jineng.gong.weapon.lingjian;

import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class TianQiongGong {
    public static final String id = "tianQiongGong";

    public static void skill1(GongData gongData, double multiplier, Arrow arrow) {
        gongData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * gongData.real_cool);
        Player player = gongData.player;
        PersistentDataContainer persistentDataContainer = arrow.getPersistentDataContainer();
        persistentDataContainer.set(DataContainer.id, PersistentDataType.STRING, id);
        persistentDataContainer.set(DataContainer.shooter, PersistentDataType.STRING, player.getName());
        arrow.setPierceLevel(0);
        arrow.setShooter(null);
        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[天琼]§a发动"));
    }
}
