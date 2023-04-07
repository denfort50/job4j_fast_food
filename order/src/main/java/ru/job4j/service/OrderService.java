package ru.job4j.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.model.Order;
import ru.job4j.model.Status;
import ru.job4j.repository.OrderRepository;

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
}
