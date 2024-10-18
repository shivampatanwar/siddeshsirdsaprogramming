package webhistory;

public class MainClass {

	public static void main(String[] args) {

		WebHistory history = new WebHistory();

		history.addPage("https://www.flipkart.com");
		history.getCurrentPage();
		history.addPage("https://www.flipkart.com/mobile");
		history.getCurrentPage();
		history.addPage("https://www.flipkart.com/mobile/apple");
		history.getCurrentPage();
		history.addPage("https://www.flipkart.com/mobile/apple/iphone15");
		history.getCurrentPage();

		history.previousPage();
		history.previousPage();
		history.previousPage();
		history.previousPage();
//		history.previousPage();

		history.nextPage();
		history.nextPage();
		history.nextPage();
		history.nextPage();
//		history.nextPage();
		
		
		history.delete();
		
		

	}

}
