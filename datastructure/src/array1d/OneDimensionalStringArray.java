package array1d;

public class OneDimensionalStringArray {

	String[] arr;

	
	// Creation O(N) -> Linear
	public OneDimensionalStringArray(int size) {
		arr = new String[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = null;
		}
	}

	// Insertion O(1) -> Constant
	public void insertion(int index, String value) {
		try {
			if (arr[index] != null) {
				System.out.println("Block is already filled");
			} else {
				arr[index] = value;
				System.out.println("Value " + value+ " Inserted Successfully");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	
	// Searching O(N) -> Linear
	public void searching(String value) {

		try {
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == value) {
					System.out.println("Value " + value+" Present in index " + i);
					return;
				}

			}
			System.out.println("Value not present");
		}catch (Exception e) {
			System.out.println(e);
		}

	}

	// Traversing O(N) -> Linear
	public void traversing() {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		

	}
	
	// Delete O(1) -> Constant
	public void delete(int index) {

		try {
			if (arr[index] == null) {
				System.out.println("Block is already Empty");
			} else {
				String name = arr[index];
				arr[index] = null;
				System.out.println("Value " + name+ " deleted Successfully");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
