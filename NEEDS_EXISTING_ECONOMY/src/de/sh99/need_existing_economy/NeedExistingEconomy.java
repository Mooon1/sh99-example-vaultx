package de.sh99.need_existing_economy;

import de.sh99.vaultx.Environment;
import de.sh99.vaultx.VaultX;

import de.sh99.vaultx.economy.BalanceManager;
import de.sh99.vaultx.economy.BankManager;
import de.sh99.vaultx.env.Economy;
import de.sh99.vaultx.provider.EconomyProvider;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;

/**
 * This plugin just wants to use some basics like balance/bank managing from the economic plugin which got installed (Its in folder /PLUGIN_REGISTERED_AS_ECONOMY).
 *
 * So this is the steps you access the eco plugins provider.
 */
public class NeedExistingEconomy extends JavaPlugin
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

        EconomyProvider economyProvider = ((Economy) env).declaredProvider();

        //TODO: handle this in VaultX when no economyProvider is defined.
        if(null == economyProvider){
            return;
        }

        BalanceManager balance = economyProvider.getBalanceManager();
        BankManager bank = economyProvider.getBankManager();

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
