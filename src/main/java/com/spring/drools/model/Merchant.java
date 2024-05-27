package com.spring.drools.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "merchant")
public class Merchant {
    private int id;
    private String name;
    private String username;
    private int phone;
    private String email;
    private String password;
    private String country;
    private String type;
    private boolean flagged;
    private int riskscore;

    }
