package com.domain.belajarspringdasar.processor;

import java.util.UUID;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.aware.IdAware;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    // materi ordered
    /*
     * kita bisa membuat lebih dari satu BeanPostProcessor tidak ada batas. tapi
     * terkadang ada kasus kita ingin membuat beanpostprocessor secara berurutan.
     * namun, spring tidak menjamin urutan eksekusinya. supaya kita bisa
     * mengurutkannya kita harus menggunakan interface dengan nama ordered dari
     * angka yang paling kecil ke paling besar. Angka ini merupakan angka yang di
     * return pada getOrder()
     */
    @Override
    public int getOrder() {
        return 1;
    }

    // materi Bean Post Processor
    /*
     * Bean Post Processor merupakan interface yg dapat digunakan untuk
     * memdofifikasi proses pembuatan bean di application context. Mirip seperti
     * middleware.filter di web. Setelah objek dibuat dapat melakukan postProcessor
     * atau memproses objek beannya (seperti akan melakukan apa dahulu sebelum
     * beannya siap). Diakses sebelum beannya di initialize dan sesudah bean di
     * initialize. karena sangat fleksibel bahkan bisa untuk memodifikasi hasil
     * objek beannya.
     * 
     * terdapat dua method yaitu postProcessAfterInitialization ( setelah semua data
     * depdency di set) dan
     * postProcessBeforeInitialization (sebelum objek diset) bisa jadi depedency
     * belum diset atau data belum selesai dibuat.
     */

    // akan dilakukan pada semua bean
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor for bean {}", beanName);
        if (bean instanceof IdAware) { // mengecek apakah bean merupakan turunan dari IdAware
            log.info("set Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }

}
