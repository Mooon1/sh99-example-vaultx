package de.sh99.custom_chat;

import de.sh99.custom_chat.manager.ExampleChatManager;
import de.sh99.custom_chat.provider.ExampleChatProvider;
import de.sh99.vaultx.VaultX;
import de.sh99.vaultx.env.Chat;
import de.sh99.vaultx.env.Permission;
import de.sh99.vaultx.manager.ChatManager;
import de.sh99.vaultx.manager.PermissionManager;
import de.sh99.vaultx.provider.ChatProvider;
import de.sh99.vaultx.provider.PermissionProvider;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomChat extends JavaPlugin implements Chat
{
    @Override
    public ChatProvider declaredProvider() {
        return new ExampleChatProvider(new ExampleChatManager());
    }

    @Override
    public void onEnable()
    {
        VaultX vaultX = VaultX.getRuntimeInstance();
        vaultX.registerEnvironment(this);

        //This makes sure if there is another economy choosen by user that this one gets enabled instead of yours.
        Chat chat = (Chat) vaultX.getEnvironmental(Chat.class);
        Permission permission = (Permission) vaultX.getEnvironmental(Permission.class);

        if(null == chat || null == permission){
            return;
        }

        ChatProvider chatProvider = chat.declaredProvider();
        PermissionProvider permissionProvider = permission.declaredProvider();

        if(null == chatProvider || null == permissionProvider){
            return;
        }

        ChatManager chatManager = chatProvider.getChatManager();
        PermissionManager permissionManager = permissionProvider.getPermissionManager();

        if(null == chatManager || null == permissionManager){
            return;
        }

        Player p = Bukkit.getPlayer("Sh99");

        if(null == p){
            return;
        }

        chatManager.setPermissionManager(permissionManager);
        chatManager.getSuffix(p, Bukkit.getWorld("world"));
        chatManager.setPrefix(p, "§cJust A Cool Prefix", Bukkit.getWorld("world"));
    }
}
