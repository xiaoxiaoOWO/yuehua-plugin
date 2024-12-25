package com.xiaoxiaoowo.yuehua.jineng.zhan.weapon.tanyun;

import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.display.utils.DisPlayUtils;
import com.xiaoxiaoowo.yuehua.items.Skill;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Player;
import org.joml.Vector3f;

public final class YinYueQiang {
    public static final String id = "yinYueQiang";

    public static void skill1(ZhanData zhanData, double multiplier) {
        zhanData.slot0.cd_active = GetEntity.world.getGameTime() + (long) (20 * 20 * zhanData.real_cool);
        Player player = zhanData.player;
        double damage = zhanData.attack * 2 * multiplier;

        Location eyeLoc = player.getEyeLocation();
        Damage.damageOneEye(eyeLoc, 0.5, 3, damage, zhanData, 4);


        ItemDisplay itemDisplay = DisPlayUtils.displayCommon(eyeLoc, Skill.MING_YUE, new Vector3f(2f), 6, 4,-0.5);
        Scheduler.syncLater(itemDisplay::remove, 4 + 3);

        PlaySound.zishuijinBreak(player);
        SendInformation.sendActionBar(player, Component.text("§e[主动技]§6[月明]§a发动"));

    }
}
