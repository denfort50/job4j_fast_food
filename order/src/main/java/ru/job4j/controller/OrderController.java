package ru.job4j.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.job4j.model.Card;
import ru.job4j.model.Order;
import ru.job4j.model.Status;
import ru.job4j.service.CardService;
import ru.job4j.service.OrderService;

@Controller
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    private final CardService cardService;

    @PostMapping("/createOrder")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.createOrder(order), HttpStatus.CREATED);
    }

    @PostMapping("/buyCard")
    public ResponseEntity<Card> buyCard(@RequestBody Card card) {
        return new ResponseEntity<>(cardService.buyCard(card), HttpStatus.CREATED);
    }

    @GetMapping("/checkStatus/{id}")
    public ResponseEntity<Status> checkStatus(@PathVariable("id") int id) {
        return new ResponseEntity<>(orderService.checkStatus(id), HttpStatus.OK);
    }
}
