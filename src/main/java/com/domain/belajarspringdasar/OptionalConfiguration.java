package com.domain.belajarspringdasar;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.belajarspringdasar.data.Bar;
import com.domain.belajarspringdasar.data.Foo;
import com.domain.belajarspringdasar.data.FooBar;

@Configuration
public class OptionalConfiguration {
    /*
     * Secara default depedency wajib, jika bean tidak ditemukan saat depedency
     * injection akan error. namun kita bisa membuat suatu depedency menjadi
     * optional(tidak wajib) jadi jika tidak terdapat bean tersebut program tidak
     * akan error. yaitu menggunakan java.util.optional. otomatis tidak akan wajib.
     * Optional dapat digunakan di @Bean di method parameter atau di @Component di
     * constructor paramater/ setter parameter/ field.
     */
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
        // orElse diperlukan jika parameter tidak ditemukan maka diberi nilai null
    }
}
