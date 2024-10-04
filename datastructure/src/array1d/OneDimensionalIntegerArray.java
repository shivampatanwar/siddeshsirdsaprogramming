package array1d;

public class OneDimensionalIntegerArray {

	int[] arr;

	// Creation O(N) -> Linear
	public OneDimensionalIntegerArray(int size) {
		arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// Insertion O(1) -> Constant
	public void insertion(int index, int value) {
		try {
			if (arr[index] != Integer.MIN_VALUE) {
				System.out.println("Block is already filled");
			} else {
				arr[index] = value;
				System.out.println("Value Inserted Successfully");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	
	// Searching O(N) -> Linear
	public void searching(int value) {

		try {
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == value) {
					System.out.println("Value Present in index " + i);
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
			if (arr[index] == Integer.MIN_VALUE) {
				System.out.println("Block is already Empty");
			} else {
				arr[index] = Integer.MIN_VALUE;
				System.out.println("Value deleted Successfully");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
