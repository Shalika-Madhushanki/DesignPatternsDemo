package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("PROTOTYPE DESIGN PATTERN DEMO.!");
        List<Shape> shapeList = List.of(
                new Rectangle("rectangle_white_12_2", "white", 12, 2),
                new Circle("circle_green_2.1", "green", 2.1f));

        List<Shape> copiedShapeList = new ArrayList<>();
        for (Shape shape : shapeList) {
            copiedShapeList.add((Shape) shape.clone());
        }

        copiedShapeList.forEach(System.out::println);
        ShapeCache registry = new ShapeCache();
        registry.put(shapeList);
        System.out.println(registry.getShape("circle_red_7"));
        System.out.println(registry.getShape("rectangle_blue_10_6"));


    }
}