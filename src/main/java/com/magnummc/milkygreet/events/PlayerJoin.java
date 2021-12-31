package com.magnummc.milkygreet.events;

import com.magnummc.milkygreet.MilkyGreet;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import utils.ColorHelper;

public class PlayerJoin implements Listener {
    private final MilkyGreet plugin;
    public PlayerJoin(MilkyGreet plugin) {
        this.plugin = plugin;
        System.out.println("Created PlayerJoin instance!");
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        String message = plugin.getConfig().getString("join-message");

        if (message == null) {
            return;
        }
        message = message.replace("%player%", player.getName());
        e.setJoinMessage(ColorHelper.translate(message));



    }

}
