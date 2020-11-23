package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class RandomLocation2 extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            Location location = new Location(target.getWorld(), target.getLocation().getX() -282,
                    target.getLocation().getY(), target.getLocation().getZ()
            );
            target.teleport(location);
        }
    }

    public String getName() {
        return "Random Location";
    }
}
