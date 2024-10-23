package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
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

    public static void sendMes(Component mes, Player player) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> player.sendMessage(mes));
    }

    public static void sendMes(Component mes, Collection<Player> players) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> players.forEach(it -> it.sendMessage(mes)));
    }

    public static void sendMes(Collection<Component> mess, Player player) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> mess.forEach(player::sendMessage));
    }

    public static void sendMes(Collection<Component> mess, Collection<Player> players) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> players.forEach(it -> mess.forEach(it::sendMessage)));
    }

    public static void sendActionBar(Player player, Component mes) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> player.sendActionBar(mes));
    }

    public static void sendActionBar(Collection<Player> players, Component mes) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, () -> players.forEach(it -> it.sendActionBar(mes)));
    }

    public static void sendSoundAtLoc(Location location, Sound sound) {
        GetEntity.world.playSound(location, sound, 1, 1);
    }

    public static void sendSoundAtEntity(Entity entity, Sound sound) {
        GetEntity.world.playSound(entity, sound, 1, 1);
    }

    public static void sendSoundAtEntities(Collection<Entity> entities, Sound sound) {
        entities.forEach(it -> GetEntity.world.playSound(it, sound, 1, 1));
    }

    public static void sendSoundAtLoc(Location location, Sound sound, float volume) {
        GetEntity.world.playSound(location, sound, volume, 1);
    }

    public static void sendSountAtEntity(Entity entity, Sound sound, float volume) {
        GetEntity.world.playSound(entity, sound, volume, 1);
    }

    public static void sendSountAtEntities(Collection<Entity> entities, Sound sound, float volume) {
        entities.forEach(it -> GetEntity.world.playSound(it, sound, volume, 1));
    }

    public static void sendSoundAtLoc(Location location, String sound) {
        GetEntity.world.playSound(location, sound, 1, 1);
    }

    public static void sendSoundAtEntity(Entity entity, String sound) {
        GetEntity.world.playSound(entity, sound, 1, 1);
    }

    public static void sendSoundAtEntities(Collection<Entity> entities, String sound) {
        entities.forEach(it -> GetEntity.world.playSound(it, sound, 1, 1));
    }

    public static void sendSoundAtLoc(Location location, String sound, float volume) {
        GetEntity.world.playSound(location, sound, volume, 1);
    }

    public static void sendSoundAtEntity(Entity entity, String sound, float volume) {
        GetEntity.world.playSound(entity, sound, volume, 1);
    }

    public static void sendSoundAtEntities(Collection<Entity> entities, String sound, float volume) {
        entities.forEach(it -> GetEntity.world.playSound(it, sound, volume, 1));
    }

}
