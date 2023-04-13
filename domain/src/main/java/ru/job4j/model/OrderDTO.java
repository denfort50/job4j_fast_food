package ru.job4j.model;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
public class OrderDTO {

    private int id;

    private LocalDateTime created;

    private List<String> dishNames;

    private String customerName;

    private String productName;

    private String status;
}
