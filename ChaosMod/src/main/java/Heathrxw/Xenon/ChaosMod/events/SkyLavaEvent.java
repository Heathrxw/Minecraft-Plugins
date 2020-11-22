package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class SkyLavaEvent extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            new Location(
                    target.getWorld(),
                    target.getLocation().getX(),
                    255,
                    target.getLocation().getZ()
            )
                    .getBlock()
                    .setType(Material.LAVA);
        }
    }

    public String getName() {
        return "Sky Lava";
    }
}
