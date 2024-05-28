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
    @Setter
    private String billingAddress;
    private String customerCountry;
    private String customerType;
    private String merchantId;
    private String merchantNumber;
    private String merchantCountry;
    @Setter
    private String country;
    private String merchantType;
    private Timestamp transactionDate;
    private String status;
    private String currency;
    @Getter
    private boolean flagged;
    private String individualRisk;
    private int merchantFrequency;
    private int riskscore;


    public int getRiskScore() {
        return riskscore;
    }

    public void setCardholderName(String cardholderName) {

    }

    public void setAmount(double amount) {

    }

    public void setIndividualRisk(String individualRisk) {

    }

    public void setMerchantName(String merchantName) {
    }

    public void setSimilarNames(boolean cardholderName) {
    }
}
