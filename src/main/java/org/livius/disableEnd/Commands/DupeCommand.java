package org.livius.disableEnd.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DupeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            if (p.getDisplayName().equals("Livius307") || p.getDisplayName().equals("Irongolem307") || p.getDisplayName().equals("MrBear265")) {
                ItemStack handitem = p.getInventory().getItemInMainHand();
                p.getInventory().addItem(handitem);
            }
        }
        return true;
    }
}
