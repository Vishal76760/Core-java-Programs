package com.vishal;

import java.util.Vector;

public class Task6EmployeeNames {
	public static void main(String[] args) {
		Vector<String> employees = new Vector<String>();
		
		employees.add("Aarav");
        employees.add("Priya");
        employees.add("Rohan");
        employees.add("Meera");
        employees.add("Kabir");

        System.out.println("Current Employees: " + employees);

        String searchName = "Meera";
        boolean doesExist = employees.contains(searchName);

        System.out.println("--- Search Results ---");
        if (doesExist) {
            System.out.println("Result: Yes, " + searchName + " exists in the Vector.");
        } else {
            System.out.println("Result: No, " + searchName + " was not found.");
        }
        
        String missingName = "Sanjay";
        if (employees.contains(missingName)) {
            System.out.println("Result: Yes, " + missingName + " exists in the Vector.");
        } else {
            System.out.println("Result: No, " + missingName + " was not found.");
        }
	}

}
