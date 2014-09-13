package me.Fabricio20.Bukkit.events.Player;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class Walk implements Listener {
	
	@EventHandler
	public void Walkd(PlayerMoveEvent e) {
		if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.REDSTONE_BLOCK)) {
			if(e.getPlayer().getGameMode() == GameMode.SURVIVAL || e.getPlayer().getGameMode() == GameMode.ADVENTURE) {
				e.getPlayer().setVelocity(e.getPlayer().getLocation().getDirection().multiply(3));
				e.getPlayer().setVelocity(new Vector(e.getPlayer().getVelocity().getX(), 1.0D, e.getPlayer().getVelocity().getZ()));
			}
		}
	}
	
}
