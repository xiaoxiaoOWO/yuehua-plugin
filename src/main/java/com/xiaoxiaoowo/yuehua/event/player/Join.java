package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.Jump;
import com.xiaoxiaoowo.yuehua.attribute.attributes.vanilla.Speed;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.guis.mission.Task;
import com.xiaoxiaoowo.yuehua.items.Book;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.UUID;

import static com.xiaoxiaoowo.yuehua.utils.AdvancementSet.*;

public final class Join implements Listener {
    public static final PotionEffect effect = new PotionEffect(PotionEffectType.NIGHT_VISION, -1, 10, false, false, true);
    private static final Location WAITING = new Location(GetEntity.world, 218.5, 50, -1779.5);


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        UUID uuid = player.getUniqueId();
        PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
        Location location = persistentDataContainer.has(DataContainer.attack) ?
                player.getLocation() :
                LocationSet.CHU_SHENG_DIAN;

        player.teleport(WAITING);
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
            //双开检测
            doublePlayCheck(player, location);

            //第一次初始化
            String name = player.getName();

            firstInit(name, player, persistentDataContainer);


            //根据职业初始化数据
            Data data = switch (persistentDataContainer.get(DataContainer.job, PersistentDataType.INTEGER)) {
                case 1 -> new ZhanData(player);
                case 2 -> new GongData(player);
                case 3 -> new DanData(player);
                default -> new Data(player);
            };


            int count = SQL.retrieveShiChangMoney(name);
            if (count != 0) {
                SQL.storeShiChangMoney(name, 0);
                data.money += count;
                player.sendMessage(Component.text("§6[全球市场]§a你的商品被购买了，总共获得了§b" + count + "§a元"));
            }


            Scheduler.sync(
                    () -> {
                        Yuehua.playerData.put(uuid, data);
                        if (data.job != 0 && (persistentDataContainer.get(DataContainer.mainTask, PersistentDataType.INTEGER) != 5)) {
                            Task.checkMain(player);
                        }
                        player.getAttribute(Attribute.JUMP_STRENGTH).removeModifier(Jump.canNotJump);
                        player.getAttribute(Attribute.MOVEMENT_SPEED).removeModifier(Speed.canNotMove);

                        Scheduler.asyncLater(() -> Transfer.transferAttribute(data), 2 * 20);
                        Yuehua.timeLastIn.put(uuid, System.currentTimeMillis());

                        if (player.isOp()) {
                            player.teleport(location);
                            player.addScoreboardTag("op");
                            player.setGameMode(GameMode.CREATIVE);
                        } else {
                            if (data.fuben > 1000) {
                                player.setHealth(0);
                                player.sendMessage(
                                        Component.text("§e[游戏机制]§4试图逃离副本机制，你已被惩罚")
                                );
                            } else {
                                player.teleport(location);
                            }
                        }
                    }
            );

            Scheduler.asyncLater(() -> {
                if (!Yuehua.checkSet.remove(uuid)) {
                    if (player.isOnline()) {
                        Scheduler.sync(
                                () -> player.kick(Component.text("§c疑似使用非官方客户端"))
                        );
                    }
                }
            }, 10 * 20);
        });
    }


    public static void firstInit(String name, Player player, PersistentDataContainer persistentDataContainer) {
        if (!persistentDataContainer.has(DataContainer.attack)) {
            PlayerInventory inventory = player.getInventory();
            inventory.addItem(Book.START);

            Inventory inventory1 = Bukkit.createInventory(player, 54, Component.translatable("qkd1"));
            Inventory inventory2 = Bukkit.createInventory(player, 54, Component.translatable("qkd2"));
            Inventory inventory3 = Bukkit.createInventory(player, 54, Component.translatable("qkd3"));
            Inventory inventory4 = Bukkit.createInventory(player, 54, Component.translatable("qkd4"));
            Inventory inventory5 = Bukkit.createInventory(player, 54, Component.translatable("qkd5"));
            Inventory inventory6 = Bukkit.createInventory(player, 54, Component.translatable("qkd6"));
            Inventory inventory7 = Bukkit.createInventory(player, 54, Component.translatable("qkd7"));
            Inventory inventory8 = Bukkit.createInventory(player, 54, Component.translatable("qkd8"));
            Inventory inventory9 = Bukkit.createInventory(player, 54, Component.translatable("qkd9"));
            Inventory inventory10 = Bukkit.createInventory(player, 54, Component.translatable("qkd10"));
            Inventory inventory11 = Bukkit.createInventory(player, 54, Component.translatable("qkd11"));
            Inventory inventory12 = Bukkit.createInventory(player, 54, Component.translatable("qkd12"));
            Inventory inventory13 = Bukkit.createInventory(player, 54, Component.translatable("qkd13"));
            Inventory inventory14 = Bukkit.createInventory(player, 54, Component.translatable("qkd14"));
            Inventory inventory15 = Bukkit.createInventory(player, 54, Component.translatable("qkd15"));
            Inventory inventory16 = Bukkit.createInventory(player, 54, Component.translatable("qkd16"));
            Inventory inventory17 = Bukkit.createInventory(player, 54, Component.translatable("qkd17"));
            Inventory inventory18 = Bukkit.createInventory(player, 54, Component.translatable("qkd18"));

            inventory1.setItem(53, Yh.BACK_BEFORE);
            inventory2.setItem(53, Yh.BACK_BEFORE);
            inventory3.setItem(53, Yh.BACK_BEFORE);
            inventory4.setItem(53, Yh.BACK_BEFORE);
            inventory5.setItem(53, Yh.BACK_BEFORE);
            inventory6.setItem(53, Yh.BACK_BEFORE);
            inventory7.setItem(53, Yh.BACK_BEFORE);
            inventory8.setItem(53, Yh.BACK_BEFORE);
            inventory9.setItem(53, Yh.BACK_BEFORE);
            inventory10.setItem(53, Yh.BACK_BEFORE);
            inventory11.setItem(53, Yh.BACK_BEFORE);
            inventory12.setItem(53, Yh.BACK_BEFORE);
            inventory13.setItem(53, Yh.BACK_BEFORE);
            inventory14.setItem(53, Yh.BACK_BEFORE);
            inventory15.setItem(53, Yh.BACK_BEFORE);
            inventory16.setItem(53, Yh.BACK_BEFORE);
            inventory17.setItem(53, Yh.BACK_BEFORE);
            inventory18.setItem(53, Yh.BACK_BEFORE);

            SQL.storePlayerInventory1(name, inventory1);
            SQL.storePlayerInventory2(name, inventory2);
            SQL.storePlayerInventory3(name, inventory3);
            SQL.storePlayerInventory4(name, inventory4);
            SQL.storePlayerInventory5(name, inventory5);
            SQL.storePlayerInventory6(name, inventory6);
            SQL.storePlayerInventory7(name, inventory7);
            SQL.storePlayerInventory8(name, inventory8);
            SQL.storePlayerInventory9(name, inventory9);
            SQL.storePlayerInventory10(name, inventory10);
            SQL.storePlayerInventory11(name, inventory11);
            SQL.storePlayerInventory12(name, inventory12);
            SQL.storePlayerInventory13(name, inventory13);
            SQL.storePlayerInventory14(name, inventory14);
            SQL.storePlayerInventory15(name, inventory15);
            SQL.storePlayerInventory16(name, inventory16);
            SQL.storePlayerInventory17(name, inventory17);
            SQL.storePlayerInventory18(name, inventory18);

            SQL.storeYhTeam(name, "null");

            //初始化视频槽
            Inventory shipinBar = Bukkit.createInventory(player, 9, Component.text("饰品槽").color(NamedTextColor.AQUA));
            shipinBar.setItem(0, Yh.NO);
            shipinBar.setItem(1, Yh.NO);
            shipinBar.setItem(2, Yh.NO);
            shipinBar.setItem(3, Yh.NO);
            shipinBar.setItem(4, Yh.NO);
            shipinBar.setItem(5, Yh.NO);
            shipinBar.setItem(6, Yh.NO);
            shipinBar.setItem(7, Yh.NO);
            shipinBar.setItem(8, Yh.BACK_BEFORE);
            SQL.storeShiPin(player.getUniqueId().toString(), shipinBar);

            //初始攻击速度,移动速度，最大伤害吸收
            player.getAttribute(Attribute.ATTACK_SPEED).setBaseValue(1);
            player.getAttribute(Attribute.MOVEMENT_SPEED).setBaseValue(0.1);
            player.getAttribute(Attribute.JUMP_STRENGTH).setBaseValue(0.42);
            player.getAttribute(Attribute.MAX_ABSORPTION).setBaseValue(1000000000);

            //初始化
            persistentDataContainer.set(DataContainer.levelAward, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.slot0, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot1, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot2, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot8, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot36, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot37, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot38, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot39, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.slot40, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot0, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot1, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot2, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot3, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot4, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot5, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot6, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.eslot7, PersistentDataType.STRING, "null");
            persistentDataContainer.set(DataContainer.dumian, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.huomian, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.bingmian, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.jianmian, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.shuailuomian, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.sanchajimian, PersistentDataType.DOUBLE, 0.0);


            persistentDataContainer.set(DataContainer.chonghualevel, PersistentDataType.INTEGER, 1);
            persistentDataContainer.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
            persistentDataContainer.set(DataContainer.fuben, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.relife, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.relifeStoneCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.race, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.job, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.cool_reduce, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.cool_reduce_unlimited, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.branch, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.hujia, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.pojia, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.fakang, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.pofa, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.gedang, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.shouhu, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.baoji, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE, 1.5);
            persistentDataContainer.set(DataContainer.renxing, PersistentDataType.DOUBLE, 0.0);
            persistentDataContainer.set(DataContainer.shengji, PersistentDataType.DOUBLE, 1.0);
            persistentDataContainer.set(DataContainer.money, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.JinCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.MuCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.ShuiCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.HuoCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.TuCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.RefinedJinCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.RefinedMuCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.RefinedShuiCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.RefinedHuoCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.RefinedTuCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.ConcentratedJinCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.ConcentratedMuCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.ConcentratedShuiCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.ConcentratedHuoCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.ConcentratedTuCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.XianTaoCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.noInfor, PersistentDataType.BOOLEAN, Boolean.FALSE);

            persistentDataContainer.set(DataContainer.noInforDan, PersistentDataType.BOOLEAN, Boolean.FALSE);

            persistentDataContainer.set(DataContainer.noSound, PersistentDataType.BOOLEAN, Boolean.FALSE);

            persistentDataContainer.set(DataContainer.jiuji, PersistentDataType.LONG, 0L);

            persistentDataContainer.set(DataContainer.guajiCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.muCd, PersistentDataType.LONG, 0L);
            persistentDataContainer.set(DataContainer.shuiCd, PersistentDataType.LONG, 0L);
            persistentDataContainer.set(DataContainer.huoCd, PersistentDataType.LONG, 0L);
            persistentDataContainer.set(DataContainer.tuCd, PersistentDataType.LONG, 0L);
            persistentDataContainer.set(DataContainer.jinCd, PersistentDataType.LONG, 0L);

            persistentDataContainer.set(DataContainer.checkCount, PersistentDataType.INTEGER, 500);

            persistentDataContainer.set(DataContainer.killEastSkeletonConut, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastZombieCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastSpiderCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.killEastArrowSkeletonCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastPoisonFlyCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastZombieEliteCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastSpiderEliteCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.killEastZombieMountainCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastSpiderMountainCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastArrowSkeletonMountainCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.killEastPoisonFlyMountainCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastPandaMountainCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastArrowSkeletonSHENMUCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.killEastSpiderQueenMountainCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastWaterGhostMountainCount, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.killEastPoisonSpiderMountainCount, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.xuanshanglevel, PersistentDataType.INTEGER, 0);
            persistentDataContainer.set(DataContainer.xuanshangCd, PersistentDataType.LONG, 0L);
            persistentDataContainer.set(DataContainer.xuanshangId, PersistentDataType.STRING, "null");

            persistentDataContainer.set(DataContainer.mainTask, PersistentDataType.INTEGER, 0);

            persistentDataContainer.set(DataContainer.advancementPoint, PersistentDataType.INTEGER, 0);
            Scheduler.sync(() -> {
                AdvancementSet.giveAdv(player, AdvancementSet.allRoot);
                AdvancementSet.giveAdv(player, AdvancementSet.killRoot);
                AdvancementSet.giveAdv(player, killRoot2);
                AdvancementSet.giveAdv(player, killRoot3);
                AdvancementSet.giveAdv(player, killRoot4);
                AdvancementSet.giveAdv(player, killRoot5);
                AdvancementSet.giveAdv(player, AdvancementSet.fubenRoot);
                AdvancementSet.giveAdv(player, AdvancementSet.zhanRoot);
                AdvancementSet.giveAdv(player, AdvancementSet.gongRoot);
                AdvancementSet.giveAdv(player, AdvancementSet.danRoot);

            });

            persistentDataContainer.set(DataContainer.zhonglie1, PersistentDataType.LIST.integers(), List.of());
            persistentDataContainer.set(DataContainer.zhonglie2, PersistentDataType.LIST.integers(), List.of());
            persistentDataContainer.set(DataContainer.zhonglie3, PersistentDataType.LIST.integers(), List.of());


            persistentDataContainer.set(DataContainer.xinqitian, PersistentDataType.INTEGER, 0);


            persistentDataContainer.set(DataContainer.shenqiHaveGot,PersistentDataType.LIST.strings(),List.of());

            persistentDataContainer.set(DataContainer.attack_add, PersistentDataType.DOUBLE, 1.0);
            persistentDataContainer.set(DataContainer.attack_mul, PersistentDataType.DOUBLE, 1.0);
            persistentDataContainer.set(DataContainer.attack, PersistentDataType.DOUBLE, 1.0);


            if (player.isOp()) {
                player.addScoreboardTag("night_vision");
            }

        }
    }

    public static void doublePlayCheck(Player player, Location location) {
        InetSocketAddress inetSocketAddress = player.getAddress();
        if (inetSocketAddress == null) {
            Scheduler.sync(
                    () -> player.kick(Component.text("§4网络出现了故障"))
            );
            return;
        }
        String ip = inetSocketAddress.getAddress().getHostAddress();
        //防止双开
        for (Player p : Yuehua.players) {
            InetSocketAddress address = p.getAddress();
            if (address == null) {
                Scheduler.sync(
                        () -> {
                            player.teleportAsync(location);
                            player.kick(Component.text("§4网络出现了故障"));
                        }
                );
                return;
            }
            if (address.getAddress().getHostAddress().equals(ip)) {
                {
                    if (p != player) {
                        Scheduler.sync(
                                () -> {
                                    player.teleportAsync(location);
                                    player.kick(Component.text("§4禁止多开,如有特殊情况请联系管理员"));
                                }
                        );
                        return;
                    }
                }
            }
        }
    }


}

