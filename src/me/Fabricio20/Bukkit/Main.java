package me.Fabricio20.Bukkit;

import me.Fabricio20.Bukkit.events.PlayerChat;
import me.Fabricio20.Bukkit.events.Blocks.BlockBreak;
import me.Fabricio20.Bukkit.events.Blocks.BlockPlace;
import me.Fabricio20.Bukkit.events.Blocks.Sign;
import me.Fabricio20.Bukkit.events.Item.ItemDrop;
import me.Fabricio20.Bukkit.events.Player.Damage;
import me.Fabricio20.Bukkit.events.Player.Food;
import me.Fabricio20.Bukkit.events.Player.Interact;
import me.Fabricio20.Bukkit.events.Player.InventoryClick;
import me.Fabricio20.Bukkit.events.Player.Join;
import me.Fabricio20.Bukkit.events.Player.Jump;
import me.Fabricio20.Bukkit.events.Player.Walk;
import me.Fabricio20.Bukkit.runnables.Update;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class Main extends JavaPlugin implements Listener {
	
	public static Main plugin;
	
	public static Plugin getPlugin() {
		return plugin;
	}
	
	@SuppressWarnings("unused")
	@Override
	public void onEnable() {
		plugin = this;
		getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		BukkitTask Update = new Update().runTaskTimer(this, 4, 4);
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new Walk(), this);
		getServer().getPluginManager().registerEvents(new Damage(), this);
		getServer().getPluginManager().registerEvents(new Jump(), this);
		getServer().getPluginManager().registerEvents(new Food(), this);
		getServer().getPluginManager().registerEvents(new Join(), this);
		getServer().getPluginManager().registerEvents(new Sign(), this);
		getServer().getPluginManager().registerEvents(new BlockBreak(), this);
		getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
		getServer().getPluginManager().registerEvents(new ItemDrop(), this);
		getServer().getPluginManager().registerEvents(new Interact(), this);
		getServer().getPluginManager().registerEvents(new PlayerChat(this), this);
		getServer().getPluginManager().registerEvents(new BlockPlace(), this);
		getCommand("hat").setExecutor(new Commands());
		getCommand("cplate").setExecutor(new Commands());
		getCommand("leggings").setExecutor(new Commands());
		getCommand("boots").setExecutor(new Commands());
		System.out.println("[LobbyBasics] Enabled!");
	}	
	
	@Override
	public void onDisable() {
		plugin = null;
		System.out.println("[LobbyBasics] Goodbye!");
	}
	
}
