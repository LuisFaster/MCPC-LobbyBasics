package me.Fabricio20.Bukkit.runnables;

import me.BukkitPVP.PointsAPI.PointsAPI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Update extends BukkitRunnable {

	@Override
	public void run() {
		for(Player player : Bukkit.getOnlinePlayers()) {
			UpdatePoints(player);
		}
	}

	private void UpdatePoints(Player player) {
		PointsAPI points = (PointsAPI) Bukkit.getPluginManager().getPlugin("PointsAPI");
		int i = points.getPoints(player);
		if(i == 0) {
			player.setLevel(0);
		} else if(i >= 1 && i < 5) {
			player.setLevel(1);
		} else if (i >= 5 && i < 10) {
			player.setLevel(2);
		} else if (i >= 10 && i < 20) {
			player.setLevel(3);
		} else if (i >= 20 && i < 40) {
			player.setLevel(4);
		} else if (i >= 40 && i < 80) {
			player.setLevel(5);
		} else if (i >= 80 && i < 160) {
			player.setLevel(6);
		} else if (i == 999) {
			player.setLevel(999);
		}
	}

}
