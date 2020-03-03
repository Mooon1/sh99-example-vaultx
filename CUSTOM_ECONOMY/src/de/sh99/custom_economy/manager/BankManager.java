package de.sh99.custom_economy.manager;

import com.sun.istack.internal.NotNull;
import de.sh99.vault.economy.Bank;
import org.bukkit.World;

import java.sql.Connection;
import java.util.UUID;

public class BankManager implements Bank
{
    private Connection con;

    public BankManager(@NotNull Connection con)
    {
        this.con = con;
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
