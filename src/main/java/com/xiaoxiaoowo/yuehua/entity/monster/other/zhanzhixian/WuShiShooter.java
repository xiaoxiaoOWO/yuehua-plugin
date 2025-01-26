package com.xiaoxiaoowo.yuehua.entity.monster.other.zhanzhixian;

import com.xiaoxiaoowo.yuehua.items.monsterzhuangbei.*;
import com.xiaoxiaoowo.yuehua.items.other.Skull;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.Team;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class WuShiShooter {
    //从脚到头
    private static final ItemStack[] armor = new ItemStack[4];
    private static final ItemStack hand = Bow.bow3.clone();

    static {
        armor[0] = Boot.goldenBoots;
        armor[1] = Leg.goldenLeggings;
        armor[2] = Chest.goldenChestplate;
        armor[3] = Skull.zhanshenHead;
    }


    public static void spawn(Location location) {
        GetEntity.world.spawn(location, Skeleton.class, false, it -> {
                    //不在日光下着火
                    it.setShouldBurnInDay(false);

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */
                    //通用实体属性
                    //名称
                    it.customName(Component.text("武师").color(NamedTextColor.RED));
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
                    equipment.setItem(EquipmentSlot.HAND, hand);

                    //不掉落,没有可以不设置
                    equipment.setHelmetDropChance(0);
                    equipment.setChestplateDropChance(0);
                    equipment.setLeggingsDropChance(0);
                    equipment.setBootsDropChance(0);
                    equipment.setItemInMainHandDropChance(0);

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */
                    //属性
                    it.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(10000);
                    it.getAttribute(Attribute.GENERIC_FOLLOW_RANGE).setBaseValue(48);
                    it.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.3);


                    //DLC数据
                    PersistentDataContainer pdc = it.getPersistentDataContainer();
                    pdc.set(DataContainer.id, PersistentDataType.STRING, "wushishooter");

                    //生命,一百万
                    it.setHealth(10000);

                    /*
                    ------------------------------------重要部分----------------------------------------------
                    * */

                }
        );

    }
}
