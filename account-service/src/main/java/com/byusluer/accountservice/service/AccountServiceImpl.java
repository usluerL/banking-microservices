package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {


    final AccountRepository accountRepository;

    @Override
    public Account findByCustomerId(long id) {
        return accountRepository.findByCustomerId(id);
    }
}
