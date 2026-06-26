package com.vishal;

import java.util.ArrayList;

public class TaskArrayList {

	public static void main(String[] args) {
		ArrayList<String> Cities = new ArrayList<String>();
		Cities.add("Mumbai");
		Cities.add("Pune");
		Cities.add("Nagpur");
		Cities.add("Satara");
		Cities.add("jaypur");
		System.out.println(Cities);
		System.out.println("Total no of Cities :" + Cities.size());
	}

}
