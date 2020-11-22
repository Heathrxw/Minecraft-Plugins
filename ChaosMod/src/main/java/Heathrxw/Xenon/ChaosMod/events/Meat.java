package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Meat extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 16));
            target.getInventory().addItem(new ItemStack(Material.COOKED_PORKCHOP, 16));
            target.getInventory().addItem(new ItemStack(Material.COOKED_CHICKEN, 16));
            target.getInventory().addItem(new ItemStack(Material.COOKED_MUTTON, 16));
            target.getInventory().addItem(new ItemStack(Material.CAKE, 16));
            target.getInventory().addItem(new ItemStack(Material.APPLE, 16));
        }
    }

    public String getName() {
        return "Food";
    }
}
