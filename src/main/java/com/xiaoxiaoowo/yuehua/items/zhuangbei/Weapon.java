package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.guis.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Weapon {
    //战士
    public static final ItemStack TAO_MU_JIAN = new ItemStack(Material.DIAMOND_PICKAXE);

    //破军
    public static final ItemStack KAI_SHAN_DAO = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack JU_TONG_ZHAN_CHUI = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack PO_KONG_FU = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack SAN_BAO_YU_RU_YI = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack XUAN_YUAN = new ItemStack(Material.DIAMOND_PICKAXE);

    //金钟
    public static final ItemStack QIN_TONG_JIAN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack CHI_TONG_JIAN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack TAI_JI_JIAN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack KUN_LUN_FEI_XIAN_JIAN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack TAI_E = new ItemStack(Material.DIAMOND_PICKAXE);

    //探云
    public static final ItemStack YIN_YUE_QIANG = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack HONG_YIN_QIANG = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack YOU_LONG_QIANG = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack HU_TOU_ZHAN_JIN_QIANG = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack RU_YI_JIN_GU_BANG = new ItemStack(Material.DIAMOND_PICKAXE);

    //弓箭手
    public static final ItemStack TENG_MU_GONG = new ItemStack(Material.BOW);

    //狙击
    public static final ItemStack QIN_TONG_GONG = new ItemStack(Material.BOW);
    public static final ItemStack YAN_TIE_GONG = new ItemStack(Material.BOW);
    public static final ItemStack ZHONG_CHUI_GONG = new ItemStack(Material.BOW);
    public static final ItemStack BEI_DOU_MIE_SHEN_GONG = new ItemStack(Material.BOW);
    public static final ItemStack ZHU_RI = new ItemStack(Material.BOW);

    //游侠
    public static final ItemStack HEI_TIE_NU = new ItemStack(Material.CROSSBOW);
    public static final ItemStack HONG_LIN_NU = new ItemStack(Material.CROSSBOW);
    public static final ItemStack JIAO_LONG_NU = new ItemStack(Material.CROSSBOW);
    public static final ItemStack RI_YUE_LIU_XING_NU = new ItemStack(Material.CROSSBOW);
    public static final ItemStack LIANG_YI = new ItemStack(Material.CROSSBOW);

    //灵箭
    public static final ItemStack FU_RONG_GONG = new ItemStack(Material.BOW);
    public static final ItemStack HONG_LUAN_GONG = new ItemStack(Material.BOW);
    public static final ItemStack TIAN_QIONG_GONG = new ItemStack(Material.BOW);
    public static final ItemStack SHE_TIAN_ZHUI_YUE_GONG = new ItemStack(Material.BOW);
    public static final ItemStack LIU_GUANG = new ItemStack(Material.BOW);


    //炼丹师
    //丹炉
    public static final ItemStack HEI_TIE_GUO = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack QIN_TONG_GUO = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack LIAN_DAN_LU = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack SUO_HUN_LU = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack QI_SHA_DING = new ItemStack(Material.GOLDEN_PICKAXE);
    public static final ItemStack HUN_YUAN_SHEN_DING = new ItemStack(Material.GOLDEN_PICKAXE);


    static {
        ItemMeta metaTaoMuJian = TAO_MU_JIAN.getItemMeta();
        ItemMeta metaKaiShanDao = KAI_SHAN_DAO.getItemMeta();
        ItemMeta metaJuTongZhanChui = JU_TONG_ZHAN_CHUI.getItemMeta();
        ItemMeta metaPoKongFu = PO_KONG_FU.getItemMeta();
        ItemMeta metaSanBaoYuRuYi = SAN_BAO_YU_RU_YI.getItemMeta();
        ItemMeta metaXuanYuan = XUAN_YUAN.getItemMeta();
        ItemMeta metaQinTongJian = QIN_TONG_JIAN.getItemMeta();
        ItemMeta metaChiTongJian = CHI_TONG_JIAN.getItemMeta();
        ItemMeta metaTaiJiJian = TAI_JI_JIAN.getItemMeta();
        ItemMeta metaKunLunFeiXianJian = KUN_LUN_FEI_XIAN_JIAN.getItemMeta();
        ItemMeta metaTaiE = TAI_E.getItemMeta();
        ItemMeta metaYinYueQiang = YIN_YUE_QIANG.getItemMeta();
        ItemMeta metaHongYinQiang = HONG_YIN_QIANG.getItemMeta();
        ItemMeta metaYouLongQiang = YOU_LONG_QIANG.getItemMeta();
        ItemMeta metaHuTouZhanJinQiang = HU_TOU_ZHAN_JIN_QIANG.getItemMeta();
        ItemMeta metaRuYiJinGuBang = RU_YI_JIN_GU_BANG.getItemMeta();
        ItemMeta metaTengMuGong = TENG_MU_GONG.getItemMeta();
        ItemMeta metaQinTongGong = QIN_TONG_GONG.getItemMeta();
        ItemMeta metaYanTieGong = YAN_TIE_GONG.getItemMeta();
        ItemMeta metaZhongChuiGong = ZHONG_CHUI_GONG.getItemMeta();
        ItemMeta metaBeiDouMieShenGong = BEI_DOU_MIE_SHEN_GONG.getItemMeta();
        ItemMeta metaZhuRi = ZHU_RI.getItemMeta();
        ItemMeta metaHeiTieNu = HEI_TIE_NU.getItemMeta();
        ItemMeta metaHongLinNu = HONG_LIN_NU.getItemMeta();
        ItemMeta metaJiaoLongNu = JIAO_LONG_NU.getItemMeta();
        ItemMeta metaRiYueLiuXingNu = RI_YUE_LIU_XING_NU.getItemMeta();
        ItemMeta metaLiangYi = LIANG_YI.getItemMeta();
        ItemMeta metaFuRongGong = FU_RONG_GONG.getItemMeta();
        ItemMeta metaHongLuanGong = HONG_LUAN_GONG.getItemMeta();
        ItemMeta metaTianQiongGong = TIAN_QIONG_GONG.getItemMeta();
        ItemMeta metaSheTianZhuiYueGong = SHE_TIAN_ZHUI_YUE_GONG.getItemMeta();
        ItemMeta metaLiuGuang = LIU_GUANG.getItemMeta();
        ItemMeta metaHeiTieGuo = HEI_TIE_GUO.getItemMeta();
        ItemMeta metaQinTongGuo = QIN_TONG_GUO.getItemMeta();
        ItemMeta metaLianDanLu = LIAN_DAN_LU.getItemMeta();
        ItemMeta metaSuoHunLu = SUO_HUN_LU.getItemMeta();
        ItemMeta metaQiShaDing = QI_SHA_DING.getItemMeta();
        ItemMeta metaHunYuanShenDing = HUN_YUAN_SHEN_DING.getItemMeta();


        metaTaoMuJian.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaKaiShanDao.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaChiTongJian.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaPoKongFu.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaSanBaoYuRuYi.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaXuanYuan.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaQinTongJian.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaJuTongZhanChui.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaTaiJiJian.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaKunLunFeiXianJian.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaTaiE.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaYinYueQiang.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaHongYinQiang.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaYouLongQiang.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaHuTouZhanJinQiang.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaRuYiJinGuBang.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaTengMuGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaQinTongGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaYanTieGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaZhongChuiGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaBeiDouMieShenGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaZhuRi.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaHeiTieNu.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaHongLinNu.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaJiaoLongNu.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaRiYueLiuXingNu.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaLiangYi.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaFuRongGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaHongLuanGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaTianQiongGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaSheTianZhuiYueGong.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaLiuGuang.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaHeiTieGuo.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaQinTongGuo.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaLianDanLu.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaSuoHunLu.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaQiShaDing.addItemFlags(ZeroAttributeModifier.itemFlags);
        metaHunYuanShenDing.addItemFlags(ZeroAttributeModifier.itemFlags);

        metaHeiTieNu.addEnchant(Enchantment.QUICK_CHARGE, 1, true);
        metaHongLinNu.addEnchant(Enchantment.QUICK_CHARGE, 1, true);
        metaJiaoLongNu.addEnchant(Enchantment.QUICK_CHARGE, 1, true);
        metaRiYueLiuXingNu.addEnchant(Enchantment.QUICK_CHARGE, 2, true);
        metaLiangYi.addEnchant(Enchantment.QUICK_CHARGE, 2, true);

        metaTaoMuJian.setUnbreakable(true);
        metaKaiShanDao.setUnbreakable(true);
        metaChiTongJian.setUnbreakable(true);
        metaPoKongFu.setUnbreakable(true);
        metaSanBaoYuRuYi.setUnbreakable(true);
        metaXuanYuan.setUnbreakable(true);
        metaQinTongJian.setUnbreakable(true);
        metaJuTongZhanChui.setUnbreakable(true);
        metaTaiJiJian.setUnbreakable(true);
        metaKunLunFeiXianJian.setUnbreakable(true);
        metaTaiE.setUnbreakable(true);
        metaYinYueQiang.setUnbreakable(true);
        metaHongYinQiang.setUnbreakable(true);
        metaYouLongQiang.setUnbreakable(true);
        metaHuTouZhanJinQiang.setUnbreakable(true);
        metaRuYiJinGuBang.setUnbreakable(true);
        metaTengMuGong.setUnbreakable(true);
        metaQinTongGong.setUnbreakable(true);
        metaYanTieGong.setUnbreakable(true);
        metaZhongChuiGong.setUnbreakable(true);
        metaBeiDouMieShenGong.setUnbreakable(true);
        metaZhuRi.setUnbreakable(true);
        metaHeiTieNu.setUnbreakable(true);
        metaHongLinNu.setUnbreakable(true);
        metaJiaoLongNu.setUnbreakable(true);
        metaRiYueLiuXingNu.setUnbreakable(true);
        metaLiangYi.setUnbreakable(true);
        metaFuRongGong.setUnbreakable(true);
        metaHongLuanGong.setUnbreakable(true);
        metaTianQiongGong.setUnbreakable(true);
        metaSheTianZhuiYueGong.setUnbreakable(true);
        metaLiuGuang.setUnbreakable(true);
        metaHeiTieGuo.setUnbreakable(true);
        metaQinTongGuo.setUnbreakable(true);
        metaLianDanLu.setUnbreakable(true);
        metaSuoHunLu.setUnbreakable(true);
        metaQiShaDing.setUnbreakable(true);
        metaHunYuanShenDing.setUnbreakable(true);


        metaTaoMuJian.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaKaiShanDao.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaChiTongJian.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaPoKongFu.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaSanBaoYuRuYi.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaXuanYuan.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaQinTongJian.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaJuTongZhanChui.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaTaiJiJian.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaKunLunFeiXianJian.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaTaiE.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaYinYueQiang.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaHongYinQiang.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaYouLongQiang.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaHeiTieGuo.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaQinTongGuo.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaLianDanLu.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaSuoHunLu.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaQiShaDing.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        metaHunYuanShenDing.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);


        metaTaoMuJian.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaKaiShanDao.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaChiTongJian.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaPoKongFu.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaSanBaoYuRuYi.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaXuanYuan.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaQinTongJian.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaJuTongZhanChui.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaTaiJiJian.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaKunLunFeiXianJian.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaTaiE.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaYinYueQiang.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaHongYinQiang.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaYouLongQiang.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaHuTouZhanJinQiang.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaRuYiJinGuBang.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaHeiTieGuo.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaQinTongGuo.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaLianDanLu.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaSuoHunLu.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaQiShaDing.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        metaHunYuanShenDing.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        PersistentDataContainer pdcTaoMuJian = metaTaoMuJian.getPersistentDataContainer();
        PersistentDataContainer pdcKaiShanDao = metaKaiShanDao.getPersistentDataContainer();
        PersistentDataContainer pdcChiTongJian = metaChiTongJian.getPersistentDataContainer();
        PersistentDataContainer pdcPoKongFu = metaPoKongFu.getPersistentDataContainer();
        PersistentDataContainer pdcSanBaoYuRuYi = metaSanBaoYuRuYi.getPersistentDataContainer();
        PersistentDataContainer pdcXuanYuan = metaXuanYuan.getPersistentDataContainer();
        PersistentDataContainer pdcQinTongJian = metaQinTongJian.getPersistentDataContainer();
        PersistentDataContainer pdcJuTongZhanChui = metaJuTongZhanChui.getPersistentDataContainer();
        PersistentDataContainer pdcTaiJiJian = metaTaiJiJian.getPersistentDataContainer();
        PersistentDataContainer pdcKunLunFeiXianJian = metaKunLunFeiXianJian.getPersistentDataContainer();
        PersistentDataContainer pdcTaiE = metaTaiE.getPersistentDataContainer();
        PersistentDataContainer pdcYinYueQiang = metaYinYueQiang.getPersistentDataContainer();
        PersistentDataContainer pdcHongYinQiang = metaHongYinQiang.getPersistentDataContainer();
        PersistentDataContainer pdcYouLongQiang = metaYouLongQiang.getPersistentDataContainer();
        PersistentDataContainer pdcHuTouZhanJinQiang = metaHuTouZhanJinQiang.getPersistentDataContainer();
        PersistentDataContainer pdcRuYiJinGuBang = metaRuYiJinGuBang.getPersistentDataContainer();
        PersistentDataContainer pdcTengMuGong = metaTengMuGong.getPersistentDataContainer();
        PersistentDataContainer pdcQinTongGong = metaQinTongGong.getPersistentDataContainer();
        PersistentDataContainer pdcYanTieGong = metaYanTieGong.getPersistentDataContainer();
        PersistentDataContainer pdcZhongChuiGong = metaZhongChuiGong.getPersistentDataContainer();
        PersistentDataContainer pdcBeiDouMieShenGong = metaBeiDouMieShenGong.getPersistentDataContainer();
        PersistentDataContainer pdcZhuRi = metaZhuRi.getPersistentDataContainer();
        PersistentDataContainer pdcHeiTieNu = metaHeiTieNu.getPersistentDataContainer();
        PersistentDataContainer pdcHongLinNu = metaHongLinNu.getPersistentDataContainer();
        PersistentDataContainer pdcJiaoLongNu = metaJiaoLongNu.getPersistentDataContainer();
        PersistentDataContainer pdcRiYueLiuXingNu = metaRiYueLiuXingNu.getPersistentDataContainer();
        PersistentDataContainer pdcLiangYi = metaLiangYi.getPersistentDataContainer();
        PersistentDataContainer pdcFuRongGong = metaFuRongGong.getPersistentDataContainer();
        PersistentDataContainer pdcHongLuanGong = metaHongLuanGong.getPersistentDataContainer();
        PersistentDataContainer pdcTianQiongGong = metaTianQiongGong.getPersistentDataContainer();
        PersistentDataContainer pdcSheTianZhuiYueGong = metaSheTianZhuiYueGong.getPersistentDataContainer();
        PersistentDataContainer pdcLiuGuang = metaLiuGuang.getPersistentDataContainer();
        PersistentDataContainer pdcHeiTieGuo = metaHeiTieGuo.getPersistentDataContainer();
        PersistentDataContainer pdcQinTongGuo = metaQinTongGuo.getPersistentDataContainer();
        PersistentDataContainer pdcLianDanLu = metaLianDanLu.getPersistentDataContainer();
        PersistentDataContainer pdcSuoHunLu = metaSuoHunLu.getPersistentDataContainer();
        PersistentDataContainer pdcQiShaDing = metaQiShaDing.getPersistentDataContainer();
        PersistentDataContainer pdcHunYuanShenDing = metaHunYuanShenDing.getPersistentDataContainer();

        pdcTaoMuJian.set(DataContainer.id, PersistentDataType.STRING, "taoMuJian");
        pdcKaiShanDao.set(DataContainer.id, PersistentDataType.STRING, "kaiShanDao");
        pdcJuTongZhanChui.set(DataContainer.id, PersistentDataType.STRING, "juTongZhanChui");
        pdcPoKongFu.set(DataContainer.id, PersistentDataType.STRING, "poKongFu");
        pdcSanBaoYuRuYi.set(DataContainer.id, PersistentDataType.STRING, "sanBaoYuRuYi");
        pdcXuanYuan.set(DataContainer.id, PersistentDataType.STRING, "xuanYuan");
        pdcQinTongJian.set(DataContainer.id, PersistentDataType.STRING, "qinTongJian");
        pdcChiTongJian.set(DataContainer.id, PersistentDataType.STRING, "chiTongJian");
        pdcTaiJiJian.set(DataContainer.id, PersistentDataType.STRING, "taiJiJian");
        pdcKunLunFeiXianJian.set(DataContainer.id, PersistentDataType.STRING, "kunLunFeiXianJian");
        pdcTaiE.set(DataContainer.id, PersistentDataType.STRING, "taiE");
        pdcYinYueQiang.set(DataContainer.id, PersistentDataType.STRING, "yinYueQiang");
        pdcHongYinQiang.set(DataContainer.id, PersistentDataType.STRING, "hongYinQiang");
        pdcYouLongQiang.set(DataContainer.id, PersistentDataType.STRING, "youLongQiang");
        pdcHuTouZhanJinQiang.set(DataContainer.id, PersistentDataType.STRING, "huTouZhanJinQiang");
        pdcRuYiJinGuBang.set(DataContainer.id, PersistentDataType.STRING, "ruYiJinGuBang");
        pdcTengMuGong.set(DataContainer.id, PersistentDataType.STRING, "tengMuGong");
        pdcQinTongGong.set(DataContainer.id, PersistentDataType.STRING, "qinTongGong");
        pdcYanTieGong.set(DataContainer.id, PersistentDataType.STRING, "yanTieGong");
        pdcZhongChuiGong.set(DataContainer.id, PersistentDataType.STRING, "zhongChuiGong");
        pdcBeiDouMieShenGong.set(DataContainer.id, PersistentDataType.STRING, "beiDouMieShenGong");
        pdcZhuRi.set(DataContainer.id, PersistentDataType.STRING, "zhuRi");
        pdcHeiTieNu.set(DataContainer.id, PersistentDataType.STRING, "heiTieNu");
        pdcHongLinNu.set(DataContainer.id, PersistentDataType.STRING, "hongLinNu");
        pdcJiaoLongNu.set(DataContainer.id, PersistentDataType.STRING, "jiaoLongNu");
        pdcRiYueLiuXingNu.set(DataContainer.id, PersistentDataType.STRING, "riYueLiuXingNu");
        pdcLiangYi.set(DataContainer.id, PersistentDataType.STRING, "liangYi");
        pdcFuRongGong.set(DataContainer.id, PersistentDataType.STRING, "fuRongGong");
        pdcHongLuanGong.set(DataContainer.id, PersistentDataType.STRING, "hongLuanGong");
        pdcTianQiongGong.set(DataContainer.id, PersistentDataType.STRING, "tianQiongGong");
        pdcSheTianZhuiYueGong.set(DataContainer.id, PersistentDataType.STRING, "sheTianZhuiYueGong");
        pdcLiuGuang.set(DataContainer.id, PersistentDataType.STRING, "liuGuang");
        pdcHeiTieGuo.set(DataContainer.id, PersistentDataType.STRING, "heiTieGuo");
        pdcQinTongGuo.set(DataContainer.id, PersistentDataType.STRING, "qinTongGuo");
        pdcLianDanLu.set(DataContainer.id, PersistentDataType.STRING, "lianDanLu");
        pdcSuoHunLu.set(DataContainer.id, PersistentDataType.STRING, "suoHunLu");
        pdcQiShaDing.set(DataContainer.id, PersistentDataType.STRING, "qiShaDing");
        pdcHunYuanShenDing.set(DataContainer.id, PersistentDataType.STRING, "hunYuanShenDing");


        pdcTaoMuJian.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcKaiShanDao.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcChiTongJian.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcPoKongFu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcSanBaoYuRuYi.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcXuanYuan.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcQinTongJian.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcJuTongZhanChui.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTaiJiJian.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcKunLunFeiXianJian.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTaiE.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcYinYueQiang.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcHongYinQiang.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcYouLongQiang.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcHuTouZhanJinQiang.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcRuYiJinGuBang.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTengMuGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcQinTongGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcYanTieGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhongChuiGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcBeiDouMieShenGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcZhuRi.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcHeiTieNu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcHongLinNu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcJiaoLongNu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcRiYueLiuXingNu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcLiangYi.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcFuRongGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcHongLuanGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcTianQiongGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcSheTianZhuiYueGong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcLiuGuang.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcHeiTieGuo.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcQinTongGuo.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcLianDanLu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcSuoHunLu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcQiShaDing.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcHunYuanShenDing.set(DataContainer.insertid, PersistentDataType.STRING, "null");


        pdcTaoMuJian.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcKaiShanDao.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcChiTongJian.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcPoKongFu.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcSanBaoYuRuYi.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcXuanYuan.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcQinTongJian.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcJuTongZhanChui.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcTaiJiJian.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcKunLunFeiXianJian.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcTaiE.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcYinYueQiang.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcHongYinQiang.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcYouLongQiang.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcHuTouZhanJinQiang.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcRuYiJinGuBang.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcTengMuGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcQinTongGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcYanTieGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhongChuiGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcBeiDouMieShenGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcZhuRi.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcHeiTieNu.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcHongLinNu.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcJiaoLongNu.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcRiYueLiuXingNu.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcLiangYi.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcFuRongGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcHongLuanGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcTianQiongGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcSheTianZhuiYueGong.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcLiuGuang.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcHeiTieGuo.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcQinTongGuo.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcLianDanLu.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcSuoHunLu.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcQiShaDing.set(DataContainer.enchantid, PersistentDataType.STRING, "null");
        pdcHunYuanShenDing.set(DataContainer.enchantid, PersistentDataType.STRING, "null");

        pdcTaoMuJian.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcKaiShanDao.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcChiTongJian.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcPoKongFu.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcSanBaoYuRuYi.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcXuanYuan.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcQinTongJian.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcJuTongZhanChui.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcTaiJiJian.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcKunLunFeiXianJian.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcTaiE.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcYinYueQiang.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcHongYinQiang.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcYouLongQiang.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcHuTouZhanJinQiang.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcRuYiJinGuBang.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcTengMuGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcQinTongGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcYanTieGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcZhongChuiGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcBeiDouMieShenGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcZhuRi.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcHeiTieNu.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcHongLinNu.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcJiaoLongNu.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcRiYueLiuXingNu.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcLiangYi.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcFuRongGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcHongLuanGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcTianQiongGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcSheTianZhuiYueGong.set(DataContainer.slot, PersistentDataType.INTEGER, 0);
        pdcLiuGuang.set(DataContainer.slot, PersistentDataType.INTEGER, 0);

        pdcHeiTieGuo.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcQinTongGuo.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcLianDanLu.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcSuoHunLu.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcQiShaDing.set(DataContainer.slot, PersistentDataType.INTEGER, 40);
        pdcHunYuanShenDing.set(DataContainer.slot, PersistentDataType.INTEGER, 40);

        pdcTaoMuJian.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcKaiShanDao.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcChiTongJian.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcPoKongFu.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcSanBaoYuRuYi.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcXuanYuan.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcQinTongJian.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcJuTongZhanChui.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcTaiJiJian.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcKunLunFeiXianJian.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcTaiE.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcYinYueQiang.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcHongYinQiang.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcYouLongQiang.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcHuTouZhanJinQiang.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcRuYiJinGuBang.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcTengMuGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcQinTongGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcYanTieGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcZhongChuiGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcBeiDouMieShenGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcZhuRi.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcHeiTieNu.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcHongLinNu.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcJiaoLongNu.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcRiYueLiuXingNu.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcLiangYi.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcFuRongGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcHongLuanGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcTianQiongGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcSheTianZhuiYueGong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcLiuGuang.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcHeiTieGuo.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcQinTongGuo.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcLianDanLu.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcSuoHunLu.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcQiShaDing.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcHunYuanShenDing.set(DataContainer.job, PersistentDataType.INTEGER, 3);


        metaTaoMuJian.displayName(Component.text("桃木剑").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        metaKaiShanDao.displayName(Component.text("开山刀[破军]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        metaChiTongJian.displayName(Component.text("赤铜剑[金钟]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        metaPoKongFu.displayName(Component.text("破空斧[破军]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        metaSanBaoYuRuYi.displayName(Component.text("三宝玉如意[破军]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        metaXuanYuan.displayName(Component.text("轩辕[破军]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        metaQinTongJian.displayName(Component.text("青铜剑[金钟]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        metaJuTongZhanChui.displayName(Component.text("金瓜锤[破军]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        metaTaiJiJian.displayName(Component.text("太极剑[金钟]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        metaKunLunFeiXianJian.displayName(Component.text("昆仑飞仙剑[金钟]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        metaTaiE.displayName(Component.text("太阿[金钟]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        metaYinYueQiang.displayName(Component.text("银月枪[探云]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        metaHongYinQiang.displayName(Component.text("红缨枪[探云]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        metaYouLongQiang.displayName(Component.text("游龙枪[探云]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        metaHuTouZhanJinQiang.displayName(Component.text("虎头湛金枪[探云]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        metaRuYiJinGuBang.displayName(Component.text("如意金箍棒[探云]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        metaTengMuGong.displayName(Component.text("藤木弓").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        metaQinTongGong.displayName(Component.text("青铜弓[狙击]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        metaYanTieGong.displayName(Component.text("焰铁弓[狙击]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        metaZhongChuiGong.displayName(Component.text("重锤弓[狙击]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        metaBeiDouMieShenGong.displayName(Component.text("北斗灭神弓[狙击]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        metaZhuRi.displayName(Component.text("逐日[狙击]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        metaHeiTieNu.displayName(Component.text("黑铁弩[游侠]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        metaHongLinNu.displayName(Component.text("红翎弩[游侠]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        metaJiaoLongNu.displayName(Component.text("蛟龙弩[游侠]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        metaRiYueLiuXingNu.displayName(Component.text("日月流星弩[游侠]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        metaLiangYi.displayName(Component.text("两仪[游侠]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        metaFuRongGong.displayName(Component.text("芙蓉弓[灵箭]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        metaHongLuanGong.displayName(Component.text("红鸾弓[灵箭]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        metaTianQiongGong.displayName(Component.text("天琼弓[灵箭]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        metaSheTianZhuiYueGong.displayName(Component.text("奢天追月弓[灵箭]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        metaLiuGuang.displayName(Component.text("流光[灵箭]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));
        metaHeiTieGuo.displayName(Component.text("黑铁锅[丹炉]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        metaQinTongGuo.displayName(Component.text("青铜锅[丹炉]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        metaLianDanLu.displayName(Component.text("炼丹炉[丹炉]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        metaSuoHunLu.displayName(Component.text("锁魂炉[丹炉]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        metaQiShaDing.displayName(Component.text("七煞鼎[丹炉]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        metaHunYuanShenDing.displayName(Component.text("混元神鼎[丹炉]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));


        metaTaoMuJian.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("taoMuJian", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§f[镇神] §f冷却: §b20s"),
                                Component.text("§f眩晕周围§b4§f格的怪物§b2s"),
                                Component.text("§f并使得§b4s§f内下一次普攻额外造成§b[300%近战伤害]§f点伤害"),
                                Component.text("§f眩晕时间不可叠加，再次眩晕将刷新持续时间"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaKaiShanDao.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("kaiShanDao", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§a[开锋] §f冷却: §b20s"),
                                Component.text("§f强化§b4s§f内下一次普攻，额外造成§b[400%近战伤害]§f点伤害"),
                                Component.text("§f并能减少敌方护甲§b20§f点，持续§b5s§7(受韧性减免)"),
                                Component.text("§f减少护甲不可叠加，再次减少将刷新持续时间"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaJuTongZhanChui.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("juTongZhanChui", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§9[震荡] §f冷却: §b20s"),
                                Component.text("§f强化§b4s§f内下一次普攻，额外造成§b[500%近战伤害]§f点伤害"),
                                Component.text("§f并能震击周围§b5§f格的怪物，造成§b[300%近战伤害]§f点伤害"),
                                Component.text("§f同时造成§b2s§f眩晕"),
                                Component.text("§f眩晕时间不可叠加，再次眩晕将刷新持续时间"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaPoKongFu.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("poKongFu", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§d[割裂] §f冷却: §b20s"),
                                Component.text("§f强化§b4s§f内下一次普攻，额外造成§b[600%近战伤害]§f点伤害"),
                                Component.text("§f并同时对怪物施加§b5s§f撕裂效果，每秒造成§b[200%近战伤害]§f点伤害"),
                                Component.text("§f处于撕裂状态的怪物每次受到物理伤害都将损失§b10§f点护甲，持续§b1.5s"),
                                Component.text("§f处于撕裂状态的怪物移速将减缓§b30%§f"),
                                Component.text("§f撕裂状态持续时间可叠加，每次破甲持续时间单独计时"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaSanBaoYuRuYi.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("sanBaoYuRuYi", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§e[三宝] §f冷却: §b20s"),
                                Component.text("§f三宝“佛，法，僧”寄托于此玉如意中"),
                                Component.text("§f开启技能将使§b4s§f内下一次普攻能够为敌人随机附加三宝之一的印记，持续§b20s"),
                                Component.text("§f并且此次普攻还将额外造成§b[700%近战伤害]§f点伤害"),
                                Component.text("§f当敌人拥有印记时，持有三宝玉如意的玩家物理攻击会有额外效果"),
                                Component.text("§f当敌人再次被施加同一种印记时，将会消除该印记并造成特殊效果"),
                                Component.text("§f持有§6[佛]§f的怪物被攻击将对周围§b4§f格内的怪物造成§b[100%近战伤害]§f点伤害"),
                                Component.text("§f持有§6[法]§f的怪物被攻击将回复攻击者§b5+0.25%§f最大生命"),
                                Component.text("§f持有§6[僧]§f的怪物被攻击将回复攻击者§b1§f点饥饿值"),
                                Component.text("§f消除§6[佛]§f将立刻对周围§b16§f格内的怪物造成§b[2800%近战伤害]§f点伤害"),
                                Component.text("§f消除§6[法]§f将立刻回复攻击者§b200+10%§f最大生命"),
                                Component.text("§f消除§6[僧]§f将给予攻击者§b20s§f饱和"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaXuanYuan.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xuanYuan", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaQinTongJian.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qinTongJian", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§a[震荡] §f冷却: §b20s"),
                                Component.text("§f震击周围§b5§f格的怪物，造成§b[100%最大生命]§f点伤害"),
                                Component.text("§f并减少它们§b15%§f移速§b5s"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaChiTongJian.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("chiTongJian", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§9[魔焰] §f冷却: §b20s"),
                                Component.text("§f释放火焰灼烧周围§b6§f格的怪物，造成§b[125%最大生命]§f点伤害"),
                                Component.text("§f并永久留下灼伤效果，带有灼伤效果的怪物再次被此火焰攻击"),
                                Component.text("§f将额外受到§b[怪物40%最大生命]§f点伤害，上限为§b1000"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaTaiJiJian.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("taiJiJian", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§d[太极] §f冷却: §b20s"),
                                Component.text("§f释放太极阵法攻击周围§b7§f格的怪物，造成§b[150%最大生命]§f点伤害"),
                                Component.text("§f且根据昼夜阵法会产生对应的额外效果"),
                                Component.text("§6[昼]§f被阵法攻击的怪物在§b2s§f后死亡，则回复玩家§b[2.5%最大生命+15]§f点生命"),
                                Component.text("§6[夜]§f被阵法攻击的怪物在§b2s§f后未死亡，则再次造成§b[150%最大生命]§f点伤害"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaKunLunFeiXianJian.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("kunLunFeiXianJian", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§e[仙剑] §f冷却: §b60s"),
                                Component.text("§f解放仙剑的封印，剑灵将出场作战§b90s"),
                                Component.text("§f出场时释放灵气攻击周围§b8§f格的怪物，造成§b[600%最大生命]§f点伤害"),
                                Component.text("§f剑灵§b等额§f继承被召唤时的玩家破甲，护甲，格挡，破法"),
                                Component.text("§f剑灵§b1.5§f倍继承被召唤时的玩家攻击，剑灵无法暴击"),
                                Component.text("§f剑灵拥有玩家§b[150%最大生命]§f点生命"),
                                Component.text("§f剑灵不会受到任何怪物技能攻击"),
                                Component.text("§f每§b10s§f，剑灵将治愈周围§b8§f格的所有玩家，回复§b[1.25%最大生命+15]§f点生命"),
                                Component.text("§f每§b10s§f，剑灵将吸引周围§b16§f格的所有怪物的仇恨"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaTaiE.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("taiE", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaYinYueQiang.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("yinYueQiang", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§a[月明] §f冷却: §b20s"),
                                Component.text("§f凝聚一轮月牙，挥向前方，飞行§b6§f格"),
                                Component.text("§f对沿途的怪物造成§b[200%近战伤害]§f点伤害"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaHongYinQiang.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("hongYinQiang", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§9[浮行] §f冷却: §b20s"),
                                Component.text("§f向前急掣至多§b6§f格，并沿途留下持续§b3s§f的火焰§7(无法在水中留下)"),
                                Component.text("§f每秒造成§b[200%近战伤害]§f点伤害并减少§b10§f点法抗，持续§b3s"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaYouLongQiang.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("youLongQiang", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§9[游龙] §f冷却: §b20s"),
                                Component.text("§f若处于陆地则向前急掣至多§b6§f格，若处于水中则冲刺§b12§f格"),
                                Component.text("§f对沿途距离§b1§f格内的怪物造成§b[600%近战伤害]§f点伤害"),
                                Component.text("§f若终点处于陆地，则在终点创造一片§b3*1*3§f持续§b5s§f的水域"),
                                Component.text("§f水域制造者处于水域中每秒回复§b1%+10§f最大生命"),
                                Component.text("§f若终点处于水域，则使自己进入§b5s§f游龙状态"),
                                Component.text("§f处于游龙状态时，若接触水，则每秒回复§b1%+10§f最大生命"),
                                Component.text("§f并大幅提高游泳速度，恢复并停止消耗氧气"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaHuTouZhanJinQiang.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("huTouZhanJinQiang", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§e[虎啸] §f冷却: §b20s"),
                                Component.text("§f向前急掣至多§b12§f格，对沿途距离§b1.5§f格内的怪物造成§b[700%近战伤害]§f点伤害"),
                                Component.text("§f并击碎它们的防御能力，减少§b25§f点护甲和法抗，持续§b10s"),
                                Component.text("§f减少护甲与法抗不可叠加，再次减少将刷新持续时间"),
                                Component.text("§f每命中一个怪物，回复自身§b1.25%+15§f最大生命，至多§b10%+120§f"),
                                Component.text("§f每命中一个怪物，将为虎头湛金枪积攒一层虎意，至多§b8§f层"),
                                Component.text("§f在终点处释放虎啸音波，攻击周围§b5§f格的怪物"),
                                Component.text("§f造成§b[300%近战伤害*虎意层数]§f点伤害"),
                                Component.text("§f减少怪物§b[50*虎意层数]§f点攻击力，持续§b10s"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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
        metaRuYiJinGuBang.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("ruYiJinGuBang", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaTengMuGong.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tengMuGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§f[精准] §f冷却: §b20s"),
                                Component.text("§f强化本次射箭，额外造成§b[1200%箭矢强度]§f点伤害"),
                                Component.text("§f并减少敌人§b15%§f移速，持续§b5s"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaQinTongGong.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qinTongGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§a[重击] §f冷却: §b20s"),
                                Component.text("§f强化本次射箭，额外造成§b[1500%箭矢强度]§f点伤害"),
                                Component.text("§f并减少敌人§b20§f点护甲，持续§b5s"),
                                Component.text("§f减少护甲不可叠加，再次减少将刷新持续时间"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaYanTieGong.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("yanTieGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§9[魔焰] §f冷却: §b20s"),
                                Component.text("§f强化本次射箭，额外造成§b[1800%箭矢强度]§f点伤害"),
                                Component.text("§f并永久留下灼伤效果，带有灼伤效果的怪物再次被灼伤"),
                                Component.text("§f将额外受到§b[怪物40%最大生命]§f点伤害，上限为§b1000"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaZhongChuiGong.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhongChuiGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§d[重锤] §f冷却: §b20s"),
                                Component.text("§f强化本次射箭，额外造成§b[2100%箭矢强度]§f点伤害"),
                                Component.text("§f并在落点处召唤锤灵锤击，对周围§b5§f格的怪物造成§b[600%箭矢强度]§f点伤害"),
                                Component.text("§f并击碎它们的防御能力，减少§b20§f点护甲，持续§b5s"),
                                Component.text("§f同时眩晕它们§b2s§f，眩晕时间不可叠加，再次眩晕将刷新持续时间"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaBeiDouMieShenGong.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("beiDouMieShenGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§e[北斗灭神] §f冷却: §b20s"),
                                Component.text("§f强化本次射箭，额外造成§b[2400%箭矢强度]§f点伤害"),
                                Component.text("§f若此箭命中怪物，则为怪物附上印记§6[灭神]§f，持续§b10s§f，再次施加将消除"),
                                Component.text("§f若此箭未命中怪物，则在落点随机召唤北斗七星中的一颗星，持续§b10s"),
                                Component.text("§f北斗七星为：天枢、天璇、天玑、天权、玉衡、开阳、摇光"),
                                Component.text("§f印记§6[灭神]§f持续时间结束或因被再次施加消除时，将对怪物造成灭神一击"),
                                Component.text("§f造成§b[40%怪物已损生命值]§f点伤害，上限§b10000§f点"),
                                Component.text("§6[天枢]§f：距离§b8§f格的召唤者满弦箭命中物理伤害提高§b70%"),
                                Component.text("§6[天璇]§f：距离§b8§f格的召唤者满弦箭命中减少怪物§b30§f点护甲与法抗，持续§b2s"),
                                Component.text("§6[天玑]§f：距离§b8§f格的召唤者满弦箭命中眩晕怪物§b2s"),
                                Component.text("§6[天权]§f：距离§b8§f格的召唤者满弦箭命中额外造成§b[10%怪物当前生命值]§f点伤害"),
                                Component.text("§6[玉衡]§f：距离§b8§f格的召唤者满弦箭命中恢复§b1%+10§f最大生命"),
                                Component.text("§6[摇光]§f：距离§b8§f格的召唤者满弦箭命中获得§b100%§f移速加成，持续§b10s"),
                                Component.text("§6[开阳]§f：距离§b8§f格的召唤者受到的法术伤害减少§b25%§f，物理伤害减少§b50%"),
                                Component.text("§f同种星只有最新召唤的星会生效,§6[天权]§f的额外伤害上限§b2000§f点"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaZhuRi.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("zhuRi", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaHeiTieNu.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.CHARGE_1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("heiTieNu", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§a[强力] §f冷却: §b20s"),
                                Component.text("§f提升§b16§f箭矢强度，持续§b6s"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaHongLinNu.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.CHARGE_1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("hongLinNu", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§9[灼炎] §f冷却: §b20s"),
                                Component.text("§f箭附带火焰伤害，持续§b6s§f，额外造成§b[250%箭矢强度]§f点伤害"),
                                Component.text("§f同时会降低怪物§b10§f点法抗，持续§b2s"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaJiaoLongNu.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.CHARGE_1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("jiaoLongNu", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§d[蛟龙出海] §f冷却: §b20s"),
                                Component.text("§f强化箭矢，持续§b6s§f，造成的物理伤害提高§b90%"),
                                Component.text("§f同时会降低怪物§b15§f点护甲，持续§b2s"),
                                Component.text("§f若释放技能时位于陆地，则创造一片§b3*1*3§f持续§b5s§f的水域"),
                                Component.text("§f水域制造者处于水域中每秒回复§b1%+10§f最大生命"),
                                Component.text("§f若释放技能时位于水域，则使自己进入§b5s§f蛟龙状态"),
                                Component.text("§f处于蛟龙状态时，若接触水，则每秒回复§b1%+10§f最大生命"),
                                Component.text("§f并大幅提高游泳速度，恢复并停止消耗氧气"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaRiYueLiuXingNu.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.CHARGE_2,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("riYueLiuXingNu", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§e[日月流星] §f冷却: §b20s"),
                                Component.text("§f本次射箭同时发射出三颗流星，在白天发射§6[日]§f，在夜晚发射§6[月]"),
                                Component.text("§f流星会以§b5§f格每秒的速度向前移动，至多移动§b6s"),
                                Component.text("§f释放技能不会立刻进入冷却时间，再次释放技能，流星将改变方向"),
                                Component.text("§f向玩家当前位置移动，并且此时速度增大到§b20§f格每秒，至多移动§b3s"),
                                Component.text("§f再次释放技能，或者流星移动到最大距离后技能才会进入冷却"),
                                Component.text("§f每颗流星击中怪物时会爆炸并消失，对周围§b4§f格的怪物造成§b[300%箭矢强度]§f点伤害"),
                                Component.text("§f流星每移动§b1§f格，将增加§b5%§f伤害"),
                                Component.text("§f每一颗§6[日]§f命中会对怪物施加红温效果，增加§b30%§f受到的物理伤害，持续§b5s"),
                                Component.text("§f每一颗§6[月]§f命中会恢复发射者§b2.5%+25§f最大生命"),
                                Component.text("§f红温效果不可叠加，再次施加将刷新持续时间"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaLiangYi.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.CHARGE_2,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("liangYi", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaFuRongGong.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("fuRongGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§a[芙蓉] §f冷却: §b20s"),
                                Component.text("§f箭矢不再造成伤害，若命中玩家，则恢复§b10+20%§f最大生命"),
                                Component.text("§f若命中方块，则为自己回复生命"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaHongLuanGong.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("hongLuanGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§9[红鸾] §f冷却: §b20s"),
                                Component.text("§f箭矢不再造成伤害，若命中玩家，则恢复§b30+20%§f最大生命"),
                                Component.text("§f并给予该玩家§b5s§f红鸾附体效果"),
                                Component.text("§f红鸾附体的玩家普攻或者满弦箭命中时"),
                                Component.text("§f红鸾会一并攻击，造成§b[释放技能者释放时200%箭矢强度]§f点伤害"),
                                Component.text("§f重复附加红鸾，后附加会覆盖前附加"),
                                Component.text("§f若命中方块，则为自己回复生命与提供增益"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaTianQiongGong.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("tianQiongGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§d[天琼] §f冷却: §b20s"),
                                Component.text("§f箭矢不再造成伤害，若命中玩家，则恢复§b90+20%§f最大生命"),
                                Component.text("§f并令琼浆玉露融入玩家，获得§b5s强化"),
                                Component.text("§f增加其§b20%§f进攻属性，§b40§f点护甲与法抗"),
                                Component.text("§f同时移速增加§b60%"),
                                Component.text("§f重复强化不可叠加，将刷新持续时间"),
                                Component.text("§f若命中方块，则为自己回复生命与提供增益"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaSheTianZhuiYueGong.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("sheTianZhuiYueGong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲射击]§e[奢天] §f冷却: §b20s"),
                                Component.text("§f箭矢不再造成伤害，若命中玩家，则恢复§b270+20%§f最大生命"),
                                Component.text("§f同时根据天气，为玩家增加不同的祝福，持续§b9s"),
                                Component.text("§f若处于晴天，则施加§6[飞廉]§f祝福"),
                                Component.text("§f若处于雨(雪)天，则施加§6[萍翳]§f祝福"),
                                Component.text("§f两种祝福都能增加§b30%§f进攻属性与§b50§f点护甲"),
                                Component.text("§6[飞廉]§f祝福：移速增加§b100%§f，箭矢伤害免疫与三叉戟伤害免疫增加至最大值"),
                                Component.text("§6[萍翳]§f祝福：生机增加§b50§f，法抗增加§b100§f，并不断熄灭身体的火焰，不会着火"),
                                Component.text("§f同一类型的祝福不可重复获得，再次获得将刷新持续时间"),
                                Component.text("§f若命中方块，则为自己回复生命与提供增益"),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaLiuGuang.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act1,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("liuGuang", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaHeiTieGuo.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBDAN,
                                ComponentSet.ActFUSHOU,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("heiTieGuo", 4),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaQinTongGuo.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBDAN,
                                ComponentSet.ActFUSHOU,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qinTongGuo", 4),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaLianDanLu.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.ActFUSHOU,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("lianDanLu", 4),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaSuoHunLu.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.ActFUSHOU,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("suoHunLu", 4),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaQiShaDing.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.ActFUSHOU,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("qiShaDing", 4),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaHunYuanShenDing.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.ActFUSHOU,
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("hunYuanShenDing", 4),
                                ComponentSet.MIDDLEFULINGXIANGQIAN,
                                ComponentSet.FULING,
                                ComponentSet.XIANGQIAN
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

        metaTaoMuJian.setCustomModelData(1);
        metaKaiShanDao.setCustomModelData(1001);
        metaChiTongJian.setCustomModelData(2002);
        metaPoKongFu.setCustomModelData(1003);
        metaSanBaoYuRuYi.setCustomModelData(1004);
        metaXuanYuan.setCustomModelData(1005);
        metaQinTongJian.setCustomModelData(2001);
        metaJuTongZhanChui.setCustomModelData(1002);
        metaTaiJiJian.setCustomModelData(2003);
        metaKunLunFeiXianJian.setCustomModelData(2004);
        metaTaiE.setCustomModelData(2005);
        metaYinYueQiang.setCustomModelData(3001);
        metaHongYinQiang.setCustomModelData(3002);
        metaYouLongQiang.setCustomModelData(3003);
        metaHuTouZhanJinQiang.setCustomModelData(3004);
        metaRuYiJinGuBang.setCustomModelData(3005);

        metaQinTongGong.setCustomModelData(2);
        metaYanTieGong.setCustomModelData(3);
        metaZhongChuiGong.setCustomModelData(4);
        metaBeiDouMieShenGong.setCustomModelData(5);
        metaZhuRi.setCustomModelData(6);
        metaHeiTieNu.setCustomModelData(2);
        metaHongLinNu.setCustomModelData(3);
        metaJiaoLongNu.setCustomModelData(4);
        metaRiYueLiuXingNu.setCustomModelData(5);
        metaLiangYi.setCustomModelData(5);
        metaFuRongGong.setCustomModelData(2);
        metaHongLuanGong.setCustomModelData(3);
        metaTianQiongGong.setCustomModelData(4);
        metaSheTianZhuiYueGong.setCustomModelData(5);
        metaLiuGuang.setCustomModelData(6);

        metaHeiTieGuo.setCustomModelData(1);
        metaQinTongGuo.setCustomModelData(1);
        metaLianDanLu.setCustomModelData(2);
        metaSuoHunLu.setCustomModelData(3);
        metaQiShaDing.setCustomModelData(4);
        metaHunYuanShenDing.setCustomModelData(5);


        TAO_MU_JIAN.setItemMeta(metaTaoMuJian);
        KAI_SHAN_DAO.setItemMeta(metaKaiShanDao);
        CHI_TONG_JIAN.setItemMeta(metaChiTongJian);
        PO_KONG_FU.setItemMeta(metaPoKongFu);
        SAN_BAO_YU_RU_YI.setItemMeta(metaSanBaoYuRuYi);
        XUAN_YUAN.setItemMeta(metaXuanYuan);
        QIN_TONG_JIAN.setItemMeta(metaQinTongJian);
        JU_TONG_ZHAN_CHUI.setItemMeta(metaJuTongZhanChui);
        TAI_JI_JIAN.setItemMeta(metaTaiJiJian);
        KUN_LUN_FEI_XIAN_JIAN.setItemMeta(metaKunLunFeiXianJian);
        TAI_E.setItemMeta(metaTaiE);
        YIN_YUE_QIANG.setItemMeta(metaYinYueQiang);
        HONG_YIN_QIANG.setItemMeta(metaHongYinQiang);
        YOU_LONG_QIANG.setItemMeta(metaYouLongQiang);
        HU_TOU_ZHAN_JIN_QIANG.setItemMeta(metaHuTouZhanJinQiang);
        RU_YI_JIN_GU_BANG.setItemMeta(metaRuYiJinGuBang);

        TENG_MU_GONG.setItemMeta(metaTengMuGong);
        QIN_TONG_GONG.setItemMeta(metaQinTongGong);
        YAN_TIE_GONG.setItemMeta(metaYanTieGong);
        ZHONG_CHUI_GONG.setItemMeta(metaZhongChuiGong);
        BEI_DOU_MIE_SHEN_GONG.setItemMeta(metaBeiDouMieShenGong);
        ZHU_RI.setItemMeta(metaZhuRi);
        HEI_TIE_NU.setItemMeta(metaHeiTieNu);
        HONG_LIN_NU.setItemMeta(metaHongLinNu);
        JIAO_LONG_NU.setItemMeta(metaJiaoLongNu);
        RI_YUE_LIU_XING_NU.setItemMeta(metaRiYueLiuXingNu);
        LIANG_YI.setItemMeta(metaLiangYi);
        FU_RONG_GONG.setItemMeta(metaFuRongGong);
        HONG_LUAN_GONG.setItemMeta(metaHongLuanGong);
        TIAN_QIONG_GONG.setItemMeta(metaTianQiongGong);
        SHE_TIAN_ZHUI_YUE_GONG.setItemMeta(metaSheTianZhuiYueGong);
        LIU_GUANG.setItemMeta(metaLiuGuang);

        HEI_TIE_GUO.setItemMeta(metaHeiTieGuo);
        QIN_TONG_GUO.setItemMeta(metaQinTongGuo);
        LIAN_DAN_LU.setItemMeta(metaLianDanLu);
        SUO_HUN_LU.setItemMeta(metaSuoHunLu);
        QI_SHA_DING.setItemMeta(metaQiShaDing);
        HUN_YUAN_SHEN_DING.setItemMeta(metaHunYuanShenDing);


    }

    public static void putId() {
        Recipe.idToItem.put("taoMuJian", TAO_MU_JIAN);

        Recipe.idToItem.put("kaiShanDao", KAI_SHAN_DAO);
        Recipe.idToItem.put("juTongZhanChui", JU_TONG_ZHAN_CHUI);
        Recipe.idToItem.put("poKongFu", PO_KONG_FU);
        Recipe.idToItem.put("sanBaoYuRuYi", SAN_BAO_YU_RU_YI);
        Recipe.idToItem.put("xuanYuan", XUAN_YUAN);

        Recipe.idToItem.put("qinTongJian", QIN_TONG_JIAN);
        Recipe.idToItem.put("chiTongJian", CHI_TONG_JIAN);
        Recipe.idToItem.put("taiJiJian", TAI_JI_JIAN);
        Recipe.idToItem.put("kunLunFeiXianJian", KUN_LUN_FEI_XIAN_JIAN);
        Recipe.idToItem.put("taiE", TAI_E);

        Recipe.idToItem.put("yinYueQiang", YIN_YUE_QIANG);
        Recipe.idToItem.put("hongYinQiang", HONG_YIN_QIANG);
        Recipe.idToItem.put("youLongQiang", YOU_LONG_QIANG);
        Recipe.idToItem.put("huTouZhanJinQiang", HU_TOU_ZHAN_JIN_QIANG);
        Recipe.idToItem.put("ruYiJinGuBang", RU_YI_JIN_GU_BANG);

        Recipe.idToItem.put("tengMuGong", TENG_MU_GONG);

        Recipe.idToItem.put("qinTongGong", QIN_TONG_GONG);
        Recipe.idToItem.put("yanTieGong", YAN_TIE_GONG);
        Recipe.idToItem.put("zhongChuiGong", ZHONG_CHUI_GONG);
        Recipe.idToItem.put("beiDouMieShenGong", BEI_DOU_MIE_SHEN_GONG);
        Recipe.idToItem.put("zhuRi", ZHU_RI);

        Recipe.idToItem.put("heiTieNu", HEI_TIE_NU);
        Recipe.idToItem.put("hongLinNu", HONG_LIN_NU);
        Recipe.idToItem.put("jiaoLongNu", JIAO_LONG_NU);
        Recipe.idToItem.put("riYueLiuXingNu", RI_YUE_LIU_XING_NU);
        Recipe.idToItem.put("liangYi", LIANG_YI);

        Recipe.idToItem.put("fuRongGong", FU_RONG_GONG);
        Recipe.idToItem.put("hongLuanGong", HONG_LUAN_GONG);
        Recipe.idToItem.put("tianQiongGong", TIAN_QIONG_GONG);
        Recipe.idToItem.put("sheTianZhuiYueGong", SHE_TIAN_ZHUI_YUE_GONG);
        Recipe.idToItem.put("liuGuang", LIU_GUANG);

        Recipe.idToItem.put("heiTieGuo", HEI_TIE_GUO);
        Recipe.idToItem.put("qinTongGuo", QIN_TONG_GUO);
        Recipe.idToItem.put("lianDanLu", LIAN_DAN_LU);
        Recipe.idToItem.put("suoHunLu", SUO_HUN_LU);
        Recipe.idToItem.put("qiShaDing", QI_SHA_DING);
        Recipe.idToItem.put("hunYuanShenDing", HUN_YUAN_SHEN_DING);
    }

}