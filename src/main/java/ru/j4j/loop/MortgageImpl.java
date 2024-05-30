package ru.j4j.loop;

public class MortgageImpl {
    /**
     * Рассчитывает количество лет, необходимых для погашения ипотеки.
     *
     * @param principal начальная сумма ипотеки
     * @param annualPayment ежегодный платеж
     * @param annualInterestRate годовая процентная ставка
     * @return количество лет для погашения ипотеки
     */
    public static int calculateYears(double principal, int annualPayment, double annualInterestRate) {
        if (principal <= 0 || annualPayment <= 0 || annualInterestRate < 0) {
            throw new IllegalArgumentException("Некорректные входные данные.");
        }

        int years = 0;
        while (principal > 0) {
            principal += principal * (annualInterestRate / 100);
            principal -= annualPayment;
            years++;
        }
        return years;
    }
}