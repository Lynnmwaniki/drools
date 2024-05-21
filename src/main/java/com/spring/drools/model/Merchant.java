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
    private int riskscore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRiskscore() {
        return riskscore;
    }

    public void setRiskscore(int riskscore) {
        this.riskscore = riskscore;
    }
}
