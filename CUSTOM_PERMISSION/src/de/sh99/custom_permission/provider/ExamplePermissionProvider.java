package de.sh99.custom_permission.provider;

import com.sun.istack.internal.NotNull;
import de.sh99.vaultx.manager.PermissionManager;
import de.sh99.vaultx.provider.PermissionProvider;

public class ExamplePermissionProvider implements PermissionProvider
{
    private PermissionManager permissionManager;

    public ExamplePermissionProvider(@NotNull PermissionManager permissionManager)
    {
        this.permissionManager = permissionManager;
    }

    @Override
    public PermissionManager getPermissionManager() {
        return this.permissionManager;
    }
}
