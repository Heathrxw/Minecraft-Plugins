package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class TheEnd extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.ENDER_DRAGON);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.ENDER_DRAGON);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.ENDER_DRAGON);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.ENDER_DRAGON);
            target.getWorld().spawnEntity(target.getLocation().add(0, 3, 0), EntityType.ENDER_DRAGON);
        }
    }

    public String getName() {
        return "The End";
    }
}
