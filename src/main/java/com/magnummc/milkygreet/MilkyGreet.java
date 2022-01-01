package com.magnummc.milkygreet;

import com.magnummc.milkygreet.events.PlayerJoin;
import com.magnummc.milkygreet.events.PlayerQuit;
import commands.ReloadCommand;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;


public final class MilkyGreet extends JavaPlugin {

    public static void lg(String s) {
    }

    @Override
    public void onEnable() {
        // saves the config
        this.saveDefaultConfig();
        this.getConfig();
        reloadConfig();
        PluginCommand command = this.getCommand("milkygreet");
        if (command != null) {
            command.setExecutor(this);
        }



        //
        System.out.println(getConfig().getString("startup-message"));

        getServer().getPluginManager().registerEvents(new PlayerJoin(this),this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(this), this);

    }

    @Override
    public void onDisable() {
        System.out.println(getConfig().getString("stop-message"));

    }




}


