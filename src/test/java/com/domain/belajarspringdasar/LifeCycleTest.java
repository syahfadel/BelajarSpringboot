package com.domain.belajarspringdasar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domain.belajarspringdasar.data.Connection;
import com.domain.belajarspringdasar.data.Server;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext; // supaya dapat mematikan application secara manual
                                                               // menggunakan close

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testConnection() {
        applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        applicationContext.getBean(Server.class);
    }
}
