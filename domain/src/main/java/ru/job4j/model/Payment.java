package ru.job4j.model;

import lombok.Data;

@Data
public class Payment {

    private int id;
    private double transactionAmount;
    private boolean acceptStatus;
    private String cardNumber;
    private String cardExpiration;
    private String cardOwnerCredentials;
    private String cardCVV;
}
