package Heathrxw.Xenon.ChaosMod;

import Heathrxw.Xenon.ChaosMod.events.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;

public class ChaosThread implements Runnable {
    private final String threadName;
    private final Chaos plugin;

    private Thread thread;

    private ArrayList<String> chaosPlayers = new ArrayList<String>();
    private Boolean spoilers = false;

    private ChaosEvent[] chaosEvent = {
            new Nuclear(),
            new Cobweb(),
            new CobwebTrap(),
            new VoidFall(),
            new CarpetBomb(),
            new Heaven(),
            new LevitateEvent(),
            new RandomBlocks1(),
            new RandomBlocks(),
            new Meat(),
            new HackXPEvent(),
            new HalfHeartEvent(),
            new CarpetBomb(),
            new FullHealEvent(),
            new FullHungerEvent(),
            new ObsidianTrap(),
            new BedrockTrap(),
            new ZeroHungerEvent(),
            new RavagerSpawnEvent(),
            new EnderdragonEvent(),
            new TheEnd(),
            new PermanentInventory(),
            new RedstoneEvent(),
            new SuperBreakerEvent(),
            new Wither(),
            new SoulGame(),
            new FireballEvent(),
            new GhastEvent(),
            new SpawnEggEvent(),
            new PermanentTrip(),
            new ToolsEvent(),
            new EndDimensionEvent(),
            new BedrockFeetEvent(),
            new Lumberjack(),
            new Grenade(),
            new Zeus(),
            new WoodEvent(),
            new BeefEvent(),
            new SkydiveEvent(),
            new ButterfingersEvent(),
            new TripEvent(),
            new SpeedEvent(),
            new JumpBoostEvent(),
            new FakeCreeperEvent(),
            new Apocalypse(),
            new DiamondPickaxeEvent(),
            new FloorDiveEvent(),
            new BlindnessEvent(),
            new MiningFatigueEvent(),
            new IronToolEvent(),
            new PrimedTNTEvent(),
            new LavaEvent(),
            new HasteEvent(),
            new IgniteEvent(),
            new GardenerEvent(),
            new IronEvent(),
            new GoldEvent(),
            new CreeperEvent(),
            new LightningEvent(),
            new MundaneEvent(),
            new AnvilEvent(),
            new OneHeart(),
            new ClearLagEvent(),
            new SkyLavaEvent(),
            new SlownessEvent(),
            new NoteblockFeetEvent(),
            new ZeroXpEvent(),
            new NiceXpEvent(),
            new TreeEvent(),
            new DiamondEvent(),
            new ZombieEvent(),
            new LavaTrailEvent(),
            new Nuclear2(),
            new CarpetBomb2(),
            new Apocalypse2(),
            new RandomLocation(),
            new RandomLocation1(),
            new RandomLocation2(),
            new RandomLocation3(),
            new RandomLocation4(),
    };
    private ChaosEvent currentChaosEvent;

    ChaosThread(String name, Chaos plugin) {
        this.threadName = name;
        this.plugin = plugin;
    }

    public void addPlayer(String username) {
        if(!chaosPlayers.contains(username)) {
            chaosPlayers.add(username);
        }
    }

    public void removePlayer(String username) {
        if(chaosPlayers.contains(username)) {
            chaosPlayers.remove(chaosPlayers.indexOf(username));
        }
    }

    public Boolean toggleSpoilers() {
        spoilers = !spoilers;
        return spoilers;
    }

    public void run() {
        // Starting pause.
        try {
            Thread.sleep(
                    ThreadLocalRandom.current().nextInt(plugin.minEventDuration, plugin.maxEventDuration + 1)
                            * 1000
            );
        }catch(InterruptedException e) {
            thread.interrupt();
        }

        // The loop.
        while(!thread.isInterrupted()) {
            try {
                currentChaosEvent = chaosEvent[new Random().nextInt(chaosEvent.length)];

                // Enable
                chaosPlayers.forEach((player) -> {
                    new BukkitRunnable() {
                        public void run() {
                            currentChaosEvent.onEnable(player, plugin);
                        }
                    }.runTask(plugin);
                });
                if(spoilers) {
                    Bukkit.broadcastMessage(ChatColor.BLUE + "Effect: " + currentChaosEvent.getName());
                }

                // Wait
                Thread.sleep(
                        ThreadLocalRandom.current().nextInt(
                                plugin.minEventDuration,
                                plugin.maxEventDuration + 1
                        )
                                * 1000
                );

                // Disable
                chaosPlayers.forEach((player) -> {
                    new BukkitRunnable() {
                        public void run() {
                            currentChaosEvent.onDisable(player, plugin);
                        }
                    }.runTask(plugin);
                });

                Thread.sleep(1000);
            }catch(InterruptedException e) {
                thread.interrupt();
            }
        }
    }

    public Boolean start() {
        if(thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
            return true;
        }
        return false;
    }

    public void stop() {
        if(thread != null) {
            thread.interrupt();
            thread = null;
        }
        chaosPlayers.forEach((player) -> {
            new BukkitRunnable() {
                public void run() {
                    currentChaosEvent.onDisable(player, plugin);
                }
            }.runTask(plugin);
        });
    }

    public ArrayList<String> getPlayers() {
        return chaosPlayers;
    }
}
