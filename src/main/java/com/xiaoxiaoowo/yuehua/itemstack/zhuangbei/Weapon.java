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

        pdcTaoMuJian.set(DataContainer.id, PersistentDataType.STRING, "taomujian");
        pdcKaiShanDao.set(DataContainer.id, PersistentDataType.STRING, "kaishandao");
        pdcJuTongZhanChui.set(DataContainer.id, PersistentDataType.STRING, "jutongzhanchui");
        pdcPoKongFu.set(DataContainer.id, PersistentDataType.STRING, "pokongfu");
        pdcSanBaoYuRuYi.set(DataContainer.id, PersistentDataType.STRING, "sanbaoyuruyi");
        pdcXuanYuan.set(DataContainer.id, PersistentDataType.STRING, "xuanyuan");
        pdcQinTongJian.set(DataContainer.id, PersistentDataType.STRING, "qintongjian");
        pdcChiTongJian.set(DataContainer.id, PersistentDataType.STRING, "chitongjian");
        pdcTaiJiJian.set(DataContainer.id, PersistentDataType.STRING, "taijijian");
        pdcKunLunFeiXianJian.set(DataContainer.id, PersistentDataType.STRING, "kunlunfeixianjian");
        pdcTaiE.set(DataContainer.id, PersistentDataType.STRING, "taie");
        pdcYinYueQiang.set(DataContainer.id, PersistentDataType.STRING, "yinyueqiang");
        pdcHongYinQiang.set(DataContainer.id, PersistentDataType.STRING, "hongyinqiang");
        pdcYouLongQiang.set(DataContainer.id, PersistentDataType.STRING, "youlongqiang");
        pdcHuTouZhanJinQiang.set(DataContainer.id, PersistentDataType.STRING, "hutouzhanjinqiang");
        pdcRuYiJinGuBang.set(DataContainer.id, PersistentDataType.STRING, "ruyijingubang");
        pdcTengMuGong.set(DataContainer.id, PersistentDataType.STRING, "tengmugong");
        pdcQinTongGong.set(DataContainer.id, PersistentDataType.STRING, "qintonggong");
        pdcYanTieGong.set(DataContainer.id, PersistentDataType.STRING, "yantiegong");
        pdcZhongChuiGong.set(DataContainer.id, PersistentDataType.STRING, "zhongchuigong");
        pdcBeiDouMieShenGong.set(DataContainer.id, PersistentDataType.STRING, "beidoumieshengong");
        pdcZhuRi.set(DataContainer.id, PersistentDataType.STRING, "zhuri");
        pdcHeiTieNu.set(DataContainer.id, PersistentDataType.STRING, "heitienu");
        pdcHongLinNu.set(DataContainer.id, PersistentDataType.STRING, "honglinnu");
        pdcJiaoLongNu.set(DataContainer.id, PersistentDataType.STRING, "jiaolongnu");
        pdcRiYueLiuXingNu.set(DataContainer.id, PersistentDataType.STRING, "riyueliuxingnu");
        pdcLiangYi.set(DataContainer.id, PersistentDataType.STRING, "liangyi");
        pdcFuRongGong.set(DataContainer.id, PersistentDataType.STRING, "furonggong");
        pdcHongLuanGong.set(DataContainer.id, PersistentDataType.STRING, "hongluangong");
        pdcTianQiongGong.set(DataContainer.id, PersistentDataType.STRING, "tianqionggong");
        pdcSheTianZhuiYueGong.set(DataContainer.id, PersistentDataType.STRING, "shetianzhuiyuegong");
        pdcLiuGuang.set(DataContainer.id, PersistentDataType.STRING, "liuguang");
        pdcHeiTieGuo.set(DataContainer.id, PersistentDataType.STRING, "heitieguo");
        pdcQinTongGuo.set(DataContainer.id, PersistentDataType.STRING, "qintongguo");
        pdcLianDanLu.set(DataContainer.id, PersistentDataType.STRING, "liandanlu");
        pdcSuoHunLu.set(DataContainer.id, PersistentDataType.STRING, "suohunlu");
        pdcQiShaDing.set(DataContainer.id, PersistentDataType.STRING, "qishading");
        pdcHunYuanShenDing.set(DataContainer.id, PersistentDataType.STRING, "hunyuanshending");

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
                List.of(
                        ComponentSet.RARE1
                )
        );
        metaKaiShanDao.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        metaChiTongJian.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        metaPoKongFu.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        metaSanBaoYuRuYi.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        metaXuanYuan.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        metaQinTongJian.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        metaJuTongZhanChui.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        metaTaiJiJian.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        metaKunLunFeiXianJian.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        metaTaiE.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );
        metaYinYueQiang.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );
        metaHongYinQiang.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );
        metaYouLongQiang.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );
        metaHuTouZhanJinQiang.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );
        metaRuYiJinGuBang.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        metaTengMuGong.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        metaQinTongGong.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        metaYanTieGong.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        metaZhongChuiGong.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        metaBeiDouMieShenGong.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        metaZhuRi.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        metaHeiTieNu.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        metaHongLinNu.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        metaJiaoLongNu.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        metaRiYueLiuXingNu.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        metaLiangYi.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        metaFuRongGong.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        metaHongLuanGong.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        metaTianQiongGong.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        metaSheTianZhuiYueGong.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        metaLiuGuang.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        metaHeiTieGuo.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        metaQinTongGuo.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        metaLianDanLu.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        metaSuoHunLu.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        metaQiShaDing.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        metaHunYuanShenDing.lore(
                List.of(
                        ComponentSet.RARE6
                )
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
        JU_TONG_ZHAN_CHUI.setItemMeta(metaChiTongJian);
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


}
