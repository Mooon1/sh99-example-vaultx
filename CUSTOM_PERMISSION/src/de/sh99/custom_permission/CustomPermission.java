package de.sh99.custom_permission;

import de.sh99.custom_permission.manager.ExamplePermissionManager;
import de.sh99.custom_permission.provider.ExamplePermissionProvider;
import de.sh99.vaultx.VaultX;
import de.sh99.vaultx.env.Permission;
import de.sh99.vaultx.manager.PermissionManager;
import de.sh99.vaultx.provider.PermissionProvider;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomPermission extends JavaPlugin implements Permission
{
    @Override
    public PermissionProvider declaredProvider() {
        return new ExamplePermissionProvider(new ExamplePermissionManager());
    }

    @Override
    public void onEnable()
    {
        VaultX vaultX = VaultX.getRuntimeInstance();
        vaultX.registerEnvironment(this);

        Permission permission = (Permission) vaultX.getEnvironmental(Permission.class);

        PermissionProvider permissionProvider = permission.declaredProvider();

        if(null == permissionProvider){
            return;
        }

        PermissionManager permissionManager = permissionProvider.getPermissionManager();

        if(null == permissionManager){
            return;
        }

        Player p = Bukkit.getPlayer("Sh99");

        if(null == p){
            return;
        }

        permissionManager.getGroups();
        permissionManager.add(p, "custom_permission.test", null);
        //... you can access all other methods also here just a quick example
    }
}
