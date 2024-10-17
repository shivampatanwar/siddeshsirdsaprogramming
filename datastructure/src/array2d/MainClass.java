package array2d;

public class MainClass {
	
	public static void main(String[] args) {
		
		TwoDimensionalIntegerArray array = new TwoDimensionalIntegerArray(3, 3);
		
		System.out.println("*********************************");
		array.insertion(0, 0, 10);
		array.insertion(0, 1, 20);
		array.insertion(0, 2, 30);
		array.insertion(1, 0, 40);
		array.insertion(1, 1, 50);
		array.insertion(1, 2, 60);
		array.insertion(2, 0, 70);
		array.insertion(2, 1, 80);
		array.insertion(2, 2, 90);
	
		
		
		System.out.println("*********************************");
		
		array.traverse();
		
		
		System.out.println("*********************************");
		
		array.serachByIndex(0, 0);
		
		array.serachByValue(50);
		
		
		System.out.println("*********************************");
		
		array.deleteByIndex(0, 0);
		
		
		System.out.println("*********************************");
		
		array.deleteByValue(90);
		
		
		System.out.println("*********************************");
		
		array.traverse();
		
	}

}
