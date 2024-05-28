package com.spring.drools.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "customer")
public class Customer {
    private int id;
    private String name;
    private String username;
    private int phone;
    private String email;
    private String password;
    private String billingAddress;
    private String type;
    private String country;
    private boolean flagged;
    private int riskscore;


}