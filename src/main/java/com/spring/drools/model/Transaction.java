package com.spring.drools.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "transaction")
public class Transaction {
    private int id;
    private Double amount;
    private String cardholderName;
    private String customerId;
    private String billingAddress;
    private String customercountry;
    private String customerType;
    private String merchantId;
    private String merchantcountry;
    private String country;
    private String merchantType;
    private Timestamp transactionDate;
    private String status;
    private String currency;
    private boolean flagged;
    private String individualRisk;
    private int riskscore;


    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public int getRiskScore() {
        return riskscore;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCardholderName(String cardholderName) {

    }

    public void setAmount(double amount) {

    }

    public void setIndividualRisk(String individualRisk) {

    }
}
