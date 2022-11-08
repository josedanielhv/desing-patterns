package com.desingpatterns.structural.bridge;

public class Square extends Shape {
    @Override
    public String getName()
    {
        return "Square";
    }
    public Square(Renderer renderer){
        super(renderer);
    }
}
