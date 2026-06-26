package com.vishal;


public class Employee {
	private int employeeId;
    private String employeeName;
    private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
	public static void main(String args[]) {
		
		Employee emp = new Employee();
		
		emp.setEmployeeId(1234);
		emp.setEmployeeName("Vishal");
		emp.setSalary(250000);
		
		System.out.println("--- Employee Details ---");
        System.out.println("Employee ID   : " + emp.getEmployeeId());
        System.out.println("Employee Name : " + emp.getEmployeeName());
        System.out.println("Salary        : $" + emp.getSalary());
	}
}