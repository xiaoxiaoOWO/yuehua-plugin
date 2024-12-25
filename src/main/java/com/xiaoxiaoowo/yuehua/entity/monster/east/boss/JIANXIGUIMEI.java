package com.xiaoxiaoowo.yuehua.entity.monster.east.boss;

import com.xiaoxiaoowo.yuehua.items.monsterzhuangbei.Helmet;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Team;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Drowned;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class JIANXIGUIMEI {
    //从脚到头
    private static final ItemStack[] armor = new ItemStack[4];

    static {
        armor[0] = null;
        armor[1] = null;
        armor[2] = null;
        armor[3] = Helmet.leatherHelmet;
    }


    public static void spawn(Location location) {
        GetEntity.world.spawn(location, Drowned.class, false, it -> {
                    //不在日光下着火
                    it.setShouldBurnInDay(false);

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */
                    //通用实体属性
                    //名称
                    it.customName(Component.text("涧溪鬼魅").color(NamedTextColor.RED));
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


                    //装备，默认没有可以不设置
                    EntityEquipment equipment = it.getEquipment();
                    equipment.setArmorContents(armor);
                    //不掉落,没有可以不设置
                    equipment.setHelmetDropChance(0);



                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */
                    //属性
                    it.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(800);
                    it.getAttribute(Attribute.GENERIC_ARMOR).setBaseValue(0);
                    it.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(48);
                    it.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(1);



                    //DLC数据
                    PersistentDataContainer pdc = it.getPersistentDataContainer();
                    pdc.set(DataContainer.id, PersistentDataType.STRING, "jianxiguimei");

                    //生命,一百万
                    it.setHealth(800);

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */

                }
        );

    }
}
