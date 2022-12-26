package com.domain.belajarspringdasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.belajarspringdasar.data.Connection;

@Configuration
public class LifeCycleConfiguration {

    /*
     * Spring container memiliki life cycle atau alur hidup. Kita dapat berinteraksi
     * dengan life cycle ini jika diinginkan. Kita dapat bereaksi saat bean telah
     * siap dibuat misal terkoneksi ke database saat bean selesai dibuat
     * dan kita dapat berinteraksi juga saat bean akan dihancurkan misal memutuskan
     * koneksi bean.
     * 
     * ada yang namanya life cycle callback, secara default bean tidak tahu alur
     * hidup spring. tapi kita bisa menambahkan callback dibean jika diinginkan.
     * dengan mengimplement dua buah interface yaitu InitializingBean,
     * DisposableBean. InitializingBean digunakan jika kita ingin berinteraksi saat
     * bean selesai dibuat dengan memanggil secara otomatis method
     * afterPropertiesSet(). DiposableBean jika kita ingin berinteraksi saat bean
     * akan dihancurkan atau akan di shutdown dengan implementaso method destroy()
     * yang akan dipanggil secara otomatis saat bean akan dihancurkan
     * 
     * registrasikan bean ke configuration, spring akan otomatis akan mendeteksi
     * bean mana yang terdapat initializingBean dan DisposableBean
     */
    @Bean
    public Connection connection() {
        return new Connection();
    }
}
