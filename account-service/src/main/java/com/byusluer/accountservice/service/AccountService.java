package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Account;

public interface AccountService {

    Account findByCustomerId(long id);
}
