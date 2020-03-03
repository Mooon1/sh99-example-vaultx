package de.sh99.custom_permission.manager;

import com.sun.istack.internal.NotNull;
import de.sh99.vaultx.manager.PermissionManager;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.sql.Connection;
import java.util.List;
import java.util.UUID;

public class ExamplePermissionManager implements PermissionManager
{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean setEnabled() {
        return false;
    }

    @Override
    public boolean isSuperPermsCompatible() {
        return false;
    }

    @Override
    public boolean has(CommandSender commandSender, String s) {
        return false;
    }

    @Override
    public boolean add(OfflinePlayer offlinePlayer, String s, World world) {
        return false;
    }

    @Override
    public boolean add(Player player, String s, World world) {
        return false;
    }

    @Override
    public boolean remove(OfflinePlayer offlinePlayer, String s, World world) {
        return false;
    }

    @Override
    public boolean remove(Player player, String s, World world) {
        return false;
    }

    @Override
    public boolean addTransient(Player player, String s, World world) {
        return false;
    }

    @Override
    public boolean addTransient(OfflinePlayer offlinePlayer, String s, World world) {
        return false;
    }

    @Override
    public boolean removeTransient(Player player, String s, World world) {
        return false;
    }

    @Override
    public boolean removeTransient(OfflinePlayer offlinePlayer, String s, World world) {
        return false;
    }

    @Override
    public boolean groupHas(String s, String s1, World world) {
        return false;
    }

    @Override
    public boolean groupRemove(String s, String s1, World world) {
        return false;
    }

    @Override
    public boolean isMember(String s, Player player, World world) {
        return false;
    }

    @Override
    public boolean isMember(String s, OfflinePlayer offlinePlayer, World world) {
        return false;
    }

    @Override
    public boolean addMember(String s, Player player, World world) {
        return false;
    }

    @Override
    public boolean addMember(String s, OfflinePlayer offlinePlayer, World world) {
        return false;
    }

    @Override
    public boolean removeMember(String s, Player player, World world) {
        return false;
    }

    @Override
    public boolean removeMember(String s, OfflinePlayer offlinePlayer, World world) {
        return false;
    }

    @Override
    public List<String> getGroupsByPlayer(Player player, World world) {
        return null;
    }

    @Override
    public List<String> getGroupsByPlayer(OfflinePlayer offlinePlayer, World world) {
        return null;
    }

    @Override
    public String getPrimaryGroup(Player player, World world) {
        return null;
    }

    @Override
    public String getPrimaryGroup(OfflinePlayer offlinePlayer, World world) {
        return null;
    }

    @Override
    public List<String> getGroups() {
        return null;
    }

    @Override
    public boolean hasGroupSupport() {
        return false;
    }
}
