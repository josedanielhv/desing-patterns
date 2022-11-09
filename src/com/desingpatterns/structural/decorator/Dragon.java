package com.desingpatterns.structural.decorator;

public class Dragon {
    private int age;
    private Lizard lizard;
    private Bird bird;

    public Dragon(){
        this.bird = new Bird();
        this.lizard = new Lizard();
    }

    public Dragon(Lizard lizard, Bird bird){
        this.lizard = lizard;
        this.bird = bird;
    }

    public void setAge(int age)
    {
        this.bird.age = age;
        this.lizard.age = age;
    }
    public String fly()
    {
        return this.bird.fly();
    }
    public String crawl()
    {
        return this.lizard.crawl();
    }
}
