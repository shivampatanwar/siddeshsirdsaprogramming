package stack;

public class StackPgn {

	int[] arr;
	int topOfStack;

	public StackPgn(int size) {
		arr = new int[size];
		topOfStack = -1;
	}

	public boolean isEmpty() {
		return	topOfStack == -1;
	}
	
	
	public boolean isFull() {
		return	topOfStack == (arr.length-1);
	}
	
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("The Stack is Full");
		}else {
			arr[++topOfStack]=value;
			System.out.println("The value is inserted " + value);
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return -1;
		}else {
			int value = arr[topOfStack--];	
			return value;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
		}else {
			System.out.println("Top of the value is " + arr[topOfStack]);	
			
		}
	}
	
	
	public void delete() {
		arr = null;
		System.out.println("The Stack is deleted");
	}
	
	

}
