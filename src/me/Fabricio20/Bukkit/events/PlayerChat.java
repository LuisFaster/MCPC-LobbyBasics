package me.Fabricio20.Bukkit.events;

import me.Fabricio20.Bukkit.Main;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
	
	static Main plugin;
	 
    public PlayerChat(Main instance) {
        plugin = instance;
    }
	
    Boolean PartialNames = false;
    int PartialNamesMin = 3;
    
	@EventHandler(priority = EventPriority.HIGHEST)
	public void Chatd(final AsyncPlayerChatEvent event) {
		Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
            public void run() {
                for (final String word : event.getMessage().split(" ")) {
                    if (PartialNames == true && (Bukkit.getPlayer(word) != null) && word.length() >= PartialNamesMin && (event.getRecipients().contains("@" + Bukkit.getPlayer(word)))) {
                        ping(Bukkit.getPlayer(word));
                    } else {
                        for (Player player : event.getRecipients()) {
                            if (word.toLowerCase().contains("@" + player.getName().toLowerCase())) {
                                ping(player);
                            }
                        }
                    }
                }
            }
        }, 5L);
    }

    public void ping(Player player) {
        player.playSound(player.getLocation(), Sound.ORB_PICKUP, 60, 150);
    }
	
}
