package com.vishal;

public class student {
	
	student() {
		System.out.println("Hello I am a student");
	}
	
	student(String name) {
		System.out.println("Hello :" + name);
	}
	
	student(int age) {
		System.out.println("Age :" + age);
	}
	
	public static void main(String args[]) {
		
		student obj1 = new student();
		student obj2 = new student("vishal");
		student obj3 = new student(20);
	}

}
