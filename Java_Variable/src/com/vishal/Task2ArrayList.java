package com.vishal;

import java.util.ArrayList;

public class Task2ArrayList {
	public static void main(String[] args) {
		ArrayList<String> marks = new ArrayList<String>();
		marks.add("78");
		marks.add("90");
		marks.add("95");
		marks.add("86");
		marks.add("88");
		System.out.println("Marks :" + marks);
		
		marks.set(2, "92");
		
		System.out.println("Updated Marks :" + marks);
	}
}
