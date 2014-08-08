package co.kotc.tutorial;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class KotCTutorial extends JavaPlugin {
	public final static String pluginName = Bukkit.getServer().getPluginManager().getPlugin("KotCTutorial").getName();
	
	
	public void onEnable() {
		getLogger().info(pluginName + "is being enabled.");
    }
 
    public void onDisable() {
    	getLogger().info(pluginName + "is being disabled.");
    }
}
