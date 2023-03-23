package com.byusluer.accountservice.controller;


import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.CustomerDetails;
import com.byusluer.accountservice.model.PropertyResponse;
import com.byusluer.accountservice.service.AccountService;
import com.byusluer.accountservice.service.client.CardServiceClient;
import com.byusluer.accountservice.service.client.LoanServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    final AccountService accountService;

    @GetMapping
    public String test() {
        return "up";
    }

    @PostMapping("/myAccount")
    public Account getAccountByCustomerId(@RequestBody Customer customer) {
        return accountService.findByCustomerId(customer.getCustomerId());
    }

    @GetMapping("/properties")
    public ResponseEntity<PropertyResponse> getAccountProperties() {
        PropertyResponse accountProperties = accountService.getAccountProperties();

        return ResponseEntity.ok(accountProperties);
    }

    @PostMapping("/customerDetails")
    public CustomerDetails getCustomerDetails(@RequestBody Customer customer){
       return accountService.getCustomerDetails(customer);
    }
}
