package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.domain.belajarspringdasar.service.MerchantServiceImpl;

@Configuration
@Import({ MerchantServiceImpl.class })
public class InheritanceConfiguration {

}
