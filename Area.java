package com.assessment1_2;

public class Area {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Area obj = new Area();

        System.out.println("Area of Circle: " + obj.area(7));
        System.out.println("Area of Rectangle: " + obj.area(5, 4));
        System.out.println("Area of Triangle: " + obj.area(6, 8, true));
    }
}
