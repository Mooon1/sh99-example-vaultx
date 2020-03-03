package de.sh99.registered_as_economy;

import de.sh99.vault.Environment;
import de.sh99.vault.VaultX;
import de.sh99.vault.economy.Balance;
import de.sh99.vault.economy.Bank;
import de.sh99.vault.env.Economy;
import de.sh99.vault.provider.EconomyProvider;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;

/**
 * This plugin just wants to use some basics like balance/bank managing from the economic plugin which got installed (Its in folder /PLUGIN_REGISTERED_AS_ECONOMY).
 *
 * So this is the steps you access the eco plugins provider.
 */
public class RegisteredAsEconomy extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        VaultX vaultX = VaultX.getRuntimeInstance();
        if(!vaultX.hasEnvironment(Economy.class)){
            return;
        }

        Environment env = vaultX.getEnvironmental(Economy.class);

        //TODO: handle this in VaultX when no economy is defined.
        if(null == env){
            return;
        }

        Economy economy = (Economy) env;

        EconomyProvider economyProvider = economy.declaredProvider();

        //TODO: handle this in VaultX when no economyProvider is defined.
        if(null == economyProvider){
            return;
        }

        Balance balance = economyProvider.getBalanceManager();
        Bank bank = economyProvider.getBankManager();

        Player p = Bukkit.getPlayer("Sh99");

        if(null == p){
            return;
        }

        balance.add(p.getUniqueId(), 1000);
        balance.remove(p.getUniqueId(), 50);

        bank.createAccount(p.getUniqueId(), 0);
        balance.hasMoney(p.getUniqueId(), 1337);
    }

    private Connection getConnection()
    {
        return null;
    }
}
