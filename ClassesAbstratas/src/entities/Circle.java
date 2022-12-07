package entities;

import enums.Color;

public final class Circle extends Shape {
    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }


    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area(){
        return radius * 3.14;
    }
}
