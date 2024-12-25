package com.xiaoxiaoowo.yuehua.utils;


import org.bukkit.Location;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;


public final class LocationCheck {
//    private static final Location ShenCenter = new Location(GetEntity.world, 3299, 129, 253);
//    private static final Location XianCenter = new Location(GetEntity.world, 3233, 78, 881);
//    private static final Location RenCenter = new Location(GetEntity.world, 1700, 148, 136);
//    private static final Location YaoCenter = new Location(GetEntity.world, 2742, 75, 871);
//    private static final Location ZhanCenter = new Location(GetEntity.world, 3232, 39, -217);
//    private static final Location MiddleCenter = new Location(GetEntity.world, 178, 50, -50);
//    private static final Location PenglaiCenter = new Location(GetEntity.world, 342, 61, -680);

    public static void check(Player player, Location location) {
        if (LocationCheck.checkMiddle(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.middle(player);
                    }
            );
        } else if (LocationCheck.checkXian(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.xian(player);
                    }
            );
        } else if (LocationCheck.checkRen(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.ren(player);
                    }
            );
        } else if (LocationCheck.checkYao(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.yao(player);
                    }
            );
        } else if (LocationCheck.checkZhan(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.zhan(player);
                    }
            );
        } else if (LocationCheck.checkShen(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.shen(player);
                    }
            );
        } else if (LocationCheck.checkPenglai(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.penglai(player);
                    }
            );
        } else if (LocationCheck.checkForRukou(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.senlinrukou(player);
                    }
            );
        } else if (LocationCheck.checkForDeep(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.senlinshenchu(player);
                    }
            );
        } else if (LocationCheck.checkShaMoRukou(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.shamorukou(player);
                    }
            );
        } else if (LocationCheck.checkShaMo(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.shamo(player);
                    }
            );
        } else if (LocationCheck.checkQiansi(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.qiansiguan(player);
                    }
            );
        } else if (LocationCheck.checkShandong(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.shandong(player);
                    }
            );
        } else if (LocationCheck.checkBeifang(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.beifang(player);
                    }
            );
        } else if (LocationCheck.checkshuizu(location)) {
            Scheduler.sync(
                    () -> {
                        player.stopSound(SoundCategory.VOICE);
                        PlaySound.shuizucunzhuang(player);
                    }
            );
        } else {
            Scheduler.sync(
                    () -> player.stopSound(SoundCategory.VOICE)
            );
        }
    }

    public static void check(Player player) {
        Location location = player.getLocation();
        check(player, location);
    }


    public static boolean checkShen(Location location) {
        //x 3090 -> 3465
        //z 40 -> 425
        double x = location.getX();
        double z = location.getZ();

        return (x <= 3465 && x >= 3090) && (z <= 425 && z >= 40);
    }

    public static boolean checkXian(Location location) {
        //x 3100 -> 3400
        //z 710 -> 1120
        double x = location.getX();
        double z = location.getZ();

        return (x <= 3400 && x >= 3100) && (z <= 1120 && z >= 710);
    }

    public static boolean checkRen(Location location) {
        //x 1560 -> 1850
        //z 20 -> 290
        double x = location.getX();
        double z = location.getZ();

        return (x <= 1850 && x >= 1560) && (z <= 290 && z >= 20);
    }

    public static boolean checkYao(Location location) {
        //x 2600 -> 2870
        //z 790 -> 1065
        double x = location.getX();
        double z = location.getZ();

        return (x <= 2870 && x >= 2600) && (z <= 1065 && z >= 790);
    }

    public static boolean checkZhan(Location location) {
        //x 3100 -> 3385
        //z -360 -> -85
        double x = location.getX();
        double z = location.getZ();

        return (x <= 3385 && x >= 3100) && (z <= -85 && z >= -360);
    }

    public static boolean checkMiddle(Location location) {
        //x 5 -> 340
        //z -330 -> 210
        double x = location.getX();
        double z = location.getZ();

        return (x <= 340 && x >= 5) && (z <= 210 && z >= -330);

    }

    public static boolean checkPenglai(Location location) {
        //x 255 -> 450
        //z -740 -> -620
        double x = location.getX();
        double z = location.getZ();

        return (x <= 450 && x >= 255) && (z <= -620 && z >= -740);
    }

    public static boolean checkForRukou(Location location) {
        //x 410 -> 955
        //z -315 -> 175
        double x = location.getX();
        double z = location.getZ();

        return (x <= 955 && x >= 410) && (z <= 175 && z >= -315);
    }

    public static boolean checkForDeep(Location location) {
        //x 410 -> 955
        //z 185 -> 460
        double x = location.getX();
        double z = location.getZ();

        return (x <= 955 && x >= 410) && (z <= 460 && z >= 185);
    }

    public static boolean checkShaMoRukou(Location location) {
        //x -390 -> -190
        //z 240 -> 820
        double x = location.getX();
        double z = location.getZ();

        return (x <= -190 && x >= -390) && (z <= 820 && z >= 240);
    }


    public static boolean checkShaMo(Location location) {
        //x -200 -> 440
        //z 560 -> 970
        double x = location.getX();
        double z = location.getZ();

        return (x <= 440 && x >= -200) && (z <= 970 && z >= 560);
    }


    public static boolean checkQiansi(Location location) {
        //x -560 -> -870
        //z 380 -> 755
        double x = location.getX();
        double z = location.getZ();

        return (x <= -560 && x >= -870) && (z <= 755 && z >= 380);
    }

    public static boolean checkShandong(Location location) {
        //x -930 -> -510
        //y  -255 -> 170
        //z -300 -> 260
        double x = location.getX();
        double y = location.getY();
        double z = location.getZ();

        return (x <= -510 && x >= -930) && (z <= 260 && z >= -300) && (y <= 170);
    }


    public static boolean checkBeifang(Location location) {
        //x -260 -> 333
        //z -1000 -> -360
        double x = location.getX();
        double z = location.getZ();

        return (x <= 333 && x >= -260) && (z <= -360 && z >= -1000);
    }

    public static boolean checkshuizu(Location location) {
        //x -350 -> -265
        //z -710 -> -600
        double x = location.getX();
        double z = location.getZ();

        return (x <= -265 && x >= -350) && (z <= -600 && z >= -710);
    }

//    public static double distanceSquared(Location location1, Location location2) {
//        double x1 = location1.getX();
//        double z1 = location1.getZ();
//        double x2 = location2.getX();
//        double z2 = location2.getZ();
//        return (x1 - x2) * (x1 - x2) + (z1 - z2) * (z1 - z2);
//    }
}
