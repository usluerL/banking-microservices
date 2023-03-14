package com.byusluer.loanservice.controller;

import com.byusluer.loanservice.config.LoanWsConfig;
import com.byusluer.loanservice.entity.Loan;
import com.byusluer.loanservice.model.Customer;
import com.byusluer.loanservice.service.LoanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/loans")
@RestController
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;
    private final LoanWsConfig loanWsConfig;


    @GetMapping
    public String test(){
        return "up";
    }

    @GetMapping("/properties")
    public ResponseEntity<String> configTest(){
        log.info(loanWsConfig.getMsg());
        return ResponseEntity.ok(loanWsConfig.getMsg());
    }

    @PostMapping("/myLoans")
    public List<Loan> getLoansDetails(@RequestBody Customer customer) {
        return loanService.findByCustomerId(customer.getCustomerId());
    }
}
