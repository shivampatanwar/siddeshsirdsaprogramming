package prime;

public class RangeOfPrime {
	
	public static void main(String[] args) {
		int  no = 15;
		rangeOfPrime(no);
	}
	
	public static void rangeOfPrime(int no) {
		
		boolean[] arr = new boolean[no];
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = true;	
		}
		
		for (int i = 2; i*i < no; i++) {
			for (int j = i*i; j < no; j+=i) {
				arr[j]=false;	
			}
		}
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i]==true) {
				System.out.println("Prime Number is " + i);
			}
			
			
		}
		
	}

}
