package net.craftsupport.YabsPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;

public final class YabsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        String scriptPath = "./yabs.sh";

        // Use the Runtime class to execute the shell script
        try {
            Process process = Runtime.getRuntime().exec(scriptPath + " " + "-w output.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
