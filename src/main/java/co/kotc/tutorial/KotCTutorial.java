package co.kotc.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public class KotCTutorial extends JavaPlugin {
	public String pluginName = "KotCTutorial";
	public String brand = "[KotC]";
	
	public void onEnable() {
		getLogger().info("is being enabled.");
    }
 
    public void onDisable() {
    	getLogger().info("is being disabled.");
    }
}
