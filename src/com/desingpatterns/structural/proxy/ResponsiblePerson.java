package com.desingpatterns.structural.proxy;

public class ResponsiblePerson{

    private Person person;

    public ResponsiblePerson(Person person) {
        this.person = person;
    }

    public String drink() {
        if (person.getAge() < 18) {
            return "too young";
        }
        return "drinking";
    }
    public String drive() {
        if (person.getAge() < 16) {
            return "too young";
        }
      return "driving";
    }
    public String drinkAndDrive() {
        return "dead";
    }
    public void setAge(int age)
    {
        this.person.setAge(age);
    }

}
