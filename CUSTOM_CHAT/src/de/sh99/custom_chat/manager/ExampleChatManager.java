package de.sh99.custom_chat.manager;

import de.sh99.vaultx.manager.ChatManager;
import de.sh99.vaultx.manager.PermissionManager;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class ExampleChatManager implements ChatManager
{
    private PermissionManager permissionManager;

    public ExampleChatManager(){
        this.permissionManager = null;
    }

    @Override
    public void setPermissionManager(PermissionManager permission) {
        this.permissionManager = permissionManager;
    }

    @Override
    public PermissionManager getPermissionManager() {
        return this.permissionManager;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void setEnabled() {

    }

    @Override
    public String getPrefix(Player player, World world) {
        return null;
    }

    @Override
    public String getPrefix(OfflinePlayer offlinePlayer, World world) {
        return null;
    }

    @Override
    public void setPrefix(Player player, String s, World world) {

    }

    @Override
    public void setPrefix(OfflinePlayer offlinePlayer, String s, World world) {

    }

    @Override
    public String getSuffix(Player player, World world) {
        return null;
    }

    @Override
    public String getSuffix(OfflinePlayer offlinePlayer, World world) {
        return null;
    }

    @Override
    public void setSuffix(Player player, String s, World world) {

    }

    @Override
    public void setSuffix(OfflinePlayer offlinePlayer, String s, World world) {

    }

    @Override
    public String getGroupPrefix(String s, String s1, World world) {
        return null;
    }

    @Override
    public void setGroupPrefix(String s, String s1, World world) {

    }

    @Override
    public String getGroupSuffix(String s, String s1, World world) {
        return null;
    }

    @Override
    public void setGroupSuffix(String s, String s1, World world) {

    }

    @Override
    public Object getPlayerInfoNode(Player player, String s, World world, Object o) {
        return null;
    }

    @Override
    public Object getPlayerInfoNode(OfflinePlayer offlinePlayer, String s, Object o, World world) {
        return null;
    }

    @Override
    public void setPlayerInfoNode(Player player, String s, Object o, World world) {

    }

    @Override
    public void setPlayerInfoNode(OfflinePlayer offlinePlayer, String s, Object o, World world) {

    }

    @Override
    public Object getGroupInfoNode(String s, String s1, World world, Object o) {
        return null;
    }

    @Override
    public void setGroupInfoNode(String s, String s1, Object o, World world) {

    }
}
