package com.desingpatterns.solid.sr;

import java.util.Date;

public class Operation{
    public void sendCreditCard(GoodCreditCard creditCard, Date expirationDate){
        creditCard.setExpirationDate(expirationDate);
        System.out.println("Whatever steps to send good credit card with expiration date " + expirationDate);

    }
    public void cancelCreditCard(GoodCreditCard creditCard, Date cancelationDate){
        creditCard.setExpirationDate(cancelationDate);
        System.out.println("Whatever steps to good cancel with expiration date " + cancelationDate);

    }
}