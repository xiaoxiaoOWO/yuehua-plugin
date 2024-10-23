package com.xiaoxiaoowo.yuehua.utils;

import com.xiaoxiaoowo.yuehua.Yuehua;

public final class Scheduler {
    //只可用于Runnable,不可用于BukkitRunnable
    public static void async(Runnable runnable) {
        Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, runnable);
    }

    public static int asyncWithId(Runnable runnable) {
        return Yuehua.scheduler.runTaskAsynchronously(Yuehua.instance, runnable).getTaskId();
    }

    public static void asyncLater(Runnable runnable, long delay) {
        Yuehua.scheduler.runTaskLaterAsynchronously(Yuehua.instance, runnable, delay);
    }

    public static int asyncLaterWithId(Runnable runnable, long delay) {
        return Yuehua.scheduler.runTaskLaterAsynchronously(Yuehua.instance, runnable, delay).getTaskId();
    }

    public static void asyncTimer(Runnable runnable, long delay, long period) {
        Yuehua.scheduler.runTaskTimerAsynchronously(Yuehua.instance, runnable, delay, period);
    }

    public static int asyncTimerWithId(Runnable runnable, long delay, long period) {
        return Yuehua.scheduler.runTaskTimerAsynchronously(Yuehua.instance, runnable, delay, period).getTaskId();
    }

    public static void sync(Runnable runnable) {
        Yuehua.scheduler.runTask(Yuehua.instance, runnable);
    }

    public static int syncWithId(Runnable runnable) {
        return Yuehua.scheduler.runTask(Yuehua.instance, runnable).getTaskId();
    }

    public static void syncLater(Runnable runnable, long delay) {
        Yuehua.scheduler.runTaskLater(Yuehua.instance, runnable, delay);
    }

    public static int syncLaterWithId(Runnable runnable, long delay) {
        return Yuehua.scheduler.runTaskLater(Yuehua.instance, runnable, delay).getTaskId();
    }

    public static void syncTimer(Runnable runnable, long delay, long period) {
        Yuehua.scheduler.runTaskTimer(Yuehua.instance, runnable, delay, period);
    }

    public static int syncTimerWithId(Runnable runnable, long delay, long period) {
        return Yuehua.scheduler.runTaskTimer(Yuehua.instance, runnable, delay, period).getTaskId();
    }
}
