package Heathrxw.Xenon.ChaosMod.events;

import Heathrxw.Xenon.ChaosMod.Chaos;
import Heathrxw.Xenon.ChaosMod.ChaosEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PermanentTrip extends ChaosEvent {
    public void onEnable(String username, Chaos plugin) {
        Player target = (Bukkit.getServer().getPlayer(username));

        if(target != null) {
            for(ItemStack itemStack : target.getInventory().getContents()) {
                if(itemStack != null) {
                    Item droppedItem = target.getWorld().dropItemNaturally(target.getLocation(), itemStack);
                    target.getInventory().removeItem(itemStack);
                    droppedItem.setPickupDelay(900000000);
                }
            }
            target.getInventory().setHelmet(null);
            target.getInventory().setChestplate(null);
            target.getInventory().setLeggings(null);
            target.getInventory().setBoots(null);
            target.getInventory().setItemInOffHand(null);
        }
    }

    public String getName() {
        return "Permanent Armor Trip";
    }
}
