package com.vishal;
import java.util.HashMap;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		names.put(101, "Aditya");
		names.put(102, "arjun");
		names.put(103, "rahul");
		names.put(104, "Aditya");
		names.put(105, "Vaibhav");
		System.out.println(names);
	}

}
