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
    private String merchantName;
    private String country;
    private String merchantType;
    private Date timestamp;
    private String status;
    private String currency;
    private boolean flagged;
    private String individualRisk;
    private int merchantFrequency;
    private boolean similarNames;
    private boolean exceedsCardholderAverage;
    private int riskScore;

    public Transaction(String johnDoe, double v, Object o, Object o1, Object o2, int i, boolean b) {
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public boolean isExceedsCardholderAverage() {
        return exceedsCardholderAverage;
    }

    public void setExceedsCardholderAverage(boolean exceedsCardholderAverage) {
        this.exceedsCardholderAverage = exceedsCardholderAverage;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public String getIndividualRisk() {
        return individualRisk;
    }

    public void setIndividualRisk(String individualRisk) {
        this.individualRisk = individualRisk;
    }

    public int getMerchantFrequency() {
        return merchantFrequency;
    }

    public void setMerchantFrequency(int merchantFrequency) {
        this.merchantFrequency = merchantFrequency;
    }

    public boolean isSimilarNames() {
        return similarNames;
    }

    public void setSimilarNames(boolean similarNames) {
        this.similarNames = similarNames;
    }

    public int getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(int riskScore) {
        this.riskScore = riskScore;
    }

    //    public void setCardholderName(String cardholderName) {
//
//    }
//
//    public void setAmount(double amount) {
//
//    }
//
//    public void setIndividualRisk(String individualRisk) {
//
//    }
//
//    public void setMerchantName(String merchantName) {
//    }
//
//    public void setSimilarNames(boolean cardholderName) {
//    }
//
//    public boolean isFlagged(boolean flagged) {
//        return flagged;
//    }
//
//    public void setMerchantFrequency(int merchantFrequency) {
//
//    }
//
//    public void setCountry(String country) {
//    }
//
//    public void setBillingAddress(String billingAddress) {
//    }
//
//    public Date getTimestamp(Date timestamp) {
//    }
//
//    public String getCardholderName(String cardholderName) {
//    }
//
//    public void setTimestamp(Date date) {
//    }
//
//    public String getCardholderName() {
//    }
}
