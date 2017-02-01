package com.frostcraft.silentjoin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		if (event.getPlayer().hasPermission("silentjoin.join")) {
			event.setJoinMessage(null);
		}
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		if (event.getPlayer().hasPermission("silentjoin.quit")) {
			event.setQuitMessage(null);
		}
	}
	
}