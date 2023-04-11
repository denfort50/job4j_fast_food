package ru.job4j.service;

import ru.job4j.model.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {

    void save(Dish dish);

    Dish update(Dish dish);

    void delete(int id);

    List<Dish> findAll();

    Optional<Dish> findById(int id);

    Optional<Dish> findByName(String name);

}
