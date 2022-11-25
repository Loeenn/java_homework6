package com.company;

public class Circle implements Area{
    private final float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float calculateArea() {
        return (float) (r*r*3.1415);
    }
}
