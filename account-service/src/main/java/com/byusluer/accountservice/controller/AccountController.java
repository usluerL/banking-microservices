package com.byusluer.accountservice.controller;


import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    AccountService accountService;

    @GetMapping
    public String test(){
        return "up";
    }

    @PostMapping("/myAccount")
   public Account getAccountByCustomerId(@RequestBody Customer customer){
       return accountService.findByCustomerId(customer.getCustomerId());
    }

}
