package com.xiaoxiaoowo.yuehua.guis;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.guis.bank.MoneyBank;
import com.xiaoxiaoowo.yuehua.items.PINZHENG;
import com.xiaoxiaoowo.yuehua.items.dz.FuLing;
import com.xiaoxiaoowo.yuehua.items.dz.YuShi;
import com.xiaoxiaoowo.yuehua.items.other.Money;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.PlaySound;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import io.papermc.paper.persistence.PersistentDataContainerView;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Objects;

public final class Task {
    //子丑寅卯辰巳午未申酉戌亥 悬赏等阶
    public static final Inventory MAIN_TASK = Bukkit.createInventory(null, 9, Component.text("主线任务").color(NamedTextColor.AQUA));
    public static final Inventory XUAN_SHANG = Bukkit.createInventory(null, 9, Component.text("悬赏任务").color(NamedTextColor.AQUA));
    public static final Inventory XUAN_SHANG_JIEQU = Bukkit.createInventory(null, 9, Component.text("悬赏任务提取").color(NamedTextColor.AQUA));

    public static final ItemStack yeminzhu = PINZHENG.yemingzhu.clone();
    public static final ItemStack jinshuangshi1 = YuShi.JIN_HUANG_SHI1.clone();
    public static final ItemStack zhusha = FuLing.zhusha.clone();
    public static final ItemStack jinyuanbao = Money.yinPiao.clone();
    public static final ItemStack yinpiao = Money.zuanShi.clone();


    static {
        ItemStack mainCheck = new ItemStack(Material.YELLOW_DYE);
        mainCheck.setCustomModelData(12);
        ItemMeta mainCheckItemMeta = mainCheck.getItemMeta();
        mainCheckItemMeta.displayName(Component.text("查询主线任务与完成度").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        mainCheck.setItemMeta(mainCheckItemMeta);
        MAIN_TASK.setItem(0, mainCheck);

        ItemStack mainTijiao = new ItemStack(Material.YELLOW_DYE);
        mainTijiao.setCustomModelData(12);
        ItemMeta mainTijiaoItemMeta = mainTijiao.getItemMeta();
        mainTijiaoItemMeta.displayName(Component.text("提交主线任务").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        mainTijiao.setItemMeta(mainTijiaoItemMeta);
        MAIN_TASK.setItem(1, mainTijiao);

        ItemStack xuanshangcheck = new ItemStack(Material.YELLOW_DYE);
        xuanshangcheck.setCustomModelData(12);
        ItemMeta xuanshangcheckItemMeta = xuanshangcheck.getItemMeta();
        xuanshangcheckItemMeta.displayName(Component.text("查询悬赏任务与完成度").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshangcheck.setItemMeta(xuanshangcheckItemMeta);
        XUAN_SHANG.setItem(0, xuanshangcheck);

        ItemStack xuanshangTijiao = new ItemStack(Material.YELLOW_DYE);
        xuanshangTijiao.setCustomModelData(12);
        ItemMeta xuanshangTijiaoItemMeta = xuanshangTijiao.getItemMeta();
        xuanshangTijiaoItemMeta.displayName(Component.text("提交悬赏任务").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshangTijiao.setItemMeta(xuanshangTijiaoItemMeta);
        XUAN_SHANG.setItem(1, xuanshangTijiao);

        ItemStack xuanshanglevelCheck = new ItemStack(Material.YELLOW_DYE);
        xuanshanglevelCheck.setCustomModelData(12);
        ItemMeta xuanshanglevelCheckItemMeta = xuanshanglevelCheck.getItemMeta();
        xuanshanglevelCheckItemMeta.displayName(Component.text("查询悬赏任务冷却").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshanglevelCheck.setItemMeta(xuanshanglevelCheckItemMeta);
        XUAN_SHANG.setItem(2, xuanshanglevelCheck);

        ItemStack xuanshanglevelRealCheck = new ItemStack(Material.YELLOW_DYE);
        xuanshanglevelRealCheck.setCustomModelData(12);
        ItemMeta xuanshanglevelRealCheckItemMeta = xuanshanglevelRealCheck.getItemMeta();
        xuanshanglevelRealCheckItemMeta.displayName(Component.text("查看悬赏等级").color(NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false).decoration(TextDecoration.BOLD, true));
        xuanshanglevelRealCheck.setItemMeta(xuanshanglevelRealCheckItemMeta);
        XUAN_SHANG.setItem(3, xuanshanglevelRealCheck);


        MAIN_TASK.setItem(8, Yh.BACK_BEFORE);
        XUAN_SHANG.setItem(8, Yh.BACK_BEFORE);
    }

    public static void checkMain(Player player) {
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        int mainTask = pdc.get(DataContainer.mainTask, PersistentDataType.INTEGER);
        switch (mainTask) {
            case 0 ->
                    SendInformation.sendMes(player, Component.text(String.format("§6[主线任务]§a欢迎来到月华——盘灵古域，§b%s", player.getName())).appendNewline().append(Component.text("§6[主线任务]§a主线任务将带领你了解最基本的NPC，并提供丰厚奖励，首先让我们按下设置中指定的按键打开菜单，然后进入主线任务，选择提交，即可完成这第一份任务")).appendNewline().append(Component.text("§6[主线任务]§a奖励：§b160§a点经验")));

            case 1 -> {
                Data data = Yuehua.playerData.get(player.getUniqueId());

                SendInformation.sendMes(player, Component.text("§6[主线任务]§a相信你已经发现，在游戏前期，等级的成长会带来相当大的属性增幅，在遇到强大的敌人时，如果装备暂时无法得到提升，提升等级是很不错的选择。").appendNewline().append(Component.text("§6[主线任务]§a现在，让我们去东方龙鳞之森的入口处击杀一些最弱的怪物来练习一下，在击杀10个僵尸，10个骷髅，10个蜘蛛后，在菜单中提交，即可完成这第二份任务")).appendNewline().append(Component.text("§6[主线任务]§a奖励：§b320§a点经验 §b夜明珠*1")).appendNewline().append(Component.text(String.format("§6[主线任务]§a僵尸§b%d/10  §a骷髅§b%d/10  §a蜘蛛§b%d/10", data.killEastZombieCount, data.killEastSkeletonConut, data.killEastSpiderCount))));

            }

            case 2 ->
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§a在遇到更强大的怪物时，提高生存能力的秘诀是使用丹药与食用高饱和食物，丹药和食物带来的回血都与你的最大生命有关，解毒丹在面对中毒时也至关重要").appendNewline().append(Component.text("§6[主线任务]§a现在，让我们去皇城东门附近的炼丹房购买一颗最基本的一般金创药，然后再去皇城南门附近购买一份牛排，确保你的背包内有牛排与一般金创药，在菜单中提交，即可完成这第三份任务")).appendNewline().append(Component.text("§6[主线任务]§a奖励：§b640§a点经验 §b金黄石☯一阶*1 朱砂*9")));

            case 3 ->
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§a附灵与镶嵌是让你的装备更加强大的不二法门，你可以在皇城南门附近找到朱砂室中的附灵台与附灵师太一，可以在皇城北门附近找到灵玉亭中的瑶池金母与镶嵌台").appendNewline().append(Component.text("§6[主线任务]§a在上次任务中，你已经获得了可以镶嵌于护甲的金黄石☯一阶，同时获得了可以刻画附灵符的朱砂，在皇宫的东边附近可以找到初级刻画师，他可以帮你用朱砂刻画附灵符，将玉石镶嵌于你的头盔，并给武器附灵，在菜单中提交，即可完成这第四份任务")).appendNewline().append(Component.text("§6[主线任务]§a奖励：§b1280§a点经验 §b金元宝*2")));

            case 4 ->
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§a这个世界还有很多东西须待你自由探索，值得一提的是皇城铁匠铺附近的茶馆时不时就会多一些新的旅客，他们往往掌握着重要的情报，尝试获取他们的情报或许能为你解决大麻烦，如果你不知道一个材料的获取方式，或许可以根据材料的名称去找找刻板印象之外的地方，例如湖底，可能遇见新的怪物").appendNewline().append(Component.text("§6[主线任务]§a当你的护甲达到60，进攻属性达到35，最大生命达到210后，在菜单中提交，即可完成这第五份任务")).appendNewline().append(Component.text("§6[主线任务]§a奖励：§b2560§a点经验 §b银票*2")));

            case 5 -> SendInformation.sendMes(player, Component.text("§6[主线任务]§a暂时没有新的主线任务了"));
        }
    }

    public static void tijiaoMain(Player player) {
        PersistentDataContainer pdc = player.getPersistentDataContainer();
        int mainTask = pdc.get(DataContainer.mainTask, PersistentDataType.INTEGER);
        switch (mainTask) {
            case 4 -> {
                PlayerInventory playerInventory = player.getInventory();
                if (MoneyBank.countEmptySlots(playerInventory) < 1) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的背包空余空间不足!"));
                    return;
                }
                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data.hujia < 0.6) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的护甲没有满足要求！"));
                    return;
                }
                if (player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() < 210) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的最大生命没有满足要求！"));
                    return;
                }
                double jingong = switch (data.job) {
                    case 1 -> data.attack / 3.0;
                    case 2 -> {
                        GongData gongData = (GongData) data;
                        yield gongData.arrow;
                    }
                    case 3 -> {
                        DanData danData = (DanData) data;
                        yield danData.zhenfa;
                    }
                    default -> 0;
                };
                if (jingong < 35) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的进攻属性没有满足要求！"));
                    return;
                }
                PlaySound.pickupOrb(player);
                player.giveExp(2560);
                yinpiao.setAmount(2);
                playerInventory.addItem(yinpiao);
                pdc.set(DataContainer.mainTask, PersistentDataType.INTEGER, 5);
                SendInformation.sendMes(player, Component.text("§6[主线任务]§a完成主线任务§b5§a!"));
                checkMain(player);
            }

            case 3 -> {
                PlayerInventory playerInventory = player.getInventory();
                if (MoneyBank.countEmptySlots(playerInventory) < 1) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的背包空余空间不足!"));
                    return;
                }
                boolean hasInsert = false;
                boolean hasEnchant = false;
                ItemStack toukui = playerInventory.getHelmet();
                if (toukui != null) {
                    if (!Objects.equals(toukui.getPersistentDataContainer().get(DataContainer.insertid, PersistentDataType.STRING), "null")) {
                        hasInsert = true;
                    }
                }
                ItemStack weapon = playerInventory.getItem(0);
                if (weapon != null) {
                    if (!Objects.equals("null", weapon.getPersistentDataContainer().get(DataContainer.enchantid, PersistentDataType.STRING))) {
                        hasEnchant = true;
                    }
                }
                if (hasInsert && hasEnchant) {
                    PlaySound.pickupOrb(player);
                    player.giveExp(1280);
                    jinyuanbao.setAmount(2);
                    playerInventory.addItem(jinyuanbao);
                    pdc.set(DataContainer.mainTask, PersistentDataType.INTEGER, 4);
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§a完成主线任务§b4§a!"));
                    checkMain(player);
                } else {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的头盔没有镶嵌或者武器没有附灵!"));
                }
            }


            case 2 -> {
                PlayerInventory playerInventory = player.getInventory();
                if (MoneyBank.countEmptySlots(playerInventory) < 2) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的背包空余空间不足!"));
                    return;
                }

                boolean haveBeef = false;
                boolean haveXueYao = false;
                for (ItemStack itemStack : playerInventory.getStorageContents()) {
                    if (itemStack == null) {
                        continue;
                    }
                    PersistentDataContainerView pdcView = itemStack.getPersistentDataContainer();
                    String id = pdcView.getOrDefault(DataContainer.id, PersistentDataType.STRING, "null");
                    if (id.equals("huixue1")) {
                        haveXueYao = true;
                    }
                    if (id.equals("niupai")) {
                        haveBeef = true;
                    }
                }
                if (haveBeef && haveXueYao) {
                    PlaySound.pickupOrb(player);
                    player.giveExp(640);
                    jinshuangshi1.setAmount(1);
                    zhusha.setAmount(9);
                    playerInventory.addItem(jinshuangshi1);
                    playerInventory.addItem(zhusha);
                    pdc.set(DataContainer.mainTask, PersistentDataType.INTEGER, 3);
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§a完成主线任务§b3§a!"));
                    checkMain(player);
                } else {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的背包内缺乏必要的物品!"));
                }
            }


            case 0 -> {
                PlaySound.pickupOrb(player);
                player.giveExp(160);
                pdc.set(DataContainer.mainTask, PersistentDataType.INTEGER, 1);
                SendInformation.sendMes(player, Component.text("§6[主线任务]§a完成主线任务§b1§a!"));
                checkMain(player);
            }

            case 1 -> {
                PlayerInventory playerInventory = player.getInventory();
                if (!MoneyBank.hasEmptySlot(playerInventory)) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4你的背包空余空间不足!"));
                    return;
                }

                Data data = Yuehua.playerData.get(player.getUniqueId());
                if (data.killEastSkeletonConut < 10 || data.killEastZombieCount < 10 || data.killEastSpiderCount < 10) {
                    SendInformation.sendMes(player, Component.text("§6[主线任务]§4还未完成进度!"));
                    SendInformation.sendMes(player, Component.text(String.format("§6[主线任务]§a僵尸§b%d/10  §a骷髅§b%d/10  §a蜘蛛§b%d/10", data.killEastZombieCount, data.killEastSkeletonConut, data.killEastSpiderCount)));
                    return;
                }
                PlaySound.pickupOrb(player);
                player.giveExp(320);
                yeminzhu.setAmount(1);
                playerInventory.addItem(yeminzhu);
                pdc.set(DataContainer.mainTask, PersistentDataType.INTEGER, 2);
                SendInformation.sendMes(player, Component.text("§6[主线任务]§a完成主线任务§b2§a!"));
                checkMain(player);
            }


        }
    }

    public static void chechXuanshang(Player player) {

    }

    public static void tijiaoXuanshang(Player player) {

    }

    public static void checkXuanshangCd(Player player) {
        Scheduler.sync(player::closeInventory);
        long xuanshangCd = player.getPersistentDataContainer().get(DataContainer.xuanshangCd, PersistentDataType.LONG);
        long xuanshangCd_s = xuanshangCd / 20;
        SendInformation.sendMes(player, Component.text(String.format("§6[悬赏任务]§a距离下一次可接取悬赏任务的时间为: §b%ds", xuanshangCd_s)));
    }

    public static void checkXuanshangLevel(Player player) {
        Scheduler.sync(player::closeInventory);
        String level = switch (player.getPersistentDataContainer().get(DataContainer.xuanshanglevel, PersistentDataType.INTEGER)) {
            case 0 -> "子";
            case 1 -> "丑";
            case 2 -> "寅";
            case 3 -> "卯";
            case 4 -> "辰";
            case 5 -> "巳";
            case 6 -> "午";
            case 7 -> "未";
            case 8 -> "申";
            case 9 -> "酉";
            case 10 -> "戌";
            case 11 -> "亥";
            default -> "未知";
        };

        SendInformation.sendMes(player, Component.text("§6[悬赏任务]§a你的悬赏等级为: §b" + level));
    }
}
