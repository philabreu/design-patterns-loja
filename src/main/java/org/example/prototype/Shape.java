package org.example.prototype;


import java.util.Objects;

import static java.util.Objects.*;

public abstract class Shape {
    public int x;

    public int y;

    public String color;

    public Shape() {

    }

    public Shape(Shape target) {
        if (nonNull(target)) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Shape otherShape)) {
            return false;
        }

        return otherShape.x == x
                && otherShape.y == y
                && Objects.equals(otherShape.color, color);
    }
}