package cutomLinkedList;

public class LinkedList {
	Node head;

	public void add(int data) {
		Node node = new Node(data, null);

		if (head == null)
			head = node;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void print() {
		Node temp = head;
		System.out.println();
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public void deleteLastNode() {

		Node temp = head;
		while (temp.next != null && temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

	}
}
