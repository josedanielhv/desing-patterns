package com.desingpatterns.solid.sr;

import java.util.Date;

public class BadCreditCard{
    private String name;
    private String accountNumber;
    private Date expirationDate;
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void sendCreditCard(Date expirationDate){
        this.expirationDate = expirationDate;
        System.out.println("Whatever steps to send credit card with expiration date " + expirationDate);
    }

    public void cancelCreditCard(Date cancelationDate){
        this.expirationDate = cancelationDate;
        System.out.println("Whatever steps to cancel with expiration date " + cancelationDate);
    }

}
