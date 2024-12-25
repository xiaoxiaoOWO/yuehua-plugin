package com.xiaoxiaoowo.yuehua.attribute.attributes.special;

import com.xiaoxiaoowo.yuehua.attribute.attributes.MyAttribute;
import com.xiaoxiaoowo.yuehua.data.DanData;
import com.xiaoxiaoowo.yuehua.data.Data;
import com.xiaoxiaoowo.yuehua.data.slot.SlotBuilder;
import com.xiaoxiaoowo.yuehua.system.DataContainer;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public final class SlotWithId implements MyAttribute {
    public String id;
    public int slot;
    public NamespacedKey namespacedKey;

    public SlotWithId(String id,int slot){
        this.id = id;
        this.slot = slot;

        namespacedKey = switch (slot){
            case 0 -> DataContainer.slot0;
            case 1 -> DataContainer.slot1;
            case 2 -> DataContainer.slot2;
            case 3 -> DataContainer.slot3;
            case 4 -> DataContainer.slot4;
            case 5 -> DataContainer.slot5;
            case 8 -> DataContainer.slot8;
            case 36 -> DataContainer.slot36;
            case 37 -> DataContainer.slot37;
            case 38 -> DataContainer.slot38;
            case 39 -> DataContainer.slot39;
            case 40 -> DataContainer.slot40;
            case 100 -> DataContainer.eslot0;
            case 101 -> DataContainer.eslot1;
            case 102 -> DataContainer.eslot2;
            case 103 -> DataContainer.eslot3;
            case 104 -> DataContainer.eslot4;
            case 105 -> DataContainer.eslot5;
            case 106 -> DataContainer.eslot6;
            case 107 -> DataContainer.eslot7;
            default -> throw new IllegalStateException("Unexpected value: " + slot);
        };
    }

    @Override
    public void act(Data data, PersistentDataContainer pdc) {
        pdc.set(namespacedKey, PersistentDataType.STRING,id);
        switch (slot){
            case 0 -> data.slot0 = SlotBuilder.slot0Builder(id,data.real_cool);
            case 1 -> data.slot1 = SlotBuilder.slot1Builder(id,data.real_cool);
            case 2 -> data.slot2 = SlotBuilder.slot2Builder(id,data.real_cool);
            case 3 -> {
                DanData danData = (DanData) data;
                danData.slot3 = SlotBuilder.slot3Builder(id,data.real_cool);
            }
            case 4 -> {
                DanData danData = (DanData) data;
                danData.slot4 = SlotBuilder.slot4Builder(id,data.real_cool);
            }
            case 5 -> {
                DanData danData = (DanData) data;
                danData.slot5 = SlotBuilder.slot5Builder(id,data.real_cool);
            }
            case 8 -> data.slot8 = SlotBuilder.slot8Builder(id,data.real_cool);
            case 36 -> data.slot36 = SlotBuilder.slot36Builder(id,data.real_cool);
            case 37 -> data.slot37 = SlotBuilder.slot37Builder(id,data.real_cool);
            case 38 -> data.slot38 = SlotBuilder.slot38Builder(id,data.real_cool);
            case 39 -> data.slot39 = SlotBuilder.slot39Builder(id,data.real_cool);
            case 40 -> data.slot40 = SlotBuilder.slot40Builder(id,data.real_cool);
            case 100 -> data.eSlot0 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            case 101 -> data.eSlot1 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            case 102 -> data.eSlot2 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            case 103 -> data.eSlot3 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            case 104 -> data.eSlot4 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            case 105 -> data.eSlot5 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            case 106 -> data.eSlot6 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            case 107 -> data.eSlot7 = SlotBuilder.enderChestSlotBuilder(id,data.real_cool);
            default -> throw new IllegalStateException("Unexpected value: " + slot);
        }
    }

    @Override
    public void deAct(Data data, PersistentDataContainer pdc) {
        pdc.set(namespacedKey, PersistentDataType.STRING,"null");
        switch (slot){
            case 0 -> data.slot0 = SlotBuilder.slot0Builder("null",data.real_cool);
            case 1 -> data.slot1 = SlotBuilder.slot1Builder("null",data.real_cool);
            case 2 -> data.slot2 = SlotBuilder.slot2Builder("null",data.real_cool);
            case 3 -> {
                DanData danData = (DanData) data;
                danData.slot3 = SlotBuilder.slot3Builder("null",data.real_cool);
            }
            case 4 -> {
                DanData danData = (DanData) data;
                danData.slot4 = SlotBuilder.slot4Builder("null",data.real_cool);
            }
            case 5 -> {
                DanData danData = (DanData) data;
                danData.slot5 = SlotBuilder.slot5Builder("null",data.real_cool);
            }
            case 8 -> data.slot8 = SlotBuilder.slot8Builder("null",data.real_cool);
            case 36 -> data.slot36 = SlotBuilder.slot36Builder("null",data.real_cool);
            case 37 -> data.slot37 = SlotBuilder.slot37Builder("null",data.real_cool);
            case 38 -> data.slot38 = SlotBuilder.slot38Builder("null",data.real_cool);
            case 39 -> data.slot39 = SlotBuilder.slot39Builder("null",data.real_cool);
            case 40 -> data.slot40 = SlotBuilder.slot40Builder("null",data.real_cool);
            case 100 -> data.eSlot0 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            case 101 -> data.eSlot1 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            case 102 -> data.eSlot2 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            case 103 -> data.eSlot3 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            case 104 -> data.eSlot4 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            case 105 -> data.eSlot5 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            case 106 -> data.eSlot6 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            case 107 -> data.eSlot7 = SlotBuilder.enderChestSlotBuilder("null",data.real_cool);
            default -> throw new IllegalStateException("Unexpected value: " + slot);
        }
    }

    @Override
    public String fromId() {
        return null;
    }
}
