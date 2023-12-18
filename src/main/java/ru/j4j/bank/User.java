package ru.j4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель класса POJO User
 *
 * @author DMITRII KAPUSTIN
 * @version 1.0
 */

public class User {
    /**
     * Хранение паспортных данных пользователя
     */
    private final String passport;
    /**
     * Хранение данных пользователя (login)
     */
    private final String username;

    /**
     * Конструктор POJO МД User
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Блок getter и setter
     */

    public String getPassport() {
        return passport;
    }

    /**
     * Контрактные методы(equals и hashCode) для сравнения объектов класса Account
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    public String getUsername() {
        return username;
    }
}