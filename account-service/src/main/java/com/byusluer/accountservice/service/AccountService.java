package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.model.PropertyResponse;

public interface AccountService {

    Account findByCustomerId(long id);
    PropertyResponse getAccountProperties();
}
