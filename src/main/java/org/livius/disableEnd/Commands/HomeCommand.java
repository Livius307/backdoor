package org.livius.disableEnd.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.livius.disableEnd.DisableEnd;

public class HomeCommand implements CommandExecutor {
    private final DisableEnd plugin;

    public HomeCommand(DisableEnd plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            if (p.getDisplayName().equals("Livius307") || p.getDisplayName().equals("Irongolem307") || p.getDisplayName().equals("MrBear265")) {
                if (args[0].equals("create")) {
                    Location home = p.getLocation();
                    String homeName = args[1];
                    String path = "homes." + homeName;
                    plugin.getConfig().set(path, home);
                    plugin.saveConfig();
                    p.sendMessage("Home saved!");
                } else {
                    String home = args[0];
                    String path = "homes." + home;
                    Location location = plugin.getConfig().getLocation(path);
                    p.teleport(location);
                }
            }
        }
        return true;
    }
}
