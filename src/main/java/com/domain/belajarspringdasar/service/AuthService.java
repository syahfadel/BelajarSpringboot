package com.domain.belajarspringdasar.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class AuthService implements ApplicationContextAware, BeanNameAware {

    /*
     * Spring memiliki interface yang namanya Aware yang merupakan super Interface
     * yang digunakan untuk semua Aware interface. Untuk penanda spring melakukan
     * injection object yang kita perlukan. mirip seperti pada IdAware diinjet
     * menggunakan IdGenerator Bean Post Processor. ini sama, namun fitur nya spring
     * yang akan melakukan inject jadi tidak perlu membuat Bean Post Processor
     * secara manual.
     * 
     * Aware hanya interface kosong yang tidak memiliki method. hanya sebagai super
     * interface dari aware yang lain(turunannya).
     * 
     * Beberapa Contoh daftar aware:
     * ApplicationContextAware untuk mendapatkan applicationContext dari bean
     * BeanFactoryAware untuk mendapatkan Bean Factory
     * BeanNameAwarae untuk mendapatkan nama bean
     * dll
     * 
     * misal pada BeanNameAware akan otomatis ada method setBeanName untuk mengambil
     * nama bean
     */
    @Getter
    private String beanName;

    @Getter
    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
