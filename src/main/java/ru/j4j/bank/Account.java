package ru.j4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель класса POJO Account
 *
 * @author DMITRII KAPUSTIN
 * @version 1.0
 */

public class Account {
    /**
     * Хранение реквизитов аккаунта
     */
    private final String requisite;
    /**
     * Хранение баланса аккаунта
     */
    private double balance;

    /**
     * Конструктор POJO МД Account
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Блок getter и setter
     */

    public String getRequisite() {
        return requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}