package com.company;

public class Square implements Area{
    private final float a;

    public Square(float a) {
        this.a = a;
    }

    @Override
    public float calculateArea() {
        return a*a;
    }
}
