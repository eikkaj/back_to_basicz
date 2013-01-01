
public class DoublyLinked {
	private static Node head;
	private static Node tail;
	private static int size;

	public DoublyLinked() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void getSize() {
		System.out.println(size);
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void addHead(int n) {
		Node z = new Node();
		z.setNum(n);
		z.setPrev(null);
		if (isEmpty()) {
			head = z;
			tail = z;
		} else {
			z.setNext(head);
			head.setPrev(z);
			head = z;
		}
		size++;
	}
	
	public void getHead() {
		System.out.println(head.getNum());
	}
	
	public void removeHead() {
		if (isEmpty()) {
			return;
		}
		head.getNext().setPrev(null);
		head = head.getNext();
		size--;
	}
	
	public void addTail(int n) {
		if (isEmpty()) addHead(n);
		Node z = new Node();
		tail.setNext(z);
		z.setNum(n);
		z.setPrev(tail);
		z.setNext(null);
		tail = z;
		size++;
	}
	
	public void getTail() {
		System.out.println(tail.getNum());
	}
	
	public void removeTail() {
		if (isEmpty()) return;
		tail.getPrev().setNext(null);
		tail = tail.getPrev();
		size--;
	}
	
	public void printList() {
		Node current = head;
		System.out.println("****Printing Doubly-Linked List****");
		while (current != null) {
			System.out.print("[" + current.getNum() + "]->");
			current = current.getNext();
		}
		System.out.println("NULL");
	}
}
