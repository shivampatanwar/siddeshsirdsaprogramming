package singlelinkedlist;

public class SingleLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node creationOfSLL(int nodeValue) {
		
		head = new Node();
		
		Node node = new Node();
		node.value=nodeValue;
		node.next=null;
		
		head=node;
		tail=node;
		
		
		return head;
	}
	

}
