package ru.yaone.services;

import ru.yaone.model.Car;
import ru.yaone.model.Client;
import ru.yaone.model.Order;
import ru.yaone.model.enumeration.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Интерфейс для сервиса управления заказами.
 * <p>
 * Этот интерфейс предоставляет методы для добавления,
 * получения, обновления и удаления заказов, а также
 * для поиска заказов по различным критериям.
 * </p>
 */
public interface OrderService {

    /**
     * Добавляет новый заказ в систему.
     *
     * @param order объект заказа, который необходимо добавить
     */
    void addOrder(Order order);

    /**
     * Получает список всех заказов в системе.
     *
     * @return список всех заказов
     */
    List<Order> getAllOrders();

    /**
     * Получает заказ по его идентификатору.
     *
     * @param id идентификатор заказа
     * @return объект заказа с указанным идентификатором или null,
     * если заказ не найден
     */
    Order getOrderById(int id);

    /**
     * Обновляет информацию о заказе.
     *
     * @param id           идентификатор заказа, который необходимо обновить
     * @param updatedOrder объект заказа с обновлённой информацией
     */
    void updateOrder(int id, Order updatedOrder);

    /**
     * Удаляет заказ из системы по его идентификатору.
     *
     * @param id идентификатор заказа, который необходимо удалить
     */
    void deleteOrder(int id);

    /**
     * Ищет заказы по заданным критериям.
     *
     * @param from   дата и время начала диапазона поиска
     * @param to     дата и время окончания диапазона поиска
     * @param client клиент, для которого осуществляется поиск заказов
     * @param status статус заказа
     * @param car    автомобиль, связанный с заказом
     * @return список заказов, удовлетворяющих заданным критериям
     */
    List<Order> searchOrders(LocalDateTime from, LocalDateTime to, Client client, OrderStatus status, Car car);
}