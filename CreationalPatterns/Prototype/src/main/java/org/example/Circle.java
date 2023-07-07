package org.example;

public class Circle extends Shape {

    private float radius;
    public Circle(String id, String color, float radius) {
        super(id, color);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.getRadius();
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public String draw() {
        return "A circle with the radius of " + radius + " in " + this.getColor() + " color...";
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return draw();
    }
}
