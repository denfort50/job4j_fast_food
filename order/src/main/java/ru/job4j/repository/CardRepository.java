package ru.job4j.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.model.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {
}
