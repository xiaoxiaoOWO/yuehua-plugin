package com.xiaoxiaoowo.yuehua.task.player;

import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.data.*;
import com.xiaoxiaoowo.yuehua.utils.MySocket;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class DisplayHp extends BukkitRunnable {
    Player player;

    public DisplayHp(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        if (!player.isConnected()) {
            this.cancel();
            return;
        }

        Entity entity = player.getTargetEntity(48);
        if (entity == null || entity.isInvisible()) {
            return;
        }

        if (!entity.getScoreboardTags().contains("m")) {
            if (entity.getType() == EntityType.PLAYER) {
                Data playerData = Yuehua.playerData.get(entity.getUniqueId());
                Player player1 = (Player) entity;

                String mname = player1.getName();
                double monsterHp = player1.getHealth();
                double monsterMaxHp = player1.getAttribute(Attribute.MAX_HEALTH).getValue();
                double mattack = 0;
                switch (playerData.job){
                    case 1 -> mattack = playerData.attack;
                    case 2 -> {
                        GongData gongData = (GongData) playerData;
                        mattack = gongData.arrow;
                    }
                    case 3 -> {
                        DanData danData = (DanData) playerData;
                        mattack = danData.zhenfa;
                    }
                }

                double mhujia = playerData.hujia;
                double mfakang = playerData.fakang;
                double mgedang = playerData.gedang;
                double mrenxing = playerData.renxing;
                double mshengji = playerData.shengji;
                double mpojia = playerData.pojia;
                double mpofa = playerData.pofa;


                String transfer = String.format("%s;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f",
                        mname, monsterHp, monsterMaxHp,
                        mattack, mhujia * 100, mfakang * 100, mgedang, mrenxing * 100, mshengji * 100, mpojia * 100, mpofa * 100);

                Data data = Yuehua.playerData.get(player.getUniqueId());
                MySocket.sendDataToFabricClient(data, transfer);
                return;
            }

            if (entity.getScoreboardTags().contains("p")) {
                PetData petData = Yuehua.petData.get(entity.getUniqueId());
                Mob pet = petData.pet;

                String petName = pet.getName();
                double petHp = pet.getHealth();
                double petMaxHp = pet.getAttribute(Attribute.MAX_HEALTH).getValue();
                double mattack = petData.attack;
                double mhujia = petData.hujia;
                double mfakang = 0;
                double mgedang = petData.gedang;
                double mrenxing = 0;
                double mshengji = 0;
                double mpojia = petData.pojia;
                double mpofa = petData.pofa;

                String transfer = String.format("%s;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f",
                        petName, petHp, petMaxHp,
                        mattack, mhujia * 100, mfakang * 100, mgedang, mrenxing * 100, mshengji * 100, mpojia * 100, mpofa * 100);

                Data data = Yuehua.playerData.get(player.getUniqueId());
                MySocket.sendDataToFabricClient(data, transfer);
                return;
            }

            return;
        }


        Mob mob = (Mob) entity;

        MonsterData monsterData = Yuehua.monsterData.get(mob.getUniqueId());

        String mname = monsterData.monster.getName();
        double monsterHp = mob.getHealth();
        double monsterMaxHp = mob.getAttribute(Attribute.MAX_HEALTH).getValue();
        double mattack = monsterData.attack;
        double mhujia = monsterData.hujia;
        double mfakang = monsterData.fakang;
        double mgedang = monsterData.gedang;
        double mrenxing = monsterData.renxing;
        double mshengji = monsterData.shengji;
        double mpojia = monsterData.pojia;
        double mpofa = monsterData.pofa;


        String transfer = String.format("%s;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f;%.1f",
                mname, monsterHp, monsterMaxHp,
                mattack, mhujia * 100, mfakang * 100, mgedang, mrenxing * 100, mshengji * 100, mpojia * 100, mpofa * 100);


        Data data = Yuehua.playerData.get(player.getUniqueId());
        MySocket.sendDataToFabricClient(data, transfer);
    }
}
