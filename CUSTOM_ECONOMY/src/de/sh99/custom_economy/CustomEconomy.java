package de.sh99.custom_economy;

import de.sh99.custom_economy.manager.ExampleBalanceManager;
import de.sh99.custom_economy.manager.ExampleBankManager;
import de.sh99.custom_economy.provider.ExampleEconomyProvider;
import de.sh99.vaultx.VaultX;
import de.sh99.vaultx.env.Economy;
import de.sh99.vaultx.manager.BalanceManager;
import de.sh99.vaultx.manager.BankManager;
import de.sh99.vaultx.provider.EconomyProvider;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;

/**
 * Instead of implementing the classes which should be used as economic, chat or permission plugin
 * VaultX creates a local-user firewall where you can enable/disable each provider you want. (A provider is for example iConomy
 * or Essentials).
 */
public class CustomEconomy extends JavaPlugin implements Economy
{
    @Override
    public EconomyProvider declaredProvider() {
        return new ExampleEconomyProvider(new ExampleBalanceManager(), new ExampleBankManager());
    }

    @Override
    public void onEnable()
    {
        VaultX vaultX = VaultX.getRuntimeInstance();
        vaultX.registerEnvironment(this);

        //This makes sure if there is another economy choosen by user that this one gets enabled instead of yours.
        Economy economy = (Economy) vaultX.getEnvironmental(Economy.class);

        EconomyProvider economyProvider = economy.declaredProvider();

        if(null == economyProvider){
            return;
        }

        BalanceManager balanceManager = economyProvider.getBalanceManager();
        BankManager bankManager = economyProvider.getBankManager();

        if(null == balanceManager || null == bankManager){
            return;
        }

        Player p = Bukkit.getPlayer("Sh99");

        if(null == p){
            return;
        }

        balanceManager.add(p.getUniqueId(), 5000);
        balanceManager.getMoney(p.getUniqueId());

        bankManager.createAccount(p.getUniqueId(), 0);

        Player member = Bukkit.getPlayer("Tom");

        if(null == member){
            return;
        }

        bankManager.addMember(p.getUniqueId(), member.getUniqueId());
        bankManager.closeAccount(p.getUniqueId());
    }

    private Connection getConnection()
    {
        return null;
    }
}
