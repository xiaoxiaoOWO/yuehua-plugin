package com.xiaoxiaoowo.yuehua.entity.npc.chat.middle;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.destroystokyo.paper.profile.ProfileProperty;
import com.xiaoxiaoowo.yuehua.Yuehua;
import com.xiaoxiaoowo.yuehua.items.other.Other;
import com.xiaoxiaoowo.yuehua.utils.GetEntity;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.SkullMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class ExSword1 {
    public static void spawn() {
        Location location = new Location(GetEntity.world, 1354, 38, 505, 180, 0);
        Villager villager = GetEntity.world.spawn(location, Villager.class, false, it -> {
            it.setAI(false);
            it.setSilent(true);
            it.setRemoveWhenFarAway(false);
            it.setInvulnerable(true);
            it.setAge(100000000);

            it.customName(Component.translatable("pl.npc.name.ex_sword1"));
            it.setCustomNameVisible(true);

            List<MerchantRecipe> recipes = new ArrayList<>();

            // Pink Dye for Book
            ItemStack buyItem = Other.NPC_PAOPAO.clone();

            ItemStack sellItem = new ItemStack(Material.WRITTEN_BOOK, 1);
            sellItem.editMeta(meta -> {
                BookMeta bookMeta = (BookMeta) meta;
                bookMeta.displayName(Component.text("§9暗不见底的过去"));
                bookMeta.author(Component.text("§9默默凝视雕像的男子"));
                bookMeta.pages(List.of(
                        Component.translatable("pl.book.ex_sword1.page1"),
                        Component.translatable("pl.book.ex_sword1.page2"),
                        Component.translatable("pl.book.ex_sword1.page3"),
                        Component.translatable("pl.book.ex_sword1.page4"),
                        Component.translatable("pl.book.ex_sword1.page5"),
                        Component.translatable("pl.book.ex_sword1.page6"),
                        Component.translatable("pl.book.ex_sword1.page7")
                ));
            });

            // Set up armor (player head)
            ItemStack armorHead = new ItemStack(Material.PLAYER_HEAD, 1);
            armorHead.editMeta(meta -> {
                SkullMeta skullMeta = (SkullMeta) meta;
                PlayerProfile profile = Bukkit.createProfile(UUID.randomUUID(), null);
                profile.getProperties().add(new ProfileProperty("textures", "eyJ0aW1lc3RhbXAiOjE0MTQyMjU4NjU4NzAsInByb2ZpbGVJZCI6IjViYjE5ZjBjNDBjNjQzMmZhMGY0NTQyZDAzY2YzZGNjIiwicHJvZmlsZU5hbWUiOiJBdWRpYWNlMDgwOSIsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iNGI0OGU5ZGQ5NGI1ZDlmOTkzNjcyYjY0YzVkZjdkODgwMzQ1N2QyMTU2NGY1NTQxYjZjZDU5ODVmMTYxYjUifX19"));
                skullMeta.setPlayerProfile(profile);
            });

            it.getEquipment().setHelmet(armorHead);


            MerchantRecipe recipe = new MerchantRecipe(sellItem, -2147483648, 2147483647, false, 0, 0, 0, 0, true);
            recipe.addIngredient(buyItem);
            recipes.add(recipe);

            it.setRecipes(recipes);
        });

        UUID uuid = villager.getUniqueId();
        Bukkit.dispatchCommand(Yuehua.console, "data modify entity " + uuid + " VillagerData set value {profession:\"minecraft:weaponsmith\",level:26,type:\"minecraft:taiga\"}");
    }
}