package com.example.ROIIM.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//This class is stored in db.
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntity {
    @Id
    private String email;
    private String customerId;
    private String merchantCustomerId;

    public UserEntity()
    {
    }

    public UserEntity(String email, String customerId, String merchantCustomerId) {
        this.email = email;
        this.customerId = customerId;
        this.merchantCustomerId = merchantCustomerId;
    }

    public String getMerchantCustomerId() {
        return merchantCustomerId;
    }

    public void setMerchantCustomerId(String merchantCustomerId) {
        this.merchantCustomerId = merchantCustomerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
