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
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    // materi ordered
    @Override
    public int getOrder() {
        return 2;
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
        log.info("Prefix Id Generator Processor for bean {}", beanName);
        if (bean instanceof IdAware) { // mengecek apakah bean merupakan turunan dari IdAware
            log.info("Prefix set Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("PZN-" + idAware.getId());
        }

        return bean;
    }

}
