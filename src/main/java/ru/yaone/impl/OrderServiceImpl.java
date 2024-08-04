package ru.yaone.impl;

import ru.yaone.model.Car;
import ru.yaone.model.Client;
import ru.yaone.model.Order;
import ru.yaone.model.enumeration.OrderStatus;
import ru.yaone.services.OrderService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Реализация сервиса для работы с заказами.
 * <p>
 * Этот класс предоставляет методы для добавления, получения,
 * обновления, удаления заказов, а также их поиска по различным критериям.
 * </p>
 */
public class OrderServiceImpl implements OrderService {

    private final List<Order> orders = new ArrayList<>();

    /**
     * Добавляет новый заказ в список.
     *
     * @param order заказ, который необходимо добавить
     */
    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Получает список всех заказов.
     *
     * @return неизменяемый список всех зарегистрированных заказов
     */
    @Override
    public List<Order> getAllOrders() {
        return List.copyOf(orders);
    }

    /**
     * Получает заказ по его идентификатору.
     *
     * @param id идентификатор заказа
     * @return заказ с заданным идентификатором или null, если такой заказ не найден
     */
    @Override
    public Order getOrderById(int id) {
        return orders.stream()
                .filter(order -> order.id() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Обновляет информацию о заказе.
     *
     * @param id           идентификатор заказа, который необходимо обновить
     * @param updatedOrder объект заказа с обновленной информацией
     */
    @Override
    public void updateOrder(int id, Order updatedOrder) {
        var order = getOrderById(id);
        if (order != null) {
            orders.remove(order);
            orders.add(updatedOrder);
        }
    }

    /**
     * Удаляет заказ из списка по его идентификатору.
     *
     * @param id идентификатор заказа, который необходимо удалить
     */
    @Override
    public void deleteOrder(int id) {
        var order = getOrderById(id);
        if (order != null) {
            orders.remove(order);
        }
    }

    /**
     * Ищет заказы по заданным критериям.
     *
     * @param from   дата и время начала периода создания заказов (можно установить в null для игнорирования)
     * @param to     дата и время окончания периода создания заказов (можно установить в null для игнорирования)
     * @param client клиент, сделавший заказ (можно установить в null для игнорирования)
     * @param status статус заказа (можно установить в null для игнорирования)
     * @param car    автомобиль, связанный с заказом (можно установить в null для игнорирования)
     * @return список заказов, соответствующих заданным критериям
     */
    @Override
    public List<Order> searchOrders(LocalDateTime from, LocalDateTime to, Client client, OrderStatus status, Car car) {
        return orders.stream()
                .filter(order ->
                        (from == null || order.creationDate().isAfter(from))
                                && (to == null || order.creationDate().isBefore(to))
                                && (client == null || order.client().equals(client))
                                && (status == null || order.status() == status)
                                && (car == null || order.car().equals(car)))
                .collect(Collectors.toList());
    }
}