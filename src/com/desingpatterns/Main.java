package com.desingpatterns;

import com.desingpatterns.solid.sr.BadCreditCard;
import com.desingpatterns.solid.sr.GoodCreditCard;
import com.desingpatterns.solid.sr.Operation;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Bad implementation SOLID-SR
        BadCreditCard badCreditCard = new BadCreditCard();
        badCreditCard.sendCreditCard(new Date());
        badCreditCard.cancelCreditCard(new Date());
        //Good implementation SOLID-SR
        GoodCreditCard goodCreditCard = new GoodCreditCard();
        Operation operation = new Operation();

        operation.sendCreditCard(goodCreditCard, new Date());
        operation.cancelCreditCard(goodCreditCard, new Date());

    }
}
