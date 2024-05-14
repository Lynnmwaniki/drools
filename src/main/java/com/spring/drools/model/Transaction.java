package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Transaction {
    private int transactionId;
    private Double amount;
    private String customerId;
    private String customerBillingAddress;
    private String customerIpAddress;
    private String customerType;
    private String merchantId;
    private String merchantLocation;
    private String merchantType;
    private Timestamp transactionDate;
    private String status;
    private String currency;
}
