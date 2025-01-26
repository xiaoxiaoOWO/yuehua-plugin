package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.attribute.attributes.jingong.JingongAdd;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public final class ConsumeItem implements Listener {
    public static final PotionEffect shenmuling = new PotionEffect(PotionEffectType.HEALTH_BOOST, -1, 4);
    public static final PotionEffect shanshen = new PotionEffect(PotionEffectType.REGENERATION, -1, 0);
    public static final PotionEffect zuanyuan = new PotionEffect(PotionEffectType.STRENGTH, -1, 0);
    public static final PotionEffect wangyuanwai = new PotionEffect(PotionEffectType.HASTE, -1, 0);
    public static final PotionEffect speedInf = new PotionEffect(PotionEffectType.SPEED, -1, 0);
    public static final PotionEffect jumpInf = new PotionEffect(PotionEffectType.JUMP_BOOST, -1, 0);
    public static final PotionEffect waterInf = new PotionEffect(PotionEffectType.WATER_BREATHING, -1, 0);
    public static final PotionEffect haitunInf = new PotionEffect(PotionEffectType.DOLPHINS_GRACE, -1, 0);


    public static final JingongAdd strength1 = new JingongAdd(4);
    public static final JingongAdd strength2 = new JingongAdd(8);
    public static final JingongAdd strength3 = new JingongAdd(12);
    public static final JingongAdd strength4 = new JingongAdd(16);
    public static final JingongAdd strength5 = new JingongAdd(20);

    public static final PotionEffect lianxin = new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 100, 0);


    @EventHandler
    public void onConsumeItem(PlayerItemConsumeEvent e) {
        ItemStack itemStack = e.getItem();
        Material material = itemStack.getType();
        if (material != Material.APPLE && material != Material.BREAD) {
            return;
        }
        Player player = e.getPlayer();
        switch (itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING)) {
            case "wangyuanwaidanyao" -> player.addPotionEffect(wangyuanwai);
            case "penglaidanyao" -> player.addPotionEffect(haitunInf);
            case "baigujingdanyao" -> player.addPotionEffect(waterInf);
            case "chendaifudanyao" -> player.addPotionEffect(jumpInf);
            case "zhangzhedanyao" -> player.addPotionEffect(speedInf);
            case "shenmuling" -> player.addPotionEffect(shenmuling);
            case "shanshenzhufu" -> player.addPotionEffect(shanshen);

            case "zuanyaundanyao" -> {
                PotionEffect potionEffect = player.getPotionEffect(PotionEffectType.STRENGTH);
                if (potionEffect != null) {
                    return;
                }
                player.addPotionEffect(zuanyuan);

                Data data = Yuehua.playerData.get(player.getUniqueId());
                data.deathObservers.add("strength1");
                strength1.act(data, player.getPersistentDataContainer());
            }

            case "lianxin" -> player.addPotionEffect(lianxin);

            case "xinqitian" -> {
                new BukkitRunnable() {
                    int count = 100;

                    @Override
                    public void run() {
                        if (count == 0) {
                            this.cancel();
                            return;
                        }

                        if (!player.isConnected()) {
                            this.cancel();
                            return;
                        }

                        count--;
                        player.removePotionEffect(PotionEffectType.POISON);
                        player.removePotionEffect(PotionEffectType.WITHER);
                    }
                }.runTaskTimer(Yuehua.instance, 0, 1);
            }

            case "jiedu1" -> player.removePotionEffect(PotionEffectType.POISON);
            case "jiedu2" -> {
                player.removePotionEffect(PotionEffectType.POISON);
                player.removePotionEffect(PotionEffectType.WITHER);
            }

            case "jiedu3" -> {
                player.removePotionEffect(PotionEffectType.POISON);
                player.removePotionEffect(PotionEffectType.WITHER);
                player.removePotionEffect(PotionEffectType.BLINDNESS);
                player.removePotionEffect(PotionEffectType.DARKNESS);
            }
            case "jiedu4" -> {
                player.removePotionEffect(PotionEffectType.POISON);
                player.removePotionEffect(PotionEffectType.WITHER);
                player.removePotionEffect(PotionEffectType.BLINDNESS);
                player.removePotionEffect(PotionEffectType.DARKNESS);
                player.removePotionEffect(PotionEffectType.SLOWNESS);
                player.removePotionEffect(PotionEffectType.MINING_FATIGUE);
                player.removePotionEffect(PotionEffectType.HUNGER);
            }


            case "huixue0" -> Cure.curePlayer(40, player);


            case "huixue1" -> {
                double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.1 + 40;
                Cure.curePlayer(amount, player);
            }
            case "huixue2" -> {
                double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.1 + 120;
                Cure.curePlayer(amount, player);
            }
            case "huixue3" -> {
                double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.1 + 360;
                Cure.curePlayer(amount, player);
            }
            case "huixue4" -> {
                double amount = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() * 0.1 + 1080;
                Cure.curePlayer(amount, player);
            }


            case "yuebin" -> {

            }

            case "zongzi" -> {

            }

            case "zhuangyuanyuebin" -> {
                //进攻属性

            }

            case "duitangyuebin" -> {
                //韧性

            }

            case "sanhongyuebin" -> {
                //生机

            }

            case "xiantao" -> {
                //生命

            }
        }

    }
}
