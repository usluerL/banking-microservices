package com.byusluer.loanservice.service;

import com.byusluer.loanservice.entity.Loan;

import java.util.List;

public interface LoanService {

    List<Loan> findByCustomerId(int id);
}
