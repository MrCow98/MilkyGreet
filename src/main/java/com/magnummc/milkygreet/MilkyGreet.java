package com.magnummc.milkygreet;

import events.PlayerJoin;
import events.PlayerQuit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MilkyGreet extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("MilkyGreet has been enabled.");

        getServer().getPluginManager().registerEvents(new PlayerJoin(),this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(), this);

    }


    @Override
    public void onDisable() {
        System.out.println("MilkyGreet has been disabled.");

    }
}
