package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.Card;
import com.byusluer.accountservice.model.CustomerDetails;
import com.byusluer.accountservice.model.Loan;
import com.byusluer.accountservice.repository.AccountRepository;
import com.byusluer.accountservice.service.client.CardServiceClient;
import com.byusluer.accountservice.service.client.LoanServiceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    final CardServiceClient cardServiceClient;

    @Override
    public List<Card> getCardDetails(Customer customer) {

        return cardServiceClient.getCardDetails(customer);

    }
}
