package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
public class RiskScore {
    private int score;
    private String action; //Approved, Rejected, Review

    public RiskScore(int score, String action) {
        this.score = score;
        this.action = action;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
