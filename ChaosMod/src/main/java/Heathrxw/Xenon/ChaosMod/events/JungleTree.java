package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.TreeType;
import org.bukkit.entity.Player;

public class JungleTree extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            target.getWorld().generateTree(target.getLocation(), TreeType.SMALL_JUNGLE);
        }
    }

    public String getName() {
        return "Jungle Tree";
    }
}
