package app.jpek.dev.eggwow;

import org.bukkit.plugin.java.JavaPlugin;

public final class EggWow extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("EggWow Online");
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
}