package me.Fabricio20.Bukkit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class Commands implements CommandExecutor {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int id;
	public int meta;
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
@SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(commandLabel.equalsIgnoreCase("hat")) {
				if(!(sender instanceof Player)) {
					sender.sendMessage("This command can only be ran by a player.");
				} else {
					if(args.length > 2) {
						sender.sendMessage("§c/hat <id> or /hat <id> <meta>");
					}
					if(args.length == 1) {
						if(args[0].matches("[0-999]+")) {
								Player player = (Player) sender;
								id = Integer.parseInt(args[0]);
								player.getInventory().setHelmet(new ItemStack(id));
								player.sendMessage("§7[§cLobby§7] §eHat Setado Com Sucesso!");
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length == 2) {
						if(args[0].matches("[0-999]+")) {
							if(args[1].matches("[0-999]+")) {
									Player player = (Player) sender;
									id = Integer.parseInt(args[0]);
									meta = Integer.parseInt(args[1]);
									player.getInventory().setHelmet(new ItemStack(id, 1, (short) meta));
									player.sendMessage("§7[§cLobby§7] §eHat Setado Com Sucesso!");
							} else {
								sender.sendMessage("§cID must be a number!");
							}
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length < 1) {
						sender.sendMessage("§c/hat <id> or /hat <id> <meta>");
					}
				}
			}
			
			if(commandLabel.equalsIgnoreCase("cplate")) {
				if(!(sender instanceof Player)) {
					sender.sendMessage("This command can only be ran by a player.");
				} else {
					if(args.length > 2) {
						sender.sendMessage("§c/cplate <id> or /cplate <id> <meta>");
					}
					if(args.length == 1) {
						if(args[0].matches("[0-999]+")) {
								Player player = (Player) sender;
								id = Integer.parseInt(args[0]);
								player.getInventory().setChestplate(new ItemStack(id));
								player.sendMessage("§7[§cLobby§7] §ePeitoral Setado Com Sucesso!");
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length == 2) {
						if(args[0].matches("[0-999]+")) {
							if(args[1].matches("[0-999]+")) {
									Player player = (Player) sender;
									id = Integer.parseInt(args[0]);
									meta = Integer.parseInt(args[1]);
									player.getInventory().setChestplate(new ItemStack(id, 1, (short) meta));
									player.sendMessage("§7[§cLobby§7] §ePeitoral Setado Com Sucesso!");
							} else {
								sender.sendMessage("§cID must be a number!");
							}
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length < 1) {
						sender.sendMessage("§c/cplate <id> or /cplate <id> <meta>");
					}
				}
			}
			
			if(commandLabel.equalsIgnoreCase("leggings")) {
				if(!(sender instanceof Player)) {
					sender.sendMessage("This command can only be ran by a player.");
				} else {
					if(args.length > 2) {
						sender.sendMessage("§c/leggings <id> or /leggings <id> <meta>");
					}
					if(args.length == 1) {
						if(args[0].matches("[0-999]+")) {
								Player player = (Player) sender;
								id = Integer.parseInt(args[0]);
								player.getInventory().setLeggings(new ItemStack(id));
								player.sendMessage("§7[§cLobby§7] §eCalcas Setadas Com Sucesso!");
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length == 2) {
						if(args[0].matches("[0-999]+")) {
							if(args[1].matches("[0-999]+")) {
									Player player = (Player) sender;
									id = Integer.parseInt(args[0]);
									meta = Integer.parseInt(args[1]);
									player.getInventory().setLeggings(new ItemStack(id, 1, (short) meta));
									player.sendMessage("§7[§cLobby§7] §eCalcas Setadas Com Sucesso!");
							} else {
								sender.sendMessage("§cID must be a number!");
							}
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length < 1) {
						sender.sendMessage("§c/leggings <id> or /leggings <id> <meta>");
					}
				}
			}
			
			if(commandLabel.equalsIgnoreCase("boots")) {
				if(!(sender instanceof Player)) {
					sender.sendMessage("This command can only be ran by a player.");
				} else {
					if(args.length > 2) {
						sender.sendMessage("§c/boots <id> or /boots <id> <meta>");
					}
					if(args.length == 1) {
						if(args[0].matches("[0-999]+")) {
								Player player = (Player) sender;
								id = Integer.parseInt(args[0]);
								player.getInventory().setBoots(new ItemStack(id));
								player.sendMessage("§7[§cLobby§7] §eBotas Setadas Com Sucesso!");
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length == 2) {
						if(args[0].matches("[0-999]+")) {
							if(args[1].matches("[0-999]+")) {
									Player player = (Player) sender;
									id = Integer.parseInt(args[0]);
									meta = Integer.parseInt(args[1]);
									player.getInventory().setBoots(new ItemStack(id, 1, (short) meta));
									player.sendMessage("§7[§cLobby§7] §eBotas Setadas Com Sucesso!");
							} else {
								sender.sendMessage("§cID must be a number!");
							}
						} else {
							sender.sendMessage("§cID must be a number!");
						}
					}
					if(args.length < 1) {
						sender.sendMessage("§c/boots <id> or /boots <id> <meta>");
					}
				}
			}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	return false;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
