package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.domain.belajarspringdasar.data.Foo;

@Configuration
public class PrimaryBeanCondiguration {
    /*
     * Pada saat terdapat dua bean dengan nama yang sama, jika ingin memanggil objek
     * (getBean)
     * biasanya perlu memasukan nama bean dan nama class
     * namun jika menggunaka primary dapat menggunakan nama class saja seperti saat
     * hanya ada satu bean
     * bean yang dipanggil merupakan bean dengan annotation Primary
     */
    @Primary
    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }
}
