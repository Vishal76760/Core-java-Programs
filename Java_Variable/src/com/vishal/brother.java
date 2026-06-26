package com.vishal;

//Hierachal inheritance

class parent {
	public void house() {
		System.out.println("2bhk");
	}
}

class sister extends parent {
	
}

public class brother extends parent {
	
	public static void main(String args[]) {
		
		brother obj = new brother();
		obj.house();
		sister obj2 = new sister();
		obj2.house();
		
	}

}
