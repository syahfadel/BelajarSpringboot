package com.domain.belajarspringdasar.client;

import lombok.Data;

@Data
public class PaymentGatewayClient {
    /*
     * Class ini dianggap class dari third party
     */
    private String endpoint;

    private String privateKey;

    private String PublicKey;
}
