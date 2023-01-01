package com.domain.belajarspringdasar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.repository.CustomerRepository;

import lombok.Getter;

@Component
public class CustomerService {
    /*
     * Depedency injection berikutnya yaitu field injection yang sudah tidak
     * disarankan oleh spring. Field injection menambahkan @Autowired sebelum nama
     * field
     */
    @Getter
    @Autowired
    private CustomerRepository customerRepository;
}
