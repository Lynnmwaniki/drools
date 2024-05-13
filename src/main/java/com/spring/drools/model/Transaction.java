package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private Long id;
    private Double amount;
    private String cardholderName;
    private String cardholderBillingAddress;
    private String cardholderIpAddress;
    private String merchantName;
    private String merchantLocation;
    private String merchantCategory;
}
