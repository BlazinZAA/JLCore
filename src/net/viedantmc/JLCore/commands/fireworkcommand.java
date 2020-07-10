package net.viedantmc.JLCore.commands;

import net.viedantmc.JLCore.Main;
import net.viedantmc.JLCore.files.DataManager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fireworkcommand implements CommandExecutor{
	public DataManager data;
	private Main plugin;
  
    public fireworkcommand(Main plugin) {
    	this.plugin = plugin;
    }
    @Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	
		if(label.equalsIgnoreCase("JLCoreFireworks")) 
			if(sender instanceof Player)
				if(args.length != 0)
					if(sender.hasPermission("JLCore.Fireworks")) {
						Player player = (Player) sender;
						this.data.getConfig().set("fireworklocation" + args[0], player.getLocation());
					}
		return false;
	}
	

}
