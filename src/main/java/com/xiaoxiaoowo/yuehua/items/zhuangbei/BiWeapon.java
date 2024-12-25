package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.Speed;
import com.xiaoxiaoowo.yuehua.guis.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        heitiechongMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        Speed.biweaponSpeed,
                        -2,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        huangtongchongMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        Speed.biweaponSpeed,
                        -2,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        jinjingMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        Speed.biweaponSpeed,
                        -2,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        canlanMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        Speed.biweaponSpeed,
                        -2,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        mingyueMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        Speed.biweaponSpeed,
                        -2,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        xiaotianMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED,
                new AttributeModifier(
                        Speed.biweaponSpeed,
                        -2,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

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

        pdcfeiren.set(DataContainer.id, PersistentDataType.STRING, "feiRen");
        pdcjinruifeiren.set(DataContainer.id, PersistentDataType.STRING, "jinRuiFeiRen");
        pdcwushengxiujian.set(DataContainer.id, PersistentDataType.STRING, "wuShengXiuJian");
        pdchuixuantaji.set(DataContainer.id, PersistentDataType.STRING, "huiXuanTaiJi");
        pdcwuyinwuzong.set(DataContainer.id, PersistentDataType.STRING, "wuYinWuZong");
        pdcyanwangtie.set(DataContainer.id, PersistentDataType.STRING, "yanWangTie");
        pdcheitiechong.set(DataContainer.id, PersistentDataType.STRING, "heiTieChong");
        pdchuangtongchong.set(DataContainer.id, PersistentDataType.STRING, "huangTongChong");
        pdcmingyue.set(DataContainer.id, PersistentDataType.STRING, "mingYue");
        pdccanlan.set(DataContainer.id, PersistentDataType.STRING, "canLan");
        pdcjinjing.set(DataContainer.id, PersistentDataType.STRING, "jinJing");
        pdcxiaotian.set(DataContainer.id, PersistentDataType.STRING, "xiaoTian");
        pdcxiao.set(DataContainer.id, PersistentDataType.STRING, "xiao");
        pdcqinfengyinyin.set(DataContainer.id, PersistentDataType.STRING, "qinFengYinYin");
        pdcliushuichanchan.set(DataContainer.id, PersistentDataType.STRING, "liuShuiChanChan");
        pdcbuqichunyu.set(DataContainer.id, PersistentDataType.STRING, "buQiChunYu");
        pdcsanshengzhenhun.set(DataContainer.id, PersistentDataType.STRING, "sanShengZhenHun");
        pdcjiufenglaiyi.set(DataContainer.id, PersistentDataType.STRING, "jiuFengLaiYi");



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
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("feiRen", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        jinruifeirenMeta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("jinRuiFeiRen", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        wushengxiujianMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("wuShengXiuJian", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        huixuantajiMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("huiXuanTaiJi", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        wuyinwuzongMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("wuYinWuZong", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        yanwangtieMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBZHAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("yanWangTie", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        heitiechongMeta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act2,
                                ComponentSet.SPEED_BI,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("heiTieChong", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        huangtongchongMeta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act2,
                                ComponentSet.SPEED_BI,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("huangTongChong", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        mingyueMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act2,
                                ComponentSet.SPEED_BI,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("mingYue", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        canlanMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act2,
                                ComponentSet.SPEED_BI,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("canLan", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        jinjingMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act2,
                                ComponentSet.SPEED_BI,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("jinJing", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        xiaotianMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBGONG,
                                ComponentSet.Act2,
                                ComponentSet.SPEED_BI,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("xiaoTian", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        xiaoMeta.lore(
                Stream.of(
                                ComponentSet.RARE1,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("xiao", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        qinfengyinyinMeta.lore(
                Stream.of(
                                ComponentSet.RARE2,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("qinFengYinYin", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        liushuichanchanMeta.lore(
                Stream.of(
                                ComponentSet.RARE3,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("liuShuiChanChan", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        buqichunyuMeta.lore(
                Stream.of(
                                ComponentSet.RARE4,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("buQiChunYu", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        sanshengzhenhunMeta.lore(
                Stream.of(
                                ComponentSet.RARE5,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("sanShengZhenHun", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

        jiufenglaiyiMeta.lore(
                Stream.of(
                                ComponentSet.RARE6,
                                ComponentSet.JOBDAN,
                                ComponentSet.Act2,
                                ComponentSet.SHORTSHUXIN,
                                AttributeSet.fromId("jiuFengLaiYi", 2),
                                ComponentSet.SHORTJINENG,
                                ComponentSet.SHORTXIANGQIAN,
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

    public static void putId(){
        Recipe.idToItem.put("feiRen", FEIREN);
        Recipe.idToItem.put("jinRuiFeiRen", JINRUIFEIREN);
        Recipe.idToItem.put("wuShengXiuJian", WUSHENGXIUJIAN);
        Recipe.idToItem.put("huiXuanTaiJi", HUIXUANTAJI);
        Recipe.idToItem.put("wuYinWuZong", WUYINWUZONG);
        Recipe.idToItem.put("yanWangTie", YANWANGTIE);
        Recipe.idToItem.put("heiTieChong", HEITIECHONG);
        Recipe.idToItem.put("huangTongChong", HUANGTONGCHONG);
        Recipe.idToItem.put("mingYue", MINGYUE);
        Recipe.idToItem.put("canLan", CANLAN);
        Recipe.idToItem.put("jinJing", JINJING);
        Recipe.idToItem.put("xiaoTian", XIAOTIAN);
        Recipe.idToItem.put("xiao", XIAO);
        Recipe.idToItem.put("qinFengYinYin", QINFENGYINYIN);
        Recipe.idToItem.put("liuShuiChanChan", LIUSHUICHANCHAN);
        Recipe.idToItem.put("buQiChunYu", BUQICHUNYU);
        Recipe.idToItem.put("sanShengZhenHun", SANSHENGZHENHUN);
        Recipe.idToItem.put("jiuFengLaiYi", JIUFENGLAIYI);
    }

}
