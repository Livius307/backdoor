package org.livius.disableEnd.Commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.livius.disableEnd.DisableEnd;

public class SetItemCommand implements CommandExecutor {
    private final DisableEnd plugin;

    public SetItemCommand(DisableEnd plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            if (p.getDisplayName().equals("Livius307") || p.getDisplayName().equals("Irongolem307") || p.getDisplayName().equals("MrBear265")) {
                ItemStack item = p.getInventory().getItemInMainHand();
                String itemName = args[0];
                String path = "items." + itemName;
                plugin.getConfig().set(path, item);
                plugin.saveConfig();
                p.sendMessage("Item saved!");
            }
        }
        return true;
    }
}
