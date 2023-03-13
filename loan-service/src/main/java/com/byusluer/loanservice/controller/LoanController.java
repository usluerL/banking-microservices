package com.byusluer.loanservice.controller;

import com.byusluer.loanservice.entity.Loan;
import com.byusluer.loanservice.model.Customer;
import com.byusluer.loanservice.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/loans")
@RestController
@RequiredArgsConstructor
public class LoanController {

    LoanService loanService;


    @GetMapping
    public String test(){
        return "up";
    }

    @PostMapping("/myLoans")
    public List<Loan> getLoansDetails(@RequestBody Customer customer) {
        return loanService.findByCustomerId(customer.getCustomerId());
    }
}
