package de.sh99.custom_economy.manager;

import com.sun.istack.internal.NotNull;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.UUID;

public class BalanceManager implements de.sh99.vaultx.economy.BalanceManager
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
