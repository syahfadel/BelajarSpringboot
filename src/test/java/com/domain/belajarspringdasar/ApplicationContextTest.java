package com.domain.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContext() {
        // application context merupakan interface representasi container IoC di spring
        // framework
        // terbagi menjadi dua yaitu xml dan annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // System.out.println(context);
        Assertions.assertNotNull(context);
    }
}
