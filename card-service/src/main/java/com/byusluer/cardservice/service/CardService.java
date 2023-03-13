package com.byusluer.cardservice.service;

import com.byusluer.cardservice.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> findByCustomerId(Integer id);
}
