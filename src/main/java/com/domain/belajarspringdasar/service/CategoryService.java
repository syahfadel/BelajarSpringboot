package com.domain.belajarspringdasar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.repository.CategoryRepository;

import lombok.Getter;

@Component
public class CategoryService {

    /*
     * Depedency injection dapat dilakukan dengan menggunakan setter seperti yang
     * ditunjukan pada line 19 dst. Namun pada awalan setter harus diawali dengan
     * annotation @Autowired.
     */
    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
