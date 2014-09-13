package me.Fabricio20.Bukkit.events.Player;


import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class InventoryClick implements Listener {
	

	public void sendToServer(Player player, String targetServer) {
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);
		try {
			out.writeUTF("Connect");
			out.writeUTF(targetServer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
	}
	
	private final JavaPlugin plugin;

	public InventoryClick(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void Clickd(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if(e.getWhoClicked().getGameMode() != GameMode.CREATIVE) {
			e.setCancelled(true);
			if(e.getInventory().getName().equals("§9Server Selector")) {
				if(e.getCurrentItem() != null) {
					if(e.getCurrentItem().getType().equals(Material.BEACON)) {
						sendToServer(p, "Lobby");
					}
					if(e.getCurrentItem().getType().equals(Material.DIAMOND_SWORD)) {
						sendToServer(p, "CTF-Lobby");
					}
				}
			}
		}
	}
	
}
