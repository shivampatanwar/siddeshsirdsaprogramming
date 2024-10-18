package stack;

public class StackProgram {

	int[] stack;
	int topOfStack;

	public StackProgram(int size) {
		stack = new int[size];
		topOfStack = -1;
		System.out.println("Stack created with size: " + size);
	}

	public boolean isFull() {
		return topOfStack == stack.length;
	}

	public boolean isEmpty() {
		return topOfStack == -1;
	}

	public void push(int value) {

		if (isFull()) {
			System.out.println("The Stack is full");
		} else {
			topOfStack++;
			stack[topOfStack] = value;
			System.out.println("value added : " + value);
		}

	}

	public int  pop() {

		if (isEmpty()) {
			System.out.println("The Stack is Empty");
			return -1;
		} else {
			int value = stack[topOfStack];
			topOfStack--;
			System.out.println("value popped " + value);
			return value;
		}
	}
	
	
	public int  peek() {

		if (isEmpty()) {
			System.out.println("The Stack is Empty");
			return -1;
		} else {
			int value = stack[topOfStack];
			System.out.println("value peek " + value);
			return value;
		}
	}
	
	public void delete() {
		stack = null;
		System.out.println("data deleted success");
	}
	
	

}
