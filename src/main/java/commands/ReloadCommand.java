package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender player, Command milkygreet, String MilkyGreet, String[] args) {
        if (args[0].equals("reload")) {
        }
        return false;
    }

}