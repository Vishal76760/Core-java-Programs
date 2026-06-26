package com.vishal;

// multilevel inheritance
class grandfather {
	public void plot() {
		System.out.println("3cr");
	}
}

class father extends grandfather {
	public void car() {
		System.out.println("skoda");
	}
}

public class son extends father {
	
	public static void main(String args[]) {
		
		son vishal = new son();
		vishal.plot();
		vishal.car();
		
	}

}
