package com.byusluer.loanservice.service;

import com.byusluer.loanservice.entity.Loan;
import com.byusluer.loanservice.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    LoanRepository loanRepository;

    @Override
    public List<Loan> findByCustomerId(int id) {
        return loanRepository.findByCustomerIdOrderByStartDtDesc(id);
    }
}
