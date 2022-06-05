package com.spring5.practice.config;


import com.spring5.practice.services.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring5.practice.services","com.spring5.practice.dao"})
public class RootConfig {

    @Bean
    public Account accountDetails() {
        Account account = new Account();
        account.setAccountId("1234");
        account.setAccountType("Business");
        account.setAccountHolderName("ABC Org");
        return account;
    }
}
