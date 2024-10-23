package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.World;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public final class DoAttackedObserver {
    public static double doAttacked(String id, Data data, Mob monster) {
        switch (id) {
            case "tou1" -> {
                return doTou1(data);
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static double doAttackedWuLi(String id, Data data, Mob monster) {
        switch (id) {
            default -> {
                return 1.0d;
            }
        }
    }

    public static double doAttackedMoFa(String id, Data data, Mob monster) {
        switch (id) {
            default -> {
                return 1.0d;
            }
        }
    }

    public static double doTou1(Data data) {
        World world = GetEntity.world;
        Player player = data.player;
        if (data.slot39.cd_passive < world.getGameTime()) {
            Cure.curePlayer(1.0, player);
            data.slot39.cd_passive = world.getGameTime() + (long) (20 * 10L * data.real_cool);
            SendInformation.sendMes(Component.text("§e[被动技]§6[守御]§a触发"), player);
            PlaySound.zhiliao(player);
        }
        return 1.0d;
    }
}
