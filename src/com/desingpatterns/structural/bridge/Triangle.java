package com.desingpatterns.structural.bridge;

public class Triangle extends Shape{

    public Triangle(Renderer renderer){
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
