package com.domain.belajarspringdasar.data;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    // akan dieksekusi ketika bean sudah siap
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Conncection is ready to be used");
    }

    // akan dieksekusi ketiak bean akan dihancurkan
    @Override
    public void destroy() throws Exception {
        log.info("Connection is closed");
    }
}
