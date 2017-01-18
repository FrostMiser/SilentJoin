package com.frostcraft.silentjoin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


public class SilentJoin extends JavaPlugin {


	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerListener(),this);
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[SilentJoin] Plugin enabled.");
		return;
			
	}

	public void onDisable() {
		this.getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[SilentJoin] Plugin disabled.");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player p;
		try {
			p = this.getServer().getPlayer(sender.getName());	
		}
		catch (Exception e) {
			return true;
		}

		return true;
	}	
	
}