package com.xiaoxiaoowo.yuehua.items.other;

import com.xiaoxiaoowo.yuehua.system.DataContainer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public final class Collection {
    public final static ItemStack SHAN_SHEN_MIAO = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack SHEN_MU_YAO_JING = new ItemStack(Material.RAW_COPPER);

    public final static ItemStack WANG_YUAN_WAI = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack WEN_QUAN_KE_ZHAN = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack SHA_MO_SHI_BEI = new ItemStack(Material.RAW_COPPER);

    public final static ItemStack CHEN_DAI_FU = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack SHEN_SHAN_ZHANG_ZHE = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack YU_ZHU = new ItemStack(Material.RAW_COPPER);

    public final static ItemStack BAI_GU_JING = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack PENG_LAI_SHANG_REN = new ItemStack(Material.RAW_COPPER);

    public final static ItemStack SHI_HUANG = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack HUO_MO = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack CHI_YOU = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack GUI_OU = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack SHENG_SHAN = new ItemStack(Material.RAW_COPPER);
    public final static ItemStack KU_GU = new ItemStack(Material.RAW_COPPER);

    static {
        SHAN_SHEN_MIAO.setCustomModelData(1);
        SHEN_MU_YAO_JING.setCustomModelData(2);
        WANG_YUAN_WAI.setCustomModelData(3);
        WEN_QUAN_KE_ZHAN.setCustomModelData(4);
        SHA_MO_SHI_BEI.setCustomModelData(5);
        CHEN_DAI_FU.setCustomModelData(6);
        SHEN_SHAN_ZHANG_ZHE.setCustomModelData(7);
        YU_ZHU.setCustomModelData(8);
        BAI_GU_JING.setCustomModelData(9);
        PENG_LAI_SHANG_REN.setCustomModelData(10);
        SHI_HUANG.setCustomModelData(11);
        HUO_MO.setCustomModelData(12);
        CHI_YOU.setCustomModelData(13);
        GUI_OU.setCustomModelData(14);
        SHENG_SHAN.setCustomModelData(15);
        KU_GU.setCustomModelData(16);


        ItemMeta shanshenmiao = SHAN_SHEN_MIAO.getItemMeta();
        ItemMeta shenmuyaojing = SHEN_MU_YAO_JING.getItemMeta();
        ItemMeta wangyuanwai = WANG_YUAN_WAI.getItemMeta();
        ItemMeta wenquankezhan = WEN_QUAN_KE_ZHAN.getItemMeta();
        ItemMeta shamoushibei = SHA_MO_SHI_BEI.getItemMeta();
        ItemMeta chendafu = CHEN_DAI_FU.getItemMeta();
        ItemMeta shenshanzhangzhe = SHEN_SHAN_ZHANG_ZHE.getItemMeta();
        ItemMeta yuzhu = YU_ZHU.getItemMeta();
        ItemMeta baigujing = BAI_GU_JING.getItemMeta();
        ItemMeta penglai = PENG_LAI_SHANG_REN.getItemMeta();
        ItemMeta shihuang = SHI_HUANG.getItemMeta();
        ItemMeta huoMo = HUO_MO.getItemMeta();
        ItemMeta chiyou = CHI_YOU.getItemMeta();
        ItemMeta guiou = GUI_OU.getItemMeta();
        ItemMeta shengshan = SHENG_SHAN.getItemMeta();
        ItemMeta kugu = KU_GU.getItemMeta();

        shanshenmiao.setMaxStackSize(99);
        shenmuyaojing.setMaxStackSize(99);
        wangyuanwai.setMaxStackSize(99);
        wenquankezhan.setMaxStackSize(99);
        shamoushibei.setMaxStackSize(99);
        chendafu.setMaxStackSize(99);
        shenshanzhangzhe.setMaxStackSize(99);
        yuzhu.setMaxStackSize(99);
        baigujing.setMaxStackSize(99);
        penglai.setMaxStackSize(99);
        shihuang.setMaxStackSize(99);
        huoMo.setMaxStackSize(99);
        chiyou.setMaxStackSize(99);
        guiou.setMaxStackSize(99);
        shengshan.setMaxStackSize(99);
        kugu.setMaxStackSize(99);

        shanshenmiao.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shanshenmiaohuowu");
        shenmuyaojing.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shenmuyaojinghuowu");
        wangyuanwai.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wangyuanwaihuowu");
        wenquankezhan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "wenquankezhanhuowu");
        shamoushibei.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shamoushibeihuowu");
        chendafu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chendafuhuowu");
        shenshanzhangzhe.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shenshanzhangzhehuowu");
        yuzhu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "yuzhuhuowu");
        baigujing.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "baigujinghuowu");
        penglai.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "penglaihuowu");
        shihuang.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shihuanghuowu");
        huoMo.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "huomohuowu");
        chiyou.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "chiyouhuowu");
        guiou.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "guiouhuowu");
        shengshan.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "shengshanhuowu");
        kugu.getPersistentDataContainer().set(DataContainer.id, PersistentDataType.STRING, "kuguhuowu");

        shanshenmiao.displayName(
                Component.text("被抢走的山神庙贡品").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );

        SHAN_SHEN_MIAO.setItemMeta(shanshenmiao);

        shenmuyaojing.displayName(
                Component.text("被抢走的沃土").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        SHEN_MU_YAO_JING.setItemMeta(shenmuyaojing);

        wangyuanwai.displayName(
                Component.text("王员外被抢走的货物").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        WANG_YUAN_WAI.setItemMeta(wangyuanwai);

        wenquankezhan.displayName(
                Component.text("温泉客栈需要的补给品").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        WEN_QUAN_KE_ZHAN.setItemMeta(wenquankezhan);

        shamoushibei.displayName(
                Component.text("上仙被抢走的文献").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        SHA_MO_SHI_BEI.setItemMeta(shamoushibei);

        chendafu.displayName(
                Component.text("陈大夫需要的草药束").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        CHEN_DAI_FU.setItemMeta(chendafu);

        shenshanzhangzhe.displayName(
                Component.text("被抢走的古籍").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        SHEN_SHAN_ZHANG_ZHE.setItemMeta(shenshanzhangzhe);

        yuzhu.displayName(
                Component.text("山魅").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        YU_ZHU.setItemMeta(yuzhu);

        baigujing.displayName(
                Component.text("怨气的结晶").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );

        BAI_GU_JING.setItemMeta(baigujing);

        penglai.displayName(
                Component.text("被抢走的鲑鱼").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        PENG_LAI_SHANG_REN.setItemMeta(penglai);

        shihuang.displayName(
                Component.text("皇陵信物").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        SHI_HUANG.setItemMeta(shihuang);

        huoMo.displayName(
                Component.text("燃火种").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        HUO_MO.setItemMeta(huoMo);

        chiyou.displayName(
                Component.text("九黎灵宝").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        CHI_YOU.setItemMeta(chiyou);

        guiou.displayName(
                Component.text("太极碎星").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        GUI_OU.setItemMeta(guiou);

        shengshan.displayName(
                Component.text("圣兽徽记").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        SHENG_SHAN.setItemMeta(shengshan);

        kugu.displayName(
                Component.text("余泪").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false)
        );
        KU_GU.setItemMeta(kugu);

    }
}
