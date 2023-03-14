package com.byusluer.cardservice.controller;

import com.byusluer.cardservice.config.CardWsConfig;
import com.byusluer.cardservice.entity.Card;
import com.byusluer.cardservice.model.Customer;
import com.byusluer.cardservice.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/cards")
@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardRepository cardService;
    private final CardWsConfig cardWsConfig;


    @GetMapping
    public String test(){
        return "up";
    }


    @GetMapping("/properties")
    public ResponseEntity<String> configTest(){
        log.info(cardWsConfig.getMsg());
        return ResponseEntity.ok(cardWsConfig.getMsg());
    }


    @PostMapping("/mycards")
    List<Card> getCustomerCards(@RequestBody Customer customer) {
        return cardService.findByCustomerId(customer.getCustomerId());
    }
}
