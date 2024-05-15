package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Merchant {
    private int id;
    private String name;
    private String username;
    private int phone;
    private String email;
    private String password;
    private String country;
    private String type;

}
