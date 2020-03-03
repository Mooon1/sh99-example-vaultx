package de.sh99.needs_vault.manager;

import com.sun.istack.internal.NotNull;
import de.sh99.vault.economy.Balance;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.UUID;

public class BalanceManager implements Balance
{
    private FileConfiguration storage;

    public BalanceManager(@NotNull FileConfiguration storage)
    {
        this.storage = storage;
    }

    @Override
    public void add(UUID uuid, double v) {

    }

    @Override
    public void remove(UUID uuid, double v) {

    }

    @Override
    public double getMoney(UUID uuid) {
        return 0;
    }

    @Override
    public double hasMoney(UUID uuid, double v) {
        return 0;
    }
}
