package com.domain.belajarspringdasar.data;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class MultiFoo {
    /*
     * Selain java.util.optional dapat juga menggunakan ObjectProvider<T>. namun
     * saat ini pada umumnya menggunakan java.util.optional. kelebihan
     * ObjectProvider saat bean lebih dari satu semua bean dapat diambil, sedangkan
     * optional tidak bisa.
     */
    @Getter
    private List<Foo> foos;

    public MultiFoo(ObjectProvider<Foo> objectProvider) {
        foos = objectProvider.stream().collect(Collectors.toList());
    }
}
