package com.domain.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.domain.belajarspringdasar.application.FooApplication;
import com.domain.belajarspringdasar.data.Foo;

@SpringBootTest(classes = { FooApplication.class })
public class FooApplicationTest {

    // tidak perlu mengambil bean secara manual dapat secara langsung
    @Autowired
    Foo foo;

    @Test
    void testSpringBoot() {
        Assertions.assertNotNull(foo);
    }
}
