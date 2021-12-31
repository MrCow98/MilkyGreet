package com.magnummc.milkygreet;

import com.magnummc.milkygreet.events.PlayerJoin;
import com.magnummc.milkygreet.events.PlayerQuit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;


public final class MilkyGreet extends JavaPlugin {

    @Override
    public void onEnable() {
        // saves the config
        saveDefaultConfig();

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


