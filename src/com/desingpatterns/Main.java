package com.desingpatterns;

import com.desingpatterns.creational.builder.CodeBuilder;
import com.desingpatterns.creational.factory.Person;
import com.desingpatterns.creational.factory.PersonFactory;
import com.desingpatterns.creational.prototype.Line;
import com.desingpatterns.creational.prototype.Point;
import com.desingpatterns.singleton.Singleton;
import com.desingpatterns.singleton.SingletonTester;
import com.desingpatterns.solid.sr.BadCreditCard;
import com.desingpatterns.solid.sr.GoodCreditCard;
import com.desingpatterns.solid.sr.Operation;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Bad implementation SOLID-SR
        BadCreditCard badCreditCard = new BadCreditCard();
        badCreditCard.sendCreditCard(new Date());
        badCreditCard.cancelCreditCard(new Date());
        // Good implementation SOLID-SR
        GoodCreditCard goodCreditCard = new GoodCreditCard();
        Operation operation = new Operation();

        operation.sendCreditCard(goodCreditCard, new Date());
        operation.cancelCreditCard(goodCreditCard, new Date());

        // Creational
        // Builder
        CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
        System.out.println(cb);
        //Factory
        PersonFactory personFactory = new PersonFactory();
        Person p1 = personFactory.createPerson("Joe");
        Person p2 = personFactory.createPerson("Astrid");
        System.out.println(p1);
        System.out.println(p2);
        //Prototype
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,5);
        Line line = new Line(point1, point2);

        Line copiedLine = line.deepCopy();
        copiedLine.start.x = 0;
        copiedLine.end.y = 3;

        System.out.println(line);
        System.out.println(copiedLine);

        //Singleton
        System.out.println("Is " + PersonFactory.class.getSimpleName() + " Class a Singleton? : " + SingletonTester.isSingleton(
                    PersonFactory::new
        ));
        System.out.println("Is " + Singleton.class.getSimpleName() + " Class a Singleton? : " + SingletonTester.isSingleton(
                Singleton::getInstance
        ));

    }
}
