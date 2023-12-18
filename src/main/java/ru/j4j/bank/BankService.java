package ru.j4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу сервиса Банка с моделями данных
 * {@link User}
 * {@link Account}
 *
 * @author DMITRII KAPUSTIN
 * @version 1.0
 */

public class BankService {
    /**
     * Хранение данных ключ-значение для пары User и все привязанные аккаунты
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход объект класса User
     * Если входящий объект User не существует, то происходит добавления пользователя
     * в массив Account
     *
     * @param user, который добавляется в массив ArrayList аккаунтов Account
     */

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }

    }

    /**
     * Метод принимает на вход объект класса User.passport
     * Если входящий объект User.passport будет найден, то происходит его удаление
     *
     * @param passport, поле класса User, которое необходимо удалить
     */

    public void deleteUser(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.remove(user);
            }
        }
    }

    /**
     * Метод принимает два параметра
     * Если пользователь (User.passport) найден, то происходит добавления аккаунта
     * (Account) к пользователю (User)
     *
     * @param passport, поле класса User, которое необходимо добавить
     * @param account,  объект класса Account, в который добавляется к пользователю по
     *                  уникальному значению passport User
     */

    public void addAccount(String passport, Account account) {
        User foundUser = findByPassport(passport);
        if (foundUser != null) {
            List<Account> userAccounts = users.get(foundUser);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * Метод принимает параметр паспорт пользователя, и если пользователь найден
     * вернется значение объекта User
     *
     * @param passport, поле класса User, по которому осуществляется поиск пользователя
     *                  по паспорту
     * @return объект класса User
     */

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод принимает два параметра паспорт и реквизиты аккаунта пользователя
     *
     * @param passport,  поле класса User, по которому осуществляется поиск, если пользователь
     *                   найден, тогда происходит поиск по реквизитам
     * @param requisite, поле класса Account, если реквизит найден, выводится объект класса Account
     * @return объект класса Account
     */
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

    /**
     * Метод принимает 5 параметров для трансфера денежных средств между пользователями
     *
     * @param srcPassport,   паспорт пользователя отправителя
     * @param srcRequisite,  реквизиты пользователя отправителя
     * @param destPassport,  паспорт пользователя получателя
     * @param destRequisite, реквизиты пользователя получателя
     * @param amount,        сумма денежных средств
     * @return булево значение результата трансфера
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount == null) {
            return result;
        }
        if (srcAccount.getBalance() < amount) {
            return result;
        }
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (destAccount == null) {
            return result;
        }

        destAccount.setBalance(destAccount.getBalance() + amount);
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        result = true;
        return result;
    }

    /**
     * Метод принимает объект класса User, и возвращает привязанные к нему объекты класса Account
     *
     * @param user, объект класса User
     * @return массив счетов пользователя объекта User
     */

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}