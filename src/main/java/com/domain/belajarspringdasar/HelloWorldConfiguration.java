package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Configuration;

/*
Ioc merupakan prinsip pada perangkat lunak, dimana kita melakukan pemindahan kontrol untuk objek atau program
ke sebuah container di framework

Dalam IoC seluruh pekerjaan seperti mengeksekusi program, memanggil function, dsb
IoC memiliki kontrol untuk mengeksekusi program,  managemen objek dan melakukan abstaction

Spring dapat dibilang framework IoC, Application Context merupakan container dari spring IoC

sehingga kode seperti main class dll diserahkan kepada spring, sehingga programmer memiliki cara kerja yang sama

saat ingin membuat application context yang pertama harus dibuat yaitu configuration dengan annotation @Configuration 
pada awal class
Lanjut ke ApplicationContextTest.java
*/

@Configuration
public class HelloWorldConfiguration {

}
