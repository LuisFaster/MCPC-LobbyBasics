package me.Fabricio20.Bukkit.events.Player;

import java.util.ArrayList;
import java.util.List;

import me.BukkitPVP.PointsAPI.PointsAPI;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class Join implements Listener {

	List<String> CLore = new ArrayList<String>();
	List<String> ClockLore = new ArrayList<String>();
	
	PointsAPI points = (PointsAPI) Bukkit.getPluginManager().getPlugin("PointsAPI");
	
	@EventHandler
	public void Joind(PlayerJoinEvent e) {
		
		int i = points.getPoints(e.getPlayer());
		
		if(i > 1 && i < 5) {
			e.getPlayer().setLevel(1);
		} else if(i > 5 && i < 10){
			e.getPlayer().setLevel(2);
		}
		
		e.setJoinMessage(null);
		e.getPlayer().teleport(e.getPlayer().getWorld().getSpawnLocation());
		e.getPlayer().setGameMode(GameMode.ADVENTURE);
		Player player = e.getPlayer();
		PlayerInventory pi = player.getInventory();
		pi.clear();
		/* Intitalized */
		
		/* Start of COMPASS ITEM */
		ItemStack compass = new ItemStack(Material.COMPASS);
		ItemMeta cmpass = compass.getItemMeta();
		CLore.clear();
		CLore.add("§8- §7Right Click §5Para abrir o menu de servidores.");
		cmpass.setLore(CLore);
		cmpass.setDisplayName("§9Server Selector");
		compass.setItemMeta(cmpass);
		pi.setItem(0, compass);
		/* End Of COMPASS ITEM */
		
		/* Start of CLOCK ITEM */
		ItemStack clock = new ItemStack(Material.WATCH);
		ItemMeta clck = compass.getItemMeta();
		ClockLore.clear();
		ClockLore.add("§8- §7Right Click §5Para ocultar/mostrar jogadores.");
		clck.setLore(ClockLore);
		clck.setDisplayName("§6Magic Clock");
		clock.setItemMeta(clck);
		pi.setItem(1, clock);
		/* End Of CLOCK ITEM */
	}
	
}
