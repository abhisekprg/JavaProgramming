package cutomLinkedList;

public class DeclarationCustomLinkedList {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.print();
		list.deleteLastNode();
		list.print();
	}

}