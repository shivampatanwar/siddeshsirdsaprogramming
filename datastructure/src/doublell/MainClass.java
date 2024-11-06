package doublell;

public class MainClass {

	public static void main(String[] args) {

		DoubleLL dll = new DoubleLL();

		System.out.println(dll.creationDLL(10));

		dll.insertion(1, 20);
		dll.insertion(2, 30);
		dll.insertion(3, 40);

//		dll.insertionAtFirst(20);
//		dll.insertionAtFirst(50);
//		dll.insertionAtFirst(60);

//		dll.insertionAtLast(52);

		dll.traverse();

//		System.out.println();
//
//		dll.backTraverse();

	}

}
