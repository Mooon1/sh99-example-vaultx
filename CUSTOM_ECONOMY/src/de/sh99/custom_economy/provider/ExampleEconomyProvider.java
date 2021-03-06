package de.sh99.custom_economy.provider;

import com.sun.istack.internal.NotNull;
import de.sh99.vaultx.manager.BalanceManager;
import de.sh99.vaultx.manager.BankManager;
import de.sh99.vaultx.provider.EconomyProvider;

/**
 * This class provides two manager which handles data on different ways.
 *
 * BalanceManager: Just should store data in a file storage so it gains a FileConfiguration to its constructor instead of SQL.
 * BankManager: This should be stored on SQL instead of file so there is a Connection given over the constructor.
 */
public class ExampleEconomyProvider implements EconomyProvider
{
    private BalanceManager balanceManager;

    private BankManager bankManager;

    public ExampleEconomyProvider(
            @NotNull BalanceManager balanceManager,
            @NotNull BankManager bankManager
    ) {
        this.balanceManager = balanceManager;
        this.bankManager = bankManager;
    }

    @Override
    public BalanceManager getBalanceManager() {
        return this.balanceManager;
    }

    @Override
    public BankManager getBankManager() {
        return this.bankManager;
    }
}
