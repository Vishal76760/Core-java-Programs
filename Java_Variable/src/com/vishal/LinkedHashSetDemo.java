package com.vishal;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("aditya");
		names.add("rahul");
		names.add("rehan");
		names.add("aditya");
		names.add("rehan");
		System.out.println(names);
	}

}
