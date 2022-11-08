package com.desingpatterns.structural.bridge;

public class VectorSquare extends Square
{
    public VectorSquare(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String toString()
    {
        return String.format("Drawing %s as lines", getName());
    }
}