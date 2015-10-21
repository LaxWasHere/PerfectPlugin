package net.poweredbyscience.perfectplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by John on 10/21/2015.
 */
public class PerfectPlugin extends JavaPlugin {

    public void onEnable() {
        Bukkit.getPluginManager().disablePlugin(this);
    }

    public void onDisable() {
        getLogger().log(Level.INFO, "The only winning move is not to play.");
    }

}
