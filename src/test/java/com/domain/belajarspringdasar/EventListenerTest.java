package com.domain.belajarspringdasar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.domain.belajarspringdasar.listener.LoginAgainSuccessListener;
import com.domain.belajarspringdasar.listener.LoginSuccessListener;
import com.domain.belajarspringdasar.service.UserService;

public class EventListenerTest {

    @Configuration
    @Import({ UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class })
    public static class TestConfiguration {

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("fadel", "fadel");
        userService.login("fadel", "salah");
        userService.login("rudi", "salah");
    }
}
