package com.byusluer.accountservice.repository;

import com.byusluer.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
      Account findByCustomerId(long customerId);
}