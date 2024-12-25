package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class BaoJi implements MyAttribute {
    public double baoji;

    public BaoJi(double baoji) {
        this.baoji = baoji;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        double after = base + baoji;
        pdc.set(DataContainer.baoji,PersistentDataType.DOUBLE,after);
        data.setBaojiScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.baoji, PersistentDataType.DOUBLE);
        double after = base - baoji;
        pdc.set(DataContainer.baoji,PersistentDataType.DOUBLE,after);
        data.setBaojiScore(after);
    }

    @Override
    public String fromId() {
        if (baoji < 0) {
            return "§f暴击率 -§c" + String.format("%.1f", Math.abs(baoji * 100)) + "%" + "    ";
        } else {
            return "§f暴击率 +§b" + String.format("%.1f", baoji * 100) + "%" + "    ";
        }
    }
}
