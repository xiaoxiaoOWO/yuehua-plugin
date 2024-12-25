package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Collection;

public final class SendInformation {
    public static void broadcastMes(Component mes) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> Bukkit.broadcast(mes));
    }

    public static void broadcastMes(Collection<Component> mess) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> mess.forEach(Bukkit::broadcast));
    }

    public static void sendMes(Player player, Component mes) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> player.sendMessage(mes));
    }

    public static void sendMes(Collection<Player> players, Component mes) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> players.forEach(it -> it.sendMessage(mes)));
    }

    public static void sendMes(Player player, Collection<Component> mess) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> mess.forEach(player::sendMessage));
    }

    public static void sendMes(Collection<Player> players, Collection<Component> mess) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> players.forEach(it -> mess.forEach(it::sendMessage)));
    }

    public static void sendActionBar(Player player, Component mes) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> player.sendActionBar(mes));
    }

    public static void sendActionBar(Collection<Player> players, Component mes) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> players.forEach(it -> it.sendActionBar(mes)));
    }

    public static void sendSoundAtLoc(Location location, Sound sound) {
        GetEntity.world.playSound(location, sound, 0.5f, 1);
    }

    public static void sendSoundAtEntity(Player player, Sound sound) {
        player.playSound(player, sound, 1, 1);

    }

    public static void sendSoundAtEntities(Collection<Player> players, Sound sound) {
        players.forEach(it -> it.playSound(it, sound, 1, 1));
    }

    public static void sendSoundAtLoc(Location location, Sound sound, float volume) {
        GetEntity.world.playSound(location, sound, volume, 1);
    }

    public static void sendSountAtEntity(Player player, Sound sound, float volume) {
        player.playSound(player, sound, volume, 1);
    }

    public static void sendSountAtEntities(Collection<Player> players, Sound sound, float volume) {
        players.forEach(it -> it.playSound(it, sound, volume, 1));
    }

    public static void sendSoundAtLoc(Location location, String sound) {
        GetEntity.world.playSound(location, sound, 0.5f, 1);
    }

    public static void sendSoundAtEntity(Player player, String sound) {
        player.playSound(player, sound, 1, 1);
    }

    public static void sendSoundAtEntities(Collection<Player> players, String sound) {
        players.forEach(it -> it.playSound(it, sound, 1, 1));
    }

    public static void sendSoundAtLoc(Location location, String sound, float volume) {
        GetEntity.world.playSound(location, sound, volume, 1);
    }

    public static void sendSoundAtEntity(Player player, String sound, float volume) {
        player.playSound(player, sound, volume, 1);
    }

    public static void sendBgm(Player player, String sound, float volume) {
        player.playSound(player, sound, SoundCategory.VOICE, volume, 1);
    }

    public static void sendSoundAtEntities(Collection<Player> players, String sound, float volume) {
        players.forEach(it -> it.playSound(it, sound, volume, 1));
    }

}
