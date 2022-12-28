package com.domain.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domain.belajarspringdasar.service.ProductService;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void test() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        // namabean menjadi camelCase dari nama class
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);
        Assertions.assertSame(productService1, productService2);
    }
}
