package org.example.composite;

import lombok.Getter;

import java.awt.*;

public class BaseShape implements Shape {
    @Getter
    protected int x;

    @Getter
    protected int y;

    private Color color;

    private boolean selected = false;

    public BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

    @Override
    public void select() {
        selected = true;
    }

    @Override
    public void unSelect() {
        selected = false;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    public void enableSelectionStyle(Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        Graphics2D graphics2D = (Graphics2D) graphics;
        float[] dash = {2.0f};
        graphics2D.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f,
                dash,
                0.0f
        ));
    }

    public void disableSelectionStyle(Graphics graphics) {
        graphics.setColor(color);
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke(new BasicStroke());
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
        } else {
            disableSelectionStyle(graphics);
        }
    }
}