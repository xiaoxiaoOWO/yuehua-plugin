package com.xiaoxiaoowo.yuehua.guis.bank;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.utils.Scheduler;
import com.xiaoxiaoowo.yuehua.utils.SendInformation;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.List;

import static com.xiaoxiaoowo.yuehua.guis.bank.MoneyBank.hasEmptySlot;

public final class YuanSuBank {
    public final static Inventory yuansu = Bukkit.createInventory(null, 18, Component.text("元素银行").color(NamedTextColor.AQUA));
    public final static Inventory yuansu_putong = Bukkit.createInventory(null, 36, Component.text("元素银行[普通]").color(NamedTextColor.AQUA));
    public final static Inventory yuansu_jinlian = Bukkit.createInventory(null, 36, Component.text("元素银行[精炼]").color(NamedTextColor.AQUA));
    public final static Inventory yuansu_nongsuo = Bukkit.createInventory(null, 36, Component.text("元素银行[浓缩]").color(NamedTextColor.AQUA));

    public final static ItemStack jin = YuanSu.jin.clone();
    public final static ItemStack jin_refined = YuanSu.refined_jin.clone();
    public final static ItemStack jin_concentrated = YuanSu.concentrated_jin.clone();

    public final static ItemStack mu = YuanSu.mu.clone();
    public final static ItemStack mu_refined = YuanSu.refined_mu.clone();
    public final static ItemStack mu_concentrated = YuanSu.concentrated_mu.clone();

    public final static ItemStack shui = YuanSu.shui.clone();
    public final static ItemStack shui_refined = YuanSu.refined_shui.clone();
    public final static ItemStack shui_concentrated = YuanSu.concentrated_shui.clone();

    public final static ItemStack huo = YuanSu.huo.clone();
    public final static ItemStack huo_refined = YuanSu.refined_huo.clone();
    public final static ItemStack huo_concentrated = YuanSu.concentrated_huo.clone();

    public final static ItemStack tu = YuanSu.tu.clone();
    public final static ItemStack tu_refined = YuanSu.refined_tu.clone();
    public final static ItemStack tu_concentrated = YuanSu.concentrated_tu.clone();


    static {
        ItemStack putong = YuanSu.jin.clone();
        ItemStack jinlian = YuanSu.refined_jin.clone();
        ItemStack nongsuo = YuanSu.concentrated_jin.clone();
        ItemStack check = YuanSu.jin.clone();

        putong.setDisplayName("§b进入普通元素银行");
        jinlian.setDisplayName("§b进入精炼元素银行");
        nongsuo.setDisplayName("§b进入浓缩元素银行");
        check.setDisplayName("§b查询元素余额");

        yuansu.setItem(0, putong);
        yuansu.setItem(2, jinlian);
        yuansu.setItem(4, nongsuo);
        yuansu.setItem(6, check);
        yuansu.setItem(17, Yh.BACK_BEFORE);

        // 普通元素部分
        ItemStack jin1 = YuanSu.jin.clone();
        jin1.setDisplayName("§b取出1金元素");
        jin1.setAmount(1);
        yuansu_putong.setItem(0, jin1);

        ItemStack jin10 = YuanSu.jin.clone();
        jin10.setDisplayName("§b取出10金元素");
        jin10.setAmount(10);
        yuansu_putong.setItem(9, jin10);

        ItemStack jin99 = YuanSu.jin.clone();
        jin99.setDisplayName("§b取出99金元素");
        jin99.setAmount(99);
        yuansu_putong.setItem(18, jin99);

        ItemStack mu1 = YuanSu.mu.clone();
        mu1.setDisplayName("§b取出1木元素");
        mu1.setAmount(1);
        yuansu_putong.setItem(2, mu1);

        ItemStack mu10 = YuanSu.mu.clone();
        mu10.setDisplayName("§b取出10木元素");
        mu10.setAmount(10);
        yuansu_putong.setItem(11, mu10);

        ItemStack mu99 = YuanSu.mu.clone();
        mu99.setDisplayName("§b取出99木元素");
        mu99.setAmount(99);
        yuansu_putong.setItem(20, mu99);

        ItemStack shui1 = YuanSu.shui.clone();
        shui1.setDisplayName("§b取出1水元素");
        shui1.setAmount(1);
        yuansu_putong.setItem(4, shui1);

        ItemStack shui10 = YuanSu.shui.clone();
        shui10.setDisplayName("§b取出10水元素");
        shui10.setAmount(10);
        yuansu_putong.setItem(13, shui10);

        ItemStack shui99 = YuanSu.shui.clone();
        shui99.setDisplayName("§b取出99水元素");
        shui99.setAmount(99);
        yuansu_putong.setItem(22, shui99);

        ItemStack huo1 = YuanSu.huo.clone();
        huo1.setDisplayName("§b取出1火元素");
        huo1.setAmount(1);
        yuansu_putong.setItem(6, huo1);

        ItemStack huo10 = YuanSu.huo.clone();
        huo10.setDisplayName("§b取出10火元素");
        huo10.setAmount(10);
        yuansu_putong.setItem(15, huo10);

        ItemStack huo99 = YuanSu.huo.clone();
        huo99.setDisplayName("§b取出99火元素");
        huo99.setAmount(99);
        yuansu_putong.setItem(24, huo99);

        ItemStack tu1 = YuanSu.tu.clone();
        tu1.setDisplayName("§b取出1土元素");
        tu1.setAmount(1);
        yuansu_putong.setItem(8, tu1);

        ItemStack tu10 = YuanSu.tu.clone();
        tu10.setDisplayName("§b取出10土元素");
        tu10.setAmount(10);
        yuansu_putong.setItem(17, tu10);

        ItemStack tu99 = YuanSu.tu.clone();
        tu99.setDisplayName("§b取出99土元素");
        tu99.setAmount(99);
        yuansu_putong.setItem(26, tu99);

        yuansu_putong.setItem(35, Yh.BACK_BEFORE);

// 精炼元素部分
        ItemStack refinedJin1 = YuanSu.refined_jin.clone();
        refinedJin1.setDisplayName("§b取出1精炼金元素");
        refinedJin1.setAmount(1);
        yuansu_jinlian.setItem(0, refinedJin1);

        ItemStack refinedJin10 = YuanSu.refined_jin.clone();
        refinedJin10.setDisplayName("§b取出10精炼金元素");
        refinedJin10.setAmount(10);
        yuansu_jinlian.setItem(9, refinedJin10);

        ItemStack refinedJin99 = YuanSu.refined_jin.clone();
        refinedJin99.setDisplayName("§b取出99精炼金元素");
        refinedJin99.setAmount(99);
        yuansu_jinlian.setItem(18, refinedJin99);

        ItemStack refinedMu1 = YuanSu.refined_mu.clone();
        refinedMu1.setDisplayName("§b取出1精炼木元素");
        refinedMu1.setAmount(1);
        yuansu_jinlian.setItem(2, refinedMu1);

        ItemStack refinedMu10 = YuanSu.refined_mu.clone();
        refinedMu10.setDisplayName("§b取出10精炼木元素");
        refinedMu10.setAmount(10);
        yuansu_jinlian.setItem(11, refinedMu10);

        ItemStack refinedMu99 = YuanSu.refined_mu.clone();
        refinedMu99.setDisplayName("§b取出99精炼木元素");
        refinedMu99.setAmount(99);
        yuansu_jinlian.setItem(20, refinedMu99);

        ItemStack refinedShui1 = YuanSu.refined_shui.clone();
        refinedShui1.setDisplayName("§b取出1精炼水元素");
        refinedShui1.setAmount(1);
        yuansu_jinlian.setItem(4, refinedShui1);

        ItemStack refinedShui10 = YuanSu.refined_shui.clone();
        refinedShui10.setDisplayName("§b取出10精炼水元素");
        refinedShui10.setAmount(10);
        yuansu_jinlian.setItem(13, refinedShui10);

        ItemStack refinedShui99 = YuanSu.refined_shui.clone();
        refinedShui99.setDisplayName("§b取出99精炼水元素");
        refinedShui99.setAmount(99);
        yuansu_jinlian.setItem(22, refinedShui99);

        ItemStack refinedHuo1 = YuanSu.refined_huo.clone();
        refinedHuo1.setDisplayName("§b取出1精炼火元素");
        refinedHuo1.setAmount(1);
        yuansu_jinlian.setItem(6, refinedHuo1);

        ItemStack refinedHuo10 = YuanSu.refined_huo.clone();
        refinedHuo10.setDisplayName("§b取出10精炼火元素");
        refinedHuo10.setAmount(10);
        yuansu_jinlian.setItem(15, refinedHuo10);

        ItemStack refinedHuo99 = YuanSu.refined_huo.clone();
        refinedHuo99.setDisplayName("§b取出99精炼火元素");
        refinedHuo99.setAmount(99);
        yuansu_jinlian.setItem(24, refinedHuo99);

        ItemStack refinedTu1 = YuanSu.refined_tu.clone();
        refinedTu1.setDisplayName("§b取出1精炼土元素");
        refinedTu1.setAmount(1);
        yuansu_jinlian.setItem(8, refinedTu1);

        ItemStack refinedTu10 = YuanSu.refined_tu.clone();
        refinedTu10.setDisplayName("§b取出10精炼土元素");
        refinedTu10.setAmount(10);
        yuansu_jinlian.setItem(17, refinedTu10);

        ItemStack refinedTu99 = YuanSu.refined_tu.clone();
        refinedTu99.setDisplayName("§b取出99精炼土元素");
        refinedTu99.setAmount(99);
        yuansu_jinlian.setItem(26, refinedTu99);

        yuansu_jinlian.setItem(35, Yh.BACK_BEFORE);

// 浓缩元素部分
        ItemStack concentratedJin1 = YuanSu.concentrated_jin.clone();
        concentratedJin1.setDisplayName("§b取出1浓缩金元素");
        concentratedJin1.setAmount(1);
        yuansu_nongsuo.setItem(0, concentratedJin1);

        ItemStack concentratedJin10 = YuanSu.concentrated_jin.clone();
        concentratedJin10.setDisplayName("§b取出10浓缩金元素");
        concentratedJin10.setAmount(10);
        yuansu_nongsuo.setItem(9, concentratedJin10);

        ItemStack concentratedJin99 = YuanSu.concentrated_jin.clone();
        concentratedJin99.setDisplayName("§b取出99浓缩金元素");
        concentratedJin99.setAmount(99);
        yuansu_nongsuo.setItem(18, concentratedJin99);

        ItemStack concentratedMu1 = YuanSu.concentrated_mu.clone();
        concentratedMu1.setDisplayName("§b取出1浓缩木元素");
        concentratedMu1.setAmount(1);
        yuansu_nongsuo.setItem(2, concentratedMu1);

        ItemStack concentratedMu10 = YuanSu.concentrated_mu.clone();
        concentratedMu10.setDisplayName("§b取出10浓缩木元素");
        concentratedMu10.setAmount(10);
        yuansu_nongsuo.setItem(11, concentratedMu10);

        ItemStack concentratedMu99 = YuanSu.concentrated_mu.clone();
        concentratedMu99.setDisplayName("§b取出99浓缩木元素");
        concentratedMu99.setAmount(99);
        yuansu_nongsuo.setItem(20, concentratedMu99);

        ItemStack concentratedShui1 = YuanSu.concentrated_shui.clone();
        concentratedShui1.setDisplayName("§b取出1浓缩水元素");
        concentratedShui1.setAmount(1);
        yuansu_nongsuo.setItem(4, concentratedShui1);

        ItemStack concentratedShui10 = YuanSu.concentrated_shui.clone();
        concentratedShui10.setDisplayName("§b取出10浓缩水元素");
        concentratedShui10.setAmount(10);
        yuansu_nongsuo.setItem(13, concentratedShui10);

        ItemStack concentratedShui99 = YuanSu.concentrated_shui.clone();
        concentratedShui99.setDisplayName("§b取出99浓缩水元素");
        concentratedShui99.setAmount(99);
        yuansu_nongsuo.setItem(22, concentratedShui99);

        ItemStack concentratedHuo1 = YuanSu.concentrated_huo.clone();
        concentratedHuo1.setDisplayName("§b取出1浓缩火元素");
        concentratedHuo1.setAmount(1);
        yuansu_nongsuo.setItem(6, concentratedHuo1);

        ItemStack concentratedHuo10 = YuanSu.concentrated_huo.clone();
        concentratedHuo10.setDisplayName("§b取出10浓缩火元素");
        concentratedHuo10.setAmount(10);
        yuansu_nongsuo.setItem(15, concentratedHuo10);

        ItemStack concentratedHuo99 = YuanSu.concentrated_huo.clone();
        concentratedHuo99.setDisplayName("§b取出99浓缩火元素");
        concentratedHuo99.setAmount(99);
        yuansu_nongsuo.setItem(24, concentratedHuo99);

        ItemStack concentratedTu1 = YuanSu.concentrated_tu.clone();
        concentratedTu1.setDisplayName("§b取出1浓缩土元素");
        concentratedTu1.setAmount(1);
        yuansu_nongsuo.setItem(8, concentratedTu1);

        ItemStack concentratedTu10 = YuanSu.concentrated_tu.clone();
        concentratedTu10.setDisplayName("§b取出10浓缩土元素");
        concentratedTu10.setAmount(10);
        yuansu_nongsuo.setItem(17, concentratedTu10);

        ItemStack concentratedTu99 = YuanSu.concentrated_tu.clone();
        concentratedTu99.setDisplayName("§b取出99浓缩土元素");
        concentratedTu99.setAmount(99);
        yuansu_nongsuo.setItem(26, concentratedTu99);

        yuansu_nongsuo.setItem(35, Yh.BACK_BEFORE);
    }

    public static void check(Data data) {
        Player player = data.player;
        Scheduler.sync(player::closeInventory);
        SendInformation.sendMes(player, List.of(
                Component.text("§6[元素银行]§a金存储量: §b" + data.jinCount + " §a精炼金存储量: §b" + data.refinedJinCount + " §a浓缩金存储量: §b" + data.concentratedJinCount),
                Component.text("§6[元素银行]§a木存储量: §b" + data.muCount + " §a精炼木存储量: §b" + data.refinedMuCount + " §a浓缩木存储量: §b" + data.concentratedMuCount),
                Component.text("§6[元素银行]§a水存储量: §b" + data.shuiCount + " §a精炼水存储量: §b" + data.refinedShuiCount + " §a浓缩水存储量: §b" + data.concentratedShuiCount),
                Component.text("§6[元素银行]§a火存储量: §b" + data.huoCount + " §a精炼火存储量: §b" + data.refinedHuoCount + " §a浓缩火存储量: §b" + data.concentratedHuoCount),
                Component.text("§6[元素银行]§a土存储量: §b" + data.tuCount + " §a精炼土存储量: §b" + data.refinedTuCount + " §a浓缩土存储量: §b" + data.concentratedTuCount)
        ));
    }

    public static void get(String id, Data data, int amount) {
        int amountPlayerHas = switch (id) {
            case "金" -> data.jinCount;
            case "精炼金" -> data.refinedJinCount;
            case "浓缩金" -> data.concentratedJinCount;

            case "木" -> data.muCount;
            case "精炼木" -> data.refinedMuCount;
            case "浓缩木" -> data.concentratedMuCount;

            case "水" -> data.shuiCount;
            case "精炼水" -> data.refinedShuiCount;
            case "浓缩水" -> data.concentratedShuiCount;

            case "火" -> data.huoCount;
            case "精炼火" -> data.refinedHuoCount;
            case "浓缩火" -> data.concentratedHuoCount;

            case "土" -> data.tuCount;
            case "精炼土" -> data.refinedTuCount;
            case "浓缩土" -> data.concentratedTuCount;

            case null, default -> 0;
        };
        if (amount <= amountPlayerHas) {
            Player player = data.player;
            PlayerInventory playerInventory = player.getInventory();
            if (!hasEmptySlot(playerInventory)) {
                return;
            }
            //扣除余额,返回该元素
            ItemStack yuansu = switch (id) {
                case "金" -> {
                    data.jinCount -= amount;
                    yield jin;
                }
                case "精炼金" -> {
                    data.refinedJinCount -= amount;
                    yield jin_refined;
                }
                case "浓缩金" -> {
                    data.concentratedJinCount -= amount;
                    yield jin_concentrated;
                }
                case "木" -> {
                    data.muCount -= amount;
                    yield mu;
                }
                case "精炼木" -> {
                    data.refinedMuCount -= amount;
                    yield mu_refined;
                }
                case "浓缩木" -> {
                    data.concentratedMuCount -= amount;
                    yield mu_concentrated;
                }
                case "水" -> {
                    data.shuiCount -= amount;
                    yield shui;
                }
                case "精炼水" -> {
                    data.refinedShuiCount -= amount;
                    yield shui_refined;
                }
                case "浓缩水" -> {
                    data.concentratedShuiCount -= amount;
                    yield shui_concentrated;
                }
                case "火" -> {
                    data.huoCount -= amount;
                    yield huo;
                }
                case "精炼火" -> {
                    data.refinedHuoCount -= amount;
                    yield huo_refined;
                }
                case "浓缩火" -> {
                    data.concentratedHuoCount -= amount;
                    yield huo_concentrated;
                }
                case "土" -> {
                    data.tuCount -= amount;
                    yield tu;
                }
                case "精炼土" -> {
                    data.refinedTuCount -= amount;
                    yield tu_refined;
                }
                case "浓缩土" -> {
                    data.concentratedTuCount -= amount;
                    yield tu_concentrated;
                }
                default -> throw new IllegalArgumentException("未知的元素ID: " + id);
            };
            yuansu.setAmount(amount);
            player.getInventory().addItem(yuansu);

        }
    }
}
