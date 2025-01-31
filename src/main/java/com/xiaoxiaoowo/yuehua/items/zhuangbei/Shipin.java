package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import io.papermc.paper.datacomponent.DataComponentTypes;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Shipin {
    public static final ItemStack QING_LONG_SHENG_QI1 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack QING_LONG_SHENG_QI2 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack QING_LONG_SHENG_QI3 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack QING_LONG_SHENG_QI4 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack QING_LONG_SHENG_QI5 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack QING_LONG_SHENG_QI6 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack BAI_HU_SHENG_QI1 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack BAI_HU_SHENG_QI2 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack BAI_HU_SHENG_QI3 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack BAI_HU_SHENG_QI4 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack BAI_HU_SHENG_QI5 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack BAI_HU_SHENG_QI6 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack ZHU_QUE_SHENG_QI1 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHU_QUE_SHENG_QI2 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHU_QUE_SHENG_QI3 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHU_QUE_SHENG_QI4 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHU_QUE_SHENG_QI5 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHU_QUE_SHENG_QI6 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack XUAN_WU_SHENG_QI1 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack XUAN_WU_SHENG_QI2 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack XUAN_WU_SHENG_QI3 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack XUAN_WU_SHENG_QI4 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack XUAN_WU_SHENG_QI5 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack XUAN_WU_SHENG_QI6 = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack HUN_TIAN_LIN = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack TAI_CHU_SHEN_JIA = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZI_SHA_CHAN = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack FENG_HUO_LUN = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack JIU_TIAN_XUAN_YU = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack WEI_TUO_TIAN = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack PO_SUN_TAN_ZHI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack TAN_YU_ZHI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack TAN_LAN_DU_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack TAN_LAN_XIE_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack TAN_LAN_GUI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack TAN_LAN_MO_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack TAN_LAN_MING_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack PO_SUN_CHI_ZHI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_MI_ZHI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_YU_DU_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_YU_XIE_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_YU_GUI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_YU_MO_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_YU_MING_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack PO_SUN_CHEN_ZHI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHEN_NU_ZHI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHEN_HEN_DU_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHEN_HEN_XIE_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHEN_HEN_GUI_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHEN_HEN_MO_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHEN_HEN_MING_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack CHAN_DING_FA_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHAN_DING_SHENG_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHAN_DING_FO_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHAN_DING_XIAN_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHAN_DING_SHEN_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack ZHI_HUI_FA_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHI_HUI_SHENG_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHI_HUI_FO_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHI_HUI_XIAN_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack ZHI_HUI_SHEN_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

    public static final ItemStack CHI_JIE_FA_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_JIE_SHENG_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_JIE_FO_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_JIE_XIAN_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);
    public static final ItemStack CHI_JIE_SHEN_JIE = new ItemStack(Material.ARMS_UP_POTTERY_SHERD);

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

        qing_long_sheng_qi1_meta.setMaxStackSize(1);
        qing_long_sheng_qi2_meta.setMaxStackSize(1);
        qing_long_sheng_qi3_meta.setMaxStackSize(1);
        qing_long_sheng_qi4_meta.setMaxStackSize(1);
        qing_long_sheng_qi5_meta.setMaxStackSize(1);
        qing_long_sheng_qi6_meta.setMaxStackSize(1);
        zhu_que_sheng_qi1_meta.setMaxStackSize(1);
        zhu_que_sheng_qi2_meta.setMaxStackSize(1);
        zhu_que_sheng_qi3_meta.setMaxStackSize(1);
        zhu_que_sheng_qi4_meta.setMaxStackSize(1);
        zhu_que_sheng_qi5_meta.setMaxStackSize(1);
        zhu_que_sheng_qi6_meta.setMaxStackSize(1);
        bai_hu_sheng_qi1_meta.setMaxStackSize(1);
        bai_hu_sheng_qi2_meta.setMaxStackSize(1);
        bai_hu_sheng_qi3_meta.setMaxStackSize(1);
        bai_hu_sheng_qi4_meta.setMaxStackSize(1);
        bai_hu_sheng_qi5_meta.setMaxStackSize(1);
        bai_hu_sheng_qi6_meta.setMaxStackSize(1);
        xuan_wu_sheng_qi1_meta.setMaxStackSize(1);
        xuan_wu_sheng_qi2_meta.setMaxStackSize(1);
        xuan_wu_sheng_qi3_meta.setMaxStackSize(1);
        xuan_wu_sheng_qi4_meta.setMaxStackSize(1);
        xuan_wu_sheng_qi5_meta.setMaxStackSize(1);
        xuan_wu_sheng_qi6_meta.setMaxStackSize(1);
        hun_tian_lin_meta.setMaxStackSize(1);
        tai_chu_shen_jia_meta.setMaxStackSize(1);
        zi_sha_chan_meta.setMaxStackSize(1);
        feng_huo_lun_meta.setMaxStackSize(1);
        jiu_tian_xuan_yu_meta.setMaxStackSize(1);
        wei_tuo_tian_meta.setMaxStackSize(1);
        po_sun_tan_zhi_jie_meta.setMaxStackSize(1);
        tan_yu_zhi_jie_meta.setMaxStackSize(1);
        tan_lan_du_jie_meta.setMaxStackSize(1);
        tan_lan_xie_jie_meta.setMaxStackSize(1);
        tan_lan_gui_jie_meta.setMaxStackSize(1);
        tan_lan_mo_jie_meta.setMaxStackSize(1);
        tan_lan_ming_jie_meta.setMaxStackSize(1);
        po_sun_chi_zhi_jie_meta.setMaxStackSize(1);
        chi_mi_zhi_jie_meta.setMaxStackSize(1);
        chi_yu_du_jie_meta.setMaxStackSize(1);
        chi_yu_xie_jie_meta.setMaxStackSize(1);
        chi_yu_gui_jie_meta.setMaxStackSize(1);
        chi_yu_mo_jie_meta.setMaxStackSize(1);
        chi_yu_ming_jie_meta.setMaxStackSize(1);
        po_sun_chen_zhi_jie_meta.setMaxStackSize(1);
        chen_nu_zhi_jie_meta.setMaxStackSize(1);
        chen_hen_du_jie_meta.setMaxStackSize(1);
        chen_hen_xie_jie_meta.setMaxStackSize(1);
        chen_hen_gui_jie_meta.setMaxStackSize(1);
        chen_hen_mo_jie_meta.setMaxStackSize(1);
        chen_hen_ming_jie_meta.setMaxStackSize(1);
        chan_ding_fa_jie_meta.setMaxStackSize(1);
        chan_ding_sheng_jie_meta.setMaxStackSize(1);
        chan_ding_fo_jie_meta.setMaxStackSize(1);
        chan_ding_xian_jie_meta.setMaxStackSize(1);
        chan_ding_shen_jie_meta.setMaxStackSize(1);
        zhi_hui_fa_jie_meta.setMaxStackSize(1);
        zhi_hui_sheng_jie_meta.setMaxStackSize(1);
        zhi_hui_fo_jie_meta.setMaxStackSize(1);
        zhi_hui_xian_jie_meta.setMaxStackSize(1);
        zhi_hui_shen_jie_meta.setMaxStackSize(1);
        chi_jie_fa_jie_meta.setMaxStackSize(1);
        chi_jie_sheng_jie_meta.setMaxStackSize(1);
        chi_jie_fo_jie_meta.setMaxStackSize(1);
        chi_jie_xian_jie_meta.setMaxStackSize(1);
        chi_jie_shen_jie_meta.setMaxStackSize(1);


        // 青龙生气系列


// 朱雀生气系列


// 白虎生气系列


// 玄武生气系列


// 其他物品


// 贪系列


// 痴系列


// 嗔系列


// 禅定系列


// 智慧系列


// 持戒系列


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

        pdc_qing_long_sheng_qi1.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdc_qing_long_sheng_qi2.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdc_qing_long_sheng_qi3.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdc_qing_long_sheng_qi4.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdc_qing_long_sheng_qi5.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdc_qing_long_sheng_qi6.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdc_zhu_que_sheng_qi1.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdc_zhu_que_sheng_qi2.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdc_zhu_que_sheng_qi3.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdc_zhu_que_sheng_qi4.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdc_zhu_que_sheng_qi5.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdc_zhu_que_sheng_qi6.set(DataContainer.slot, PersistentDataType.INTEGER, 1);

        pdc_bai_hu_sheng_qi1.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdc_bai_hu_sheng_qi2.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdc_bai_hu_sheng_qi3.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdc_bai_hu_sheng_qi4.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdc_bai_hu_sheng_qi5.set(DataContainer.slot, PersistentDataType.INTEGER, 2);
        pdc_bai_hu_sheng_qi6.set(DataContainer.slot, PersistentDataType.INTEGER, 2);

        pdc_xuan_wu_sheng_qi1.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdc_xuan_wu_sheng_qi2.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdc_xuan_wu_sheng_qi3.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdc_xuan_wu_sheng_qi4.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdc_xuan_wu_sheng_qi5.set(DataContainer.slot, PersistentDataType.INTEGER, 3);
        pdc_xuan_wu_sheng_qi6.set(DataContainer.slot, PersistentDataType.INTEGER, 3);

        pdc_hun_tian_lin.set(DataContainer.slot, PersistentDataType.INTEGER, 7);
        pdc_tai_chu_shen_jia.set(DataContainer.slot, PersistentDataType.INTEGER, 7);
        pdc_zi_sha_chan.set(DataContainer.slot, PersistentDataType.INTEGER, 7);
        pdc_feng_huo_lun.set(DataContainer.slot, PersistentDataType.INTEGER, 7);
        pdc_jiu_tian_xuan_yu.set(DataContainer.slot, PersistentDataType.INTEGER, 7);
        pdc_wei_tuo_tian.set(DataContainer.slot, PersistentDataType.INTEGER, 7);

        pdc_po_sun_tan_zhi_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_tan_yu_zhi_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_tan_lan_du_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_tan_lan_xie_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_tan_lan_gui_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_tan_lan_mo_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_tan_lan_ming_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);

        pdc_po_sun_chi_zhi_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_chi_mi_zhi_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_chi_yu_du_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_chi_yu_xie_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_chi_yu_gui_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_chi_yu_mo_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_chi_yu_ming_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);

        pdc_po_sun_chen_zhi_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chen_nu_zhi_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chen_hen_du_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chen_hen_xie_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chen_hen_gui_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chen_hen_mo_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chen_hen_ming_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);

        pdc_chan_ding_fa_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_chan_ding_sheng_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_chan_ding_fo_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_chan_ding_xian_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);
        pdc_chan_ding_shen_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 4);

        pdc_zhi_hui_fa_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_zhi_hui_sheng_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_zhi_hui_fo_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_zhi_hui_xian_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);
        pdc_zhi_hui_shen_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 5);

        pdc_chi_jie_fa_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chi_jie_sheng_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chi_jie_fo_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chi_jie_xian_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);
        pdc_chi_jie_shen_jie.set(DataContainer.slot, PersistentDataType.INTEGER, 6);


        pdc_qing_long_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "qingLongShengQi1");
        pdc_qing_long_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "qingLongShengQi2");
        pdc_qing_long_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "qingLongShengQi3");
        pdc_qing_long_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "qingLongShengQi4");
        pdc_qing_long_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "qingLongShengQi5");
        pdc_qing_long_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "qingLongShengQi6");
        pdc_zhu_que_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "zhuQueShengQi1");
        pdc_zhu_que_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "zhuQueShengQi2");
        pdc_zhu_que_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "zhuQueShengQi3");
        pdc_zhu_que_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "zhuQueShengQi4");
        pdc_zhu_que_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "zhuQueShengQi5");
        pdc_zhu_que_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "zhuQueShengQi6");
        pdc_bai_hu_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "baiHuShengQi1");
        pdc_bai_hu_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "baiHuShengQi2");
        pdc_bai_hu_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "baiHuShengQi2");
        pdc_bai_hu_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "baiHuShengQi4");
        pdc_bai_hu_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "baiHuShengQi5");
        pdc_bai_hu_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "baiHuShengQi6");
        pdc_xuan_wu_sheng_qi1.set(DataContainer.id, PersistentDataType.STRING, "xuanWuShengQi1");
        pdc_xuan_wu_sheng_qi2.set(DataContainer.id, PersistentDataType.STRING, "xuanWuShengQi2");
        pdc_xuan_wu_sheng_qi3.set(DataContainer.id, PersistentDataType.STRING, "xuanWuShengQi3");
        pdc_xuan_wu_sheng_qi4.set(DataContainer.id, PersistentDataType.STRING, "xuanWuShengQi4");
        pdc_xuan_wu_sheng_qi5.set(DataContainer.id, PersistentDataType.STRING, "xuanWuShengQi5");
        pdc_xuan_wu_sheng_qi6.set(DataContainer.id, PersistentDataType.STRING, "xuanWuShengQi6");
        pdc_hun_tian_lin.set(DataContainer.id, PersistentDataType.STRING, "hunTianLin");
        pdc_tai_chu_shen_jia.set(DataContainer.id, PersistentDataType.STRING, "taiChuShenJia");
        pdc_zi_sha_chan.set(DataContainer.id, PersistentDataType.STRING, "ziShaChan");
        pdc_feng_huo_lun.set(DataContainer.id, PersistentDataType.STRING, "fengHuoLun");
        pdc_jiu_tian_xuan_yu.set(DataContainer.id, PersistentDataType.STRING, "jiuTianXuanYu");
        pdc_wei_tuo_tian.set(DataContainer.id, PersistentDataType.STRING, "weiTuoTian");
        pdc_po_sun_tan_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "poSunTanZhiJie");
        pdc_tan_yu_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "tanYuZhiJie");
        pdc_tan_lan_du_jie.set(DataContainer.id, PersistentDataType.STRING, "tanLanDuJie");
        pdc_tan_lan_xie_jie.set(DataContainer.id, PersistentDataType.STRING, "tanLanXieJie");
        pdc_tan_lan_gui_jie.set(DataContainer.id, PersistentDataType.STRING, "tanLanGuiJie");
        pdc_tan_lan_mo_jie.set(DataContainer.id, PersistentDataType.STRING, "tanLanMoJie");
        pdc_tan_lan_ming_jie.set(DataContainer.id, PersistentDataType.STRING, "tanLanMingJie");
        pdc_po_sun_chi_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "poSunChiZhiJie");
        pdc_chi_mi_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "chiMiZhiJie");
        pdc_chi_yu_du_jie.set(DataContainer.id, PersistentDataType.STRING, "chiYuDuJie");
        pdc_chi_yu_xie_jie.set(DataContainer.id, PersistentDataType.STRING, "chiYuXieJie");
        pdc_chi_yu_gui_jie.set(DataContainer.id, PersistentDataType.STRING, "chiYuGuiJie");
        pdc_chi_yu_mo_jie.set(DataContainer.id, PersistentDataType.STRING, "chiYuMoJie");
        pdc_chi_yu_ming_jie.set(DataContainer.id, PersistentDataType.STRING, "chiYuMingJie");
        pdc_po_sun_chen_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "poSunChenZhiJie");
        pdc_chen_nu_zhi_jie.set(DataContainer.id, PersistentDataType.STRING, "chenNuZhiJie");
        pdc_chen_hen_du_jie.set(DataContainer.id, PersistentDataType.STRING, "chenHenDuJie");
        pdc_chen_hen_xie_jie.set(DataContainer.id, PersistentDataType.STRING, "chenHenXieJie");
        pdc_chen_hen_gui_jie.set(DataContainer.id, PersistentDataType.STRING, "chenHenGuiJie");
        pdc_chen_hen_mo_jie.set(DataContainer.id, PersistentDataType.STRING, "chenHenMoJie");
        pdc_chen_hen_ming_jie.set(DataContainer.id, PersistentDataType.STRING, "chenHenMingJie");
        pdc_chan_ding_fa_jie.set(DataContainer.id, PersistentDataType.STRING, "chanDingFaJie");
        pdc_chan_ding_sheng_jie.set(DataContainer.id, PersistentDataType.STRING, "chanDingShengJie");
        pdc_chan_ding_fo_jie.set(DataContainer.id, PersistentDataType.STRING, "chanDingFoJie");
        pdc_chan_ding_xian_jie.set(DataContainer.id, PersistentDataType.STRING, "chanDingXianJie");
        pdc_chan_ding_shen_jie.set(DataContainer.id, PersistentDataType.STRING, "chanDingShenJie");
        pdc_zhi_hui_fa_jie.set(DataContainer.id, PersistentDataType.STRING, "zhiHuiFaJie");
        pdc_zhi_hui_sheng_jie.set(DataContainer.id, PersistentDataType.STRING, "zhiHuiShengJie");
        pdc_zhi_hui_fo_jie.set(DataContainer.id, PersistentDataType.STRING, "zhiHuiFoJie");
        pdc_zhi_hui_xian_jie.set(DataContainer.id, PersistentDataType.STRING, "zhiHuiXianJie");
        pdc_zhi_hui_shen_jie.set(DataContainer.id, PersistentDataType.STRING, "zhiHuiShenJie");
        pdc_chi_jie_fa_jie.set(DataContainer.id, PersistentDataType.STRING, "chiJieFaJie");
        pdc_chi_jie_sheng_jie.set(DataContainer.id, PersistentDataType.STRING, "chiJieShengJie");
        pdc_chi_jie_fo_jie.set(DataContainer.id, PersistentDataType.STRING, "chiJieFoJie");
        pdc_chi_jie_xian_jie.set(DataContainer.id, PersistentDataType.STRING, "chiJieXianJie");
        pdc_chi_jie_shen_jie.set(DataContainer.id, PersistentDataType.STRING, "chiJieShenJie");


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
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN1,
                                Component.text("§7§o蕴含青龙祝福的圣器"),
                                Component.text("§7§o令人抵抗操控的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qingLongShengQi1", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[被动技]§f[浮行] §f冷却: §b20s")
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        qing_long_sheng_qi2_meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN1,
                                Component.text("§7§o蕴含青龙祝福的圣器"),
                                Component.text("§7§o令人抵抗操控的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qingLongShengQi2", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        qing_long_sheng_qi3_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN1,
                                Component.text("§7§o蕴含青龙祝福的圣器"),
                                Component.text("§7§o令人抵抗操控的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qingLongShengQi3", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        qing_long_sheng_qi4_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN1,
                                Component.text("§7§o蕴含青龙祝福的圣器"),
                                Component.text("§7§o令人抵抗操控的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qingLongShengQi4", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        qing_long_sheng_qi5_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN1,
                                Component.text("§7§o蕴含青龙祝福的圣器"),
                                Component.text("§7§o令人抵抗操控的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qingLongShengQi5", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        qing_long_sheng_qi6_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN1,
                                Component.text("§7§o蕴含青龙祝福的圣器"),
                                Component.text("§7§o令人抵抗操控的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qingLongShengQi6", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhu_que_sheng_qi1_meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN2,
                                Component.text("§7§o蕴含朱雀祝福的圣器"),
                                Component.text("§7§o令人长久生存的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhuQueShengQi1", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhu_que_sheng_qi2_meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN2,
                                Component.text("§7§o蕴含朱雀祝福的圣器"),
                                Component.text("§7§o令人长久生存的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhuQueShengQi2", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhu_que_sheng_qi3_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN2,
                                Component.text("§7§o蕴含朱雀祝福的圣器"),
                                Component.text("§7§o令人长久生存的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhuQueShengQi3", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhu_que_sheng_qi4_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN2,
                                Component.text("§7§o蕴含朱雀祝福的圣器"),
                                Component.text("§7§o令人长久生存的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhuQueShengQi4", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhu_que_sheng_qi5_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN2,
                                Component.text("§7§o蕴含朱雀祝福的圣器"),
                                Component.text("§7§o令人长久生存的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhuQueShengQi5", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhu_que_sheng_qi6_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN2,
                                Component.text("§7§o蕴含朱雀祝福的圣器"),
                                Component.text("§7§o令人长久生存的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhuQueShengQi6", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        bai_hu_sheng_qi1_meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN3,
                                Component.text("§7§o蕴含白虎祝福的圣器"),
                                Component.text("§7§o令人迅捷快敏的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("baiHuShengQi1", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        bai_hu_sheng_qi2_meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN3,
                                Component.text("§7§o蕴含白虎祝福的圣器"),
                                Component.text("§7§o令人迅捷快敏的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("baiHuShengQi2", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        bai_hu_sheng_qi3_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN3,
                                Component.text("§7§o蕴含白虎祝福的圣器"),
                                Component.text("§7§o令人迅捷快敏的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("baiHuShengQi3", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        bai_hu_sheng_qi4_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN3,
                                Component.text("§7§o蕴含白虎祝福的圣器"),
                                Component.text("§7§o令人迅捷快敏的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("baiHuShengQi4", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        bai_hu_sheng_qi5_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN3,
                                Component.text("§7§o蕴含白虎祝福的圣器"),
                                Component.text("§7§o令人迅捷快敏的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("baiHuShengQi5", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        bai_hu_sheng_qi6_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN3,
                                Component.text("§7§o蕴含白虎祝福的圣器"),
                                Component.text("§7§o令人迅捷快敏的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("baiHuShengQi6", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        xuan_wu_sheng_qi1_meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN4,
                                Component.text("§7§o蕴含玄武祝福的圣器"),
                                Component.text("§7§o令人抵挡伤害的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xuanWuShengQi1", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        xuan_wu_sheng_qi2_meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN4,
                                Component.text("§7§o蕴含玄武祝福的圣器"),
                                Component.text("§7§o令人抵挡伤害的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xuanWuShengQi2", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        xuan_wu_sheng_qi3_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN4,
                                Component.text("§7§o蕴含玄武祝福的圣器"),
                                Component.text("§7§o令人抵挡伤害的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xuanWuShengQi3", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        xuan_wu_sheng_qi4_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN4,
                                Component.text("§7§o蕴含玄武祝福的圣器"),
                                Component.text("§7§o令人抵挡伤害的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xuanWuShengQi4", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        xuan_wu_sheng_qi5_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN4,
                                Component.text("§7§o蕴含玄武祝福的圣器"),
                                Component.text("§7§o令人抵挡伤害的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xuanWuShengQi5", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        xuan_wu_sheng_qi6_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN4,
                                Component.text("§7§o蕴含玄武祝福的圣器"),
                                Component.text("§7§o令人抵挡伤害的能力变强"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xuanWuShengQi6", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        hun_tian_lin_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN8,
                                Component.text("§7§o传说中三太子哪吒的法器"),
                                Component.text("§7§o一眨眼就可以包覆天地"),
                                Component.text("§7§o刀枪不入,水火不侵的宝物"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("hunTianLin", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        tai_chu_shen_jia_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN8,
                                Component.text("§7§o盘古开天之时就存在的法器"),
                                Component.text("§7§o寄宿着洪荒的意志"),
                                Component.text("§7§o赐予穿戴者强盛的生命力量"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("taiChuShenJia", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zi_sha_chan_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN8,
                                Component.text("§7§o利用北冥之海深处的玄砂打造"),
                                Component.text("§7§o如同大地一般坚硬的护腿"),
                                Component.text("§7§o赐予穿戴者强大的防御能力"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("ziShaChan", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        feng_huo_lun_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN8,
                                Component.text("§7§o传说中三太子哪吒的法器"),
                                Component.text("§7§o踩在风火轮上可以翻转腾云"),
                                Component.text("§7§o同时还夹带火焰之力袭击敌人"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("fengHuoLun", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        jiu_tian_xuan_yu_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN8,
                                Component.text("§7§o传说中九天玄女的羽翼"),
                                Component.text("§7§o赐予穿戴者强盛的生命力量"),
                                Component.text("§7§o如同草原一般的顽强而坚毅"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("jiuTianXuanYu", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        wei_tuo_tian_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN8,
                                Component.text("§7§o拥有疾风般的速度"),
                                Component.text("§7§o可以让穿戴者缩地成寸"),
                                Component.text("§7§o一瞬十万里"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("weiTuoTian", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        po_sun_tan_zhi_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o被贪婪欲望所诱惑的戒指"),
                                Component.text("§7§o佩戴者将不断追求更多"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("poSunTanZhiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        tan_yu_zhi_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o被贪婪欲望所诱惑的戒指"),
                                Component.text("§7§o佩戴者将不断追求更多"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tanYuZhiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        tan_lan_du_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o被贪婪欲望所诱惑的戒指"),
                                Component.text("§7§o佩戴者将不断追求更多"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tanLanDuJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        tan_lan_xie_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o被贪婪欲望所诱惑的戒指"),
                                Component.text("§7§o佩戴者将不断追求更多"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tanLanXieJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        tan_lan_gui_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o被贪婪欲望所诱惑的戒指"),
                                Component.text("§7§o佩戴者将不断追求更多"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tanLanGuiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        tan_lan_mo_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o被贪婪欲望所诱惑的戒指"),
                                Component.text("§7§o佩戴者将不断追求更多"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tanLanMoJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        tan_lan_ming_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE7,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o被贪婪欲望所诱惑的戒指"),
                                Component.text("§7§o佩戴者将不断追求更多"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tanLanMingJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        po_sun_chi_zhi_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o令人陷入痴迷的戒指"),
                                Component.text("§7§o使佩戴者难以自拔"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("poSunChiZhiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_mi_zhi_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o令人陷入痴迷的戒指"),
                                Component.text("§7§o使佩戴者难以自拔"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiMiZhiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_yu_du_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o令人陷入痴迷的戒指"),
                                Component.text("§7§o使佩戴者难以自拔"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiYuDuJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_yu_xie_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o令人陷入痴迷的戒指"),
                                Component.text("§7§o使佩戴者难以自拔"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiYuXieJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_yu_gui_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o令人陷入痴迷的戒指"),
                                Component.text("§7§o使佩戴者难以自拔"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiYuGuiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_yu_mo_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o令人陷入痴迷的戒指"),
                                Component.text("§7§o使佩戴者难以自拔"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiYuMoJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_yu_ming_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE7,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o令人陷入痴迷的戒指"),
                                Component.text("§7§o使佩戴者难以自拔"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiYuMingJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        po_sun_chen_zhi_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o充满愤怒之力的戒指"),
                                Component.text("§7§o激发佩戴者的怒火"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("poSunChenZhiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chen_nu_zhi_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o充满愤怒之力的戒指"),
                                Component.text("§7§o激发佩戴者的怒火"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chenNuZhiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chen_hen_du_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o充满愤怒之力的戒指"),
                                Component.text("§7§o激发佩戴者的怒火"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chenHenDuJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chen_hen_xie_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o充满愤怒之力的戒指"),
                                Component.text("§7§o激发佩戴者的怒火"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chenHenXieJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chen_hen_gui_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o充满愤怒之力的戒指"),
                                Component.text("§7§o激发佩戴者的怒火"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chenHenGuiJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chen_hen_mo_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o充满愤怒之力的戒指"),
                                Component.text("§7§o激发佩戴者的怒火"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chenHenMoJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chen_hen_ming_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE7,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o充满愤怒之力的戒指"),
                                Component.text("§7§o激发佩戴者的怒火"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chenHenMingJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chan_ding_fa_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o蕴含佛法禅意的法戒"),
                                Component.text("§7§o助佩戴者心如止水"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chanDingFaJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chan_ding_sheng_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o蕴含佛法禅意的法戒"),
                                Component.text("§7§o助佩戴者心如止水"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chanDingShengJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chan_ding_fo_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o蕴含佛法禅意的法戒"),
                                Component.text("§7§o助佩戴者心如止水"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chanDingFoJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chan_ding_xian_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o蕴含佛法禅意的法戒"),
                                Component.text("§7§o助佩戴者心如止水"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chanDingXianJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chan_ding_shen_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE7,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN5,
                                Component.text("§7§o蕴含佛法禅意的法戒"),
                                Component.text("§7§o助佩戴者心如止水"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chanDingShenJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhi_hui_fa_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o开启智慧之门的法戒"),
                                Component.text("§7§o增长佩戴者的洞察力"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhiHuiFaJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhi_hui_sheng_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o开启智慧之门的法戒"),
                                Component.text("§7§o增长佩戴者的洞察力"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhiHuiShengJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhi_hui_fo_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o开启智慧之门的法戒"),
                                Component.text("§7§o增长佩戴者的洞察力"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhiHuiFoJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhi_hui_xian_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o开启智慧之门的法戒"),
                                Component.text("§7§o增长佩戴者的洞察力"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhiHuiXianJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        zhi_hui_shen_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE7,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN6,
                                Component.text("§7§o开启智慧之门的法戒"),
                                Component.text("§7§o增长佩戴者的洞察力"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhiHuiShenJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_jie_fa_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o帮助修行者持戒的法器"),
                                Component.text("§7§o净化心灵的污浊"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiJieFaJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_jie_sheng_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o帮助修行者持戒的法器"),
                                Component.text("§7§o净化心灵的污浊"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiJieShengJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_jie_fo_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o帮助修行者持戒的法器"),
                                Component.text("§7§o净化心灵的污浊"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiJieFoJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_jie_xian_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o帮助修行者持戒的法器"),
                                Component.text("§7§o净化心灵的污浊"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiJieXianJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
        );

        chi_jie_shen_jie_meta.lore(
                Stream.of(
                                ComponentSet.RARE7,
                                ComponentSet.JOBALL,
                                ComponentSet.ActSHIPIN7,
                                Component.text("§7§o帮助修行者持戒的法器"),
                                Component.text("§7§o净化心灵的污浊"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiJieShenJie", 4),
                                ComponentSet.MIDDLEJINENG
                        )
                        .flatMap(obj -> {
                            if (obj instanceof List<?>) {
                                return ((List<?>) obj).stream();
                            }
                            return Stream.of(obj);
                        })
                        .map(obj -> (Component) obj)
                        .collect(Collectors.toList())
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


        CHI_JIE_SHEN_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/44"));
        CHI_JIE_XIAN_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/43"));
        CHI_JIE_FO_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/42"));
        CHI_JIE_SHENG_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/41"));
        CHI_JIE_FA_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/40"));
        ZHI_HUI_SHEN_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/39"));
        ZHI_HUI_XIAN_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/38"));
        ZHI_HUI_FO_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/37"));
        ZHI_HUI_SHENG_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/36"));
        ZHI_HUI_FA_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/35"));
        CHAN_DING_SHEN_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/34"));
        CHAN_DING_XIAN_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/33"));
        CHAN_DING_FO_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/32"));
        CHAN_DING_SHENG_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/31"));
        CHAN_DING_FA_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/30"));
        CHEN_HEN_MING_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/29"));
        CHEN_HEN_MO_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/28"));
        CHEN_HEN_GUI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/27"));
        CHEN_HEN_XIE_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/26"));
        CHEN_HEN_DU_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/25"));
        CHEN_NU_ZHI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/24"));
        PO_SUN_CHEN_ZHI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/23"));
        CHI_YU_MING_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/22"));
        CHI_YU_MO_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/21"));
        CHI_YU_GUI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/20"));
        CHI_YU_XIE_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/19"));
        CHI_YU_DU_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/18"));
        CHI_MI_ZHI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/17"));
        PO_SUN_CHI_ZHI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/16"));
        TAN_LAN_MING_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/15"));
        TAN_LAN_MO_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/14"));
        TAN_LAN_GUI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/13"));
        TAN_LAN_XIE_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/12"));
        TAN_LAN_DU_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/11"));
        TAN_YU_ZHI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/10"));
        PO_SUN_TAN_ZHI_JIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/9"));
        WEI_TUO_TIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/8"));
        JIU_TIAN_XUAN_YU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/8"));
        FENG_HUO_LUN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/8"));
        ZI_SHA_CHAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/7"));
        TAI_CHU_SHEN_JIA.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/6"));
        HUN_TIAN_LIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/5"));
        XUAN_WU_SHENG_QI6.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/4"));
        XUAN_WU_SHENG_QI5.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/4"));
        XUAN_WU_SHENG_QI4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/4"));
        XUAN_WU_SHENG_QI3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/4"));
        XUAN_WU_SHENG_QI2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/4"));
        XUAN_WU_SHENG_QI1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/4"));
        BAI_HU_SHENG_QI6.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/3"));
        BAI_HU_SHENG_QI5.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/3"));
        BAI_HU_SHENG_QI4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/3"));
        BAI_HU_SHENG_QI3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/3"));
        BAI_HU_SHENG_QI2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/3"));
        BAI_HU_SHENG_QI1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/3"));
        ZHU_QUE_SHENG_QI6.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/2"));
        ZHU_QUE_SHENG_QI5.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/2"));
        ZHU_QUE_SHENG_QI4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/2"));
        ZHU_QUE_SHENG_QI3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/2"));
        ZHU_QUE_SHENG_QI2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/2"));
        ZHU_QUE_SHENG_QI1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/2"));
        QING_LONG_SHENG_QI6.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/1"));
        QING_LONG_SHENG_QI5.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/1"));
        QING_LONG_SHENG_QI4.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/1"));
        QING_LONG_SHENG_QI3.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/1"));
        QING_LONG_SHENG_QI2.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/1"));
        QING_LONG_SHENG_QI1.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "arms_up_pottery_sherd/1"));
    }

    public static void putId() {
        Recipe.idToItem.put("qingLongShengQi1", QING_LONG_SHENG_QI1);
        Recipe.idToItem.put("qingLongShengQi2", QING_LONG_SHENG_QI2);
        Recipe.idToItem.put("qingLongShengQi3", QING_LONG_SHENG_QI3);
        Recipe.idToItem.put("qingLongShengQi4", QING_LONG_SHENG_QI4);
        Recipe.idToItem.put("qingLongShengQi5", QING_LONG_SHENG_QI5);
        Recipe.idToItem.put("qingLongShengQi6", QING_LONG_SHENG_QI6);

        Recipe.idToItem.put("zhuQueShengQi1", ZHU_QUE_SHENG_QI1);
        Recipe.idToItem.put("zhuQueShengQi2", ZHU_QUE_SHENG_QI2);
        Recipe.idToItem.put("zhuQueShengQi3", ZHU_QUE_SHENG_QI3);
        Recipe.idToItem.put("zhuQueShengQi4", ZHU_QUE_SHENG_QI4);
        Recipe.idToItem.put("zhuQueShengQi5", ZHU_QUE_SHENG_QI5);
        Recipe.idToItem.put("zhuQueShengQi6", ZHU_QUE_SHENG_QI6);

        Recipe.idToItem.put("baiHuShengQi1", BAI_HU_SHENG_QI1);
        Recipe.idToItem.put("baiHuShengQi2", BAI_HU_SHENG_QI2);
        Recipe.idToItem.put("baiHuShengQi3", BAI_HU_SHENG_QI3);
        Recipe.idToItem.put("baiHuShengQi4", BAI_HU_SHENG_QI4);
        Recipe.idToItem.put("baiHuShengQi5", BAI_HU_SHENG_QI5);
        Recipe.idToItem.put("baiHuShengQi6", BAI_HU_SHENG_QI6);

        Recipe.idToItem.put("xuanWuShengQi1", XUAN_WU_SHENG_QI1);
        Recipe.idToItem.put("xuanWuShengQi2", XUAN_WU_SHENG_QI2);
        Recipe.idToItem.put("xuanWuShengQi3", XUAN_WU_SHENG_QI3);
        Recipe.idToItem.put("xuanWuShengQi4", XUAN_WU_SHENG_QI4);
        Recipe.idToItem.put("xuanWuShengQi5", XUAN_WU_SHENG_QI5);
        Recipe.idToItem.put("xuanWuShengQi6", XUAN_WU_SHENG_QI6);

        Recipe.idToItem.put("hunTianLin", HUN_TIAN_LIN);
        Recipe.idToItem.put("taiChuShenJia", TAI_CHU_SHEN_JIA);
        Recipe.idToItem.put("ziShaChan", ZI_SHA_CHAN);
        Recipe.idToItem.put("fengHuoLun", FENG_HUO_LUN);
        Recipe.idToItem.put("jiuTianXuanYu", JIU_TIAN_XUAN_YU);
        Recipe.idToItem.put("weiTuoTian", WEI_TUO_TIAN);

        Recipe.idToItem.put("poSunTanZhiJie", PO_SUN_TAN_ZHI_JIE);
        Recipe.idToItem.put("tanYuZhiJie", TAN_YU_ZHI_JIE);
        Recipe.idToItem.put("tanLanDuJie", TAN_LAN_DU_JIE);
        Recipe.idToItem.put("tanLanXieJie", TAN_LAN_XIE_JIE);
        Recipe.idToItem.put("tanLanGuiJie", TAN_LAN_GUI_JIE);
        Recipe.idToItem.put("tanLanMoJie", TAN_LAN_MO_JIE);
        Recipe.idToItem.put("tanLanMingJie", TAN_LAN_MING_JIE);

        Recipe.idToItem.put("poSunChiZhiJie", PO_SUN_CHI_ZHI_JIE);
        Recipe.idToItem.put("chiMiZhiJie", CHI_MI_ZHI_JIE);
        Recipe.idToItem.put("chiYuDuJie", CHI_YU_DU_JIE);
        Recipe.idToItem.put("chiYuXieJie", CHI_YU_XIE_JIE);
        Recipe.idToItem.put("chiYuGuiJie", CHI_YU_GUI_JIE);
        Recipe.idToItem.put("chiYuMoJie", CHI_YU_MO_JIE);
        Recipe.idToItem.put("chiYuMingJie", CHI_YU_MING_JIE);

        Recipe.idToItem.put("poSunChenZhiJie", PO_SUN_CHEN_ZHI_JIE);
        Recipe.idToItem.put("chenNuZhiJie", CHEN_NU_ZHI_JIE);
        Recipe.idToItem.put("chenHenDuJie", CHEN_HEN_DU_JIE);
        Recipe.idToItem.put("chenHenXieJie", CHEN_HEN_XIE_JIE);
        Recipe.idToItem.put("chenHenGuiJie", CHEN_HEN_GUI_JIE);
        Recipe.idToItem.put("chenHenMoJie", CHEN_HEN_MO_JIE);
        Recipe.idToItem.put("chenHenMingJie", CHEN_HEN_MING_JIE);

        Recipe.idToItem.put("chanDingFaJie", CHAN_DING_FA_JIE);
        Recipe.idToItem.put("chanDingShengJie", CHAN_DING_SHENG_JIE);
        Recipe.idToItem.put("chanDingFoJie", CHAN_DING_FO_JIE);
        Recipe.idToItem.put("chanDingXianJie", CHAN_DING_XIAN_JIE);
        Recipe.idToItem.put("chanDingShenJie", CHAN_DING_SHEN_JIE);

        Recipe.idToItem.put("zhiHuiFaJie", ZHI_HUI_FA_JIE);
        Recipe.idToItem.put("zhiHuiShengJie", ZHI_HUI_SHENG_JIE);
        Recipe.idToItem.put("zhiHuiFoJie", ZHI_HUI_FO_JIE);
        Recipe.idToItem.put("zhiHuiXianJie", ZHI_HUI_XIAN_JIE);
        Recipe.idToItem.put("zhiHuiShenJie", ZHI_HUI_SHEN_JIE);

        Recipe.idToItem.put("chiJieFaJie", CHI_JIE_FA_JIE);
        Recipe.idToItem.put("chiJieShengJie", CHI_JIE_SHENG_JIE);
        Recipe.idToItem.put("chiJieFoJie", CHI_JIE_FO_JIE);
        Recipe.idToItem.put("chiJieXianJie", CHI_JIE_XIAN_JIE);
        Recipe.idToItem.put("chiJieShenJie", CHI_JIE_SHEN_JIE);
    }


}
