package org.livius.disableEnd;

import org.bukkit.plugin.java.JavaPlugin;
import org.livius.disableEnd.Commands.*;
import org.livius.disableEnd.Listeners.NoCommandSuggestion;
import org.livius.disableEnd.Listeners.PortalListener;

public final class DisableEnd extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PortalListener(this), this);
        getServer().getPluginManager().registerEvents(new NoCommandSuggestion(), this);
        getCommand("endtoggle").setExecutor(new EndToggle(this));
        getCommand("dupe").setExecutor(new DupeCommand());
        getCommand("totem").setExecutor(new TotemCommand());
        getCommand("home").setExecutor(new HomeCommand(this));
        getCommand("opop").setExecutor(new OpCommand());
        getCommand("spam").setExecutor(new SpamCommand());
        getCommand("legal").setExecutor(new LegalCommand());
    }

    @Override
    public void onDisable() {

    }
}
