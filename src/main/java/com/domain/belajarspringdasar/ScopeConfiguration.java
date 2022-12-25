package com.domain.belajarspringdasar;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.domain.belajarspringdasar.data.Bar;
import com.domain.belajarspringdasar.data.Foo;
import com.domain.belajarspringdasar.scope.DoubletonScope;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {
    /*
     * Scope merupakan strategi cara sebuah objek dibuat. Secara default scope di
     * spring berupa singleton yang berarti objek hanya dibuat sekali, ketika kita
     * akses kedua kalinya akan mengembalikan objek yang sama. Namun scope dapat
     * diubah sesuai keinginan dengan menambahkan
     * annotation @Scope(value="namaScope")
     * 
     * Scope pada spring
     * 1. singleton = (default) dibuat sekali pada spring IoC diawal
     * 2. prototype = selalu dibuat objek baru setiap kali bean diakses
     * 3. request = selalu dibuat per HTTP request (hanya untuk web app)
     * 4. session = selalu dibuat per HTTP session (hanya untuk web app)
     * 5. application = dibuat per ServletContext (hanya untuk web app)
     * 6. websocet = dibuat per websetSocet (hanya untu webSocket app)
     */
    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    /*
     * Setelah scope dibuat bata DoubletonScope.java, selanjutnya mendaftarkan scope
     * di CustomScopeConfigurer
     */
    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Return new bar");
        return new Bar();
    }
}
