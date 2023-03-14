package com.byusluer.loanservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;


@Configuration
@ConfigurationProperties(prefix = "loans")
@Data
public class LoanWsConfig {

    private String msg;
    private String build;
    private Map<String,String> mailDetails;
    private List<String> activeBranches;
}
