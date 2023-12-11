package ru.excangermicroservices.currency.client;

import java.time.LocalDate;

public interface HttpCurrencyDateRateClient {
    String requestByDay(LocalDate date);
}
