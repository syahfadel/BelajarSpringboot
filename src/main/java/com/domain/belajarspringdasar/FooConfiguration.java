package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.belajarspringdasar.data.Foo;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
