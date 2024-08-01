package com.xiaoxiaoowo.yuehua.data.slot;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;

public final class SlotBuilder {
    public static SlotWithOneActiveSkill slot0Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot1Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot2Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot3Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot4Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot5Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static SlotWithOneActiveSkill slot8Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new SlotWithOneActiveSkill(id);
            }
        }
    }

    public static Slot slot36Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot37Builder(String id, double real_cool) {
        switch (id) {
            case "tui1" -> {
                return new Slot(id, GetEntity.world.getGameTime() + (long) (10 * 20 * real_cool));
            }

            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot38Builder(String id, double real_cool) {
        switch (id) {
            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot39Builder(String id, double real_cool) {
        switch (id) {
            case "tou1" -> {
                return new Slot(id, GetEntity.world.getGameTime() + (long) (10 * 20 * real_cool));
            }

            default -> {
                return new Slot(id);
            }
        }
    }

    public static Slot slot40Builder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new Slot(id);
            }
        }
    }

    public static EnderChestSlot enderChestSlotBuilder(String id, double real_cool) {
        switch (id) {

            default -> {
                return new EnderChestSlot(id);
            }
        }
    }


}
