package stack;

public class MainClass {
	
	public static void main(String[] args) {
		
		StackProgram stack = new StackProgram(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		stack.peek();
		
		
		
		stack.delete();
		
		
		
	}

}
