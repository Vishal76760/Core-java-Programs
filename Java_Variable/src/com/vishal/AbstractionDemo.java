package com.vishal;

abstract class ATM {
	abstract void widraw();
}

class HDFC extends ATM {
	void widraw() {
		System.out.println("Money widraw Successfully");
	}
}
public class AbstractionDemo {
	
	public static void main(String args[]) {
		ATM m = new HDFC();
		m.widraw();
	}

}
