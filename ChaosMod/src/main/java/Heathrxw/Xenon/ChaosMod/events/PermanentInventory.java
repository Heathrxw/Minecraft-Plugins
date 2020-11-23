package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PermanentInventory extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            for(ItemStack itemStack : target.getInventory().getContents()) {
                if(itemStack != null) {
                    Item droppedItem = target.getWorld().dropItemNaturally(target.getLocation(), itemStack);
                    target.getInventory().removeItem(itemStack);
                    droppedItem.setPickupDelay(900000);
                }
            }
            target.getInventory().getItem(1);

        }
    }

    public String getName() {
        return "Permanent Inventory Drop";
    }
}
