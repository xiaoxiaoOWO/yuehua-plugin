package com.xiaoxiaoowo.yuehua.entity.monster.east.normal;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Team;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Spider;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ZhiZhuJinYin {
    public static void spawn(Location location) {
        GetEntity.world.spawn(location, Spider.class, false, it -> {

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */
                    //通用实体属性
                    //名称
                    it.customName(Component.text("蜘蛛[精英]").color(NamedTextColor.RED));
                    it.setCustomNameVisible(true);


                    //怪物实体属性
                    //队伍
                    Team.monsterTeam.addEntity(it);
                    //Tags
                    it.addScoreboardTag("m");
                    //不能拾取
                    it.setCanPickupItems(false);

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */





                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */
                    //属性
                    it.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(90);
                    it.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(48);


                    //DLC数据
                    PersistentDataContainer pdc = it.getPersistentDataContainer();
                    pdc.set(DataContainer.id, PersistentDataType.STRING, "eastZhizhuJinyin");

                    //生命,一百万
                    it.setHealth(90);

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */

                }
        );

    }
}
