package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class AnvilEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getLocation().add(0, 12, 0).getBlock().setType(Material.ANVIL);
            target.getLocation().add(0, 12, 1).getBlock().setType(Material.ANVIL);
            target.getLocation().add(1, 12, 0).getBlock().setType(Material.ANVIL);
            target.getLocation().add(1, 12, 1).getBlock().setType(Material.ANVIL);
            target.getLocation().add(1, 12, -1).getBlock().setType(Material.ANVIL);
            target.getLocation().add(0, 12, -1).getBlock().setType(Material.ANVIL);
            target.getLocation().add(-1, 12, -1).getBlock().setType(Material.ANVIL);
            target.getLocation().add(1, 12, 1).getBlock().setType(Material.ANVIL);
            target.getLocation().add(-1, 12, 0).getBlock().setType(Material.ANVIL);
            target.getLocation().add(-1, 12, 1).getBlock().setType(Material.ANVIL);
        }
    }

    public String getName() {
        return "Anvil";
    }
}
