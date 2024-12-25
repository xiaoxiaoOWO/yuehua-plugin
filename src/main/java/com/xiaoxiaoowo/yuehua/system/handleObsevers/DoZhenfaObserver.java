package com.xiaoxiaoowo.yuehua.system.handleObsevers;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.World;
import org.bukkit.entity.Player;

public final class DoZhenfaObserver {
    private static final World world = GetEntity.world;

    public static double doZhenfa(String id, DanData data) {
        switch (id) {
            case "tui1" -> {
                return doTui1(data);
            }

            case "zhanTui2", "gongTui2", "danTui2", "zhanTui3", "gongTui3", "danTui3", "zhanTui4", "gongTui4",
                 "danTui4", "zhanTui5", "gongTui5", "danTui5" -> {
                return doTui2345(data);
            }

            default -> {
                return 1.0d;
            }
        }
    }

    public static double doTui1(Data data) {
        Player player = data.player;
        if (data.slot37.cd_passive < world.getGameTime()) {
            data.slot37.cd_passive = world.getGameTime() + (long) (20 * 10L * data.real_cool);
            Cure.curePlayer(2.0, data);

            if (!data.noinfor) {
                SendInformation.sendMes(player, Component.text("§e[被动技]§6[汲血]§a触发"));
            }
        }

        return 1.0d;
    }

    public static double doTui2345(Data data) {
        Player player = data.player;
        if (data.slot37.cd_passive < world.getGameTime()) {
            data.slot37.cd_passive = world.getGameTime() + (long) (20 * 20L * data.real_cool);
            //id的最后一个字符是2-5的数字，获取并转换
            String id = data.slot37.id;
            int level = Integer.parseInt(id.substring(id.length() - 1));
            int value = 2 * (1 << level);
            Cure.curePlayer(value, data);
            double increase = 0.1 * level + 0.1;

            if (!data.noinfor) {
                SendInformation.sendMes(player, Component.text("§e[被动技]§6[回息术灵]§a触发"));
            }


            return 1.0d + increase;
        }

        return 1.0d;
    }
}
