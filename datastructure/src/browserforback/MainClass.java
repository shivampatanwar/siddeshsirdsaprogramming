package browserforback;

public class MainClass {

	public static void main(String[] args) {
		
		WebHistory history = new WebHistory();
		
		System.out.println(history.getCurrentPage());
		history.visitUrl("https://www.facebook.com");
		System.out.println(history.getCurrentPage());
		history.visitUrl("https://www.facebook.com/login");
		System.out.println(history.getCurrentPage());
		history.visitUrl("https://www.facebook.com/home");
		System.out.println(history.getCurrentPage());
		history.visitUrl("https://www.facebook.com/electronics");
		System.out.println(history.getCurrentPage());
		history.visitUrl("https://www.facebook.comelectronics/watch");
		System.out.println(history.getCurrentPage());
		
		
		
		System.out.println("===================Previous Page==========================");
		
		history.previousPage();
		
		history.previousPage();
		
		history.previousPage();
		
		history.previousPage();
		
		history.previousPage();
		
		history.previousPage();
		
		
		
		System.out.println("=====================Next Page========================");
		
		
		history.nextPage();
		
		history.nextPage();
		
		history.nextPage();
		
		history.nextPage();
		
		history.nextPage();
		
		history.nextPage();
		
		
		
		
	}
}
