package ru.job4j.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.model.Card;
import ru.job4j.repository.CardRepository;

@Service
@AllArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    public Card buyCard(Card card) {
        return cardRepository.save(card);
    }
}
