package com.spring.drools.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private int id;
    private Double amount;
    private String cardholderName;
    private String customerId;
    private String billingAddress;
    private String customerType;
    private String merchantId;
    private String country;
    private String merchantType;
    private Date timestamp;
    private String status;
    private String currency;
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

    public boolean isFlagged(boolean flagged) {
        return flagged;
    }

    public void setMerchantFrequency(int merchantFrequency) {

    }

    public void setCountry(String country) {
    }

    public void setBillingAddress(String billingAddress) {
    }
}
