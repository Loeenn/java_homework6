package com.company;

public class Rectangle implements Area {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float calculateArea() {
        return a*b;
    }
}
