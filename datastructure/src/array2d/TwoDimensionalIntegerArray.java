package array2d;

import java.util.InputMismatchException;

public class TwoDimensionalIntegerArray {

	
	int[][] arr;
	
	//creation   O(n^2)
	
	public TwoDimensionalIntegerArray(int row, int col) {
		arr= new int[row][col];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=Integer.MIN_VALUE;
				
			}
			
		}
	}
	
	
	// Insertion   O(1)
	
	public void insertion(int row, int col, int value) {
		
		try {
			
			if(arr[row][col]!=Integer.MIN_VALUE) {
				System.out.println("The location is already alloted/Field");
			}else {
				arr[row][col]=value;
				System.out.println("Value inserted Successfully");
			}
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Row and Column");
		}
		
	}
	
	//Traverse O(n^2)
	
	public void traverse() {
	
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col]!=Integer.MIN_VALUE) {
					System.out.print(arr[row][col] + " ");
				}else {
					System.out.print("NA ");
				}
			}
			System.out.println();
			
			
		}
	}
	
	
	// Search by row column O(1)
	
	public void serachByIndex(int row, int col) {
		
		try {
			System.out.println("the value present in the index " + row + "," + col + " is " + arr[row][col]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Row and Column");
		}
	}
	
	
	
	
	
	// Search by Value  O(n^2)
	public void serachByValue(int serach) {
			
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[row].length; col++) {
					if(arr[row][col]==serach) {
						System.out.println("the value present in the index " + row + "," + col);
						
					}
					
				}
				
			}
		}
		
	
	// Delete by row column O(1)
	public void deleteByIndex(int row, int col) {
		
		try {
			
			System.out.println("the value present in the index " + row + "," + col + " is " + arr[row][col] + " is deleted");
			arr[row][col]=Integer.MIN_VALUE;
			
		} catch (Exception e) {
			System.out.println("Invalid Row and Column");
		}
		
	}
	
	
	// Delete by row O(1)
		public void deleteByValue(int value) {
			
			try {
				
				for (int row = 0; row < arr.length; row++) {
					for (int col = 0; col < arr[row].length; col++) {
						if(arr[row][col]==value) {
							System.out.println("the value present in the index " + row + "," + col + " is deleted");
							arr[row][col]=Integer.MIN_VALUE;
							return;
						}
						
					}
					
				}
				
				
			} catch (InputMismatchException e) {
				System.out.println("Invalid input");
			}
			
		}
	
}
