package ru.yaone.model;

import ru.yaone.model.enumeration.OrderStatus;

import java.time.LocalDateTime;

/**
 * Запись (record), представляющая заказ.
 * <p>
 * Данный класс хранит информацию о заказе, включая
 * идентификатор заказа, клиента, автомобиль, дату создания
 * заказа и статус заказа. Используется для управления
 * заказами в системе.
 * </p>
 *
 * @param id           уникальный идентификатор заказа
 * @param client       объект клиента, связанный с заказом
 * @param car          объект автомобиля, связанного с заказом
 * @param creationDate дата и время создания заказа
 * @param status       статус заказа, представленный значением из
 *                     перечисления {@link OrderStatus}
 */
public record Order(int id, Client client, Car car, LocalDateTime creationDate, OrderStatus status) {
}