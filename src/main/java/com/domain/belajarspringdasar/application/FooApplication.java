package com.domain.belajarspringdasar.application;

import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.domain.belajarspringdasar.data.Bar;
import com.domain.belajarspringdasar.data.Foo;
import com.domain.belajarspringdasar.listener.AppStartingListener;

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

    /*
     * pada SpringBootApplication terdapat failure Analyzer(StartUpFailure) yang
     * memberitahu jika ada kesalahan dan mendeskripsikan serta memberitahukan aksi
     * yang harus dilakukan. dapat dilihat pada terminal atau debug
     */
    @Bean
    public Foo foo() { // tambah kan Bar bar pada parameter untuk materi StartUpFailure
        return new Foo();
    }

    // public static void main(String[] args) {
    // ConfigurableApplicationContext applicationContext =
    // SpringApplication.run(FooApplication.class, args);

    // Foo foo = applicationContext.getBean(Foo.class);
    // System.out.println(foo);
    // }

    /*
     * MATERI CUSTOMIZING SPRING APPLICATION
     * terkadang ada kala kita ingin mengatur spring application yang kita buat
     * sebelum application context dibuat. Kita tidak perlu menggunakan
     * SpringApplication.run() namun dapat juga menggunakan new SpringApplication.
     * Kita tidak harus menggunakan SpringApplication, bisa juga menggunakan bantuan
     * lainnya seperti SpringApplicationBuilder
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(List.of(new AppStartingListener()));
        ConfigurableApplicationContext applicationContext = application.run(args);

        applicationContext.getBean(Foo.class);
    }
}
