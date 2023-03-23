package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.Card;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CardService {

    List<Card> getCardDetails(@RequestBody Customer customer);
}
