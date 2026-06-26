package com.vishal;

class Women {
	void work() {
		System.out.println("Women is working");
	
	}
	
}

class Teacher extends Women {
	void work() {
		System.out.println("Women is teaching !");
	}
}



public class PolymorphismDemo2 {
	public static void main(String args[]) {
		
		Women w = new Women();
		w.work();
	}

}
