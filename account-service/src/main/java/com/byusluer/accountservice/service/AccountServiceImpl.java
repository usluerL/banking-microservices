package com.byusluer.accountservice.service;

import com.byusluer.accountservice.config.AccountServiceConfig;
import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.model.PropertyResponse;
import com.byusluer.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountServiceConfig serviceConfig;
    private final AccountRepository accountRepository;

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
}
