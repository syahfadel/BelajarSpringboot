package com.domain.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
                "com.domain.belajarspringdasar.service",
                "com.domain.belajarspringdasar.repository"
}) // otomatis saat spring menemukan @Configuration(dibaca sebagai configuration
   // baru) atau @Component (dibaca sebagai bean baru) akan otomatis baca
public class ComponentConfiguration {
        /*
         * Spring menyediakan cara otomatis sehingga tidak perlu membuat method
         * dengan @Bean. Kita dapat menandai class dengan annotation @Componenet
         * sehingga string akan membaca otomatis jika ada class dengan @Component akan
         * dibuat untuk class tersebut. hanya mendukung untuk membuat 1 bean saja. jika
         * ingin membuat bean dengan tipe yang sama harus menggunakan @Bean
         * 
         * Saat menggunakan @Component nama bean akan otomatis dibuat oleh spring, jika
         * pakai @ComponentScan maka nama bean akan sesuai dengan nama class namun
         * menjadi camelCase, misal CategoryService menjadi categoryService.
         * Kalau pakai @Import otomatis nama class akan menjadi
         * NamaClass.class.getname(). Jika ingin mengubah nama pada komponen dapat
         * menggunakan @Component(value="namaBean"), Semua annotation pada bean dapat
         * dipakai di component seperti Scope, Lazy dll
         * 
         * Membuat component pada file ProductService.java
         */
}
