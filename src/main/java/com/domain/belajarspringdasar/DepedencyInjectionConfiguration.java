package com.domain.belajarspringdasar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Primary
    @Bean
    public Foo fooFirst() {
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
    @Primary
    @Bean
    public FooBar fooBar(Foo foo, Bar bar) { // Spring akan mencari bean tipe Foo dan tipe Bar
        return new FooBar(foo, bar);
    }

    // =========================Materi Memilih Depedency============================
    /*
     * Pada dasarnya depedency injection akan otomatis mencari bean dengan tipe yang
     * sama dengan paramater, jika terdapat lebih dari satu bean maka yang akan
     * digunakan yaitu bean primary. Jika ingin menggunakan bean selain bean primary
     * pada parameter DI dapat ditambahkan annotation @Qualifier("namabean")
     */
    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    // Spring akan mencari bean tipe Foo dengan nama foo second dan tipe Bar
    public FooBar fooBar2(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
