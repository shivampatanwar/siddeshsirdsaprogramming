package array1d;

public class MainClass {

	public static void main(String[] args) {

//		OneDimensionalIntegerArray array = new OneDimensionalIntegerArray(5);
//		
//		array.insertion(0, 10);
//		array.insertion(1, 20);
//		array.insertion(2, 30);
//		array.insertion(3, 40);
//		array.insertion(4, 50);
//		
//		System.out.println();
//		
//		array.traversing();
//		
//		System.out.println();
//		
//		array.searching(50);
//		array.searching(30);
//		array.searching(10);
//		array.searching(80);
//		
//		System.out.println();
//		System.out.println();
//		
//		array.delete(1);
//		array.delete(2);
//		array.delete(3);
//		
//		
//		System.out.println();
//		
//		array.traversing();

		OneDimensionalStringArray array = new OneDimensionalStringArray(5);

		array.insertion(0, "Shivam");
		array.insertion(1, "Gauri");
		array.insertion(2, "Vivek");
		array.insertion(3, "Mohan");
		array.insertion(4, "Kiran");

		System.out.println();

		array.traversing();

		System.out.println();
		System.out.println();

		array.searching("Shivam");
		array.searching("Vivek");
		array.searching("Kiran");
		array.searching("Gauri");

		System.out.println();
		System.out.println();

		array.delete(1);
		array.delete(2);
		array.delete(3);

		System.out.println();

		array.traversing();

	}

}
