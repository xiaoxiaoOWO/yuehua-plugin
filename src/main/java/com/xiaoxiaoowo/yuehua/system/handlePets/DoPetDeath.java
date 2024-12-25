package com.xiaoxiaoowo.yuehua.system.handlePets;

import com.xiaoxiaoowo.yuehua.data.PetData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;

public final class DoPetDeath {
    public static void doDeath(String id, PetData petData){
        switch (id){
            case "feixian" -> doFeixian(petData);

            default -> {
            }
        }

    }

    public static void doFeixian(PetData petData){
        Mob pet = petData.pet;
        for (Entity entity : pet.getPassengers()) {
            pet.removePassenger(entity);
            entity.remove();
        }
    }
}
