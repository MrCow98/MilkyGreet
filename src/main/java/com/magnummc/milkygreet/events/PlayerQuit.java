package com.magnummc.milkygreet.events;

import com.magnummc.milkygreet.MilkyGreet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    private final MilkyGreet plugin;
    public PlayerQuit(MilkyGreet plugin) {
        this.plugin = plugin;
    }



    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();
        String message = plugin.getConfig().getString("join-message").replace("%player%", player.getName());
        player.sendMessage(message);

    }



}
