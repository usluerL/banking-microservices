package com.byusluer.cardservice.service;

import com.byusluer.cardservice.entity.Card;
import com.byusluer.cardservice.repository.CardRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    final CardRepository cardRepository;


    @Override
    public List<Card> findByCustomerId(Integer id) {
        return cardRepository.findByCustomerId(id);
    }
}
