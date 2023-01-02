package com.domain.belajarspringdasar.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.domain.belajarspringdasar.data.Foo;

@Configuration
public class FooConfiguration {

    @Bean
    @Primary
    public Foo foo() {
        return new Foo();
    }

    // untuk materi optionalDepedency
    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }
}
