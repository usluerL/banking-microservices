package com.byusluer.accountservice.service;

import com.byusluer.accountservice.entity.Account;
import com.byusluer.accountservice.entity.Customer;
import com.byusluer.accountservice.model.CustomerDetails;
import com.byusluer.accountservice.model.PropertyResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountService {

    Account findByCustomerId(long id);
    PropertyResponse getAccountProperties();
    CustomerDetails getCustomerDetails(Customer customer);
}
