package com.domain.belajarspringdasar.commandApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CommandApplication {

    /*
     * Dibuat folder/package sendiri karena SpringBootApplication akan
     * melakukan @ComponentScan pada seluruh component di package yang sama. jadi
     * usahakan @SpringBootApplication berada pada package yang sama dengan
     * Component yang ingin digunakan
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(CommandApplication.class, args);
    }
}
