package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private int customerId;
    private String customerName;
    private int phone;
    private String email;
    private String billingAddress;
    private String customerType;
    private String country;


}
