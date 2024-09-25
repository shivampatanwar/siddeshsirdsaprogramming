package stack;

import java.util.Stack;

class MemoryBlock {
	String processName;
	int memorySize; // in kilobytes
	int memoryAddress; // just a simulated memory address

	public MemoryBlock(String processName, int memorySize, int memoryAddress) {
		this.processName = processName;
		this.memorySize = memorySize;
		this.memoryAddress = memoryAddress;
	}

	@Override
	public String toString() {
		return "Process: " + processName + ", Size: " + memorySize + "KB, Address: " + memoryAddress;
	}	
}

public class MemoryManager {

	private Stack<MemoryBlock> memoryStack = new Stack<>();
	private int currentMemoryAddress = 1000; // starting address for simplicity

	// Method to allocate memory for a new process/function push()
	public void allocateMemory(String processName, int memorySize) {

		MemoryBlock block = new MemoryBlock(processName, memorySize, currentMemoryAddress);
		memoryStack.push(block);
		System.out.println("Allocated memory for: " + block.toString());	
		currentMemoryAddress+=memorySize ;
		
	}

	// Method to deallocate memory (simulate a function returning) pop()
	public void deallocateMemory() {
		if(memoryStack.isEmpty()) {
			System.out.println("Stack is Empty we can't Deallocate");
		}else {
			MemoryBlock block =  memoryStack.pop();
			System.out.println("Deallocated memory for: " +block.toString());
		}
	}

	// Display current memory status print data
	public void showMemoryStack() {
		if(memoryStack.isEmpty()) {
			System.out.println("Stack Memory is Empty");
		}else {
			for(MemoryBlock block: memoryStack) {
				System.out.println(block.toString());
			}
		}

	}

	public static void main(String[] args) {
		MemoryManager memoryManager = new MemoryManager();

		// Simulating memory allocation for function calls/processes
		memoryManager.allocateMemory("Function1", 200); // Allocating 200KB
		memoryManager.allocateMemory("Function2", 300); // Allocating 300KB
		memoryManager.allocateMemory("Function3", 150); // Allocating 150KB

		System.out.println("\nMemory Stack after allocations:");
		memoryManager.showMemoryStack();
		
		System.out.println();

		// Simulating function return (deallocation)
		memoryManager.deallocateMemory(); // Deallocating Function3
		memoryManager.deallocateMemory(); // Deallocating Function2

		System.out.println("\nMemory Stack after deallocations:");
		memoryManager.showMemoryStack();
	}

}
