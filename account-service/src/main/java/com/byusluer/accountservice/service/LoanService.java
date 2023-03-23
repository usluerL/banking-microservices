package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.Loan;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LoanService {

    List<Loan> getLoanDetails(@RequestBody Customer customer);
}
