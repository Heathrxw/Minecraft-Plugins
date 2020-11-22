package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SpawnEggEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SKELETON_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.BLAZE_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.ENDERMAN_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.CREEPER_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.RAVAGER_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.HORSE_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.OCELOT_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.WOLF_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.CHICKEN_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.COW_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.PIG_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SHULKER_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SLIME_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.PHANTOM_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.ZOGLIN_SPAWN_EGG, 16));

        }
    }

    public String getName() {
        return "Spawn Eggs For All";
    }
}
