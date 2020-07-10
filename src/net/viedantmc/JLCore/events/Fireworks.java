package net.viedantmc.JLCore.events;

import java.awt.Color;

import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import net.viedantmc.JLCore.Main;
import net.viedantmc.JLCore.files.DataManager;


public class Fireworks implements Listener {
	
	public DataManager data;
	
	public static void spawnFireworks(Location location, int amount){
        Location loc = location;
        Firework fw = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();
       
        fwm.setPower(2);
        fwm.addEffect(FireworkEffect.builder().withColor((Iterable<?>) Color.MAGENTA).build());
       
        fw.setFireworkMeta(fwm);
        fw.detonate();
       
        Firework fw2 = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        fw2.setFireworkMeta(fwm);
	}
	
	public void onJoin(PlayerJoinEvent e) {
		//this.data = new DataManager(this);
		//spawnFireworks(this.data.getConfig().getLocation("fireworkslocation1") , 1);
	}
}
