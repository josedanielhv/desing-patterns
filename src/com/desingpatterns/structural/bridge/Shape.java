package com.desingpatterns.structural.bridge;

abstract class Shape
{
    protected Renderer renderer;// Este es el bridge!!!!
    public Shape(Renderer renderer){
        this.renderer = renderer;
    }
    public abstract String getName();

    @Override
    public String toString()
    {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }
}
