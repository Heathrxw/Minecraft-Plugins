package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class SkyLavaEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getLocation().add(0, 10, 0).getBlock().setType(Material.LAVA);
            target.getLocation().add(0, 10, 1).getBlock().setType(Material.LAVA);
            target.getLocation().add(1, 10, 0).getBlock().setType(Material.LAVA);
            target.getLocation().add(1, 10, 1).getBlock().setType(Material.LAVA);
            target.getLocation().add(1, 10, -1).getBlock().setType(Material.LAVA);
            target.getLocation().add(0, 10, -1).getBlock().setType(Material.LAVA);
            target.getLocation().add(-1, 10, -1).getBlock().setType(Material.LAVA);
            target.getLocation().add(1, 10, 1).getBlock().setType(Material.LAVA);
            target.getLocation().add(-1, 10, 0).getBlock().setType(Material.LAVA);
            target.getLocation().add(-1, 10, 1).getBlock().setType(Material.LAVA);
        }
    }

    public String getName() {
        return "Sky Lava";
    }
}
