package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Transaction {
    private int id;
    private Double amount;
    private String customerId;
    private String customerBillingAddress;
    private String customercountry;
    private String customerType;
    private String merchantId;
    private String merchantcountry;
    private String merchantType;
    private Timestamp transactionDate;
    private String status;
    private String currency;
}
