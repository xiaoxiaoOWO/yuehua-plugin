package com.xiaoxiaoowo.yuehua.system;

import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.GongData;
import com.xiaoxiaoowo.yuehua.data.ZhanData;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoJiNengObservers;
import org.bukkit.entity.Arrow;

public final class DoJiNeng {
    public static void doJiNeng(String id,Data data){
        double multiplier = 1.0;
        for(String observer : data.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, data);
        }

        switch (id){

        }
    }

    public static void doJiNengZhan(String id, ZhanData zhanData){
        double multiplier = 1.0;
        for(String observer : zhanData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, zhanData);
        }
        switch (id){

        }
    }

    public static void doJiNengGong(String id, GongData gongData){
        double multiplier = 1.0;
        for(String observer : gongData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id){

        }
    }
    public static void doJiNengProjectile(String id, GongData gongData, Arrow arrow){
        double multiplier = 1.0;
        for(String observer : gongData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }

        switch (id){
        }
    }

    public static void doJiNengDan(String id, DanData danData){
        double multiplier = 1.0;
        for(String observer : danData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, danData);
        }
        switch (id){

        }
    }

    public static void doJiNeng2(String id,Data data){
        double multiplier = 1.0;
        for(String observer : data.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, data);
        }
        switch (id){

        }
    }

    public static void doJiNengZhan2(String id, ZhanData zhanData){
        double multiplier = 1.0;
        for(String observer :zhanData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, zhanData);
        }
        switch (id){

        }
    }

    public static void doJiNengGong2(String id, GongData gongData){
        double multiplier = 1.0;
        for(String observer : gongData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id){

        }
    }

    public static void doJiNengDan2(String id, DanData danData){
        double multiplier = 1.0;
        for(String observer : danData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, danData);
        }
        switch (id){

        }
    }

    public static void doUpHeadShoot(String id,GongData gongData){
        double multiplier = 1.0;
        for(String observer : gongData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id){
        }
    }

    public static void doDownHeadShoot(String id,GongData gongData){
        double multiplier = 1.0;
        for(String observer : gongData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id){
        }
    }

    public static void doRorateShoot(String id,GongData gongData){
        double multiplier = 1.0;
        for(String observer : gongData.jiNengObservers){
            multiplier = multiplier * DoJiNengObservers.doJiNeng(observer, gongData);
        }
        switch (id){
        }
    }
}
