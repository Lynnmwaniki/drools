package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Merchant {
    private int merchantId;
    private String merchantName;
    private int phone;
    private String email;
    private String merchantLocation;
    private String merchantType;

}
