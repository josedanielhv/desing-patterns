package com.desingpatterns.creational.prototype;

public class Line {
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        Point startCopy = new Point(this.start.x, this.start.y);
        Point endCopy = new Point(this.end.x, this.end.y);
        return new Line(startCopy, endCopy);
    }

    @Override
    public String toString(){
        return "{start: " + start + ", end: " + end + "}";
    }
}
