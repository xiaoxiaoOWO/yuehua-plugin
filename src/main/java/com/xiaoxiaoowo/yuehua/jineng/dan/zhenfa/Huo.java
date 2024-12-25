package com.xiaoxiaoowo.yuehua.jineng.dan.zhenfa;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.system.Damage;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public final class Huo {
    public static void putong(DanData danData, double multiplier) {
        Player player = danData.player;
        PlaySound.huo(player);

        double damage = danData.zhenfa * 6;

        for (Entity entity : GetEntity.getMonsters(player.getLocation(), 5, 5, 5)) {
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            Damage.damageMonster(danData, damage, monsterData);
        }

        if(!danData.noinforDan){
            SendInformation.sendActionBar(player, Component.text("§e[阵法]§6[引火烛]§a发动"));
        }
    }

    public static void jinlian(DanData danData, double multiplier) {

    }

    public static void nongsuo(DanData danData, double multiplier) {

    }
}
