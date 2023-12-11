package ru.excangermicroservices.currency.service;


import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.springframework.stereotype.Service;
import ru.excangermicroservices.currency.client.HttpCurrencyDateRateClient;
import ru.excangermicroservices.currency.schema.ValCurs;

import java.io.StringReader;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static java.util.stream.Collectors.toMap;


@Service
public class CbrService {
    private final Cache<LocalDate, Map<String, BigDecimal>> cache;
    private final HttpCurrencyDateRateClient client;

    public CbrService(HttpCurrencyDateRateClient client) {
        this.cache = CacheBuilder.newBuilder().build();
        this.client = client;
    }

    public BigDecimal requestByCurrencyCode(String code) {
        try {
            return cache.get(LocalDate.now(), this::callAllByCurrentDate).get(code);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }

    private Map<String, BigDecimal> callAllByCurrentDate() {
        String xml = client.requestByDay(LocalDate.now());
        ValCurs response = unMarshall(xml);
        return response.getValute().stream()
                .collect(toMap(ValCurs.Valute::getCharCode, item -> parseWithLocale(item.getValue())));
    }

    private BigDecimal parseWithLocale(String currency) {
        double v = 0;
        try {
            v = NumberFormat.getNumberInstance(Locale.getDefault()).parse(currency).doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return BigDecimal.valueOf(v);
    }

    private ValCurs unMarshall(String xml) {
        try {
            StringReader reader = new StringReader(xml);
            JAXBContext context = JAXBContext.newInstance(ru.excangermicroservices.currency.schema.ValCurs.class);
            return (ValCurs) context.createUnmarshaller().unmarshal(reader);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
