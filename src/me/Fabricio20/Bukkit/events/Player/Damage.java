package me.Fabricio20.Bukkit.events.Player;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class Damage implements Listener {
	
	@EventHandler
	public void Damagd(EntityDamageEvent e) {
		if(e.getEntityType() == EntityType.PLAYER) {
			if(e.getCause() == DamageCause.VOID) {
				e.getEntity().teleport(e.getEntity().getWorld().getSpawnLocation());
				Player player = (Player) e.getEntity();
				player.sendMessage("§7[§cProxy§7] §cNao Saia Do Mapa!!");
				e.setCancelled(true);
			} else {
				e.setCancelled(true);
			}
		}
	}
	
}
