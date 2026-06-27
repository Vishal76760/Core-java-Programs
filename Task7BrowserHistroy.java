package com.vishal;

import java.util.Stack;

public class Task7BrowserHistroy {
	
	public static void main(String[] args) {
		
		Stack<String> history = new Stack<>();
		
		history.push("google.com");
        history.push("wikipedia.org");
        history.push("github.com");
        history.push("stackoverflow.com");
        
        System.out.println("Initial History: " + history);
        System.out.println("-----------------------------------");
        
        String currentPage = history.peek();
        System.out.println("Current Page (Peek): " + currentPage);

        String closedPage = history.pop();
        System.out.println("Hitting the 'Back' button...");
        System.out.println("Closed Page (Pop):   " + closedPage);
        System.out.println("-----------------------------------");

        System.out.println("Remaining History:   " + history);
                
		
	}
	

}
