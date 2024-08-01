package com.xiaoxiaoowo.yuehua.itemstack.zhuangbei;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public final class Shipin {
    public static final ItemStack QING_LONG_SHENG_QI1 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack QING_LONG_SHENG_QI2 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack QING_LONG_SHENG_QI3 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack QING_LONG_SHENG_QI4 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack QING_LONG_SHENG_QI5 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack QING_LONG_SHENG_QI6 = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack BAI_HU_SHENG_QI1 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack BAI_HU_SHENG_QI2 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack BAI_HU_SHENG_QI3 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack BAI_HU_SHENG_QI4 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack BAI_HU_SHENG_QI5 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack BAI_HU_SHENG_QI6 = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack ZHU_QUE_SHENG_QI1 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHU_QUE_SHENG_QI2 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHU_QUE_SHENG_QI3 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHU_QUE_SHENG_QI4 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHU_QUE_SHENG_QI5 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHU_QUE_SHENG_QI6 = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack XUAN_WU_SHENG_QI1 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack XUAN_WU_SHENG_QI2 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack XUAN_WU_SHENG_QI3 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack XUAN_WU_SHENG_QI4 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack XUAN_WU_SHENG_QI5 = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack XUAN_WU_SHENG_QI6 = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack HUN_TIAN_LIN = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack TAI_CHU_SHEN_JIA = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZI_SHA_CHAN = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack FENG_HUO_LUN = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack JIU_TIAN_XUAN_YU = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack WEI_TUO_TIAN = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack PO_SUN_TAN_ZHI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack TAN_YU_ZHI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack TAN_LAN_DU_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack TAN_LAN_XIE_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack TAN_LAN_GUI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack TAN_LAN_MO_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack TAN_LAN_MING_JIE = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack PO_SUN_CHI_ZHI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_MI_ZHI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_YU_DU_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_YU_XIE_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_YU_GUI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_YU_MO_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_YU_MING_JIE = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack PO_SUN_CHEN_ZHI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHEN_NU_ZHI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHEN_HEN_DU_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHEN_HEN_XIE_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHEN_HEN_GUI_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHEN_HEN_MO_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHEN_HEN_MING_JIE = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack CHAN_DING_FA_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHAN_DING_SHENG_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHAN_DING_FO_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHAN_DING_XIAN_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHAN_DING_SHEN_JIE = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack ZHI_HUI_FA_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHI_HUI_SHENG_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHI_HUI_FO_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHI_HUI_XIAN_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack ZHI_HUI_SHEN_JIE = new ItemStack(Material.WOODEN_PICKAXE);

    public static final ItemStack CHI_JIE_FA_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_JIE_SHENG_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_JIE_FO_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_JIE_XIAN_JIE = new ItemStack(Material.WOODEN_PICKAXE);
    public static final ItemStack CHI_JIE_SHEN_JIE = new ItemStack(Material.WOODEN_PICKAXE);

    static {
        ItemMeta qing_long_sheng_qi1_meta = QING_LONG_SHENG_QI1.getItemMeta();
        ItemMeta qing_long_sheng_qi2_meta = QING_LONG_SHENG_QI2.getItemMeta();
        ItemMeta qing_long_sheng_qi3_meta = QING_LONG_SHENG_QI3.getItemMeta();
        ItemMeta qing_long_sheng_qi4_meta = QING_LONG_SHENG_QI4.getItemMeta();
        ItemMeta qing_long_sheng_qi5_meta = QING_LONG_SHENG_QI5.getItemMeta();
        ItemMeta qing_long_sheng_qi6_meta = QING_LONG_SHENG_QI6.getItemMeta();
        ItemMeta zhu_que_sheng_qi1_meta = ZHU_QUE_SHENG_QI1.getItemMeta();
        ItemMeta zhu_que_sheng_qi2_meta = ZHU_QUE_SHENG_QI2.getItemMeta();
        ItemMeta zhu_que_sheng_qi3_meta = ZHU_QUE_SHENG_QI3.getItemMeta();
        ItemMeta zhu_que_sheng_qi4_meta = ZHU_QUE_SHENG_QI4.getItemMeta();
        ItemMeta zhu_que_sheng_qi5_meta = ZHU_QUE_SHENG_QI5.getItemMeta();
        ItemMeta zhu_que_sheng_qi6_meta = ZHU_QUE_SHENG_QI6.getItemMeta();
        ItemMeta bai_hu_sheng_qi1_meta = BAI_HU_SHENG_QI1.getItemMeta();
        ItemMeta bai_hu_sheng_qi2_meta = BAI_HU_SHENG_QI2.getItemMeta();
        ItemMeta bai_hu_sheng_qi3_meta = BAI_HU_SHENG_QI3.getItemMeta();
        ItemMeta bai_hu_sheng_qi4_meta = BAI_HU_SHENG_QI4.getItemMeta();
        ItemMeta bai_hu_sheng_qi5_meta = BAI_HU_SHENG_QI5.getItemMeta();
        ItemMeta bai_hu_sheng_qi6_meta = BAI_HU_SHENG_QI6.getItemMeta();
        ItemMeta xuan_wu_sheng_qi1_meta = XUAN_WU_SHENG_QI1.getItemMeta();
        ItemMeta xuan_wu_sheng_qi2_meta = XUAN_WU_SHENG_QI2.getItemMeta();
        ItemMeta xuan_wu_sheng_qi3_meta = XUAN_WU_SHENG_QI3.getItemMeta();
        ItemMeta xuan_wu_sheng_qi4_meta = XUAN_WU_SHENG_QI4.getItemMeta();
        ItemMeta xuan_wu_sheng_qi5_meta = XUAN_WU_SHENG_QI5.getItemMeta();
        ItemMeta xuan_wu_sheng_qi6_meta = XUAN_WU_SHENG_QI6.getItemMeta();
        ItemMeta hun_tian_lin_meta = HUN_TIAN_LIN.getItemMeta();
        ItemMeta tai_chu_shen_jia_meta = TAI_CHU_SHEN_JIA.getItemMeta();
        ItemMeta zi_sha_chan_meta = ZI_SHA_CHAN.getItemMeta();
        ItemMeta feng_huo_lun_meta = FENG_HUO_LUN.getItemMeta();
        ItemMeta jiu_tian_xuan_yu_meta = JIU_TIAN_XUAN_YU.getItemMeta();
        ItemMeta wei_tuo_tian_meta = WEI_TUO_TIAN.getItemMeta();
        ItemMeta po_sun_tan_zhi_jie_meta = PO_SUN_TAN_ZHI_JIE.getItemMeta();
        ItemMeta tan_yu_zhi_jie_meta = TAN_YU_ZHI_JIE.getItemMeta();
        ItemMeta tan_lan_du_jie_meta = TAN_LAN_DU_JIE.getItemMeta();
        ItemMeta tan_lan_xie_jie_meta = TAN_LAN_XIE_JIE.getItemMeta();
        ItemMeta tan_lan_gui_jie_meta = TAN_LAN_GUI_JIE.getItemMeta();
        ItemMeta tan_lan_mo_jie_meta = TAN_LAN_MO_JIE.getItemMeta();
        ItemMeta tan_lan_ming_jie_meta = TAN_LAN_MING_JIE.getItemMeta();
        ItemMeta po_sun_chi_zhi_jie_meta = PO_SUN_CHI_ZHI_JIE.getItemMeta();
        ItemMeta chi_mi_zhi_jie_meta = CHI_MI_ZHI_JIE.getItemMeta();
        ItemMeta chi_yu_du_jie_meta = CHI_YU_DU_JIE.getItemMeta();
        ItemMeta chi_yu_xie_jie_meta = CHI_YU_XIE_JIE.getItemMeta();
        ItemMeta chi_yu_gui_jie_meta = CHI_YU_GUI_JIE.getItemMeta();
        ItemMeta chi_yu_mo_jie_meta = CHI_YU_MO_JIE.getItemMeta();
        ItemMeta chi_yu_ming_jie_meta = CHI_YU_MING_JIE.getItemMeta();
        ItemMeta po_sun_chen_zhi_jie_meta = PO_SUN_CHEN_ZHI_JIE.getItemMeta();
        ItemMeta chen_nu_zhi_jie_meta = CHEN_NU_ZHI_JIE.getItemMeta();
        ItemMeta chen_hen_du_jie_meta = CHEN_HEN_DU_JIE.getItemMeta();
        ItemMeta chen_hen_xie_jie_meta = CHEN_HEN_XIE_JIE.getItemMeta();
        ItemMeta chen_hen_gui_jie_meta = CHEN_HEN_GUI_JIE.getItemMeta();
        ItemMeta chen_hen_mo_jie_meta = CHEN_HEN_MO_JIE.getItemMeta();
        ItemMeta chen_hen_ming_jie_meta = CHEN_HEN_MING_JIE.getItemMeta();
        ItemMeta chan_ding_fa_jie_meta = CHAN_DING_FA_JIE.getItemMeta();
        ItemMeta chan_ding_sheng_jie_meta = CHAN_DING_SHENG_JIE.getItemMeta();
        ItemMeta chan_ding_fo_jie_meta = CHAN_DING_FO_JIE.getItemMeta();
        ItemMeta chan_ding_xian_jie_meta = CHAN_DING_XIAN_JIE.getItemMeta();
        ItemMeta chan_ding_shen_jie_meta = CHAN_DING_SHEN_JIE.getItemMeta();
        ItemMeta zhi_hui_fa_jie_meta = ZHI_HUI_FA_JIE.getItemMeta();
        ItemMeta zhi_hui_sheng_jie_meta = ZHI_HUI_SHENG_JIE.getItemMeta();
        ItemMeta zhi_hui_fo_jie_meta = ZHI_HUI_FO_JIE.getItemMeta();
        ItemMeta zhi_hui_xian_jie_meta = ZHI_HUI_XIAN_JIE.getItemMeta();
        ItemMeta zhi_hui_shen_jie_meta = ZHI_HUI_SHEN_JIE.getItemMeta();
        ItemMeta chi_jie_fa_jie_meta = CHI_JIE_FA_JIE.getItemMeta();
        ItemMeta chi_jie_sheng_jie_meta = CHI_JIE_SHENG_JIE.getItemMeta();
        ItemMeta chi_jie_fo_jie_meta = CHI_JIE_FO_JIE.getItemMeta();
        ItemMeta chi_jie_xian_jie_meta = CHI_JIE_XIAN_JIE.getItemMeta();
        ItemMeta chi_jie_shen_jie_meta = CHI_JIE_SHEN_JIE.getItemMeta();

        qing_long_sheng_qi1_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        qing_long_sheng_qi2_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        qing_long_sheng_qi3_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        qing_long_sheng_qi4_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        qing_long_sheng_qi5_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        qing_long_sheng_qi6_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        zhu_que_sheng_qi1_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhu_que_sheng_qi2_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhu_que_sheng_qi3_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhu_que_sheng_qi4_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhu_que_sheng_qi5_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhu_que_sheng_qi6_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        bai_hu_sheng_qi1_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        bai_hu_sheng_qi2_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        bai_hu_sheng_qi3_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        bai_hu_sheng_qi4_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        bai_hu_sheng_qi5_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        bai_hu_sheng_qi6_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        xuan_wu_sheng_qi1_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xuan_wu_sheng_qi2_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xuan_wu_sheng_qi3_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xuan_wu_sheng_qi4_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xuan_wu_sheng_qi5_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xuan_wu_sheng_qi6_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        hun_tian_lin_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tai_chu_shen_jia_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zi_sha_chan_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        feng_huo_lun_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jiu_tian_xuan_yu_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        wei_tuo_tian_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        po_sun_tan_zhi_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tan_yu_zhi_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tan_lan_du_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tan_lan_xie_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tan_lan_gui_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tan_lan_mo_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        tan_lan_ming_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        po_sun_chi_zhi_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_mi_zhi_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_yu_du_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_yu_xie_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_yu_gui_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_yu_mo_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_yu_ming_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        po_sun_chen_zhi_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chen_nu_zhi_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chen_hen_du_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chen_hen_xie_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chen_hen_gui_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chen_hen_mo_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chen_hen_ming_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        chan_ding_fa_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chan_ding_sheng_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chan_ding_fo_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chan_ding_xian_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chan_ding_shen_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        zhi_hui_fa_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhi_hui_sheng_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhi_hui_fo_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhi_hui_xian_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        zhi_hui_shen_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        chi_jie_fa_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_jie_sheng_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_jie_fo_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_jie_xian_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);
        chi_jie_shen_jie_meta.addItemFlags(ZeroAttributeModifier.itemFlags);

        qing_long_sheng_qi1_meta.setUnbreakable(true);
        qing_long_sheng_qi2_meta.setUnbreakable(true);
        qing_long_sheng_qi3_meta.setUnbreakable(true);
        qing_long_sheng_qi4_meta.setUnbreakable(true);
        qing_long_sheng_qi5_meta.setUnbreakable(true);
        qing_long_sheng_qi6_meta.setUnbreakable(true);

        zhu_que_sheng_qi1_meta.setUnbreakable(true);
        zhu_que_sheng_qi2_meta.setUnbreakable(true);
        zhu_que_sheng_qi3_meta.setUnbreakable(true);
        zhu_que_sheng_qi4_meta.setUnbreakable(true);
        zhu_que_sheng_qi5_meta.setUnbreakable(true);
        zhu_que_sheng_qi6_meta.setUnbreakable(true);

        bai_hu_sheng_qi1_meta.setUnbreakable(true);
        bai_hu_sheng_qi2_meta.setUnbreakable(true);
        bai_hu_sheng_qi3_meta.setUnbreakable(true);
        bai_hu_sheng_qi4_meta.setUnbreakable(true);
        bai_hu_sheng_qi5_meta.setUnbreakable(true);
        bai_hu_sheng_qi6_meta.setUnbreakable(true);

        xuan_wu_sheng_qi1_meta.setUnbreakable(true);
        xuan_wu_sheng_qi2_meta.setUnbreakable(true);
        xuan_wu_sheng_qi3_meta.setUnbreakable(true);
        xuan_wu_sheng_qi4_meta.setUnbreakable(true);
        xuan_wu_sheng_qi5_meta.setUnbreakable(true);
        xuan_wu_sheng_qi6_meta.setUnbreakable(true);

        hun_tian_lin_meta.setUnbreakable(true);
        tai_chu_shen_jia_meta.setUnbreakable(true);
        zi_sha_chan_meta.setUnbreakable(true);
        feng_huo_lun_meta.setUnbreakable(true);
        jiu_tian_xuan_yu_meta.setUnbreakable(true);
        wei_tuo_tian_meta.setUnbreakable(true);

        po_sun_tan_zhi_jie_meta.setUnbreakable(true);
        tan_yu_zhi_jie_meta.setUnbreakable(true);
        tan_lan_du_jie_meta.setUnbreakable(true);
        tan_lan_xie_jie_meta.setUnbreakable(true);
        tan_lan_gui_jie_meta.setUnbreakable(true);
        tan_lan_mo_jie_meta.setUnbreakable(true);
        tan_lan_ming_jie_meta.setUnbreakable(true);

        po_sun_chi_zhi_jie_meta.setUnbreakable(true);
        chi_mi_zhi_jie_meta.setUnbreakable(true);
        chi_yu_du_jie_meta.setUnbreakable(true);
        chi_yu_xie_jie_meta.setUnbreakable(true);
        chi_yu_gui_jie_meta.setUnbreakable(true);
        chi_yu_mo_jie_meta.setUnbreakable(true);
        chi_yu_ming_jie_meta.setUnbreakable(true);

        po_sun_chen_zhi_jie_meta.setUnbreakable(true);
        chen_nu_zhi_jie_meta.setUnbreakable(true);
        chen_hen_du_jie_meta.setUnbreakable(true);
        chen_hen_xie_jie_meta.setUnbreakable(true);
        chen_hen_gui_jie_meta.setUnbreakable(true);
        chen_hen_mo_jie_meta.setUnbreakable(true);
        chen_hen_ming_jie_meta.setUnbreakable(true);

        chan_ding_fa_jie_meta.setUnbreakable(true);
        chan_ding_sheng_jie_meta.setUnbreakable(true);
        chan_ding_fo_jie_meta.setUnbreakable(true);
        chan_ding_xian_jie_meta.setUnbreakable(true);
        chan_ding_shen_jie_meta.setUnbreakable(true);

        zhi_hui_fa_jie_meta.setUnbreakable(true);
        zhi_hui_sheng_jie_meta.setUnbreakable(true);
        zhi_hui_fo_jie_meta.setUnbreakable(true);
        zhi_hui_xian_jie_meta.setUnbreakable(true);
        zhi_hui_shen_jie_meta.setUnbreakable(true);

        chi_jie_fa_jie_meta.setUnbreakable(true);
        chi_jie_sheng_jie_meta.setUnbreakable(true);
        chi_jie_fo_jie_meta.setUnbreakable(true);
        chi_jie_xian_jie_meta.setUnbreakable(true);
        chi_jie_shen_jie_meta.setUnbreakable(true);

        qing_long_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        qing_long_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        qing_long_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        qing_long_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        qing_long_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        qing_long_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        zhu_que_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhu_que_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhu_que_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhu_que_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhu_que_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhu_que_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        bai_hu_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        bai_hu_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        bai_hu_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        bai_hu_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        bai_hu_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        bai_hu_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        xuan_wu_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xuan_wu_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xuan_wu_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xuan_wu_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xuan_wu_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xuan_wu_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        hun_tian_lin_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tai_chu_shen_jia_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zi_sha_chan_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        feng_huo_lun_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        jiu_tian_xuan_yu_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        wei_tuo_tian_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        po_sun_tan_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tan_yu_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tan_lan_du_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tan_lan_xie_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tan_lan_gui_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tan_lan_mo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        tan_lan_ming_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        po_sun_chi_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_mi_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_yu_du_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_yu_xie_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_yu_gui_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_yu_mo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_yu_ming_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        po_sun_chen_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chen_nu_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chen_hen_du_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chen_hen_xie_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chen_hen_gui_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chen_hen_mo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chen_hen_ming_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        chan_ding_fa_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chan_ding_sheng_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chan_ding_fo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chan_ding_xian_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chan_ding_shen_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        zhi_hui_fa_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhi_hui_sheng_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhi_hui_fo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhi_hui_xian_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        zhi_hui_shen_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        chi_jie_fa_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_jie_sheng_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_jie_fo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_jie_xian_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        chi_jie_shen_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        qing_long_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        qing_long_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        qing_long_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        qing_long_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        qing_long_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        qing_long_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        zhu_que_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhu_que_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhu_que_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhu_que_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhu_que_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhu_que_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        bai_hu_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        bai_hu_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        bai_hu_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        bai_hu_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        bai_hu_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        bai_hu_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        xuan_wu_sheng_qi1_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xuan_wu_sheng_qi2_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xuan_wu_sheng_qi3_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xuan_wu_sheng_qi4_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xuan_wu_sheng_qi5_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xuan_wu_sheng_qi6_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        hun_tian_lin_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tai_chu_shen_jia_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zi_sha_chan_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        feng_huo_lun_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        jiu_tian_xuan_yu_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        wei_tuo_tian_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        po_sun_tan_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tan_yu_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tan_lan_du_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tan_lan_xie_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tan_lan_gui_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tan_lan_mo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        tan_lan_ming_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        po_sun_chi_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_mi_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_yu_du_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_yu_xie_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_yu_gui_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_yu_mo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_yu_ming_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        po_sun_chen_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chen_nu_zhi_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chen_hen_du_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chen_hen_xie_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chen_hen_gui_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chen_hen_mo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chen_hen_ming_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        chan_ding_fa_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chan_ding_sheng_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chan_ding_fo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chan_ding_xian_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chan_ding_shen_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        zhi_hui_fa_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhi_hui_sheng_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhi_hui_fo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhi_hui_xian_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        zhi_hui_shen_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        chi_jie_fa_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_jie_sheng_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_jie_fo_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_jie_xian_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        chi_jie_shen_jie_meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        qing_long_sheng_qi1_meta.setCustomModelData(1);
        qing_long_sheng_qi2_meta.setCustomModelData(1);
        qing_long_sheng_qi3_meta.setCustomModelData(1);
        qing_long_sheng_qi4_meta.setCustomModelData(1);
        qing_long_sheng_qi5_meta.setCustomModelData(1);
        qing_long_sheng_qi6_meta.setCustomModelData(1);

        zhu_que_sheng_qi1_meta.setCustomModelData(2);
        zhu_que_sheng_qi2_meta.setCustomModelData(2);
        zhu_que_sheng_qi3_meta.setCustomModelData(2);
        zhu_que_sheng_qi4_meta.setCustomModelData(2);
        zhu_que_sheng_qi5_meta.setCustomModelData(2);
        zhu_que_sheng_qi6_meta.setCustomModelData(2);

        bai_hu_sheng_qi1_meta.setCustomModelData(3);
        bai_hu_sheng_qi2_meta.setCustomModelData(3);
        bai_hu_sheng_qi3_meta.setCustomModelData(3);
        bai_hu_sheng_qi4_meta.setCustomModelData(3);
        bai_hu_sheng_qi5_meta.setCustomModelData(3);
        bai_hu_sheng_qi6_meta.setCustomModelData(3);

        xuan_wu_sheng_qi1_meta.setCustomModelData(4);
        xuan_wu_sheng_qi2_meta.setCustomModelData(4);
        xuan_wu_sheng_qi3_meta.setCustomModelData(4);
        xuan_wu_sheng_qi4_meta.setCustomModelData(4);
        xuan_wu_sheng_qi5_meta.setCustomModelData(4);
        xuan_wu_sheng_qi6_meta.setCustomModelData(4);

        hun_tian_lin_meta.setCustomModelData(5);

        tai_chu_shen_jia_meta.setCustomModelData(6);

        zi_sha_chan_meta.setCustomModelData(7);

        feng_huo_lun_meta.setCustomModelData(8);
        jiu_tian_xuan_yu_meta.setCustomModelData(8);
        wei_tuo_tian_meta.setCustomModelData(8);

        po_sun_tan_zhi_jie_meta.setCustomModelData(9);
        tan_yu_zhi_jie_meta.setCustomModelData(10);
        tan_lan_du_jie_meta.setCustomModelData(11);
        tan_lan_xie_jie_meta.setCustomModelData(12);
        tan_lan_gui_jie_meta.setCustomModelData(13);
        tan_lan_mo_jie_meta.setCustomModelData(14);
        tan_lan_ming_jie_meta.setCustomModelData(15);

        po_sun_chi_zhi_jie_meta.setCustomModelData(16);
        chi_mi_zhi_jie_meta.setCustomModelData(17);
        chi_yu_du_jie_meta.setCustomModelData(18);
        chi_yu_xie_jie_meta.setCustomModelData(19);
        chi_yu_gui_jie_meta.setCustomModelData(20);
        chi_yu_mo_jie_meta.setCustomModelData(21);
        chi_yu_ming_jie_meta.setCustomModelData(22);

        po_sun_chen_zhi_jie_meta.setCustomModelData(23);
        chen_nu_zhi_jie_meta.setCustomModelData(24);
        chen_hen_du_jie_meta.setCustomModelData(25);
        chen_hen_xie_jie_meta.setCustomModelData(26);
        chen_hen_gui_jie_meta.setCustomModelData(27);
        chen_hen_mo_jie_meta.setCustomModelData(28);
        chen_hen_ming_jie_meta.setCustomModelData(29);

        chan_ding_fa_jie_meta.setCustomModelData(30);
        chan_ding_sheng_jie_meta.setCustomModelData(31);
        chan_ding_fo_jie_meta.setCustomModelData(32);
        chan_ding_xian_jie_meta.setCustomModelData(33);
        chan_ding_shen_jie_meta.setCustomModelData(34);

        zhi_hui_fa_jie_meta.setCustomModelData(35);
        zhi_hui_sheng_jie_meta.setCustomModelData(36);
        zhi_hui_fo_jie_meta.setCustomModelData(37);
        zhi_hui_xian_jie_meta.setCustomModelData(38);
        zhi_hui_shen_jie_meta.setCustomModelData(39);

        chi_jie_fa_jie_meta.setCustomModelData(40);
        chi_jie_sheng_jie_meta.setCustomModelData(41);
        chi_jie_fo_jie_meta.setCustomModelData(42);
        chi_jie_xian_jie_meta.setCustomModelData(43);
        chi_jie_shen_jie_meta.setCustomModelData(44);

        PersistentDataContainer pdc_qing_long_sheng_qi1 = qing_long_sheng_qi1_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_qing_long_sheng_qi2 = qing_long_sheng_qi2_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_qing_long_sheng_qi3 = qing_long_sheng_qi3_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_qing_long_sheng_qi4 = qing_long_sheng_qi4_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_qing_long_sheng_qi5 = qing_long_sheng_qi5_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_qing_long_sheng_qi6 = qing_long_sheng_qi6_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhu_que_sheng_qi1 = zhu_que_sheng_qi1_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhu_que_sheng_qi2 = zhu_que_sheng_qi2_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhu_que_sheng_qi3 = zhu_que_sheng_qi3_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhu_que_sheng_qi4 = zhu_que_sheng_qi4_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhu_que_sheng_qi5 = zhu_que_sheng_qi5_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhu_que_sheng_qi6 = zhu_que_sheng_qi6_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_bai_hu_sheng_qi1 = bai_hu_sheng_qi1_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_bai_hu_sheng_qi2 = bai_hu_sheng_qi2_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_bai_hu_sheng_qi3 = bai_hu_sheng_qi3_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_bai_hu_sheng_qi4 = bai_hu_sheng_qi4_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_bai_hu_sheng_qi5 = bai_hu_sheng_qi5_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_bai_hu_sheng_qi6 = bai_hu_sheng_qi6_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_xuan_wu_sheng_qi1 = xuan_wu_sheng_qi1_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_xuan_wu_sheng_qi2 = xuan_wu_sheng_qi2_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_xuan_wu_sheng_qi3 = xuan_wu_sheng_qi3_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_xuan_wu_sheng_qi4 = xuan_wu_sheng_qi4_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_xuan_wu_sheng_qi5 = xuan_wu_sheng_qi5_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_xuan_wu_sheng_qi6 = xuan_wu_sheng_qi6_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_hun_tian_lin = hun_tian_lin_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_tai_chu_shen_jia = tai_chu_shen_jia_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zi_sha_chan = zi_sha_chan_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_feng_huo_lun = feng_huo_lun_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_jiu_tian_xuan_yu = jiu_tian_xuan_yu_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_wei_tuo_tian = wei_tuo_tian_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_po_sun_tan_zhi_jie = po_sun_tan_zhi_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_tan_yu_zhi_jie = tan_yu_zhi_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_tan_lan_du_jie = tan_lan_du_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_tan_lan_xie_jie = tan_lan_xie_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_tan_lan_gui_jie = tan_lan_gui_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_tan_lan_mo_jie = tan_lan_mo_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_tan_lan_ming_jie = tan_lan_ming_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_po_sun_chi_zhi_jie = po_sun_chi_zhi_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_mi_zhi_jie = chi_mi_zhi_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_yu_du_jie = chi_yu_du_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_yu_xie_jie = chi_yu_xie_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_yu_gui_jie = chi_yu_gui_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_yu_mo_jie = chi_yu_mo_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_yu_ming_jie = chi_yu_ming_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_po_sun_chen_zhi_jie = po_sun_chen_zhi_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chen_nu_zhi_jie = chen_nu_zhi_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chen_hen_du_jie = chen_hen_du_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chen_hen_xie_jie = chen_hen_xie_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chen_hen_gui_jie = chen_hen_gui_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chen_hen_mo_jie = chen_hen_mo_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chen_hen_ming_jie = chen_hen_ming_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chan_ding_fa_jie = chan_ding_fa_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chan_ding_sheng_jie = chan_ding_sheng_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chan_ding_fo_jie = chan_ding_fo_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chan_ding_xian_jie = chan_ding_xian_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chan_ding_shen_jie = chan_ding_shen_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhi_hui_fa_jie = zhi_hui_fa_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhi_hui_sheng_jie = zhi_hui_sheng_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhi_hui_fo_jie = zhi_hui_fo_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhi_hui_xian_jie = zhi_hui_xian_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_zhi_hui_shen_jie = zhi_hui_shen_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_jie_fa_jie = chi_jie_fa_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_jie_sheng_jie = chi_jie_sheng_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_jie_fo_jie = chi_jie_fo_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_jie_xian_jie = chi_jie_xian_jie_meta.getPersistentDataContainer();
        PersistentDataContainer pdc_chi_jie_shen_jie = chi_jie_shen_jie_meta.getPersistentDataContainer();

        pdc_qing_long_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "qing_long_sheng_qi1");
        pdc_qing_long_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "qing_long_sheng_qi2");
        pdc_qing_long_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "qing_long_sheng_qi3");
        pdc_qing_long_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "qing_long_sheng_qi4");
        pdc_qing_long_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "qing_long_sheng_qi5");
        pdc_qing_long_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "qing_long_sheng_qi6");
        pdc_zhu_que_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "zhu_que_sheng_qi1");
        pdc_zhu_que_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "zhu_que_sheng_qi2");
        pdc_zhu_que_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "zhu_que_sheng_qi3");
        pdc_zhu_que_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "zhu_que_sheng_qi4");
        pdc_zhu_que_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "zhu_que_sheng_qi5");
        pdc_zhu_que_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "zhu_que_sheng_qi6");
        pdc_bai_hu_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "bai_hu_sheng_qi1");
        pdc_bai_hu_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "bai_hu_sheng_qi2");
        pdc_bai_hu_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "bai_hu_sheng_qi3");
        pdc_bai_hu_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "bai_hu_sheng_qi4");
        pdc_bai_hu_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "bai_hu_sheng_qi5");
        pdc_bai_hu_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "bai_hu_sheng_qi6");
        pdc_xuan_wu_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "xuan_wu_sheng_qi1");
        pdc_xuan_wu_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "xuan_wu_sheng_qi2");
        pdc_xuan_wu_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "xuan_wu_sheng_qi3");
        pdc_xuan_wu_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "xuan_wu_sheng_qi4");
        pdc_xuan_wu_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "xuan_wu_sheng_qi5");
        pdc_xuan_wu_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "xuan_wu_sheng_qi6");
        pdc_hun_tian_lin.set(DataContainer.id, PersistentDataType.STRING, "hun_tian_lin");
        pdc_tai_chu_shen_jia.set(DataContainer.id, PersistentDataType.STRING, "tai_chu_shen_jia");
        pdc_zi_sha_chan.set(DataContainer.id, PersistentDataType.STRING, "zi_sha_chan");
        pdc_feng_huo_lun.set(DataContainer.id, PersistentDataType.STRING, "feng_huo_lun");
        pdc_jiu_tian_xuan_yu.set(DataContainer.id, PersistentDataType.STRING, "jiu_tian_xuan_yu");
        pdc_wei_tuo_tian.set(DataContainer.id, PersistentDataType.STRING, "wei_tuo_tian");
        pdc_po_sun_tan_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "po_sun_tan_zhi_jie");
        pdc_tan_yu_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "tan_yu_zhi_jie");
        pdc_tan_lan_du_jie.set(DataContainer.id, PersistentDataType.STRING, "tan_lan_du_jie");
        pdc_tan_lan_xie_jie.set(DataContainer.id, PersistentDataType.STRING, "tan_lan_xie_jie");
        pdc_tan_lan_gui_jie.set(DataContainer.id, PersistentDataType.STRING, "tan_lan_gui_jie");
        pdc_tan_lan_mo_jie.set(DataContainer.id, PersistentDataType.STRING, "tan_lan_mo_jie");
        pdc_tan_lan_ming_jie.set(DataContainer.id, PersistentDataType.STRING, "tan_lan_ming_jie");
        pdc_po_sun_chi_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "po_sun_chi_zhi_jie");
        pdc_chi_mi_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_mi_zhi_jie");
        pdc_chi_yu_du_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_yu_du_jie");
        pdc_chi_yu_xie_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_yu_xie_jie");
        pdc_chi_yu_gui_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_yu_gui_jie");
        pdc_chi_yu_mo_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_yu_mo_jie");
        pdc_chi_yu_ming_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_yu_ming_jie");
        pdc_po_sun_chen_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "po_sun_chen_zhi_jie");
        pdc_chen_nu_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "chen_nu_zhi_jie");
        pdc_chen_hen_du_jie.set(DataContainer.id, PersistentDataType.STRING, "chen_hen_du_jie");
        pdc_chen_hen_xie_jie.set(DataContainer.id, PersistentDataType.STRING, "chen_hen_xie_jie");
        pdc_chen_hen_gui_jie.set(DataContainer.id, PersistentDataType.STRING, "chen_hen_gui_jie");
        pdc_chen_hen_mo_jie.set(DataContainer.id, PersistentDataType.STRING, "chen_hen_mo_jie");
        pdc_chen_hen_ming_jie.set(DataContainer.id, PersistentDataType.STRING, "chen_hen_ming_jie");
        pdc_chan_ding_fa_jie.set(DataContainer.id, PersistentDataType.STRING, "chan_ding_fa_jie");
        pdc_chan_ding_sheng_jie.set(DataContainer.id, PersistentDataType.STRING, "chan_ding_sheng_jie");
        pdc_chan_ding_fo_jie.set(DataContainer.id, PersistentDataType.STRING, "chan_ding_fo_jie");
        pdc_chan_ding_xian_jie.set(DataContainer.id, PersistentDataType.STRING, "chan_ding_xian_jie");
        pdc_chan_ding_shen_jie.set(DataContainer.id, PersistentDataType.STRING, "chan_ding_shen_jie");
        pdc_zhi_hui_fa_jie.set(DataContainer.id, PersistentDataType.STRING, "zhi_hui_fa_jie");
        pdc_zhi_hui_sheng_jie.set(DataContainer.id, PersistentDataType.STRING, "zhi_hui_sheng_jie");
        pdc_zhi_hui_fo_jie.set(DataContainer.id, PersistentDataType.STRING, "zhi_hui_fo_jie");
        pdc_zhi_hui_xian_jie.set(DataContainer.id, PersistentDataType.STRING, "zhi_hui_xian_jie");
        pdc_zhi_hui_shen_jie.set(DataContainer.id, PersistentDataType.STRING, "zhi_hui_shen_jie");
        pdc_chi_jie_fa_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_jie_fa_jie");
        pdc_chi_jie_sheng_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_jie_sheng_jie");
        pdc_chi_jie_fo_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_jie_fo_jie");
        pdc_chi_jie_xian_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_jie_xian_jie");
        pdc_chi_jie_shen_jie.set(DataContainer.id, PersistentDataType.STRING, "chi_jie_shen_jie");


        qing_long_sheng_qi1_meta.displayName(
                Component.text("一阶青龙兽魂[饰品]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        qing_long_sheng_qi2_meta.displayName(
                Component.text("二阶青龙兽魂[饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        qing_long_sheng_qi3_meta.displayName(
                Component.text("三阶青龙兽魂[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        qing_long_sheng_qi4_meta.displayName(
                Component.text("四阶青龙兽魂[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        qing_long_sheng_qi5_meta.displayName(
                Component.text("五阶青龙兽魂[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        qing_long_sheng_qi6_meta.displayName(
                Component.text("六阶青龙兽魂[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        zhu_que_sheng_qi1_meta.displayName(
                Component.text("一阶朱雀兽魂[饰品]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        zhu_que_sheng_qi2_meta.displayName(
                Component.text("二阶朱雀兽魂[饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        zhu_que_sheng_qi3_meta.displayName(
                Component.text("三阶朱雀兽魂[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        zhu_que_sheng_qi4_meta.displayName(
                Component.text("四阶朱雀兽魂[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        zhu_que_sheng_qi5_meta.displayName(
                Component.text("五阶朱雀兽魂[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        zhu_que_sheng_qi6_meta.displayName(
                Component.text("六阶朱雀兽魂[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        bai_hu_sheng_qi1_meta.displayName(
                Component.text("一阶白虎兽魂[饰品]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        bai_hu_sheng_qi2_meta.displayName(
                Component.text("二阶白虎兽魂[饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        bai_hu_sheng_qi3_meta.displayName(
                Component.text("三阶白虎兽魂[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        bai_hu_sheng_qi4_meta.displayName(
                Component.text("四阶白虎兽魂[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        bai_hu_sheng_qi5_meta.displayName(
                Component.text("五阶白虎兽魂[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        bai_hu_sheng_qi6_meta.displayName(
                Component.text("六阶白虎兽魂[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        xuan_wu_sheng_qi1_meta.displayName(
                Component.text("一阶玄武兽魂[饰品]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        xuan_wu_sheng_qi2_meta.displayName(
                Component.text("二阶玄武兽魂[饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        xuan_wu_sheng_qi3_meta.displayName(
                Component.text("三阶玄武兽魂[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        xuan_wu_sheng_qi4_meta.displayName(
                Component.text("四阶玄武兽魂[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        xuan_wu_sheng_qi5_meta.displayName(
                Component.text("五阶玄武兽魂[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        xuan_wu_sheng_qi6_meta.displayName(
                Component.text("六阶玄武兽魂[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );

        hun_tian_lin_meta.displayName(
                Component.text("混天绫[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        tai_chu_shen_jia_meta.displayName(
                Component.text("太初神甲[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        zi_sha_chan_meta.displayName(
                Component.text("紫砂缠[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        feng_huo_lun_meta.displayName(
                Component.text("风火轮[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        jiu_tian_xuan_yu_meta.displayName(
                Component.text("九天玄羽[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        wei_tuo_tian_meta.displayName(
                Component.text("韦驮天[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );

        po_sun_tan_zhi_jie_meta.displayName(
                Component.text("破损贪之戒[饰品]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        tan_yu_zhi_jie_meta.displayName(
                Component.text("贪欲之戒[饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        tan_lan_du_jie_meta.displayName(
                Component.text("贪婪毒戒[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        tan_lan_xie_jie_meta.displayName(
                Component.text("贪婪邪戒[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        tan_lan_gui_jie_meta.displayName(
                Component.text("贪婪鬼戒[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        tan_lan_mo_jie_meta.displayName(
                Component.text("贪婪魔戒[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        tan_lan_ming_jie_meta.displayName(
                Component.text("贪婪冥戒[饰品]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );

        po_sun_chi_zhi_jie_meta.displayName(
                Component.text("破损痴之戒[饰品]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        chi_mi_zhi_jie_meta.displayName(
                Component.text("痴迷之戒[饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        chi_yu_du_jie_meta.displayName(
                Component.text("痴愚毒戒[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        chi_yu_xie_jie_meta.displayName(
                Component.text("痴愚邪戒[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        chi_yu_gui_jie_meta.displayName(
                Component.text("痴愚鬼戒[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        chi_yu_mo_jie_meta.displayName(
                Component.text("痴愚魔戒[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        chi_yu_ming_jie_meta.displayName(
                Component.text("痴愚冥戒[饰品]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );

        po_sun_chen_zhi_jie_meta.displayName(
                Component.text("破损嗔之戒[饰品]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false)
        );
        chen_nu_zhi_jie_meta.displayName(
                Component.text("嗔怒之戒[饰品]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false)
        );
        chen_hen_du_jie_meta.displayName(
                Component.text("嗔恨毒戒[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        chen_hen_xie_jie_meta.displayName(
                Component.text("嗔恨邪戒[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        chen_hen_gui_jie_meta.displayName(
                Component.text("嗔恨鬼戒[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        chen_hen_mo_jie_meta.displayName(
                Component.text("嗔恨魔戒[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        chen_hen_ming_jie_meta.displayName(
                Component.text("嗔恨冥戒[饰品]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );

        chan_ding_fa_jie_meta.displayName(
                Component.text("禅定法戒[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        chan_ding_sheng_jie_meta.displayName(
                Component.text("禅定圣戒[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        chan_ding_fo_jie_meta.displayName(
                Component.text("禅定佛戒[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        chan_ding_xian_jie_meta.displayName(
                Component.text("禅定仙戒[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        chan_ding_shen_jie_meta.displayName(
                Component.text("禅定神戒[饰品]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );

        zhi_hui_fa_jie_meta.displayName(
                Component.text("智慧法戒[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        zhi_hui_sheng_jie_meta.displayName(
                Component.text("智慧圣戒[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        zhi_hui_fo_jie_meta.displayName(
                Component.text("智慧佛戒[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        zhi_hui_xian_jie_meta.displayName(
                Component.text("智慧仙戒[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        zhi_hui_shen_jie_meta.displayName(
                Component.text("智慧神戒[饰品]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );

        chi_jie_fa_jie_meta.displayName(
                Component.text("持戒法戒[饰品]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false)
        );
        chi_jie_sheng_jie_meta.displayName(
                Component.text("持戒圣戒[饰品]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false)
        );
        chi_jie_fo_jie_meta.displayName(
                Component.text("持戒佛戒[饰品]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false)
        );
        chi_jie_xian_jie_meta.displayName(
                Component.text("持戒仙戒[饰品]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)
        );
        chi_jie_shen_jie_meta.displayName(
                Component.text("持戒神戒[饰品]").color(NamedTextColor.DARK_RED).decoration(TextDecoration.ITALIC, false)
        );

        qing_long_sheng_qi1_meta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        qing_long_sheng_qi2_meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        qing_long_sheng_qi3_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        qing_long_sheng_qi4_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        qing_long_sheng_qi5_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        qing_long_sheng_qi6_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        zhu_que_sheng_qi1_meta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        zhu_que_sheng_qi2_meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        zhu_que_sheng_qi3_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        zhu_que_sheng_qi4_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        zhu_que_sheng_qi5_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        zhu_que_sheng_qi6_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        bai_hu_sheng_qi1_meta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        bai_hu_sheng_qi2_meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        bai_hu_sheng_qi3_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        bai_hu_sheng_qi4_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        bai_hu_sheng_qi5_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        bai_hu_sheng_qi6_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        xuan_wu_sheng_qi1_meta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        xuan_wu_sheng_qi2_meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        xuan_wu_sheng_qi3_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        xuan_wu_sheng_qi4_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        xuan_wu_sheng_qi5_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        xuan_wu_sheng_qi6_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        hun_tian_lin_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        tai_chu_shen_jia_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        zi_sha_chan_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        feng_huo_lun_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        jiu_tian_xuan_yu_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        wei_tuo_tian_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        po_sun_tan_zhi_jie_meta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        tan_yu_zhi_jie_meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        tan_lan_du_jie_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        tan_lan_xie_jie_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        tan_lan_gui_jie_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        tan_lan_mo_jie_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        tan_lan_ming_jie_meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        po_sun_chi_zhi_jie_meta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        chi_mi_zhi_jie_meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        chi_yu_du_jie_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        chi_yu_xie_jie_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        chi_yu_gui_jie_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        chi_yu_mo_jie_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        chi_yu_ming_jie_meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        po_sun_chen_zhi_jie_meta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        chen_nu_zhi_jie_meta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        chen_hen_du_jie_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        chen_hen_xie_jie_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        chen_hen_gui_jie_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        chen_hen_mo_jie_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        chen_hen_ming_jie_meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        chan_ding_fa_jie_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        chan_ding_sheng_jie_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        chan_ding_fo_jie_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        chan_ding_xian_jie_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        chan_ding_shen_jie_meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        zhi_hui_fa_jie_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        zhi_hui_sheng_jie_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        zhi_hui_fo_jie_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        zhi_hui_xian_jie_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        zhi_hui_shen_jie_meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );

        chi_jie_fa_jie_meta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        chi_jie_sheng_jie_meta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        chi_jie_fo_jie_meta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        chi_jie_xian_jie_meta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        chi_jie_shen_jie_meta.lore(
                List.of(
                        ComponentSet.RARE7
                )
        );


        QING_LONG_SHENG_QI1.setItemMeta(qing_long_sheng_qi1_meta);
        QING_LONG_SHENG_QI2.setItemMeta(qing_long_sheng_qi2_meta);
        QING_LONG_SHENG_QI3.setItemMeta(qing_long_sheng_qi3_meta);
        QING_LONG_SHENG_QI4.setItemMeta(qing_long_sheng_qi4_meta);
        QING_LONG_SHENG_QI5.setItemMeta(qing_long_sheng_qi5_meta);
        QING_LONG_SHENG_QI6.setItemMeta(qing_long_sheng_qi6_meta);
        ZHU_QUE_SHENG_QI1.setItemMeta(zhu_que_sheng_qi1_meta);
        ZHU_QUE_SHENG_QI2.setItemMeta(zhu_que_sheng_qi2_meta);
        ZHU_QUE_SHENG_QI3.setItemMeta(zhu_que_sheng_qi3_meta);
        ZHU_QUE_SHENG_QI4.setItemMeta(zhu_que_sheng_qi4_meta);
        ZHU_QUE_SHENG_QI5.setItemMeta(zhu_que_sheng_qi5_meta);
        ZHU_QUE_SHENG_QI6.setItemMeta(zhu_que_sheng_qi6_meta);
        BAI_HU_SHENG_QI1.setItemMeta(bai_hu_sheng_qi1_meta);
        BAI_HU_SHENG_QI2.setItemMeta(bai_hu_sheng_qi2_meta);
        BAI_HU_SHENG_QI3.setItemMeta(bai_hu_sheng_qi3_meta);
        BAI_HU_SHENG_QI4.setItemMeta(bai_hu_sheng_qi4_meta);
        BAI_HU_SHENG_QI5.setItemMeta(bai_hu_sheng_qi5_meta);
        BAI_HU_SHENG_QI6.setItemMeta(bai_hu_sheng_qi6_meta);
        XUAN_WU_SHENG_QI1.setItemMeta(xuan_wu_sheng_qi1_meta);
        XUAN_WU_SHENG_QI2.setItemMeta(xuan_wu_sheng_qi2_meta);
        XUAN_WU_SHENG_QI3.setItemMeta(xuan_wu_sheng_qi3_meta);
        XUAN_WU_SHENG_QI4.setItemMeta(xuan_wu_sheng_qi4_meta);
        XUAN_WU_SHENG_QI5.setItemMeta(xuan_wu_sheng_qi5_meta);
        XUAN_WU_SHENG_QI6.setItemMeta(xuan_wu_sheng_qi6_meta);
        HUN_TIAN_LIN.setItemMeta(hun_tian_lin_meta);
        TAI_CHU_SHEN_JIA.setItemMeta(tai_chu_shen_jia_meta);
        ZI_SHA_CHAN.setItemMeta(zi_sha_chan_meta);
        FENG_HUO_LUN.setItemMeta(feng_huo_lun_meta);
        JIU_TIAN_XUAN_YU.setItemMeta(jiu_tian_xuan_yu_meta);
        WEI_TUO_TIAN.setItemMeta(wei_tuo_tian_meta);
        PO_SUN_TAN_ZHI_JIE.setItemMeta(po_sun_tan_zhi_jie_meta);
        TAN_YU_ZHI_JIE.setItemMeta(tan_yu_zhi_jie_meta);
        TAN_LAN_DU_JIE.setItemMeta(tan_lan_du_jie_meta);
        TAN_LAN_XIE_JIE.setItemMeta(tan_lan_xie_jie_meta);
        TAN_LAN_GUI_JIE.setItemMeta(tan_lan_gui_jie_meta);
        TAN_LAN_MO_JIE.setItemMeta(tan_lan_mo_jie_meta);
        TAN_LAN_MING_JIE.setItemMeta(tan_lan_ming_jie_meta);
        PO_SUN_CHI_ZHI_JIE.setItemMeta(po_sun_chi_zhi_jie_meta);
        CHI_MI_ZHI_JIE.setItemMeta(chi_mi_zhi_jie_meta);
        CHI_YU_DU_JIE.setItemMeta(chi_yu_du_jie_meta);
        CHI_YU_XIE_JIE.setItemMeta(chi_yu_xie_jie_meta);
        CHI_YU_GUI_JIE.setItemMeta(chi_yu_gui_jie_meta);
        CHI_YU_MO_JIE.setItemMeta(chi_yu_mo_jie_meta);
        CHI_YU_MING_JIE.setItemMeta(chi_yu_ming_jie_meta);
        PO_SUN_CHEN_ZHI_JIE.setItemMeta(po_sun_chen_zhi_jie_meta);
        CHEN_NU_ZHI_JIE.setItemMeta(chen_nu_zhi_jie_meta);
        CHEN_HEN_DU_JIE.setItemMeta(chen_hen_du_jie_meta);
        CHEN_HEN_XIE_JIE.setItemMeta(chen_hen_xie_jie_meta);
        CHEN_HEN_GUI_JIE.setItemMeta(chen_hen_gui_jie_meta);
        CHEN_HEN_MO_JIE.setItemMeta(chen_hen_mo_jie_meta);
        CHEN_HEN_MING_JIE.setItemMeta(chen_hen_ming_jie_meta);
        CHAN_DING_FA_JIE.setItemMeta(chan_ding_fa_jie_meta);
        CHAN_DING_SHENG_JIE.setItemMeta(chan_ding_sheng_jie_meta);
        CHAN_DING_FO_JIE.setItemMeta(chan_ding_fo_jie_meta);
        CHAN_DING_XIAN_JIE.setItemMeta(chan_ding_xian_jie_meta);
        CHAN_DING_SHEN_JIE.setItemMeta(chan_ding_shen_jie_meta);
        ZHI_HUI_FA_JIE.setItemMeta(zhi_hui_fa_jie_meta);
        ZHI_HUI_SHENG_JIE.setItemMeta(zhi_hui_sheng_jie_meta);
        ZHI_HUI_FO_JIE.setItemMeta(zhi_hui_fo_jie_meta);
        ZHI_HUI_XIAN_JIE.setItemMeta(zhi_hui_xian_jie_meta);
        ZHI_HUI_SHEN_JIE.setItemMeta(zhi_hui_shen_jie_meta);
        CHI_JIE_FA_JIE.setItemMeta(chi_jie_fa_jie_meta);
        CHI_JIE_SHENG_JIE.setItemMeta(chi_jie_sheng_jie_meta);
        CHI_JIE_FO_JIE.setItemMeta(chi_jie_fo_jie_meta);
        CHI_JIE_XIAN_JIE.setItemMeta(chi_jie_xian_jie_meta);
        CHI_JIE_SHEN_JIE.setItemMeta(chi_jie_shen_jie_meta);


    }


}
