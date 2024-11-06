package singlelinkedlist;

public class MainClass {
	
	public static void main(String[] args) {
		
		SingleLinkedList sll = new SingleLinkedList();
		
		System.out.println(sll.creationOfSLL(15));
		System.out.println(sll.creationOfSLL(15).value);
		System.out.println(sll.creationOfSLL(15).next);
	}

}
