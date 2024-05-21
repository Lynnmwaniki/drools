package com.spring.drools.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RiskScore {
    private int score;
    private String action; //Approved, Rejected, Review

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
