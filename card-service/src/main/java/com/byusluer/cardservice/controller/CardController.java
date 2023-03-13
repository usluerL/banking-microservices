package com.byusluer.cardservice.controller;

import com.byusluer.cardservice.entity.Card;
import com.byusluer.cardservice.model.Customer;
import com.byusluer.cardservice.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cards")
@RestController
@RequiredArgsConstructor
public class CardController {

    private CardRepository cardService;


    @GetMapping
    public String test(){
        return "up";
    }


    @PostMapping("/mycards")
    List<Card> getCustomerCards(@RequestBody Customer customer) {
        return cardService.findByCustomerId(customer.getCustomerId());
    }
}
