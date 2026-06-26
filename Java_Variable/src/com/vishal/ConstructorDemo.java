package com.vishal;

public class ConstructorDemo {
	
	ConstructorDemo() {
	    System.out.println("Hello I am Constructor");
	}
	ConstructorDemo(String name) {
	    System.out.println("Hello Constructor : " + name);
	}
	ConstructorDemo(int a) {
		System.out.println(a);
	}
    public static void main(String args[]) {
    	ConstructorDemo obj1 = new ConstructorDemo();
    	ConstructorDemo obj2 = new ConstructorDemo("vishal");
    	ConstructorDemo obj3 = new ConstructorDemo("409");
    }
}
