package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.World;
import org.bukkit.entity.Player;

public final class DoCuredObserver {
    public static double doCured(String id, Data data) {
        switch (id) {
            case "tui1" -> {
                return doTui1(data);
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static double doTui1(Data data) {
        World world = GetEntity.world;
        Player player = data.player;
        if (data.slot37.cd_passive < world.getGameTime()) {

            data.slot37.cd_passive = world.getGameTime() + (long) (20 * 10L * data.real_cool);
            SendInformation.sendMes(Component.text("§e[被动技]§6[守御]§a触发"), player);
            PlaySound.zhiliao(player);
        }
        return 1.0d;
    }
}
