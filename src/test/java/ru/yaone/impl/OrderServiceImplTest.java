package ru.yaone.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.yaone.model.Car;
import ru.yaone.model.Client;
import ru.yaone.model.Order;
import ru.yaone.model.enumeration.OrderStatus;
import ru.yaone.services.OrderService;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class OrderServiceImplTest {

    private OrderService orderService;
    private Client mockClient;
    private Car mockCar;

    @BeforeEach
    void setUp() {
        orderService = new OrderServiceImpl();
        mockClient = mock(Client.class);
        mockCar = mock(Car.class);
    }

    @Test
    void testAddOrder() {
        Order order = new Order(1, mockClient, mockCar, LocalDateTime.now(), OrderStatus.PENDING);
        orderService.addOrder(order);

        List<Order> orders = orderService.getAllOrders();

        assertThat(orders).hasSize(1);
        assertThat(orders).contains(order);
    }

    @Test
    void testGetAllOrders() {
        Order order1 = new Order(1, mockClient, mockCar, LocalDateTime.now(), OrderStatus.PENDING);
        Order order2 = new Order(2, mockClient, mockCar, LocalDateTime.now(), OrderStatus.APPROVED);

        orderService.addOrder(order1);
        orderService.addOrder(order2);

        List<Order> orders = orderService.getAllOrders();

        assertThat(orders).hasSize(2);
        assertThat(orders).contains(order1, order2);
    }

    @Test
    void testGetOrderById() {
        Order order = new Order(1, mockClient, mockCar, LocalDateTime.now(), OrderStatus.PENDING);
        orderService.addOrder(order);

        Order fetchedOrder = orderService.getOrderById(1);

        assertThat(fetchedOrder).isEqualTo(order);
    }

    @Test
    void testUpdateOrder() {
        Order order = new Order(1, mockClient, mockCar, LocalDateTime.now(), OrderStatus.PENDING);
        orderService.addOrder(order);

        Order updatedOrder = new Order(1, mockClient, mockCar, LocalDateTime.now(), OrderStatus.APPROVED);
        orderService.updateOrder(1, updatedOrder);

        Order fetchedOrder = orderService.getOrderById(1);

        assertThat(fetchedOrder.status()).isEqualTo(OrderStatus.APPROVED);
    }

    @Test
    void testDeleteOrder() {
        Order order = new Order(1, mockClient, mockCar, LocalDateTime.now(), OrderStatus.PENDING);
        orderService.addOrder(order);

        orderService.deleteOrder(1);

        List<Order> orders = orderService.getAllOrders();

        assertThat(orders).isEmpty();
    }

    @Test
    void testSearchOrders() {
        LocalDateTime now = LocalDateTime.now();
        Order order1 = new Order(1, mockClient, mockCar, now.minusDays(1), OrderStatus.PENDING);
        Order order2 = new Order(2, mockClient, mockCar, now, OrderStatus.APPROVED);

        orderService.addOrder(order1);
        orderService.addOrder(order2);

        List<Order> searchedOrders = orderService.searchOrders(now.minusDays(2), now.plusDays(1), mockClient, OrderStatus.PENDING, mockCar);

        assertThat(searchedOrders).hasSize(1);
        assertThat(searchedOrders).contains(order1);
    }
}