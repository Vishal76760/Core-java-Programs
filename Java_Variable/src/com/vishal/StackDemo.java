package com.vishal;

import java.util.Stack;

public class StackDemo {

    public static void main(String args[]) {

        Stack<String> books = new Stack<>();

        // Add books
        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println("Books in Stack: " + books);

        // Top book
        System.out.println("Top Book: " + books.peek());

        // Remove books
        System.out.println("Removed Book: " + books.pop());
        System.out.println("Removed Book: " + books.pop());

        System.out.println("Remaining Books: " + books);
    }
}