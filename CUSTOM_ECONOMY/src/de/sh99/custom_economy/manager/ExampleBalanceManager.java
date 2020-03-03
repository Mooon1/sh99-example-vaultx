package de.sh99.custom_economy.manager;

import java.util.UUID;

public class ExampleBalanceManager implements de.sh99.vaultx.manager.BalanceManager
{
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean setEnabled() {
        return false;
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
