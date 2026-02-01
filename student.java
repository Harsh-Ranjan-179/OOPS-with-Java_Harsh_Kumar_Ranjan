package com.assessment1_2;

public class student {
    static int id;
    static int age;
    static String name;

    student() {
        id = 101;
        age = 18;
    }

    student(String s) {
        name = s;
    }

    static void display() {
        System.out.println("Student Id: " + id);
        System.out.println("Student Age: " + age);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        student s1 = new student("Harsh");
        student s2 = new student();

        student.display();
    }
}
