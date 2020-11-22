package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RedstoneEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.TNT, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.REDSTONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.REDSTONE_BLOCK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.REDSTONE_LAMP, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.REDSTONE_ORE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.REDSTONE_WALL_TORCH, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.REDSTONE_WIRE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DISPENSER, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.MINECART, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.PISTON, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STICKY_PISTON, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.TRIPWIRE_HOOK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STRING, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.OAK_PRESSURE_PLATE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.CLOCK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.FLINT_AND_STEEL, 16));

        }
    }

    public String getName() {
        return "Redstone Time";
    }
}
