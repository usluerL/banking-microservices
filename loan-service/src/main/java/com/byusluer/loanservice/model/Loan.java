package com.byusluer.loanservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Loan {

    private int loanNumber;
    private int customerId;
    private Date startDate;
    private int totalLoan;
    private int amountPaid;
    private int outstandingAmount;
    private String createdDate;
}
