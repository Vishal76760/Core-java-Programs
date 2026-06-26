package com.vishal;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("vishal");
		queue.add("Anil");
		queue.add("yash");
		
		System.out.println(queue);

	}

}
