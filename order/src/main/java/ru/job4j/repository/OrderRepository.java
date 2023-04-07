package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.model.Order;

import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Integer> {

    Optional<Order> findById(int id);
}
