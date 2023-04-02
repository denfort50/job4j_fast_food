package ru.job4j.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {

    private int id;
    private LocalDateTime created;
    private List<Dish> dishes;
}
