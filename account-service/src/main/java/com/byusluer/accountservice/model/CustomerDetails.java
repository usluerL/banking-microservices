package com.byusluer.accountservice.model;

import com.byusluer.accountservice.entity.Account;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class CustomerDetails {
    private Account account;
    private List<Loan> loans;
    private List<Card> cards;
}
