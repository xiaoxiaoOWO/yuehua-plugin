package com.xiaoxiaoowo.yuehua.attribute.attributes.jingong;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class BaojiXiaoguo implements MyAttribute {
    public double baojixiaoguo;

    public BaojiXiaoguo(double baojixiaoguo) {
        this.baojixiaoguo = baojixiaoguo;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        double after = base + baojixiaoguo;
        pdc.set(DataContainer.baojixiaoguo,PersistentDataType.DOUBLE,after);
        data.setBaoJiXiaoGuoScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.baojixiaoguo, PersistentDataType.DOUBLE);
        double after = base - baojixiaoguo;
        pdc.set(DataContainer.baojixiaoguo,PersistentDataType.DOUBLE,after);
        data.setBaoJiXiaoGuoScore(after);
    }

    @Override
    public String fromId() {
        if (baojixiaoguo < 0) {
            return "§f暴击效果 -§c" + String.format("%.1f", Math.abs(baojixiaoguo * 100)) + "    ";
        } else {
            return "§f暴击效果 +§b" + String.format("%.1f", baojixiaoguo * 100) + "    ";
        }
    }
}
