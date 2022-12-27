package com.domain.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.domain.belajarspringdasar.configuration"
}) // bisa lebih dari satu cukup tambah koma
public class ScanConfiguration {
    /*
     * Import akan tidak efektif jika banyak configuration yang harus di import
     * untuk menangani hal tesebut terdapat annotation @ComponentScan yang akan
     * secara otomatis mengimport seluruh file dengan annotation @Configuration pada
     * basePackages
     */
}
