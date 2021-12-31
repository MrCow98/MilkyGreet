package com.magnummc.milkygreet.events;

import com.magnummc.milkygreet.MilkyGreet;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    private final MilkyGreet plugin;
    public PlayerJoin(MilkyGreet plugin) {
        this.plugin = plugin;
        System.out.println("Created PlayerJoin instance!");

    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        String message = plugin.getConfig().getString("join-message").replace("%player%", player.getName());
        player.sendMessage(message);

        e.setJoinMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "+" + ChatColor.GRAY + "] " + ChatColor.GOLD + ChatColor.BOLD + player.getDisplayName());

    }

}
