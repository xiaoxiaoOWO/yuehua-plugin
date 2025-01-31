package com.xiaoxiaoowo.yuehua.items.zhuangbei;

import com.xiaoxiaoowo.yuehua.attribute.AttributeSet;
import com.xiaoxiaoowo.yuehua.guis.dz.Recipe;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.ComponentSet;
import com.xiaoxiaoowo.yuehua.utils.ZeroAttributeModifier;
import io.papermc.paper.datacomponent.DataComponentTypes;
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
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class BiWeapon {
    //战士，暗器
    public static final ItemStack FEIREN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack JINRUIFEIREN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack WUSHENGXIUJIAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack HUIXUANTAJI = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack WUYINWUZONG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack YANWANGTIE = new ItemStack(Material.PRISMARINE_SHARD);

    //弓箭手，火铳
    public static final ItemStack HEITIECHONG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack HUANGTONGCHONG = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack MINGYUE = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack CANLAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack JINJING = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack XIAOTIAN = new ItemStack(Material.PRISMARINE_SHARD);

    //炼丹师，灵乐
    public static final ItemStack XIAO = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack QINFENGYINYIN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack LIUSHUICHANCHAN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack BUQICHUNYU = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack SANSHENGZHENHUN = new ItemStack(Material.PRISMARINE_SHARD);
    public static final ItemStack JIUFENGLAIYI = new ItemStack(Material.PRISMARINE_SHARD);

    public static final NamespacedKey chongSpeed = new NamespacedKey("yh", "chongspeed");
    public static final NamespacedKey chongJump = new NamespacedKey("yh", "chongjump");

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

        feirenMeta.setMaxStackSize(1);
        jinruifeirenMeta.setMaxStackSize(1);
        wushengxiujianMeta.setMaxStackSize(1);
        huixuantajiMeta.setMaxStackSize(1);
        wuyinwuzongMeta.setMaxStackSize(1);
        yanwangtieMeta.setMaxStackSize(1);
        heitiechongMeta.setMaxStackSize(1);
        huangtongchongMeta.setMaxStackSize(1);
        mingyueMeta.setMaxStackSize(1);
        canlanMeta.setMaxStackSize(1);
        jinjingMeta.setMaxStackSize(1);
        xiaotianMeta.setMaxStackSize(1);
        xiaoMeta.setMaxStackSize(1);
        qinfengyinyinMeta.setMaxStackSize(1);
        liushuichanchanMeta.setMaxStackSize(1);
        buqichunyuMeta.setMaxStackSize(1);
        sanshengzhenhunMeta.setMaxStackSize(1);
        jiufenglaiyiMeta.setMaxStackSize(1);

        heitiechongMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        huangtongchongMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        mingyueMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        canlanMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        jinjingMeta.addItemFlags(ZeroAttributeModifier.itemFlags);
        xiaotianMeta.addItemFlags(ZeroAttributeModifier.itemFlags);


        heitiechongMeta.addAttributeModifier(Attribute.MOVEMENT_SPEED,
                new AttributeModifier(
                        chongSpeed,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );


        huangtongchongMeta.addAttributeModifier(Attribute.MOVEMENT_SPEED,
                new AttributeModifier(
                        chongSpeed,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        jinjingMeta.addAttributeModifier(Attribute.MOVEMENT_SPEED,
                new AttributeModifier(
                        chongSpeed,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        canlanMeta.addAttributeModifier(Attribute.MOVEMENT_SPEED,
                new AttributeModifier(
                        chongSpeed,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        mingyueMeta.addAttributeModifier(Attribute.MOVEMENT_SPEED,
                new AttributeModifier(
                        chongSpeed,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        xiaotianMeta.addAttributeModifier(Attribute.MOVEMENT_SPEED,
                new AttributeModifier(
                        chongSpeed,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        heitiechongMeta.addAttributeModifier(Attribute.JUMP_STRENGTH,
                new AttributeModifier(
                        chongJump,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                ));

        huangtongchongMeta.addAttributeModifier(Attribute.JUMP_STRENGTH,
                new AttributeModifier(
                        chongJump,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        jinjingMeta.addAttributeModifier(Attribute.JUMP_STRENGTH,
                new AttributeModifier(
                        chongJump,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        canlanMeta.addAttributeModifier(Attribute.JUMP_STRENGTH,
                new AttributeModifier(
                        chongJump,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        mingyueMeta.addAttributeModifier(Attribute.JUMP_STRENGTH,
                new AttributeModifier(
                        chongJump,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );

        xiaotianMeta.addAttributeModifier(Attribute.JUMP_STRENGTH,
                new AttributeModifier(
                        chongJump,
                        -99,
                        AttributeModifier.Operation.MULTIPLY_SCALAR_1,
                        EquipmentSlotGroup.HAND
                )
        );


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


        // 战士，暗器


// 弓箭手，火铳


// 炼丹师，灵乐


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
                                Component.text("§7§o精钢打造的投掷飞刃"),
                                Component.text("§7§o轻巧锋利易于携带"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("feiRen", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§f[飞刃] §f锁定冷却: §b2s"),
                                Component.text("§f向前方掷出一发飞刃，至多飞行§b8§f格(不可穿墙)"),
                                Component.text("§f并对沿途中所有的目标造成§b[50%近战伤害]§f点物理伤害"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o军中精锐的制式飞刃"),
                                Component.text("§7§o可快速连续投掷"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("jinRuiFeiRen", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§a[飞刃] §f锁定冷却: §b2s"),
                                Component.text("§f向前方掷出一发飞刃，至多飞行§b16§f格(不可穿墙)"),
                                Component.text("§f并对沿途中所有的目标造成§b[50%近战伤害]§f点物理伤害"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o隐藏于袖中的暗器"),
                                Component.text("§7§o无声无息取人性命"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("wuShengXiuJian", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§9[袖箭] §f锁定冷却: §b2s"),
                                Component.text("§f向前方射出一支毒箭，至多飞行§b20§f格(不可穿墙)"),
                                Component.text("§f并对沿途中所有的目标造成§b[50%近战伤害]§f点物理伤害"),
                                Component.text("§f同时会令怪物中毒§b2s§f，可以叠加中毒效果"),
                                Component.text("§f中毒每秒对怪物造成§b[20%近战伤害]§f点法术伤害"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o经特殊淬火的回旋镖"),
                                Component.text("§7§o可追踪敌人轨迹"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("huiXuanTaiJi", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§d[回旋] §f锁定冷却: §b2s"),
                                Component.text("§f向前方掷出本武器，至多飞行§b20§f格(不可穿墙)"),
                                Component.text("§f并对沿途中所有的目标造成§b[50%近战伤害]§f点物理伤害"),
                                Component.text("§f抵达终点时，将会向玩家此时的位置飞行，至多§b40§f格"),
                                Component.text("§f第二段飞行将对沿途中所有的目标造成§b[100%近战伤害]§f点物理伤害"),
                                Component.text("§f并能定身怪物§b1s§f，定身时间不可叠加，每次施加刷新时间"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o刃锋如鬼魅般难以捕捉"),
                                Component.text("§7§o让敌人无处可逃"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("wuYinWuZong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·右键]§e[无影] §f锁定冷却: §b2s"),
                                Component.text("§f向前方掷出本武器，至多飞行§b25§f格(不可穿墙)"),
                                Component.text("§f并对沿途中所有的目标造成§b[50%近战伤害]§f点物理伤害"),
                                Component.text("§f抵达终点时，将会停留并不断旋转割裂周围§b2§f格的怪物至多§b10s"),
                                Component.text("§f若再次释放本技能将会使仍在旋转的本武器立刻消失"),
                                Component.text("§f割裂效果每秒施加一次，造成§b[100%近战伤害]§f点物理伤害"),
                                Component.text("§f同时割裂效果会让怪物重伤§b1s§f，降低§b50§f点生机"),
                                Component.text("§f并能击碎怪物的防御力持续§b1s§f，降低§b10§f点护甲"),
                                Component.text("§f重伤效果不可叠加，重复施加刷新持续时间，碎甲效果可叠加"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o染着血色的催命符咒"),
                                Component.text("§7§o夺人性命于无形"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("yanWangTie", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o粗糙的火铳"),
                                Component.text("§7§o射程有限但威力不俗"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("heiTieChong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲右键]§f[装填] §f锁定冷却: §b30s"),
                                Component.text("§f为黑铁铳装填一枚法力弹，至多存储§b3§f枚"),
                                Component.text("§f装填需要持续§b4s§f，期间若切换其它物品将中断装填"),
                                Component.text("§6[主动技·右键]§f[重弹] §f冷却: §b无"),
                                Component.text("§f向前方至多§b16§f格距离发射，无法穿墙，将在终点或者命中目标处爆炸"),
                                Component.text("§f对周围§b3§f格怪物造成§b[2500%箭矢强度]§f点物理伤害"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o经过改良的火铳"),
                                Component.text("§7§o提升了射击精度"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("huangTongChong", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲右键]§a[装填] §f锁定冷却: §b30s"),
                                Component.text("§f为黑铁铳装填一枚法力弹，至多存储§b3§f枚"),
                                Component.text("§f装填需要持续§b4s§f，期间若切换其它物品将中断装填"),
                                Component.text("§6[主动技·右键]§a[烈弹] §f冷却: §b无"),
                                Component.text("§f向前方至多§b20§f格距离发射，无法穿墙，将在终点或者命中目标处爆炸"),
                                Component.text("§f对周围§b3§f格怪物造成§b[3000%箭矢强度]§f点物理伤害"),
                                Component.text("§f并造成§b15%§f减速，持续§b5s"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o铳声清亮如明月"),
                                Component.text("§7§o弹无虚发"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("mingYue", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲右键]§9[装填] §f锁定冷却: §b30s"),
                                Component.text("§f为黑铁铳装填一枚法力弹，至多存储§b3§f枚"),
                                Component.text("§f装填需要持续§b4s§f，期间若切换其它物品将中断装填"),
                                Component.text("§6[主动技·右键]§9[明月] §f冷却: §b无"),
                                Component.text("§f向前方至多§b24§f格距离发射，无法穿墙，将在终点或者命中目标处爆炸"),
                                Component.text("§f对周围§b3§f格怪物造成§b[3500%箭矢强度]§f点物理伤害"),
                                Component.text("§f若是在夜晚，则额外在命中地点召唤一道月光"),
                                Component.text("§f对§b[2*40*2]§f的怪物造成§b[1500%箭矢强度]§f点法术伤害"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o闪耀着灿烂光辉的神铳"),
                                Component.text("§7§o每一发都带着致命光芒"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("canLan", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲右键]§d[装填] §f锁定冷却: §b30s"),
                                Component.text("§f为黑铁铳装填一枚法力弹，至多存储§b3§f枚"),
                                Component.text("§f装填需要持续§b4s§f，期间若切换其它物品将中断装填"),
                                Component.text("§6[主动技·右键]§d[灿烂] §f冷却: §b无"),
                                Component.text("§f向前方至多§b28§f格距离发射，无法穿墙，将在终点或者命中目标处爆炸"),
                                Component.text("§f对周围§b3§f格怪物造成§b[4000%箭矢强度]§f点物理伤害"),
                                Component.text("§f并在落点留下一团§b[3*3*3]§f持续§b3s§f的火焰"),
                                Component.text("§f每秒对接触的怪物造成§b[600%箭矢强度]§f点法术伤害"),
                                Component.text("§f并减少他们§b10§f点法抗，持续§b1.5s"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o纯净如明镜的宝铳"),
                                Component.text("§7§o弹道笔直必中目标"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("jinJing", 4),
                                ComponentSet.MIDDLEJINENG,
                                Component.text("§6[主动技·下蹲右键]§e[装填] §f锁定冷却: §b30s"),
                                Component.text("§f为黑铁铳装填一枚法力弹，至多存储§b3§f枚"),
                                Component.text("§f装填需要持续§b4s§f，期间若切换其它物品将中断装填"),
                                Component.text("§6[主动技·右键]§e[净镜] §f冷却: §b无"),
                                Component.text("§f向前方至多§b32§f格距离发射，无法穿墙，将在终点或者命中目标处爆炸"),
                                Component.text("§f对周围§b3§f格怪物造成§b[4500%箭矢强度]§f点物理伤害"),
                                Component.text("§f并对所有被攻击到的敌人附加§6[净镜]§f印记，持续§b10s"),
                                Component.text("§f再次附加§6[净镜]§f将刷新持续时间，印记不会被不同玩家共享"),
                                Component.text("§6[主动技·按键1(不手持本装备也可以释放)]§e[破镜] §f冷却: §b2s"),
                                Component.text("§f破灭距离自己不超过§b32§f格的怪物的§6[净镜]§f印记"),
                                Component.text("§f对其造成§b[1500%箭矢强度+5%已损生命值(至多1000点)]§f点法术伤害"),
                                Component.text("§f同时减少其§b20§f点护甲持续§b3s§f，若触发时怪物生命低于最大生命§b50%§f则翻倍碎甲值"),
                                Component.text("§f若击杀该怪物，则增加自己§b25%§f箭矢强度，持续§b5s"),
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o一声啸响便可震慑群敌"),
                                Component.text("§7§o蕴含神龙之力的神铳"),
                                ComponentSet.MIDDLESHUXIN,
                                AttributeSet.fromId("xiaoTian", 4),
                                ComponentSet.MIDDLEJINENG,
                                ComponentSet.MIDDLEXIANGQIAN,
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
                                Component.text("§7§o普通的竹制横笛"),
                                Component.text("§7§o音色清雅动人"),
                                ComponentSet.LONGSHUXIN,
                                AttributeSet.fromId("xiao", 6),
                                ComponentSet.LONGJINENG,
                                Component.text("§6[被动技]§f[谱曲] §f冷却: §b无"),
                                Component.text("§f随着你炼化元素释放阵法，箫将收集阵法的灵气谱写不同的曲子，并积攒音符"),
                                Component.text("§f炼化普通元素积攒§b1§f音符，精炼元素积攒§b3§f音符，浓缩元素积攒§b9§f音符，至多拥有§b15§f音符"),
                                Component.text("§6[主动技·右键]§f[奏乐] §f锁定冷却: §b30s"),
                                Component.text("§f若前三次释放的阵法元素满足谱曲要求，则消耗所有音符奏乐"),
                                Component.text("§b[金金金]§6[噬魂征音]§f对前方至多§b16§f格的所瞄准的单个怪物释放"),
                                Component.text("§f造成§b[200%阵法强度*音符数]§f点伤害，若本次攻击击杀怪物，则吞噬怪物的魂魄"),
                                Component.text("§f恢复自己§b40+10%§f最大生命，并提高§b20%§f阵法强度，持续§b5s"),
                                Component.text("§b[金金火]§6[焚影裂曲]§f在上一次对自己造成伤害的怪物处释放，若怪物死亡则无法释放"),
                                Component.text("§f对周围§b3§f格怪物造成§b[100%阵法强度*音符数]§f点伤害，并施加易伤效果"),
                                Component.text("§f易伤效果会提高怪物受到的任何伤害§b20%§f，持续§b5s§f，重复施加刷新持续时间"),
                                Component.text("§b[金金土]§6[金戈反响]§f获取金戈灵甲，持续§b10s§f，在此期间若受到物理伤害"),
                                Component.text("§f则对攻击者造成§b[30%阵法强度*释放时音符数]§f点伤害，并减免§b[1%*释放时音符数]§f伤害"),
                                Component.text("§b[木水土]§6[傀影灵歌]§f在原地召唤一个持续§b20s§f的傀儡"),
                                Component.text("§f傀儡不会移动与攻击，护甲与格挡与玩家相同，生命为§b[2%玩家最大生命*音符数+100]§f"),
                                Component.text("§f当释放者受到物理伤害时，若距离§b16§f格内存在傀儡则将本次伤害转移至傀儡，无论傀儡剩余多少血量"),
                                Component.text("§f均能帮玩家完全转移伤害，即使傀儡仅剩一滴血也能完全帮玩家抵消一次伤害！"),
                                ComponentSet.LONGXIANGQIAN,
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
                                Component.text("§7§o吹奏出清风拂面之感"),
                                Component.text("§7§o音符缭绕不绝"),
                                ComponentSet.LONGSHUXIN,
                                AttributeSet.fromId("qinFengYinYin", 6),
                                ComponentSet.LONGJINENG,
                                Component.text("§6[被动技]§a[谱曲] §f冷却: §b无"),
                                Component.text("§f随着你炼化元素释放阵法，箫将收集阵法的灵气谱写不同的曲子，并积攒音符"),
                                Component.text("§f炼化普通元素积攒§b1§f音符，精炼元素积攒§b3§f音符，浓缩元素积攒§b9§f音符，至多拥有§b15§f音符"),
                                Component.text("§6[主动技·右键]§a[奏乐] §f锁定冷却: §b30s"),
                                Component.text("§f若前三次释放的阵法元素满足谱曲要求，则消耗所有音符奏乐"),
                                Component.text("§b[金金金]§6[噬魂征音]§f对前方至多§b16§f格的所瞄准的单个怪物释放"),
                                Component.text("§f造成§b[200%阵法强度*音符数]§f点伤害，若本次攻击击杀怪物，则吞噬怪物的魂魄"),
                                Component.text("§f恢复自己§b40+10%§f最大生命，并提高§b20%§f阵法强度，持续§b5s"),
                                Component.text("§b[金金火]§6[焚影裂曲]§f在上一次对自己造成伤害的怪物处释放，若怪物死亡则无法释放"),
                                Component.text("§f对周围§b3§f格怪物造成§b[100%阵法强度*音符数]§f点伤害，并施加易伤效果"),
                                Component.text("§f易伤效果会提高怪物受到的任何伤害§b20%§f，持续§b5s§f，重复施加刷新持续时间"),
                                Component.text("§b[金金土]§6[金戈反响]§f获取金戈灵甲，持续§b10s§f，在此期间若受到物理伤害"),
                                Component.text("§f则对攻击者造成§b[30%阵法强度*释放时音符数]§f点伤害，并减免§b[1%*释放时音符数]§f伤害"),
                                Component.text("§b[木水土]§6[傀影灵歌]§f在原地召唤一个持续§b20s§f的傀儡"),
                                Component.text("§f傀儡不会移动与攻击，护甲与格挡与玩家相同，生命为§b[2%玩家最大生命*音符数+100]§f"),
                                Component.text("§f当释放者受到物理伤害时，若距离§b16§f格内存在傀儡则将本次伤害转移至傀儡，无论傀儡剩余多少血量"),
                                Component.text("§f均能帮玩家完全转移伤害，即使傀儡仅剩一滴血也能完全帮玩家抵消一次伤害！"),
                                Component.text("§b[火金土]§6[炎狱颂曲]§f在自身周围召唤岩浆喷发，留下一块§b4*1*4§f的熔岩池，持续§b5s"),
                                Component.text("§f每秒对处于其中的怪物造成§b[20%阵法强度*释放时音符数]§f点伤害，并叠加一层§6[炎狱]"),
                                Component.text("§6[炎狱]§f每个熔岩池独立，每一层可以提高熔岩池造成的伤害§b20%"),
                                ComponentSet.LONGXIANGQIAN,
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
                                Component.text("§7§o笛声如溪水般清澈"),
                                Component.text("§7§o听者神清气爽"),
                                ComponentSet.LONGSHUXIN,
                                AttributeSet.fromId("liuShuiChanChan", 6),
                                ComponentSet.LONGJINENG,
                                Component.text("§6[被动技]§9[谱曲] §f冷却: §b无"),
                                Component.text("§f随着你炼化元素释放阵法，箫将收集阵法的灵气谱写不同的曲子，并积攒音符"),
                                Component.text("§f炼化普通元素积攒§b1§f音符，精炼元素积攒§b3§f音符，浓缩元素积攒§b9§f音符，至多拥有§b15§f音符"),
                                Component.text("§6[主动技·右键]§9[奏乐] §f锁定冷却: §b30s"),
                                Component.text("§f若前三次释放的阵法元素满足谱曲要求，则消耗所有音符奏乐"),
                                Component.text("§b[金金金]§6[噬魂征音]§f对前方至多§b16§f格的所瞄准的单个怪物释放"),
                                Component.text("§f造成§b[200%阵法强度*音符数]§f点伤害，若本次攻击击杀怪物，则吞噬怪物的魂魄"),
                                Component.text("§f恢复自己§b40+10%§f最大生命，并提高§b20%§f阵法强度，持续§b5s"),
                                Component.text("§b[金金火]§6[焚影裂曲]§f在上一次对自己造成伤害的怪物处释放，若怪物死亡则无法释放"),
                                Component.text("§f对周围§b3§f格怪物造成§b[100%阵法强度*音符数]§f点伤害，并施加易伤效果"),
                                Component.text("§f易伤效果会提高怪物受到的任何伤害§b20%§f，持续§b5s§f，重复施加刷新持续时间"),
                                Component.text("§b[金金土]§6[金戈反响]§f获取金戈灵甲，持续§b10s§f，在此期间若受到物理伤害"),
                                Component.text("§f则对攻击者造成§b[30%阵法强度*释放时音符数]§f点伤害，并减免§b[1%*释放时音符数]§f伤害"),
                                Component.text("§b[木水土]§6[傀影灵歌]§f在原地召唤一个持续§b20s§f的傀儡"),
                                Component.text("§f傀儡不会移动与攻击，护甲与格挡与玩家相同，生命为§b[2%玩家最大生命*音符数+100]§f"),
                                Component.text("§f当释放者受到物理伤害时，若距离§b16§f格内存在傀儡则将本次伤害转移至傀儡，无论傀儡剩余多少血量"),
                                Component.text("§f均能帮玩家完全转移伤害，即使傀儡仅剩一滴血也能完全帮玩家抵消一次伤害！"),
                                Component.text("§b[火金土]§6[炎狱颂曲]§f在自身周围召唤岩浆喷发，留下一块§b4*1*4§f的熔岩池，持续§b5s"),
                                Component.text("§f每秒对处于其中的怪物造成§b[20%阵法强度*释放时音符数]§f点伤害，并叠加一层§6[炎狱]"),
                                Component.text("§6[炎狱]§f每个熔岩池独立，每一层可以提高熔岩池造成的伤害§b20%"),
                                Component.text("§b[金金木]§6[灵丝夺魂诀]§f对前方至多§b8§f格的所瞄准的单个怪物建立一条持续§b10s的灵魂之链"),
                                Component.text("§f当灵魂之链存在时，每秒造成§b[20%阵法强度*音符数]§f点伤害，并恢复自己§b8+2%§f最大生命"),
                                Component.text("§f灵魂之链会在持续时间结束或者链接双方距离超过§b16§f格时断开"),
                                ComponentSet.LONGXIANGQIAN,
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
                                Component.text("§7§o曲调似春雨般绵密"),
                                Component.text("§7§o抚慰着伤痛之人"),
                                ComponentSet.LONGSHUXIN,
                                AttributeSet.fromId("buQiChunYu", 6),
                                ComponentSet.LONGJINENG,
                                Component.text("§6[被动技]§d[谱曲] §f冷却: §b无"),
                                Component.text("§f随着你炼化元素释放阵法，箫将收集阵法的灵气谱写不同的曲子，并积攒音符"),
                                Component.text("§f炼化普通元素积攒§b1§f音符，精炼元素积攒§b3§f音符，浓缩元素积攒§b9§f音符，至多拥有§b15§f音符"),
                                Component.text("§6[主动技·右键]§d[奏乐] §f锁定冷却: §b30s"),
                                Component.text("§f若前三次释放的阵法元素满足谱曲要求，则消耗所有音符奏乐"),
                                Component.text("§b[金金金]§6[噬魂征音]§f对前方至多§b16§f格的所瞄准的单个怪物释放"),
                                Component.text("§f造成§b[200%阵法强度*音符数]§f点伤害，若本次攻击击杀怪物，则吞噬怪物的魂魄"),
                                Component.text("§f恢复自己§b40+10%§f最大生命，并提高§b20%§f阵法强度，持续§b5s"),
                                Component.text("§b[金金火]§6[焚影裂曲]§f在上一次对自己造成伤害的怪物处释放，若怪物死亡则无法释放"),
                                Component.text("§f对周围§b3§f格怪物造成§b[100%阵法强度*音符数]§f点伤害，并施加易伤效果"),
                                Component.text("§f易伤效果会提高怪物受到的任何伤害§b20%§f，持续§b5s§f，重复施加刷新持续时间"),
                                Component.text("§b[金金土]§6[金戈反响]§f获取金戈灵甲，持续§b10s§f，在此期间若受到物理伤害"),
                                Component.text("§f则对攻击者造成§b[30%阵法强度*释放时音符数]§f点伤害，并减免§b[1%*释放时音符数]§f伤害"),
                                Component.text("§b[木水土]§6[傀影灵歌]§f在原地召唤一个持续§b20s§f的傀儡"),
                                Component.text("§f傀儡不会移动与攻击，护甲与格挡与玩家相同，生命为§b[2%玩家最大生命*音符数+100]§f"),
                                Component.text("§f当释放者受到物理伤害时，若距离§b16§f格内存在傀儡则将本次伤害转移至傀儡，无论傀儡剩余多少血量"),
                                Component.text("§f均能帮玩家完全转移伤害，即使傀儡仅剩一滴血也能完全帮玩家抵消一次伤害！"),
                                Component.text("§b[火金土]§6[炎狱颂曲]§f在自身周围召唤岩浆喷发，留下一块§b4*1*4§f的熔岩池，持续§b5s"),
                                Component.text("§f每秒对处于其中的怪物造成§b[20%阵法强度*释放时音符数]§f点伤害，并叠加一层§6[炎狱]"),
                                Component.text("§6[炎狱]§f每个熔岩池独立，每一层可以提高熔岩池造成的伤害§b20%"),
                                Component.text("§b[金金木]§6[灵丝夺魂诀]§f对前方至多§b8§f格的所瞄准的单个怪物建立一条持续§b10s的灵魂之链"),
                                Component.text("§f当灵魂之链存在时，每秒造成§b[20%阵法强度*音符数]§f点伤害，并恢复自己§b8+2%§f最大生命"),
                                Component.text("§f灵魂之链会在持续时间结束或者链接双方距离超过§b16§f格时断开"),
                                Component.text("§b[金金水]§6[凝露若水吟]§f进入§6[若水]状态持续§b3s§f，在这期间每§b0.3s§f向前方射出不可穿墙的水珠"),
                                Component.text("§f水珠至多飞行§b8§f格，对沿途的所有怪物造成§b[20%阵法强度*音符数]§f点伤害"),
                                ComponentSet.LONGXIANGQIAN,
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
                                Component.text("§7§o三生石上的镇魂曲"),
                                Component.text("§7§o可平息一切躁动"),
                                ComponentSet.LONGSHUXIN,
                                AttributeSet.fromId("sanShengZhenHun", 6),
                                ComponentSet.LONGJINENG,
                                Component.text("§6[被动技]§e[谱曲] §f冷却: §b无"),
                                Component.text("§f随着你炼化元素释放阵法，箫将收集阵法的灵气谱写不同的曲子，并积攒音符"),
                                Component.text("§f炼化普通元素积攒§b1§f音符，精炼元素积攒§b3§f音符，浓缩元素积攒§b9§f音符，至多拥有§b15§f音符"),
                                Component.text("§6[主动技·右键]§e[奏乐] §f锁定冷却: §b30s"),
                                Component.text("§f若前三次释放的阵法元素满足谱曲要求，则消耗所有音符奏乐"),
                                Component.text("§b[金金金]§6[噬魂征音]§f对前方至多§b16§f格的所瞄准的单个怪物释放"),
                                Component.text("§f造成§b[200%阵法强度*音符数]§f点伤害，若本次攻击击杀怪物，则吞噬怪物的魂魄"),
                                Component.text("§f恢复自己§b40+10%§f最大生命，并提高§b20%§f阵法强度，持续§b5s"),
                                Component.text("§b[金金火]§6[焚影裂曲]§f在上一次对自己造成伤害的怪物处释放，若怪物死亡则无法释放"),
                                Component.text("§f对周围§b3§f格怪物造成§b[100%阵法强度*音符数]§f点伤害，并施加易伤效果"),
                                Component.text("§f易伤效果会提高怪物受到的任何伤害§b20%§f，持续§b5s§f，重复施加刷新持续时间"),
                                Component.text("§b[金金土]§6[金戈反响]§f获取金戈灵甲，持续§b10s§f，在此期间若受到物理伤害"),
                                Component.text("§f则对攻击者造成§b[30%阵法强度*释放时音符数]§f点伤害，并减免§b[1%*释放时音符数]§f伤害"),
                                Component.text("§b[木水土]§6[傀影灵歌]§f在原地召唤一个持续§b20s§f的傀儡"),
                                Component.text("§f傀儡不会移动与攻击，护甲与格挡与玩家相同，生命为§b[2%玩家最大生命*音符数+100]§f"),
                                Component.text("§f当释放者受到物理伤害时，若距离§b16§f格内存在傀儡则将本次伤害转移至傀儡，无论傀儡剩余多少血量"),
                                Component.text("§f均能帮玩家完全转移伤害，即使傀儡仅剩一滴血也能完全帮玩家抵消一次伤害！"),
                                Component.text("§b[火金土]§6[炎狱颂曲]§f在自身周围召唤岩浆喷发，留下一块§b4*1*4§f的熔岩池，持续§b5s"),
                                Component.text("§f每秒对处于其中的怪物造成§b[20%阵法强度*释放时音符数]§f点伤害，并叠加一层§6[炎狱]"),
                                Component.text("§6[炎狱]§f每个熔岩池独立，每一层可以提高熔岩池造成的伤害§b20%"),
                                Component.text("§b[金金木]§6[灵丝夺魂诀]§f对前方至多§b8§f格的所瞄准的单个怪物建立一条持续§b10s§f的灵魂之链"),
                                Component.text("§f当灵魂之链存在时，每秒造成§b[20%阵法强度*音符数]§f点伤害，并恢复自己§b8+2%§f最大生命"),
                                Component.text("§f灵魂之链会在持续时间结束或者链接双方距离超过§b16§f格时断开"),
                                Component.text("§b[金金水]§6[凝露若水吟]§f进入§6[若水]§f状态持续§b3s§f，在这期间每§b0.3s§f向前方射出不可穿墙的水珠"),
                                Component.text("§f水珠至多飞行§b8§f格，对沿途的所有怪物造成§b[20%阵法强度*音符数]§f点伤害"),
                                Component.text("§b[金木火]§6[烬火灭世律]§f在自身周围燃起熊熊大火，对周围§b8§f格的怪物造成§b[50%阵法强度*音符数]§f点伤害"),
                                Component.text("§f同时令他们进入§6[灰烬]§f状态持续§b5s§f，期间受到物理伤害时，会额外造成§b[10%释放时阵法强度*音符数]§f点伤害"),
                                Component.text("§f并额外减少§b30§f点生机，持续§b1s§f，此效果每§b1s§f至多触发一次"),
                                ComponentSet.LONGXIANGQIAN,
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
                                Component.text("§7§o九只凤凰齐鸣的神曲"),
                                Component.text("§7§o听者心旷神怡"),
                                ComponentSet.LONGSHUXIN,
                                AttributeSet.fromId("jiuFengLaiYi", 6),
                                ComponentSet.LONGJINENG,
                                ComponentSet.LONGXIANGQIAN,
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

        JIUFENGLAIYI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6006"));
        SANSHENGZHENHUN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6005"));
        BUQICHUNYU.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6004"));
        LIUSHUICHANCHAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6003"));
        QINFENGYINYIN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6002"));
        XIAO.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/6001"));
        XIAOTIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5006"));
        JINJING.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5005"));
        CANLAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5004"));
        MINGYUE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5003"));
        HUANGTONGCHONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5002"));
        HEITIECHONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/5001"));
        YANWANGTIE.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4006"));
        WUYINWUZONG.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4005"));
        HUIXUANTAJI.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4004"));
        WUSHENGXIUJIAN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4003"));
        JINRUIFEIREN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4002"));
        FEIREN.setData(DataComponentTypes.ITEM_MODEL, new NamespacedKey("yuehua", "prismarine_shard/4001"));
    }

    public static void putId() {
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
