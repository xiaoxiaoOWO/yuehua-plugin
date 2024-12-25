package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoDeathObserver;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;


public final class Death implements Listener {
    public final static Title title = Title.title(Component.text("寄").color(NamedTextColor.DARK_RED), Component.text(""));

//    public final static PotionEffect shen = new PotionEffect(PotionEffectType.HEALTH_BOOST, -1, 4, false, false, true);
//    public final static PotionEffect xian = new PotionEffect(PotionEffectType.JUMP, -1, 1, false, false, true);
//    public final static PotionEffect ren = new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, -1, 0, false, false, true);
//    public final static PotionEffect yao = new PotionEffect(PotionEffectType.SPEED, -1, 0, false, false, true);
//    public final static PotionEffect zhan = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, -1, 0, false, false, true);


    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player player = e.getPlayer();
        Data data = Yuehua.playerData.get(player.getUniqueId());
        for (String observer : data.deathObservers){
            DoDeathObserver.onDeath(observer,e,data);
            return;
        }

        PersistentDataContainer pdc = player.getPersistentDataContainer();
        /*
         * 0: 无
         *
         *
         *
         * 1-1000禁止冲刺等位移技能与跳跃丹药；
         *
         * 702: 环城
         *
         * 1000以上羽毛增伤，进服检测
         *
         * */
        switch (data.fuben) {

        }
        pdc.set(DataContainer.fuben, PersistentDataType.INTEGER, 0);
        data.fuben = 0;


        Scheduler.async(() -> player.showTitle(title));

    }
}
