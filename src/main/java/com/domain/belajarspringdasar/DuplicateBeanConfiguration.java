package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;

import com.domain.belajarspringdasar.data.Foo;

public class DuplicateBeanConfiguration {
    /*
     * Spring dapat mendaftarkan tipe yang sama (misal Foo) tapi harus menggunakan
     * nama bean yang berbeda
     */
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
