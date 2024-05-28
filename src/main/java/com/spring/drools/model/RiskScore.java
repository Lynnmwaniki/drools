package com.spring.drools.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "riskscore")
public class RiskScore {
    @Getter
    private int score;
    private String action; //Approved, Rejected, Review


}
