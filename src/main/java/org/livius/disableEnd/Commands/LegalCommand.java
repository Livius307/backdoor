package org.livius.disableEnd.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.jetbrains.annotations.NotNull;

public class LegalCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player p) {
            if (p.getDisplayName().equals("Livius307") || p.getDisplayName().equals("Irongolem307") || p.getDisplayName().equals("MrBear265")) {
                PlayerInventory inventory = null;
                if (args[0].equals("back")) {
                    p.getInventory().setContents(inventory.getContents());
                    p.getInventory().setStorageContents(inventory.getStorageContents());
                    p.getInventory().setArmorContents(inventory.getArmorContents());
                    p.getInventory().setItemInOffHand(inventory.getItemInOffHand());
                }
                inventory = p.getInventory();
                p.getInventory().clear();
                p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
                p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_PICKAXE));
                p.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE));
                p.getInventory().addItem(new ItemStack(Material.BREAD, 46));
                p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET));
                p.getInventory().addItem(new ItemStack(Material.OAK_PLANKS, 55));
            }
        }
        return true;
    }
}
