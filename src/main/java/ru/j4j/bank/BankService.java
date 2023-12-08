package ru.j4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }

    }

    public void deleteUser(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.remove(user);
            }
        }
    }

    public void addAccount(String passport, Account account) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            List<Account> userAccounts = users.get(foundUser);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            for (Account account : users.get(foundUser)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount == null) {
            return rsl;
        }
        if (srcAccount.getBalance() < amount) {
            return rsl;
        }
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (destAccount == null) {
            return rsl;
        }

        destAccount.setBalance(destAccount.getBalance() + amount);
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        rsl = true;
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}