package browserforback;

import java.util.Stack;

public class WebHistory {
	
	private Stack<String> backwardStack;
	private Stack<String> forwardStack;
	private String currentPage;
	
	
	public WebHistory() {
		
		forwardStack = new Stack<String>();
		backwardStack = new Stack<String>();
		currentPage = "Home Page";
		
	}
	
	public String getCurrentPage() {
		return currentPage;
	}
	
	public void visitUrl(String url) {
		
		if(currentPage!=null) {
			backwardStack.push(currentPage);
		}
		currentPage= url;
		forwardStack.clear();
		
	}
	
	public void getForwardStack() {
		currentPage=forwardStack.pop();
	}
	
	public void previousPage() {
		if(!backwardStack.isEmpty()) {
			forwardStack.push(currentPage);
			currentPage=backwardStack.pop();
			System.out.println(getCurrentPage());
		}else {
//			System.out.println("this is the Home Page");
			System.out.println(getCurrentPage() + "  is a Home/First Page");
		}
	}
	
	public void nextPage() {
		if(!forwardStack.isEmpty()) {
			backwardStack.push(currentPage);
			currentPage=forwardStack.pop();
			System.out.println(getCurrentPage());
		}else {
//			System.out.println("this is the Last Page");
			System.out.println(getCurrentPage() + "  is a Last Page");
		}
	}
	
	
	
	

}
