package utils;

import org.bukkit.ChatColor;

public class ColorHelper {
    public static String translate(String uncolorized) {
        return ChatColor.translateAlternateColorCodes('&', uncolorized);
    }
}
