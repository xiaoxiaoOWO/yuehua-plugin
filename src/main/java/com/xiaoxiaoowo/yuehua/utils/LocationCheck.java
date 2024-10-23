package com.xiaoxiaoowo.yuehua.utils;


import org.bukkit.Location;
import org.bukkit.entity.Player;


public final class LocationCheck {
    private static final Location ShenCenter = new Location(GetEntity.world, 3299, 129, 253);
    private static final Location XianCenter = new Location(GetEntity.world, 3233, 78, 881);
    private static final Location RenCenter = new Location(GetEntity.world, 1700, 148, 136);
    private static final Location YaoCenter = new Location(GetEntity.world, 2742, 75, 871);
    private static final Location ZhanCenter = new Location(GetEntity.world, 3232, 39, -217);
    private static final Location MiddleCenter = new Location(GetEntity.world, 178, 50, -50);
    private static final Location PenglaiCenter = new Location(GetEntity.world, 342, 61, -680);

    public static void check(Player player, Location location) {
        if (LocationCheck.checkMiddle(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.middle(player);
                    }
            );
        } else if (LocationCheck.checkXian(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.xian(player);
                    }
            );
        } else if (LocationCheck.checkRen(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.ren(player);
                    }
            );
        } else if (LocationCheck.checkYao(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.yao(player);
                    }
            );
        } else if (LocationCheck.checkZhan(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.zhan(player);
                    }
            );
        } else if (LocationCheck.checkShen(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.shen(player);
                    }
            );
        } else if (LocationCheck.checkPenglai(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.penglai(player);
                    }
            );
        } else {
            Scheduler.sync(
                    player::stopAllSounds
            );
        }
    }

    public static void check(Player player) {
        Location location = player.getLocation();
        if (LocationCheck.checkMiddle(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.middle(player);
                    }
            );
        } else if (LocationCheck.checkXian(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.xian(player);
                    }
            );
        } else if (LocationCheck.checkRen(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.ren(player);
                    }
            );
        } else if (LocationCheck.checkYao(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.yao(player);
                    }
            );
        } else if (LocationCheck.checkZhan(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.zhan(player);
                    }
            );
        } else if (LocationCheck.checkShen(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.shen(player);
                    }
            );
        } else if (LocationCheck.checkPenglai(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopAllSounds();
                        PlaySound.penglai(player);
                    }
            );
        } else {
            Scheduler.sync(
                    player::stopAllSounds
            );
        }
    }



    public static boolean checkShen(Location location) {
        return distanceSquared(ShenCenter, location) < 200 * 200;
    }

    public static boolean checkXian(Location location) {
        return distanceSquared(XianCenter, location) < 250 * 250;
    }

    public static boolean checkRen(Location location) {
        return distanceSquared(RenCenter, location) < 200 * 200;
    }

    public static boolean checkYao(Location location) {
        return distanceSquared(YaoCenter, location) < 200 * 200;
    }

    public static boolean checkZhan(Location location) {
        return distanceSquared(ZhanCenter, location) < 200 * 200;
    }

    public static boolean checkMiddle(Location location) {
        return distanceSquared(MiddleCenter, location) < 300 * 300;
    }

    public static boolean checkPenglai(Location location) {
        return distanceSquared(PenglaiCenter, location) < 100 * 100;
    }

    public static double distanceSquared(Location location1, Location location2) {
        double x1 = location1.getX();
        double z1 = location1.getZ();
        double x2 = location2.getX();
        double z2 = location2.getZ();
        return (x1 - x2) * (x1 - x2) + (z1 - z2) * (z1 - z2);
    }
}
