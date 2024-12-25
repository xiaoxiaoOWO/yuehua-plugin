package com.xiaoxiaoowo.yuehua.attribute.attributes.special;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.guis.DuanZao;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;

public final class Danlu implements MyAttribute {
    public String id;

    public Danlu(String id)
    {
        this.id = id;
    }


    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        Player player = data.player;
        DanData danData = (DanData) data;
        danData.danlu = switch (id){
            case "heiTieGuo" -> Bukkit.createInventory(player, 18, "§b黑铁锅");
            case "qinTongGuo" -> Bukkit.createInventory(player, 18, "§b青铜锅");
            case "lianDanLu" -> Bukkit.createInventory(player, 18, "§b炼丹炉");
            case "suoHunLu" -> Bukkit.createInventory(player, 18, "§b锁魂炉");
            case "qiShaDing" -> Bukkit.createInventory(player, 18, "§b七煞鼎");
            case "hunYuanShenDing" -> Bukkit.createInventory(player, 18, "§b混元神鼎");
            default -> null;
        };
        if(danData.danlu != null){
            danData.danlu.setItem(17, DuanZao.HUOZHEZI);
        }

    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        DanData danData = (DanData) data;
        danData.danlu = null;
    }

    @Override
    public String fromId() {
        return null;
    }
}
