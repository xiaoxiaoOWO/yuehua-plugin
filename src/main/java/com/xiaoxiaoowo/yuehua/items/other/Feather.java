package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.guis.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Feather {
    public static final ItemStack XIN_YA_ZHI_YU = new ItemStack(Material.RAW_IRON);
    public static final ItemStack QING_YING_ZHI_YU = new ItemStack(Material.RAW_IRON);
    public static final ItemStack SHEN_SU_ZHI_YU = new ItemStack(Material.RAW_IRON);

    public static final ItemStack JIN_PENG_ZHI_YU = new ItemStack(Material.RAW_IRON);
    public static final ItemStack JIN_PENG_ZHI_YU_SUI_PIAN = new ItemStack(Material.RAW_IRON);
    public static final ItemStack QING_LUAN_ZHI_YU = new ItemStack(Material.RAW_IRON);
    public static final ItemStack QING_LUAN_ZHI_YU_SUI_PIAN = new ItemStack(Material.RAW_IRON);
    public static final ItemStack TONG_HE_ZHI_YU = new ItemStack(Material.RAW_IRON);
    public static final ItemStack TONG_HE_ZHI_YU_SUI_PIAN = new ItemStack(Material.RAW_IRON);


    public static final NamespacedKey yumaoSpeed = new NamespacedKey("yh", "yumaospeed");


    static {


        XIN_YA_ZHI_YU.setCustomModelData(1);
        QING_YING_ZHI_YU.setCustomModelData(2);
        SHEN_SU_ZHI_YU.setCustomModelData(3);
        JIN_PENG_ZHI_YU.setCustomModelData(4);
        JIN_PENG_ZHI_YU_SUI_PIAN.setCustomModelData(5);
        QING_LUAN_ZHI_YU.setCustomModelData(6);
        QING_LUAN_ZHI_YU_SUI_PIAN.setCustomModelData(7);
        TONG_HE_ZHI_YU.setCustomModelData(8);
        TONG_HE_ZHI_YU_SUI_PIAN.setCustomModelData(9);

        ItemMeta xinyazhiyu = XIN_YA_ZHI_YU.getItemMeta();
        xinyazhiyu.setMaxStackSize(99);
        xinyazhiyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "xinyazhiyu");
        xinyazhiyu.displayName(
                Component.text("新芽之羽").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        xinyazhiyu.lore(
                List.of(
                        ComponentSet.RARE2,
                        Component.text("§f在副本时（不含前置）手持则会被顷刻炼化")

                )
        );


        xinyazhiyu.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        yumaoSpeed,
                        0.3,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.MAINHAND
                ));

        XIN_YA_ZHI_YU.setItemMeta(xinyazhiyu);


        ItemMeta qingyingzhiyu = QING_YING_ZHI_YU.getItemMeta();
        qingyingzhiyu.setMaxStackSize(99);
        qingyingzhiyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qingyingzhiyu");
        qingyingzhiyu.displayName(
                Component.text("轻盈之羽").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        qingyingzhiyu.lore(
                List.of(
                        ComponentSet.RARE3,
                        Component.text("§f在副本时（不含前置）手持则会被顷刻炼化")
                )
        );



        qingyingzhiyu.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        yumaoSpeed,
                        0.5,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.MAINHAND
                ));
        QING_YING_ZHI_YU.setItemMeta(qingyingzhiyu);

        ItemMeta shensuzhiyu = SHEN_SU_ZHI_YU.getItemMeta();
        shensuzhiyu.setMaxStackSize(99);
        shensuzhiyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shensuzhiyu");
        shensuzhiyu.displayName(
                Component.text("神速之羽").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        shensuzhiyu.lore(
                List.of(
                        ComponentSet.RARE4,
                        Component.text("§f在副本时（不含前置）手持则会被顷刻炼化")
                )
        );

        shensuzhiyu.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        yumaoSpeed,
                        0.8,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.MAINHAND
                ));
        SHEN_SU_ZHI_YU.setItemMeta(shensuzhiyu);

        ItemMeta jinpengzhiyu = JIN_PENG_ZHI_YU.getItemMeta();
        jinpengzhiyu.setMaxStackSize(99);
        jinpengzhiyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jinpengzhiyu");
        jinpengzhiyu.displayName(
                Component.text("金鹏之羽").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        jinpengzhiyu.lore(
                List.of(
                        ComponentSet.RARE5,
                        Component.text("§f在副本时（不含前置）手持则会被顷刻炼化")
                )
        );

        jinpengzhiyu.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        yumaoSpeed,
                        1.2,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.MAINHAND
                ));
        JIN_PENG_ZHI_YU.setItemMeta(jinpengzhiyu);

        ItemMeta qingluanzhiyu = QING_LUAN_ZHI_YU.getItemMeta();
        qingluanzhiyu.setMaxStackSize(99);
        qingluanzhiyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qingluanzhiyu");
        qingluanzhiyu.displayName(
                Component.text("青鸾之羽").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        qingluanzhiyu.lore(
                List.of(
                        ComponentSet.RARE6,
                        Component.text("§f在副本时（不含前置）手持则会被顷刻炼化")
                )
        );

        qingluanzhiyu.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        yumaoSpeed,
                        1.7,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.MAINHAND
                ));
        QING_LUAN_ZHI_YU.setItemMeta(qingluanzhiyu);


        ItemMeta tonghezhiyu = TONG_HE_ZHI_YU.getItemMeta();
        tonghezhiyu.setMaxStackSize(99);
        tonghezhiyu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "tonghezhiyu");
        tonghezhiyu.displayName(
                Component.text("彤鹤之羽").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );
        tonghezhiyu.lore(
                List.of(
                        ComponentSet.RARE7,
                        Component.text("§f在副本时（不含前置）手持则会被顷刻炼化")
                )
        );

        tonghezhiyu.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        yumaoSpeed,
                        2.3,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.MAINHAND
                ));
        TONG_HE_ZHI_YU.setItemMeta(tonghezhiyu);

        ItemMeta jinpengzhiyusuipian = JIN_PENG_ZHI_YU_SUI_PIAN.getItemMeta();
        jinpengzhiyusuipian.setMaxStackSize(99);
        jinpengzhiyusuipian.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "jinpengzhiyusuipian");
        jinpengzhiyusuipian.displayName(
                Component.text("金鹏之羽碎片").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        jinpengzhiyusuipian.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        JIN_PENG_ZHI_YU_SUI_PIAN.setItemMeta(jinpengzhiyusuipian);

        ItemMeta qingluanzhiyusuipian = QING_LUAN_ZHI_YU_SUI_PIAN.getItemMeta();
        qingluanzhiyusuipian.setMaxStackSize(99);
        qingluanzhiyusuipian.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "qingluanzhiyusuipian");
        qingluanzhiyusuipian.displayName(
                Component.text("青鸾之羽碎片").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        qingluanzhiyusuipian.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        QING_LUAN_ZHI_YU_SUI_PIAN.setItemMeta(qingluanzhiyusuipian);

        ItemMeta tonghezhiyusuipian = TONG_HE_ZHI_YU_SUI_PIAN.getItemMeta();
        tonghezhiyusuipian.setMaxStackSize(99);
        tonghezhiyusuipian.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "tonghezhiyusuipian");
        tonghezhiyusuipian.displayName(
                Component.text("彤鹤之羽碎片").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );
        tonghezhiyusuipian.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );
        TONG_HE_ZHI_YU_SUI_PIAN.setItemMeta(tonghezhiyusuipian);
    }

    public static void putId(){
        Recipe.idToItem.put("xinyazhiyu",XIN_YA_ZHI_YU);
        Recipe.idToItem.put("qingyingzhiyu",QING_YING_ZHI_YU);
        Recipe.idToItem.put("shensuzhiyu",SHEN_SU_ZHI_YU);
        Recipe.idToItem.put("jinpengzhiyu",JIN_PENG_ZHI_YU);
        Recipe.idToItem.put("qingluanzhiyu",QING_LUAN_ZHI_YU);
        Recipe.idToItem.put("tonghezhiyu",TONG_HE_ZHI_YU);
    }
}
