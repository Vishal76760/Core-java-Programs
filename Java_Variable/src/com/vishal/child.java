package com.vishal;

//single inheritance
class Dad{
	public void car() {
		System.out.println("BMW");
	}
}
public class child extends Dad {
	
	public static void main(String args[]) {
		child anil = new child();
		anil.car();
	}

}
