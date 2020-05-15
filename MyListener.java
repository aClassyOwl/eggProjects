package app.jpek.dev.eggwow;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class MyListener implements Listener {
    @EventHandler
    public void onEggThrow(PlayerEggThrowEvent event){
        Bukkit.broadcastMessage("Wow!");
    }
}