package org.example;

import org.example.prototype.Circle;
import org.example.prototype.Rectangle;
import org.example.prototype.Shape;

import java.util.ArrayList;
import java.util.List;

public class DemoPrototype {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int index = 0; index < shapes.size(); index++) {
            if (shapes.get(index) != shapesCopy.get(index)) {
                System.out.println(index + ": Shapes são de objetos diferentes (yeah!)");
                if (shapes.get(index).equals(shapesCopy.get(index))) {
                    System.out.println(index + ": e eles sao identicos (yeah!)");
                } else {
                    System.out.println(index + ": mas eles não são identicos (droga!)");
                }
            } else {
                System.out.println(index + ": Shapes são do mesmo objeto (droga!)");
            }
        }
    }
}