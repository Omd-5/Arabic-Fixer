package mas.minecraft.foxs.arabicFixer;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatHandler(), this);

    }

    @Override
    public void onDisable() {

    }
}

