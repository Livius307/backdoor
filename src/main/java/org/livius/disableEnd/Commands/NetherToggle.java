package org.livius.disableEnd.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.livius.disableEnd.DisableEnd;

public class NetherToggle implements CommandExecutor {
    private final DisableEnd plugin;

    public NetherToggle(DisableEnd plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            boolean netherEnabled = plugin.getConfig().getBoolean("nether-enabled");
            if (netherEnabled) {
                netherEnabled = false;
                p.sendMessage("Nether is now disabled");
            } else {
                netherEnabled = true;
                p.sendMessage("Nether is now enabled");
            }
            plugin.getConfig().set("nether-enabled", netherEnabled);
            plugin.saveConfig();
            plugin.reloadConfig();
        }
        return true;
    }
}