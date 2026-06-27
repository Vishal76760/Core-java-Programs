package com.vishal;

import java.util.Vector;

public class Task5Movies {
	public static void main(String[] args) {
		Vector<String> Movie = new Vector<String>();
		
		Movie.add("Avenger");
		Movie.add("War");
		Movie.add("Kangana");
		Movie.add("Krish");
		Movie.add("Peddi");
		
		System.out.println("Original Movies :" + Movie);
		
		Movie.set(1, "Dhoom");
		
		System.out.println("After repalce Movies :" + Movie);
	}

}
