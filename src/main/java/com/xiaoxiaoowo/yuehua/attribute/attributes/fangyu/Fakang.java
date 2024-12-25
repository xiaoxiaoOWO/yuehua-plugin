package com.xiaoxiaoowo.yuehua.attribute.attributes.fangyu;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class Fakang implements MyAttribute {
    public double fakang;

    public Fakang(double fakang) {
        this.fakang = fakang;
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        double after = base + fakang;
        pdc.set(DataContainer.fakang,PersistentDataType.DOUBLE,after);
        data.setFakangScore(after);
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        double base = pdc.get(DataContainer.fakang, PersistentDataType.DOUBLE);
        double after = base - fakang;
        pdc.set(DataContainer.fakang,PersistentDataType.DOUBLE,after);
        data.setFakangScore(after);
    }

    @Override
    public String fromId() {
        if (fakang < 0) {
            return "§f法抗 -§c" + String.format("%.1f", Math.abs(fakang * 100))  + "    ";
        } else {
            return "§f法抗 +§b" + String.format("%.1f", fakang * 100) + "    ";
        }
    }
}
