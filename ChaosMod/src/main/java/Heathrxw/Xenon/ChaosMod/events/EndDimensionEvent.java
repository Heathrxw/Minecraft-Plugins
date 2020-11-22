package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class EndDimensionEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.END_CRYSTAL, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.END_PORTAL_FRAME, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.END_ROD, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.END_STONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.ENDERMAN_SPAWN_EGG, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.ENDER_CHEST, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.END_STONE_BRICK_SLAB, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.END_STONE_BRICKS, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.ENDER_EYE, 16));

        }
    }

    public String getName() {
        return "Endstone Inventory";
    }
}
