package com.xiaoxiaoowo.yuehua.system.act;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.slot.SlotBuilder;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.task.hujia.Xiong1;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class ActHujia {

    public static final NamespacedKey touSpeed = new NamespacedKey("yh", "touspeed");
    public static final NamespacedKey xiongSpeed = new NamespacedKey("yh", "xiongspeed");
    public static final NamespacedKey tuiSpeed = new NamespacedKey("yh", "tuispeed");
    public static final NamespacedKey xieSpeed = new NamespacedKey("yh", "xiespeed");


    public static void actTou1(Data data) {
        //                        Component.text("§f生命 +§b2   §f护甲 +§b1"),
        //                        Component.text("§f移速 +§b1%   §f跳跃力 +§b1"),
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        AttributeInstance yisu = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        AttributeInstance tiaoyue = player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH);

        double oldHujia = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double newHujia = oldHujia + 0.01;
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, newHujia);
        data.setHujiaScore(newHujia);

        double oldMaxHealth = attributeInstance.getBaseValue();
        double newMaxHealth = oldMaxHealth + 2;
        attributeInstance.setBaseValue(newMaxHealth);

        double oldtiaoyue = tiaoyue.getBaseValue();
        double newtiaoyue = oldtiaoyue + 0.01;
        tiaoyue.setBaseValue(newtiaoyue);

        yisu.addModifier(
                new AttributeModifier(
                        touSpeed,
                        0.01,
                        AttributeModifier.Operation.ADD_SCALAR,
                        EquipmentSlotGroup.ANY
                )
        );

        pdc.set(DataContainer.slot39, PersistentDataType.STRING, "tou1");
        data.slot39 = SlotBuilder.slot39Builder("tou1", data.real_cool);

        data.attackedObservers.add("tou1");

    }

    public static void deActTou1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        AttributeInstance yisu = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        AttributeInstance tiaoyue = player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH);

        double oldHujia = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double newHujia = oldHujia - 0.01;
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, newHujia);
        data.setHujiaScore(newHujia);

        double oldMaxHealth = attributeInstance.getBaseValue();
        double newMaxHealth = oldMaxHealth - 2;
        attributeInstance.setBaseValue(newMaxHealth);

        double oldtiaoyue = tiaoyue.getBaseValue();
        double newtiaoyue = oldtiaoyue - 0.01;
        tiaoyue.setBaseValue(newtiaoyue);

        yisu.removeModifier(touSpeed);

        pdc.set(DataContainer.slot39, PersistentDataType.STRING, "null");
        data.slot39 = SlotBuilder.slot39Builder("null", data.real_cool);

        data.attackedObservers.remove("tou1");
    }

    public static void actXiong1(Data data) {
        //                        Component.text("§f生命 +§b2   §f护甲 +§b1"),
        //                        Component.text("§f移速 +§b1%   §f跳跃力 +§b1"),
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        AttributeInstance yisu = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        AttributeInstance tiaoyue = player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH);

        double oldHujia = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double newHujia = oldHujia + 0.01;
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, newHujia);
        data.setHujiaScore(newHujia);

        double oldMaxHealth = attributeInstance.getBaseValue();
        double newMaxHealth = oldMaxHealth + 2;
        attributeInstance.setBaseValue(newMaxHealth);

        double oldtiaoyue = tiaoyue.getBaseValue();
        double newtiaoyue = oldtiaoyue + 0.01;
        tiaoyue.setBaseValue(newtiaoyue);

        yisu.addModifier(
                new AttributeModifier(
                        xiongSpeed,
                        0.01,
                        AttributeModifier.Operation.ADD_SCALAR,
                        EquipmentSlotGroup.ANY
                )
        );

        pdc.set(DataContainer.slot38, PersistentDataType.STRING, "xiong1");
        data.slot38 = SlotBuilder.slot38Builder("xiong1", data.real_cool);

        Scheduler.syncLater(
                new Xiong1(data), (long) (30 * 20 * data.real_cool)
        );
    }

    public static void deActXiong1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        AttributeInstance yisu = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        AttributeInstance tiaoyue = player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH);

        double oldHujia = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double newHujia = oldHujia - 0.01;
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, newHujia);
        data.setHujiaScore(newHujia);

        double oldMaxHealth = attributeInstance.getBaseValue();
        double newMaxHealth = oldMaxHealth - 2;
        attributeInstance.setBaseValue(newMaxHealth);

        double oldtiaoyue = tiaoyue.getBaseValue();
        double newtiaoyue = oldtiaoyue - 0.01;
        tiaoyue.setBaseValue(newtiaoyue);

        yisu.removeModifier(xiongSpeed);

        pdc.set(DataContainer.slot38, PersistentDataType.STRING, "null");
        data.slot38 = SlotBuilder.slot38Builder("null", data.real_cool);

    }

    public static void actTui1(Data data) {
        //                        Component.text("§f生命 +§b2   §f护甲 +§b1"),
        //                        Component.text("§f移速 +§b1%   §f跳跃力 +§b1"),
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        AttributeInstance yisu = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        AttributeInstance tiaoyue = player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH);

        double oldHujia = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double newHujia = oldHujia + 0.01;
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, newHujia);
        data.setHujiaScore(newHujia);

        double oldMaxHealth = attributeInstance.getBaseValue();
        double newMaxHealth = oldMaxHealth + 2;
        attributeInstance.setBaseValue(newMaxHealth);

        double oldtiaoyue = tiaoyue.getBaseValue();
        double newtiaoyue = oldtiaoyue + 0.01;
        tiaoyue.setBaseValue(newtiaoyue);

        yisu.addModifier(
                new AttributeModifier(
                        tuiSpeed,
                        0.01,
                        AttributeModifier.Operation.ADD_SCALAR,
                        EquipmentSlotGroup.ANY
                )
        );

        pdc.set(DataContainer.slot37, PersistentDataType.STRING, "tui1");
        data.slot37 = SlotBuilder.slot37Builder("tui1", data.real_cool);

    }

    public static void deActTui1(Data data) {
        Player player = data.player;
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        AttributeInstance attributeInstance = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        AttributeInstance yisu = player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED);
        AttributeInstance tiaoyue = player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH);

        double oldHujia = pdc.get(DataContainer.hujia, PersistentDataType.DOUBLE);
        double newHujia = oldHujia - 0.01;
        pdc.set(DataContainer.hujia, PersistentDataType.DOUBLE, newHujia);
        data.setHujiaScore(newHujia);

        double oldMaxHealth = attributeInstance.getBaseValue();
        double newMaxHealth = oldMaxHealth - 2;
        attributeInstance.setBaseValue(newMaxHealth);

        double oldtiaoyue = tiaoyue.getBaseValue();
        double newtiaoyue = oldtiaoyue - 0.01;
        tiaoyue.setBaseValue(newtiaoyue);

        yisu.removeModifier(tuiSpeed);

        pdc.set(DataContainer.slot37, PersistentDataType.STRING, "null");
        data.slot37 = SlotBuilder.slot37Builder("null", data.real_cool);

    }
}
