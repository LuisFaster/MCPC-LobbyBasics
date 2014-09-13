package me.Fabricio20.Bukkit.methods;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ServerSelector {
	
	public static Inventory myInventory = Bukkit.createInventory(null, 9, "§9Server Selector");
	static List<String> LobbyLore = new ArrayList<String>();
	static List<String> CTFLobbyLore = new ArrayList<String>();
	
	static {
		/* Lobby Item */
		ItemStack Lobby = new ItemStack(Material.BEACON, 1);
		ItemMeta LobbyMeta = Lobby.getItemMeta();
		LobbyMeta.setDisplayName("§9Lobby");
		LobbyLore.clear();
		LobbyLore.add("§c- §5Volta ao §7Servidor Principal§5.");
		LobbyMeta.setLore(LobbyLore);
		Lobby.setItemMeta(LobbyMeta);
		myInventory.setItem(0, Lobby);
		//The first parameter, is the slot that is assigned to. Starts counting at 0
		/* CTF Lobby Item */
		ItemStack CTFLobby = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta CTFLobbyMeta = CTFLobby.getItemMeta();
		CTFLobbyMeta.setDisplayName("§eCTF Lobby");
		CTFLobbyLore.clear();
		CTFLobbyLore.add("§c- §5Entra No Servidor De §7Capture The Flag§5.");
		CTFLobbyMeta.setLore(CTFLobbyLore);
		CTFLobby.setItemMeta(CTFLobbyMeta);
		myInventory.setItem(1, CTFLobby);
		//The first parameter, is the slot that is assigned to. Starts counting at 1
	}	
}
