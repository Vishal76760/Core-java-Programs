package com.vishal;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> names = new LinkedHashMap<Integer, String>();
		names.put(101, "Aditya");
		names.put(102, "arjun");
		names.put(103, "rahul");
		names.put(104, "Aditya");
		names.put(105, "Vaibhav");
		System.out.println(names);
	}

}
