package org.example;

import java.sql.SQLOutput;

public class Rectangle extends Shape {
    private float length;
    private float width;

    protected Rectangle(String id, String color, float length, float width) {
        super(id, color);
        this.length = length;
        this.width = width;
    }

    protected Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.length = rectangle.getLength();
        this.width = rectangle.getWidth();
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public String draw() {
        return "A Rectangle having a width of " + width + " and length of " + length + " in " + this.getColor() + " color..." ;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return draw();
    }
}
