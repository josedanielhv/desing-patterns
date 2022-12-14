package com.desingpatterns.structural.bridge;

public class RasterSquare extends Square
{
    public RasterSquare(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String toString()
    {
        return String.format("Drawing %s as pixels", getName());
    }
}
