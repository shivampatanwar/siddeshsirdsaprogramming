package webhistory;

import java.util.Iterator;
import java.util.Stack;

public class WebHistory {

	private Stack<String> backward;
	private Stack<String> forward;
	private String currentPage;

	public WebHistory() {
		backward = new Stack<String>();
		forward = new Stack<String>();
		currentPage = "Home Page";
	}

	public void addPage(String page) {
		backward.push(currentPage);
		currentPage = page;
		forward.clear();
	}

	

	public void previousPage() {
		
		if(!backward.isEmpty()) {
			forward.push(currentPage);
			currentPage=backward.pop();		
			System.out.println("This is previous Page : " + currentPage);
			
		}else {
			System.out.println("You Reached Home Page");
		}

	}

	public void nextPage() {
		
		if(!forward.isEmpty()) {
			backward.push(currentPage);
			currentPage=forward.pop();		
			System.out.println("This is next Page : " + currentPage);
			
		}else {
			System.out.println("You Reached Last Page");
		}

	}
	
//	
//	public String getCurrentPage() {
//		return currentPage;
//	}
	
	public void getCurrentPage() {
		System.out.println("Current Page : " + currentPage);
	}
	
	public void delete() {
		backward=null;
		forward=null;
		currentPage="Home Page";
		System.out.println("History Deleted");
		
	}

}
