package com.xiaoxiaoowo.yuehua.event.Inventory;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.event.player.Join;
import com.xiaoxiaoowo.yuehua.guis.DuanZao;
import com.xiaoxiaoowo.yuehua.guis.Recipe;
import com.xiaoxiaoowo.yuehua.guis.Task;
import com.xiaoxiaoowo.yuehua.guis.Yh;
import com.xiaoxiaoowo.yuehua.guis.bank.JianDai;
import com.xiaoxiaoowo.yuehua.guis.bank.MoneyBank;
import com.xiaoxiaoowo.yuehua.guis.bank.YuanSuBank;
import com.xiaoxiaoowo.yuehua.guis.op.OpTp;
import com.xiaoxiaoowo.yuehua.items.Book;
import com.xiaoxiaoowo.yuehua.items.dz.YuShi;
import com.xiaoxiaoowo.yuehua.items.other.Food;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.dz.*;
import com.xiaoxiaoowo.yuehua.utils.*;
import io.papermc.paper.persistence.PersistentDataContainerView;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.HoverEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffectType;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public final class Click implements Listener {

    public static final ItemStack shuilang = Food.shuilangniemianren.clone();
    public static final Set<Material> types = new HashSet<>();

    static {
        shuilang.setAmount(99);
        //元素
        types.add(Material.KELP);
        //药引
        types.add(Material.REDSTONE);
        //扔药
        types.add(Material.SPLASH_POTION);
        //吃药
        types.add(Material.BREAD);
        //草药
        types.add(Material.FEATHER);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        String title = event.getView().getOriginalTitle();
        switch (title) {
            case "§b主菜单" -> {
                event.setCancelled(true);
                Player whoClicked = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) == 0) {
                            PlaySound.openInventory(whoClicked);
                            Scheduler.sync(() -> whoClicked.openInventory(Yh.QIAN_KUN_BAG));
                        } else {
                            Scheduler.async(() -> whoClicked.sendMessage(Component.text("§6[菜单系统]§4禁止在副本/试炼中使用乾坤盒")));
                            Scheduler.sync(() -> whoClicked.closeInventory());
                        }
                    }

                    case 1 -> {
                        if (whoClicked.getScoreboardTags().contains("shared")) {
                            Scheduler.async(() -> {
                                String playerName = whoClicked.getName();
                                String teamName = SQL.getYhTeam(playerName);
                                if (teamName.equals("null")) {
                                    //无队伍,开启自己的
                                    Scheduler.sync(() -> {
                                        whoClicked.openInventory(Yuehua.sharedInv.get(playerName));
                                        PlaySound.openInventory(whoClicked);
                                    });
                                } else {
                                    //有队伍，开启队伍的
                                    Scheduler.sync(() -> {
                                        Inventory teamInv = Yuehua.sharedInv.get(teamName);
                                        if (teamInv == null) {
                                            SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你的队长没有开启混元袋☯无界"));
                                            return;
                                        }

                                        whoClicked.openInventory(teamInv);
                                        PlaySound.openInventory(whoClicked);
                                    });
                                }
                            });

                        } else {
                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4你尚未解锁混元袋☯无界"));
                            Scheduler.sync(() -> whoClicked.closeInventory());
                        }
                    }


                    case 2 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                            if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能"));
                                Scheduler.sync(() -> whoClicked.closeInventory());
                                return;
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.shipinBar);
                                PlaySound.openInventory(whoClicked);
                            });
                        });
                    }


                    case 3 -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                            SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能"));
                            Scheduler.sync(() -> whoClicked.closeInventory());
                            return;
                        }
                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(Yuehua.shichang.get(0)));
                    }

                    case 4 -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                            SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能"));
                            Scheduler.sync(() -> whoClicked.closeInventory());
                            return;
                        }
                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(Yh.CHONG_HUA));
                    }

                    case 5 -> {
                        PlayerInventory playerInventory = whoClicked.getInventory();
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        for (ItemStack itemStack : playerInventory.getContents()) {
                            if (itemStack == null) {
                                continue;
                            }
                            Material type = itemStack.getType();
                            if (type != Material.BRICK && type != Material.KELP) {
                                continue;
                            }
                            store(itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING), data, itemStack);
                        }
                        PlaySound.closeInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.closeInventory());
                    }

                    case 6 -> {
                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(YuanSuBank.yuansu));
                    }

                    case 7 -> {
                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(MoneyBank.moneybank));
                    }

                    case 8 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        if (data.job != 2) {
                            return;
                        }

                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(JianDai.JIANDAI));
                    }

                    case 9 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        switch (data.job) {
                            case 1 -> {
                                Scheduler.sync(() -> whoClicked.openInventory(DuanZao.recipeZhan));
                                PlaySound.openInventory(whoClicked);
                            }

                            case 2 -> {
                                Scheduler.sync(() -> whoClicked.openInventory(DuanZao.recipeGong));
                                PlaySound.openInventory(whoClicked);
                            }

                            case 3 -> {
                                Scheduler.sync(() -> whoClicked.openInventory(DuanZao.recipeDan));
                                PlaySound.openInventory(whoClicked);
                            }

                        }
                    }

                    case 10 -> {
                        Scheduler.sync(() -> whoClicked.openInventory(Recipe.recipeAllDan));
                        PlaySound.openInventory(whoClicked);
                    }

                    case 11 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        if (data.job != 3) {
                            return;
                        }

                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(Recipe.recipeDanDan));
                    }

                    case 12 -> {
                        long timeNow = GetEntity.world.getGameTime();
                        PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                        if (pdc.get(DataContainer.jiuji, PersistentDataType.LONG) < timeNow) {
                            pdc.set(DataContainer.jiuji, PersistentDataType.LONG, timeNow + 72000 * 6);
                            shuilang.setAmount(99);
                            whoClicked.getInventory().addItem(shuilang);
                        }
                    }

                    case 13 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        lunhuizhuanshi(data, whoClicked);
                    }

                    case 14 -> {
                        Player player = (Player) event.getWhoClicked();
                        Scheduler.async(
                                () -> showItem(player, player.getInventory().getItemInMainHand())
                        );
                    }


                    case 15 -> {
                        Scheduler.sync(() -> whoClicked.closeInventory());
                        PlaySound.closeInventory(whoClicked);
                        List<Component> messages = new ArrayList<>(30);
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        messages.add(Component.text("§6[个人数据]§a近战伤害：§b" + String.format("%.1f", data.attack) + "   §a暴击率：§b" + String.format("%.1f", data.baoji * 100) + "   §a暴击效果：§b" + String.format("%.1f", data.baojixiaoguo * 100)));
                        messages.add(Component.text("§6[个人数据]§a护甲：§b" + String.format("%.1f", data.hujia * 100) + "   §a法抗：§b" + String.format("%.1f", data.fakang * 100) + "   §a格挡：§b" + String.format("%.1f", data.gedang)));
                        messages.add(Component.text("§6[个人数据]§a韧性：§b" + String.format("%.1f", data.renxing * 100) + "   §a生机：§b" + String.format("%.1f", data.shengji * 100) + "   §a冷却缩减：§b" + String.format("%.1f", data.cool_reduce * 100)));
                        messages.add(Component.text("§6[个人数据]§a毒伤免疫：§b" + String.format("%.1f", data.dumian * 100) + "   §a火伤免疫：§b" + String.format("%.1f", data.huomian * 100) + "   §a冰伤免疫：§b" + String.format("%.1f", data.bingmian * 100)));
                        messages.add(Component.text("§6[个人数据]§a箭伤免疫：§b" + String.format("%.1f", data.jianmian * 100) + "   §a三叉戟伤免疫：§b" + String.format("%.1f", data.sanchajimian * 100) + "   §a摔落减免：§b" + String.format("%.1f", data.shuailuomian * 100)));
                        messages.add(Component.text("§6[个人数据]§a破甲：§b" + String.format("%.1f", data.pojia * 100) + "   §a破法：§b" + String.format("%.1f", data.pofa * 100) + "   §a守护：§b" + String.format("%.1f", data.shouhu)));
                        messages.add(Component.text("§6[个人数据]§a攻击速度：§b" + String.format("%.1f", whoClicked.getAttribute(Attribute.GENERIC_ATTACK_SPEED).getValue()) + "   §a移动速度：§b" + String.format("%.2f", whoClicked.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue()) + "   §a定力：§b" + String.format("%.1f", whoClicked.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).getValue() * 100)));
                        messages.add(Component.text("§6[个人数据]§a攻击距离：§b" + String.format("%.1f", whoClicked.getAttribute(Attribute.PLAYER_ENTITY_INTERACTION_RANGE).getValue()) + "   §a跳跃力：§b" + String.format("%.2f", whoClicked.getAttribute(Attribute.GENERIC_JUMP_STRENGTH).getValue() * 100) + "   §a最大生命：§b" + String.format("%.1f", whoClicked.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue())));


                        switch (data.job) {
                            case 1 -> {
                            }

                            case 2 -> {
                                GongData gongData = (GongData) data;
                                messages.add(Component.text("§6[个人数据][弓箭手]§a箭矢强度：§b" + String.format("%.1f", gongData.arrow)));
                            }
                            case 3 -> {
                                DanData danData = (DanData) data;
                                messages.add(Component.text("§6[个人数据][炼丹师]§a阵法强度：§b" + String.format("%.1f", danData.zhenfa) + "   §a普通元素不消耗率：§b" + String.format("%.1f", danData.noCost1 * 100) + "   §a精炼元素不消耗率：§b" + String.format("%.1f", danData.noCost2 * 100) + "   §a浓缩元素不消耗率：§b" + String.format("%.1f", danData.noCost3 * 100)));
                            }
                        }

                        SendInformation.sendMes(whoClicked, messages);
                    }

                    case 16 -> {
                        Scheduler.sync(() -> whoClicked.openInventory(Task.MAIN_TASK));
                        PlaySound.openInventory(whoClicked);
                    }

                    case 17 -> {
                        Scheduler.sync(() -> whoClicked.openInventory(Task.XUAN_SHANG));
                        PlaySound.openInventory(whoClicked);
                    }


                    case 18 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        data.noinfor = !data.noinfor;
                        Player player = data.player;
                        player.getPersistentDataContainer().set(DataContainer.noInfor, PersistentDataType.BOOLEAN, data.noinfor);
                        if (data.noinfor) {
                            SendInformation.sendMes(player, Component.text("§6[菜单系统]§a成功关闭被动技能的文本提示"));
                        } else {
                            SendInformation.sendMes(player, Component.text("§6[菜单系统]§a成功打开被动技能的文本提示"));
                        }

                    }

                    case 19 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        data.nosound = !data.nosound;
                        Player player = data.player;
                        player.getPersistentDataContainer().set(DataContainer.noSound, PersistentDataType.BOOLEAN, data.nosound);
                        if (data.nosound) {
                            SendInformation.sendMes(player, Component.text("§6[菜单系统]§a成功关闭被动技能的音效"));
                        } else {
                            SendInformation.sendMes(player, Component.text("§6[菜单系统]§a成功打开被动技能的音效"));
                        }
                    }

                    case 20 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        if (data.job == 3) {
                            DanData danData = (DanData) data;
                            danData.noinforDan = !danData.noinforDan;
                            Player player = danData.player;
                            player.getPersistentDataContainer().set(DataContainer.noInforDan, PersistentDataType.BOOLEAN, danData.noinforDan);
                            if (danData.noinforDan) {
                                SendInformation.sendMes(player, Component.text("§6[菜单系统]§a成功关闭阵法的文本提示"));
                            } else {
                                SendInformation.sendMes(player, Component.text("§6[菜单系统]§a成功打开阵法的文本提示"));
                            }
                        }
                    }

                    case 45 -> {
                        Scheduler.sync(() -> whoClicked.closeInventory());
                        whoClicked.setHealth(0);
                    }


                    case 52 -> {
                        if (whoClicked.isOp()) {
                            Scheduler.sync(() -> whoClicked.openInventory(OpTp.OPTP));
                        }
                    }


                    case 53 -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) == 0) {
                            PlaySound.openInventory(whoClicked);
                            Scheduler.sync(() -> whoClicked.openInventory(Yh.ZA_XIANG));
                        } else {
                            Scheduler.async(() -> whoClicked.sendMessage(Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能")));
                            Scheduler.sync(() -> whoClicked.closeInventory());

                        }
                    }


                }
            }

            case "§b元素银行" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(YuanSuBank.yuansu_putong));
                    }

                    case 2 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(YuanSuBank.yuansu_jinlian));
                    }

                    case 4 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(YuanSuBank.yuansu_nongsuo));
                    }

                    case 6 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.check(data);
                        PlaySound.closeInventory(player);
                        Scheduler.sync(player::closeInventory);
                    }

                    case 17 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }
            }

            case "§b主线任务" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        PlaySound.closeInventory(player);
                        Scheduler.sync(() -> player.closeInventory());
                        Task.checkMain(player);
                    }

                    case 1 -> {
                        PlaySound.closeInventory(player);
                        Scheduler.sync(() -> player.closeInventory());
                        Task.tijiaoMain(player);
                    }

                    case 8 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }
            }

            case "§b悬赏任务" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        PlaySound.closeInventory(player);
                        Scheduler.sync(() -> player.closeInventory());
                        Task.chechXuanshang(player);
                    }

                    case 1 -> {
                        PlaySound.closeInventory(player);
                        Scheduler.sync(() -> player.closeInventory());
                        Task.tijiaoXuanshang(player);
                    }

                    case 2 -> {
                        PlaySound.closeInventory(player);
                        Scheduler.sync(() -> player.closeInventory());
                        Task.checkXuanshangCd(player);
                    }

                    case 3 -> {
                        PlaySound.closeInventory(player);
                        Scheduler.sync(() -> player.closeInventory());
                        Task.checkXuanshangLevel(player);
                    }

                    case 8 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }
            }

            case "§b元素银行[普通]" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("金", data, 1);
                    }

                    case 9 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("金", data, 10);
                    }

                    case 18 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("金", data, 99);
                    }

                    case 2 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("木", data, 1);
                    }

                    case 11 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("木", data, 10);
                    }

                    case 20 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("木", data, 99);
                    }

                    case 4 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("水", data, 1);
                    }

                    case 13 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("水", data, 10);
                    }

                    case 22 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("水", data, 99);
                    }

                    case 6 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("火", data, 1);
                    }

                    case 15 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("火", data, 10);
                    }

                    case 24 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("火", data, 99);
                    }

                    case 8 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("土", data, 1);
                    }

                    case 17 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("土", data, 10);
                    }

                    case 26 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("土", data, 99);
                    }

                    case 35 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(YuanSuBank.yuansu));
                    }
                }
            }

            case "§b元素银行[精炼]" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼金", data, 1);
                    }

                    case 9 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼金", data, 10);
                    }

                    case 18 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼金", data, 99);
                    }

                    case 2 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼木", data, 1);
                    }

                    case 11 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼木", data, 10);
                    }

                    case 20 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼木", data, 99);
                    }

                    case 4 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼水", data, 1);
                    }

                    case 13 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼水", data, 10);
                    }

                    case 22 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼水", data, 99);
                    }

                    case 6 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼火", data, 1);
                    }

                    case 15 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼火", data, 10);
                    }

                    case 24 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼火", data, 99);
                    }

                    case 8 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼土", data, 1);
                    }

                    case 17 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼土", data, 10);
                    }

                    case 26 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("精炼土", data, 99);
                    }

                    case 35 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(YuanSuBank.yuansu));
                    }
                }
            }


            case "§b元素银行[浓缩]" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩金", data, 1);
                    }

                    case 9 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩金", data, 10);
                    }

                    case 18 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩金", data, 99);
                    }

                    case 2 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩木", data, 1);
                    }

                    case 11 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩木", data, 10);
                    }

                    case 20 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩木", data, 99);
                    }

                    case 4 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩水", data, 1);
                    }

                    case 13 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩水", data, 10);
                    }

                    case 22 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩水", data, 99);
                    }

                    case 6 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩火", data, 1);
                    }

                    case 15 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩火", data, 10);
                    }

                    case 24 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩火", data, 99);
                    }

                    case 8 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩土", data, 1);
                    }

                    case 17 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩土", data, 10);
                    }

                    case 26 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        YuanSuBank.get("浓缩土", data, 99);
                    }

                    case 35 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(YuanSuBank.yuansu));
                    }
                }
            }

            case "§b箭袋" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data.job != 2) {
                            return;
                        }
                        GongData gongData = (GongData) data;
                        JianDai.get(gongData, 1);
                    }

                    case 2 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data.job != 2) {
                            return;
                        }
                        GongData gongData = (GongData) data;
                        JianDai.get(gongData, 10);
                    }

                    case 4 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data.job != 2) {
                            return;
                        }
                        GongData gongData = (GongData) data;
                        JianDai.get(gongData, 99);
                    }

                    case 6 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data.job != 2) {
                            return;
                        }
                        GongData gongData = (GongData) data;
                        JianDai.store(gongData);
                    }

                    case 8 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data.job != 2) {
                            return;
                        }
                        GongData gongData = (GongData) data;
                        JianDai.check(gongData);
                        PlaySound.closeInventory(player);
                        Scheduler.sync(player::closeInventory);
                    }

                    case 17 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        if (data.job != 2) {
                            return;
                        }

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }
            }

            case "§b金钱银行" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("铜钱", data, 1, 1);
                    }

                    case 9 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("铜钱", data, 10, 10);
                    }

                    case 18 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("铜钱", data, 99, 99);
                    }

                    case 2 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("银元宝", data, 1, 10);
                    }

                    case 11 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("银元宝", data, 10, 100);
                    }

                    case 20 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("银元宝", data, 99, 990);
                    }

                    case 4 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("金元宝", data, 1, 100);
                    }

                    case 13 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("金元宝", data, 10, 1000);
                    }

                    case 22 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("金元宝", data, 99, 9900);
                    }

                    case 6 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("银票", data, 1, 1000);
                    }

                    case 15 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("银票", data, 10, 10000);
                    }

                    case 24 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.get("银票", data, 99, 99000);
                    }

                    case 8, 17, 26 -> {
                        Data data = Yuehua.playerData.get(player.getUniqueId());
                        MoneyBank.check(data);
                        PlaySound.closeInventory(player);
                        Scheduler.sync(player::closeInventory);
                    }

                    case 35 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }
            }


            case "§b锻造配方[战]" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.zhanWeapon));
                    }

                    case 1 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.zhanArmor));
                    }

                    case 2 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.zhanBiWeapon));
                    }

                    case 3 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.zhanFaBao));
                    }

                    case 4 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.shipin));
                    }

                    case 5 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.zhanYiQi));
                    }

                    case 8 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }

            }

            case "§b锻造配方[丹]" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.danWeapon));
                    }

                    case 1 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.danArmor));
                    }

                    case 2 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.danBiWeapon));
                    }

                    case 3 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.danFaBao));
                    }

                    case 4 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.shipin));
                    }

                    case 5 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.danYiQi));
                    }

                    case 8 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }

            }

            case "§b锻造配方[弓]" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.gongWeapon));
                    }

                    case 1 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.gongArmor));
                    }

                    case 2 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.gongBiWeapon));
                    }

                    case 3 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.gongFaBao));
                    }

                    case 4 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.shipin));
                    }

                    case 5 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Recipe.gongYiQi));
                    }

                    case 8 -> {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    }
                }

            }


//            case "§b物品管理"-> {
//                event.setCancelled(true);
//                Player player = (Player) event.getWhoClicked();
//                if(event.getRawSlot() == 53){
//
//                }
//
//                ItemStack item = event.getCurrentItem();
//                player.getInventory().addItem(item);
//            }

            case "§bOP重华晶" -> {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.WU_PIN);
                    }

                    case 1 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.HUANG_CHENG_ZHONG_XIN);
                    }

                    case 2 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.HUANG_CHENG_DONG_MEN);
                    }
                    case 3 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.HUANG_CHENG_XI_MEN);
                    }
                    case 4 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.HUANG_CHENG_NAN_MEN);
                    }
                    case 5 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.HUANG_CHENG_BEI_MEN);
                    }
                    case 6 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.TIE_JIANG_PU);
                    }
                    case 7 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.LIAN_DAN_FANG);
                    }
                    case 8 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SEN_LIN_RU_KOU);
                    }
                    case 9 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.LONG_XU_ZHEN);
                    }
                    case 10 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SHAN_SHEN_MIAO);
                    }
                    case 11 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SHEN_MU_YAO_JING);
                    }
                    case 12 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.WANG_YUAN_WAI);
                    }
                    case 13 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.WEN_QUAN_KE_ZHAN);
                    }
                    case 14 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SHA_MO_KE_ZHAN);
                    }
                    case 15 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SHA_MO_CUN_ZHUANG);
                    }
                    case 16 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SHA_MO_SHI_BEI);
                    }
                    case 17 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.CHEN_DA_FU);
                    }
                    case 18 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SHAN_DONG_CUN_ZHUANG);
                    }
                    case 19 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.DA_SHI_JIE_ZHEN_YAO_TA);
                    }
                    case 20 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.SHUI_ZU_CUN_ZHUANG);
                    }
                    case 21 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.BAI_GU_JING);
                    }
                    case 22 -> {
                        player.closeInventory();
                        player.teleport(LocationSet.PENG_LAI_DU_KOU);
                    }


                    case 53 -> Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                }
            }

            case "§b杂项" -> {
                event.setCancelled(true);
                Player whoClicked = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        String name = whoClicked.getName();
                        Bukkit.dispatchCommand(Yuehua.console, "tpsbar " + name);
                    }
                    case 1 -> {
                        String name = whoClicked.getName();
                        Bukkit.dispatchCommand(Yuehua.console, "rambar " + name);
                    }
                    case 2 -> {
                        if (whoClicked.getScoreboardTags().contains("night_vision")) {
                            if (whoClicked.getPotionEffect(PotionEffectType.NIGHT_VISION) == null) {
                                whoClicked.addPotionEffect(Join.effect);
                            } else {
                                whoClicked.removePotionEffect(PotionEffectType.NIGHT_VISION);
                            }
                        } else {
                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4你没有权限使用此功能"));
                        }
                    }


                    case 3 -> whoClicked.getInventory().addItem(Other.NPC_PAOPAO);

                    case 4 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        switch (data.race) {
                            case 1 -> whoClicked.getInventory().addItem(RaceProvince.shen);
                            case 2 -> whoClicked.getInventory().addItem(RaceProvince.xian);
                            case 3 -> whoClicked.getInventory().addItem(RaceProvince.ren);
                            case 4 -> whoClicked.getInventory().addItem(RaceProvince.yao);
                            case 5 -> whoClicked.getInventory().addItem(RaceProvince.zhanShen);
                        }
                    }

                    case 5 -> whoClicked.getInventory().addItem(Book.START);
                    case 6 -> whoClicked.getInventory().addItem(Book.SHUXIN);
                    case 7 -> whoClicked.getInventory().addItem(Book.NEIRONG);
                    case 8 -> whoClicked.getInventory().addItem(Book.WANFA);
                    case 9 -> whoClicked.getInventory().addItem(Book.JINJI);


                    case 17 -> {
                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(Yh.MAIN_MENU));
                    }
                }
            }


            case "§b乾坤盒" -> {
                event.setCancelled(true);
                Player whoClicked = (Player) event.getWhoClicked();
                Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> {
                    switch (event.getRawSlot()) {
                        case 0 -> {
                            if (data.inventory1 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd1")) {
                                    data.inventory1 = SQL.retrievePlayerInventory1(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory1);
                                PlaySound.openInventory(whoClicked);
                            });

                        }
                        case 1 -> {
                            if (data.inventory2 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd2")) {
                                    data.inventory2 = SQL.retrievePlayerInventory2(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory2);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 2 -> {
                            if (data.inventory3 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd3")) {
                                    data.inventory3 = SQL.retrievePlayerInventory3(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory3);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 3 -> {
                            if (data.inventory4 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd4")) {
                                    data.inventory4 = SQL.retrievePlayerInventory4(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory4);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 4 -> {
                            if (data.inventory5 == null) {

                                if (whoClicked.getScoreboardTags().contains("qkd5")) {
                                    data.inventory5 = SQL.retrievePlayerInventory5(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory5);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 5 -> {
                            if (data.inventory6 == null) {

                                if (whoClicked.getScoreboardTags().contains("qkd6")) {
                                    data.inventory6 = SQL.retrievePlayerInventory6(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory6);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 6 -> {
                            if (data.inventory7 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd7")) {
                                    data.inventory7 = SQL.retrievePlayerInventory7(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory7);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 7 -> {
                            if (data.inventory8 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd8")) {
                                    data.inventory8 = SQL.retrievePlayerInventory8(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory8);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 8 -> {
                            if (data.inventory9 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd9")) {
                                    data.inventory9 = SQL.retrievePlayerInventory9(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory9);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 9 -> {
                            if (data.inventory10 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd10")) {
                                    data.inventory10 = SQL.retrievePlayerInventory10(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory10);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 10 -> {
                            if (data.inventory11 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd11")) {
                                    data.inventory11 = SQL.retrievePlayerInventory11(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory11);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 11 -> {
                            if (data.inventory12 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd12")) {
                                    data.inventory12 = SQL.retrievePlayerInventory12(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory12);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 12 -> {
                            if (data.inventory13 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd13")) {
                                    data.inventory13 = SQL.retrievePlayerInventory13(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory13);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 13 -> {
                            if (data.inventory14 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd14")) {
                                    data.inventory14 = SQL.retrievePlayerInventory14(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory14);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 14 -> {
                            if (data.inventory15 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd15")) {
                                    data.inventory15 = SQL.retrievePlayerInventory15(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory15);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 15 -> {
                            if (data.inventory16 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd16")) {
                                    data.inventory16 = SQL.retrievePlayerInventory16(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory16);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 16 -> {
                            if (data.inventory17 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd17")) {
                                    data.inventory17 = SQL.retrievePlayerInventory17(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory17);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 17 -> {
                            if (data.inventory18 == null) {
                                if (whoClicked.getScoreboardTags().contains("qkd18")) {
                                    data.inventory18 = SQL.retrievePlayerInventory18(whoClicked);
                                } else {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                    return;
                                }
                            }
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(data.inventory18);
                                PlaySound.openInventory(whoClicked);
                            });
                        }

                        case 26 -> {
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                whoClicked.openInventory(Yh.MAIN_MENU);
                                PlaySound.openInventory(whoClicked);
                            });
                        }
                    }


                });

            }

            case "§b混元袋☯无界" -> {
                if (event.getRawSlot() == 53) {
                    event.setCancelled(true);
                    Scheduler.sync(() -> {
                        Player whoClicked = (Player) event.getWhoClicked();
                        PlaySound.openInventory(whoClicked);
                        whoClicked.openInventory(Yh.MAIN_MENU);
                    });
                }
            }

            //一到十八
            case "§b乾坤盒☯一", "§b乾坤盒☯二", "§b乾坤盒☯三", "§b乾坤盒☯四", "§b乾坤盒☯五", "§b乾坤盒☯六",
                 "§b乾坤盒☯七", "§b乾坤盒☯八", "§b乾坤盒☯九", "§b乾坤盒☯十", "§b乾坤盒☯十一", "§b乾坤盒☯十二",
                 "§b乾坤盒☯十三", "§b乾坤盒☯十四", "§b乾坤盒☯十五", "§b乾坤盒☯十六", "§b乾坤盒☯十七",
                 "§b乾坤盒☯十八" -> {
                if (event.getRawSlot() == 53) {
                    event.setCancelled(true);
                    Player whoClicked = (Player) event.getWhoClicked();
                    PlaySound.openInventory(whoClicked);
                    Scheduler.sync(() -> whoClicked.openInventory(Yh.QIAN_KUN_BAG));
                }
            }


            case "§b饰品槽" -> {
                ItemStack item = event.getCurrentItem();
                if (item == null) {
                    return;
                }
                switch (item.getType()) {
                    case YELLOW_DYE -> {
                        if (item.getCustomModelData() == 2) {
                            event.setCancelled(true);
                            Player whoClicked = (Player) event.getWhoClicked();
                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此槽位还未开启"));
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> whoClicked.closeInventory());
                        } else {
                            event.setCancelled(true);
                            Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                                Player whoClicked = (Player) event.getWhoClicked();
                                PlaySound.openInventory(whoClicked);
                                whoClicked.openInventory(Yh.MAIN_MENU);
                            });
                        }

                    }
                    case WOODEN_PICKAXE -> {
                    }
                    default -> {
                        event.setCancelled(true);
                        Player whoClicked = (Player) event.getWhoClicked();
                        Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4饰品槽只能放入饰品"));
                            whoClicked.closeInventory();
                        });
                    }
                }
            }

            case "§b重华晶" -> {
                event.setCancelled(true);
                Player whoClicked = (Player) event.getWhoClicked();
                Set<String> tags = whoClicked.getScoreboardTags();
                switch (event.getRawSlot()) {
                    case 0 -> {
                        if (tags.contains("chonghua" + 1)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.MIDDLE);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.MIDDLE) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 1);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 1 -> {
                        if (tags.contains("chonghua" + 2)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.LONG_XU_ZHEN);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.LONG_XU_ZHEN) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 2);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 2 -> {
                        if (tags.contains("chonghua" + 3)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHAN_SHEN_MIAO);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHAN_SHEN_MIAO) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 3);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 3 -> {
                        if (tags.contains("chonghua" + 4)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.QING_LONG_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.QING_LONG_RU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 4);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }
                    case 4 -> {
                        if (tags.contains("chonghua" + 5)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHA_MO_KE_ZHAN);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHA_MO_KE_ZHAN) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 5);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 5 -> {
                        if (tags.contains("chonghua" + 6)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHA_MO_CUN_ZHUANG);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHA_MO_CUN_ZHUANG) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 6);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 6 -> {
                        if (tags.contains("chonghua" + 7)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§a重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.ZHU_QUE_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.ZHU_QUE_RU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 7);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 7 -> {
                        if (tags.contains("chonghua" + 8)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.CHEN_DA_FU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.CHEN_DA_FU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 8);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 8 -> {
                        if (tags.contains("chonghua" + 9)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHAN_DONG_CUN_ZHUANG);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHAN_DONG_CUN_ZHUANG) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 9);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 9 -> {
                        if (tags.contains("chonghua" + 10)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.BAI_HU_JI_TAN);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.BAI_HU_JI_TAN) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 10);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 10 -> {
                        if (tags.contains("chonghua" + 11)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHUI_ZU_CUN_ZHUANG);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHUI_ZU_CUN_ZHUANG) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 11);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 11 -> {
                        if (tags.contains("chonghua" + 12)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.PENG_LAI_DU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.PENG_LAI_DU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 12);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 12 -> {
                        if (tags.contains("chonghua" + 13)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.XUAN_WU_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.XUAN_WU_RU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 13);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 13 -> {
                        if (tags.contains("chonghua" + 14)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHI_HUANG_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHI_HUANG_RU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 14);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 14 -> {
                        if (tags.contains("chonghua" + 15)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.HUO_MO_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.HUO_MO_RU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 15);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 15 -> {
                        if (tags.contains("chonghua" + 16)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.DA_SHI_JIE_ZHEN_YAO_TA);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.DA_SHI_JIE_ZHEN_YAO_TA) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 16);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 16 -> {
                        if (tags.contains("chonghua" + 17)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.KU_GU_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.KU_GU_RU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 17);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 17 -> {
                        if (tags.contains("chonghua" + 18)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重华晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHENG_SHAN_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 6000L);
                                case 2 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 5400L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4800L);
                                case 4 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 4200L);
                                case 5 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3600L);
                                case 6 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 3000L);
                                case 7 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 2400L);
                                case 8 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1800L);
                                case 9 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 1200L);
                                case 10 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 600L);
                                case 11 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, 0L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHENG_SHAN_RU_KOU) < 400) {
                                whoClicked.addScoreboardTag("chonghua" + 18);
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§a重华晶激活"));
                            } else {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"));
                            }
                        }
                    }

                    case 27 -> {
                        PlaySound.closeInventory(whoClicked);
                        Scheduler.sync(whoClicked::closeInventory);
                        SendInformation.sendMes(whoClicked,
                                Component.text("§6[重华晶]§a等级: §b" + whoClicked.getPersistentDataContainer().get(DataContainer.chonghualevel, PersistentDataType.INTEGER)));
                    }


                    case 35 -> Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                        PlaySound.openInventory(whoClicked);
                        whoClicked.openInventory(Yh.MAIN_MENU);
                    });
                }

            }

            case "§b锻造台[二]", "§b锻造台[一]" -> {
                if (event.getRawSlot() == 17) {
                    event.setCancelled(true);
                    Inventory inv = event.getInventory();
                    ItemStack item1 = inv.getItem(0);
                    if (item1 == null) {
                        return;
                    }
                    if (item1.getType() != Material.IRON_INGOT || item1.getAmount() != 1) {
                        return;
                    }
                    ItemStack item2 = inv.getItem(1);
                    if (item2 == null) {
                        return;
                    }
                    PersistentDataContainerView pdc = item2.getPersistentDataContainer();
                    if (!pdc.has(DataContainer.insertid)) {
                        return;
                    }
                    String insertId = pdc.get(DataContainer.insertid, PersistentDataType.STRING);
                    if (!insertId.equals("null")) {
                        Player whoClicked = (Player) event.getWhoClicked();
                        SendInformation.sendMes(whoClicked, Component.text("§e[锻造系统]§4你的装备的玉石还没有拆卸！"));
                        return;
                    }


                    String id = item1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    TieJiangPu.dz(inv, id, (Player) event.getWhoClicked());

                }
            }

            case "§b法宝锻造台" -> {
                if (event.getRawSlot() == 17) {
                    event.setCancelled(true);
                    Inventory inv = event.getInventory();
                    ItemStack item1 = inv.getItem(0);
                    if (item1 == null) {
                        return;
                    }
                    if (item1.getType() != Material.IRON_INGOT || item1.getAmount() != 1) {
                        return;
                    }


                    String id = item1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Fabao.dz(inv, id, (Player) event.getWhoClicked());

                }
            }

            case "§b饰品锻造台" -> {
                if (event.getRawSlot() == 17) {
                    event.setCancelled(true);
                    Inventory inv = event.getInventory();
                    ItemStack item1 = inv.getItem(0);
                    if (item1 == null) {
                        return;
                    }
                    if (item1.getType() != Material.IRON_INGOT || item1.getAmount() != 1) {
                        return;
                    }

                    String id = item1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Shipin.dz(inv, id, (Player) event.getWhoClicked());
                }
            }

            case "§b异器锻造台" -> {
                if (event.getRawSlot() == 17) {
                    event.setCancelled(true);
                    Inventory inv = event.getInventory();
                    ItemStack item1 = inv.getItem(0);
                    if (item1 == null) {
                        return;
                    }
                    if (item1.getType() != Material.IRON_INGOT || item1.getAmount() != 1) {
                        return;
                    }


                    String id = item1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Yiqi.dz(inv, id, (Player) event.getWhoClicked());

                }
            }

            case "§b公用炼丹炉[一]", "§b公用炼丹炉[二]", "§b公用炼丹炉[三]", "§b公用炼丹炉[四]" -> {
                if (event.getRawSlot() != 17) {
                    return;
                }
                event.setCancelled(true);
                Inventory inv = event.getInventory();
                ItemStack item1 = inv.getItem(0);
                if (item1 == null) {
                    return;
                }
                if (item1.getType() != Material.REDSTONE || item1.getAmount() != 1) {
                    return;
                }

                String id = item1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                LianDan.liandan(inv, id, (Player) event.getWhoClicked());
            }

            case "§b黑铁锅", "§b青铜锅", "§b炼丹炉", "§b锁魂炉", "§b七煞鼎", "§b混元神鼎" -> {
                if (event.getRawSlot() != 17) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }
                    if (!types.contains(itemStack.getType())) {
                        event.setCancelled(true);
                        return;
                    }

                    return;
                }
                event.setCancelled(true);
                Inventory inv = event.getInventory();
                ItemStack item1 = inv.getItem(0);
                if (item1 == null) {
                    return;
                }
                if (item1.getType() != Material.REDSTONE || item1.getAmount() != 1) {
                    return;
                }

                String id = item1.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                LianDan.danshiLiandan(inv, id, (Player) event.getWhoClicked());
            }

            case "§b附灵台" -> {
                if (event.getRawSlot() != 8) {
                    return;
                }
                event.setCancelled(true);
                Inventory inv = event.getInventory();
                ItemStack item2 = inv.getItem(1);
                if (item2 == null) {
                    return;
                }
                if (item2.getType() != Material.PAPER || item2.getAmount() != 1) {
                    return;
                }
                ItemStack item1 = inv.getItem(0);
                if (item1 == null) {
                    return;
                }
                ItemMeta itemMeta1 = item1.getItemMeta();
                ItemMeta itemMeta2 = item2.getItemMeta();
                String idFuling = itemMeta2.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                PersistentDataContainer pdc1 = itemMeta1.getPersistentDataContainer();
                int slot = pdc1.get(DataContainer.slot, PersistentDataType.INTEGER);
                if (!pdc1.has(DataContainer.enchantid)) {
                    return;
                }
                if (!Check.checkFuling(idFuling, slot)) {
                    return;
                }
                pdc1.set(DataContainer.enchantid, PersistentDataType.STRING, idFuling);
                List<Component> lore2 = itemMeta2.lore();
                Component loreFuling = lore2.get(1);
                List<Component> lore = itemMeta1.lore();
                Component loreYushi = lore.removeLast();
                lore.removeLast();
                lore.add(Component.text("§a[附灵]: ").append(loreFuling));
                lore.add(loreYushi);
                itemMeta1.lore(lore);
                item1.setItemMeta(itemMeta1);
                inv.setItem(1, null);
                PlaySound.fuling((Player) event.getWhoClicked());
            }

            case "§b镶嵌台" -> {
                int rawSlot = event.getRawSlot();
                if (rawSlot == 8) {
                    event.setCancelled(true);
                    Inventory inv = event.getInventory();
                    ItemStack item1 = inv.getItem(0);
                    if (item1 == null) {
                        return;
                    }
                    ItemStack item2 = inv.getItem(1);
                    Player whoClicked = (Player) event.getWhoClicked();

                    if (item2 != null) {
                        if (item2.getType() != Material.EMERALD) {
                            //不可以镶嵌
                            SendInformation.sendMes(whoClicked, Component.text("§6[镶嵌系统]§4只能用玉石镶嵌"));
                            return;
                        }

                        if (item2.getAmount() != 1) {
                            return;
                        }

                        // 镶嵌
                        ItemMeta itemMeta1 = item1.getItemMeta();
                        PersistentDataContainer pdc1 = itemMeta1.getPersistentDataContainer();
                        if (pdc1.has(DataContainer.insertid)) {
                            //可以镶嵌
                            String id = pdc1.get(DataContainer.insertid, PersistentDataType.STRING);
                            if (!Objects.equals(id, "null")) {
                                SendInformation.sendMes(whoClicked, Component.text("§6[镶嵌系统]§4需要先拆卸已镶嵌的玉石"));
                            } else {
                                ItemMeta itemMeta2 = item2.getItemMeta();
                                String idYuShi = itemMeta2.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                                if (!Check.checkYushi(idYuShi, pdc1.get(DataContainer.slot, PersistentDataType.INTEGER))) {
                                    SendInformation.sendMes(whoClicked, Component.text("§6[镶嵌系统]§4此装备不可镶嵌此玉石"));
                                    return;
                                }

                                List<Component> lore2 = itemMeta2.lore();
                                lore2.removeLast();
                                Component shuxin = lore2.removeLast();

                                itemMeta1.getPersistentDataContainer().set(DataContainer.insertid, PersistentDataType.STRING, idYuShi);
                                List<Component> lore = itemMeta1.lore();
                                lore.removeLast();
                                lore.add(Component.text("§a[镶嵌]: ").append(shuxin));
                                itemMeta1.lore(lore);
                                item1.setItemMeta(itemMeta1);
                                inv.setItem(1, null);
                                PlaySound.insert(whoClicked);

                            }
                        } else {
                            //不可以镶嵌
                            SendInformation.sendMes(whoClicked, Component.text("§6[镶嵌系统]§4这个物品不可以镶嵌"));
                        }

                    } else {
                        // 卸下
                        ItemMeta itemMeta1 = item1.getItemMeta();
                        PersistentDataContainer pdc1 = itemMeta1.getPersistentDataContainer();
                        if (pdc1.has(DataContainer.insertid)) {
                            //可以镶嵌
                            String id = pdc1.get(DataContainer.insertid, PersistentDataType.STRING);
                            if (Objects.equals(id, "null")) {
                                SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4没有可以拆卸的玉石"));
                            } else {
                                pdc1.set(DataContainer.insertid, PersistentDataType.STRING, "null");
                                List<Component> lore = itemMeta1.lore();
                                lore.removeLast();
                                lore.add(ComponentSet.XIANGQIAN);
                                itemMeta1.lore(lore);
                                item1.setItemMeta(itemMeta1);
                                ItemStack itemStack = idToYushi(id);
                                itemStack.setAmount(1);
                                inv.setItem(1, itemStack);
                                PlaySound.insert(whoClicked);

                            }
                        } else {
                            SendInformation.sendMes(whoClicked, Component.text("§6[菜单系统]§4这个物品不可以拆除镶嵌"));
                        }
                    }


                }
            }


            case "§b月华市场[第1页]", "§b月华市场[第2页]", "§b月华市场[第3页]", "§b月华市场[第4页]",
                 "§b月华市场[第5页]", "§b月华市场[第6页]", "§b月华市场[第7页]", "§b月华市场[第8页]",
                 "§b月华市场[第9页]", "§b月华市场[第10页]", "§b月华市场[第11页]", "§b月华市场[第12页]",
                 "§b月华市场[第13页]", "§b月华市场[第14页]", "§b月华市场[第15页]", "§b月华市场[第16页]",
                 "§b月华市场[第17页]", "§b月华市场[第18页]", "§b月华市场[第19页]", "§b月华市场[第20页]",
                 "§b月华市场[第21页]", "§b月华市场[第22页]", "§b月华市场[第23页]", "§b月华市场[第24页]",
                 "§b月华市场[第25页]", "§b月华市场[第26页]", "§b月华市场[第27页]", "§b月华市场[第28页]",
                 "§b月华市场[第29页]", "§b月华市场[第30页]", "§b月华市场[第31页]", "§b月华市场[第32页]",
                 "§b月华市场[第33页]", "§b月华市场[第34页]", "§b月华市场[第35页]", "§b月华市场[第36页]",
                 "§b月华市场[第37页]", "§b月华市场[第38页]", "§b月华市场[第39页]", "§b月华市场[第40页]",
                 "§b月华市场[第41页]", "§b月华市场[第42页]", "§b月华市场[第43页]", "§b月华市场[第44页]",
                 "§b月华市场[第45页]", "§b月华市场[第46页]", "§b月华市场[第47页]", "§b月华市场[第48页]",
                 "§b月华市场[第49页]", "§b月华市场[第50页]", "§b月华市场[第51页]", "§b月华市场[第52页]",
                 "§b月华市场[第53页]", "§b月华市场[第54页]", "§b月华市场[第55页]", "§b月华市场[第56页]",
                 "§b月华市场[第57页]", "§b月华市场[第58页]", "§b月华市场[第59页]", "§b月华市场[第60页]",
                 "§b月华市场[第61页]", "§b月华市场[第62页]", "§b月华市场[第63页]", "§b月华市场[第64页]",
                 "§b月华市场[第65页]", "§b月华市场[第66页]", "§b月华市场[第67页]", "§b月华市场[第68页]",
                 "§b月华市场[第69页]", "§b月华市场[第70页]", "§b月华市场[第71页]", "§b月华市场[第72页]",
                 "§b月华市场[第73页]", "§b月华市场[第74页]", "§b月华市场[第75页]", "§b月华市场[第76页]",
                 "§b月华市场[第77页]", "§b月华市场[第78页]", "§b月华市场[第79页]", "§b月华市场[第80页]",
                 "§b月华市场[第81页]", "§b月华市场[第82页]", "§b月华市场[第83页]", "§b月华市场[第84页]",
                 "§b月华市场[第85页]", "§b月华市场[第86页]", "§b月华市场[第87页]", "§b月华市场[第88页]",
                 "§b月华市场[第89页]", "§b月华市场[第90页]", "§b月华市场[第91页]", "§b月华市场[第92页]",
                 "§b月华市场[第93页]", "§b月华市场[第94页]", "§b月华市场[第95页]", "§b月华市场[第96页]",
                 "§b月华市场[第97页]", "§b月华市场[第98页]", "§b月华市场[第99页]", "§b月华市场[第100页]" -> {
                event.setCancelled(true);
                if (!Shichang.canUse) {
                    return;
                }

                ItemStack clickItem = event.getCurrentItem();
                if (clickItem == null) {
                    return;
                }
                int id = extractNumbers(title);


                if (clickItem.getType() == Material.YELLOW_DYE) {
                    int slot = event.getRawSlot();
                    if (slot == 0) {
                        Player whoClicked = (Player) event.getWhoClicked();
                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(Yuehua.shichang.get(id)));
                    } else {
                        if (id == 1) {
                            Player whoClicked = (Player) event.getWhoClicked();
                            PlaySound.openInventory(whoClicked);
                            Scheduler.sync(() -> whoClicked.openInventory(Yh.MAIN_MENU));
                            return;
                        }

                        Player whoClicked = (Player) event.getWhoClicked();
                        PlaySound.openInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.openInventory(Yuehua.shichang.get(id - 2)));
                    }
                } else {
                    ItemMeta meta = clickItem.getItemMeta();
                    Player whoClicked = (Player) event.getWhoClicked();
                    PlayerInventory playerInventory = whoClicked.getInventory();
                    if (!MoneyBank.hasEmptySlot(playerInventory)) {
                        SendInformation.sendMes(whoClicked, Component.text("§6[月华市场]§4你的背包没有足够的空余空间"));
                        PlaySound.closeInventory(whoClicked);
                        Scheduler.sync(() -> whoClicked.closeInventory());
                        return;
                    }

                    PersistentDataContainer pdc = meta.getPersistentDataContainer();
                    if (!pdc.has(DataContainer.seller) || !pdc.has(DataContainer.price)) {
                        SendInformation.sendMes(whoClicked, Component.text("§6[月华市场]§4出现了一些问题"));
                        return;
                    }
                    int price = pdc.getOrDefault(DataContainer.price, PersistentDataType.INTEGER, -1);
                    String seller = pdc.getOrDefault(DataContainer.seller, PersistentDataType.STRING, "null");
                    if (price == -1) {
                        SendInformation.sendMes(whoClicked, Component.text("§6[月华市场]§4出现了一些问题"));
                        return;
                    }
                    if (seller.equals("null")) {
                        SendInformation.sendMes(whoClicked, Component.text("§6[月华市场]§4出现了一些问题"));
                        return;
                    }

                    String name = whoClicked.getName();
                    String itemName;
                    if (clickItem.hasDisplayName()) {
                        itemName = clickItem.getDisplayName();
                    } else {
                        itemName = "未命名商品";
                    }

                    //撤回上架商品
                    if (seller.equals(name)) {
                        event.getClickedInventory().setItem(event.getRawSlot(), null);
                        List<Component> lores = meta.lore();
                        lores.removeLast();
                        lores.removeLast();
                        lores.removeLast();
                        lores.removeLast();
                        meta.lore(lores);
                        pdc.remove(DataContainer.seller);
                        pdc.remove(DataContainer.price);
                        pdc.remove(DataContainer.time_charging);
                        clickItem.setItemMeta(meta);
                        PlaySound.pickUp(whoClicked);
                        playerInventory.addItem(clickItem);
                    } else
                    //购买
                    {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        int money = data.money;
                        if (money < price) {
                            whoClicked.sendMessage(Component.text("§6[月华市场]§4你的余额不足"));
                        } else {
                            event.getClickedInventory().setItem(event.getRawSlot(), null);
                            data.money -= price;
                            List<Component> lores = meta.lore();
                            lores.removeLast();
                            lores.removeLast();
                            lores.removeLast();
                            lores.removeLast();
                            meta.lore(lores);
                            pdc.remove(DataContainer.seller);
                            pdc.remove(DataContainer.price);
                            pdc.remove(DataContainer.time_charging);
                            clickItem.setItemMeta(meta);
                            playerInventory.addItem(clickItem);
                            PlaySound.pickUp(whoClicked);
                            Player sellerPlayer = Bukkit.getPlayer(seller);
                            if (sellerPlayer != null && sellerPlayer.isOnline()) {
                                Yuehua.playerData.get(sellerPlayer.getUniqueId()).money += price;
                                SendInformation.sendMes(sellerPlayer, Component.text("§6[月华市场]§a你的商品" + itemName + "被购买了，获得了§b" + price + "§a元"));
                            } else {
                                Scheduler.async(() -> {
                                    int count = SQL.retrieveShiChangMoney(seller);
                                    SQL.storeShiChangMoney(seller, count + price);
                                });
                            }

                        }
                    }
                }


            }


            case "§b护甲配方[战][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeZhan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanArmor2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanarmorContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[战][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanarmorContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b护甲配方[战][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanArmor));
                }
            }

            case "§b护甲配方[战][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanArmor));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanarmorContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[战][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanarmorContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b护甲配方[战][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanArmor2));
                }
            }

            case "§b护甲配方[弓][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeGong));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongArmor2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongarmorContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[弓][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongarmorContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b护甲配方[弓][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongArmor));
                }
            }

            case "§b护甲配方[弓][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongArmor));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongarmorContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[弓][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongarmorContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b护甲配方[弓][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongArmor2));
                }
            }

            case "§b护甲配方[丹][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeDan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danArmor2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danarmorContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[丹][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danarmorContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b护甲配方[丹][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danArmor));
                }
            }

            case "§b护甲配方[丹][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danArmor));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danarmorContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b护甲配方[丹][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danarmorContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b护甲配方[丹][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danArmor2));
                }
            }

            case "§b武器配方[战][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeZhan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanWeapon2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[战][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b武器配方[战][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanWeapon));
                }
            }

            case "§b武器配方[战][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanWeapon));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[战][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b武器配方[战][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanWeapon2));
                }
            }

            case "§b武器配方[弓][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeGong));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongWeapon2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[弓][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b武器配方[弓][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongWeapon));
                }
            }

            case "§b武器配方[弓][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongWeapon));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[弓][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b武器配方[弓][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongWeapon2));
                }
            }

            case "§b武器配方[丹][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeDan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danWeapon2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[丹][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b武器配方[丹][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danWeapon));
                }
            }

            case "§b武器配方[丹][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danWeapon));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b武器配方[丹][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b武器配方[丹][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danWeapon2));
                }
            }

            case "§b副武器配方[战][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeZhan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanBiWeapon2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanbiweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[战][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanbiweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b副武器配方[战][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanBiWeapon));
                }
            }

            case "§b副武器配方[战][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanBiWeapon));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanbiweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[战][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanbiweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b副武器配方[战][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanBiWeapon2));
                }
            }

            case "§b副武器配方[弓][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeGong));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongBiWeapon2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongbiweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[弓][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongbiweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b副武器配方[弓][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongBiWeapon));
                }
            }

            case "§b副武器配方[弓][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongBiWeapon));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongbiweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[弓][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongbiweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b副武器配方[弓][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongBiWeapon2));
                }
            }

            case "§b副武器配方[丹][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeDan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danBiWeapon2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danbiweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[丹][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danbiweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b副武器配方[丹][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danBiWeapon));
                }
            }

            case "§b副武器配方[丹][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danBiWeapon));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danbiweaponContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b副武器配方[丹][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danbiweaponContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b副武器配方[丹][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danBiWeapon2));
                }
            }


            case "§b法宝配方[战][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeZhan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanFaBao2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanfabaoContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[战][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanfabaoContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b法宝配方[战][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanFaBao));
                }
            }

            case "§b法宝配方[战][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanFaBao));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanfabaoContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[战][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanfabaoContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b法宝配方[战][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanFaBao2));
                }
            }

            case "§b法宝配方[弓][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeGong));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongFaBao2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongfabaoContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[弓][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongfabaoContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b法宝配方[弓][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongFaBao));
                }
            }

            case "§b法宝配方[弓][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongFaBao));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongfabaoContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[弓][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongfabaoContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b法宝配方[弓][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongFaBao2));
                }
            }

            case "§b法宝配方[丹][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeDan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danFaBao2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danfabaoContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[丹][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danfabaoContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b法宝配方[丹][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danFaBao));
                }
            }

            case "§b法宝配方[丹][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danFaBao));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danfabaoContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b法宝配方[丹][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danfabaoContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b法宝配方[丹][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danFaBao2));
                }
            }

            case "§b异器配方[战][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeZhan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanYiQi2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanyiqiContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[战][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanyiqiContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b异器配方[战][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanYiQi));
                }
            }

            case "§b异器配方[战][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanYiQi));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.zhanyiqiContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[战][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.zhanyiqiContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b异器配方[战][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.zhanYiQi2));
                }
            }

            case "§b异器配方[弓][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeGong));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongYiQi2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongyiqiContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[弓][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongyiqiContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b异器配方[弓][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongYiQi));
                }
            }

            case "§b异器配方[弓][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongYiQi));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.gongyiqiContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[弓][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.gongyiqiContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b异器配方[弓][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.gongYiQi2));
                }
            }

            case "§b异器配方[丹][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(DuanZao.recipeDan));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danYiQi2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danyiqiContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[丹][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danyiqiContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b异器配方[丹][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danYiQi));
                }
            }

            case "§b异器配方[丹][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danYiQi));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danyiqiContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b异器配方[丹][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danyiqiContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b异器配方[丹][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.danYiQi2));
                }
            }

            case "§b饰品配方[第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    Data data = Yuehua.playerData.get(player.getUniqueId());
                    PlaySound.openInventory(player);
                    switch (data.job) {
                        case 1 -> Scheduler.sync(() -> player.openInventory(DuanZao.recipeZhan));
                        case 2 -> Scheduler.sync(() -> player.openInventory(DuanZao.recipeGong));
                        case 3 -> Scheduler.sync(() -> player.openInventory(DuanZao.recipeDan));
                    }
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.shipin2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.shipinContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b饰品配方[第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.shipinContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b饰品配方[第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.shipin));
                }
            }

            case "§b饰品配方[第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.shipin));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.shipinContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b饰品配方[第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.shipinContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b饰品配方[第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.shipin2));
                }
            }

            case "§b丹药配方[第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeAllDan2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b丹药配方[第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeAllDan));
                }
            }

            case "§b丹药配方[第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeAllDan));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.danContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.danContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b丹药配方[第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeAllDan2));
                }
            }

            case "§b丹药配方[仅炼丹][第一页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Yh.MAIN_MENU));
                    return;
                }
                if (slot == 0) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeDanDan2));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.dandanContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[仅炼丹][第一页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.dandanContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b丹药配方[仅炼丹][第一页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeDanDan));
                }
            }

            case "§b丹药配方[仅炼丹][第二页]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }

                event.setCancelled(true);

                int slot = event.getRawSlot();
                if (slot == 53) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeDanDan));
                    return;
                }

                if (slot > 0 && slot < 53) {
                    ItemStack itemStack = event.getCurrentItem();
                    if (itemStack == null) {
                        return;
                    }

                    String id = itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                    Inventory recipe = Recipe.dandanContents.get(id);
                    if (recipe == null) {
                        Inventory inventory = Bukkit.createInventory(null, 18, Component.text("§b丹药配方[仅炼丹][第二页][详情]"));
                        inventory.setItem(17, Yh.BACK_BEFORE);
                        Recipe.dandanContents.put(id, inventory);

                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(inventory));
                    } else {
                        PlaySound.openInventory(player);
                        Scheduler.sync(() -> player.openInventory(recipe));
                    }
                }
            }

            case "§b丹药配方[仅炼丹][第二页][详情]" -> {
                Player player = (Player) event.getWhoClicked();
                if (player.getScoreboardTags().contains("edit")) {
                    return;
                }
                event.setCancelled(true);
                int slot = event.getRawSlot();
                if (slot == 17) {
                    PlaySound.openInventory(player);
                    Scheduler.sync(() -> player.openInventory(Recipe.recipeDanDan2));
                }
            }


        }


    }

    public static void showItem(Player player, ItemStack itemStack) {
        String playerName = player.getName();

        // 创建悬停内容
        Component hoverContent = Component.empty();

        // 添加物品名称
        if (itemStack.hasItemMeta() && itemStack.getItemMeta().hasDisplayName()) {
            hoverContent = hoverContent.append(
                    Component.text(itemStack.getItemMeta().getDisplayName() + "\n")
            );
        }

        // 添加Lore
        if (itemStack.hasItemMeta() && itemStack.getItemMeta().hasLore()) {
            List<String> lore = itemStack.getItemMeta().getLore();
            if (lore != null) {
                for (String loreLine : lore) {
                    hoverContent = hoverContent.append(
                            Component.text(loreLine + "\n")
                    );
                }
            }
        }

        // 创建悬停事件
        HoverEvent<Component> hoverEvent = HoverEvent.showText(hoverContent);

        // 创建文本组件
        Component text = Component.text("§b" + playerName + "§f展示： ")
                .append(itemStack.displayName())
                .hoverEvent(hoverEvent);

        SendInformation.broadcastMes(text);

    }

    public static void lunhuizhuanshi(Data data, Player player) {
        PlayerInventory playerInventory = player.getInventory();
        if (!playerInventory.isEmpty()) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4转生要求背包必须清空"));
            return;
        }
        if (data.money < 500) {
            SendInformation.sendMes(player, Component.text("§e[游戏机制]§4余额不足"));
            return;
        }

        data.money = data.money - 500;

        player.teleport(LocationSet.CHU_SHENG_DIAN);
        player.setRespawnLocation(LocationSet.CHU_SHENG_DIAN);

    }


    public static int extractNumbers(String input) {
        StringBuilder numbers = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+");  // 正则表达式匹配数字
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            numbers.append(matcher.group());
        }
        return Integer.parseInt(numbers.toString());  // 将字符串转换成整数
    }

    public static Set<String> noMoneyToStore = Set.of("MONEY_SHEN", "MONEY_XIAN", "MONEY_REN", "MONEY_YAO", "MONEY_ZHANSHEN",
            "bagging_jin", "bagging_mu", "bagging_shui", "bagging_huo", "bagging_tu", "yuansuzhihuan");

    public static void store(String id, Data data, ItemStack itemStack) {
        if (noMoneyToStore.contains(id)) {
            return;
        }

        int amount = itemStack.getAmount();
        itemStack.setAmount(0);

        switch (id) {
            case "jin" -> data.jinCount += amount;
            case "mu" -> data.muCount += amount;
            case "shui" -> data.shuiCount += amount;
            case "huo" -> data.huoCount += amount;
            case "tu" -> data.tuCount += amount;
            case "refined_jin" -> data.refinedJinCount += amount;
            case "refined_mu" -> data.refinedMuCount += amount;
            case "refined_shui" -> data.refinedShuiCount += amount;
            case "refined_huo" -> data.refinedHuoCount += amount;
            case "refined_tu" -> data.refinedTuCount += amount;
            case "concentrated_jin" -> data.concentratedJinCount += amount;
            case "concentrated_mu" -> data.concentratedMuCount += amount;
            case "concentrated_shui" -> data.concentratedShuiCount += amount;
            case "concentrated_huo" -> data.concentratedHuoCount += amount;
            case "concentrated_tu" -> data.concentratedTuCount += amount;
            case "tongQian" -> data.money += amount;
            case "jinYuanBao" -> data.money += amount * 10;
            case "yinPiao" -> data.money += amount * 100;
            case "zuanShi" -> data.money += amount * 1000;
        }
    }


    public ItemStack idToYushi(String id) {
        ItemStack itemStack = switch (id) {
            case "xueseshi1" -> YuShi.XUE_SE_SHI1.clone();
            case "xueseshi2" -> YuShi.XUE_SE_SHI2.clone();
            case "xueseshi3" -> YuShi.XUE_SE_SHI3.clone();
            case "xueseshi4" -> YuShi.XUE_SE_SHI4.clone();
            case "xueseshi5" -> YuShi.XUE_SE_SHI5.clone();
            case "xueseshi6" -> YuShi.XUE_SE_SHI6.clone();
            case "xueseshi7" -> YuShi.XUE_SE_SHI7.clone();
            case "xueseshi8" -> YuShi.XUE_SE_SHI8.clone();

            case "cuilvshi1" -> YuShi.CUI_LV_SHI1.clone();
            case "cuilvshi2" -> YuShi.CUI_LV_SHI2.clone();
            case "cuilvshi3" -> YuShi.CUI_LV_SHI3.clone();
            case "cuilvshi4" -> YuShi.CUI_LV_SHI4.clone();
            case "cuilvshi5" -> YuShi.CUI_LV_SHI5.clone();
            case "cuilvshi6" -> YuShi.CUI_LV_SHI6.clone();
            case "cuilvshi7" -> YuShi.CUI_LV_SHI7.clone();
            case "cuilvshi8" -> YuShi.CUI_LV_SHI8.clone();

            case "dianlanshi1" -> YuShi.DIAN_LAN_SHI1.clone();
            case "dianlanshi2" -> YuShi.DIAN_LAN_SHI2.clone();
            case "dianlanshi3" -> YuShi.DIAN_LAN_SHI3.clone();
            case "dianlanshi4" -> YuShi.DIAN_LAN_SHI4.clone();
            case "dianlanshi5" -> YuShi.DIAN_LAN_SHI5.clone();
            case "dianlanshi6" -> YuShi.DIAN_LAN_SHI6.clone();
            case "dianlanshi7" -> YuShi.DIAN_LAN_SHI7.clone();
            case "dianlanshi8" -> YuShi.DIAN_LAN_SHI8.clone();

            case "jinhuangshi1" -> YuShi.JIN_HUANG_SHI1.clone();
            case "jinhuangshi2" -> YuShi.JIN_HUANG_SHI2.clone();
            case "jinhuangshi3" -> YuShi.JIN_HUANG_SHI3.clone();
            case "jinhuangshi4" -> YuShi.JIN_HUANG_SHI4.clone();
            case "jinhuangshi5" -> YuShi.JIN_HUANG_SHI5.clone();
            case "jinhuangshi6" -> YuShi.JIN_HUANG_SHI6.clone();
            case "jinhuangshi7" -> YuShi.JIN_HUANG_SHI7.clone();
            case "jinhuangshi8" -> YuShi.JIN_HUANG_SHI8.clone();

            case "houtushi1" -> YuShi.HOU_TU_SHI1.clone();
            case "houtushi2" -> YuShi.HOU_TU_SHI2.clone();
            case "houtushi3" -> YuShi.HOU_TU_SHI3.clone();
            case "houtushi4" -> YuShi.HOU_TU_SHI4.clone();
            case "houtushi5" -> YuShi.HOU_TU_SHI5.clone();
            case "houtushi6" -> YuShi.HOU_TU_SHI6.clone();
            case "houtushi7" -> YuShi.HOU_TU_SHI7.clone();
            case "houtushi8" -> YuShi.HOU_TU_SHI8.clone();

            case "zijingshi1" -> YuShi.ZI_JING_SHI1.clone();
            case "zijingshi2" -> YuShi.ZI_JING_SHI2.clone();
            case "zijingshi3" -> YuShi.ZI_JING_SHI3.clone();
            case "zijingshi4" -> YuShi.ZI_JING_SHI4.clone();
            case "zijingshi5" -> YuShi.ZI_JING_SHI5.clone();
            case "zijingshi6" -> YuShi.ZI_JING_SHI6.clone();
            case "zijingshi7" -> YuShi.ZI_JING_SHI7.clone();
            case "zijingshi8" -> YuShi.ZI_JING_SHI8.clone();

            case "tulushi1" -> YuShi.TU_LU_SHI1.clone();
            case "tulushi2" -> YuShi.TU_LU_SHI2.clone();
            case "tulushi3" -> YuShi.TU_LU_SHI3.clone();
            case "tulushi4" -> YuShi.TU_LU_SHI4.clone();
            case "tulushi5" -> YuShi.TU_LU_SHI5.clone();
            case "tulushi6" -> YuShi.TU_LU_SHI6.clone();
            case "tulushi7" -> YuShi.TU_LU_SHI7.clone();
            case "tulushi8" -> YuShi.TU_LU_SHI8.clone();

            case "hongyueshi1" -> YuShi.HONG_YUE_SHI1.clone();
            case "hongyueshi2" -> YuShi.HONG_YUE_SHI2.clone();
            case "hongyueshi3" -> YuShi.HONG_YUE_SHI3.clone();
            case "hongyueshi4" -> YuShi.HONG_YUE_SHI4.clone();
            case "hongyueshi5" -> YuShi.HONG_YUE_SHI5.clone();
            case "hongyueshi6" -> YuShi.HONG_YUE_SHI6.clone();
            case "hongyueshi7" -> YuShi.HONG_YUE_SHI7.clone();
            case "hongyueshi8" -> YuShi.HONG_YUE_SHI8.clone();

            case "miyinshi1" -> YuShi.MI_YIN_SHI1.clone();
            case "miyinshi2" -> YuShi.MI_YIN_SHI2.clone();
            case "miyinshi3" -> YuShi.MI_YIN_SHI3.clone();
            case "miyinshi4" -> YuShi.MI_YIN_SHI4.clone();
            case "miyinshi5" -> YuShi.MI_YIN_SHI5.clone();
            case "miyinshi6" -> YuShi.MI_YIN_SHI6.clone();
            case "miyinshi7" -> YuShi.MI_YIN_SHI7.clone();
            case "miyinshi8" -> YuShi.MI_YIN_SHI8.clone();

            case "yulushi1" -> YuShi.YU_LU_SHI1.clone();
            case "yulushi2" -> YuShi.YU_LU_SHI2.clone();
            case "yulushi3" -> YuShi.YU_LU_SHI3.clone();
            case "yulushi4" -> YuShi.YU_LU_SHI4.clone();
            case "yulushi5" -> YuShi.YU_LU_SHI5.clone();
            case "yulushi6" -> YuShi.YU_LU_SHI6.clone();
            case "yulushi7" -> YuShi.YU_LU_SHI7.clone();
            case "yulushi8" -> YuShi.YU_LU_SHI8.clone();

            case "bingshuangshi1" -> YuShi.BING_SHUANG_SHI1.clone();
            case "bingshuangshi2" -> YuShi.BING_SHUANG_SHI2.clone();
            case "bingshuangshi3" -> YuShi.BING_SHUANG_SHI3.clone();
            case "bingshuangshi4" -> YuShi.BING_SHUANG_SHI4.clone();
            case "bingshuangshi5" -> YuShi.BING_SHUANG_SHI5.clone();
            case "bingshuangshi6" -> YuShi.BING_SHUANG_SHI6.clone();
            case "bingshuangshi7" -> YuShi.BING_SHUANG_SHI7.clone();
            case "bingshuangshi8" -> YuShi.BING_SHUANG_SHI8.clone();

            case "yanyangshi1" -> YuShi.YAN_YANG_SHI1.clone();
            case "yanyangshi2" -> YuShi.YAN_YANG_SHI2.clone();
            case "yanyangshi3" -> YuShi.YAN_YANG_SHI3.clone();
            case "yanyangshi4" -> YuShi.YAN_YANG_SHI4.clone();
            case "yanyangshi5" -> YuShi.YAN_YANG_SHI5.clone();
            case "yanyangshi6" -> YuShi.YAN_YANG_SHI6.clone();
            case "yanyangshi7" -> YuShi.YAN_YANG_SHI7.clone();
            case "yanyangshi8" -> YuShi.YAN_YANG_SHI8.clone();

            case "suiyanshi1" -> YuShi.SUI_YAN_SHI1.clone();
            case "suiyanshi2" -> YuShi.SUI_YAN_SHI2.clone();
            case "suiyanshi3" -> YuShi.SUI_YAN_SHI3.clone();
            case "suiyanshi4" -> YuShi.SUI_YAN_SHI4.clone();
            case "suiyanshi5" -> YuShi.SUI_YAN_SHI5.clone();
            case "suiyanshi6" -> YuShi.SUI_YAN_SHI6.clone();
            case "suiyanshi7" -> YuShi.SUI_YAN_SHI7.clone();
            case "suiyanshi8" -> YuShi.SUI_YAN_SHI8.clone();

            default -> null;
        };
        return itemStack;
    }


}
