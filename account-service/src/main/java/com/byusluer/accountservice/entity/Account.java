package com.byusluer.accountservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Account {

    @Id
    private Long accountId;
    private String branchName;
    private String accountType;
    private LocalDate createDate;
    private Long customerId;

}
