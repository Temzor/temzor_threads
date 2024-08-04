package ru.yaone.model;

import ru.yaone.model.enumeration.CarCondition;

/**
 * Запись (record), представляющая автомобиль.
 * <p>
 * Данный класс содержит основную информацию об автомобиле,
 * включая его идентификатор, марку, модель, год выпуска, цену
 * и состояние. Используется для представления данных о
 * автомобилях в системе.
 * </p>
 *
 * @param id        уникальный идентификатор автомобиля
 * @param make      марка автомобиля
 * @param model     модель автомобиля
 * @param year      год выпуска автомобиля
 * @param price     цена автомобиля
 * @param condition состояние автомобиля
 */
public record Car(int id, String make, String model, int year, double price, CarCondition condition) {
}