package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ShapeCache {

    private Map<String,Shape> shapeMap = new HashMap<>();

    public ShapeCache() {
        shapeMap.put("circle_red_7", new Circle("1", "red", 7));
        shapeMap.put("rectangle_blue_10_6", new Rectangle("2", "blue", 10,6));
    }

    public Shape getShape(String key) {
        return (Shape) shapeMap.get(key).clone();
    }

    public void put(List<Shape> shapes) {
        shapeMap.forEach(new BiConsumer<String, Shape>() {
            @Override
            public void accept(String s, Shape shape) {
                shapeMap.put(s, shape);
            }
        });
    }
}
