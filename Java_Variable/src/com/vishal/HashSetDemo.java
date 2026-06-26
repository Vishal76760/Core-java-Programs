package com.vishal;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("aditya");
		names.add("rahul");
		names.add("rehan");
		names.add("aditya");
		names.add("rehan");
		System.out.println(names);
	}

}
