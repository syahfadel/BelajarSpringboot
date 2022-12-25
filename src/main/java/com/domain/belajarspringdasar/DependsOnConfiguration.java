package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.domain.belajarspringdasar.data.Bar;
import com.domain.belajarspringdasar.data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    /*
     * Pada spring jika terdapat bean yang DI maka yang pertama akan dibuat yaitu
     * parameter atau injectionnya. Namun jika tidak ada DI maka yang akan pertama
     * dibuat yaitu bean yang paling atas.
     * Lalu bagaimana jika ingin mengutamakan bean yang dibawah yang dibuat dahulu
     * baru bean diatas? masalah ini dapat diselesaikan dengan menggunakan
     * annotation @DependsOn({"namaBean"}), nama Bean pada dependsOn akan dibuat
     * dahulu baru bean itu sendiri
     */
    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo() {
        log.info("Create new Foo ");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar ");
        return new Bar();
    }
}
