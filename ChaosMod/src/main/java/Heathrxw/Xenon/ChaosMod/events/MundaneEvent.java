package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MundaneEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.NOTE_BLOCK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.ANDESITE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GRASS_BLOCK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.COAL_ORE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_ORE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SUGAR_CANE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SAND, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.IRON_BLOCK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.PINK_WOOL, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.BLUE_WOOL, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.DIRT, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SANDSTONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GLASS, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.RED_WOOL, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.COAL_BLOCK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.ORANGE_WOOL, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.TORCH, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.OAK_LEAVES, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.CLAY, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SMOOTH_STONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GOLD_BLOCK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.NETHERRACK, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.SOUL_SAND, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.BLACKSTONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.BASALT, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GLOWSTONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.CRAFTING_TABLE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.FURNACE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.CACTUS, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.POLISHED_ANDESITE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONECUTTER, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.MOSSY_COBBLESTONE, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.STONE_BRICKS, 16));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.MOSSY_STONE_BRICKS));
            target.getWorld().dropItemNaturally(target.getLocation(), new ItemStack(Material.GRAVEL));
        }
    }

    public String getName() {
        return "Boring.";
    }
}
