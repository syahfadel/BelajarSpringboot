package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;

import com.domain.belajarspringdasar.data.cyclic.CyclicA;
import com.domain.belajarspringdasar.data.cyclic.CyclicB;
import com.domain.belajarspringdasar.data.cyclic.CyclicC;

public class CyclicConfiguration {

    /*
     * Hati-hati saat membuat DI karena memungkinan terjadinya Circular Depedencies
     * Circular Depedencies terjadi saat objekA membutuhkan objekB, Objek B butuh
     * ObjekC, dan ObjekC butuh Objek A. sehingga akan terbentuk lingkaran dan error
     * akan terjadi. Error terjadi karena Tidak ada objek yang dapat dibuat karena
     * saling bergantung satu sama lain
     */
    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
