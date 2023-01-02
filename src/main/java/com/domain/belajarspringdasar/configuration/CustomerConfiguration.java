package com.domain.belajarspringdasar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.domain.belajarspringdasar.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {

    @Bean
    @Primary
    public CustomerRepository normalCustomerRepository() {
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository() {
        return new CustomerRepository();
    }
}
