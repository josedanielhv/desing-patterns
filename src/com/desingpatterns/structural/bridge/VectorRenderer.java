package com.desingpatterns.structural.bridge;

public class VectorRenderer implements Renderer
{
    @Override
    public String whatToRenderAs()
    {
        return "lines";
    }
}
