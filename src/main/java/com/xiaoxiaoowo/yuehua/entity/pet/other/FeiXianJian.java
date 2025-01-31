package com.xiaoxiaoowo.yuehua.entity.pet.other;

import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.Team;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class FeiXianJian {
    public static final PotionEffect potionEffect = new PotionEffect(PotionEffectType.FIRE_RESISTANCE,-1,0);

    public static Wolf spawn(Data data, Player player) {
        return GetEntity.world.spawn(player.getLocation(), Wolf.class, false, it -> {
            //怪物实体属性
            //队伍
            Team.playerTeam.addEntity(it);
            //Tags
            it.addScoreboardTag("p");
            //不能拾取
            it.setCanPickupItems(false);

            //属性
            double value = player.getAttribute(Attribute.MAX_HEALTH).getValue() * 1.5;
            it.getAttribute(Attribute.MAX_HEALTH).setBaseValue(value);
            it.setHealth(value);


            it.setInvisible(true);
            it.setSilent(true);
        });
    }
}
