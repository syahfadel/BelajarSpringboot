package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.belajarspringdasar.data.Foo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {
    /*
     * Saat sebuah objek dimasukan ke spring container IoC maka objek tersebut
     * disebut Bean
     * secara default, bean merupakan singleton (seperti pada class database.java)
     * 
     * Bean dibuat dengan membuat method di class configuration dengan nama method
     * sebagai nama bean. dengan return objek merupakan return bean
     * method diawali dengan annotation @Bean yang menandakan bahwa method tersebut
     * bean
     * 
     * Spring akan otomatis mengeksekusi method dan return value sebagai objek bean
     * secara otomatis
     * yang akan disimpan dicontainer IoC (atau application context)
     * 
     * setelah membuat bean akan otomatis akan disimpan application context
     * jika ingin mengakses dapat dengan getbean (lihat pada BeanTest.java)
     * 
     * method akan dieksekusi diawal sehingga objek dibuat sekali diawal program.
     * jika memanggil getBean berkali-kali tidak akan membuat banyak bean
     */
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}
