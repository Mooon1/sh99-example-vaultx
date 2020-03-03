package de.sh99.custom_economy.manager;

import org.bukkit.World;
import java.util.UUID;

public class ExampleBankManager implements de.sh99.vaultx.manager.BankManager
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
    public void withdraw(UUID uuid, double v) {

    }

    @Override
    public void deposit(UUID uuid, double v) {

    }

    @Override
    public double getMoney(UUID uuid) {
        return 0;
    }

    @Override
    public double hasMoney(UUID uuid, double v) {
        return 0;
    }

    @Override
    public void createAccount(UUID uuid, double v) {

    }

    @Override
    public void createAccount(UUID uuid, double v, World world) {

    }

    @Override
    public void closeAccount(UUID uuid) {

    }

    @Override
    public boolean hasAccount(UUID uuid) {
        return false;
    }

    @Override
    public boolean isMember(UUID uuid) {
        return false;
    }

    @Override
    public void addMember(UUID uuid, UUID uuid1) {

    }

    @Override
    public void removeMember(UUID uuid) {

    }
}
