package doublell;

class Node {
	public int value;
	public Node next;
	public Node prev;
}

public class DoubleLL {

	public Node head;
	public Node tail;
	public int size;

	public Node creationDLL(int value) {
		head = new Node();
		Node node = new Node();
		node.prev = null;
		node.next = null;
		node.value = value;

		head = node;
		tail = node;

		size = 1;

		return head;
	}

	public void insertion(int loc, int value) {
		Node node = new Node();

		node.value = value;

		if (loc == 0) {
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;
		} else if (loc >= size) {
			node.prev = tail;
			node.next = null;
			head = node;
			tail.next = node;
			tail = node;

		}
		size++;
	}

	public void insertionAtFirst(int value) {
		Node node = new Node();

		node.value = value;
		node.prev = null;
		node.next = head;
		head.prev = node;
		head = node;

		size++;
	}

	public void insertionAtLast(int value) {
		Node node = new Node();

		node.value = value;

		node.prev = tail;
		node.next = null;
		head = node;
		tail.next = node;
		tail = node;

		size++;
	}

	public void traverse() {

		Node temp = head;

		int index = 0;

		while (index < size) {
			System.out.print(temp.value + " ");
			temp = temp.next;
			index++;

		}
	}

	public void backTraverse() {

		Node temp = tail;

		int index = 0;

		while (index < size) {
			System.out.print(temp.value + " ");
			temp = temp.prev;
			index++;

		}
	}

}
