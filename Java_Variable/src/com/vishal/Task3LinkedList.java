package com.vishal;

import java.util.LinkedList;

public class Task3LinkedList {
	
	public static void main(String args[]) {
		LinkedList<String> trainStation = new LinkedList<String>();
		trainStation.add("pune");
		trainStation.add("mumbai");
		trainStation.add("nagpur");
		trainStation.add("satara");
		trainStation.add("sangli");
		
		System.out.println("TrainStations :" + trainStation);
		
		trainStation.remove("pune");
		
		System.out.println("Updated TrainStations :" + trainStation);
	}

}
