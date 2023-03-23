package com.byusluer.accountservice.service;

import com.byusluer.accountservice.config.AccountServiceConfig;
import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.Card;
import com.byusluer.accountservice.model.CustomerDetails;
import com.byusluer.accountservice.model.Loan;
import com.byusluer.accountservice.model.PropertyResponse;
import com.byusluer.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountServiceConfig serviceConfig;
    private final AccountRepository accountRepository;
    private final LoanService loanService;
    private final CardService cardService;

    @Override
    public Account findByCustomerId(long id) {
        return accountRepository.findByCustomerId(id);
    }


    @Override
    public PropertyResponse getAccountProperties() {

        return PropertyResponse.builder()
                .msg(serviceConfig.getMsg())
                .mailDetails(serviceConfig.getMailDetails())
                .activeBranches(serviceConfig.getActiveBranches())
                .buildVersion(serviceConfig.getBuild())
                .build();
    }

    public CustomerDetails getCustomerDetails(Customer customer) {
        Account account = accountRepository.findByCustomerId(customer.getCustomerId());
        List<Loan> loanDetails = loanService.getLoanDetails(customer);
        List<Card> cardDetails = cardService.getCardDetails(customer);

        return CustomerDetails.builder()
                .account(account)
                .cards(cardDetails)
                .loans(loanDetails).build();
    }
}
