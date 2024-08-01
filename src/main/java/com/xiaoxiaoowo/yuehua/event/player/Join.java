package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.commands.playercommand.Yh;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.itemstack.Book;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import com.xiaoxiaoowo.yuehua.utils.SQL;
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
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.net.InetSocketAddress;
import java.util.UUID;

public final class Join implements Listener {
    public static final PotionEffect effect = new PotionEffect(PotionEffectType.NIGHT_VISION, -1, 10, false, false, true);
    private static final Location WAITING = new Location(GetEntity.world, 218.5, 50, -1779.5);


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        Location location = player.getLocation();
        player.teleport(WAITING);
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
            InetSocketAddress inetSocketAddress = player.getAddress();
            if (inetSocketAddress == null) {
                Yuehua.sync(
                        () -> {
                            player.kick(Component.text("§4网络出现了故障"));
                        }
                );
                return;
            }
            String ip = inetSocketAddress.getAddress().getHostAddress();
            //防止双开
            for (Player p : Yuehua.players) {
                InetSocketAddress address = p.getAddress();
                if (address == null) {
                    Yuehua.sync(
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
                            Yuehua.sync(
                                    () -> {
                                        player.teleportAsync(location);
                                        player.banPlayer("§4禁止多开,如有特殊情况请联系管理员");
                                    }
                            );
                            return;
                        }
                    }
                }
            }


            String name = player.getName();
            PersistentDataContainer persistentDataContainer = player.getPersistentDataContainer();
            if (!persistentDataContainer.has(DataContainer.attack)) {

                player.getInventory().addItem(Book.YUE_HUA);

                //违规记录
                SQL.setCount(name);

                SQL.storeYhTeam(name, "null");

//                SQL.storeShared(name, "null");

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
                player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(1);
                player.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(0.1);
                player.getAttribute(Attribute.GENERIC_JUMP_STRENGTH).setBaseValue(0.42);
                player.getAttribute(Attribute.GENERIC_MAX_ABSORPTION).setBaseValue(1000000000);

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

                persistentDataContainer.set(DataContainer.attack_add, PersistentDataType.DOUBLE, 1.0);
                persistentDataContainer.set(DataContainer.attack_mul, PersistentDataType.DOUBLE, 1.0);
                persistentDataContainer.set(DataContainer.attack, PersistentDataType.DOUBLE, 1.0);

                if (player.isOp()) {
                    player.addScoreboardTag("night_vision");
                }


            }

            //根据职业初始化数据
            Data data = switch (persistentDataContainer.get(DataContainer.job, PersistentDataType.INTEGER)) {
                case 1 -> new ZhanData(player);
                case 2 -> new GongData(player);
                case 3 -> new DanData(player);
                default -> new Data(player);
            };

            UUID uuid = player.getUniqueId();


            int count = SQL.retrieveShiChangMoney(name);
            if (count != 0) {
                SQL.storeShiChangMoney(name, 0);
                data.money += count;
                player.sendMessage(Component.text("§6[全球市场]§a你的商品被购买了，总共获得了§b" + count + "§a元"));
            }

            Yuehua.sync(
                    () -> {
                        player.setHealthScale(20);
                        Yuehua.playerData.put(uuid, data);
                        if (player.isOp()) {
                            player.teleportAsync(location);
                            player.addScoreboardTag("op");
                            player.setGameMode(GameMode.CREATIVE);
                        } else {
                            if (persistentDataContainer.get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                                player.setHealth(0);
                                player.sendMessage(
                                        Component.text("§e[游戏机制]§4试图逃离副本机制，你已被惩罚")
                                );
                            } else {
                                player.teleportAsync(location);
                            }
                        }
                    }
            );


            Yuehua.asyncLater(() -> {
                if (!Yuehua.nameSet.remove(name)) {
                    if (player.isOnline()) {
                        SQL.addCount(name);

                        Yuehua.sync(
                                () ->player.kick(Component.text("§c疑似使用非官方客户端，多次违规将永久BAN！"))
                        );
                    }
                }
            }, 20 * 10);


        });


    }

}

