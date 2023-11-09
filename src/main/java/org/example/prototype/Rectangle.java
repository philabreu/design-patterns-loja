package org.example.prototype;


import static java.util.Objects.nonNull;

public class Rectangle extends Shape {
    public int width;

    public int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle target) {
        super(target);
        if (nonNull(target)) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Rectangle) || (!super.equals(otherObject))) {
            return false;
        }

        Rectangle otherShape = (Rectangle) otherObject;
        return otherShape.width == width && otherShape.height == height;
    }
}