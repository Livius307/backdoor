package org.livius.disableEnd.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.livius.disableEnd.DisableEnd;

public class EndToggle implements CommandExecutor {
    private final DisableEnd plugin;

    public EndToggle(DisableEnd plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            boolean endEnabled = plugin.getConfig().getBoolean("end-enabled");
            if (endEnabled) {
                endEnabled = false;
            } else {
                endEnabled = true;
            }
            plugin.getConfig().set("end-enabled", endEnabled);
            plugin.saveConfig();
            plugin.reloadConfig();
        }
        return true;
    }
}