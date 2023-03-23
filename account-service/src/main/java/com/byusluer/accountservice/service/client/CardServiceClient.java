package com.byusluer.accountservice.service.client;

import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.Card;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("cards")
public interface CardServiceClient {

    @PostMapping("/myCards")
    List<Card> getCardDetails(@RequestBody Customer customer);
}
