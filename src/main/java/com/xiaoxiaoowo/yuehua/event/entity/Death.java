package com.xiaoxiaoowo.yuehua.event.entity;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.MonsterData;
import com.xiaoxiaoowo.yuehua.data.PetData;
import com.xiaoxiaoowo.yuehua.items.dz.Core;
import com.xiaoxiaoowo.yuehua.items.dz.Ingredient;
import com.xiaoxiaoowo.yuehua.items.dz.YuanSu;
import com.xiaoxiaoowo.yuehua.items.other.Collection;
import com.xiaoxiaoowo.yuehua.items.other.MoneyLoot;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.items.other.XP;
import com.xiaoxiaoowo.yuehua.system.handleMonsters.DoMonsterDeath;
import com.xiaoxiaoowo.yuehua.system.handleObsevers.DoKillMonsterObserver;
import com.xiaoxiaoowo.yuehua.system.handlePets.DoPetDeath;
import com.xiaoxiaoowo.yuehua.utils.loot.MyLootTable;
import com.xiaoxiaoowo.yuehua.utils.loot.NumItem;
import com.xiaoxiaoowo.yuehua.utils.loot.ProItem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public final class Death implements Listener {
    private static final HashMap<String, MyLootTable> lootTable = new HashMap<>();

    static {
        MyLootTable lootTableeastKulou = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.mu.clone(), 1),
                new NumItem(MoneyLoot.PI_GE.clone(), 1)
        ), null);
        lootTable.put("eastKulou", lootTableeastKulou);

        MyLootTable looteastZhizhu = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.shui.clone(), 1),
                new NumItem(MoneyLoot.ZHI_ZHU_YAN.clone(), 1)
        ), null);
        lootTable.put("eastZhizhu", looteastZhizhu);


        MyLootTable eastJiangshi = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 2),
                new NumItem(MoneyLoot.PI_GE.clone(), 1)
        ), null);
        lootTable.put("eastJiangshi", eastJiangshi);

        MyLootTable looteastZhizhuJinyin = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.shui.clone(), 1),
                new NumItem(MoneyLoot.ZHI_ZHU_YAN.clone(), 1)
        ), List.of(
                new ProItem(Ingredient.DU_ZHU_YA.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("eastZhizhuJinyin", looteastZhizhuJinyin);


        MyLootTable looteastDuFeng = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.huo.clone(), 1)
        ), List.of(
                new ProItem(Ingredient.BAI_SHE_LIN.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("eastDuFeng", looteastDuFeng);


        MyLootTable looteastkukukongjianshou = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.mu.clone(), 1),
                new NumItem(MoneyLoot.PI_GE, 1)
        ), List.of(
                new ProItem(Ingredient.KU_XIU_GU.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("eastkugugongjianshou", looteastkukukongjianshou);


        MyLootTable looteastjiangshijinyin = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 2),
                new NumItem(MoneyLoot.PI_GE, 1)
        ), List.of(
                new ProItem(Ingredient.HUANG_TONG_KUANG.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("eastjiangshijinyin", looteastjiangshijinyin);


        MyLootTable lootshanshenshooter = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.mu.clone(), 1),
                new NumItem(MoneyLoot.PI_GE, 1)
        ), List.of(
                new ProItem(Collection.SHAN_SHEN_MIAO.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("shanshenshooter", lootshanshenshooter);

        MyLootTable lootshanshenspider = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.shui.clone(), 1),
                new NumItem(MoneyLoot.ZHI_ZHU_YAN, 1)
        ), List.of(
                new ProItem(Collection.SHAN_SHEN_MIAO.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("shanshenspider", lootshanshenspider);

        MyLootTable lootshanshenzombie = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 2),
                new NumItem(MoneyLoot.PI_GE, 1)
        ), List.of(
                new ProItem(Collection.SHAN_SHEN_MIAO.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("shanshenzombie", lootshanshenzombie);


        MyLootTable lootyaojindufeng = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.huo.clone(), 1)
        ), List.of(
                new ProItem(Collection.SHEN_MU_YAO_JING.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("yaojindufeng", lootyaojindufeng);

        MyLootTable lootyaojinshooter = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.mu.clone(), 1),
                new NumItem(MoneyLoot.PI_GE, 1)
        ), List.of(
                new ProItem(Collection.SHEN_MU_YAO_JING.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("yaojinshooter", lootyaojinshooter);

        MyLootTable lootyaojingpanda = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 1),
                new NumItem(YuanSu.tu.clone(), 1)
        ), List.of(
                new ProItem(Collection.SHEN_MU_YAO_JING.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02)
        ));
        lootTable.put("yaojingpanda", lootyaojingpanda);

        MyLootTable lootzhizhunvwang = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 3),
                new NumItem(YuanSu.shui.clone(), 3),
                new NumItem(MoneyLoot.ZHI_ZHU_YAN.clone(), 1)
        ), List.of(
                new ProItem(Ingredient.ZHU_WANG_YAN.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02),
                new ProItem(Core.CORE2.clone(), 0.2),
                new ProItem(Other.CHONG_SHENG_STONE.clone(), 0.1),
                new ProItem(XP.XP_10.clone(), 0.05)
        ));
        lootTable.put("zhizhunvwang", lootzhizhunvwang);


        MyLootTable lootlinyouduzhu = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 3),
                new NumItem(YuanSu.shui.clone(), 3),
                new NumItem(MoneyLoot.ZHI_ZHU_YAN.clone(), 1)
        ), List.of(
                new ProItem(Ingredient.MENG_DU_SU.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02),
                new ProItem(Core.CORE2.clone(), 0.2),
                new ProItem(Other.CHONG_SHENG_STONE.clone(), 0.1),
                new ProItem(XP.XP_10.clone(), 0.05)
        ));
        lootTable.put("linyouduzhu", lootlinyouduzhu);


        MyLootTable lootjianxiguimei = new MyLootTable(1, List.of(
                new NumItem(YuanSu.jin.clone(), 3),
                new NumItem(YuanSu.shui.clone(), 3),
                new NumItem(MoneyLoot.PI_GE.clone(), 1)
        ), List.of(
                new ProItem(Ingredient.HE_SHUI_LING.clone(), 0.4),
                new ProItem(Ingredient.AO_LANG_PI, 0.02),
                new ProItem(Ingredient.BI_SHI_SUI, 0.02),
                new ProItem(Core.CORE2.clone(), 0.2),
                new ProItem(Other.CHONG_SHENG_STONE.clone(), 0.1),
                new ProItem(XP.XP_10.clone(), 0.05)
        ));
        lootTable.put("jianxiguimei", lootjianxiguimei);
    }


    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        LivingEntity entity = e.getEntity();
        Set<String> tags = entity.getScoreboardTags();
        if (tags.contains("m")) {
            // 怪物死亡监听器
            MonsterData monsterData = Yuehua.monsterData.get(entity.getUniqueId());
            if (monsterData == null) {
                return;
            }

            // 怪物掉落
            Player player = monsterData.lastAttacker;
            if (player == null || !player.isOnline()) {
                return;
            }
            Data data = Yuehua.playerData.get(player.getUniqueId());

            for (String observer : monsterData.killedObservers) {
                DoMonsterDeath.doDeath(observer, monsterData, player);
            }

            for (String observer : data.killMonsterObservers) {
                DoKillMonsterObserver.doKill(observer, data, monsterData);
            }

            MyLootTable myLootTable = lootTable.get(monsterData.id);
            if (myLootTable != null) {
                lootTable.get(monsterData.id).give(player);
            }

            return;
        }

        if (tags.contains("p")) {
            PetData petData = Yuehua.petData.get(entity.getUniqueId());
            for (String observer : petData.killedObservers) {
                DoPetDeath.doDeath(observer, petData);
            }
        }
    }
}
