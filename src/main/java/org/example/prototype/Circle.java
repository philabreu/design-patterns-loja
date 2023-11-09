package org.example.prototype;


import static java.util.Objects.nonNull;

public class Circle extends Shape {
    public int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);

        if (nonNull(target)) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Circle) || (!super.equals(otherObject))) {
            return false;
        }

        Circle otherShape = (Circle) otherObject;
        return otherShape.radius == radius;
    }
}



















