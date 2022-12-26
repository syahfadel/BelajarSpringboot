package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
 * Saat membuat aplikasi tidak mungkin hanya satu configuration class.
 * Spring mendukung import configuration class dengan annotation @Import 
 * dengan value merupakan class dari configuration yang ingin dimport
 * 
 * cukup gunakan MainConfiguration pada applicationContext karena akan 
 * otomatis membaca FooConfiguration dan BarConfiguration dan dapat
 * getBean dari configuration yang diImport
 */

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
