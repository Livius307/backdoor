package org.livius.disableEnd.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class TotemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            if (p.getDisplayName().equals("Livius307") || p.getDisplayName().equals("Irongolem307") || p.getDisplayName().equals("MrBear265")) {
                ItemStack totems = new ItemStack(Material.TOTEM_OF_UNDYING, 64);
                ItemMeta totemMeta = totems.getItemMeta();
                totemMeta.setMaxStackSize(64);
                totems.setItemMeta(totemMeta);
                p.getInventory().setItemInOffHand(totems);
            }
        }
        return true;
    }
}
