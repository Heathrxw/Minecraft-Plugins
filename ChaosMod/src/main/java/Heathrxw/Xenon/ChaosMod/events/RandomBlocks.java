package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class RandomBlocks extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target !=null) {
            target.getLocation().add(0, -1, 2).getBlock().setType(Material.RED_WOOL);
            target.getLocation().add(0, 2, 3).getBlock().setType(Material.BLACK_BED);
            target.getLocation().add(2, 1, 1).getBlock().setType(Material.LAVA);
            target.getLocation().add(4, 1, -2).getBlock().setType(Material.LAVA);
            target.getLocation().add(1, 0, -4).getBlock().setType(Material.OBSIDIAN);
            target.getLocation().add(3, 0, -2).getBlock().setType(Material.GLASS);
            target.getLocation().add(-3, -2, -1).getBlock().setType(Material.BEACON);
            target.getLocation().add(2, 3, 3).getBlock().setType(Material.BEDROCK);
            target.getLocation().add(-2, 1, 2).getBlock().setType(Material.JACK_O_LANTERN);
            target.getLocation().add(2, 3, 2).getBlock().setType(Material.SPRUCE_WOOD);
            target.getLocation().add(4, 2, 3).getBlock().setType(Material.WATER);
            target.getLocation().add(1, 1, 1).getBlock().setType(Material.DAMAGED_ANVIL);
            target.getLocation().add(3, 1, -2).getBlock().setType(Material.ANDESITE);
            target.getLocation().add(2, -2, -3).getBlock().setType(Material.ACACIA_LOG);
            target.getLocation().add(4, -1, -1).getBlock().setType(Material.LANTERN);
        }
    }

    public String getName() {
        return "Bedrock Trap";
    }
}
