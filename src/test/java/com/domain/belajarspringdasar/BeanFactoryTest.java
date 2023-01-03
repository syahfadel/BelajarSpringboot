package com.domain.belajarspringdasar;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domain.belajarspringdasar.data.Foo;

public class BeanFactoryTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactory() {

        /*
         * applicationContext merupakan interface turunan dari Interface BeanFActory
         * yang merupakan kontrak unt manajemen data bean di dalam spring. getBean
         * merupakan kontrak dari beanFactory bukan applicationcontext.
         * 
         * Selain BeanFactory terdapat juga yang namanya Listable Bean Factory.
         * BeanFActory hanya satu bean yang berarti jika terdapat bean dengan tipe yang
         * sama kita harus menyebutkan satu per satu nama beannya atau menggunakan
         * objectProvider. ListableBeanFactory merupakan turunan dari beanFactory yang
         * memungkinkan mengakses beberapa bean sekaligus. Sangat berguna seperti saat
         * kita ingin mendapatkan beberapa bean dengan tipe tertentu
         */

        ObjectProvider<Foo> fooObjectProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> fooList = fooObjectProvider.stream().collect(Collectors.toList());

        System.out.println(fooList);

        Map<String, Foo> beans = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beans);
    }
}
