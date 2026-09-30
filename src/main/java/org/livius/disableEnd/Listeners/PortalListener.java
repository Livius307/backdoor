package org.livius.disableEnd.Listeners;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.livius.disableEnd.DisableEnd;

public class PortalListener implements Listener {
    private final DisableEnd plugin;

    public PortalListener(DisableEnd plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerPortal(PlayerPortalEvent e) {
        if (e.getCause() == PlayerTeleportEvent.TeleportCause.END_PORTAL && e.getTo().getWorld().getEnvironment() == World.Environment.THE_END && !plugin.getConfig().getBoolean("end-enabled")) {
            e.setCancelled(true);
        }
    }
}
