package com.xiaoxiaoowo.yuehua.event.player;

import com.xiaoxiaoowo.yuehua.system.Cure;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class ConsumeItem implements Listener {
    public static final PotionEffect shenmuling = new PotionEffect(PotionEffectType.HEALTH_BOOST, -1, 4);
    public static final PotionEffect shanshen = new PotionEffect(PotionEffectType.REGENERATION, -1, 0);

    @EventHandler
    public void onConsumeItem(PlayerItemConsumeEvent e) {
        ItemStack itemStack = e.getItem();
        Material material = itemStack.getType();
        if (material != Material.APPLE && material != Material.BREAD) {
            return;
        }
        Player player = e.getPlayer();
        switch (itemStack.getPersistentDataContainer().get(DataContainer.id, PersistentDataType.STRING)) {
            case "shenmuling" -> player.addPotionEffect(shenmuling);
            case "shanshenzhufu" -> player.addPotionEffect(shanshen);
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
