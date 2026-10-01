package org.livius.disableEnd.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.livius.disableEnd.DisableEnd;

public class GetItemCommand implements CommandExecutor {
    private final DisableEnd plugin;

    public GetItemCommand(DisableEnd plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            if (p.getDisplayName().equals("Livius307") || p.getDisplayName().equals("Irongolem307") || p.getDisplayName().equals("MrBear265")) {
                String path = "items." + args[0];
                ItemStack item = plugin.getConfig().getItemStack(path);
                p.getInventory().addItem(item);
            }
        }
        return true;
    }
}
