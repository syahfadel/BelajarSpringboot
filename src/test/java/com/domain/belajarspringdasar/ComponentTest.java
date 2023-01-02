package com.domain.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domain.belajarspringdasar.repository.CategoryRepository;
import com.domain.belajarspringdasar.repository.CustomerRepository;
import com.domain.belajarspringdasar.repository.ProductRepository;
import com.domain.belajarspringdasar.service.CategoryService;
import com.domain.belajarspringdasar.service.CustomerService;
import com.domain.belajarspringdasar.service.ProductService;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testService() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        // namabean menjadi camelCase dari nama class
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);
        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDepedencyInjection() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }

    @Test
    void testSetterDepedencyInjection() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }

    @Test
    void testFieldDepedencyInjection() {
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        // CustomerRepository customerRepository =
        // applicationContext.getBean(CustomerRepository.class);

        // Assertions.assertSame(customerService.getCustomerRepository(),
        // customerRepository);

        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository",
                CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository",
                CustomerRepository.class);
        Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
        Assertions.assertSame(customerService.getPremiumCustomerRepository(), premiumCustomerRepository);
    }
}
