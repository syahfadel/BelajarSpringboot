package com.domain.belajarspringdasar.service;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.repository.ProductRepository;

import lombok.Getter;

// @Scope annotation pada bean dapat dipakai
@Component
public class ProductService {

    /*
     * Bagaimana menambahkan parameter di @Component ?
     * ada beberapa cara yang pertama menggunakan cunstructor yang memiliki
     * parameter jika membutuhkan bean lain. Spring akan otomatis mencari bean
     * tersebut. Constructor-based Dependency Injection hanya mendukung satu
     * constructor.
     */
    @Getter
    private ProductRepository productRepository;

    // @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    /*
     * secara pintar spring akan membaca constructor membutuhkan parameter apa dan
     * mencari bean tersebut lalu diinjectkan
     */

    // // jika ingin membuat dua constructor menggunakan @Autowired pada constructor
    // //utama
    // public ProductService(ProductRepository productRepository, String name) {
    // this.productRepository = productRepository;
    // }
}
