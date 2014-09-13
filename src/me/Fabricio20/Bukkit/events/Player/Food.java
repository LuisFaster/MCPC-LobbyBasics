package me.Fabricio20.Bukkit.events.Player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class Food implements Listener {
	
	@EventHandler
	public void Foodd(FoodLevelChangeEvent e) {
		if(e.getFoodLevel() < 20) {
			e.setFoodLevel(20);
		}
	}
	
}
