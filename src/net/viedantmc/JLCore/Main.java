package net.viedantmc.JLCore;

import org.bukkit.plugin.java.JavaPlugin;

import net.viedantmc.JLCore.events.Fireworks;
import net.viedantmc.JLCore.files.DataManager;

public class Main extends JavaPlugin {
	private DataManager data;
	private Main plugin;
//what the fuck
	@Override
	public void onEnable(){
		 plugin = this;
		 this.data = new DataManager(this);
	     getServer().getPluginManager().registerEvents(new Fireworks(), this);

	}
	
	@Override
	public void onDisable(){}
	
	

}
