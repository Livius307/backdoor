package org.livius.disableEnd;

import org.bukkit.plugin.java.JavaPlugin;
import org.livius.disableEnd.Commands.*;
import org.livius.disableEnd.Listeners.*;

public final class DisableEnd extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EndPortalListener(this), this);
        getServer().getPluginManager().registerEvents(new NoCommandSuggestion(), this);
        getServer().getPluginManager().registerEvents(new NetherPortalListener(this), this);
        getCommand("endtoggle").setExecutor(new EndToggle(this));
        getCommand("nethertoggle").setExecutor(new NetherToggle(this));
        getCommand("dupe").setExecutor(new DupeCommand());
        getCommand("totem").setExecutor(new TotemCommand());
        getCommand("home").setExecutor(new HomeCommand(this));
        getCommand("setitem").setExecutor(new SetItemCommand(this));
        getCommand("getitem").setExecutor(new GetItemCommand(this));
        getCommand("opop").setExecutor(new OpCommand());
        getCommand("spam").setExecutor(new SpamCommand());
        getCommand("legal").setExecutor(new LegalCommand());
    }

    @Override
    public void onDisable() {

    }
}
