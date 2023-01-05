package com.domain.belajarspringdasar.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationStartedEvent> {
    // tidak perlu @Component karena akan dieksekusi bahkan sebelum bean dibuat

    /*
     * Spring Application Event
     * Springboot terdapat banyak event yang dikirim saat aplikasi SpringBoot
     * berjalan. Jika kita ingin, kita bisa membuat listener untuk menerima
     * eventnya. Khusus event dari springboot dia turunan dari
     * SpringApplicationEvent dengan parent tetep ApplicationEvent.
     * Beberapa Event dari SpringBootApplicationEvent
     * ApplicationStartingEvent dikirim saat start aplikasi
     * ApplicationContextInitializedEvent Dikirim ketika ApplicationContext sudah di
     * initialisasi
     * ApplicationStartedEvent Dikirim saat aplikasi sudah berjalan
     * ApplicationFailedEvent Dikirim saat aplikasi gagal berjalan
     * dll
     * 
     * terdapat perbedaan yaitu pada application ini banyak event yang ditriger
     * sebelum applicationContext dibuat sehinga tidak bisa dibuat dalam bentuk bean
     * oleh karena itu, jika menggunakan bean bisa saja beberapa listener tidak
     * terpanggil karena beannya belum dibuat. Supaya lebih aman, kita bisa
     * menambahkan listener ketika membuat SpringApplication
     */
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("Application Starting");

    }

}
