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
    private int riskscore;

    public Transaction(int id, Double amount, String customerId, String customerBillingAddress, String customercountry, String customerType, String merchantId, String merchantcountry, String merchantType, Timestamp transactionDate, String status, String currency, int riskscore) {
        this.id = id;
        this.amount = amount;
        this.customerId = customerId;
        this.customerBillingAddress = customerBillingAddress;
        this.customercountry = customercountry;
        this.customerType = customerType;
        this.merchantId = merchantId;
        this.merchantcountry = merchantcountry;
        this.merchantType = merchantType;
        this.transactionDate = transactionDate;
        this.status = status;
        this.currency = currency;
        this.riskscore = riskscore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerBillingAddress() {
        return customerBillingAddress;
    }

    public void setCustomerBillingAddress(String customerBillingAddress) {
        this.customerBillingAddress = customerBillingAddress;
    }

    public String getCustomercountry() {
        return customercountry;
    }

    public void setCustomercountry(String customercountry) {
        this.customercountry = customercountry;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantcountry() {
        return merchantcountry;
    }

    public void setMerchantcountry(String merchantcountry) {
        this.merchantcountry = merchantcountry;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getRiskscore() {
        return riskscore;
    }

    public void setRiskscore(int riskscore) {
        this.riskscore = riskscore;
    }
}
