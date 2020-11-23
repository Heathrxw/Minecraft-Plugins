package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GoldEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
            target.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));


        }
    }

    public String getName() {
        return "Gold";
    }
}
