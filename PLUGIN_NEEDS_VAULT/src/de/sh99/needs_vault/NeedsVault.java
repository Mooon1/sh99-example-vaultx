package de.sh99.needs_vault;

import de.sh99.needs_vault.manager.BalanceManager;
import de.sh99.needs_vault.manager.BankManager;
import de.sh99.needs_vault.provider.ExampleVaultXProvider;
import de.sh99.vault.VaultX;
import de.sh99.vault.env.Economy;
import de.sh99.vault.provider.EconomyProvider;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;

/**
 * Instead of implementing the classes which should be used as economic, chat or permission plugin
 * VaultX creates a local-user firewall where you can enable/disable each provider you want. (A provider is for example iConomy
 * or Essentials).
 */
public class NeedsVault extends JavaPlugin implements Economy
{
    @Override
    public EconomyProvider declaredProvider() {
        return new ExampleVaultXProvider(new BalanceManager(this.getConfig()), new BankManager(this.getConnection()));
    }

    @Override
    public void onEnable()
    {
        VaultX vaultX = VaultX.getRuntimeInstance();
        vaultX.registerEnvironment(this);
    }

    private Connection getConnection()
    {
        return null;
    }
}
