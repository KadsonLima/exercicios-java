package entities;

import enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract Double area();
}
