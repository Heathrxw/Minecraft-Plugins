package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ToolsEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.WOODEN_AXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.WOODEN_HOE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.WOODEN_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.WOODEN_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.WOODEN_SWORD, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONE_AXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONE_HOE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONE_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONE_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONE_SWORD, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_AXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_HOE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_SWORD, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GOLDEN_AXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GOLDEN_HOE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GOLDEN_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GOLDEN_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GOLDEN_SWORD, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_AXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_HOE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIAMOND_SWORD, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.NETHERITE_AXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.NETHERITE_HOE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.NETHERITE_PICKAXE, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.NETHERITE_SHOVEL, 1));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.NETHERITE_SWORD, 1));

        }
    }

    public String getName() {
        return "Tools";
    }
}
