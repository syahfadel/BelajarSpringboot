package com.domain.belajarspringdasar.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.client.PaymentGatewayClient;

@Component("paymentGatewayClient") // untuk mengganti nama dari PaymentGatewayClientFactoryBean
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
    /*
     * Terkadang ada kasus sebuah class bbukan milik kita (milik library atau
     * framework) sehingg sulit menggunakan component karena kita tidak dapat
     * menambahkan annotation di dalam class tersebut karena bukan milik kita. pada
     * kasus ini, cara terbaik menggunakan @Bean. untungnya, pada spring terdapat
     * fitur FactoryBean untuk membuat class wraper untuk class bean lainnya
     * menggunakan @Component. syaratnya membuat class yang meng implement
     * factoryBean.
     * 
     * Objek yang dibuat nanti diambil dari getObject
     */

    // Depedency injection dapat ditambahkan disini seperti constructor, setter,
    // dll;

    // Dipanggil untuk pembuatan objek
    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://example.com");
        client.setPrivateKey("private");
        client.setPublicKey("public");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
