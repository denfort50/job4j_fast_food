package ru.job4j.model;

import lombok.Data;

@Data
public class Delivery {

    private int id;
    private String address;
    private boolean deliverStatus;
}
