package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите номер фигуры:");
        System.out.println("""
                1.Прямоугольник
                2.Круг
                3.Квадрат""");
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите N: ");
        int N= sc.nextInt();
        Area[] figure=new Area[N];
        for (int i=0;i<N;i++) {
            int c = sc.nextInt();
            switch (c) {
                case 1 -> {
                    System.out.println("Введите первую сторону: ");
                    float a = sc.nextFloat();
                    System.out.println("Введите первую сторону: ");
                    float b = sc.nextFloat();
                    Rectangle rect = new Rectangle(a,b);
                    figure[i] = rect;
                    break;
                }
                case 2 -> {
                    System.out.println("Введите радиус: ");
                    float r = sc.nextFloat();
                    Circle circle = new Circle(r);
                    figure[i] = circle;
                    break;
                }
                default-> {
                    System.out.println("Введите сторону квадрата: ");
                    float kv = sc.nextFloat();
                    Square square = new Square(kv);
                    figure[i] = square;
                    break;
                }
            }
            System.out.println("Фигура записана.Введите следующую: ");
        }
    for(int i=0;i<N;i++){
        System.out.println(figure[i].calculateArea());
    }
    }

}