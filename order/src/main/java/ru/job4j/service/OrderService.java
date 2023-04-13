package ru.job4j.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.model.Dish;
import ru.job4j.model.Order;
import ru.job4j.model.OrderDTO;
import ru.job4j.model.Status;
import ru.job4j.repository.OrderRepository;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Status checkStatus(int orderId) {
        return orderRepository.findById(orderId).orElseThrow().getStatus();
    }

    public Optional<Order> findById(int id) {
        return orderRepository.findById(id);
    }

    public OrderDTO getOrderDTO(int id) {
        Order order = orderRepository.findById(id).orElseThrow();
        return new OrderDTO(id,
                order.getCreated(),
                order.getDishes().stream().map(Dish::getName).collect(Collectors.toList()),
                order.getCustomer().getLogin(),
                order.getProduct().getTitle(),
                order.getStatus().getName());
    }
}
