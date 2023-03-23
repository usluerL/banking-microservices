package com.byusluer.accountservice.service.client;

import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.Card;
import com.byusluer.accountservice.model.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("loans")
public interface LoanServiceClient {

    @PostMapping("/myLoans")
    List<Loan> getLoansDetails(@RequestBody Customer customer);
}
