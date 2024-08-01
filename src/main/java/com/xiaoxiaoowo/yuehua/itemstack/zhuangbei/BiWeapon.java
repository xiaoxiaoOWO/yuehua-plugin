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

public final class BiWeapon {
    //战士，暗器
    public static final ItemStack FEIREN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack JINRUIFEIREN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack WUSHENGXIUJIAN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack HUIXUANTAJI = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack WUYINWUZONG = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack YANWANGTIE = new ItemStack(Material.DIAMOND_PICKAXE);

    //弓箭手，火铳
    public static final ItemStack HEITIECHONG = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack HUANGTONGCHONG = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack MINGYUE = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack CANLAN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack JINJING = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack XIAOTIAN = new ItemStack(Material.DIAMOND_PICKAXE);

    //炼丹师，灵乐
    public static final ItemStack XIAO = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack QINFENGYINYIN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack LIUSHUICHANCHAN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack BUQICHUNYU = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack SANSHENGZHENHUN = new ItemStack(Material.DIAMOND_PICKAXE);
    public static final ItemStack JIUFENGLAIYI = new ItemStack(Material.DIAMOND_PICKAXE);

    static {
        ItemMeta feirenMeta = FEIREN.getItemMeta();
        ItemMeta jinruifeirenMeta = JINRUIFEIREN.getItemMeta();
        ItemMeta wushengxiujianMeta = WUSHENGXIUJIAN.getItemMeta();
        ItemMeta huixuantajiMeta = HUIXUANTAJI.getItemMeta();
        ItemMeta wuyinwuzongMeta = WUYINWUZONG.getItemMeta();
        ItemMeta yanwangtieMeta = YANWANGTIE.getItemMeta();
        ItemMeta heitiechongMeta = HEITIECHONG.getItemMeta();
        ItemMeta huangtongchongMeta = HUANGTONGCHONG.getItemMeta();
        ItemMeta mingyueMeta = MINGYUE.getItemMeta();
        ItemMeta canlanMeta = CANLAN.getItemMeta();
        ItemMeta jinjingMeta = JINJING.getItemMeta();
        ItemMeta xiaotianMeta = XIAOTIAN.getItemMeta();
        ItemMeta xiaoMeta = XIAO.getItemMeta();
        ItemMeta qinfengyinyinMeta = QINFENGYINYIN.getItemMeta();
        ItemMeta liushuichanchanMeta = LIUSHUICHANCHAN.getItemMeta();
        ItemMeta buqichunyuMeta = BUQICHUNYU.getItemMeta();
        ItemMeta sanshengzhenhunMeta = SANSHENGZHENHUN.getItemMeta();
        ItemMeta jiufenglaiyiMeta = JIUFENGLAIYI.getItemMeta();

        feirenMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jinruifeirenMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        wushengxiujianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        huixuantajiMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        wuyinwuzongMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        yanwangtieMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        heitiechongMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        huangtongchongMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        mingyueMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        canlanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jinjingMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiaotianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiaoMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        qinfengyinyinMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        liushuichanchanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        buqichunyuMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        sanshengzhenhunMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jiufenglaiyiMeta.addItemFlags(ZeroAttributeModifier.itemFlags);

        feirenMeta.setUnbreakable(true);
        jinruifeirenMeta.setUnbreakable(true);
        wushengxiujianMeta.setUnbreakable(true);
        huixuantajiMeta.setUnbreakable(true);
        wuyinwuzongMeta.setUnbreakable(true);
        yanwangtieMeta.setUnbreakable(true);
        heitiechongMeta.setUnbreakable(true);
        huangtongchongMeta.setUnbreakable(true);
        mingyueMeta.setUnbreakable(true);
        canlanMeta.setUnbreakable(true);
        jinjingMeta.setUnbreakable(true);
        xiaotianMeta.setUnbreakable(true);
        xiaoMeta.setUnbreakable(true);
        qinfengyinyinMeta.setUnbreakable(true);
        liushuichanchanMeta.setUnbreakable(true);
        buqichunyuMeta.setUnbreakable(true);
        sanshengzhenhunMeta.setUnbreakable(true);
        jiufenglaiyiMeta.setUnbreakable(true);

        feirenMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        jinruifeirenMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        wushengxiujianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        huixuantajiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        wuyinwuzongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        yanwangtieMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        heitiechongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        huangtongchongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        mingyueMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        canlanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        jinjingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xiaotianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        xiaoMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        qinfengyinyinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        liushuichanchanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        buqichunyuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        sanshengzhenhunMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);
        jiufenglaiyiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, ZeroAttributeModifier.ATTACK_DAMAGE);

        feirenMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        jinruifeirenMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        wushengxiujianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        huixuantajiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        wuyinwuzongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        yanwangtieMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        heitiechongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        huangtongchongMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        mingyueMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        canlanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        jinjingMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xiaotianMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        xiaoMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        qinfengyinyinMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        liushuichanchanMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        buqichunyuMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        sanshengzhenhunMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);
        jiufenglaiyiMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, ZeroAttributeModifier.ATTACK_SPEED);

        PersistentDataContainer pdcfeiren = feirenMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjinruifeiren = jinruifeirenMeta.getPersistentDataContainer();
        PersistentDataContainer pdcwushengxiujian = wushengxiujianMeta.getPersistentDataContainer();
        PersistentDataContainer pdchuixuantaji = huixuantajiMeta.getPersistentDataContainer();
        PersistentDataContainer pdcwuyinwuzong = wuyinwuzongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcyanwangtie = yanwangtieMeta.getPersistentDataContainer();
        PersistentDataContainer pdcheitiechong = heitiechongMeta.getPersistentDataContainer();
        PersistentDataContainer pdchuangtongchong = huangtongchongMeta.getPersistentDataContainer();
        PersistentDataContainer pdcmingyue = mingyueMeta.getPersistentDataContainer();
        PersistentDataContainer pdccanlan = canlanMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjinjing = jinjingMeta.getPersistentDataContainer();
        PersistentDataContainer pdcxiaotian = xiaotianMeta.getPersistentDataContainer();
        PersistentDataContainer pdcxiao = xiaoMeta.getPersistentDataContainer();
        PersistentDataContainer pdcqinfengyinyin = qinfengyinyinMeta.getPersistentDataContainer();
        PersistentDataContainer pdcliushuichanchan = liushuichanchanMeta.getPersistentDataContainer();
        PersistentDataContainer pdcbuqichunyu = buqichunyuMeta.getPersistentDataContainer();
        PersistentDataContainer pdcsanshengzhenhun = sanshengzhenhunMeta.getPersistentDataContainer();
        PersistentDataContainer pdcjiufenglaiyi = jiufenglaiyiMeta.getPersistentDataContainer();

        pdcfeiren.set(DataContainer.id, PersistentDataType.STRING, "feiren");
        pdcjinruifeiren.set(DataContainer.id, PersistentDataType.STRING, "jinruifeiren");
        pdcwushengxiujian.set(DataContainer.id, PersistentDataType.STRING, "wushengxiujian");
        pdchuixuantaji.set(DataContainer.id, PersistentDataType.STRING, "huixuantaji");
        pdcwuyinwuzong.set(DataContainer.id, PersistentDataType.STRING, "wuyinwuzong");
        pdcyanwangtie.set(DataContainer.id, PersistentDataType.STRING, "yanwangtie");
        pdcheitiechong.set(DataContainer.id, PersistentDataType.STRING, "heitiechong");
        pdchuangtongchong.set(DataContainer.id, PersistentDataType.STRING, "huangtongchong");
        pdcmingyue.set(DataContainer.id, PersistentDataType.STRING, "mingyue");
        pdccanlan.set(DataContainer.id, PersistentDataType.STRING, "canlan");
        pdcjinjing.set(DataContainer.id, PersistentDataType.STRING, "jinjing");
        pdcxiaotian.set(DataContainer.id, PersistentDataType.STRING, "xiaotian");
        pdcxiao.set(DataContainer.id, PersistentDataType.STRING, "xiao");
        pdcqinfengyinyin.set(DataContainer.id, PersistentDataType.STRING, "qinfengyinyin");
        pdcliushuichanchan.set(DataContainer.id, PersistentDataType.STRING, "liushuichanchan");
        pdcbuqichunyu.set(DataContainer.id, PersistentDataType.STRING, "buqichunyu");
        pdcsanshengzhenhun.set(DataContainer.id, PersistentDataType.STRING, "sanshengzhenhun");
        pdcjiufenglaiyi.set(DataContainer.id, PersistentDataType.STRING, "jiufenglaiyi");

        pdcfeiren.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcjinruifeiren.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcwushengxiujian.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdchuixuantaji.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcwuyinwuzong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcyanwangtie.set(DataContainer.insertid, PersistentDataType.STRING, "null");

        pdcheitiechong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdchuangtongchong.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcmingyue.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdccanlan.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcjinjing.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcxiaotian.set(DataContainer.insertid, PersistentDataType.STRING, "null");

        pdcxiao.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcqinfengyinyin.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcliushuichanchan.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcbuqichunyu.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcsanshengzhenhun.set(DataContainer.insertid, PersistentDataType.STRING, "null");
        pdcjiufenglaiyi.set(DataContainer.insertid, PersistentDataType.STRING, "null");


        pdcfeiren.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcjinruifeiren.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcwushengxiujian.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdchuixuantaji.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcwuyinwuzong.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcyanwangtie.set(DataContainer.job, PersistentDataType.INTEGER, 1);
        pdcheitiechong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdchuangtongchong.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcmingyue.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdccanlan.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcjinjing.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcxiaotian.set(DataContainer.job, PersistentDataType.INTEGER, 2);
        pdcxiao.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcqinfengyinyin.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcliushuichanchan.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcbuqichunyu.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcsanshengzhenhun.set(DataContainer.job, PersistentDataType.INTEGER, 3);
        pdcjiufenglaiyi.set(DataContainer.job, PersistentDataType.INTEGER, 3);

        pdcfeiren.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcjinruifeiren.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcwushengxiujian.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdchuixuantaji.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcwuyinwuzong.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcyanwangtie.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcheitiechong.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdchuangtongchong.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcmingyue.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdccanlan.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcjinjing.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcxiaotian.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcxiao.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcqinfengyinyin.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcliushuichanchan.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcbuqichunyu.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcsanshengzhenhun.set(DataContainer.slot, PersistentDataType.INTEGER, 1);
        pdcjiufenglaiyi.set(DataContainer.slot, PersistentDataType.INTEGER, 1);


        feirenMeta.setCustomModelData(4001);
        jinruifeirenMeta.setCustomModelData(4002);
        wushengxiujianMeta.setCustomModelData(4003);
        huixuantajiMeta.setCustomModelData(4004);
        wuyinwuzongMeta.setCustomModelData(4005);
        yanwangtieMeta.setCustomModelData(4006);

        heitiechongMeta.setCustomModelData(5001);
        huangtongchongMeta.setCustomModelData(5002);
        mingyueMeta.setCustomModelData(5003);
        canlanMeta.setCustomModelData(5004);
        jinjingMeta.setCustomModelData(5005);
        xiaotianMeta.setCustomModelData(5006);

        xiaoMeta.setCustomModelData(6001);
        qinfengyinyinMeta.setCustomModelData(6002);
        liushuichanchanMeta.setCustomModelData(6003);
        buqichunyuMeta.setCustomModelData(6004);
        sanshengzhenhunMeta.setCustomModelData(6005);
        jiufenglaiyiMeta.setCustomModelData(6006);

        feirenMeta.displayName(Component.text("飞刃[副武器]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        jinruifeirenMeta.displayName(Component.text("精锐飞刃[副武器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        wushengxiujianMeta.displayName(Component.text("无声袖箭[副武器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        huixuantajiMeta.displayName(Component.text("回旋踏迹[副武器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        wuyinwuzongMeta.displayName(Component.text("无影无踪[副武器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        yanwangtieMeta.displayName(Component.text("阎王帖[副武器]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        heitiechongMeta.displayName(Component.text("黑铁铳[副武器]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        huangtongchongMeta.displayName(Component.text("黄铜铳[副武器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        mingyueMeta.displayName(Component.text("明月[副武器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        canlanMeta.displayName(Component.text("灿烂[副武器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        jinjingMeta.displayName(Component.text("净镜[副武器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        xiaotianMeta.displayName(Component.text("啸天[副武器]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));

        xiaoMeta.displayName(Component.text("箫[副武器]").color(NamedTextColor.WHITE).decoration(TextDecoration.ITALIC, false));
        qinfengyinyinMeta.displayName(Component.text("清风吟吟[副武器]").color(NamedTextColor.GREEN).decoration(TextDecoration.ITALIC, false));
        liushuichanchanMeta.displayName(Component.text("流水潺潺[副武器]").color(NamedTextColor.BLUE).decoration(TextDecoration.ITALIC, false));
        buqichunyuMeta.displayName(Component.text("不期春雨[副武器]").color(NamedTextColor.LIGHT_PURPLE).decoration(TextDecoration.ITALIC, false));
        sanshengzhenhunMeta.displayName(Component.text("三生镇魂[副武器]").color(NamedTextColor.YELLOW).decoration(TextDecoration.ITALIC, false));
        jiufenglaiyiMeta.displayName(Component.text("九凤来仪[副武器]").color(NamedTextColor.RED).decoration(TextDecoration.ITALIC, false));


        feirenMeta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        jinruifeirenMeta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        wushengxiujianMeta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        huixuantajiMeta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        wuyinwuzongMeta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        yanwangtieMeta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        heitiechongMeta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        huangtongchongMeta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        mingyueMeta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        canlanMeta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        jinjingMeta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        xiaotianMeta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        xiaoMeta.lore(
                List.of(
                        ComponentSet.RARE1
                )
        );

        qinfengyinyinMeta.lore(
                List.of(
                        ComponentSet.RARE2
                )
        );

        liushuichanchanMeta.lore(
                List.of(
                        ComponentSet.RARE3
                )
        );

        buqichunyuMeta.lore(
                List.of(
                        ComponentSet.RARE4
                )
        );

        sanshengzhenhunMeta.lore(
                List.of(
                        ComponentSet.RARE5
                )
        );

        jiufenglaiyiMeta.lore(
                List.of(
                        ComponentSet.RARE6
                )
        );

        FEIREN.setItemMeta(feirenMeta);
        JINRUIFEIREN.setItemMeta(jinruifeirenMeta);
        WUSHENGXIUJIAN.setItemMeta(wushengxiujianMeta);
        HUIXUANTAJI.setItemMeta(huixuantajiMeta);
        WUYINWUZONG.setItemMeta(wuyinwuzongMeta);
        YANWANGTIE.setItemMeta(yanwangtieMeta);

        HEITIECHONG.setItemMeta(heitiechongMeta);
        HUANGTONGCHONG.setItemMeta(huangtongchongMeta);
        MINGYUE.setItemMeta(mingyueMeta);
        CANLAN.setItemMeta(canlanMeta);
        JINJING.setItemMeta(jinjingMeta);
        XIAOTIAN.setItemMeta(xiaotianMeta);
        XIAO.setItemMeta(xiaoMeta);
        QINFENGYINYIN.setItemMeta(qinfengyinyinMeta);
        LIUSHUICHANCHAN.setItemMeta(liushuichanchanMeta);
        BUQICHUNYU.setItemMeta(buqichunyuMeta);
        SANSHENGZHENHUN.setItemMeta(sanshengzhenhunMeta);
        JIUFENGLAIYI.setItemMeta(jiufenglaiyiMeta);

    }


}
