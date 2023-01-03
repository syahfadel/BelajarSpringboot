package com.domain.belajarspringdasar.service;

import org.springframework.stereotype.Component;

@Component
public class MerchantServiceImpl implements MerchantService {
    /*
     * saat mengakses bean dapat dengan menyebutkan tipe bean tersebut atau bisa
     * juga dengan parent class/ parent interface. Misal interface MerchantService
     * dengan bean class implementasinya dengan nama MerchantServiceImpl, maka untuk
     * mengkases beannya kita bisa menggunakan tipe MerchantServiceImpl namun bisa
     * juga parentnya yaitu MerchantService. Ini banyak digunakan saat membuat
     * membuat aplikasi, biasanya membuat interfacee dulu lalu implementasi,
     * biasanya yang diregistrasikan ke dalam spring class implementasinya tapi saat
     * mengakses bean menggunakan servicenya. namun harus berhati hati jika banyak
     * turunan karena berpotensi error duplikat.
     *
     * kegunaannya suatu saat kita ingin mengganti implementasinya kita cukup
     * mengubah class imlementasi, tanpa mengubah depedency yang menggunakan
     * interfacenya
     */
}
