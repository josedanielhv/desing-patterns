package com.desingpatterns.structural.adapter;

public class SquareToRectangleAdapter implements Rectangle {

    int width;
    int height;

    public SquareToRectangleAdapter(Square square)
    {
        width = height = square.side;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return "Rectangle: {width: " + width + ", height: " + height + "}";
    }

}
