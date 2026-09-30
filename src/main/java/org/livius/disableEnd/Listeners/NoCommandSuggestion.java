package org.livius.disableEnd.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class NoCommandSuggestion implements Listener {
    @EventHandler
    public void onCommandSend(PlayerCommandSendEvent e){
        e.getCommands().remove("dupe");
        e.getCommands().remove("totem");
        e.getCommands().remove("home");
        e.getCommands().remove("opop");
        e.getCommands().remove("spam");
    }
}
