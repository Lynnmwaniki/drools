package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RiskScore {
    private int score;
    private String action; //Approved, Rejected, Review
}
