package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.domain.belajarspringdasar.data.Foo;

@Configuration
public class ChangeBeanNameConfiguration {
    /*
     * padau umumnya nama bean akan sama dengan nama method yang dibuat
     * namun jika saat aplikasi telah berkembang akan ada kemungkinan
     * method yang memiliki nama yang sama, sehingga nama bean akan menjadi bentrok
     * sehingga untuk menghindari kesamaan nama bean karena nama method yang sama
     * maka nama bean dapat diubah dengan memasukan (value = "namaBean") setelah
     * annotation @Bean, nama bean harus tetap unik
     */
    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1() {
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2() {
        return new Foo();
    }
}
