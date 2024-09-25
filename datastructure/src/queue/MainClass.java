package queue;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		QueueProgram program =  new QueueProgram(5);
		
		System.out.println(program.isEmpty());
		System.out.println();
		System.out.println(program.isFull());
		System.out.println();
		
		program.enQueue(10);
		program.enQueue(20);
		program.enQueue(30);
		program.enQueue(40);
		program.enQueue(50);
		
		System.out.println();
		
		program.showQueue();
		
		program.deQueue();
		
		System.out.println();
		
		program.showQueue();
		
		System.out.println();
		
		program.deQueue();
		program.showQueue();
		
		System.out.println();
		
		program.deQueue();
		program.showQueue();
		
		System.out.println();
		
		program.deQueue();
		program.showQueue();
		
		System.out.println();
		
		
		
		
	}

}
