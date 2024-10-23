package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoBaojiObserver;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

import static com.xiaoxiaoowo.yuehua.utils.GetEntity.random;

public final class BaoJi {
    public static double baoji(Data data, Mob damagee,double damage) {
        Player player = data.player;
        double baoji = data.baoji;
        double baojixiaoguo = data.baojixiaoguo;
        //判断是否暴击
        if (data.mustBaoji > 0) {
            data.mustBaoji--;
            SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data, damagee);
            }
        } else if (random.nextDouble() < baoji) {
            SendInformation.sendMes(Component.text("§e[游戏机制]§b[暴击]§a触发"), player);
            damage = damage * baojixiaoguo;
            for (String observer : data.baoJiObservers) {
                damage = damage * DoBaojiObserver.doBaoji(observer, data,  damagee);
            }
        }
        return damage;
    }
}
