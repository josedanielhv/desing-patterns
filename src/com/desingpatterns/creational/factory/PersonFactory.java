package com.desingpatterns.creational.factory;

public class PersonFactory {
    int id;
    public Person createPerson(String name)
    {
        return new Person(id++, name);
    }
}
