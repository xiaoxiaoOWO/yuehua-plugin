package com.xiaoxiaoowo.yuehua.entity.monster.other;

import com.xiaoxiaoowo.yuehua.items.monsterzhuangbei.Bow;
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

public final class TemplateShooter {
    //从脚到头
    private static final ItemStack[] armor = new ItemStack[4];
    private static final ItemStack hand = Bow.bow1.clone();
    private static final ItemStack offHand = null;

    static {
        armor[0] = null;
        armor[1] = null;
        armor[2] = null;
        armor[3] = null;
    }

    public static void spawn(Location location) {
        GetEntity.world.spawn(location, Skeleton.class, false, it -> {
                    //不在日光下着火
                    it.setShouldBurnInDay(false);

                    //通用实体属性
                    //名称
                    it.customName(Component.text("射手").color(NamedTextColor.RED));
                    it.setCustomNameVisible(true);
                    //怪物实体属性
                    //队伍
                    Team.monsterTeam.addEntity(it);
                    //Tags
                    it.addScoreboardTag("m");
                    //不能拾取
                    it.setCanPickupItems(false);


                    //装备，默认没有可以不设置
                    EntityEquipment equipment = it.getEquipment();

                    equipment.setArmorContents(armor);
                    equipment.setItem(EquipmentSlot.HAND, hand);
                    equipment.setItem(EquipmentSlot.OFF_HAND, offHand);

                    //不掉落,没有可以不设置
                    equipment.setHelmetDropChance(0);
                    equipment.setChestplateDropChance(0);
                    equipment.setLeggingsDropChance(0);
                    equipment.setBootsDropChance(0);
                    equipment.setItemInMainHandDropChance(0);
                    equipment.setItemInOffHandDropChance(0);

                    //属性
                    it.getAttribute(Attribute.MAX_HEALTH).setBaseValue(20);
                    it.getAttribute(Attribute.ARMOR).setBaseValue(0);
                    it.getAttribute(Attribute.ARMOR_TOUGHNESS).setBaseValue(0);

                    //DLC数据
                    PersistentDataContainer pdc = it.getPersistentDataContainer();
                    pdc.set(DataContainer.id, PersistentDataType.STRING, "shooter");

                    //生命,一百万
                    it.getAttribute(Attribute.MAX_HEALTH).setBaseValue(1000000);
                    it.setHealth(20000);

                }
        );

    }
}
