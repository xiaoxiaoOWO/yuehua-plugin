package com.xiaoxiaoowo.yuehua.event.Inventory;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.commands.playercommand.Yh;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.event.player.Join;
import com.xiaoxiaoowo.yuehua.itemstack.Book;
import com.xiaoxiaoowo.yuehua.itemstack.dz.YuShi;
import com.xiaoxiaoowo.yuehua.itemstack.other.Other;
import com.xiaoxiaoowo.yuehua.itemstack.other.RaceProvince;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import com.xiaoxiaoowo.yuehua.system.dz.*;
import com.xiaoxiaoowo.yuehua.utils.*;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public final class Click implements Listener {
    public static int extractNumbers(String input) {
        StringBuilder numbers = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+");  // 正则表达式匹配数字
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            numbers.append(matcher.group());
        }
        return Integer.parseInt(numbers.toString());  // 将字符串转换成整数
    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        String title = event.getView().getOriginalTitle();
        switch (title) {
            case "§b主菜单" -> {
                event.setCancelled(true);
                Player whoClicked = (Player) event.getWhoClicked();
                switch (event.getRawSlot()) {
                    case 0 -> Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) == 0) {
                            PlaySound.openInventory(whoClicked);
                            whoClicked.openInventory(Yh.QIAN_KUN_BAG);
                        } else {
                            Scheduler.async(() -> whoClicked.sendMessage(Component.text("§6[菜单系统]§4禁止在副本/试炼中使用乾坤盒")));
                            whoClicked.closeInventory();
                        }
                    });


                    case 2 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        Yuehua.scheduler.runTaskAsynchronously(
                                Yuehua.instance, () -> {
                                    if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                                        SendInformation.sendMes(Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能"), whoClicked);
                                        whoClicked.closeInventory();
                                        return;
                                    }
                                    if (data.shipinBar == null) {
                                        data.shipinBar = SQL.retrieveShipin(whoClicked);
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.shipinBar);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }
                        );
                    }


                    case 4 -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                            SendInformation.sendMes(Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能"), whoClicked);
                            whoClicked.closeInventory();
                            return;
                        }
                        PlaySound.openInventory(whoClicked);
                        whoClicked.openInventory(Yuehua.shichang.get(0));
                    }

                    case 6 -> {
                        whoClicked.closeInventory();
                        List<Component> messages = new ArrayList<>(30);
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        messages.add(Component.text("§6[个人数据]§a近战伤害：§b" + data.attack + "   §a暴击率：§b" + data.baoji * 100 + "   §a暴击效果：§b" + data.baojixiaoguo * 100));
                        messages.add(Component.text("§6[个人数据]§a护甲：§b" + data.hujia * 100 + "   §a法抗：§b" + data.fakang * 100 + "   §a格挡：§b" + data.gedang));
                        messages.add(Component.text("§6[个人数据]§a韧性：§b" + data.renxing * 100 + "   §a生机：§b" + data.shengji * 100 + "   §a冷却缩减：§b" + data.cool_reduce * 100));
                        messages.add(Component.text("§6[个人数据]§a毒伤免疫：§b" + data.dumian * 100 + "   §a火伤免疫：§b" + data.huomian * 100 + "   §a冰伤免疫：§b" + data.bingmian * 100));
                        messages.add(Component.text("§6[个人数据]§a箭伤免疫：§b" + data.jianmian * 100 + "   §a三叉戟伤免疫：§b" + data.sanchajimian * 100 + "   §a摔落减免：§b" + data.shuailuomian * 100));
                        messages.add(Component.text("§6[个人数据]§a破甲：§b" + data.pojia * 100 + "   §a破法：§b" + data.pofa * 100 + "   §a守护：§b" + data.shouhu));
                        messages.add(Component.text("§6[个人数据]§a攻击速度：§b" + whoClicked.getAttribute(Attribute.GENERIC_ATTACK_SPEED).getValue() + "   §a移动速度：§b" + String.format("%.2f", whoClicked.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue()) + "   §a定力：§b" + whoClicked.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).getValue()));
                        messages.add(Component.text("§6[个人数据]§a攻击距离：§b" + whoClicked.getAttribute(Attribute.PLAYER_ENTITY_INTERACTION_RANGE).getValue() + "   §a跳跃力：§b" + whoClicked.getAttribute(Attribute.GENERIC_JUMP_STRENGTH).getValue() + "   §a最大生命：§b" + whoClicked.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()));


                        switch (data.job) {
                            case 1 -> {
                            }
                            case 2 -> {
                                GongData gongData = (GongData) data;
                                messages.add(Component.text("§6[个人数据][弓箭手]§a箭矢强度：§b" + gongData.arrow + "   §a箭不消耗率：§b" + gongData.arrow_no_cost * 100 + "   §a穿透箭率：§b" + gongData.arrow_pierce * 100));
                            }
                            case 3 -> {
                                DanData danData = (DanData) data;
                                messages.add(Component.text("§6[个人数据][炼丹师]§a阵法强度：§b" + danData.zhenfa + "   §a普通元素不消耗率：§b" + danData.noCost1 * 100 + "   §a精炼元素不消耗率：§b" + danData.noCost2 * 100 + "   §a浓缩元素不消耗率：§b" + danData.noCost3 * 100));
                            }
                        }

                        SendInformation.sendMes(messages, whoClicked);
                    }

                    case 8 -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) != 0) {
                            SendInformation.sendMes(Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能"), whoClicked);
                            whoClicked.closeInventory();
                            return;
                        }
                        PlaySound.openInventory(whoClicked);
                        whoClicked.openInventory(Yh.CHONG_HUA);
                    }

                    case 10 -> {
                        if (whoClicked.getPersistentDataContainer().get(DataContainer.fuben, PersistentDataType.INTEGER) == 0) {
                            PlaySound.openInventory(whoClicked);
                            whoClicked.openInventory(Yh.ZA_XIANG);
                        } else {
                            Scheduler.async(() -> whoClicked.sendMessage(Component.text("§6[菜单系统]§4禁止在副本/试炼中使用此功能")));
                            whoClicked.closeInventory();

                        }
                    }

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

                    case 3 -> {
                        whoClicked.getInventory().addItem(Book.YUE_HUA);
                    }

                    case 4 -> whoClicked.getInventory().addItem(Other.NPC_PAOPAO);

                    case 5 -> {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        switch (data.race) {
                            case 1 -> whoClicked.getInventory().addItem(RaceProvince.shen);
                            case 2 -> whoClicked.getInventory().addItem(RaceProvince.xian);
                            case 3 -> whoClicked.getInventory().addItem(RaceProvince.ren);
                            case 4 -> whoClicked.getInventory().addItem(RaceProvince.yao);
                            case 5 -> whoClicked.getInventory().addItem(RaceProvince.zhanShen);
                        }

                    }

                    case 8 -> {
                        Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                            PlaySound.openInventory(whoClicked);
                            whoClicked.openInventory(Yh.MAIN_MENU);
                        });
                    }
                }
            }

            case "§b乾坤盒" -> {
                event.setCancelled(true);
                Player whoClicked = (Player) event.getWhoClicked();
                Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                Yuehua.scheduler.runTaskAsynchronously(
                        Yuehua.instance, () -> {
                            switch (event.getRawSlot()) {
                                case 0 -> {
                                    if (data.inventory1 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd1")) {
                                            data.inventory1 = SQL.retrievePlayerInventory1(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory1);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );

                                }
                                case 1 -> {
                                    if (data.inventory2 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd2")) {
                                            data.inventory2 = SQL.retrievePlayerInventory2(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory2);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 2 -> {
                                    if (data.inventory3 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd3")) {
                                            data.inventory3 = SQL.retrievePlayerInventory3(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory3);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 3 -> {
                                    if (data.inventory4 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd4")) {
                                            data.inventory4 = SQL.retrievePlayerInventory4(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory4);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 4 -> {
                                    if (data.inventory5 == null) {

                                        if (whoClicked.getScoreboardTags().contains("qkd5")) {
                                            data.inventory5 = SQL.retrievePlayerInventory5(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory5);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 5 -> {
                                    if (data.inventory6 == null) {

                                        if (whoClicked.getScoreboardTags().contains("qkd6")) {
                                            data.inventory6 = SQL.retrievePlayerInventory6(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory6);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 6 -> {
                                    if (data.inventory7 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd7")) {
                                            data.inventory7 = SQL.retrievePlayerInventory7(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory7);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 7 -> {
                                    if (data.inventory8 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd8")) {
                                            data.inventory8 = SQL.retrievePlayerInventory8(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory8);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 8 -> {
                                    if (data.inventory9 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd9")) {
                                            data.inventory9 = SQL.retrievePlayerInventory9(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory9);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 9 -> {
                                    if (data.inventory10 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd10")) {
                                            data.inventory10 = SQL.retrievePlayerInventory10(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory10);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 10 -> {
                                    if (data.inventory11 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd11")) {
                                            data.inventory11 = SQL.retrievePlayerInventory11(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory11);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 11 -> {
                                    if (data.inventory12 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd12")) {
                                            data.inventory12 = SQL.retrievePlayerInventory12(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory12);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 12 -> {
                                    if (data.inventory13 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd13")) {
                                            data.inventory13 = SQL.retrievePlayerInventory13(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory13);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 13 -> {
                                    if (data.inventory14 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd14")) {
                                            data.inventory14 = SQL.retrievePlayerInventory14(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory14);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 14 -> {
                                    if (data.inventory15 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd15")) {
                                            data.inventory15 = SQL.retrievePlayerInventory15(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory15);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 15 -> {
                                    if (data.inventory16 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd16")) {
                                            data.inventory16 = SQL.retrievePlayerInventory16(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory16);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 16 -> {
                                    if (data.inventory17 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd17")) {
                                            data.inventory17 = SQL.retrievePlayerInventory17(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory17);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 17 -> {
                                    if (data.inventory18 == null) {
                                        if (whoClicked.getScoreboardTags().contains("qkd18")) {
                                            data.inventory18 = SQL.retrievePlayerInventory18(whoClicked);
                                        } else {
                                            whoClicked.sendMessage(Component.text("§6[菜单系统]§4此乾坤盒还未开启"));
                                            Yuehua.scheduler.runTask(
                                                    Yuehua.instance, () -> {
                                                        whoClicked.closeInventory();
                                                    }
                                            );
                                            return;
                                        }
                                    }
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(data.inventory18);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }

                                case 26 -> {
                                    Yuehua.scheduler.runTask(
                                            Yuehua.instance, () -> {
                                                whoClicked.openInventory(Yh.MAIN_MENU);
                                                PlaySound.openInventory(whoClicked);
                                            }
                                    );
                                }
                            }


                        }
                );

            }

            //一到十八
            case "§b乾坤盒☯一", "§b乾坤盒☯二", "§b乾坤盒☯三", "§b乾坤盒☯四", "§b乾坤盒☯五", "§b乾坤盒☯六",
                 "§b乾坤盒☯七", "§b乾坤盒☯八", "§b乾坤盒☯九",
                 "§b乾坤盒☯十", "§b乾坤盒☯十一", "§b乾坤盒☯十二", "§b乾坤盒☯十三", "§b乾坤盒☯十四", "§b乾坤盒☯十五",
                 "§b乾坤盒☯十六", "§b乾坤盒☯十七", "§b乾坤盒☯十八" -> {
                if (event.getRawSlot() == 53) {
                    event.setCancelled(true);
                    Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                        Player whoClicked = (Player) event.getWhoClicked();
                        PlaySound.openInventory(whoClicked);
                        whoClicked.openInventory(Yh.QIAN_KUN_BAG);
                    });
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
                            Yuehua.scheduler.runTask(
                                    Yuehua.instance, () -> {
                                        whoClicked.closeInventory();
                                    }
                            );
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
                        Yuehua.scheduler.runTask(
                                Yuehua.instance, () -> {
                                    whoClicked.sendMessage(Component.text("§6[菜单系统]§4饰品槽只能放入饰品"));
                                    whoClicked.closeInventory();
                                }
                        );
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
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.MIDDLE);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.MIDDLE) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 1);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 1 -> {
                        if (tags.contains("chonghua" + 2)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.LONG_XU_ZHEN);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.LONG_XU_ZHEN) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 2);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 2 -> {
                        if (tags.contains("chonghua" + 3)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHAN_SHEN_MIAO);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHAN_SHEN_MIAO) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 3);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 3 -> {
                        if (tags.contains("chonghua" + 4)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.QING_LONG_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.QING_LONG_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 4);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }
                    case 4 -> {
                        if (tags.contains("chonghua" + 5)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHA_MO_KE_ZHAN);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHA_MO_KE_ZHAN) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 5);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 5 -> {
                        if (tags.contains("chonghua" + 6)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHA_MO_CUN_ZHUANG);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHA_MO_CUN_ZHUANG) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 6);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 6 -> {
                        if (tags.contains("chonghua" + 7)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§a重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.ZHU_QUE_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.ZHU_QUE_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 7);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 7 -> {
                        if (tags.contains("chonghua" + 8)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.CHEN_DA_FU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.CHEN_DA_FU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 8);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 8 -> {
                        if (tags.contains("chonghua" + 9)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHAN_DONG_CUN_ZHUANG);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHAN_DONG_CUN_ZHUANG) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 9);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 9 -> {
                        if (tags.contains("chonghua" + 10)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.BAI_HU_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.BAI_HU_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 10);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 10 -> {
                        if (tags.contains("chonghua" + 11)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHUI_ZU_CUN_ZHUANG);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHUI_ZU_CUN_ZHUANG) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 11);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 11 -> {
                        if (tags.contains("chonghua" + 12)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.PENG_LAI_DU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.PENG_LAI_DU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 12);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 12 -> {
                        if (tags.contains("chonghua" + 13)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.XUAN_WU_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.XUAN_WU_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 13);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 13 -> {
                        if (tags.contains("chonghua" + 14)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHI_HUANG_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHI_HUANG_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 14);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 14 -> {
                        if (tags.contains("chonghua" + 15)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.HUO_MO_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.HUO_MO_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 15);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 15 -> {
                        if (tags.contains("chonghua" + 16)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.DA_SHI_JIE_ZHEN_YAO_TA);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.DA_SHI_JIE_ZHEN_YAO_TA) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 16);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 16 -> {
                        if (tags.contains("chonghua" + 17)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.KU_GU_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.KU_GU_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 17);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }

                    case 17 -> {
                        if (tags.contains("chonghua" + 18)) {
                            Long time = GetEntity.world.getGameTime();
                            PersistentDataContainer pdc = whoClicked.getPersistentDataContainer();
                            if (pdc.get(DataContainer.chonghuacd, PersistentDataType.LONG) > time) {
                                whoClicked.sendMessage(Component.text("§6[菜单系统]§4重画晶冷却中"));
                                return;
                            }
                            whoClicked.teleportAsync(LocationSet.SHENG_SHAN_RU_KOU);

                            switch (pdc.get(DataContainer.chonghualevel, PersistentDataType.INTEGER)) {
                                case 1 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 5L);
                                case 2 ->
                                        pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60 * 2L);
                                case 3 -> pdc.set(DataContainer.chonghuacd, PersistentDataType.LONG, time + 20 * 60L);
                                default -> {
                                }
                            }
                        } else {
                            //判断是否在Location附件
                            if (whoClicked.getLocation().distanceSquared(LocationSet.SHENG_SHAN_RU_KOU) < 50) {
                                whoClicked.addScoreboardTag("chonghua" + 18);
                                SendInformation.sendMes(Component.text("§6[菜单系统]§a重画晶激活"), whoClicked);
                            } else {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4你没有在重华晶激活点附近"), whoClicked);
                            }
                        }
                    }


                    case 35 -> Yuehua.scheduler.runTask(Yuehua.instance, () -> {
                        PlaySound.openInventory(whoClicked);
                        whoClicked.openInventory(Yh.MAIN_MENU);
                    });
                }

            }

            case "§b锻造台" -> {
                if (event.getRawSlot() == 8) {
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
                    TieJiangPu.dz(inv, id);

                }
            }

            case "§b法宝锻造台" -> {
                if (event.getRawSlot() == 8) {
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
                    Fabao.dz(inv, id);

                }
            }

            case "§b饰品锻造台" -> {
                if (event.getRawSlot() == 8) {
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
                    Shipin.dz(inv, id);
                }
            }

            case "§b异器锻造台" -> {
                if (event.getRawSlot() == 8) {
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
                    Yiqi.dz(inv, id);

                }
            }

            case "§b公用炼丹炉" -> {
                if (event.getRawSlot() != 8) {
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
                LianDan.liandan(inv, id);
            }

            case "§b黑铁锅", "§b青铜锅", "§b炼丹炉", "§b锁魂炉", "§b七煞鼎", "§b混元神鼎" -> {
                if (event.getRawSlot() != 8) {
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
                LianDan.danshiLiandan(inv, id);
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
                if (!pdc1.has(DataContainer.insertid)) {
                    return;
                }
                if (!Check.checkFuling(idFuling, slot)) {
                    return;
                }
                pdc1.set(DataContainer.enchantid, PersistentDataType.STRING, idFuling);
                if (idFuling.equals("bujin4")) {
                    itemMeta1.addEnchant(Enchantment.INFINITY, 1, true);
                }
                List<Component> lore2 = itemMeta2.lore();
                Component loreFuling = lore2.get(1);
                List<Component> lore = itemMeta1.lore();
                Component loreYushi = lore.removeLast();
                lore.removeLast();
                lore.add(Component.text("§a附灵: ").append(loreFuling));
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
                            SendInformation.sendMes(Component.text("§6[镶嵌系统]§4只能用玉石镶嵌"), whoClicked);
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
                                SendInformation.sendMes(Component.text("§6[镶嵌系统]§4需要先拆卸已镶嵌的玉石"), whoClicked);
                            } else {
                                ItemMeta itemMeta2 = item2.getItemMeta();
                                String idYuShi = itemMeta2.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING);
                                if (!Check.checkYushi(idYuShi, pdc1.get(DataContainer.slot, PersistentDataType.INTEGER))) {
                                    SendInformation.sendMes(Component.text("§6[镶嵌系统]§4此装备不可镶嵌此玉石"), whoClicked);
                                    return;
                                }

                                List<Component> lore2 = itemMeta2.lore();
                                lore2.removeLast();
                                Component shuxin = lore2.removeLast();

                                itemMeta1.getPersistentDataContainer().set(DataContainer.insertid, PersistentDataType.STRING, idYuShi);
                                List<Component> lore = itemMeta1.lore();
                                lore.removeLast();
                                lore.add(Component.text("§a镶嵌: ").append(shuxin));
                                itemMeta1.lore(lore);
                                item1.setItemMeta(itemMeta1);
                                inv.setItem(1, null);
                                PlaySound.insert(whoClicked);

                            }
                        } else {
                            //不可以镶嵌
                            SendInformation.sendMes(Component.text("§6[镶嵌系统]§4这个物品不可以镶嵌"), whoClicked);
                        }

                    } else {
                        // 卸下
                        ItemMeta itemMeta1 = item1.getItemMeta();
                        PersistentDataContainer pdc1 = itemMeta1.getPersistentDataContainer();
                        if (pdc1.has(DataContainer.insertid)) {
                            //可以镶嵌
                            String id = pdc1.get(DataContainer.insertid, PersistentDataType.STRING);
                            if (Objects.equals(id, "null")) {
                                SendInformation.sendMes(Component.text("§6[菜单系统]§4没有可以拆卸的玉石"), whoClicked);
                            } else {
                                pdc1.set(DataContainer.insertid, PersistentDataType.STRING, "null");
                                List<Component> lore = itemMeta1.lore();
                                lore.removeLast();
                                lore.add(Component.text("§a镶嵌: §f[无]"));
                                itemMeta1.lore(lore);
                                item1.setItemMeta(itemMeta1);
                                ItemStack itemStack = idToYushi(id);
                                itemStack.setAmount(1);
                                inv.setItem(1, itemStack);
                                PlaySound.insert(whoClicked);

                            }
                        } else {
                            SendInformation.sendMes(Component.text("§6[菜单系统]§4这个物品不可以拆除镶嵌"), whoClicked);
                        }
                    }


                }
            }


            case "§b全球市场[第1页]", "§b全球市场[第2页]", "§b全球市场[第3页]", "§b全球市场[第4页]",
                 "§b全球市场[第5页]", "§b全球市场[第6页]", "§b全球市场[第7页]", "§b全球市场[第8页]",
                 "§b全球市场[第9页]", "§b全球市场[第10页]",
                 "§b全球市场[第11页]", "§b全球市场[第12页]", "§b全球市场[第13页]", "§b全球市场[第14页]",
                 "§b全球市场[第15页]", "§b全球市场[第16页]", "§b全球市场[第17页]", "§b全球市场[第18页]",
                 "§b全球市场[第19页]", "§b全球市场[第20页]",
                 "§b全球市场[第21页]", "§b全球市场[第22页]", "§b全球市场[第23页]", "§b全球市场[第24页]",
                 "§b全球市场[第25页]", "§b全球市场[第26页]", "§b全球市场[第27页]", "§b全球市场[第28页]",
                 "§b全球市场[第29页]", "§b全球市场[第30页]",
                 "§b全球市场[第31页]", "§b全球市场[第32页]", "§b全球市场[第33页]", "§b全球市场[第34页]",
                 "§b全球市场[第35页]", "§b全球市场[第36页]", "§b全球市场[第37页]", "§b全球市场[第38页]",
                 "§b全球市场[第39页]", "§b全球市场[第40页]",
                 "§b全球市场[第41页]", "§b全球市场[第42页]", "§b全球市场[第43页]", "§b全球市场[第44页]",
                 "§b全球市场[第45页]", "§b全球市场[第46页]", "§b全球市场[第47页]", "§b全球市场[第48页]",
                 "§b全球市场[第49页]", "§b全球市场[第50页]",
                 "§b全球市场[第51页]", "§b全球市场[第52页]", "§b全球市场[第53页]", "§b全球市场[第54页]",
                 "§b全球市场[第55页]", "§b全球市场[第56页]", "§b全球市场[第57页]", "§b全球市场[第58页]",
                 "§b全球市场[第59页]", "§b全球市场[第60页]",
                 "§b全球市场[第61页]", "§b全球市场[第62页]", "§b全球市场[第63页]", "§b全球市场[第64页]",
                 "§b全球市场[第65页]", "§b全球市场[第66页]", "§b全球市场[第67页]", "§b全球市场[第68页]",
                 "§b全球市场[第69页]", "§b全球市场[第70页]",
                 "§b全球市场[第71页]", "§b全球市场[第72页]", "§b全球市场[第73页]", "§b全球市场[第74页]",
                 "§b全球市场[第75页]", "§b全球市场[第76页]", "§b全球市场[第77页]", "§b全球市场[第78页]",
                 "§b全球市场[第79页]", "§b全球市场[第80页]",
                 "§b全球市场[第81页]", "§b全球市场[第82页]", "§b全球市场[第83页]", "§b全球市场[第84页]",
                 "§b全球市场[第85页]", "§b全球市场[第86页]", "§b全球市场[第87页]", "§b全球市场[第88页]",
                 "§b全球市场[第89页]", "§b全球市场[第90页]",
                 "§b全球市场[第91页]", "§b全球市场[第92页]", "§b全球市场[第93页]", "§b全球市场[第94页]",
                 "§b全球市场[第95页]", "§b全球市场[第96页]", "§b全球市场[第97页]", "§b全球市场[第98页]",
                 "§b全球市场[第99页]", "§b全球市场[第100页]" -> {
                event.setCancelled(true);
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
                        whoClicked.openInventory(Yuehua.shichang.get(id));
                    } else {
                        if (id == 1) {
                            Player whoClicked = (Player) event.getWhoClicked();
                            PlaySound.openInventory(whoClicked);
                            whoClicked.openInventory(Yh.MAIN_MENU);
                            return;
                        }

                        Player whoClicked = (Player) event.getWhoClicked();
                        PlaySound.openInventory(whoClicked);
                        whoClicked.openInventory(Yuehua.shichang.get(id - 2));
                    }
                } else {
                    ItemMeta meta = clickItem.getItemMeta();
                    PersistentDataContainer pdc = meta.getPersistentDataContainer();
                    Player whoClicked = (Player) event.getWhoClicked();
                    String name = whoClicked.getName();
                    String seller = pdc.get(DataContainer.seller, PersistentDataType.STRING);
                    String itemName;
                    if (clickItem.hasDisplayName()) {
                        itemName = clickItem.getDisplayName();
                    } else {
                        itemName = "未命名商品";
                    }
                    int price = pdc.get(DataContainer.price, PersistentDataType.INTEGER);

                    //撤回上架商品
                    if (seller.equals(name)) {
                        List<Component> lores = meta.lore();
                        lores.removeLast();
                        lores.removeLast();
                        lores.removeLast();
                        lores.removeLast();
                        meta.lore(lores);
                        pdc.remove(DataContainer.seller);
                        pdc.remove(DataContainer.price);
                        clickItem.setItemMeta(meta);
                        whoClicked.getInventory().addItem(clickItem);
                        event.getClickedInventory().setItem(event.getRawSlot(), null);
                    } else
                    //购买
                    {
                        Data data = Yuehua.playerData.get(whoClicked.getUniqueId());
                        int money = data.money;
                        if (money < price) {
                            whoClicked.sendMessage(Component.text("§6[全球市场]§4你的余额不足"));
                        } else {
                            data.money -= price;
                            List<Component> lores = meta.lore();
                            lores.removeLast();
                            lores.removeLast();
                            lores.removeLast();
                            lores.removeLast();
                            meta.lore(lores);
                            pdc.remove(DataContainer.seller);
                            pdc.remove(DataContainer.price);
                            clickItem.setItemMeta(meta);
                            whoClicked.getInventory().addItem(clickItem);
                            event.getClickedInventory().setItem(event.getRawSlot(), null);
                            Player sellerPlayer = Bukkit.getPlayer(seller);
                            if (sellerPlayer != null && sellerPlayer.isOnline()) {
                                Yuehua.playerData.get(sellerPlayer.getUniqueId()).money += price;
                                SendInformation.sendMes(Component.text("§6[全球市场]§a你的商品" + itemName + "被购买了，获得了§b" + price + "§a元"), sellerPlayer);
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
