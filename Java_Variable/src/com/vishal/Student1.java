package com.vishal;

class Person {
}

public class Student1 extends Person {

    Student1(String name, String course) {
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
    }

    public static void main(String args[]) {

        Student1 obj = new Student1("Vishal", "Java");

    }
}