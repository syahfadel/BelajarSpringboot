package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.domain.belajarspringdasar.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({ PaymentGatewayClientFactoryBean.class })
public class FactoryConfiguration {

}
