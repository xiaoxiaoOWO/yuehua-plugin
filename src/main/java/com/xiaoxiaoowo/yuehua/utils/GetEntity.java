package com.xiaoxiaoowo.yuehua.utils;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public final class GetEntity {
    public static World world;
    public static Random random;


    public static double mydistance(Location location1, Location location2) {
        double dx = location1.getX() - location2.getX();
        double dy = location1.getY() - location2.getY();
        double dz = location1.getZ() - location2.getZ();
        return dx * dx + dy * dy + dz * dz;
    }

    public static void forceLoad(int fromX, int fromZ, int toX, int toZ) {
        // 计算起始和结束坐标的区块位置
        int startChunkX = fromX >> 4;  // 等同于 fromX / 16 并向下取整
        int startChunkZ = fromZ >> 4;  // 等同于 fromZ / 16 并向下取整
        int endChunkX = toX >> 4;      // 等同于 toX / 16 并向下取整
        int endChunkZ = toZ >> 4;      // 等同于 toZ / 16 并向下取整

        // 遍历所有区块并强制加载
        for (int chunkX = startChunkX; chunkX <= endChunkX; chunkX++) {
            for (int chunkZ = startChunkZ; chunkZ <= endChunkZ; chunkZ++) {
                world.setChunkForceLoaded(chunkX, chunkZ, true);
            }
        }
    }

    public static void unForceLoad(int fromX, int fromZ, int toX, int toZ) {
        // 计算起始和结束坐标的区块位置
        int startChunkX = fromX >> 4;  // 等同于 fromX / 16 并向下取整
        int startChunkZ = fromZ >> 4;  // 等同于 fromZ / 16 并向下取整
        int endChunkX = toX >> 4;      // 等同于 toX / 16 并向下取整
        int endChunkZ = toZ >> 4;      // 等同于 toZ / 16 并向下取整

        // 遍历所有区块并强制加载
        for (int chunkX = startChunkX; chunkX <= endChunkX; chunkX++) {
            for (int chunkZ = startChunkZ; chunkZ <= endChunkZ; chunkZ++) {
                world.setChunkForceLoaded(chunkX, chunkZ, false);
            }
        }
    }

    public static Collection<Entity> getMonsters(Location location, double x, double y, double z) {
        return world.getNearbyEntities(location, x, y, z, entity -> entity.getScoreboardTags().contains("m"));
    }

    public static Collection<Entity> getArrowTrident(Location location, double x, double y, double z) {
        return world.getNearbyEntities(location, x, y, z, entity -> {
            EntityType entityType = entity.getType();
            return (entityType == EntityType.ARROW) || (entityType == EntityType.TRIDENT);
        });
    }

    public static ArrayList<Mob> getNumberLimitMonsters(Location location, double x, double y, double z, int num) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getScoreboardTags().contains("m"));
        ArrayList<Mob> monsters = new ArrayList<>(num);
        int i = 0;
        for (Entity entity : entities) {
            monsters.add((Mob) entity);
            i++;
            if (i == num) {
                break;
            }
        }
        return monsters;
    }

    public static Mob getOneMonster(Location location, double x, double y, double z) {
        Iterator<Entity> entityIterator = world.getNearbyEntities(location, x, y, z, entity -> entity.getScoreboardTags().contains("m")).iterator();
        if (entityIterator.hasNext()) {
            return (Mob) entityIterator.next();
        }
        return null;
    }

    public static ArrayList<Mob> getRandomMonsters(Location location, double x, double y, double z, int num) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getScoreboardTags().contains("m"));
        ArrayList<Mob> monsters = new ArrayList<>(num);
        int i = 0;
        for (Entity entity : entities) {
            if (i < num) {
                monsters.add((Mob) entity);
            } else {
                int replaceIndex = random.nextInt(i + 1);
                if (replaceIndex < num) {
                    monsters.set(replaceIndex, (Mob) entity);
                }
            }
            i++;
        }
        return monsters;
    }

    public static Mob getRandomMonster(Location location, double x, double y, double z) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getScoreboardTags().contains("m"));
        Mob monster = null;
        int i = 0;
        for (Entity entity : entities) {

            if (i == 0) {
                monster = (Mob) entity;
            } else {
                int replaceIndex = random.nextInt(i + 1);
                if (replaceIndex == 0) {
                    monster = (Mob) entity;
                }
            }
            i++;

        }
        return monster;
    }


    public static Mob getNearestMonster(Location location, double x, double y, double z) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getScoreboardTags().contains("m"));
        Mob nearest = null;
        double nearestDistance = 0;
        for (Entity entity : entities) {
            Mob mob = (Mob) entity;
            double distance = mydistance(location, mob.getLocation());
            if (nearest == null || distance < nearestDistance) {
                nearest = mob;
                nearestDistance = distance;
            }
        }
        return nearest;
    }

    public static Collection<Entity> getPlayers(Location location, double x, double y, double z) {
        return world.getNearbyEntities(location, x, y, z, entity -> entity.getType() == EntityType.PLAYER);
    }


    public static ArrayList<Player> getNumberLimitPlayers(Location location, double x, double y, double z, int num) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getType() == EntityType.PLAYER);
        ArrayList<Player> players = new ArrayList<>(num);
        int i = 0;
        for (Entity entity : entities) {
            players.add((Player) entity);
            i++;
            if (i == num) {
                break;
            }
        }
        return players;
    }

    public static Player getOnePlayer(Location location, double x, double y, double z) {
        Iterator<Entity> iterator = world.getNearbyEntities(location, x, y, z, entity -> entity.getType() == EntityType.PLAYER).iterator();
        if (iterator.hasNext()) {
            return (Player) iterator.next();
        }

        return null;
    }

    public static ArrayList<Player> getRandomPlayers(Location location, double x, double y, double z, int num) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getType() == EntityType.PLAYER);
        ArrayList<Player> players = new ArrayList<>(num);
        int i = 0;
        for (Entity entity : entities) {
            if (i < num) {
                players.add((Player) entity);
            } else {
                int replaceIndex = random.nextInt(i + 1);
                if (replaceIndex < num) {
                    players.set(replaceIndex, (Player) entity);
                }
            }
            i++;
        }
        return players;
    }

    public static Player getRandomPlayer(Location location, double x, double y, double z) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getType() == EntityType.PLAYER);
        Player player = null;
        int i = 0;
        for (Entity entity : entities) {
            if (i < 0) {
                player = (Player) entity;
            } else {
                int replaceIndex = random.nextInt(i + 1);
                if (replaceIndex == 0) {
                    player = (Player) entity;
                }
            }
            i++;
        }
        return player;
    }

    public static Player getNearestPlayer(Location location, double x, double y, double z) {
        Collection<Entity> entities = world.getNearbyEntities(location, x, y, z, entity -> entity.getType() == EntityType.PLAYER);
        Player nearest = null;
        double nearestDistance = 0;
        for (Entity entity : entities) {
            Player player = (Player) entity;
            double distance = mydistance(location, player.getLocation());
            if (nearest == null || distance < nearestDistance) {
                nearest = player;
                nearestDistance = distance;
            }

        }
        return nearest;
    }


    public static ArrayList<Mob> getRayMonsterWithRoatation(Location eyeLocation, double midDistance, double angle) {
        double x = eyeLocation.getX();
        double y = eyeLocation.getY();
        double z = eyeLocation.getZ();
        Vector forward = eyeLocation.getDirection();
        // 计算 Right 向量
        Vector upReference = new Vector(0, 1, 0); // Y轴向量
        Vector right = upReference.getCrossProduct(forward).normalize(); // Right
        // 计算 Up 向量
        Vector up = forward.getCrossProduct(right).normalize(); // Up

        Vector direction = forward.rotateAroundNonUnitAxis(up, angle);
        double dx = direction.getX() * midDistance;
        double dy = direction.getY() * midDistance;
        double dz = direction.getZ() * midDistance;
        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> monsters = GetEntity.getMonsters(midPoint, Math.abs(dx)+0.5, Math.abs(dy)+0.5, Math.abs(dz)+0.5);
        ArrayList<Mob> mobs = new ArrayList<>(monsters.size());
        Vector eyeVector = eyeLocation.toVector();
        helpRay(monsters, mobs, 0, eyeVector, direction);

        return mobs;
    }

    public static ArrayList<Mob> getRayMonsterWithRoatation(Location eyeLocation, double midDistance, double angle, double sizeAdder) {
        double x = eyeLocation.getX();
        double y = eyeLocation.getY();
        double z = eyeLocation.getZ();
        Vector forward = eyeLocation.getDirection();
        // 计算 Right 向量
        Vector upReference = new Vector(0, 1, 0); // Y轴向量
        Vector right = upReference.getCrossProduct(forward).normalize(); // Right
        // 计算 Up 向量
        Vector up = forward.getCrossProduct(right).normalize(); // Up

        Vector direction = forward.rotateAroundNonUnitAxis(up, angle);
        double dx = direction.getX() * midDistance;
        double dy = direction.getY() * midDistance;
        double dz = direction.getZ() * midDistance;
        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> monsters = GetEntity.getMonsters(midPoint, Math.abs(dx)+0.5+sizeAdder, Math.abs(dy)+0.5+sizeAdder, Math.abs(dz)+0.5+sizeAdder);
        ArrayList<Mob> mobs = new ArrayList<>(monsters.size());
        Vector eyeVector = eyeLocation.toVector();
        helpRay(monsters, mobs, sizeAdder, eyeVector, direction);

        return mobs;
    }

    public static ArrayList<Mob> getLineMonster(Vector start, Vector end) {
        double x = start.getX();
        double y = start.getY();
        double z = start.getZ();

        double dx = (end.getX() - x) / 2;
        double dy = (end.getY() - y) / 2;
        double dz = (end.getZ() - z) / 2;

        Vector direction = new Vector(dx, dy, dz).normalize();

        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> monsters = GetEntity.getMonsters(midPoint, Math.abs(dx) + 0.5, Math.abs(dy) + 0.5, Math.abs(dz) + 0.5);
        ArrayList<Mob> mobs = new ArrayList<>(monsters.size());
        helpRay(monsters, mobs, 0, start, direction);

        return mobs;
    }

    public static ArrayList<Player> getLinePlayer(Vector start, Vector end) {
        double x = start.getX();
        double y = start.getY();
        double z = start.getZ();

        double dx = (end.getX() - x) / 2;
        double dy = (end.getY() - y) / 2;
        double dz = (end.getZ() - z) / 2;

        Vector direction = new Vector(dx, dy, dz).normalize();

        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> entities = GetEntity.getPlayers(midPoint, Math.abs(dx) + 0.5, Math.abs(dy) + 0.5, Math.abs(dz) + 0.5);
        ArrayList<Player> players = new ArrayList<>(entities.size());
        helpRayPlayer(entities, players, 0, start, direction);
        return players;
    }


    public static ArrayList<Player> getLinePlayer(Vector start, Vector end, double sizeAdder) {
        double x = start.getX();
        double y = start.getY();
        double z = start.getZ();

        double dx = (end.getX() - x) / 2;
        double dy = (end.getY() - y) / 2;
        double dz = (end.getZ() - z) / 2;

        Vector direction = new Vector(dx, dy, dz).normalize();

        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> entities = GetEntity.getPlayers(midPoint, Math.abs(dx) + 0.5 +sizeAdder, Math.abs(dy) + 0.5 +sizeAdder, Math.abs(dz) + 0.5 +sizeAdder);
        ArrayList<Player> players = new ArrayList<>(entities.size());
        helpRayPlayer(entities, players, sizeAdder, start, direction);
        return players;
    }

    public static ArrayList<Mob> getLineMonster(Vector start, Vector end, double sizeAdder) {
        double x = start.getX();
        double y = start.getY();
        double z = start.getZ();

        double dx = (end.getX() - x) / 2;
        double dy = (end.getY() - y) / 2;
        double dz = (end.getZ() - z) / 2;

        Vector direction = new Vector(dx, dy, dz).normalize();

        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> monsters = GetEntity.getMonsters(midPoint, Math.abs(dx) + 0.5 +sizeAdder, Math.abs(dy) + 0.5 +sizeAdder, Math.abs(dz) + 0.5 +sizeAdder);
        ArrayList<Mob> mobs = new ArrayList<>(monsters.size());
        helpRay(monsters, mobs, sizeAdder, start, direction);

        return mobs;
    }

    public static ArrayList<Mob> getRayMonster(Location eyeLocation, double midDistance) {
        double x = eyeLocation.getX();
        double y = eyeLocation.getY();
        double z = eyeLocation.getZ();
        Vector direction = eyeLocation.getDirection();
        double dx = direction.getX() * midDistance;
        double dy = direction.getY() * midDistance;
        double dz = direction.getZ() * midDistance;
        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> monsters = GetEntity.getMonsters(midPoint, Math.abs(dx)+0.5, Math.abs(dy)+0.5, Math.abs(dz)+0.5);
        ArrayList<Mob> mobs = new ArrayList<>(monsters.size());
        Vector eyeVector = eyeLocation.toVector();
        //生物高度的一半加上去获得中心坐标向量，距离设置为高度宽度平均值一半的平方（避免一个过大造成的严重影响）,再稍微大一点
        helpRay(monsters, mobs, 0, eyeVector, direction);
        return mobs;
    }

    public static ArrayList<Player> getRayPlayer(Location eyeLocation, double midDistance) {
        double x = eyeLocation.getX();
        double y = eyeLocation.getY();
        double z = eyeLocation.getZ();
        Vector direction = eyeLocation.getDirection();
        double dx = direction.getX() * midDistance;
        double dy = direction.getY() * midDistance;
        double dz = direction.getZ() * midDistance;
        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> entities = GetEntity.getPlayers(midPoint, Math.abs(dx)+0.5, Math.abs(dy)+0.5, Math.abs(dz)+0.5);
        ArrayList<Player> players = new ArrayList<>(entities.size());
        Vector eyeVector = eyeLocation.toVector();
        helpRayPlayer(entities, players, 0, eyeVector, direction);
        return players;
    }

    public static ArrayList<Mob> getRayMonster(Location eyeLocation, double midDistance, double sizeAdder) {
        double x = eyeLocation.getX();
        double y = eyeLocation.getY();
        double z = eyeLocation.getZ();
        Vector direction = eyeLocation.getDirection();
        double dx = direction.getX() * midDistance;
        double dy = direction.getY() * midDistance;
        double dz = direction.getZ() * midDistance;
        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> monsters = GetEntity.getMonsters(midPoint, Math.abs(dx) + 0.5 + sizeAdder, Math.abs(dy) + 0.5 + sizeAdder, Math.abs(dz) + 0.5 + sizeAdder);
        ArrayList<Mob> mobs = new ArrayList<>(monsters.size());
        Vector eyeVector = eyeLocation.toVector();
        helpRay(monsters, mobs, sizeAdder, eyeVector, direction);
        return mobs;
    }

    public static ArrayList<Player> getRayPlayer(Location eyeLocation, double midDistance, double sizeAdder) {
        double x = eyeLocation.getX();
        double y = eyeLocation.getY();
        double z = eyeLocation.getZ();
        Vector direction = eyeLocation.getDirection();
        double dx = direction.getX() * midDistance;
        double dy = direction.getY() * midDistance;
        double dz = direction.getZ() * midDistance;
        Location midPoint = new Location(GetEntity.world, x + dx, y + dy, z + dz);
        Collection<Entity> entities = GetEntity.getPlayers(midPoint, Math.abs(dx) + 0.5 + sizeAdder, Math.abs(dy) + 0.5 + sizeAdder, Math.abs(dz) + 0.5 + sizeAdder);
        ArrayList<Player> players = new ArrayList<>(entities.size());
        Vector eyeVector = eyeLocation.toVector();
        helpRayPlayer(entities, players, sizeAdder, eyeVector, direction);
        return players;
    }


    public static void init() {
        world = Bukkit.getWorld("world");
        world.setSpawnLocation(1331, 83, 42);
        random = new Random();

        //Gamerule
        world.setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS, true);
        world.setGameRule(GameRule.BLOCK_EXPLOSION_DROP_DECAY, true);
        world.setGameRule(GameRule.COMMAND_BLOCK_OUTPUT, false);
        world.setGameRule(GameRule.COMMAND_MODIFICATION_BLOCK_LIMIT, 1000000000);
        world.setGameRule(GameRule.DISABLE_ELYTRA_MOVEMENT_CHECK, true);
        world.setGameRule(GameRule.DISABLE_RAIDS, true);
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, true);
        world.setGameRule(GameRule.DO_ENTITY_DROPS, false);
        world.setGameRule(GameRule.DO_FIRE_TICK, false);
        world.setGameRule(GameRule.DO_IMMEDIATE_RESPAWN, true);
        world.setGameRule(GameRule.DO_INSOMNIA, false);
        world.setGameRule(GameRule.DO_LIMITED_CRAFTING, true);
        world.setGameRule(GameRule.DO_MOB_LOOT, false);
        world.setGameRule(GameRule.DO_MOB_SPAWNING, false);
        world.setGameRule(GameRule.DO_PATROL_SPAWNING, false);
        world.setGameRule(GameRule.DO_TILE_DROPS, false);
        world.setGameRule(GameRule.DO_TRADER_SPAWNING, false);
        world.setGameRule(GameRule.DO_VINES_SPREAD, false);
        world.setGameRule(GameRule.DO_WARDEN_SPAWNING, false);
        world.setGameRule(GameRule.DO_WEATHER_CYCLE, true);
        world.setGameRule(GameRule.DROWNING_DAMAGE, true);
        world.setGameRule(GameRule.FALL_DAMAGE, true);
        world.setGameRule(GameRule.FIRE_DAMAGE, true);
        world.setGameRule(GameRule.FORGIVE_DEAD_PLAYERS, false);
        world.setGameRule(GameRule.FREEZE_DAMAGE, true);
        world.setGameRule(GameRule.GLOBAL_SOUND_EVENTS, true);
        world.setGameRule(GameRule.KEEP_INVENTORY, true);
        world.setGameRule(GameRule.LAVA_SOURCE_CONVERSION, false);
        world.setGameRule(GameRule.LOG_ADMIN_COMMANDS, false);
        world.setGameRule(GameRule.MAX_COMMAND_CHAIN_LENGTH, 1000000000);
        world.setGameRule(GameRule.MAX_COMMAND_FORK_COUNT, 1000000000);
        world.setGameRule(GameRule.MAX_ENTITY_CRAMMING, 0);
        world.setGameRule(GameRule.MOB_EXPLOSION_DROP_DECAY, true);
        world.setGameRule(GameRule.MOB_GRIEFING, false);
        world.setGameRule(GameRule.NATURAL_REGENERATION, true);
        world.setGameRule(GameRule.PLAYERS_NETHER_PORTAL_CREATIVE_DELAY, 100);
        world.setGameRule(GameRule.PLAYERS_NETHER_PORTAL_DEFAULT_DELAY, 100);
        world.setGameRule(GameRule.PLAYERS_SLEEPING_PERCENTAGE, 100);
        world.setGameRule(GameRule.PROJECTILES_CAN_BREAK_BLOCKS, false);
        world.setGameRule(GameRule.RANDOM_TICK_SPEED, 0);
        world.setGameRule(GameRule.REDUCED_DEBUG_INFO, false);
        world.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, true);
        world.setGameRule(GameRule.SHOW_DEATH_MESSAGES, true);
        world.setGameRule(GameRule.SNOW_ACCUMULATION_HEIGHT, 0);
        world.setGameRule(GameRule.SPAWN_RADIUS, 0);
        world.setGameRule(GameRule.SPAWN_CHUNK_RADIUS, 0);
        world.setGameRule(GameRule.SPECTATORS_GENERATE_CHUNKS, true);
        world.setGameRule(GameRule.TNT_EXPLOSION_DROP_DECAY, true);
        world.setGameRule(GameRule.UNIVERSAL_ANGER, true);
        world.setGameRule(GameRule.WATER_SOURCE_CONVERSION, true);
        world.setGameRule(GameRule.DISABLE_PLAYER_MOVEMENT_CHECK, true);
    }

    public static void helpRayPlayer(Collection<Entity> entities, ArrayList<Player> players, double sizeAdder, Vector startLocation, Vector direction) {
        for (Entity entity : entities) {
            Player player = (Player) entity;
            double scale = player.getAttribute(Attribute.SCALE).getValue();
            //高度：2格
            //宽度：2格
            Vector eyeToEntityFeet = player.getLocation().toVector();
            eyeToEntityFeet.setY(eyeToEntityFeet.getY() + scale).subtract(startLocation);
            double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
            if (distance < scale) {
                players.add(player);
            }
        }
    }


    public static void helpRay(Collection<Entity> monsters, ArrayList<Mob> filteredMonsters, double sizeAdder, Vector startLocation, Vector direction) {
        for (Entity entity : monsters) {
            Mob entity1 = (Mob) entity;
            double scale = entity1.getAttribute(Attribute.SCALE).getValue();
            switch (entity.getType()) {
                //生物高度的一半加上去获得中心坐标向量，距离设置为高度宽度平均值一半的平方（避免一个过大造成的严重影响）,再稍微大一点
                case SILVERFISH -> {
                    //高度：0.3格
                    //宽度：0.4格
                    Silverfish mob = (Silverfish) entity;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.15 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.175 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case SHULKER -> {
                    //宽高1格
                    Shulker mob = (Shulker) entity;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.5 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.5 * scale) {
                        filteredMonsters.add(mob);
                    }
                }


                case RAVAGER -> {
                    Ravager mob = (Ravager) entity;

                    //高度：2.2格
                    //宽度：1.95格
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 1.1 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 1.0375 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case WITCH -> {
                    Witch mob = (Witch) entity;
                    //高度：1.95格
                    //宽度：0.6格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case ILLUSIONER -> {
                    Illusioner mob = (Illusioner) entity;
                    //高度：1.95格
                    //宽度：0.6格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case VINDICATOR -> {
                    Vindicator mob = (Vindicator) entity;
                    //高度：1.95格
                    //宽度：0.6格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                    }
                }


                case PILLAGER -> {
                    Pillager mob = (Pillager) entity;
                    //高度：1.95格
                    //宽度：0.6格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case ZOMBIFIED_PIGLIN -> {
                    PigZombie mob = (PigZombie) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.95格
                        //宽度：0.6格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                        }

                    } else {
                        //幼年
                        //高度：0.975格
                        //宽度：0.3格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.4875 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 0.8125 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.1625 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                        }

                    }
                }


                case PIGLIN_BRUTE -> {
                    PiglinBrute mob = (PiglinBrute) entity;
                    //高度：1.95格
                    //宽度：0.6格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case ZOGLIN -> {
                    Zoglin mob = (Zoglin) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.4格
                        //宽度：1.3965格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.7 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.699125 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.7格
                        //宽度：0.6982格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.35 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.34955 * scale) {
                            filteredMonsters.add(mob);
                        }
                    }
                }


                case RABBIT -> {
                    Rabbit mob = (Rabbit) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：0.5格
                        //宽度：0.4格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.25 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.225 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.25格
                        //宽度：0.2格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.125 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.1125 * scale) {
                            filteredMonsters.add(mob);
                        }
                    }
                }

                case PHANTOM -> {
                    Phantom mob = (Phantom) entity;
                    int size = mob.getSize();
                    //尺寸
                    double halfwidth = 0.9 + 0.2 * size;
                    double halfweight = 0.5 + 0.1 * size;
                    double average = (halfwidth + halfweight) / 2;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + halfweight).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < average) {
                        filteredMonsters.add(mob);
                    }
                }

                case SPIDER -> {
                    Spider mob = (Spider) entity;
                    //高度：0.9格
                    //宽度：1.4格
                    mob.getWidth();
                    mob.getHeight();
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.45 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.575 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case CAVE_SPIDER -> {
                    CaveSpider mob = (CaveSpider) entity;
                    //高度: 0.5方块
                    //宽度: 0.7方块
                    mob.getWidth();
                    mob.getHeight();
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.25 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.3 * scale) {
                        filteredMonsters.add(mob);
                    }
                }


                case STRAY -> {
                    Stray mob = (Stray) entity;
                    //高度1.99
                    //宽度0.6
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.993 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.662 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.324 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.655 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.331 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case BOGGED -> {
                    Bogged mob = (Bogged) entity;
                    //高度1.99
                    //宽度0.6
                    Vector base = mob.getLocation().toVector();
                    Vector v1 = base.clone().setY(base.getY() + 0.993 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.662 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.324 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.655 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.331 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case SKELETON -> {
                    Skeleton mob = (Skeleton) entity;
                    //高度1.99
                    //宽度0.6
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.993 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.662 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.324 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.655 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.331 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3155 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case MAGMA_CUBE -> {
                    MagmaCube mob = (MagmaCube) entity;
                    //高度：0.52*size
                    //宽度：0.52*size
                    int size = mob.getSize();
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.26 * size).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.26 * size) {
                        filteredMonsters.add(mob);
                    }
                }

                case SLIME -> {
                    Slime mob = (Slime) entity;
                    //高度：0.52*size
                    //宽度：0.52*size
                    int size = mob.getSize();
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.26 * size).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.26 * size) {
                        filteredMonsters.add(mob);
                    }
                }

                case PIGLIN -> {
                    Piglin mob = (Piglin) entity;

                    //成年
                    //高度：1.95格
                    //宽度：0.6格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case ZOMBIE_VILLAGER -> {
                    ZombieVillager mob = (ZombieVillager) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.95格
                        //宽度：0.6格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                        }

                    } else {
                        //幼年
                        //高度：0.975格
                        //宽度：0.3格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.4875 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 0.8125 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.1625 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                        }

                    }
                }

                case ZOMBIE -> {
                    Zombie mob = (Zombie) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.95格
                        //宽度：0.6格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                        }

                    } else {
                        //幼年
                        //高度：0.975格
                        //宽度：0.3格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.4875 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 0.8125 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.1625 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                        }

                    }
                }

                case DROWNED -> {
                    Drowned mob = (Drowned) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.95格
                        //宽度：0.6格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                        }

                    } else {
                        //幼年
                        //高度：0.975格
                        //宽度：0.3格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.4875 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 0.8125 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.1625 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                        }

                    }
                }


                case EVOKER -> {
                    //高度：1.95格
                    //宽度：0.6格
                    Evoker mob = (Evoker) entity;


                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3125 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case GHAST -> {
                    //高度：4.0格
                    //宽度：4.0格
                    Ghast mob = (Ghast) entity;

                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 2.0 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 2.0 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case ENDERMITE -> {
                    //高度：0.3格
                    //宽度：0.4格
                    Endermite mob = (Endermite) entity;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.15 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.175 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case ELDER_GUARDIAN -> {
                    //高度：1.9975格
                    //宽度：1.9975格
                    ElderGuardian mob = (ElderGuardian) entity;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.99875 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 1 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case PUFFERFISH -> {
                    PufferFish mob = (PufferFish) entity;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    int state = mob.getPuffState();
                    switch (state) {
                        case 0 -> {
                            //未膨胀的河豚：
                            //高度：0.35格
                            //宽度：0.35格
                            eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.175 * scale).subtract(startLocation);
                            double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                            if (distance < 0.175 * scale) {
                                filteredMonsters.add(mob);
                            }
                        }

                        case 1 -> {
                            //半膨胀的河豚：
                            //高度：0.5格
                            //宽度：0.5格
                            eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.25 * scale).subtract(startLocation);
                            double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                            if (distance < 0.25 * scale) {
                                filteredMonsters.add(mob);
                            }
                        }

                        case 2 -> {
                            //完全膨胀的河豚：
                            //高度：0.7格
                            //宽度：0.7格
                            eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.35 * scale).subtract(startLocation);
                            double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                            if (distance < 0.35 * scale) {
                                filteredMonsters.add(mob);
                            }
                        }
                    }

                }

                case GUARDIAN -> {
                    //高度：0.85格
                    //宽度：0.85格
                    Guardian mob = (Guardian) entity;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.425 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.425 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case HUSK -> {
                    Husk mob = (Husk) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.95格
                        //宽度：0.6格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.975 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 1.3 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 1.625 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                        }

                    } else {
                        //幼年
                        //高度：0.975格
                        //宽度：0.3格
                        Vector base = mob.getLocation().toVector();

                        Vector v1 = base.clone().setY(base.getY() + 0.4875 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.325 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v3 = base.clone().setY(base.getY() + 0.65 * scale).subtract(startLocation);
                        double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                        if (distance3 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v4 = base.clone().setY(base.getY() + 0.8125 * scale).subtract(startLocation);
                        double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                        if (distance4 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v5 = base.clone().setY(base.getY() + 0.1625 * scale).subtract(startLocation);
                        double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                        if (distance5 < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                        }

                    }

                }
//
                case HOGLIN -> {
                    Hoglin mob = (Hoglin) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.4格
                        //宽度：1.3965格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.7 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.7 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.7格
                        //宽度：0.6982格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.35 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.35 * scale) {
                            filteredMonsters.add(mob);
                        }

                    }
                }

                case ENDERMAN -> {
                    Enderman mob = (Enderman) entity;
                    //高度：2.9格
                    //宽度：0.6格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 1.45 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 1.16 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.74 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 2.03 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.81 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v6 = base.clone().setY(base.getY() + 0.58 * scale).subtract(startLocation);
                    double distance6 = v6.crossProduct(direction).length() - sizeAdder;
                    if (distance6 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v7 = base.clone().setY(base.getY() + 2.32 * scale).subtract(startLocation);
                    double distance7 = v7.crossProduct(direction).length() - sizeAdder;
                    if (distance7 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v8 = base.clone().setY(base.getY() + 0.29 * scale).subtract(startLocation);
                    double distance8 = v8.crossProduct(direction).length() - sizeAdder;
                    if (distance8 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v9 = base.clone().setY(base.getY() + 2.61 * scale).subtract(startLocation);
                    double distance9 = v9.crossProduct(direction).length() - sizeAdder;
                    if (distance9 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case WITHER -> {
                    Wither mob = (Wither) entity;
                    //高度：3.5格
                    //宽度：0.9格
                    Vector base = mob.getLocation().toVector();


                    Vector v1 = base.clone().setY(base.getY() + 2.0 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.475 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 1.5 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.475 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.0 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.475 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 2.5 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.475 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 3.0 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.475 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v6 = base.clone().setY(base.getY() + 0.5 * scale).subtract(startLocation);
                    double distance6 = v6.crossProduct(direction).length() - sizeAdder;
                    if (distance6 < 0.475 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case WITHER_SKELETON -> {
                    WitherSkeleton mob = (WitherSkeleton) entity;
                    //高度：2.4格
                    //宽度：0.7格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 1.372 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.35 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 1.029 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.35 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 0.686 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.35 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.715 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.35 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 2.058 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.35 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v6 = base.clone().setY(base.getY() + 0.343 * scale).subtract(startLocation);
                    double distance6 = v6.crossProduct(direction).length() - sizeAdder;
                    if (distance6 < 0.35 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case WARDEN -> {
                    Warden mob = (Warden) entity;
                    //高度：2.9格
                    //宽度：0.9格
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 1.45 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.45 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.966 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.45 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.929 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.45 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 2.412 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.45 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.483 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.45 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case BREEZE -> {
                    //高度：1.77格
                    //宽度：0.6格
                    Breeze mob = (Breeze) entity;
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.885 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.59 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.18 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.475 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.295 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                    }
                }


                case BLAZE -> {
                    //高度：1.8格
                    //宽度：0.6格
                    Blaze mob = (Blaze) entity;
                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.9 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.6 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.2 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.5 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.3 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                    }


                }


                case CREEPER -> {
                    //高度：1.7格
                    //宽度：0.6格
                    Creeper mob = (Creeper) entity;

                    Vector base = mob.getLocation().toVector();

                    Vector v1 = base.clone().setY(base.getY() + 0.85 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.566 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 1.132 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v4 = base.clone().setY(base.getY() + 1.415 * scale).subtract(startLocation);
                    double distance4 = v4.crossProduct(direction).length() - sizeAdder;
                    if (distance4 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v5 = base.clone().setY(base.getY() + 0.283 * scale).subtract(startLocation);
                    double distance5 = v5.crossProduct(direction).length() - sizeAdder;
                    if (distance5 < 0.3 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                //条件敌对

                case POLAR_BEAR -> {
                    PolarBear mob = (PolarBear) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.4格
                        //宽度：1.4格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.7 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.7 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.7格
                        //宽度：0.7格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.35 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.35 * scale) {
                            filteredMonsters.add(mob);
                        }
                    }
                }

                case BEE -> {
                    Bee mob = (Bee) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：0.6格
                        //宽度：0.7格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.3 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.325 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.3格
                        //宽度：0.35格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.15 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                        }
                    }
                }
                case DOLPHIN -> {
                    //高度：0.6格
                    //宽度：0.9格
                    Dolphin mob = (Dolphin) entity;
                    Vector eyeToEntityFeet = mob.getLocation().toVector();
                    eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.3 * scale).subtract(startLocation);
                    double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                    if (distance < 0.375 * scale) {
                        filteredMonsters.add(mob);
                    }
                }
                case FOX -> {
                    Fox mob = (Fox) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：0.7格
                        //宽度：0.6格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.35 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.3125 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.35格
                        //宽度：0.3格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.175 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.15625 * scale) {
                            filteredMonsters.add(mob);
                        }
                    }
                }

                case IRON_GOLEM -> {
                    //高度：2.7格
                    //宽度：1.4格
                    IronGolem mob = (IronGolem) entity;
                    Vector base = mob.getLocation().toVector();
                    Vector v1 = base.clone().setY(base.getY() + 1.35 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.7 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.675 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.7 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 2.025 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.7 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case VEX -> {
                    Vex mob = (Vex) entity;
                    //高度：0.8格
                    //宽度：0.4格
                    Vector base = mob.getLocation().toVector();
                    Vector v1 = base.clone().setY(base.getY() + 0.6 * scale).subtract(startLocation);
                    double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                    if (distance1 < 0.2 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v2 = base.clone().setY(base.getY() + 0.4 * scale).subtract(startLocation);
                    double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                    if (distance2 < 0.2 * scale) {
                        filteredMonsters.add(mob);
                        continue;
                    }
                    Vector v3 = base.clone().setY(base.getY() + 0.2 * scale).subtract(startLocation);
                    double distance3 = v3.crossProduct(direction).length() - sizeAdder;
                    if (distance3 < 0.2 * scale) {
                        filteredMonsters.add(mob);
                    }
                }

                case WOLF -> {
                    Wolf mob = (Wolf) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：0.85格
                        //宽度：0.6格
                        Vector base = mob.getLocation().toVector();
                        Vector v1 = base.clone().setY(base.getY() + 0.284 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.3 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.568 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.3 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.425格
                        //宽度：0.3格
                        Vector base = mob.getLocation().toVector();
                        Vector v1 = base.clone().setY(base.getY() + 0.142 * scale).subtract(startLocation);
                        double distance1 = v1.crossProduct(direction).length() - sizeAdder;
                        if (distance1 < 0.15 * scale) {
                            filteredMonsters.add(mob);
                            continue;
                        }
                        Vector v2 = base.clone().setY(base.getY() + 0.284 * scale).subtract(startLocation);
                        double distance2 = v2.crossProduct(direction).length() - sizeAdder;
                        if (distance2 < 0.15 * scale) {
                            filteredMonsters.add(mob);
                        }

                    }
                }

                case PANDA -> {
                    Panda mob = (Panda) entity;
                    if (mob.isAdult()) {
                        //成年
                        //高度：1.25格
                        //宽度：1.3格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.625 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.65 * scale) {
                            filteredMonsters.add(mob);
                        }
                    } else {
                        //幼年
                        //高度：0.625格
                        //宽度：0.65格
                        Vector eyeToEntityFeet = mob.getLocation().toVector();
                        eyeToEntityFeet.setY(eyeToEntityFeet.getY() + 0.3125 * scale).subtract(startLocation);
                        double distance = eyeToEntityFeet.crossProduct(direction).length() - sizeAdder;
                        if (distance < 0.325 * scale) {
                            filteredMonsters.add(mob);
                        }
                    }
                }

            }

        }
    }
}






























