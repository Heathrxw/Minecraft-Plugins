package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class IronToolEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_INGOT, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_HELMET, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_CHESTPLATE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_LEGGINGS, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_BOOTS, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_SWORD, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_AXE, 1));
        }
    }

    public String getName() {
        return "Iron";
    }
}
