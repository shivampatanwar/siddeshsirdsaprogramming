package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		int size = 5;
		StackPgn s1 = new StackPgn(size);
		
		System.out.println("Stack is Empty " + s1.isEmpty());
		System.out.println("Stack is Full " + s1.isFull());
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		
		System.out.println("The removed value is " + s1.pop());
		System.out.println("The removed value is " + s1.pop());
		System.out.println("The removed value is " + s1.pop());
		
		s1.peek();
		
		s1.delete();
		
		
		System.out.println(Arrays.toString(s1.arr));
		
		
		
	}

}
