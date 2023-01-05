package com.domain.belajarspringdasar.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.domain.belajarspringdasar.data.Foo;

@SpringBootApplication
public class FooApplication {

    /*
     * Sebelumnya kita membuat application context secara manual. Pada spring boot
     * terdapat fitur untuk membuat spring boot otomatis. pada membuat aplikasi
     * spring boot, kita akan mengganti @Configuration utama
     * menjadi @SpringBootApplication yang berisikan gabungan
     * dari @Configuration, @ComponentScan, dsb.
     * 
     * selain @SpringBootApplication, untuk membuat application context tidak perlu
     * manual cukup menggunakan class SpringApplication. Secara otomatis
     * SpringApplication akan membuat ApplicationContext dan melakukan hal yang
     * dibutuhkan secara otomatis
     */

    @Bean
    public Foo foo() {
        return new Foo();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
