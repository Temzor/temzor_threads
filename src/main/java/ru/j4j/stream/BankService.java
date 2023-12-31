package ru.j4j.stream;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class BankService {
    private final Map<User, List<Account>> users;

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.passport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user)
                .stream()
                .filter(account -> account.requisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }
}
