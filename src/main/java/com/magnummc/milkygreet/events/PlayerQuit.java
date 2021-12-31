package com.magnummc.milkygreet.events;

import com.magnummc.milkygreet.MilkyGreet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import utils.ColorHelper;

public class PlayerQuit implements Listener {
    private final MilkyGreet plugin;
    public PlayerQuit(MilkyGreet plugin) {
        this.plugin = plugin;
    }



    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e){
        Player player = e.getPlayer();
        String message = plugin.getConfig().getString("quit-message");


        if (message == null) {
            return;
        }
        message = message.replace("%player%", player.getName());
        e.setQuitMessage(ColorHelper.translate(message));

    }



}
