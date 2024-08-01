package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
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


        PersistentDataContainer pdc = player.getPersistentDataContainer();
        /*
         * 0: 无
         * 101: 始皇陵
         * 102: 火魔
         * 103: 蚩尤
         * 104: 归偶
         * 105: 哭谷
         * 106: 圣山
         *
         * 201: 一阶青龙试炼
         * 202: 二阶青龙试炼
         * 203: 三阶青龙试炼
         * 204: 四阶青龙试炼
         * 205: 五阶青龙试炼
         * 206: 六阶青龙试炼
         * 207: 七阶青龙试炼
         * 208: 八阶青龙试炼
         *
         * 301: 一阶白虎试炼
         * 302: 二阶白虎试炼
         * 303: 三阶白虎试炼
         * 304: 四阶白虎试炼
         * 305: 五阶白虎试炼
         * 306: 六阶白虎试炼
         * 307: 七阶白虎试炼
         * 308: 八阶白虎试炼
         *
         * 401: 一阶朱雀试炼
         * 402: 二阶朱雀试炼
         * 403: 三阶朱雀试炼
         * 404: 四阶朱雀试炼
         * 405: 五阶朱雀试炼
         * 406: 六阶朱雀试炼
         * 407: 七阶朱雀试炼
         * 408: 八阶朱雀试炼
         *
         * 501: 一阶玄武试炼
         * 502: 二阶玄武试炼
         * 503: 三阶玄武试炼
         * 504: 四阶玄武试炼
         * 505: 五阶玄武试炼
         * 506: 六阶玄武试炼
         * 507: 七阶玄武试炼
         * 508: 八阶玄武试炼
         *
         * 601: 一阶神族试炼
         * 602: 二阶神族试炼
         * 603: 三阶神族试炼
         * 611: 一阶仙族试炼
         * 612: 二阶仙族试炼
         * 613: 三阶仙族试炼
         * 621: 一阶人族试炼
         * 622: 二阶人族试炼
         * 623: 三阶人族试炼
         * 631: 一阶妖族试炼
         * 632: 二阶妖族试炼
         * 633: 三阶妖族试炼
         * 641: 一阶战族试炼
         * 642: 二阶战族试炼
         * 643: 三阶战族试炼
         *
         * 701: 老君试炼
         *
         * */
        switch (pdc.get(DataContainer.fuben, PersistentDataType.INTEGER)) {

        }
        pdc.set(DataContainer.fuben, PersistentDataType.INTEGER, 0);


        Yuehua.async(() -> player.showTitle(title));

    }
}
