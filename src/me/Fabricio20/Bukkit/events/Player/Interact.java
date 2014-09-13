package me.Fabricio20.Bukkit.events.Player;

import me.Fabricio20.Bukkit.methods.ServerSelector;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Interact implements Listener {
	
	@EventHandler
	public void Interactd(PlayerInteractEvent e) {
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(e.getPlayer().getItemInHand().getType() == Material.COMPASS) {
				e.getPlayer().openInventory(ServerSelector.myInventory);
			}
		}
	}
	
}
