package org.example;

public abstract class Shape {
    private String id;

    private String color;

    protected Shape(String id, String color) {
        this.id = id;
        this.color = color;
    }

    protected Shape(Shape shape) {
        this.id = shape.getId();
        this.color = shape.getColor();
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public abstract String draw();

    public abstract Object clone();


}
