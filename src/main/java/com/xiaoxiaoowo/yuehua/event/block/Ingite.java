package com.xiaoxiaoowo.yuehua.event.block;

import org.bukkit.Material;
import org.bukkit.block.data.type.Candle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

import java.util.HashSet;
import java.util.Set;

public final class Ingite implements Listener {
    public static final Set<Material> candles = new HashSet<>();

    static {
        candles.add(Material.CANDLE);
        candles.add(Material.WHITE_CANDLE);
        candles.add(Material.ORANGE_CANDLE);
        candles.add(Material.MAGENTA_CANDLE);
        candles.add(Material.LIGHT_BLUE_CANDLE);
        candles.add(Material.YELLOW_CANDLE);
        candles.add(Material.LIME_CANDLE);
        candles.add(Material.PINK_CANDLE);
        candles.add(Material.GRAY_CANDLE);
        candles.add(Material.LIGHT_GRAY_CANDLE);
        candles.add(Material.CYAN_CANDLE);
        candles.add(Material.PURPLE_CANDLE);
        candles.add(Material.BLUE_CANDLE);
        candles.add(Material.BROWN_CANDLE);
        candles.add(Material.GREEN_CANDLE);
        candles.add(Material.RED_CANDLE);
        candles.add(Material.BLACK_CANDLE);
    }


    @EventHandler
    public void onIngite(BlockIgniteEvent event) {
        if (candles.contains(event.getBlock().getType())) {
            return;
        }
        event.setCancelled(true);
    }
}
