package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.belajarspringdasar.data.Bar;
import com.domain.belajarspringdasar.data.Foo;
import com.domain.belajarspringdasar.data.FooBar;

@Configuration
public class DepedencyInjectionConfiguration {

    /*
     * Depedency Injection merupakan teknik otomatisasi proses pembuatan objek yang
     * bergantung dari objek dari objek lainnya
     * Spring framework merupakan framework IoC yang kerjanya menggunakan DI
     * 
     */
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    /*
     * bean dapat ditambahkan parameter, dan spring akan otomatis akan mecari bean
     * lainyang sesuai dengan tipe parameter
     * kalau tidak ada yang cocok maka otomatis akan error
     * jika yang cocok lebih dari satu akan error kecuali ditambahkan
     * annotation @primary
     */
    @Bean
    public FooBar fooBar(Foo foo, Bar bar) { // Spring akan mencari bean tipe Foo dan tipe Bar
        return new FooBar(foo, bar);
    }
}
