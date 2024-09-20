package search;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		int searchValue = 50;
		
		binarySearch(arr, searchValue);

	}

	public static void binarySearch(int[] arr, int searchValue) {
		
		int left = 0, right = arr.length-1;
		
		while(left<=right) {
			
			int mid = (left+ right)/2;
			if(arr[mid]==searchValue) {
				System.out.println("Present in index : " + mid);
				return;
			}
			
			if(arr[mid]<searchValue) {
				left = mid+1;
			}else {
				right=mid-1;
			}
			
		}
		
		System.out.println("Value not Present");
		

	}

}
