package com.desingpatterns;

import com.desingpatterns.creational.builder.CodeBuilder;
import com.desingpatterns.creational.factory.Person;
import com.desingpatterns.creational.factory.PersonFactory;
import com.desingpatterns.creational.prototype.Line;
import com.desingpatterns.creational.prototype.Point;
import com.desingpatterns.creational.singleton.Singleton;
import com.desingpatterns.creational.singleton.SingletonTester;
import com.desingpatterns.solid.sr.BadCreditCard;
import com.desingpatterns.solid.sr.GoodCreditCard;
import com.desingpatterns.solid.sr.Operation;
import com.desingpatterns.structural.adapter.Rectangle;
import com.desingpatterns.structural.adapter.Square;
import com.desingpatterns.structural.adapter.SquareToRectangleAdapter;
import com.desingpatterns.structural.bridge.RasterRenderer;
import com.desingpatterns.structural.composite.MyList;
import com.desingpatterns.structural.composite.SingleValue;
import com.desingpatterns.structural.decorator.Dragon;
import com.desingpatterns.structural.flyweight.Sentence;
import com.desingpatterns.structural.proxy.ResponsiblePerson;

import java.util.Arrays;
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

        //Structural
        //Adapter
        Square square = new Square(5);
        Rectangle squareToRectangle = new SquareToRectangleAdapter(square);
        System.out.println(squareToRectangle.toString());

        //Bridge
        System.out.println(new com.desingpatterns.structural.bridge.Square(new RasterRenderer()).toString());

        //Composite
        SingleValue integers = new SingleValue(2);
        SingleValue integers1 = new SingleValue(3);
        MyList valueContainers = new MyList(Arrays.asList(integers, integers1));
        System.out.println("My sum is: " + valueContainers.sum());

        //Decorator
        Dragon dragon = new Dragon();
        System.out.println(dragon.crawl());
        System.out.println(dragon.fly());

        //Flyweight
        Sentence sentence = new Sentence("alpha beta gamma[]");
        sentence.getWord(1).capitalize = true;
        System.out.println(sentence); // writes "hello WORLD"

        //Proxy
        com.desingpatterns.structural.proxy.Person person = new com.desingpatterns.structural.proxy.Person(22);
        System.out.println(person.drink());
        System.out.println(person.drive());
        System.out.println(person.drinkAndDrive());

        ResponsiblePerson responsiblePerson = new ResponsiblePerson(new com.desingpatterns.structural.proxy.Person(15));
        System.out.println(responsiblePerson.drink());
        System.out.println(responsiblePerson.drive());
        System.out.println(responsiblePerson.drinkAndDrive());

        responsiblePerson.setAge(22);
        System.out.println(responsiblePerson.drink());
        System.out.println(responsiblePerson.drive());
        System.out.println(responsiblePerson.drinkAndDrive());

    }
}
