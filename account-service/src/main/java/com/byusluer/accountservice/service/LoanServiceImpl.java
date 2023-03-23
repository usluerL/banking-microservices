package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.Card;
import com.byusluer.accountservice.model.Loan;
import com.byusluer.accountservice.service.client.LoanServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanServiceClient loanServiceClient;

    @Override
    public List<Loan> getLoanDetails(Customer customer) {
        return loanServiceClient.getLoansDetails(customer);
    }
}
